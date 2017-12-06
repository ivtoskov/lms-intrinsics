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

    
trait AVX200 extends IntrinsicsBase {
  /**
   * Shuffle 32-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * a: __m256i, idx: __m256i
   */
  case class MM256_PERMUTEVAR8X32_EPI32(a: Exp[__m256i], idx: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 64-bit integers from "a" into memory using "mask" (elements are
   * not stored when the highest bit is not set in the corresponding element).
   * mem_addr: __int64*, mask: __m128i, a: __m128i, mem_addrOffset: int
   */
  case class MM_MASKSTORE_EPI64[A[_], U:Integral](mem_addr: Exp[A[Long]], mask: Exp[__m128i], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKHI_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MIN_EPU8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using "mask" (elements are
   * zeroed out when the highest bit is not set in the corresponding element).
   * mem_addr: __int64 const*, mask: __m128i, mem_addrOffset: int
   */
  case class MM_MASKLOAD_EPI64[A[_], U:Integral](mem_addr: Exp[A[Long]], mask: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using "mask" (elements are
   * zeroed out when the highest bit is not set in the corresponding element).
   * mem_addr: int const*, mask: __m128i, mem_addrOffset: int
   */
  case class MM_MASKLOAD_EPI32[A[_], U:Integral](mem_addr: Exp[A[Int]], mask: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute differences of packed unsigned 8-bit integers in "a" and
   * "b", then horizontally sum each consecutive 8 differences to produce four
   * unsigned 16-bit integers, and pack these unsigned 16-bit integers in the low
   * 16 bits of 64-bit elements in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SAD_EPU8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the high 64 bits of 128-bit lanes of
   * "dst", with the low 64 bits of 128-bit lanes being copied from from "a" to
   * "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_SHUFFLEHI_EPI16(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPU16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of 16-bit integers in "a" and "b" using
   * saturation, and pack the signed 16-bit results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_HADDS_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of 32-bit integers in "a" and "b", and
   * pack the signed 32-bit results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_HSUB_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" within 128-bit lanes using the control in
   * "imm8", and store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_SHUFFLE_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 256-bits of integer data from memory into "dst" using a non-temporal
   * memory hint.
   * 	"mem_addr" must be aligned on a 32-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: __m256i const*, mem_addrOffset: int
   */
  case class MM256_STREAM_LOAD_SI256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low double-precision (64-bit) floating-point element from "a" to
   * all elements of "dst".
   * a: __m128d
   */
  case class MM_BROADCASTSD_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPU8_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 8 byte sof "a" to packed
   * 64-bit integers, and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPU8_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MULLO_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using "mask" (elements are copied from "src" when the highest bit is not set
   * in the corresponding element). "scale" should be 1, 2, 4 or 8.
   * src: __m128, base_addr: float const*, vindex: __m256i, mask: __m128, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64GATHER_PS[A[_], U:Integral](src: Exp[__m128], base_addr: Exp[A[Float]], vindex: Exp[__m256i], mask: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKHI_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Negate packed 16-bit integers in "a" when the corresponding signed 16-bit
   * integer in "b" is negative, and store the results in "dst". Element in "dst"
   * are zeroed out when the corresponding element in "b" is zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_SIGN_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPU8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: float const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I32GATHER_PS[A[_], U:Integral](base_addr: Exp[A[Float]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using "mask" (elements are copied from "src"
   * when the highest bit is not set in the corresponding element). "scale" should
   * be 1, 2, 4 or 8.
   * src: __m256i, base_addr: __int64 const*, vindex: __m256i, mask: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64GATHER_EPI64[A[_], U:Integral](src: Exp[__m256i], base_addr: Exp[A[Long]], vindex: Exp[__m256i], mask: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SRAV_EPI32(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKHI_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MULHI_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the control in "imm8", and store the results in "dst".
   * a: __m256d, imm8: const int
   */
  case class MM256_PERMUTE4X64_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ADD_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKHI_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: float const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I64GATHER_PS[A[_], U:Integral](base_addr: Exp[A[Float]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MULHI_EPU16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_SRAI_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Vertically multiply each unsigned 8-bit integer from "a" with the
   * corresponding signed 8-bit integer from "b", producing intermediate signed
   * 16-bit integers. Horizontally add adjacent pairs of intermediate signed 16-bit
   * integers, and pack the saturated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MADDUBS_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUBS_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of 32-bit integers in "a" and "b", and pack
   * the signed 32-bit results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_HADD_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MULLO_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUB_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_SRAI_EPI16(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPU32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_AVG_EPU8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MIN_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of integer data) from "b"
   * into "dst" at the location specified by "imm8".
   * a: __m256i, b: __m128i, imm8: const int
   */
  case class MM256_INSERTI128_SI256(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using "mask" (elements are
   * zeroed out when the highest bit is not set in the corresponding element).
   * mem_addr: __int64 const*, mask: __m256i, mem_addrOffset: int
   */
  case class MM256_MASKLOAD_EPI64[A[_], U:Integral](mem_addr: Exp[A[Long]], mask: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 64-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * base_addr: int const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I64GATHER_EPI32[A[_], U:Integral](base_addr: Exp[A[Int]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKLO_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM_BROADCASTW_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of integer data) from "a", selected with "imm8",
   * and store the result in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_EXTRACTI128_SI256(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ADD_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift 128-bit lanes in "a" right by "imm8" bytes while shifting in zeros, and
   * store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_SRLI_SI256(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 32-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using "mask" (elements are copied from "src"
   * when the highest bit is not set in the corresponding element). "scale" should
   * be 1, 2, 4 or 8.
   * src: __m256i, base_addr: __int64 const*, vindex: __m128i, mask: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32GATHER_EPI64[A[_], U:Integral](src: Exp[__m256i], base_addr: Exp[A[Long]], vindex: Exp[__m128i], mask: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPI8_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SLLV_EPI32(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: float const*, vindex: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I64GATHER_PS[A[_], U:Integral](base_addr: Exp[A[Float]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: double const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I32GATHER_PD[A[_], U:Integral](base_addr: Exp[A[Double]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of 16-bit integers in "a" and "b", and
   * pack the signed 16-bit results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_HSUB_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 32-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * base_addr: int const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I32GATHER_EPI32[A[_], U:Integral](base_addr: Exp[A[Int]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MIN_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ADD_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_SHUFFLELO_EPI16(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MUL_EPU32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m256i
   */
  case class MM256_ABS_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRLV_EPI64(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of 16-bit integers in "a" and "b" using
   * saturation, and pack the signed 16-bit results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_HSUBS_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 128 bits of integer data from "a" to all 128-bit lanes in "dst".
   * a: __m128i
   */
  case class MM256_BROADCASTSI128_SI256(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 16-bit integers from "a" and "b" using control mask "imm8", and
   * store the results in "dst".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_BLEND_EPI16(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, count: __m128i
   */
  case class MM256_SLL_EPI32(a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 8-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m256i
   */
  case class MM256_ABS_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKLO_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 32-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using "mask" (elements are copied from "src"
   * when the highest bit is not set in the corresponding element). "scale" should
   * be 1, 2, 4 or 8.
   * src: __m128i, base_addr: __int64 const*, vindex: __m128i, mask: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32GATHER_EPI64[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Long]], vindex: Exp[__m128i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPI16_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPU32_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m256i
   */
  case class MM256_ABS_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPI16_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 32-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using "mask" (elements are copied from "src"
   * when the highest bit is not set in the corresponding element). "scale" should
   * be 1, 2, 4 or 8.
   * src: __m128i, base_addr: int const*, vindex: __m128i, mask: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32GATHER_EPI32[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Int]], vindex: Exp[__m128i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MIN_EPU32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift 128-bit lanes in "a" left by "imm8" bytes while shifting in zeros, and
   * store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_SLLI_SI256(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MULHRS_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using "mask" (elements are copied from "src" when the highest bit is not set
   * in the corresponding element). "scale" should be 1, 2, 4 or 8.
   * src: __m256d, base_addr: double const*, vindex: __m128i, mask: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32GATHER_PD[A[_], U:Integral](src: Exp[__m256d], base_addr: Exp[A[Double]], vindex: Exp[__m128i], mask: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m256i, count: __m128i
   */
  case class MM256_SRA_EPI32(a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: double const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM256_I32GATHER_PD[A[_], U:Integral](base_addr: Exp[A[Double]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ADDS_EPU8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * base_addr: __int64 const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I64GATHER_EPI64[A[_], U:Integral](base_addr: Exp[A[Long]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 8 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPI8_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM_BROADCASTQ_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, count: __m128i
   */
  case class MM256_SRL_EPI32(a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using "mask" (elements are
   * zeroed out when the highest bit is not set in the corresponding element).
   * mem_addr: int const*, mask: __m256i, mem_addrOffset: int
   */
  case class MM256_MASKLOAD_EPI32[A[_], U:Integral](mem_addr: Exp[A[Int]], mask: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 64-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * base_addr: int const*, vindex: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I64GATHER_EPI32[A[_], U:Integral](base_addr: Exp[A[Int]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 32-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * base_addr: __int64 const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM256_I32GATHER_EPI64[A[_], U:Integral](base_addr: Exp[A[Long]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of 256 bits (representing integer data) in "a" and
   * "b", and store the result in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_XOR_SI256(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_PACKUS_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM256_BROADCASTQ_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Create mask from the most significant bit of each 8-bit element in "a", and
   * store the result in "dst".
   * a: __m256i
   */
  case class MM256_MOVEMASK_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 32-bit integers from "a" into memory using "mask" (elements are
   * not stored when the highest bit is not set in the corresponding element).
   * mem_addr: int*, mask: __m256i, a: __m256i, mem_addrOffset: int
   */
  case class MM256_MASKSTORE_EPI32[A[_], U:Integral](mem_addr: Exp[A[Int]], mask: Exp[__m256i], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: float const*, vindex: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I32GATHER_PS[A[_], U:Integral](base_addr: Exp[A[Float]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, count: __m128i
   */
  case class MM256_SLL_EPI16(a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst".
   * a: __m256i, b: __m256i, count: const int
   */
  case class MM256_ALIGNR_EPI8(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 64-bit integers in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ADD_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, count: __m128i
   */
  case class MM256_SLL_EPI64(a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_SLLI_EPI16(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ADDS_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUBS_EPU16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of 256 bits (representing integer data) in "a" and "b",
   * and store the result in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_OR_SI256(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_SRLI_EPI64(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MIN_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM_BROADCASTD_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, count: __m128i
   */
  case class MM256_SRL_EPI64(a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 256 bits (representing integer data) in "a" and
   * "b", and store the result in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_AND_SI256(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPI8_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed signed 16-bit integers in "a" and "b", producing intermediate
   * signed 32-bit integers. Horizontally add adjacent pairs of intermediate 32-bit
   * integers, and pack the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MADD_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of 16-bit integers in "a" and "b", and pack
   * the signed 16-bit results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_HADD_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 256 bits (representing integer data) in "a" and
   * then AND with "b", and store the result in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ANDNOT_SI256(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 32-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using "mask" (elements are copied from "src"
   * when the highest bit is not set in the corresponding element). "scale" should
   * be 1, 2, 4 or 8.
   * src: __m256i, base_addr: int const*, vindex: __m256i, mask: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32GATHER_EPI32[A[_], U:Integral](src: Exp[__m256i], base_addr: Exp[A[Int]], vindex: Exp[__m256i], mask: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: double const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I64GATHER_PD[A[_], U:Integral](base_addr: Exp[A[Double]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ADDS_EPU16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 8-bit integers from "a" and "b" using "mask", and store the
   * results in "dst".
   * a: __m256i, b: __m256i, mask: __m256i
   */
  case class MM256_BLENDV_EPI8(a: Exp[__m256i], b: Exp[__m256i], mask: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" within 128-bit lanes according to shuffle
   * control mask in the corresponding 8-bit element of "b", and store the results
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SHUFFLE_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUB_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPU16_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Negate packed 8-bit integers in "a" when the corresponding signed 8-bit
   * integer in "b" is negative, and store the results in "dst". Element in "dst"
   * are zeroed out when the corresponding element in "b" is zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_SIGN_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the control in "imm8", and
   * store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_PERMUTE4X64_EPI64(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPU8_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MUL_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_PACKS_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx".
   * a: __m256, idx: __m256i
   */
  case class MM256_PERMUTEVAR8X32_PS(a: Exp[__m256], idx: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SLLV_EPI64(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SRLV_EPI64(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRLV_EPI32(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SLLV_EPI64(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUBS_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using signed saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_PACKS_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 32-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * base_addr: __int64 const*, vindex: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I32GATHER_EPI64[A[_], U:Integral](base_addr: Exp[A[Long]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 32-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPI32_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_SRLI_EPI16(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUB_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using "mask" (elements are copied from "src" when the highest bit is not set
   * in the corresponding element). "scale" should be 1, 2, 4 or 8.
   * src: __m128d, base_addr: double const*, vindex: __m128i, mask: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32GATHER_PD[A[_], U:Integral](src: Exp[__m128d], base_addr: Exp[A[Double]], vindex: Exp[__m128i], mask: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 64-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using "mask" (elements are copied from "src"
   * when the highest bit is not set in the corresponding element). "scale" should
   * be 1, 2, 4 or 8.
   * src: __m128i, base_addr: int const*, vindex: __m256i, mask: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64GATHER_EPI32[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Int]], vindex: Exp[__m256i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst".
   * 	Eight SADs are performed for each 128-bit lane using one quadruplet
   * from "b" and eight quadruplets from "a". One quadruplet is selected from "b"
   * starting at on the offset specified in "imm8". Eight quadruplets are formed
   * from sequential 8-bit integers selected from "a" starting at the offset
   * specified in "imm8".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MPSADBW_EPU8(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst".
   * a: __m128
   */
  case class MM256_BROADCASTSS_PS(a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM_BROADCASTB_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ADDS_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SLLV_EPI32(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKLO_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m256i, count: __m128i
   */
  case class MM256_SRA_EPI16(a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_AVG_EPU16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using unsigned saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_PACKUS_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUB_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, count: __m128i
   */
  case class MM256_SRL_EPI16(a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using "mask" (elements are copied from "src"
   * when the highest bit is not set in the corresponding element). "scale" should
   * be 1, 2, 4 or 8.
   * src: __m128i, base_addr: __int64 const*, vindex: __m128i, mask: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64GATHER_EPI64[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Long]], vindex: Exp[__m128i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM256_BROADCASTW_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 64-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using "mask" (elements are copied from "src"
   * when the highest bit is not set in the corresponding element). "scale" should
   * be 1, 2, 4 or 8.
   * src: __m128i, base_addr: int const*, vindex: __m128i, mask: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64GATHER_EPI32[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Int]], vindex: Exp[__m128i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using "mask" (elements are copied from "src" when the highest bit is not set
   * in the corresponding element). "scale" should be 1, 2, 4 or 8.
   * src: __m128, base_addr: float const*, vindex: __m128i, mask: __m128, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32GATHER_PS[A[_], U:Integral](src: Exp[__m128], base_addr: Exp[A[Float]], vindex: Exp[__m128i], mask: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst".
   * a: __m128
   */
  case class MM_BROADCASTSS_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: double const*, vindex: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I64GATHER_PD[A[_], U:Integral](base_addr: Exp[A[Double]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 32-bit integers from "a" into memory using "mask" (elements are
   * not stored when the highest bit is not set in the corresponding element).
   * mem_addr: int*, mask: __m128i, a: __m128i, mem_addrOffset: int
   */
  case class MM_MASKSTORE_EPI32[A[_], U:Integral](mem_addr: Exp[A[Int]], mask: Exp[__m128i], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MIN_EPU16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRAV_EPI32(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low double-precision (64-bit) floating-point element from "a" to
   * all elements of "dst".
   * a: __m128d
   */
  case class MM256_BROADCASTSD_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using "mask" (elements are copied from "src" when the highest bit is not set
   * in the corresponding element). "scale" should be 1, 2, 4 or 8.
   * src: __m128, base_addr: float const*, vindex: __m128i, mask: __m128, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64GATHER_PS[A[_], U:Integral](src: Exp[__m128], base_addr: Exp[A[Float]], vindex: Exp[__m128i], mask: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_SLLI_EPI64(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of integer data) selected by "imm8" from "a" and
   * "b", and store the results in "dst".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_PERMUTE2X128_SI256(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 128 bits of integer data from "a" to all 128-bit lanes in "dst".
   * a: __m128i
   */
  case class MM_BROADCASTSI128_SI256(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using "mask" (elements are copied from "src" when the highest bit is not set
   * in the corresponding element). "scale" should be 1, 2, 4 or 8.
   * src: __m256, base_addr: float const*, vindex: __m256i, mask: __m256, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32GATHER_PS[A[_], U:Integral](src: Exp[__m256], base_addr: Exp[A[Float]], vindex: Exp[__m256i], mask: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPU16_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SRLV_EPI32(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 32-bit integers from "a" and "b" using control mask "imm8", and
   * store the results in "dst".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_BLEND_EPI32(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_permutevar8x32_epi32(a: Exp[__m256i], idx: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEVAR8X32_EPI32(a, idx)
  }
            
  def _mm_maskstore_epi64[A[_], U:Integral](mem_addr: Exp[A[Long]], mask: Exp[__m128i], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASKSTORE_EPI64(mem_addr, mask, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_unpackhi_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKHI_EPI16(a, b)
  }
            
  def _mm256_min_epu8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MIN_EPU8(a, b)
  }
            
  def _mm_maskload_epi64[A[_], U:Integral](mem_addr: Exp[A[Long]], mask: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKLOAD_EPI64(mem_addr, mask, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_maskload_epi32[A[_], U:Integral](mem_addr: Exp[A[Int]], mask: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKLOAD_EPI32(mem_addr, mask, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_sad_epu8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SAD_EPU8(a, b)
  }
            
  def _mm256_shufflehi_epi16(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SHUFFLEHI_EPI16(a, imm8)
  }
            
  def _mm256_max_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPU16(a, b)
  }
            
  def _mm256_hadds_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_HADDS_EPI16(a, b)
  }
            
  def _mm256_hsub_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_HSUB_EPI32(a, b)
  }
            
  def _mm256_shuffle_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SHUFFLE_EPI32(a, imm8)
  }
            
  def _mm256_stream_load_si256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_STREAM_LOAD_SI256(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_broadcastsd_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_BROADCASTSD_PD(a)
  }
            
  def _mm256_cvtepu8_epi16(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPU8_EPI16(a)
  }
            
  def _mm256_cvtepu8_epi64(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPU8_EPI64(a)
  }
            
  def _mm256_mullo_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MULLO_EPI32(a, b)
  }
            
  def _mm256_mask_i64gather_ps[A[_], U:Integral](src: Exp[__m128], base_addr: Exp[A[Float]], vindex: Exp[__m256i], mask: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM256_MASK_I64GATHER_PS(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_unpackhi_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKHI_EPI64(a, b)
  }
            
  def _mm256_sign_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SIGN_EPI16(a, b)
  }
            
  def _mm256_max_epu8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPU8(a, b)
  }
            
  def _mm_i32gather_ps[A[_], U:Integral](base_addr: Exp[A[Float]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM_I32GATHER_PS(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_cmpgt_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_CMPGT_EPI64(a, b)
  }
            
  def _mm256_mask_i64gather_epi64[A[_], U:Integral](src: Exp[__m256i], base_addr: Exp[A[Long]], vindex: Exp[__m256i], mask: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_MASK_I64GATHER_EPI64(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_srav_epi32(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SRAV_EPI32(a, count)
  }
            
  def _mm256_unpackhi_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKHI_EPI32(a, b)
  }
            
  def _mm256_mulhi_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MULHI_EPI16(a, b)
  }
            
  def _mm256_cmpgt_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_CMPGT_EPI16(a, b)
  }
            
  def _mm256_permute4x64_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_PERMUTE4X64_PD(a, imm8)
  }
            
  def _mm256_add_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ADD_EPI8(a, b)
  }
            
  def _mm256_unpackhi_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKHI_EPI8(a, b)
  }
            
  def _mm_i64gather_ps[A[_], U:Integral](base_addr: Exp[A[Float]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM_I64GATHER_PS(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_mulhi_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MULHI_EPU16(a, b)
  }
            
  def _mm256_max_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPI32(a, b)
  }
            
  def _mm256_srai_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SRAI_EPI32(a, imm8)
  }
            
  def _mm256_maddubs_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MADDUBS_EPI16(a, b)
  }
            
  def _mm256_subs_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUBS_EPI16(a, b)
  }
            
  def _mm256_hadd_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_HADD_EPI32(a, b)
  }
            
  def _mm256_mullo_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MULLO_EPI16(a, b)
  }
            
  def _mm256_sub_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUB_EPI32(a, b)
  }
            
  def _mm256_srai_epi16(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SRAI_EPI16(a, imm8)
  }
            
  def _mm256_max_epu32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPU32(a, b)
  }
            
  def _mm256_avg_epu8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_AVG_EPU8(a, b)
  }
            
  def _mm256_min_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MIN_EPI8(a, b)
  }
            
  def _mm256_inserti128_si256(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_INSERTI128_SI256(a, b, imm8)
  }
            
  def _mm256_maskload_epi64[A[_], U:Integral](mem_addr: Exp[A[Long]], mask: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKLOAD_EPI64(mem_addr, mask, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_i64gather_epi32[A[_], U:Integral](base_addr: Exp[A[Int]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_I64GATHER_EPI32(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_unpacklo_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKLO_EPI32(a, b)
  }
            
  def _mm_broadcastw_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_BROADCASTW_EPI16(a)
  }
            
  def _mm256_extracti128_si256(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_EXTRACTI128_SI256(a, imm8)
  }
            
  def _mm256_add_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ADD_EPI32(a, b)
  }
            
  def _mm256_srli_si256(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SRLI_SI256(a, imm8)
  }
            
  def _mm256_mask_i32gather_epi64[A[_], U:Integral](src: Exp[__m256i], base_addr: Exp[A[Long]], vindex: Exp[__m128i], mask: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_MASK_I32GATHER_EPI64(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_cvtepi8_epi32(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPI8_EPI32(a)
  }
            
  def _mm_sllv_epi32(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SLLV_EPI32(a, count)
  }
            
  def _mm256_i64gather_ps[A[_], U:Integral](base_addr: Exp[A[Float]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM256_I64GATHER_PS(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_i32gather_pd[A[_], U:Integral](base_addr: Exp[A[Double]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(base_addr)(MM_I32GATHER_PD(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_hsub_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_HSUB_EPI16(a, b)
  }
            
  def _mm_i32gather_epi32[A[_], U:Integral](base_addr: Exp[A[Int]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_I32GATHER_EPI32(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_min_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MIN_EPI32(a, b)
  }
            
  def _mm256_add_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ADD_EPI16(a, b)
  }
            
  def _mm256_shufflelo_epi16(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SHUFFLELO_EPI16(a, imm8)
  }
            
  def _mm256_mul_epu32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MUL_EPU32(a, b)
  }
            
  def _mm256_abs_epi16(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_ABS_EPI16(a)
  }
            
  def _mm_srlv_epi64(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRLV_EPI64(a, count)
  }
            
  def _mm256_hsubs_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_HSUBS_EPI16(a, b)
  }
            
  def _mm256_broadcastsi128_si256(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_BROADCASTSI128_SI256(a)
  }
            
  def _mm256_blend_epi16(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_BLEND_EPI16(a, b, imm8)
  }
            
  def _mm256_sll_epi32(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SLL_EPI32(a, count)
  }
            
  def _mm256_abs_epi8(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_ABS_EPI8(a)
  }
            
  def _mm256_cmpeq_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_CMPEQ_EPI16(a, b)
  }
            
  def _mm256_unpacklo_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKLO_EPI64(a, b)
  }
            
  def _mm_mask_i32gather_epi64[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Long]], vindex: Exp[__m128i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MASK_I32GATHER_EPI64(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_cvtepi16_epi64(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPI16_EPI64(a)
  }
            
  def _mm256_cvtepu32_epi64(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPU32_EPI64(a)
  }
            
  def _mm256_abs_epi32(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_ABS_EPI32(a)
  }
            
  def _mm256_cvtepi16_epi32(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPI16_EPI32(a)
  }
            
  def _mm_mask_i32gather_epi32[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Int]], vindex: Exp[__m128i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MASK_I32GATHER_EPI32(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_min_epu32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MIN_EPU32(a, b)
  }
            
  def _mm256_slli_si256(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SLLI_SI256(a, imm8)
  }
            
  def _mm256_mulhrs_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MULHRS_EPI16(a, b)
  }
            
  def _mm256_mask_i32gather_pd[A[_], U:Integral](src: Exp[__m256d], base_addr: Exp[A[Double]], vindex: Exp[__m128i], mask: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(base_addr)(MM256_MASK_I32GATHER_PD(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_sra_epi32(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SRA_EPI32(a, count)
  }
            
  def _mm256_i32gather_pd[A[_], U:Integral](base_addr: Exp[A[Double]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(base_addr)(MM256_I32GATHER_PD(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_adds_epu8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ADDS_EPU8(a, b)
  }
            
  def _mm_i64gather_epi64[A[_], U:Integral](base_addr: Exp[A[Long]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_I64GATHER_EPI64(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_cvtepi8_epi64(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPI8_EPI64(a)
  }
            
  def _mm_broadcastq_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_BROADCASTQ_EPI64(a)
  }
            
  def _mm256_srl_epi32(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SRL_EPI32(a, count)
  }
            
  def _mm256_maskload_epi32[A[_], U:Integral](mem_addr: Exp[A[Int]], mask: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKLOAD_EPI32(mem_addr, mask, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_i64gather_epi32[A[_], U:Integral](base_addr: Exp[A[Int]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM256_I64GATHER_EPI32(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_i32gather_epi64[A[_], U:Integral](base_addr: Exp[A[Long]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_I32GATHER_EPI64(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_xor_si256(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_XOR_SI256(a, b)
  }
            
  def _mm256_packus_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PACKUS_EPI16(a, b)
  }
            
  def _mm256_broadcastq_epi64(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_BROADCASTQ_EPI64(a)
  }
            
  def _mm256_movemask_epi8(a: Exp[__m256i]): Exp[Int] = {
    MM256_MOVEMASK_EPI8(a)
  }
            
  def _mm256_maskstore_epi32[A[_], U:Integral](mem_addr: Exp[A[Int]], mask: Exp[__m256i], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASKSTORE_EPI32(mem_addr, mask, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_i32gather_ps[A[_], U:Integral](base_addr: Exp[A[Float]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(base_addr)(MM256_I32GATHER_PS(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_sll_epi16(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SLL_EPI16(a, count)
  }
            
  def _mm256_alignr_epi8(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_ALIGNR_EPI8(a, b, count)
  }
            
  def _mm256_add_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ADD_EPI64(a, b)
  }
            
  def _mm256_sll_epi64(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SLL_EPI64(a, count)
  }
            
  def _mm256_slli_epi16(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SLLI_EPI16(a, imm8)
  }
            
  def _mm256_adds_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ADDS_EPI8(a, b)
  }
            
  def _mm256_subs_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUBS_EPU16(a, b)
  }
            
  def _mm256_or_si256(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_OR_SI256(a, b)
  }
            
  def _mm256_srli_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SRLI_EPI64(a, imm8)
  }
            
  def _mm256_min_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MIN_EPI16(a, b)
  }
            
  def _mm_broadcastd_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_BROADCASTD_EPI32(a)
  }
            
  def _mm256_srl_epi64(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SRL_EPI64(a, count)
  }
            
  def _mm256_and_si256(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_AND_SI256(a, b)
  }
            
  def _mm256_cmpeq_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_CMPEQ_EPI8(a, b)
  }
            
  def _mm256_cvtepi8_epi16(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPI8_EPI16(a)
  }
            
  def _mm256_cmpeq_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_CMPEQ_EPI32(a, b)
  }
            
  def _mm256_madd_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MADD_EPI16(a, b)
  }
            
  def _mm256_hadd_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_HADD_EPI16(a, b)
  }
            
  def _mm256_andnot_si256(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ANDNOT_SI256(a, b)
  }
            
  def _mm256_mask_i32gather_epi32[A[_], U:Integral](src: Exp[__m256i], base_addr: Exp[A[Int]], vindex: Exp[__m256i], mask: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_MASK_I32GATHER_EPI32(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_i64gather_pd[A[_], U:Integral](base_addr: Exp[A[Double]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(base_addr)(MM_I64GATHER_PD(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_adds_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ADDS_EPU16(a, b)
  }
            
  def _mm256_blendv_epi8(a: Exp[__m256i], b: Exp[__m256i], mask: Exp[__m256i]): Exp[__m256i] = {
    MM256_BLENDV_EPI8(a, b, mask)
  }
            
  def _mm256_shuffle_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SHUFFLE_EPI8(a, b)
  }
            
  def _mm256_max_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPI8(a, b)
  }
            
  def _mm256_sub_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUB_EPI16(a, b)
  }
            
  def _mm256_cvtepu16_epi32(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPU16_EPI32(a)
  }
            
  def _mm256_sign_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SIGN_EPI8(a, b)
  }
            
  def _mm256_permute4x64_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_PERMUTE4X64_EPI64(a, imm8)
  }
            
  def _mm256_cvtepu8_epi32(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPU8_EPI32(a)
  }
            
  def _mm256_mul_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MUL_EPI32(a, b)
  }
            
  def _mm256_packs_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PACKS_EPI16(a, b)
  }
            
  def _mm256_permutevar8x32_ps(a: Exp[__m256], idx: Exp[__m256i]): Exp[__m256] = {
    MM256_PERMUTEVAR8X32_PS(a, idx)
  }
            
  def _mm_sllv_epi64(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SLLV_EPI64(a, count)
  }
            
  def _mm256_srlv_epi64(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SRLV_EPI64(a, count)
  }
            
  def _mm_srlv_epi32(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRLV_EPI32(a, count)
  }
            
  def _mm256_sllv_epi64(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SLLV_EPI64(a, count)
  }
            
  def _mm256_subs_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUBS_EPI8(a, b)
  }
            
  def _mm256_packs_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PACKS_EPI32(a, b)
  }
            
  def _mm_i32gather_epi64[A[_], U:Integral](base_addr: Exp[A[Long]], vindex: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_I32GATHER_EPI64(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_cvtepi32_epi64(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPI32_EPI64(a)
  }
            
  def _mm256_srli_epi16(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SRLI_EPI16(a, imm8)
  }
            
  def _mm256_sub_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUB_EPI8(a, b)
  }
            
  def _mm_mask_i32gather_pd[A[_], U:Integral](src: Exp[__m128d], base_addr: Exp[A[Double]], vindex: Exp[__m128i], mask: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(base_addr)(MM_MASK_I32GATHER_PD(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_i64gather_epi32[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Int]], vindex: Exp[__m256i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM256_MASK_I64GATHER_EPI32(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_mpsadbw_epu8(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MPSADBW_EPU8(a, b, imm8)
  }
            
  def _mm256_broadcastss_ps(a: Exp[__m128]): Exp[__m256] = {
    MM256_BROADCASTSS_PS(a)
  }
            
  def _mm_broadcastb_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_BROADCASTB_EPI8(a)
  }
            
  def _mm256_adds_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ADDS_EPI16(a, b)
  }
            
  def _mm256_sllv_epi32(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SLLV_EPI32(a, count)
  }
            
  def _mm256_unpacklo_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKLO_EPI8(a, b)
  }
            
  def _mm256_sra_epi16(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SRA_EPI16(a, count)
  }
            
  def _mm256_avg_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_AVG_EPU16(a, b)
  }
            
  def _mm256_packus_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PACKUS_EPI32(a, b)
  }
            
  def _mm256_sub_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUB_EPI64(a, b)
  }
            
  def _mm256_srl_epi16(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SRL_EPI16(a, count)
  }
            
  def _mm_mask_i64gather_epi64[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Long]], vindex: Exp[__m128i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MASK_I64GATHER_EPI64(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_broadcastw_epi16(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_BROADCASTW_EPI16(a)
  }
            
  def _mm_mask_i64gather_epi32[A[_], U:Integral](src: Exp[__m128i], base_addr: Exp[A[Int]], vindex: Exp[__m128i], mask: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MASK_I64GATHER_EPI32(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i32gather_ps[A[_], U:Integral](src: Exp[__m128], base_addr: Exp[A[Float]], vindex: Exp[__m128i], mask: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM_MASK_I32GATHER_PS(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_broadcastss_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_BROADCASTSS_PS(a)
  }
            
  def _mm256_i64gather_pd[A[_], U:Integral](base_addr: Exp[A[Double]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(base_addr)(MM256_I64GATHER_PD(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_maskstore_epi32[A[_], U:Integral](mem_addr: Exp[A[Int]], mask: Exp[__m128i], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASKSTORE_EPI32(mem_addr, mask, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_min_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MIN_EPU16(a, b)
  }
            
  def _mm_srav_epi32(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRAV_EPI32(a, count)
  }
            
  def _mm256_broadcastsd_pd(a: Exp[__m128d]): Exp[__m256d] = {
    MM256_BROADCASTSD_PD(a)
  }
            
  def _mm_mask_i64gather_ps[A[_], U:Integral](src: Exp[__m128], base_addr: Exp[A[Float]], vindex: Exp[__m128i], mask: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM_MASK_I64GATHER_PS(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_slli_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SLLI_EPI64(a, imm8)
  }
            
  def _mm256_permute2x128_si256(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_PERMUTE2X128_SI256(a, b, imm8)
  }
            
  def _mm256_max_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPI16(a, b)
  }
            
  def _mm_broadcastsi128_si256(a: Exp[__m128i]): Exp[__m256i] = {
    MM_BROADCASTSI128_SI256(a)
  }
            
  def _mm256_mask_i32gather_ps[A[_], U:Integral](src: Exp[__m256], base_addr: Exp[A[Float]], vindex: Exp[__m256i], mask: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(base_addr)(MM256_MASK_I32GATHER_PS(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_cvtepu16_epi64(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CVTEPU16_EPI64(a)
  }
            
  def _mm256_srlv_epi32(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SRLV_EPI32(a, count)
  }
            
  def _mm256_cmpgt_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_CMPGT_EPI32(a, b)
  }
            
  def _mm_blend_epi32(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_BLEND_EPI32(a, b, imm8)
  }
            
  def _mm256_cmpgt_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_CMPGT_EPI8(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_PERMUTEVAR8X32_EPI32 (a, idx) =>
      _mm256_permutevar8x32_epi32(f(a), f(idx))
    case iDef@MM_MASKSTORE_EPI64 (mem_addr, mask, a, mem_addrOffset) =>
      _mm_maskstore_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_UNPACKHI_EPI16 (a, b) =>
      _mm256_unpackhi_epi16(f(a), f(b))
    case MM256_MIN_EPU8 (a, b) =>
      _mm256_min_epu8(f(a), f(b))
    case iDef@MM_MASKLOAD_EPI64 (mem_addr, mask, mem_addrOffset) =>
      _mm_maskload_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_MASKLOAD_EPI32 (mem_addr, mask, mem_addrOffset) =>
      _mm_maskload_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SAD_EPU8 (a, b) =>
      _mm256_sad_epu8(f(a), f(b))
    case MM256_SHUFFLEHI_EPI16 (a, imm8) =>
      _mm256_shufflehi_epi16(f(a), f(imm8))
    case MM256_MAX_EPU16 (a, b) =>
      _mm256_max_epu16(f(a), f(b))
    case MM256_HADDS_EPI16 (a, b) =>
      _mm256_hadds_epi16(f(a), f(b))
    case MM256_HSUB_EPI32 (a, b) =>
      _mm256_hsub_epi32(f(a), f(b))
    case MM256_SHUFFLE_EPI32 (a, imm8) =>
      _mm256_shuffle_epi32(f(a), f(imm8))
    case iDef@MM256_STREAM_LOAD_SI256 (mem_addr, mem_addrOffset) =>
      _mm256_stream_load_si256(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_BROADCASTSD_PD (a) =>
      _mm_broadcastsd_pd(f(a))
    case MM256_CVTEPU8_EPI16 (a) =>
      _mm256_cvtepu8_epi16(f(a))
    case MM256_CVTEPU8_EPI64 (a) =>
      _mm256_cvtepu8_epi64(f(a))
    case MM256_MULLO_EPI32 (a, b) =>
      _mm256_mullo_epi32(f(a), f(b))
    case iDef@MM256_MASK_I64GATHER_PS (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm256_mask_i64gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_UNPACKHI_EPI64 (a, b) =>
      _mm256_unpackhi_epi64(f(a), f(b))
    case MM256_SIGN_EPI16 (a, b) =>
      _mm256_sign_epi16(f(a), f(b))
    case MM256_MAX_EPU8 (a, b) =>
      _mm256_max_epu8(f(a), f(b))
    case iDef@MM_I32GATHER_PS (base_addr, vindex, scale, base_addrOffset) =>
      _mm_i32gather_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CMPGT_EPI64 (a, b) =>
      _mm256_cmpgt_epi64(f(a), f(b))
    case iDef@MM256_MASK_I64GATHER_EPI64 (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm256_mask_i64gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SRAV_EPI32 (a, count) =>
      _mm256_srav_epi32(f(a), f(count))
    case MM256_UNPACKHI_EPI32 (a, b) =>
      _mm256_unpackhi_epi32(f(a), f(b))
    case MM256_MULHI_EPI16 (a, b) =>
      _mm256_mulhi_epi16(f(a), f(b))
    case MM256_CMPGT_EPI16 (a, b) =>
      _mm256_cmpgt_epi16(f(a), f(b))
    case MM256_PERMUTE4X64_PD (a, imm8) =>
      _mm256_permute4x64_pd(f(a), f(imm8))
    case MM256_ADD_EPI8 (a, b) =>
      _mm256_add_epi8(f(a), f(b))
    case MM256_UNPACKHI_EPI8 (a, b) =>
      _mm256_unpackhi_epi8(f(a), f(b))
    case iDef@MM_I64GATHER_PS (base_addr, vindex, scale, base_addrOffset) =>
      _mm_i64gather_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MULHI_EPU16 (a, b) =>
      _mm256_mulhi_epu16(f(a), f(b))
    case MM256_MAX_EPI32 (a, b) =>
      _mm256_max_epi32(f(a), f(b))
    case MM256_SRAI_EPI32 (a, imm8) =>
      _mm256_srai_epi32(f(a), f(imm8))
    case MM256_MADDUBS_EPI16 (a, b) =>
      _mm256_maddubs_epi16(f(a), f(b))
    case MM256_SUBS_EPI16 (a, b) =>
      _mm256_subs_epi16(f(a), f(b))
    case MM256_HADD_EPI32 (a, b) =>
      _mm256_hadd_epi32(f(a), f(b))
    case MM256_MULLO_EPI16 (a, b) =>
      _mm256_mullo_epi16(f(a), f(b))
    case MM256_SUB_EPI32 (a, b) =>
      _mm256_sub_epi32(f(a), f(b))
    case MM256_SRAI_EPI16 (a, imm8) =>
      _mm256_srai_epi16(f(a), f(imm8))
    case MM256_MAX_EPU32 (a, b) =>
      _mm256_max_epu32(f(a), f(b))
    case MM256_AVG_EPU8 (a, b) =>
      _mm256_avg_epu8(f(a), f(b))
    case MM256_MIN_EPI8 (a, b) =>
      _mm256_min_epi8(f(a), f(b))
    case MM256_INSERTI128_SI256 (a, b, imm8) =>
      _mm256_inserti128_si256(f(a), f(b), f(imm8))
    case iDef@MM256_MASKLOAD_EPI64 (mem_addr, mask, mem_addrOffset) =>
      _mm256_maskload_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_I64GATHER_EPI32 (base_addr, vindex, scale, base_addrOffset) =>
      _mm_i64gather_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_UNPACKLO_EPI32 (a, b) =>
      _mm256_unpacklo_epi32(f(a), f(b))
    case MM_BROADCASTW_EPI16 (a) =>
      _mm_broadcastw_epi16(f(a))
    case MM256_EXTRACTI128_SI256 (a, imm8) =>
      _mm256_extracti128_si256(f(a), f(imm8))
    case MM256_ADD_EPI32 (a, b) =>
      _mm256_add_epi32(f(a), f(b))
    case MM256_SRLI_SI256 (a, imm8) =>
      _mm256_srli_si256(f(a), f(imm8))
    case iDef@MM256_MASK_I32GATHER_EPI64 (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm256_mask_i32gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CVTEPI8_EPI32 (a) =>
      _mm256_cvtepi8_epi32(f(a))
    case MM_SLLV_EPI32 (a, count) =>
      _mm_sllv_epi32(f(a), f(count))
    case iDef@MM256_I64GATHER_PS (base_addr, vindex, scale, base_addrOffset) =>
      _mm256_i64gather_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_I32GATHER_PD (base_addr, vindex, scale, base_addrOffset) =>
      _mm_i32gather_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_HSUB_EPI16 (a, b) =>
      _mm256_hsub_epi16(f(a), f(b))
    case iDef@MM_I32GATHER_EPI32 (base_addr, vindex, scale, base_addrOffset) =>
      _mm_i32gather_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MIN_EPI32 (a, b) =>
      _mm256_min_epi32(f(a), f(b))
    case MM256_ADD_EPI16 (a, b) =>
      _mm256_add_epi16(f(a), f(b))
    case MM256_SHUFFLELO_EPI16 (a, imm8) =>
      _mm256_shufflelo_epi16(f(a), f(imm8))
    case MM256_MUL_EPU32 (a, b) =>
      _mm256_mul_epu32(f(a), f(b))
    case MM256_ABS_EPI16 (a) =>
      _mm256_abs_epi16(f(a))
    case MM_SRLV_EPI64 (a, count) =>
      _mm_srlv_epi64(f(a), f(count))
    case MM256_HSUBS_EPI16 (a, b) =>
      _mm256_hsubs_epi16(f(a), f(b))
    case MM256_BROADCASTSI128_SI256 (a) =>
      _mm256_broadcastsi128_si256(f(a))
    case MM256_BLEND_EPI16 (a, b, imm8) =>
      _mm256_blend_epi16(f(a), f(b), f(imm8))
    case MM256_SLL_EPI32 (a, count) =>
      _mm256_sll_epi32(f(a), f(count))
    case MM256_ABS_EPI8 (a) =>
      _mm256_abs_epi8(f(a))
    case MM256_CMPEQ_EPI16 (a, b) =>
      _mm256_cmpeq_epi16(f(a), f(b))
    case MM256_UNPACKLO_EPI64 (a, b) =>
      _mm256_unpacklo_epi64(f(a), f(b))
    case iDef@MM_MASK_I32GATHER_EPI64 (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm_mask_i32gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CVTEPI16_EPI64 (a) =>
      _mm256_cvtepi16_epi64(f(a))
    case MM256_CVTEPU32_EPI64 (a) =>
      _mm256_cvtepu32_epi64(f(a))
    case MM256_ABS_EPI32 (a) =>
      _mm256_abs_epi32(f(a))
    case MM256_CVTEPI16_EPI32 (a) =>
      _mm256_cvtepi16_epi32(f(a))
    case iDef@MM_MASK_I32GATHER_EPI32 (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm_mask_i32gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MIN_EPU32 (a, b) =>
      _mm256_min_epu32(f(a), f(b))
    case MM256_SLLI_SI256 (a, imm8) =>
      _mm256_slli_si256(f(a), f(imm8))
    case MM256_MULHRS_EPI16 (a, b) =>
      _mm256_mulhrs_epi16(f(a), f(b))
    case iDef@MM256_MASK_I32GATHER_PD (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm256_mask_i32gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SRA_EPI32 (a, count) =>
      _mm256_sra_epi32(f(a), f(count))
    case iDef@MM256_I32GATHER_PD (base_addr, vindex, scale, base_addrOffset) =>
      _mm256_i32gather_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_ADDS_EPU8 (a, b) =>
      _mm256_adds_epu8(f(a), f(b))
    case iDef@MM_I64GATHER_EPI64 (base_addr, vindex, scale, base_addrOffset) =>
      _mm_i64gather_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CVTEPI8_EPI64 (a) =>
      _mm256_cvtepi8_epi64(f(a))
    case MM_BROADCASTQ_EPI64 (a) =>
      _mm_broadcastq_epi64(f(a))
    case MM256_SRL_EPI32 (a, count) =>
      _mm256_srl_epi32(f(a), f(count))
    case iDef@MM256_MASKLOAD_EPI32 (mem_addr, mask, mem_addrOffset) =>
      _mm256_maskload_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_I64GATHER_EPI32 (base_addr, vindex, scale, base_addrOffset) =>
      _mm256_i64gather_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_I32GATHER_EPI64 (base_addr, vindex, scale, base_addrOffset) =>
      _mm256_i32gather_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_XOR_SI256 (a, b) =>
      _mm256_xor_si256(f(a), f(b))
    case MM256_PACKUS_EPI16 (a, b) =>
      _mm256_packus_epi16(f(a), f(b))
    case MM256_BROADCASTQ_EPI64 (a) =>
      _mm256_broadcastq_epi64(f(a))
    case MM256_MOVEMASK_EPI8 (a) =>
      _mm256_movemask_epi8(f(a))
    case iDef@MM256_MASKSTORE_EPI32 (mem_addr, mask, a, mem_addrOffset) =>
      _mm256_maskstore_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_I32GATHER_PS (base_addr, vindex, scale, base_addrOffset) =>
      _mm256_i32gather_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SLL_EPI16 (a, count) =>
      _mm256_sll_epi16(f(a), f(count))
    case MM256_ALIGNR_EPI8 (a, b, count) =>
      _mm256_alignr_epi8(f(a), f(b), f(count))
    case MM256_ADD_EPI64 (a, b) =>
      _mm256_add_epi64(f(a), f(b))
    case MM256_SLL_EPI64 (a, count) =>
      _mm256_sll_epi64(f(a), f(count))
    case MM256_SLLI_EPI16 (a, imm8) =>
      _mm256_slli_epi16(f(a), f(imm8))
    case MM256_ADDS_EPI8 (a, b) =>
      _mm256_adds_epi8(f(a), f(b))
    case MM256_SUBS_EPU16 (a, b) =>
      _mm256_subs_epu16(f(a), f(b))
    case MM256_OR_SI256 (a, b) =>
      _mm256_or_si256(f(a), f(b))
    case MM256_SRLI_EPI64 (a, imm8) =>
      _mm256_srli_epi64(f(a), f(imm8))
    case MM256_MIN_EPI16 (a, b) =>
      _mm256_min_epi16(f(a), f(b))
    case MM_BROADCASTD_EPI32 (a) =>
      _mm_broadcastd_epi32(f(a))
    case MM256_SRL_EPI64 (a, count) =>
      _mm256_srl_epi64(f(a), f(count))
    case MM256_AND_SI256 (a, b) =>
      _mm256_and_si256(f(a), f(b))
    case MM256_CMPEQ_EPI8 (a, b) =>
      _mm256_cmpeq_epi8(f(a), f(b))
    case MM256_CVTEPI8_EPI16 (a) =>
      _mm256_cvtepi8_epi16(f(a))
    case MM256_CMPEQ_EPI32 (a, b) =>
      _mm256_cmpeq_epi32(f(a), f(b))
    case MM256_MADD_EPI16 (a, b) =>
      _mm256_madd_epi16(f(a), f(b))
    case MM256_HADD_EPI16 (a, b) =>
      _mm256_hadd_epi16(f(a), f(b))
    case MM256_ANDNOT_SI256 (a, b) =>
      _mm256_andnot_si256(f(a), f(b))
    case iDef@MM256_MASK_I32GATHER_EPI32 (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm256_mask_i32gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_I64GATHER_PD (base_addr, vindex, scale, base_addrOffset) =>
      _mm_i64gather_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_ADDS_EPU16 (a, b) =>
      _mm256_adds_epu16(f(a), f(b))
    case MM256_BLENDV_EPI8 (a, b, mask) =>
      _mm256_blendv_epi8(f(a), f(b), f(mask))
    case MM256_SHUFFLE_EPI8 (a, b) =>
      _mm256_shuffle_epi8(f(a), f(b))
    case MM256_MAX_EPI8 (a, b) =>
      _mm256_max_epi8(f(a), f(b))
    case MM256_SUB_EPI16 (a, b) =>
      _mm256_sub_epi16(f(a), f(b))
    case MM256_CVTEPU16_EPI32 (a) =>
      _mm256_cvtepu16_epi32(f(a))
    case MM256_SIGN_EPI8 (a, b) =>
      _mm256_sign_epi8(f(a), f(b))
    case MM256_PERMUTE4X64_EPI64 (a, imm8) =>
      _mm256_permute4x64_epi64(f(a), f(imm8))
    case MM256_CVTEPU8_EPI32 (a) =>
      _mm256_cvtepu8_epi32(f(a))
    case MM256_MUL_EPI32 (a, b) =>
      _mm256_mul_epi32(f(a), f(b))
    case MM256_PACKS_EPI16 (a, b) =>
      _mm256_packs_epi16(f(a), f(b))
    case MM256_PERMUTEVAR8X32_PS (a, idx) =>
      _mm256_permutevar8x32_ps(f(a), f(idx))
    case MM_SLLV_EPI64 (a, count) =>
      _mm_sllv_epi64(f(a), f(count))
    case MM256_SRLV_EPI64 (a, count) =>
      _mm256_srlv_epi64(f(a), f(count))
    case MM_SRLV_EPI32 (a, count) =>
      _mm_srlv_epi32(f(a), f(count))
    case MM256_SLLV_EPI64 (a, count) =>
      _mm256_sllv_epi64(f(a), f(count))
    case MM256_SUBS_EPI8 (a, b) =>
      _mm256_subs_epi8(f(a), f(b))
    case MM256_PACKS_EPI32 (a, b) =>
      _mm256_packs_epi32(f(a), f(b))
    case iDef@MM_I32GATHER_EPI64 (base_addr, vindex, scale, base_addrOffset) =>
      _mm_i32gather_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CVTEPI32_EPI64 (a) =>
      _mm256_cvtepi32_epi64(f(a))
    case MM256_SRLI_EPI16 (a, imm8) =>
      _mm256_srli_epi16(f(a), f(imm8))
    case MM256_SUB_EPI8 (a, b) =>
      _mm256_sub_epi8(f(a), f(b))
    case iDef@MM_MASK_I32GATHER_PD (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm_mask_i32gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_I64GATHER_EPI32 (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm256_mask_i64gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MPSADBW_EPU8 (a, b, imm8) =>
      _mm256_mpsadbw_epu8(f(a), f(b), f(imm8))
    case MM256_BROADCASTSS_PS (a) =>
      _mm256_broadcastss_ps(f(a))
    case MM_BROADCASTB_EPI8 (a) =>
      _mm_broadcastb_epi8(f(a))
    case MM256_ADDS_EPI16 (a, b) =>
      _mm256_adds_epi16(f(a), f(b))
    case MM256_SLLV_EPI32 (a, count) =>
      _mm256_sllv_epi32(f(a), f(count))
    case MM256_UNPACKLO_EPI8 (a, b) =>
      _mm256_unpacklo_epi8(f(a), f(b))
    case MM256_SRA_EPI16 (a, count) =>
      _mm256_sra_epi16(f(a), f(count))
    case MM256_AVG_EPU16 (a, b) =>
      _mm256_avg_epu16(f(a), f(b))
    case MM256_PACKUS_EPI32 (a, b) =>
      _mm256_packus_epi32(f(a), f(b))
    case MM256_SUB_EPI64 (a, b) =>
      _mm256_sub_epi64(f(a), f(b))
    case MM256_SRL_EPI16 (a, count) =>
      _mm256_srl_epi16(f(a), f(count))
    case iDef@MM_MASK_I64GATHER_EPI64 (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm_mask_i64gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_BROADCASTW_EPI16 (a) =>
      _mm256_broadcastw_epi16(f(a))
    case iDef@MM_MASK_I64GATHER_EPI32 (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm_mask_i64gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I32GATHER_PS (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm_mask_i32gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_BROADCASTSS_PS (a) =>
      _mm_broadcastss_ps(f(a))
    case iDef@MM256_I64GATHER_PD (base_addr, vindex, scale, base_addrOffset) =>
      _mm256_i64gather_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_MASKSTORE_EPI32 (mem_addr, mask, a, mem_addrOffset) =>
      _mm_maskstore_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MIN_EPU16 (a, b) =>
      _mm256_min_epu16(f(a), f(b))
    case MM_SRAV_EPI32 (a, count) =>
      _mm_srav_epi32(f(a), f(count))
    case MM256_BROADCASTSD_PD (a) =>
      _mm256_broadcastsd_pd(f(a))
    case iDef@MM_MASK_I64GATHER_PS (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm_mask_i64gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SLLI_EPI64 (a, imm8) =>
      _mm256_slli_epi64(f(a), f(imm8))
    case MM256_PERMUTE2X128_SI256 (a, b, imm8) =>
      _mm256_permute2x128_si256(f(a), f(b), f(imm8))
    case MM256_MAX_EPI16 (a, b) =>
      _mm256_max_epi16(f(a), f(b))
    case MM_BROADCASTSI128_SI256 (a) =>
      _mm_broadcastsi128_si256(f(a))
    case iDef@MM256_MASK_I32GATHER_PS (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm256_mask_i32gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CVTEPU16_EPI64 (a) =>
      _mm256_cvtepu16_epi64(f(a))
    case MM256_SRLV_EPI32 (a, count) =>
      _mm256_srlv_epi32(f(a), f(count))
    case MM256_CMPGT_EPI32 (a, b) =>
      _mm256_cmpgt_epi32(f(a), f(b))
    case MM_BLEND_EPI32 (a, b, imm8) =>
      _mm_blend_epi32(f(a), f(b), f(imm8))
    case MM256_CMPGT_EPI8 (a, b) =>
      _mm256_cmpgt_epi8(f(a), f(b))

    case Reflect(MM256_PERMUTEVAR8X32_EPI32 (a, idx), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEVAR8X32_EPI32 (f(a), f(idx)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKSTORE_EPI64 (mem_addr, mask, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKSTORE_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKLOAD_EPI64 (mem_addr, mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKLOAD_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKLOAD_EPI32 (mem_addr, mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKLOAD_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SAD_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SAD_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLEHI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLEHI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HADDS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HADDS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HSUB_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HSUB_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STREAM_LOAD_SI256 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STREAM_LOAD_SI256 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTSD_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTSD_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU8_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU8_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU8_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU8_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MULLO_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MULLO_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64GATHER_PS (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SIGN_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SIGN_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32GATHER_PS (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32GATHER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64GATHER_EPI64 (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRAV_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRAV_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MULHI_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MULHI_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTE4X64_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTE4X64_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADD_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADD_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64GATHER_PS (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64GATHER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MULHI_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MULHI_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRAI_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SRAI_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MADDUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MADDUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HADD_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HADD_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MULLO_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MULLO_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUB_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUB_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRAI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SRAI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_AVG_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_AVG_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTI128_SI256 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTI128_SI256 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKLOAD_EPI64 (mem_addr, mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKLOAD_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64GATHER_EPI32 (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64GATHER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTW_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTW_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTI128_SI256 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTI128_SI256 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADD_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADD_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRLI_SI256 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SRLI_SI256 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32GATHER_EPI64 (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI8_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI8_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLV_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLLV_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64GATHER_PS (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64GATHER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32GATHER_PD (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32GATHER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HSUB_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HSUB_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32GATHER_EPI32 (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32GATHER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLELO_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLELO_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MUL_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MUL_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ABS_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_ABS_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRLV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HSUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HSUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTSI128_SI256 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTSI128_SI256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BLEND_EPI16 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_BLEND_EPI16 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLL_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SLL_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ABS_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_ABS_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32GATHER_EPI64 (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI16_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI16_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU32_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU32_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ABS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_ABS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI16_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI16_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32GATHER_EPI32 (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLLI_SI256 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SLLI_SI256 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MULHRS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MULHRS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32GATHER_PD (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRA_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRA_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32GATHER_PD (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32GATHER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADDS_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADDS_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64GATHER_EPI64 (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64GATHER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI8_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI8_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTQ_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTQ_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRL_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRL_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKLOAD_EPI32 (mem_addr, mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKLOAD_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64GATHER_EPI32 (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64GATHER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32GATHER_EPI64 (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32GATHER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_XOR_SI256 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_XOR_SI256 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PACKUS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_PACKUS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTQ_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTQ_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEMASK_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEMASK_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKSTORE_EPI32 (mem_addr, mask, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKSTORE_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32GATHER_PS (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32GATHER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLL_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SLL_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ALIGNR_EPI8 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_ALIGNR_EPI8 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADD_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADD_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLL_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SLL_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLLI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SLLI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADDS_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADDS_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUBS_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUBS_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_OR_SI256 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_OR_SI256 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRLI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SRLI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRL_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRL_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_AND_SI256 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_AND_SI256 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI8_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI8_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ANDNOT_SI256 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ANDNOT_SI256 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32GATHER_EPI32 (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64GATHER_PD (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64GATHER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADDS_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADDS_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BLENDV_EPI8 (a, b, mask), u, es) =>
      reflectMirrored(Reflect(MM256_BLENDV_EPI8 (f(a), f(b), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUB_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUB_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU16_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU16_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SIGN_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SIGN_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTE4X64_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTE4X64_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU8_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU8_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MUL_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MUL_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PACKS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_PACKS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEVAR8X32_PS (a, idx), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEVAR8X32_PS (f(a), f(idx)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLLV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRLV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRLV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLV_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRLV_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLLV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SLLV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUBS_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUBS_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PACKS_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_PACKS_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32GATHER_EPI64 (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32GATHER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI32_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI32_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRLI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SRLI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUB_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUB_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32GATHER_PD (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64GATHER_EPI32 (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MPSADBW_EPU8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MPSADBW_EPU8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTSS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTSS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTB_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTB_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADDS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADDS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLLV_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SLLV_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRA_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRA_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_AVG_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_AVG_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PACKUS_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_PACKUS_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUB_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUB_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRL_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRL_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64GATHER_EPI64 (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTW_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTW_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64GATHER_EPI32 (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32GATHER_PS (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTSS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTSS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64GATHER_PD (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64GATHER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKSTORE_EPI32 (mem_addr, mask, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKSTORE_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAV_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRAV_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTSD_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTSD_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64GATHER_PS (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLLI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SLLI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTE2X128_SI256 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTE2X128_SI256 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTSI128_SI256 (a), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTSI128_SI256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32GATHER_PS (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU16_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU16_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRLV_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRLV_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BLEND_EPI32 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_BLEND_EPI32 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX200 extends CGenIntrinsics {

  val IR: AVX2
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_PERMUTEVAR8X32_EPI32(a, idx) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutevar8x32_epi32(${quote(a)}, ${quote(idx)})")
    case iDef@MM_MASKSTORE_EPI64(mem_addr, mask, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_maskstore_epi64((__int64*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)}, ${quote(a)});")
    case iDef@MM256_UNPACKHI_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpackhi_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MIN_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_min_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKLOAD_EPI64(mem_addr, mask, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskload_epi64((__int64 const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)})")
    case iDef@MM_MASKLOAD_EPI32(mem_addr, mask, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskload_epi32((int const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)})")
    case iDef@MM256_SAD_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sad_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SHUFFLEHI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shufflehi_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MAX_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_HADDS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hadds_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_HSUB_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hsub_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SHUFFLE_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shuffle_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_STREAM_LOAD_SI256(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_stream_load_si256((__m256i const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_BROADCASTSD_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcastsd_pd(${quote(a)})")
    case iDef@MM256_CVTEPU8_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepu8_epi16(${quote(a)})")
    case iDef@MM256_CVTEPU8_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepu8_epi64(${quote(a)})")
    case iDef@MM256_MULLO_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mullo_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_I64GATHER_PS(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_i64gather_ps(${quote(src)}, (float const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_UNPACKHI_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpackhi_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SIGN_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sign_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MAX_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_I32GATHER_PS(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_i32gather_ps((float const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_CMPGT_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_I64GATHER_EPI64(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_i64gather_epi64(${quote(src)}, (__int64 const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_SRAV_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srav_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_UNPACKHI_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpackhi_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MULHI_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mulhi_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPGT_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_PERMUTE4X64_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permute4x64_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_ADD_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_add_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_UNPACKHI_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpackhi_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_I64GATHER_PS(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_i64gather_ps((float const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_MULHI_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mulhi_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MAX_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SRAI_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srai_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MADDUBS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maddubs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SUBS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_subs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_HADD_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hadd_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MULLO_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mullo_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SUB_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sub_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SRAI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srai_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MAX_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_AVG_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_avg_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MIN_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_min_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_INSERTI128_SI256(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_inserti128_si256(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKLOAD_EPI64(mem_addr, mask, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskload_epi64((__int64 const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)})")
    case iDef@MM_I64GATHER_EPI32(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_i64gather_epi32((int const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_UNPACKLO_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpacklo_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_BROADCASTW_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcastw_epi16(${quote(a)})")
    case iDef@MM256_EXTRACTI128_SI256(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extracti128_si256(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_ADD_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_add_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SRLI_SI256(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srli_si256(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_I32GATHER_EPI64(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_i32gather_epi64(${quote(src)}, (__int64 const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_CVTEPI8_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi8_epi32(${quote(a)})")
    case iDef@MM_SLLV_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sllv_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_I64GATHER_PS(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_i64gather_ps((float const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM_I32GATHER_PD(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_i32gather_pd((double const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_HSUB_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hsub_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_I32GATHER_EPI32(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_i32gather_epi32((int const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_MIN_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_min_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ADD_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_add_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SHUFFLELO_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shufflelo_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MUL_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mul_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ABS_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_abs_epi16(${quote(a)})")
    case iDef@MM_SRLV_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srlv_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM256_HSUBS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hsubs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BROADCASTSI128_SI256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcastsi128_si256(${quote(a)})")
    case iDef@MM256_BLEND_EPI16(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_blend_epi16(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_SLL_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sll_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_ABS_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_abs_epi8(${quote(a)})")
    case iDef@MM256_CMPEQ_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_UNPACKLO_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpacklo_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_I32GATHER_EPI64(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_i32gather_epi64(${quote(src)}, (__int64 const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_CVTEPI16_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi16_epi64(${quote(a)})")
    case iDef@MM256_CVTEPU32_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepu32_epi64(${quote(a)})")
    case iDef@MM256_ABS_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_abs_epi32(${quote(a)})")
    case iDef@MM256_CVTEPI16_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi16_epi32(${quote(a)})")
    case iDef@MM_MASK_I32GATHER_EPI32(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_i32gather_epi32(${quote(src)}, (int const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_MIN_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_min_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SLLI_SI256(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_slli_si256(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MULHRS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mulhrs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_I32GATHER_PD(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_i32gather_pd(${quote(src)}, (double const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_SRA_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sra_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_I32GATHER_PD(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_i32gather_pd((double const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_ADDS_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_adds_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_I64GATHER_EPI64(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_i64gather_epi64((__int64 const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_CVTEPI8_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi8_epi64(${quote(a)})")
    case iDef@MM_BROADCASTQ_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcastq_epi64(${quote(a)})")
    case iDef@MM256_SRL_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srl_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKLOAD_EPI32(mem_addr, mask, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskload_epi32((int const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)})")
    case iDef@MM256_I64GATHER_EPI32(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_i64gather_epi32((int const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_I32GATHER_EPI64(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_i32gather_epi64((__int64 const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_XOR_SI256(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_xor_si256(${quote(a)}, ${quote(b)})")
    case iDef@MM256_PACKUS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_packus_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BROADCASTQ_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcastq_epi64(${quote(a)})")
    case iDef@MM256_MOVEMASK_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movemask_epi8(${quote(a)})")
    case iDef@MM256_MASKSTORE_EPI32(mem_addr, mask, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_maskstore_epi32((int*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)}, ${quote(a)});")
    case iDef@MM256_I32GATHER_PS(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_i32gather_ps((float const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_SLL_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sll_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM256_ALIGNR_EPI8(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_alignr_epi8(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM256_ADD_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_add_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SLL_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sll_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM256_SLLI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_slli_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_ADDS_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_adds_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SUBS_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_subs_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_OR_SI256(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_or_si256(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SRLI_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srli_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MIN_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_min_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_BROADCASTD_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcastd_epi32(${quote(a)})")
    case iDef@MM256_SRL_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srl_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM256_AND_SI256(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_and_si256(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPEQ_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTEPI8_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi8_epi16(${quote(a)})")
    case iDef@MM256_CMPEQ_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MADD_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_madd_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_HADD_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hadd_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ANDNOT_SI256(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_andnot_si256(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_I32GATHER_EPI32(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_i32gather_epi32(${quote(src)}, (int const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM_I64GATHER_PD(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_i64gather_pd((double const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_ADDS_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_adds_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BLENDV_EPI8(a, b, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_blendv_epi8(${quote(a)}, ${quote(b)}, ${quote(mask)})")
    case iDef@MM256_SHUFFLE_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shuffle_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MAX_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SUB_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sub_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTEPU16_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepu16_epi32(${quote(a)})")
    case iDef@MM256_SIGN_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sign_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_PERMUTE4X64_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permute4x64_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_CVTEPU8_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepu8_epi32(${quote(a)})")
    case iDef@MM256_MUL_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mul_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_PACKS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_packs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_PERMUTEVAR8X32_PS(a, idx) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutevar8x32_ps(${quote(a)}, ${quote(idx)})")
    case iDef@MM_SLLV_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sllv_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM256_SRLV_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srlv_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM_SRLV_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srlv_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_SLLV_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sllv_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM256_SUBS_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_subs_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_PACKS_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_packs_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_I32GATHER_EPI64(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_i32gather_epi64((__int64 const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_CVTEPI32_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi32_epi64(${quote(a)})")
    case iDef@MM256_SRLI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srli_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_SUB_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sub_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_I32GATHER_PD(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_i32gather_pd(${quote(src)}, (double const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_MASK_I64GATHER_EPI32(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_i64gather_epi32(${quote(src)}, (int const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_MPSADBW_EPU8(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mpsadbw_epu8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_BROADCASTSS_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcastss_ps(${quote(a)})")
    case iDef@MM_BROADCASTB_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcastb_epi8(${quote(a)})")
    case iDef@MM256_ADDS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_adds_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SLLV_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sllv_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_UNPACKLO_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpacklo_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SRA_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sra_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM256_AVG_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_avg_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_PACKUS_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_packus_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SUB_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sub_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SRL_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srl_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_I64GATHER_EPI64(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_i64gather_epi64(${quote(src)}, (__int64 const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_BROADCASTW_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcastw_epi16(${quote(a)})")
    case iDef@MM_MASK_I64GATHER_EPI32(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_i64gather_epi32(${quote(src)}, (int const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM_MASK_I32GATHER_PS(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_i32gather_ps(${quote(src)}, (float const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM_BROADCASTSS_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcastss_ps(${quote(a)})")
    case iDef@MM256_I64GATHER_PD(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_i64gather_pd((double const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM_MASKSTORE_EPI32(mem_addr, mask, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_maskstore_epi32((int*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)}, ${quote(a)});")
    case iDef@MM256_MIN_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_min_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRAV_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srav_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_BROADCASTSD_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcastsd_pd(${quote(a)})")
    case iDef@MM_MASK_I64GATHER_PS(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_i64gather_ps(${quote(src)}, (float const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_SLLI_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_slli_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_PERMUTE2X128_SI256(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permute2x128_si256(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MAX_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_BROADCASTSI128_SI256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcastsi128_si256(${quote(a)})")
    case iDef@MM256_MASK_I32GATHER_PS(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_i32gather_ps(${quote(src)}, (float const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_CVTEPU16_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepu16_epi64(${quote(a)})")
    case iDef@MM256_SRLV_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srlv_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_CMPGT_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_BLEND_EPI32(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_blend_epi32(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_CMPGT_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epi8(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
