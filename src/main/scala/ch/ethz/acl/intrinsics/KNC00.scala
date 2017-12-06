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

    
trait KNC00 extends IntrinsicsBase {
  /**
   * Counts the number of set bits in double-precision (32-bit) unsigned integer
   * "r1", returning the results in "dst".
   * r1: unsigned __int64
   */
  case class MM_COUNTBITS_64(r1: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
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
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64 and expands them into packed double-precision
   * (64-bit) floating-point values in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quadwords that occur at or after the
   * first 64-byte-aligned address following (mt-64) are loaded. Elements in the
   * resulting vector that do not map to those quadwords are taken from "src".
   * Elements are loaded from memory according to element selector "k" (elements
   * are skipped when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKHI_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the doubleword stream starting at
   * element-aligned address mt-64 and expands them into packed single-precision
   * (32-bit) floating-point elements in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quadwords that occur at or after the
   * first 64-byte-aligned address following (mt-64) are loaded. Elements in the
   * resulting vector that do not map to those quadwords are taken from "src".
   * Elements are loaded from memory according to element selector "k" (elements
   * are skipped when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKHI_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed double-precision (64-bit) floating-point
   * elements of "v1" into a quadword stream according to "conv" at a logically
   * mapped starting address "mt", storing the low-64-byte elements of that stream
   * (those elements of the stream that map before the first 64-byte-aligned
   * address follwing "mt"). "hint" indicates to the processor whether the data is
   * non-temporal. Elements are stored to memory according to element selector "k"
   * (elements are skipped when the corresponding mask bit is not set).
   * mt: void *, k: __mmask8, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTORELO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed double-precision (64-bit) floating-point elements stored
   * in "v" to a smaller type depending on "conv" and stores them in memory
   * location "mt". "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, v: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTSTORE_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt, up-converted depending on the value of
   * "conv", and expanded into packed single-precision (32-bit) floating-point
   * elements in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur before first 64-byte-aligned address
   * following "mt" are loaded. Elements in the resulting vector that do not map to
   * those doublewords are taken from "src". "hint" indicates to the processor
   * whether the loaded data is non-temporal.
   * src: __m512, mt: void const *, conv: _MM_UPCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKLO_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Performs element-by-element subtraction of packed double-precision (64-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, v2: __m512d, v3: __m512d
   */
  case class MM512_MASK_SUBR_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements of "v1" into a
   * doubleword stream at a logically mapped starting address (mt-64), storing the
   * high-64-byte elements of that stream (those elemetns of the stream that map at
   * or after the first 64-byte-aligned address following (m5-64)). Elements are
   * loaded from memory according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * mt: void*, k: __mmask16, v1: __m512, mtOffset: int
   */
  case class MM512_MASK_PACKSTOREHI_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the four groups of packed
   * 4x32-bit integer elements in "v" using swizzle parameter "s", storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, v: __m512i, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_MASK_SWIZZLE_EPI32(src: Exp[__m512i], k: Exp[Int], v: Exp[__m512i], s: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the four groups of packed
   * 4x64-bit integer elements in "v" using swizzle parameter "s", storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, v: __m512i, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_MASK_SWIZZLE_EPI64(src: Exp[__m512i], k: Exp[Int], v: Exp[__m512i], s: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 16 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to single-precision
   * (32-bit) floating-point elements, storing the results in "dst". "hint"
   * indicates to the processor whether the data is non-temporal.
   * mt: void const *, conv: _MM_UPCONV_PS_ENUM, bc: _MM_BROADCAST32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOAD_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
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
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v2" from "v3", storing the results in "dst" and "v2". The borrowed value from
   * the subtraction difference for the nth element is written to the nth bit of
   * "borrow" (borrow flag). Results are written using writemask "k" (elements are
   * copied from "k" to "k_old" when the corresponding mask bit is not set).
   * v2: __m512i, k: __mmask16, k_old: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_MASK_SUBRSETB_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64, up-converted depending on the value
   * of "conv", and expanded into packed 32-bit integers in "dst". The initial
   * values of "dst" are copied from "src". Only those converted doublewords that
   * occur at or after the first 64-byte-aligned address following (mt-64) are
   * loaded. Elements in the resulting vector that do not map to those doublewords
   * are taken from "src". "hint" indicates to the processor whether the loaded
   * data is non-temporal. Elements are copied to "dst" according to element
   * selector "k" (elements are skipped when the corresponding mask bit is not
   * set).
   * src: __m512i, k: __mmask16, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKHI_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 32-bit integer elements of "v1" into a doubleword stream at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt"). Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * mt: void*, k: __mmask16, v1: __m512i, mtOffset: int
   */
  case class MM512_MASK_PACKSTORELO_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v2" from "v3" storing the results in "dst".
   * v2: __m512i, v3: __m512i
   */
  case class MM512_SUBR_EPI32(v2: Exp[__m512i], v3: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element three-input subtraction of packed 32-bit integer
   * elements of "v3" as well as the corresponding bit from "k2" from "v2". The
   * borrowed value from the subtraction difference for the nth element is written
   * to the nth bit of "borrow" (borrow flag). Results are stored in "dst" using
   * writemask "k1" (elements are copied from "v2" when the corresponding mask bit
   * is not set).
   * v2: __m512i, k1: __mmask16, k2: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_MASK_SBB_EPI32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed 32-bit unsigned integer
   * elements in "v2" to packed single-precision (32-bit) floating-point elements
   * and performing an optional exponent adjust using "expadj", storing the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, v2: __m512i, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Stores packed 64-bit integer elements of "v1" into a quadword stream at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * mt: void*, k: __mmask8, v1: __m512i, mtOffset: int
   */
  case class MM512_MASK_PACKSTOREHI_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * Performs an element-by-element addition of packed 32-bit integer elements in
   * "v2" and "v3", storing the results in "dst" and the sign of the sum in "sign"
   * (sign flag).
   * v2: __m512i, v3: __m512i, sign: __mmask16 *, signOffset: int
   */
  case class MM512_ADDSETS_EPI32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], sign: Exp[A[Int]], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Performs element-by-element subtraction of packed double-precision (64-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, v2: __m512d, v3: __m512d, rounding: int
   */
  case class MM512_MASK_SUBR_ROUND_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Performs element-by-element conversion of packed single-precision (32-bit)
   * floating-point elements in "v2" to packed 32-bit integer elements and performs
   * an optional exponent adjust using "expadj", storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32(v2: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores word-sized (16-bit) "data" to address "ptr" in big-endian format.
   * ptr: void *, data: short, ptrOffset: int
   */
  case class STOREBE_I16[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Short], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Inserts the low byte of mask "k2" into the high byte of "dst", and copies the
   * low byte of "k1" to the low byte of "dst".
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KMOVLHB(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements from "v" to
   * memory address "mt" with a no-read hint to the processor.
   * mt: void *, v: __m512d, mtOffset: int
   */
  case class MM512_STORENR_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads a big-endian word (16-bit) value from address "ptr" and stores the
   * result in "dst".
   * ptr: void const *, ptrOffset: int
   */
  case class LOADBE_I16[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Short] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fixes up NaN's from packed single-precision (32-bit) floating-point elements
   * in "v1" and "v2", storing the results in "dst" using writemask "k" (only
   * elements whose corresponding mask bit is set are used in the computation).
   * Quietized NaN's from "v1" are stored in "v3".
   * v1: __m512, k: __mmask16, v2: __m512, v3: __m512i
   */
  case class MM512_MASK_FIXUPNAN_PS(v1: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Down-converts and stores packed single-precision (32-bit) floating-point
   * elements of "v1" into a byte/word/doubleword stream according to "conv" at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void *, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTOREHI_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements from "v" to
   * memory address "mt" with a no-read hint to the processor.
   * mt: void *, v: __m512, mtOffset: int
   */
  case class MM512_STORENR_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed double-precision (64-bit) floating-point
   * elements of "v1" into a quadword stream according to "conv" at a logically
   * mapped starting address (mt-64), storing the high-64-byte elements of that
   * stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void *, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTOREHI_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt and expands them into packed double-precision
   * (64-bit) floating-point elements in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quad that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those quadwords are taken from "src".
   * src: __m512d, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKLO_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
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
   * Multiply packed 32-bit integer elements in "a" and "b", add the intermediate
   * result to packed elements in "c" and store the results in "dst".
   * a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_FMADD_EPI32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Multiply packed 32-bit integer elements in each 4-element set of "a" and by
   * element 1 of the corresponding 4-element set from "b", add the intermediate
   * result to element 0 of the corresponding 4-element set from "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_FMADD233_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64 and expands them into packed double-precision
   * (64-bit) floating-point values in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quadwords that occur at or after the
   * first 64-byte-aligned address following (mt-64) are loaded. Elements in the
   * resulting vector that do not map to those quadwords are taken from "src".
   * src: __m512d, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKHI_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
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
   * Multiply packed 32-bit integer elements in "a" and "b", add the intermediate
   * result to packed elements in "c" and store the results in "dst" using
   * writemask "k" (elements are copied from "c" when the corresponding mask bit is
   * not set).
   * a: __m512i, b: __m512i, c: __m512i, k: __mmask16
   */
  case class MM512_MASK3_FMADD_EPI32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Stores packed 32-bit integer elements of "v1" into a doubleword stream at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elements of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)).
   * mt: void*, v1: __m512i, mtOffset: int
   */
  case class MM512_PACKSTOREHI_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 32-bit integer elements of "v1" into a doubleword stream at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elements of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * mt: void*, k: __mmask16, v1: __m512i, mtOffset: int
   */
  case class MM512_MASK_PACKSTOREHI_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements of "v1" into a
   * quadword stream at a logically mapped starting address (mt-64), storing the
   * high-64-byte elements of that stream (those elemetns of the stream that map at
   * or after the first 64-byte-aligned address following (m5-64)).
   * mt: void*, v1: __m512d, mtOffset: int
   */
  case class MM512_PACKSTOREHI_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * Performs element-by-element addition of packed 32-bit integer elements in "v2"
   * and "v3", storing the resultant carry in "k2_res" (carry flag) and the
   * addition results in "dst" using writemask "k" (elements are copied from "v2"
   * and "k_old" when the corresponding mask bit is not set).
   * v2: __m512i, k: __mmask16, k_old: __mmask16, v3: __m512i, k2_res: __mmask16 *, k2_resOffset: int
   */
  case class MM512_MASK_ADDSETC_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64 and expands them into packed 64-bit integers in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quadwords that occur at or after the first 64-byte-aligned address following
   * (mt-64) are loaded. Elements in the resulting vector that do not map to those
   * quadwords are taken from "src".
   * src: __m512i, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKHI_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 32-bit integer elements in "a" and "b", add the intermediate
   * result to packed elements in "c" and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set).
   * a: __m512i, k: __mmask16, b: __m512i, c: __m512i
   */
  case class MM512_MASK_FMADD_EPI32(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Performs element-by-element addition between packed double-precision (64-bit)
   * floating-point elements in "v2" and "v3" and negates their sum, storing the
   * results in "dst".
   * v2: __m512d, v3: __m512d
   */
  case class MM512_ADDN_PD(v2: Exp[__m512d], v3: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 32-bit integer elements of "v1" into a doubleword stream at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt").
   * mt: void*, v1: __m512i, mtOffset: int
   */
  case class MM512_PACKSTORELO_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed double-precision (64-bit)
   * floating-point elements in "v2" from "v3" storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512d, v3: __m512d, rounding: int
   */
  case class MM512_SUBR_ROUND_PD(v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Down-converts and stores packed 64-bit integer elements of "v1" into a
   * quadword stream according to "conv" at a logically mapped starting address
   * (mt-64), storing the high-64-byte elements of that stream (those elemetns of
   * the stream that map at or after the first 64-byte-aligned address following
   * (mt-64)). "hint" indicates to the processor whether the data is non-temporal.
   * Elements are stored to memory according to element selector "k" (elements are
   * skipped when the corresonding mask bit is not set).
   * mt: void *, k: __mmask8, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTOREHI_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of set bits in 32-bit unsigned integer "r1", returning the
   * results in "dst".
   * r1: unsigned int
   */
  case class MM_COUNTBITS_32(r1: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
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
   * Down-converts and stores packed 64-bit integer elements of "v1" into a
   * quadword stream according to "conv" at a logically mapped starting address
   * (mt-64), storing the high-64-byte elements of that stream (those elemetns of
   * the stream that map at or after the first 64-byte-aligned address following
   * (m5-64)). "hint" indicates to the processor whether the data is non-temporal.
   * mt: void *, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTOREHI_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * loaded data is non-temporal. Elements are copied to "dst" according to element
   * selector "k" (elements are skipped when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, mt: void const *, conv: _MM_UPCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKHI_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed double-precision (64-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst".
   * v2: __m512d, v3: __m512d
   */
  case class MM512_SUBR_PD(v2: Exp[__m512d], v3: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the doubleword stream starting at
   * element-aligned address mt and expanded into packed single-precision (32-bit)
   * floating-point elements in "dst". The initial values of "dst" are copied from
   * "src". Only those converted doublewords that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those doublewords are taken from "src". Elements are
   * loaded from memory according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKLO_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 8 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to 64-bit integer
   * elements, storing the results in "dst". "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, bc: _MM_BROADCAST64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOAD_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 8 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to double-precision
   * (64-bit) floating-point elements, storing the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). "hint" indicates to the processor whether the data is non-temporal.
   * src: __m512d, k: __mmask8, mt: void const *, conv: _MM_UPCONV_PD_ENUM, bc: _MM_BROADCAST64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOAD_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
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
   * Performs element-by-element conversion of packed 32-bit unsigned integer
   * elements in "v2" to packed single-precision (32-bit) floating-point elements
   * and performing an optional exponent adjust using "expadj", storing the results
   * in "dst".
   * 	[round_note]
   * v2: __m512i, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS(v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed double-precision (64-bit) floating-point elements stored
   * in "v" to a smaller type depending on "conv" and stores them in memory
   * location "mt" (elements in "mt" are unaltered when the corresponding mask bit
   * is not set). "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, k: __mmask8, v: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTSTORE_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements of "v1" into a
   * quadword stream at a logically mapped starting address "mt", storing the
   * low-64-byte elements of that stream (those elements of the stream that map
   * before the first 64-byte-aligned address follwing "mt").
   * mt: void*, v1: __m512d, mtOffset: int
   */
  case class MM512_PACKSTORELO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * Down-converts and stores packed double-precision (64-bit) floating-point
   * elements of "v1" into a quadword stream according to "conv" at a logically
   * mapped starting address "mt", storing the low-64-byte elements of that stream
   * (those elements of the stream that map before the first 64-byte-aligned
   * address follwing "mt"). "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTORELO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * src: __m512i, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKHI_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the four groups of packed
   * 4xsingle-precision (32-bit) floating-point elements in "v" using swizzle
   * parameter "s", storing the results in "dst".
   * v: __m512, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_SWIZZLE_PS(v: Exp[__m512], s: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores double word-sized (32-bit) "data" to address "ptr" in big-endian
   * format.
   * ptr: void *, data: int, ptrOffset: int
   */
  case class STOREBE_I32[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Int], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition of packed 32-bit integers in "v2" and
   * "v3" and the corresponding bit in "k2", storing the result of the addition in
   * "dst" and the result of the carry in "k2_res" using writemask "k1" (elements
   * are copied from "v2" when the corresponding mask bit is not set).
   * v2: __m512i, k1: __mmask16, k2: __mmask16, v3: __m512i, k2_res: __mmask16 *, k2_resOffset: int
   */
  case class MM512_MASK_ADC_EPI32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Compute the base-2 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a" with absolute error of 2^(-23) and store the
   * results in "dst".
   * a: __m512
   */
  case class MM512_LOG2AE23_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Performs element-by-element addition of packed 32-bit integer elements in "v2"
   * and "v3", storing the resultant carry in "k2_res" (carry flag) and the
   * addition results in "dst".
   * v2: __m512i, v3: __m512i, k2_res: __mmask16 *, k2_resOffset: int
   */
  case class MM512_ADDSETC_EPI32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v3" from "v2", storing the results in "dst" and the nth borrow bit in the nth
   * position of "borrow" (borrow flag).
   * v2: __m512i, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_SUBSETB_EPI32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the two groups of packed 4x
   * double-precision (64-bit) floating-point elements in "v" using swizzle
   * parameter "s", storing the results in "dst".
   * v: __m512d, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_SWIZZLE_PD(v: Exp[__m512d], s: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt and expands them into packed 32-bit
   * integers in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur before first 64-byte-aligned address
   * following "mt" are loaded. Elements in the resulting vector that do not map to
   * those doublewords are taken from "src". Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKLO_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition between packed double-precision (64-bit)
   * floating-point elements in "v2" and "v3" and negates their sum, storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, v2: __m512d, v3: __m512d
   */
  case class MM512_MASK_ADDN_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
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
   * Down-converts and stores packed double-precision (64-bit) floating-point
   * elements of "v1" into a quadword stream according to "conv" at a logically
   * mapped starting address (mt-64), storing the high-64-byte elements of that
   * stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). "hint" indicates to the processor
   * whether the data is non-temporal. Elements are stored to memory according to
   * element selector "k" (elements are skipped when the corresponding mask bit is
   * not set).
   * mt: void *, k: __mmask8, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTOREHI_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element by element addition between packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3" and negates the sum, storing the
   * result in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512, rounding: int
   */
  case class MM512_MASK_ADDN_ROUND_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fixes up NaN's from packed double-precision (64-bit) floating-point elements
   * in "v1" and "v2", storing the results in "dst" using writemask "k" (only
   * elements whose corresponding mask bit is set are used in the computation).
   * Quietized NaN's from "v1" are stored in "v3".
   * v1: __m512d, k: __mmask8, v2: __m512d, v3: __m512i
   */
  case class MM512_MASK_FIXUPNAN_PD(v1: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64 and expands them into packed 32-bit
   * integers in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur at or after the first 64-byte-aligned
   * address following (mt-64) are loaded. Elements in the resulting vector that do
   * not map to those doublewords are taken from "src".
   * src: __m512i, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKHI_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the doubleword stream starting at
   * element-aligned address mt and expanded into packed single-precision (32-bit)
   * floating-point elements in "dst". The initial values of "dst" are copied from
   * "src". Only those converted doublewords that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those doublewords are taken from "src".
   * src: __m512, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKLO_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed single-precision (32-bit) floating-point elements stored
   * in "v" to a smaller type depending on "conv" and stores them in memory
   * location "mt". "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, v: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTSTORE_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed 64-bit integer elements stored in "v" to a smaller type
   * depending on "conv" and stores them in memory location "mt". "hint" indicates
   * to the processor whether the data is non-temporal.
   * mt: void *, v: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTSTORE_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt, up-converted depending on the value of "conv", and
   * expanded into packed 64-bit integers in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quadwords that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those quadwords are taken from "src". "hint"
   * indicates to the processor whether the loaded data is non-temporal. Elements
   * are copied to "dst" according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKLO_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Multiply packed 32-bit integer elements in each 4-element set of "a" and by
   * element 1 of the corresponding 4-element set from "b", add the intermediate
   * result to element 0 of the corresponding 4-element set from "b", and store the
   * results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_FMADD233_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Performs element by element addition between packed double-precision (64-bit)
   * floating-point elements in "v2" and "v3" and negates the sum, storing the
   * result in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, v2: __m512d, v3: __m512d, rounding: int
   */
  case class MM512_MASK_ADDN_ROUND_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 32-bit integer elements of "v1" into a
   * byte/word/doubleword stream according to "conv" at a logically mapped starting
   * address "mt", storing the low-64-byte elements of that stream (those elements
   * of the stream that map before the first 64-byte-aligned address follwing
   * "mt"). "hint" indicates to the processor whether the data is non-temporal.
   * mt: void *, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTORELO_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v2" from "v3" storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set)
   * src: __m512i, k: __mmask16, v2: __m512i, v3: __m512i
   */
  case class MM512_MASK_SUBR_EPI32(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512i], v3: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Stores packed double-precision (64-bit) floating-point elements of "v1" into a
   * quadword stream at a logically mapped starting address (mt-64), storing the
   * high-64-byte elements of that stream (those elemetns of the stream that map at
   * or after the first 64-byte-aligned address following (m5-64)). Elements are
   * loaded from memory according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * mt: void*, k: __mmask8, v1: __m512d, mtOffset: int
   */
  case class MM512_MASK_PACKSTOREHI_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed 32-bit integer elements stored in "v" to a smaller type
   * depending on "conv" and stores them in memory location "mt" (elements in "mt"
   * are unaltered when the corresponding mask bit is not set). "hint" indicates to
   * the processor whether the data is non-temporal.
   * mt: void *, k: __mmask16, v: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTSTORE_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Performs element-by-element addition between packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3" and negates their sum, storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512
   */
  case class MM512_MASK_ADDN_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512]) extends IntrinsicsDef[__m512] {
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
   * Downconverts packed single-precision (32-bit) floating-point elements stored
   * in "v" to a smaller type depending on "conv" and stores them in memory
   * location "mt" using writemask "k" (elements are not written to memory when the
   * corresponding mask bit is not set). "hint" indicates to the processor whether
   * the data is non-temporal.
   * mt: void *, k: __mmask16, v: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTSTORE_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * Stores packed 64-bit integer elements of "v1" into a quadword stream at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt"). Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * mt: void*, k: __mmask8, v1: __m512i, mtOffset: int
   */
  case class MM512_MASK_PACKSTORELO_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Depending on "bc", loads 1, 4, or 8 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to 64-bit integer
   * elements, storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set). "hint"
   * indicates to the processor whether the data is non-temporal.
   * src: __m512i, k: __mmask8, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, bc: _MM_BROADCAST64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOAD_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in each
   * 4-element set of "a" and by element 1 of the corresponding 4-element set from
   * "b", add the intermediate result to element 0 of the corresponding 4-element
   * set from "b", and store the results in "dst".
   * 	[round_note]
   * a: __m512, b: __m512, rounding: int
   */
  case class MM512_FMADD233_ROUND_PS(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed 64-bit integer elements located in "v1" and stores them in
   * memory locations starting at location "mv" at packed 32-bit integer indices
   * stored in "index" scaled by "scale" using writemask "k" (elements whose
   * corresponding mask bit is not set are not written to memory).
   * mv: void*, k: __mmask8, index: __m512i, v1: __m512i, scale: int, mvOffset: int
   */
  case class MM512_MASK_I32LOSCATTER_EPI64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed 32-bit integer elements stored in "v" to a smaller type
   * depending on "conv" and stores them in memory location "mt". "hint" indicates
   * to the processor whether the data is non-temporal.
   * mt: void *, v: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTSTORE_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed single-precision (32-bit)
   * floating-point elements in "v2" to packed 32-bit unsigned integer elements and
   * performing an optional exponent adjust using "expadj", storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32(v2: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt and expands them into packed double-precision
   * (64-bit) floating-point values in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quad that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those quadwords are taken from "src". Elements are
   * loaded from memory according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKLO_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Depending on "bc", loads 1, 4, or 16 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to 32-bit integer
   * elements, storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set). "hint"
   * indicates to the processor whether the data is non-temporal.
   * src: __m512i, k: __mmask16, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, bc: _MM_BROADCAST32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOAD_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed double-precision (64-bit)
   * floating-point elements in "v2" to packed single-precision (32-bit)
   * floating-point elements, storing the results in "dst". Results are written to
   * the lower half of "dst", and the upper half locations are set to
   * '0'.
   * 	[round_note]
   * v2: __m512d, rounding: int
   */
  case class MM512_CVT_ROUNDPD_PSLO(v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a" with absolute error of 2^(-23) and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_LOG2AE23_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Performs element-by-element subtraction of packed single-precision (32-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512
   */
  case class MM512_MASK_SUBR_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 32-bit integer elements of "v1" into a
   * byte/word/doubleword stream according to "conv" at a logically mapped starting
   * address (mt-64), storing the high-64-byte elements of that stream (those
   * elemetns of the stream that map at or after the first 64-byte-aligned address
   * following (m5-64)). "hint" indicates to the processor whether the data is
   * non-temporal. Elements are stored to memory according to element selector "k"
   * (elements are skipped when the corresonding mask bit is not set).
   * mt: void *, k: __mmask16, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTOREHI_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * processor whether the loaded data is non-temporal. Elements are copied to
   * "dst" according to element selector "k" (elements are skipped when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, mt: void const *, conv: _MM_UPCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKHI_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements from "v" to
   * memory address "mt" with a no-read hint and using a weakly-ordered memory
   * consistency model (stores performed with this function are not globally
   * ordered, and subsequent stores from the same thread can be observed before
   * them).
   * mt: void *, v: __m512d, mtOffset: int
   */
  case class MM512_STORENRNGO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element three-input subtraction of packed 32-bit integer
   * elements of "v3" as well as the corresponding bit from "k" from "v2". The
   * borrowed value from the subtraction difference for the nth element is written
   * to the nth bit of "borrow" (borrow flag). Results are stored in "dst".
   * v2: __m512i, k: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_SBB_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element addition of packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3", storing the results in "dst" and the
   * sign of the sum in "sign" (sign flag).
   * v2: __m512, v3: __m512, sign: __mmask16 *, signOffset: int
   */
  case class MM512_ADDSETS_PS[A[_], U:Integral](v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements from "v" to
   * memory address "mt" with a no-read hint and using a weakly-ordered memory
   * consistency model (stores performed with this function are not globally
   * ordered, and subsequent stores from the same thread can be observed before
   * them).
   * mt: void *, v: __m512, mtOffset: int
   */
  case class MM512_STORENRNGO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64 and expands them into packed
   * single-precision (32-bit) floating-point elements in "dst". The initial values
   * of "dst" are copied from "src". Only those converted quadwords that occur at
   * or after the first 64-byte-aligned address following (mt-64) are loaded.
   * Elements in the resulting vector that do not map to those quadwords are taken
   * from "src".
   * src: __m512, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKHI_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed single-precision (32-bit) floating-point
   * elements of "v1" into a byte/word/doubleword stream according to "conv" at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt"). "hint" indicates to the processor
   * whether the data is non-temporal. Elements are stored to memory according to
   * element selector "k" (elements are skipped when the corresponding mask bit is
   * not set).
   * mt: void *, k: __mmask16, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTORELO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed 32-bit integer elements in
   * "v2" to packed single-precision (32-bit) floating-point elements and
   * performing an optional exponent adjust using "expadj", storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512i, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS(v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed 64-bit integer elements located in "v1" and stores them in
   * memory locations starting at location "mv" at packed 32-bit integer indices
   * stored in "index" scaled by "scale".
   * mv: void*, index: __m512i, v1: __m512i, scale: int, mvOffset: int
   */
  case class MM512_I32LOSCATTER_EPI64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 64-bit integer elements of "v1" into a quadword stream at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt").
   * mt: void*, v1: __m512i, mtOffset: int
   */
  case class MM512_PACKSTORELO_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed single-precision (32-bit) floating-point
   * elements of "v1" into a byte/word/doubleword stream according to "conv" at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt"). "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void *, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTORELO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element conversion of elements in packed
   * double-precision (64-bit) floating-point vector "v2" to 32-bit integer
   * elements, storing them in the lower half of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * The elements in the upper half of "dst" are set to 0.
   * 	[round_note]
   * src: __m512i, k: __mmask8, v2: __m512d, rounding: int
   */
  case class MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64 and expands them into packed 64-bit integers in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quadwords that occur at or after the first 64-byte-aligned address following
   * (mt-64) are loaded. Elements in the resulting vector that do not map to those
   * quadwords are taken from "src". Elements are loaded from memory according to
   * element selector "k" (elements are skipped when the corresponding mask bit is
   * not set).
   * src: __m512i, k: __mmask8, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKHI_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements of "v1" into a
   * quadword stream at a logically mapped starting address "mt", storing the
   * low-64-byte elements of that stream (those elements of the stream that map
   * before the first 64-byte-aligned address follwing "mt"). Elements are loaded
   * from memory according to element selector "k" (elements are skipped when the
   * corresponding mask bit is not set).
   * mt: void*, k: __mmask8, v1: __m512d, mtOffset: int
   */
  case class MM512_MASK_PACKSTORELO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element three-input subtraction of packed 32-bit integer
   * elements of "v2" as well as the corresponding bit from "k2" from "v3". The
   * borrowed value from the subtraction difference for the nth element is written
   * to the nth bit of "borrow" (borrow flag). Results are stored in "dst" using
   * writemask "k1" (elements are copied from "v2" when the corresponding mask bit
   * is not set).
   * v2: __m512i, k1: __mmask16, k2: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_MASK_SBBR_EPI32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * data is non-temporal.
   * src: __m512d, mt: void const *, conv: _MM_UPCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKLO_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt and expands them into packed 64-bit integers in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quad that occur before first 64-byte-aligned address following "mt" are
   * loaded. Elements in the resulting vector that do not map to those quadwords
   * are taken from "src".
   * src: __m512i, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKLO_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt and expanded into packed 32-bit
   * integers in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur before first 64-byte-aligned address
   * following "mt" are loaded. Elements in the resulting vector that do not map to
   * those doublewords are taken from "src".
   * src: __m512i, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKLO_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed single-precision (32-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst".
   * v2: __m512, v3: __m512
   */
  case class MM512_SUBR_PS(v2: Exp[__m512], v3: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Stores packed single-precision (32-bit) floating-point elements of "v1" into a
   * doubleword stream at a logically mapped starting address (mt-64), storing the
   * high-64-byte elements of that stream (those elemetns of the stream that map at
   * or after the first 64-byte-aligned address following (m5-64)).
   * mt: void*, v1: __m512, mtOffset: int
   */
  case class MM512_PACKSTOREHI_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * Depending on "bc", loads 1, 4, or 8 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to double-precision
   * (64-bit) floating-point elements, storing the results in "dst". "hint"
   * indicates to the processor whether the data is non-temporal.
   * mt: void const *, conv: _MM_UPCONV_PD_ENUM, bc: _MM_BROADCAST64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOAD_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
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
   * Performs an element-by-element addition of packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3", storing the results in "dst" and the
   * sign of the sum in "sign" (sign flag). Results are stored using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512, sign: __mmask16 *, signOffset: int
   */
  case class MM512_MASK_ADDSETS_PS[A[_], U:Integral](src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element conversion of elements in packed
   * double-precision (64-bit) floating-point vector "v2" to 32-bit integer
   * elements, storing them in the lower half of "dst". The elements in the upper
   * half of "dst" are set to 0.
   * 	[round_note]
   * v2: __m512d, rounding: int
   */
  case class MM512_CVTFXPNT_ROUNDPD_EPI32LO(v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt, up-converted depending on the value of
   * "conv", and expanded into packed single-precision (32-bit) floating-point
   * elements in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur before first 64-byte-aligned address
   * following "mt" are loaded. Elements in the resulting vector that do not map to
   * those doublewords are taken from "src". "hint" indicates to the processor
   * whether the loaded data is non-temporal. Elements are copied to "dst"
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * src: __m512, k: __mmask16, mt: void const *, conv: _MM_UPCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKLO_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads a big-endian quad word (64-bit) value from address "ptr" and stores the
   * result in "dst".
   * ptr: void const *, ptrOffset: int
   */
  case class LOADBE_I64[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Long] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List()
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
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64, up-converted depending on the value
   * of "conv", and expanded into packed 32-bit integers in "dst". The initial
   * values of "dst" are copied from "src". Only those converted doublewords that
   * occur at or after the first 64-byte-aligned address following (mt-64) are
   * loaded. Elements in the resulting vector that do not map to those doublewords
   * are taken from "src". "hint" indicates to the processor whether the loaded
   * data is non-temporal.
   * src: __m512i, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKHI_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Loads a big-endian double word (32-bit) value from address "ptr" and stores
   * the result in "dst".
   * ptr: void const *, ptrOffset: int
   */
  case class LOADBE_I32[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Int] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_countbits_64(r1: Exp[ULong]): Exp[ULong] = {
    MM_COUNTBITS_64(r1)
  }
            
  def _mm512_i64extgather_epi64[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_I64EXTGATHER_EPI64(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpackhi_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKHI_PD(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpackhi_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKHI_PS(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorelo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTORELO_PD(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extstore_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTSTORE_PD(mt, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpacklo_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_EXTLOADUNPACKLO_PS(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_fmadd233_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_FMADD233_PS(a, b)
  }
            
  def _mm512_i64extscatter_pd[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512d], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64EXTSCATTER_PD(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_subr_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SUBR_PD(src, k, v2, v3)
  }
            
  def _mm512_mask_packstorehi_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTOREHI_PS(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_swizzle_epi32(src: Exp[__m512i], k: Exp[Int], v: Exp[__m512i], s: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SWIZZLE_EPI32(src, k, v, s)
  }
            
  def _mm512_mask_swizzle_epi64(src: Exp[__m512i], k: Exp[Int], v: Exp[__m512i], s: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SWIZZLE_EPI64(src, k, v, s)
  }
            
  def _mm512_extload_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_EXTLOAD_PS(mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_permute4f128_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_PERMUTE4F128_PS(src, k, a, imm8)
  }
            
  def _mm512_mask_i64extgather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_MASK_I64EXTGATHER_EPI64(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_subrsetb_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_MASK_SUBRSETB_EPI32(v2, k, k_old, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpackhi_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKHI_EPI32(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorelo_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTORELO_EPI32(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_subr_epi32(v2: Exp[__m512i], v3: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUBR_EPI32(v2, v3)
  }
            
  def _mm512_mask_sbb_epi32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_MASK_SBB_EPI32(v2, k1, k2, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvtfxpnt_round_adjustepu32_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS(src, k, v2, rounding, expadj)
  }
            
  def _mm_clevict[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], level: Exp[Int], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(ptr)(MM_CLEVICT(ptr, level, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_kextract_64(a: Exp[Long], b: Exp[Int]): Exp[Int] = {
    MM512_KEXTRACT_64(a, b)
  }
            
  def _mm512_mask_packstorehi_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTOREHI_EPI64(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_mulhi_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHI_EPU32(src, k, a, b)
  }
            
  def _mm512_addsets_epi32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], sign: Exp[A[Int]], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(sign)(MM512_ADDSETS_EPI32(v2, v3, sign, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_log2_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_LOG2_PS(src, k, a)
  }
            
  def _mm512_mask_subr_round_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SUBR_ROUND_PD(src, k, v2, v3, rounding)
  }
            
  def _mm512_i64extgather_pd[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mv)(MM512_I64EXTGATHER_PD(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvtfxpnt_round_adjustps_epi32(v2: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512i] = {
    MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32(v2, rounding, expadj)
  }
            
  def _storebe_i16[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Short], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(ptr)(STOREBE_I16(ptr, data, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_kmovlhb(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KMOVLHB(k1, k2)
  }
            
  def _mm512_storenr_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_STORENR_PD(mt, v, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _loadbe_i16[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Short] = {
    cont.read(ptr)(LOADBE_I16(ptr, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_fixupnan_ps(v1: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_FIXUPNAN_PS(v1, k, v2, v3)
  }
            
  def _mm_tzcnti_32(a: Exp[Int], x: Exp[UInt]): Exp[Int] = {
    MM_TZCNTI_32(a, x)
  }
            
  def _mm512_extpackstorehi_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTOREHI_PS(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_storenr_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_STORENR_PS(mt, v, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorehi_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTOREHI_PD(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpacklo_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_LOADUNPACKLO_PD(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extscatter_pd[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512d], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64EXTSCATTER_PD(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_fmadd_epi32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_FMADD_EPI32(a, b, c)
  }
            
  def _mm512_permute4f128_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_PERMUTE4F128_PS(a, imm8)
  }
            
  def _mm512_mask_i64extgather_epi32lo[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_MASK_I64EXTGATHER_EPI32LO(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_fmadd233_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_FMADD233_EPI32(src, k, a, b)
  }
            
  def _mm512_gmax_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_GMAX_PS(a, b)
  }
            
  def _mm512_loadunpackhi_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_LOADUNPACKHI_PD(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extscatter_pslo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64EXTSCATTER_PSLO(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask3_fmadd_epi32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], k: Exp[Int]): Exp[__m512i] = {
    MM512_MASK3_FMADD_EPI32(a, b, c, k)
  }
            
  def _mm512_mask_gmin_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_GMIN_PS(src, k, a, b)
  }
            
  def _mm512_packstorehi_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTOREHI_EPI32(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorehi_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTOREHI_EPI32(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorehi_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTOREHI_PD(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mulhi_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULHI_EPI32(a, b)
  }
            
  def _mm512_mask_addsetc_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(k2_res)(MM512_MASK_ADDSETC_EPI32(v2, k, k_old, v3, k2_res, k2_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpackhi_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_LOADUNPACKHI_EPI64(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_fmadd_epi32(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_FMADD_EPI32(a, k, b, c)
  }
            
  def _mm512_mask_reduce_gmin_ps(k: Exp[Int], a: Exp[__m512]): Exp[Float] = {
    MM512_MASK_REDUCE_GMIN_PS(k, a)
  }
            
  def _mm512_addn_pd(v2: Exp[__m512d], v3: Exp[__m512d]): Exp[__m512d] = {
    MM512_ADDN_PD(v2, v3)
  }
            
  def _mm512_packstorelo_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTORELO_EPI32(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_subr_round_pd(v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_SUBR_ROUND_PD(v2, v3, rounding)
  }
            
  def _mm512_mask_rcp23_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RCP23_PS(src, k, a)
  }
            
  def _mm512_mask_extpackstorehi_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTOREHI_EPI64(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_countbits_32(r1: Exp[UInt]): Exp[UInt] = {
    MM_COUNTBITS_32(r1)
  }
            
  def _mm512_kconcatlo_64(k1: Exp[Int], k2: Exp[Int]): Exp[Long] = {
    MM512_KCONCATLO_64(k1, k2)
  }
            
  def _mm512_extpackstorehi_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTOREHI_EPI64(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpackhi_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKHI_PD(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_subr_pd(v2: Exp[__m512d], v3: Exp[__m512d]): Exp[__m512d] = {
    MM512_SUBR_PD(v2, v3)
  }
            
  def _mm512_mask_loadunpacklo_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKLO_PS(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extload_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOAD_EPI64(mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extload_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_EXTLOAD_PD(src, k, mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_gmin_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_GMIN_PD(a, b)
  }
            
  def _mm512_cvtfxpnt_round_adjustepu32_ps(v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS(v2, rounding, expadj)
  }
            
  def _mm512_mask_extstore_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTSTORE_PD(mt, k, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorelo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTORELO_PD(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_gmin_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_GMIN_PD(src, k, a, b)
  }
            
  def _mm512_i64extscatter_epi64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64EXTSCATTER_EPI64(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorelo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTORELO_PD(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpackhi_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOADUNPACKHI_EPI64(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_swizzle_ps(v: Exp[__m512], s: Exp[Int]): Exp[__m512] = {
    MM512_SWIZZLE_PS(v, s)
  }
            
  def _storebe_i32[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Int], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(ptr)(STOREBE_I32(ptr, data, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_adc_epi32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(k2_res)(MM512_MASK_ADC_EPI32(v2, k1, k2, v3, k2_res, k2_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_rcp23_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RCP23_PS(a)
  }
            
  def _mm512_maxabs_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MAXABS_PS(a, b)
  }
            
  def _mm512_mask_reduce_gmax_ps(k: Exp[Int], a: Exp[__m512]): Exp[Float] = {
    MM512_MASK_REDUCE_GMAX_PS(k, a)
  }
            
  def _mm512_log2ae23_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_LOG2AE23_PS(a)
  }
            
  def _mm512_mask_mulhi_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHI_EPI32(src, k, a, b)
  }
            
  def _mm512_addsetc_epi32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(k2_res)(MM512_ADDSETC_EPI32(v2, v3, k2_res, k2_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_roundfxpnt_adjust_ps(a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_ROUNDFXPNT_ADJUST_PS(a, rounding, expadj)
  }
            
  def _mm512_subsetb_epi32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_SUBSETB_EPI32(v2, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_swizzle_pd(v: Exp[__m512d], s: Exp[Int]): Exp[__m512d] = {
    MM512_SWIZZLE_PD(v, s)
  }
            
  def _mm_delay_64(r1: Exp[ULong]): Exp[Unit] = {
    reflectEffect(MM_DELAY_64(r1))
  }
            
  def _mm512_mulhi_epu32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULHI_EPU32(a, b)
  }
            
  def _mm512_mask_loadunpacklo_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKLO_EPI32(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_addn_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ADDN_PD(src, k, v2, v3)
  }
            
  def _mm512_i64extgather_epi32lo[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_I64EXTGATHER_EPI32LO(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorehi_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTOREHI_PD(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_addn_round_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ADDN_ROUND_PS(src, k, v2, v3, rounding)
  }
            
  def _mm512_mask_fixupnan_pd(v1: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASK_FIXUPNAN_PD(v1, k, v2, v3)
  }
            
  def _mm512_loadunpackhi_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_LOADUNPACKHI_EPI32(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpacklo_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_LOADUNPACKLO_PS(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extstore_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTSTORE_PS(mt, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extstore_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTSTORE_EPI64(mt, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpacklo_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKLO_EPI64(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_scale_ps(a: Exp[__m512], b: Exp[__m512i]): Exp[__m512] = {
    MM512_SCALE_PS(a, b)
  }
            
  def _mm512_fmadd233_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_FMADD233_EPI32(a, b)
  }
            
  def _mm512_kswapb(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KSWAPB(k1, k2)
  }
            
  def _mm512_mask_addn_round_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ADDN_ROUND_PD(src, k, v2, v3, rounding)
  }
            
  def _mm512_extpackstorelo_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTORELO_EPI32(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_subr_epi32(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512i], v3: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBR_EPI32(src, k, v2, v3)
  }
            
  def _mm512_rsqrt23_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RSQRT23_PS(a)
  }
            
  def _mm512_mask_packstorehi_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTOREHI_PD(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extstore_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTSTORE_EPI32(mt, k, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extgather_pslo[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mv)(MM512_MASK_I64EXTGATHER_PSLO(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_addn_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ADDN_PS(src, k, v2, v3)
  }
            
  def _mm512_mask_scale_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SCALE_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_mask_extstore_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTSTORE_PS(mt, k, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_gmax_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_GMAX_PD(src, k, a, b)
  }
            
  def _mm512_mask_packstorelo_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTORELO_EPI64(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_gmax_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_GMAX_PS(src, k, a, b)
  }
            
  def _mm512_mask_extload_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOAD_EPI64(src, k, mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_fmadd233_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMADD233_ROUND_PS(a, b, rounding)
  }
            
  def _mm512_mask_i32loscatter_epi64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I32LOSCATTER_EPI64(mv, k, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extstore_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTSTORE_EPI32(mt, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvtfxpnt_round_adjustps_epu32(v2: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512i] = {
    MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32(v2, rounding, expadj)
  }
            
  def _mm512_mask_loadunpacklo_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKLO_PD(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_spflt_32(r1: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_SPFLT_32(r1))
  }
            
  def _mm512_mask_extload_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOAD_EPI32(src, k, mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvt_roundpd_pslo(v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512] = {
    MM512_CVT_ROUNDPD_PSLO(v2, rounding)
  }
            
  def _mm512_mask_log2ae23_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_LOG2AE23_PS(src, k, a)
  }
            
  def _mm512_mask_maxabs_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MAXABS_PS(src, k, a, b)
  }
            
  def _mm512_mask_i64extgather_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mv)(MM512_MASK_I64EXTGATHER_PD(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_subr_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SUBR_PS(src, k, v2, v3)
  }
            
  def _mm512_mask_extpackstorehi_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTOREHI_EPI32(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpackhi_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKHI_PS(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_storenrngo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_STORENRNGO_PD(mt, v, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_sbb_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_SBB_EPI32(v2, k, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_addsets_ps[A[_], U:Integral](v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(sign)(MM512_ADDSETS_PS(v2, v3, sign, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_storenrngo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_STORENRNGO_PS(mt, v, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpackhi_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_LOADUNPACKHI_PS(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorelo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTORELO_PS(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvtfxpnt_round_adjustepi32_ps(v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS(v2, rounding, expadj)
  }
            
  def _mm512_i32loscatter_epi64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I32LOSCATTER_EPI64(mv, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorelo_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTORELO_EPI64(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorelo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTORELO_PS(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvtfxpnt_roundpd_epi32lo(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO(src, k, v2, rounding)
  }
            
  def _mm512_mask_loadunpackhi_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKHI_EPI64(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorelo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTORELO_PD(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_sbbr_epi32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_MASK_SBBR_EPI32(v2, k1, k2, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpacklo_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_EXTLOADUNPACKLO_PD(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_permute4f128_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_PERMUTE4F128_EPI32(src, k, a, imm8)
  }
            
  def _mm512_loadunpacklo_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_LOADUNPACKLO_EPI64(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpacklo_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_LOADUNPACKLO_EPI32(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_subr_ps(v2: Exp[__m512], v3: Exp[__m512]): Exp[__m512] = {
    MM512_SUBR_PS(v2, v3)
  }
            
  def _mm512_reduce_gmin_pd(a: Exp[__m512d]): Exp[Double] = {
    MM512_REDUCE_GMIN_PD(a)
  }
            
  def _mm_tzcnti_64(a: Exp[Long], x: Exp[ULong]): Exp[Long] = {
    MM_TZCNTI_64(a, x)
  }
            
  def _mm512_packstorehi_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTOREHI_PS(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_reduce_gmin_ps(a: Exp[__m512]): Exp[Float] = {
    MM512_REDUCE_GMIN_PS(a)
  }
            
  def _mm512_extload_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_EXTLOAD_PD(mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ROUND_PS(src, k, a, rounding, expadj)
  }
            
  def _mm512_mask_reduce_gmin_pd(k: Exp[Int], a: Exp[__m512d]): Exp[Double] = {
    MM512_MASK_REDUCE_GMIN_PD(k, a)
  }
            
  def _mm512_mask_i64extscatter_epi64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64EXTSCATTER_EPI64(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_addsets_ps[A[_], U:Integral](src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(sign)(MM512_MASK_ADDSETS_PS(src, k, v2, v3, sign, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvtfxpnt_roundpd_epi32lo(v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVTFXPNT_ROUNDPD_EPI32LO(v2, rounding)
  }
            
  def _mm512_mask_extloadunpacklo_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKLO_PS(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _loadbe_i64[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Long] = {
    cont.read(ptr)(LOADBE_I64(ptr, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_kmerge2l1l(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KMERGE2L1L(k1, k2)
  }
            
  def _mm512_extloadunpackhi_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOADUNPACKHI_EPI32(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_kandnr(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KANDNR(k1, k2)
  }
            
  def _mm_delay_32(r1: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_DELAY_32(r1))
  }
            
  def _mm512_scale_round_ps(a: Exp[__m512], b: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_SCALE_ROUND_PS(a, b, rounding)
  }
            
  def _mm512_mask_rsqrt23_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RSQRT23_PS(src, k, a)
  }
            
  def _mm512_i64extscatter_epi32lo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64EXTSCATTER_EPI32LO(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _loadbe_i32[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Int] = {
    cont.read(ptr)(LOADBE_I32(ptr, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_COUNTBITS_64 (r1) =>
      _mm_countbits_64(f(r1))
    case iDef@MM512_I64EXTGATHER_EPI64 (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_i64extgather_epi64(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKHI_PD (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpackhi_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKHI_PS (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpackhi_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTORELO_PD (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorelo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTSTORE_PD (mt, v, conv, hint, mtOffset) =>
      _mm512_extstore_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKLO_PS (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpacklo_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_FMADD233_PS (a, b) =>
      _mm512_fmadd233_ps(f(a), f(b))
    case iDef@MM512_I64EXTSCATTER_PD (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i64extscatter_pd(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SUBR_PD (src, k, v2, v3) =>
      _mm512_mask_subr_pd(f(src), f(k), f(v2), f(v3))
    case iDef@MM512_MASK_PACKSTOREHI_PS (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorehi_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SWIZZLE_EPI32 (src, k, v, s) =>
      _mm512_mask_swizzle_epi32(f(src), f(k), f(v), f(s))
    case MM512_MASK_SWIZZLE_EPI64 (src, k, v, s) =>
      _mm512_mask_swizzle_epi64(f(src), f(k), f(v), f(s))
    case iDef@MM512_EXTLOAD_PS (mt, conv, bc, hint, mtOffset) =>
      _mm512_extload_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_PERMUTE4F128_PS (src, k, a, imm8) =>
      _mm512_mask_permute4f128_ps(f(src), f(k), f(a), f(imm8))
    case iDef@MM512_MASK_I64EXTGATHER_EPI64 (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extgather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_SUBRSETB_EPI32 (v2, k, k_old, v3, borrow, borrowOffset) =>
      _mm512_mask_subrsetb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKHI_EPI32 (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpackhi_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTORELO_EPI32 (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorelo_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SUBR_EPI32 (v2, v3) =>
      _mm512_subr_epi32(f(v2), f(v3))
    case iDef@MM512_MASK_SBB_EPI32 (v2, k1, k2, v3, borrow, borrowOffset) =>
      _mm512_mask_sbb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS (src, k, v2, rounding, expadj) =>
      _mm512_mask_cvtfxpnt_round_adjustepu32_ps(f(src), f(k), f(v2), f(rounding), f(expadj))
    case iDef@MM_CLEVICT (ptr, level, ptrOffset) =>
      _mm_clevict(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(level, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_KEXTRACT_64 (a, b) =>
      _mm512_kextract_64(f(a), f(b))
    case iDef@MM512_MASK_PACKSTOREHI_EPI64 (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorehi_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MULHI_EPU32 (src, k, a, b) =>
      _mm512_mask_mulhi_epu32(f(src), f(k), f(a), f(b))
    case iDef@MM512_ADDSETS_EPI32 (v2, v3, sign, signOffset) =>
      _mm512_addsets_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case MM512_MASK_LOG2_PS (src, k, a) =>
      _mm512_mask_log2_ps(f(src), f(k), f(a))
    case MM512_MASK_SUBR_ROUND_PD (src, k, v2, v3, rounding) =>
      _mm512_mask_subr_round_pd(f(src), f(k), f(v2), f(v3), f(rounding))
    case iDef@MM512_I64EXTGATHER_PD (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_i64extgather_pd(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32 (v2, rounding, expadj) =>
      _mm512_cvtfxpnt_round_adjustps_epi32(f(v2), f(rounding), f(expadj))
    case iDef@STOREBE_I16 (ptr, data, ptrOffset) =>
      _storebe_i16(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_KMOVLHB (k1, k2) =>
      _mm512_kmovlhb(f(k1), f(k2))
    case iDef@MM512_STORENR_PD (mt, v, mtOffset) =>
      _mm512_storenr_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@LOADBE_I16 (ptr, ptrOffset) =>
      _loadbe_i16(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_FIXUPNAN_PS (v1, k, v2, v3) =>
      _mm512_mask_fixupnan_ps(f(v1), f(k), f(v2), f(v3))
    case MM_TZCNTI_32 (a, x) =>
      _mm_tzcnti_32(f(a), f(x))
    case iDef@MM512_EXTPACKSTOREHI_PS (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorehi_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORENR_PS (mt, v, mtOffset) =>
      _mm512_storenr_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTOREHI_PD (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorehi_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKLO_PD (src, mt, mtOffset) =>
      _mm512_loadunpacklo_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTSCATTER_PD (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extscatter_pd(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_FMADD_EPI32 (a, b, c) =>
      _mm512_fmadd_epi32(f(a), f(b), f(c))
    case MM512_PERMUTE4F128_PS (a, imm8) =>
      _mm512_permute4f128_ps(f(a), f(imm8))
    case iDef@MM512_MASK_I64EXTGATHER_EPI32LO (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extgather_epi32lo(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_FMADD233_EPI32 (src, k, a, b) =>
      _mm512_mask_fmadd233_epi32(f(src), f(k), f(a), f(b))
    case MM512_GMAX_PS (a, b) =>
      _mm512_gmax_ps(f(a), f(b))
    case iDef@MM512_LOADUNPACKHI_PD (src, mt, mtOffset) =>
      _mm512_loadunpackhi_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTSCATTER_PSLO (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extscatter_pslo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK3_FMADD_EPI32 (a, b, c, k) =>
      _mm512_mask3_fmadd_epi32(f(a), f(b), f(c), f(k))
    case MM512_MASK_GMIN_PS (src, k, a, b) =>
      _mm512_mask_gmin_ps(f(src), f(k), f(a), f(b))
    case iDef@MM512_PACKSTOREHI_EPI32 (mt, v1, mtOffset) =>
      _mm512_packstorehi_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTOREHI_EPI32 (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorehi_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTOREHI_PD (mt, v1, mtOffset) =>
      _mm512_packstorehi_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MULHI_EPI32 (a, b) =>
      _mm512_mulhi_epi32(f(a), f(b))
    case iDef@MM512_MASK_ADDSETC_EPI32 (v2, k, k_old, v3, k2_res, k2_resOffset) =>
      _mm512_mask_addsetc_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKHI_EPI64 (src, mt, mtOffset) =>
      _mm512_loadunpackhi_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_FMADD_EPI32 (a, k, b, c) =>
      _mm512_mask_fmadd_epi32(f(a), f(k), f(b), f(c))
    case MM512_MASK_REDUCE_GMIN_PS (k, a) =>
      _mm512_mask_reduce_gmin_ps(f(k), f(a))
    case MM512_ADDN_PD (v2, v3) =>
      _mm512_addn_pd(f(v2), f(v3))
    case iDef@MM512_PACKSTORELO_EPI32 (mt, v1, mtOffset) =>
      _mm512_packstorelo_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SUBR_ROUND_PD (v2, v3, rounding) =>
      _mm512_subr_round_pd(f(v2), f(v3), f(rounding))
    case MM512_MASK_RCP23_PS (src, k, a) =>
      _mm512_mask_rcp23_ps(f(src), f(k), f(a))
    case iDef@MM512_MASK_EXTPACKSTOREHI_EPI64 (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorehi_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_COUNTBITS_32 (r1) =>
      _mm_countbits_32(f(r1))
    case MM512_KCONCATLO_64 (k1, k2) =>
      _mm512_kconcatlo_64(f(k1), f(k2))
    case iDef@MM512_EXTPACKSTOREHI_EPI64 (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorehi_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKHI_PD (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpackhi_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SUBR_PD (v2, v3) =>
      _mm512_subr_pd(f(v2), f(v3))
    case iDef@MM512_MASK_LOADUNPACKLO_PS (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpacklo_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOAD_EPI64 (mt, conv, bc, hint, mtOffset) =>
      _mm512_extload_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOAD_PD (src, k, mt, conv, bc, hint, mtOffset) =>
      _mm512_mask_extload_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_GMIN_PD (a, b) =>
      _mm512_gmin_pd(f(a), f(b))
    case MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS (v2, rounding, expadj) =>
      _mm512_cvtfxpnt_round_adjustepu32_ps(f(v2), f(rounding), f(expadj))
    case iDef@MM512_MASK_EXTSTORE_PD (mt, k, v, conv, hint, mtOffset) =>
      _mm512_mask_extstore_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTORELO_PD (mt, v1, mtOffset) =>
      _mm512_packstorelo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_GMIN_PD (src, k, a, b) =>
      _mm512_mask_gmin_pd(f(src), f(k), f(a), f(b))
    case iDef@MM512_I64EXTSCATTER_EPI64 (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i64extscatter_epi64(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTORELO_PD (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorelo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKHI_EPI64 (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpackhi_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SWIZZLE_PS (v, s) =>
      _mm512_swizzle_ps(f(v), f(s))
    case iDef@STOREBE_I32 (ptr, data, ptrOffset) =>
      _storebe_i32(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_ADC_EPI32 (v2, k1, k2, v3, k2_res, k2_resOffset) =>
      _mm512_mask_adc_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont)
    case MM512_RCP23_PS (a) =>
      _mm512_rcp23_ps(f(a))
    case MM512_MAXABS_PS (a, b) =>
      _mm512_maxabs_ps(f(a), f(b))
    case MM512_MASK_REDUCE_GMAX_PS (k, a) =>
      _mm512_mask_reduce_gmax_ps(f(k), f(a))
    case MM512_LOG2AE23_PS (a) =>
      _mm512_log2ae23_ps(f(a))
    case MM512_MASK_MULHI_EPI32 (src, k, a, b) =>
      _mm512_mask_mulhi_epi32(f(src), f(k), f(a), f(b))
    case iDef@MM512_ADDSETC_EPI32 (v2, v3, k2_res, k2_resOffset) =>
      _mm512_addsetc_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont)
    case MM512_ROUNDFXPNT_ADJUST_PS (a, rounding, expadj) =>
      _mm512_roundfxpnt_adjust_ps(f(a), f(rounding), f(expadj))
    case iDef@MM512_SUBSETB_EPI32 (v2, v3, borrow, borrowOffset) =>
      _mm512_subsetb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case MM512_SWIZZLE_PD (v, s) =>
      _mm512_swizzle_pd(f(v), f(s))
    case MM_DELAY_64 (r1) =>
      _mm_delay_64(f(r1))
    case MM512_MULHI_EPU32 (a, b) =>
      _mm512_mulhi_epu32(f(a), f(b))
    case iDef@MM512_MASK_LOADUNPACKLO_EPI32 (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpacklo_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_ADDN_PD (src, k, v2, v3) =>
      _mm512_mask_addn_pd(f(src), f(k), f(v2), f(v3))
    case iDef@MM512_I64EXTGATHER_EPI32LO (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_i64extgather_epi32lo(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTOREHI_PD (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorehi_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_ADDN_ROUND_PS (src, k, v2, v3, rounding) =>
      _mm512_mask_addn_round_ps(f(src), f(k), f(v2), f(v3), f(rounding))
    case MM512_MASK_FIXUPNAN_PD (v1, k, v2, v3) =>
      _mm512_mask_fixupnan_pd(f(v1), f(k), f(v2), f(v3))
    case iDef@MM512_LOADUNPACKHI_EPI32 (src, mt, mtOffset) =>
      _mm512_loadunpackhi_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKLO_PS (src, mt, mtOffset) =>
      _mm512_loadunpacklo_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTSTORE_PS (mt, v, conv, hint, mtOffset) =>
      _mm512_extstore_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTSTORE_EPI64 (mt, v, conv, hint, mtOffset) =>
      _mm512_extstore_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKLO_EPI64 (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpacklo_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SCALE_PS (a, b) =>
      _mm512_scale_ps(f(a), f(b))
    case MM512_FMADD233_EPI32 (a, b) =>
      _mm512_fmadd233_epi32(f(a), f(b))
    case MM512_KSWAPB (k1, k2) =>
      _mm512_kswapb(f(k1), f(k2))
    case MM512_MASK_ADDN_ROUND_PD (src, k, v2, v3, rounding) =>
      _mm512_mask_addn_round_pd(f(src), f(k), f(v2), f(v3), f(rounding))
    case iDef@MM512_EXTPACKSTORELO_EPI32 (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorelo_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SUBR_EPI32 (src, k, v2, v3) =>
      _mm512_mask_subr_epi32(f(src), f(k), f(v2), f(v3))
    case MM512_RSQRT23_PS (a) =>
      _mm512_rsqrt23_ps(f(a))
    case iDef@MM512_MASK_PACKSTOREHI_PD (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorehi_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTSTORE_EPI32 (mt, k, v, conv, hint, mtOffset) =>
      _mm512_mask_extstore_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTGATHER_PSLO (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extgather_pslo(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_ADDN_PS (src, k, v2, v3) =>
      _mm512_mask_addn_ps(f(src), f(k), f(v2), f(v3))
    case MM512_MASK_SCALE_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_scale_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case iDef@MM512_MASK_EXTSTORE_PS (mt, k, v, conv, hint, mtOffset) =>
      _mm512_mask_extstore_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_GMAX_PD (src, k, a, b) =>
      _mm512_mask_gmax_pd(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_PACKSTORELO_EPI64 (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorelo_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_GMAX_PS (src, k, a, b) =>
      _mm512_mask_gmax_ps(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_EXTLOAD_EPI64 (src, k, mt, conv, bc, hint, mtOffset) =>
      _mm512_mask_extload_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_FMADD233_ROUND_PS (a, b, rounding) =>
      _mm512_fmadd233_round_ps(f(a), f(b), f(rounding))
    case iDef@MM512_MASK_I32LOSCATTER_EPI64 (mv, k, index, v1, scale, mvOffset) =>
      _mm512_mask_i32loscatter_epi64(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTSTORE_EPI32 (mt, v, conv, hint, mtOffset) =>
      _mm512_extstore_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32 (v2, rounding, expadj) =>
      _mm512_cvtfxpnt_round_adjustps_epu32(f(v2), f(rounding), f(expadj))
    case iDef@MM512_MASK_LOADUNPACKLO_PD (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpacklo_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_SPFLT_32 (r1) =>
      _mm_spflt_32(f(r1))
    case iDef@MM512_MASK_EXTLOAD_EPI32 (src, k, mt, conv, bc, hint, mtOffset) =>
      _mm512_mask_extload_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CVT_ROUNDPD_PSLO (v2, rounding) =>
      _mm512_cvt_roundpd_pslo(f(v2), f(rounding))
    case MM512_MASK_LOG2AE23_PS (src, k, a) =>
      _mm512_mask_log2ae23_ps(f(src), f(k), f(a))
    case MM512_MASK_MAXABS_PS (src, k, a, b) =>
      _mm512_mask_maxabs_ps(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_I64EXTGATHER_PD (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extgather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SUBR_PS (src, k, v2, v3) =>
      _mm512_mask_subr_ps(f(src), f(k), f(v2), f(v3))
    case iDef@MM512_MASK_EXTPACKSTOREHI_EPI32 (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorehi_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKHI_PS (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpackhi_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORENRNGO_PD (mt, v, mtOffset) =>
      _mm512_storenrngo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_SBB_EPI32 (v2, k, v3, borrow, borrowOffset) =>
      _mm512_sbb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_ADDSETS_PS (v2, v3, sign, signOffset) =>
      _mm512_addsets_ps(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_STORENRNGO_PS (mt, v, mtOffset) =>
      _mm512_storenrngo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKHI_PS (src, mt, mtOffset) =>
      _mm512_loadunpackhi_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTORELO_PS (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorelo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS (v2, rounding, expadj) =>
      _mm512_cvtfxpnt_round_adjustepi32_ps(f(v2), f(rounding), f(expadj))
    case iDef@MM512_I32LOSCATTER_EPI64 (mv, index, v1, scale, mvOffset) =>
      _mm512_i32loscatter_epi64(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTORELO_EPI64 (mt, v1, mtOffset) =>
      _mm512_packstorelo_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTORELO_PS (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorelo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO (src, k, v2, rounding) =>
      _mm512_mask_cvtfxpnt_roundpd_epi32lo(f(src), f(k), f(v2), f(rounding))
    case iDef@MM512_MASK_LOADUNPACKHI_EPI64 (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpackhi_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTORELO_PD (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorelo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_SBBR_EPI32 (v2, k1, k2, v3, borrow, borrowOffset) =>
      _mm512_mask_sbbr_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKLO_PD (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpacklo_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_PERMUTE4F128_EPI32 (src, k, a, imm8) =>
      _mm512_mask_permute4f128_epi32(f(src), f(k), f(a), f(imm8))
    case iDef@MM512_LOADUNPACKLO_EPI64 (src, mt, mtOffset) =>
      _mm512_loadunpacklo_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKLO_EPI32 (src, mt, mtOffset) =>
      _mm512_loadunpacklo_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SUBR_PS (v2, v3) =>
      _mm512_subr_ps(f(v2), f(v3))
    case MM512_REDUCE_GMIN_PD (a) =>
      _mm512_reduce_gmin_pd(f(a))
    case MM_TZCNTI_64 (a, x) =>
      _mm_tzcnti_64(f(a), f(x))
    case iDef@MM512_PACKSTOREHI_PS (mt, v1, mtOffset) =>
      _mm512_packstorehi_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_REDUCE_GMIN_PS (a) =>
      _mm512_reduce_gmin_ps(f(a))
    case iDef@MM512_EXTLOAD_PD (mt, conv, bc, hint, mtOffset) =>
      _mm512_extload_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_ROUND_PS (src, k, a, rounding, expadj) =>
      _mm512_mask_round_ps(f(src), f(k), f(a), f(rounding), f(expadj))
    case MM512_MASK_REDUCE_GMIN_PD (k, a) =>
      _mm512_mask_reduce_gmin_pd(f(k), f(a))
    case iDef@MM512_MASK_I64EXTSCATTER_EPI64 (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extscatter_epi64(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_ADDSETS_PS (src, k, v2, v3, sign, signOffset) =>
      _mm512_mask_addsets_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case MM512_CVTFXPNT_ROUNDPD_EPI32LO (v2, rounding) =>
      _mm512_cvtfxpnt_roundpd_epi32lo(f(v2), f(rounding))
    case iDef@MM512_MASK_EXTLOADUNPACKLO_PS (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpacklo_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@LOADBE_I64 (ptr, ptrOffset) =>
      _loadbe_i64(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_KMERGE2L1L (k1, k2) =>
      _mm512_kmerge2l1l(f(k1), f(k2))
    case iDef@MM512_EXTLOADUNPACKHI_EPI32 (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpackhi_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_KANDNR (k1, k2) =>
      _mm512_kandnr(f(k1), f(k2))
    case MM_DELAY_32 (r1) =>
      _mm_delay_32(f(r1))
    case MM512_SCALE_ROUND_PS (a, b, rounding) =>
      _mm512_scale_round_ps(f(a), f(b), f(rounding))
    case MM512_MASK_RSQRT23_PS (src, k, a) =>
      _mm512_mask_rsqrt23_ps(f(src), f(k), f(a))
    case iDef@MM512_I64EXTSCATTER_EPI32LO (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i64extscatter_epi32lo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@LOADBE_I32 (ptr, ptrOffset) =>
      _loadbe_i32(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)

    case Reflect(MM_COUNTBITS_64 (r1), u, es) =>
      reflectMirrored(Reflect(MM_COUNTBITS_64 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTGATHER_EPI64 (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTGATHER_EPI64 (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKHI_PD (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKHI_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKHI_PS (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKHI_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTORELO_PD (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTORELO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTSTORE_PD (mt, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTSTORE_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKLO_PS (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKLO_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD233_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD233_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTSCATTER_PD (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTSCATTER_PD (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_PD (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_PD (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTOREHI_PS (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTOREHI_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SWIZZLE_EPI32 (src, k, v, s), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SWIZZLE_EPI32 (f(src), f(k), f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SWIZZLE_EPI64 (src, k, v, s), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SWIZZLE_EPI64 (f(src), f(k), f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOAD_PS (mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOAD_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTE4F128_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTE4F128_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTGATHER_EPI64 (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTGATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SUBRSETB_EPI32 (v2, k, k_old, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBRSETB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKHI_EPI32 (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKHI_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTORELO_EPI32 (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTORELO_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_EPI32 (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_EPI32 (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SBB_EPI32 (v2, k1, k2, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SBB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS (src, k, v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS (f(src), f(k), f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_CLEVICT (ptr, level, ptrOffset), u, es) =>
      reflectMirrored(Reflect(MM_CLEVICT (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(level, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KEXTRACT_64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KEXTRACT_64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTOREHI_EPI64 (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTOREHI_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHI_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHI_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADDSETS_EPI32 (v2, v3, sign, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADDSETS_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG2_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG2_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_ROUND_PD (src, k, v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_ROUND_PD (f(src), f(k), f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTGATHER_PD (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTGATHER_PD (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32 (v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32 (f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@STOREBE_I16 (ptr, data, ptrOffset), u, es) =>
      reflectMirrored(Reflect(STOREBE_I16 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KMOVLHB (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KMOVLHB (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORENR_PD (mt, v, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORENR_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@LOADBE_I16 (ptr, ptrOffset), u, es) =>
      reflectMirrored(Reflect(LOADBE_I16 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPNAN_PS (v1, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPNAN_PS (f(v1), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TZCNTI_32 (a, x), u, es) =>
      reflectMirrored(Reflect(MM_TZCNTI_32 (f(a), f(x)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTOREHI_PS (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTOREHI_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORENR_PS (mt, v, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORENR_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTOREHI_PD (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTOREHI_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKLO_PD (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKLO_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTSCATTER_PD (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTSCATTER_PD (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_EPI32 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_EPI32 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTE4F128_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTE4F128_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTGATHER_EPI32LO (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTGATHER_EPI32LO (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD233_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD233_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMAX_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMAX_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKHI_PD (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKHI_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTSCATTER_PSLO (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTSCATTER_PSLO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADD_EPI32 (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADD_EPI32 (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMIN_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMIN_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTOREHI_EPI32 (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTOREHI_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTOREHI_EPI32 (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTOREHI_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTOREHI_PD (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTOREHI_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULHI_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULHI_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADDSETC_EPI32 (v2, k, k_old, v3, k2_res, k2_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDSETC_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKHI_EPI64 (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKHI_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD_EPI32 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD_EPI32 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_GMIN_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_GMIN_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDN_PD (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_ADDN_PD (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTORELO_EPI32 (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTORELO_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_ROUND_PD (v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_ROUND_PD (f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP23_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP23_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTOREHI_EPI64 (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTOREHI_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COUNTBITS_32 (r1), u, es) =>
      reflectMirrored(Reflect(MM_COUNTBITS_32 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KCONCATLO_64 (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KCONCATLO_64 (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTOREHI_EPI64 (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTOREHI_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKHI_PD (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKHI_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_PD (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_PD (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKLO_PS (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKLO_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOAD_EPI64 (mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOAD_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOAD_PD (src, k, mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOAD_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMIN_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMIN_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS (v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS (f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTSTORE_PD (mt, k, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTSTORE_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTORELO_PD (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTORELO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMIN_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMIN_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTSCATTER_EPI64 (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTSCATTER_EPI64 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTORELO_PD (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTORELO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKHI_EPI64 (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKHI_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SWIZZLE_PS (v, s), u, es) =>
      reflectMirrored(Reflect(MM512_SWIZZLE_PS (f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@STOREBE_I32 (ptr, data, ptrOffset), u, es) =>
      reflectMirrored(Reflect(STOREBE_I32 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADC_EPI32 (v2, k1, k2, v3, k2_res, k2_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADC_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP23_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP23_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAXABS_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAXABS_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_GMAX_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_GMAX_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG2AE23_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG2AE23_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHI_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHI_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADDSETC_EPI32 (v2, v3, k2_res, k2_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADDSETC_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDFXPNT_ADJUST_PS (a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDFXPNT_ADJUST_PS (f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SUBSETB_EPI32 (v2, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SUBSETB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SWIZZLE_PD (v, s), u, es) =>
      reflectMirrored(Reflect(MM512_SWIZZLE_PD (f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DELAY_64 (r1), u, es) =>
      reflectMirrored(Reflect(MM_DELAY_64 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULHI_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULHI_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKLO_EPI32 (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKLO_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDN_PD (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDN_PD (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTGATHER_EPI32LO (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTGATHER_EPI32LO (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTOREHI_PD (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTOREHI_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDN_ROUND_PS (src, k, v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDN_ROUND_PS (f(src), f(k), f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPNAN_PD (v1, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPNAN_PD (f(v1), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKHI_EPI32 (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKHI_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKLO_PS (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKLO_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTSTORE_PS (mt, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTSTORE_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTSTORE_EPI64 (mt, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTSTORE_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKLO_EPI64 (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKLO_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALE_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SCALE_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD233_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD233_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KSWAPB (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KSWAPB (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDN_ROUND_PD (src, k, v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDN_ROUND_PD (f(src), f(k), f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTORELO_EPI32 (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTORELO_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_EPI32 (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_EPI32 (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT23_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT23_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTOREHI_PD (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTOREHI_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTSTORE_EPI32 (mt, k, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTSTORE_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTGATHER_PSLO (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTGATHER_PSLO (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDN_PS (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDN_PS (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALE_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALE_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTSTORE_PS (mt, k, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTSTORE_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMAX_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMAX_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTORELO_EPI64 (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTORELO_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMAX_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMAX_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOAD_EPI64 (src, k, mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOAD_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD233_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD233_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32LOSCATTER_EPI64 (mv, k, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32LOSCATTER_EPI64 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTSTORE_EPI32 (mt, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTSTORE_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32 (v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32 (f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKLO_PD (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKLO_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SPFLT_32 (r1), u, es) =>
      reflectMirrored(Reflect(MM_SPFLT_32 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOAD_EPI32 (src, k, mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOAD_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_PSLO (v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_PSLO (f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG2AE23_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG2AE23_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAXABS_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAXABS_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTGATHER_PD (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTGATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_PS (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_PS (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTOREHI_EPI32 (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTOREHI_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKHI_PS (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKHI_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORENRNGO_PD (mt, v, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORENRNGO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SBB_EPI32 (v2, k, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SBB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADDSETS_PS (v2, v3, sign, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADDSETS_PS (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORENRNGO_PS (mt, v, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORENRNGO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKHI_PS (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKHI_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTORELO_PS (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTORELO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS (v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS (f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32LOSCATTER_EPI64 (mv, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32LOSCATTER_EPI64 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTORELO_EPI64 (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTORELO_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTORELO_PS (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTORELO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO (src, k, v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO (f(src), f(k), f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKHI_EPI64 (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKHI_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTORELO_PD (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTORELO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SBBR_EPI32 (v2, k1, k2, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SBBR_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKLO_PD (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKLO_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTE4F128_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTE4F128_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKLO_EPI64 (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKLO_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKLO_EPI32 (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKLO_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_PS (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_PS (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_GMIN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_GMIN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TZCNTI_64 (a, x), u, es) =>
      reflectMirrored(Reflect(MM_TZCNTI_64 (f(a), f(x)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTOREHI_PS (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTOREHI_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_GMIN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_GMIN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOAD_PD (mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOAD_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUND_PS (src, k, a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUND_PS (f(src), f(k), f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_GMIN_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_GMIN_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTSCATTER_EPI64 (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTSCATTER_EPI64 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADDSETS_PS (src, k, v2, v3, sign, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDSETS_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUNDPD_EPI32LO (v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUNDPD_EPI32LO (f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKLO_PS (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKLO_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@LOADBE_I64 (ptr, ptrOffset), u, es) =>
      reflectMirrored(Reflect(LOADBE_I64 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KMERGE2L1L (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KMERGE2L1L (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKHI_EPI32 (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKHI_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KANDNR (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KANDNR (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DELAY_32 (r1), u, es) =>
      reflectMirrored(Reflect(MM_DELAY_32 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALE_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SCALE_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT23_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT23_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTSCATTER_EPI32LO (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTSCATTER_EPI32LO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@LOADBE_I32 (ptr, ptrOffset), u, es) =>
      reflectMirrored(Reflect(LOADBE_I32 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenKNC00 extends CGenIntrinsics {

  val IR: KNC
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_COUNTBITS_64(r1) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_countbits_64(${quote(r1)})")
    case iDef@MM512_I64EXTGATHER_EPI64(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64extgather_epi64(${quote(index)}, (void const*) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_LOADUNPACKHI_PD(src, k, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadunpackhi_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_MASK_LOADUNPACKHI_PS(src, k, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadunpackhi_ps(${quote(src)}, ${quote(k)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_MASK_EXTPACKSTORELO_PD(mt, k, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extpackstorelo_pd((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_EXTSTORE_PD(mt, v, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extstore_pd((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_EXTLOADUNPACKLO_PS(src, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extloadunpacklo_ps(${quote(src)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_FMADD233_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmadd233_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_I64EXTSCATTER_PD(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64extscatter_pd((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_SUBR_PD(src, k, v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subr_pd(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_MASK_PACKSTOREHI_PS(mt, k, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_packstorehi_ps((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)});")
    case iDef@MM512_MASK_SWIZZLE_EPI32(src, k, v, s) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_swizzle_epi32(${quote(src)}, ${quote(k)}, ${quote(v)}, ${quote(s)})")
    case iDef@MM512_MASK_SWIZZLE_EPI64(src, k, v, s) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_swizzle_epi64(${quote(src)}, ${quote(k)}, ${quote(v)}, ${quote(s)})")
    case iDef@MM512_EXTLOAD_PS(mt, conv, bc, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extload_ps((void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case iDef@MM512_MASK_PERMUTE4F128_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permute4f128_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_I64EXTGATHER_EPI64(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64extgather_epi64(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const*) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_SUBRSETB_EPI32(v2, k, k_old, v3, borrow, borrowOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subrsetb_epi32(${quote(v2)}, ${quote(k)}, ${quote(k_old)}, ${quote(v3)}, (__mmask16 *) (${quote(borrow)  + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))}))")
    case iDef@MM512_MASK_EXTLOADUNPACKHI_EPI32(src, k, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extloadunpackhi_epi32(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_MASK_PACKSTORELO_EPI32(mt, k, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_packstorelo_epi32((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)});")
    case iDef@MM512_SUBR_EPI32(v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subr_epi32(${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_MASK_SBB_EPI32(v2, k1, k2, v3, borrow, borrowOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sbb_epi32(${quote(v2)}, ${quote(k1)}, ${quote(k2)}, ${quote(v3)}, (__mmask16 *) (${quote(borrow)  + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))}))")
    case iDef@MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS(src, k, v2, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtfxpnt_round_adjustepu32_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM_CLEVICT(ptr, level, ptrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_clevict((const void *) (${quote(ptr)  + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}), ${quote(level)});")
    case iDef@MM512_KEXTRACT_64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kextract_64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PACKSTOREHI_EPI64(mt, k, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_packstorehi_epi64((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)});")
    case iDef@MM512_MASK_MULHI_EPU32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mulhi_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_ADDSETS_EPI32(v2, v3, sign, signOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_addsets_epi32(${quote(v2)}, ${quote(v3)}, (__mmask16 *) (${quote(sign)  + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))}))")
    case iDef@MM512_MASK_LOG2_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log2_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SUBR_ROUND_PD(src, k, v2, v3, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subr_round_pd(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case iDef@MM512_I64EXTGATHER_PD(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64extgather_pd(${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32(v2, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtfxpnt_round_adjustps_epi32(${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@STOREBE_I16(ptr, data, ptrOffset) =>
      headers += iDef.header
      stream.println(s"_storebe_i16((void *) (${quote(ptr)  + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}), ${quote(data)});")
    case iDef@MM512_KMOVLHB(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kmovlhb(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_STORENR_PD(mt, v, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_storenr_pd((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v)});")
    case iDef@LOADBE_I16(ptr, ptrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_loadbe_i16((void const *) (${quote(ptr)  + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}))")
    case iDef@MM512_MASK_FIXUPNAN_PS(v1, k, v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupnan_ps(${quote(v1)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case iDef@MM_TZCNTI_32(a, x) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tzcnti_32(${quote(a)}, ${quote(x)})")
    case iDef@MM512_EXTPACKSTOREHI_PS(mt, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extpackstorehi_ps((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_STORENR_PS(mt, v, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_storenr_ps((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v)});")
    case iDef@MM512_EXTPACKSTOREHI_PD(mt, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extpackstorehi_pd((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_LOADUNPACKLO_PD(src, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadunpacklo_pd(${quote(src)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_MASK_I64EXTSCATTER_PD(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64extscatter_pd((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_FMADD_EPI32(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmadd_epi32(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_PERMUTE4F128_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permute4f128_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_I64EXTGATHER_EPI32LO(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64extgather_epi32lo(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const*) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_FMADD233_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmadd233_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_GMAX_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmax_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_LOADUNPACKHI_PD(src, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadunpackhi_pd(${quote(src)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_MASK_I64EXTSCATTER_PSLO(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64extscatter_pslo((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK3_FMADD_EPI32(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmadd_epi32(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK_GMIN_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmin_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_PACKSTOREHI_EPI32(mt, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_packstorehi_epi32((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)});")
    case iDef@MM512_MASK_PACKSTOREHI_EPI32(mt, k, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_packstorehi_epi32((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)});")
    case iDef@MM512_PACKSTOREHI_PD(mt, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_packstorehi_pd((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)});")
    case iDef@MM512_MULHI_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mulhi_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ADDSETC_EPI32(v2, k, k_old, v3, k2_res, k2_resOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_addsetc_epi32(${quote(v2)}, ${quote(k)}, ${quote(k_old)}, ${quote(v3)}, (__mmask16 *) (${quote(k2_res)  + (if(k2_resOffset == Const(0)) "" else " + " + quote(k2_resOffset))}))")
    case iDef@MM512_LOADUNPACKHI_EPI64(src, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadunpackhi_epi64(${quote(src)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_MASK_FMADD_EPI32(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmadd_epi32(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_REDUCE_GMIN_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_gmin_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_ADDN_PD(v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_addn_pd(${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_PACKSTORELO_EPI32(mt, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_packstorelo_epi32((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)});")
    case iDef@MM512_SUBR_ROUND_PD(v2, v3, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subr_round_pd(${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case iDef@MM512_MASK_RCP23_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rcp23_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_EXTPACKSTOREHI_EPI64(mt, k, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extpackstorehi_epi64((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM_COUNTBITS_32(r1) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_countbits_32(${quote(r1)})")
    case iDef@MM512_KCONCATLO_64(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kconcatlo_64(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_EXTPACKSTOREHI_EPI64(mt, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extpackstorehi_epi64((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_MASK_EXTLOADUNPACKHI_PD(src, k, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extloadunpackhi_pd(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_SUBR_PD(v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subr_pd(${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_MASK_LOADUNPACKLO_PS(src, k, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadunpacklo_ps(${quote(src)}, ${quote(k)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_EXTLOAD_EPI64(mt, conv, bc, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extload_epi64((void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case iDef@MM512_MASK_EXTLOAD_PD(src, k, mt, conv, bc, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extload_pd(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case iDef@MM512_GMIN_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmin_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS(v2, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtfxpnt_round_adjustepu32_ps(${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_MASK_EXTSTORE_PD(mt, k, v, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extstore_pd((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_PACKSTORELO_PD(mt, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_packstorelo_pd((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)});")
    case iDef@MM512_MASK_GMIN_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmin_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_I64EXTSCATTER_EPI64(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64extscatter_epi64((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_EXTPACKSTORELO_PD(mt, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extpackstorelo_pd((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_EXTLOADUNPACKHI_EPI64(src, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extloadunpackhi_epi64(${quote(src)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_SWIZZLE_PS(v, s) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_swizzle_ps(${quote(v)}, ${quote(s)})")
    case iDef@STOREBE_I32(ptr, data, ptrOffset) =>
      headers += iDef.header
      stream.println(s"_storebe_i32((void *) (${quote(ptr)  + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}), ${quote(data)});")
    case iDef@MM512_MASK_ADC_EPI32(v2, k1, k2, v3, k2_res, k2_resOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_adc_epi32(${quote(v2)}, ${quote(k1)}, ${quote(k2)}, ${quote(v3)}, (__mmask16 *) (${quote(k2_res)  + (if(k2_resOffset == Const(0)) "" else " + " + quote(k2_resOffset))}))")
    case iDef@MM512_RCP23_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rcp23_ps(${quote(a)})")
    case iDef@MM512_MAXABS_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maxabs_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_REDUCE_GMAX_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_gmax_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOG2AE23_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log2ae23_ps(${quote(a)})")
    case iDef@MM512_MASK_MULHI_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mulhi_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_ADDSETC_EPI32(v2, v3, k2_res, k2_resOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_addsetc_epi32(${quote(v2)}, ${quote(v3)}, (__mmask16 *) (${quote(k2_res)  + (if(k2_resOffset == Const(0)) "" else " + " + quote(k2_resOffset))}))")
    case iDef@MM512_ROUNDFXPNT_ADJUST_PS(a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_roundfxpnt_adjust_ps(${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_SUBSETB_EPI32(v2, v3, borrow, borrowOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subsetb_epi32(${quote(v2)}, ${quote(v3)}, (__mmask16 *) (${quote(borrow)  + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))}))")
    case iDef@MM512_SWIZZLE_PD(v, s) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_swizzle_pd(${quote(v)}, ${quote(s)})")
    case iDef@MM_DELAY_64(r1) =>
      headers += iDef.header
      stream.println(s"_mm_delay_64(${quote(r1)});")
    case iDef@MM512_MULHI_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mulhi_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_LOADUNPACKLO_EPI32(src, k, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadunpacklo_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_MASK_ADDN_PD(src, k, v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_addn_pd(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_I64EXTGATHER_EPI32LO(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64extgather_epi32lo(${quote(index)}, (void const*) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_EXTPACKSTOREHI_PD(mt, k, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extpackstorehi_pd((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_MASK_ADDN_ROUND_PS(src, k, v2, v3, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_addn_round_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FIXUPNAN_PD(v1, k, v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupnan_pd(${quote(v1)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_LOADUNPACKHI_EPI32(src, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadunpackhi_epi32(${quote(src)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_LOADUNPACKLO_PS(src, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadunpacklo_ps(${quote(src)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_EXTSTORE_PS(mt, v, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extstore_ps((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_EXTSTORE_EPI64(mt, v, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extstore_epi64((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_MASK_EXTLOADUNPACKLO_EPI64(src, k, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extloadunpacklo_epi64(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_SCALE_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_scale_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_FMADD233_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmadd233_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_KSWAPB(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kswapb(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_MASK_ADDN_ROUND_PD(src, k, v2, v3, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_addn_round_pd(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case iDef@MM512_EXTPACKSTORELO_EPI32(mt, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extpackstorelo_epi32((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_MASK_SUBR_EPI32(src, k, v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subr_epi32(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_RSQRT23_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rsqrt23_ps(${quote(a)})")
    case iDef@MM512_MASK_PACKSTOREHI_PD(mt, k, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_packstorehi_pd((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)});")
    case iDef@MM512_MASK_EXTSTORE_EPI32(mt, k, v, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extstore_epi32((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_MASK_I64EXTGATHER_PSLO(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64extgather_pslo(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_ADDN_PS(src, k, v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_addn_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_MASK_SCALE_ROUND_PS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_scale_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_EXTSTORE_PS(mt, k, v, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extstore_ps((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_MASK_GMAX_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmax_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PACKSTORELO_EPI64(mt, k, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_packstorelo_epi64((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)});")
    case iDef@MM512_MASK_GMAX_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmax_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_EXTLOAD_EPI64(src, k, mt, conv, bc, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extload_epi64(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case iDef@MM512_FMADD233_ROUND_PS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmadd233_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_I32LOSCATTER_EPI64(mv, k, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i32loscatter_epi64((void*) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_EXTSTORE_EPI32(mt, v, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extstore_epi32((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32(v2, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtfxpnt_round_adjustps_epu32(${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_MASK_LOADUNPACKLO_PD(src, k, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadunpacklo_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM_SPFLT_32(r1) =>
      headers += iDef.header
      stream.println(s"_mm_spflt_32(${quote(r1)});")
    case iDef@MM512_MASK_EXTLOAD_EPI32(src, k, mt, conv, bc, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extload_epi32(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case iDef@MM512_CVT_ROUNDPD_PSLO(v2, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundpd_pslo(${quote(v2)}, ${quote(rounding)})")
    case iDef@MM512_MASK_LOG2AE23_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log2ae23_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_MAXABS_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_maxabs_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_I64EXTGATHER_PD(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64extgather_pd(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_SUBR_PS(src, k, v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subr_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_MASK_EXTPACKSTOREHI_EPI32(mt, k, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extpackstorehi_epi32((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_MASK_EXTLOADUNPACKHI_PS(src, k, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extloadunpackhi_ps(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_STORENRNGO_PD(mt, v, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_storenrngo_pd((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v)});")
    case iDef@MM512_SBB_EPI32(v2, k, v3, borrow, borrowOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sbb_epi32(${quote(v2)}, ${quote(k)}, ${quote(v3)}, (__mmask16 *) (${quote(borrow)  + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))}))")
    case iDef@MM512_ADDSETS_PS(v2, v3, sign, signOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_addsets_ps(${quote(v2)}, ${quote(v3)}, (__mmask16 *) (${quote(sign)  + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))}))")
    case iDef@MM512_STORENRNGO_PS(mt, v, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_storenrngo_ps((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v)});")
    case iDef@MM512_LOADUNPACKHI_PS(src, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadunpackhi_ps(${quote(src)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_MASK_EXTPACKSTORELO_PS(mt, k, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extpackstorelo_ps((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS(v2, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtfxpnt_round_adjustepi32_ps(${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_I32LOSCATTER_EPI64(mv, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i32loscatter_epi64((void*) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_PACKSTORELO_EPI64(mt, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_packstorelo_epi64((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)});")
    case iDef@MM512_EXTPACKSTORELO_PS(mt, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extpackstorelo_ps((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO(src, k, v2, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtfxpnt_roundpd_epi32lo(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(rounding)})")
    case iDef@MM512_MASK_LOADUNPACKHI_EPI64(src, k, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadunpackhi_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_MASK_PACKSTORELO_PD(mt, k, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_packstorelo_pd((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)});")
    case iDef@MM512_MASK_SBBR_EPI32(v2, k1, k2, v3, borrow, borrowOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sbbr_epi32(${quote(v2)}, ${quote(k1)}, ${quote(k2)}, ${quote(v3)}, (__mmask16 *) (${quote(borrow)  + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))}))")
    case iDef@MM512_EXTLOADUNPACKLO_PD(src, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extloadunpacklo_pd(${quote(src)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_MASK_PERMUTE4F128_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permute4f128_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_LOADUNPACKLO_EPI64(src, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadunpacklo_epi64(${quote(src)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_LOADUNPACKLO_EPI32(src, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadunpacklo_epi32(${quote(src)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_SUBR_PS(v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subr_ps(${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_REDUCE_GMIN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_gmin_pd(${quote(a)})")
    case iDef@MM_TZCNTI_64(a, x) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tzcnti_64(${quote(a)}, ${quote(x)})")
    case iDef@MM512_PACKSTOREHI_PS(mt, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_packstorehi_ps((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)});")
    case iDef@MM512_REDUCE_GMIN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_gmin_ps(${quote(a)})")
    case iDef@MM512_EXTLOAD_PD(mt, conv, bc, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extload_pd((void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case iDef@MM512_MASK_ROUND_PS(src, k, a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_MASK_REDUCE_GMIN_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_gmin_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_I64EXTSCATTER_EPI64(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64extscatter_epi64((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_ADDSETS_PS(src, k, v2, v3, sign, signOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_addsets_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, (__mmask16 *) (${quote(sign)  + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))}))")
    case iDef@MM512_CVTFXPNT_ROUNDPD_EPI32LO(v2, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtfxpnt_roundpd_epi32lo(${quote(v2)}, ${quote(rounding)})")
    case iDef@MM512_MASK_EXTLOADUNPACKLO_PS(src, k, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extloadunpacklo_ps(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@LOADBE_I64(ptr, ptrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_loadbe_i64((void const *) (${quote(ptr)  + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}))")
    case iDef@MM512_KMERGE2L1L(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kmerge2l1l(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_EXTLOADUNPACKHI_EPI32(src, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extloadunpackhi_epi32(${quote(src)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_KANDNR(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kandnr(${quote(k1)}, ${quote(k2)})")
    case iDef@MM_DELAY_32(r1) =>
      headers += iDef.header
      stream.println(s"_mm_delay_32(${quote(r1)});")
    case iDef@MM512_SCALE_ROUND_PS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_scale_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_RSQRT23_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rsqrt23_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_I64EXTSCATTER_EPI32LO(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64extscatter_epi32lo((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@LOADBE_I32(ptr, ptrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_loadbe_i32((void const *) (${quote(ptr)  + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}))")
    case _ => super.emitNode(sym, rhs)
  }
}
