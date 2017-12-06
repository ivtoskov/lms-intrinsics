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

    
trait SSE201 extends IntrinsicsBase {
  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-less-than-or-equal, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNLE_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTTPD_PI32(a: Exp[__m128d]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MULHI_EPU16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" to see if neither is NaN, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPORD_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SRLI_EPI16(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_MAX_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Broadcast 16-bit integer "a" to all all elements of "dst". This intrinsic may
   * generate "vpbroadcastw".
   * a: short
   */
  case class MM_SET1_EPI16(a: Exp[Short]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * memory. "mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORE_SD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SUB_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into the
   * upper element of "dst", and copy the lower element from "a" to "dst".
   * "mem_addr" does not need to be aligned on any particular boundary.
   * a: __m128d, mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOADH_PD[A[_], U:Integral](a: Exp[__m128d], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of "a" using the control in
   * "imm8". Store the results in the high 64 bits of "dst", with the low 64 bits
   * being copied from from "a" to "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SHUFFLEHI_EPI16(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SLL_EPI32(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" to see if neither is NaN, store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPORD_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for greater-than, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMIGT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Return vector of type __m128d with all elements set to zero.

   */
  case class MM_SETZERO_PD() extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-equal, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNEQ_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SUBS_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_ANDNOT_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy 32-bit integer "a" to the lower elements of "dst", and zero the upper
   * elements of "dst".
   * a: int
   */
  case class MM_CVTSI32_SI128(a: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into both
   * elements of "dst".
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOAD1_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Return vector of type __m128i with all elements set to zero.

   */
  case class MM_SETZERO_SI128() extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Perform a serializing operation on all load-from-memory and store-to-memory
   * instructions that were issued prior to this instruction. Guarantees that every
   * memory access that precedes, in program order, the memory fence instruction is
   * globally visible before any memory instruction which follows the fence in
   * program order.

   */
  case class MM_MFENCE() extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPU8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst". This intrinsic may
   * generate "vpbroadcastd".
   * a: int
   */
  case class MM_SET1_EPI32(a: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m128
   */
  case class MM_CVTPS_PD(a: Exp[__m128]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for equality, and return the boolean result (0 or 1).
   * a: __m128d, b: __m128d
   */
  case class MM_COMIEQ_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the supplied values.
   * e1: __m64, e0: __m64
   */
  case class MM_SET_EPI64(e1: Exp[__m64], e0: Exp[__m64]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STOREU_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load 2 double-precision (64-bit) floating-point elements from memory into
   * "dst" in reverse order. mem_addr must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOADR_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-greater-than-or-equal, store the result in the lower element of
   * "dst", and copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNGE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_ADD_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 32-bit integer "a" into memory using a non-temporal hint to minimize
   * cache pollution. If the cache line containing address "mem_addr" is already in
   * the cache, the cache will be updated.
   * mem_addr: int*, a: int, mem_addrOffset: int
   */
  case class MM_STREAM_SI32[A[_], U:Integral](mem_addr: Exp[A[Int]], a: Exp[Int], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SUBS_EPU16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set each bit of mask "dst" based on the most significant bit of the
   * corresponding packed double-precision (64-bit) floating-point element in "a".
   * a: __m128d
   */
  case class MM_MOVEMASK_PD(a: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add 64-bit integers "a" and "b", and store the result in "dst".
   * a: __m64, b: __m64
   */
  case class MM_ADD_SI64(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for less-than-or-equal, and return the boolean result (0 or 1).
   * a: __m128d, b: __m128d
   */
  case class MM_COMILE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst", and copy the upper element
   * from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_ADD_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128i to type __m128. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128i
   */
  case class MM_CASTSI128_PS(a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the 64-bit integer "b" to a double-precision (64-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: __int64
   */
  case class MM_CVTSI64X_SD(a: Exp[__m128d], b: Exp[Long]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the supplied values.
   * e3: int, e2: int, e1: int, e0: int
   */
  case class MM_SET_EPI32(e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-greater-than, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNGT_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_MAX_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Return vector of type __m128i with undefined elements.

   */
  case class MM_UNDEFINED_SI128() extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for equality, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMIEQ_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the supplied values.
   * e1: __int64, e0: __int64
   */
  case class MM_SET_EPI64X(e1: Exp[Long], e0: Exp[Long]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SLL_EPI64(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128d to type __m128. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128d
   */
  case class MM_CASTPD_PS(a: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract 64-bit integer "b" from 64-bit integer "a", and store the result in
   * "dst".
   * a: __m64, b: __m64
   */
  case class MM_SUB_SI64(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the square root of the lower double-precision (64-bit) floating-point
   * element in "b", store the result in the lower element of "dst", and copy the
   * upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_SQRT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for less-than-or-equal, store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPLE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed 8-bit integers in "dst" with the supplied values in reverse order.
   * e15: char, e14: char, e13: char, e12: char, e11: char, e10: char, e9: char, e8: char, e7: char, e6: char, e5: char, e4: char, e3: char, e2: char, e1: char, e0: char
   */
  case class MM_SET_EPI8(e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy 64-bit integer "a" to the lower element of "dst", and zero the upper
   * element.
   * a: __int64
   */
  case class MM_CVTSI64_SI128(a: Exp[Long]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_AVG_EPU8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ADD_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * 2 contiguous elements in memory. "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORE1_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_DIV_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into both
   * elements of "dst".
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOAD_PD1[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-less-than-or-equal, store the result in the lower element of
   * "dst", and copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNLE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-greater-than-or-equal, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNGE_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  def _mm_cmpnle_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNLE_PD(a, b)
  }
            
  def _mm_cvttpd_pi32(a: Exp[__m128d]): Exp[__m64] = {
    MM_CVTTPD_PI32(a)
  }
            
  def _mm_mulhi_epu16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MULHI_EPU16(a, b)
  }
            
  def _mm_cmpord_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPORD_PD(a, b)
  }
            
  def _mm_srli_epi16(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SRLI_EPI16(a, imm8)
  }
            
  def _mm_max_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MAX_SD(a, b)
  }
            
  def _mm_set1_epi16(a: Exp[Short]): Exp[__m128i] = {
    MM_SET1_EPI16(a)
  }
            
  def _mm_store_sd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_SD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_sub_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SUB_EPI32(a, b)
  }
            
  def _mm_loadh_pd[A[_], U:Integral](a: Exp[__m128d], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOADH_PD(a, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_shufflehi_epi16(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SHUFFLEHI_EPI16(a, imm8)
  }
            
  def _mm_sll_epi32(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SLL_EPI32(a, count)
  }
            
  def _mm_cmpord_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPORD_SD(a, b)
  }
            
  def _mm_ucomigt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMIGT_SD(a, b)
  }
            
  def _mm_setzero_pd(): Exp[__m128d] = {
    MM_SETZERO_PD()
  }
            
  def _mm_cmpneq_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNEQ_PD(a, b)
  }
            
  def _mm_subs_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SUBS_EPI8(a, b)
  }
            
  def _mm_andnot_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_ANDNOT_PD(a, b)
  }
            
  def _mm_cvtsi32_si128(a: Exp[Int]): Exp[__m128i] = {
    MM_CVTSI32_SI128(a)
  }
            
  def _mm_load1_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOAD1_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_setzero_si128(): Exp[__m128i] = {
    MM_SETZERO_SI128()
  }
            
  def _mm_mfence(): Exp[Unit] = {
    reflectEffect(MM_MFENCE())
  }
            
  def _mm_max_epu8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPU8(a, b)
  }
            
  def _mm_set1_epi32(a: Exp[Int]): Exp[__m128i] = {
    MM_SET1_EPI32(a)
  }
            
  def _mm_cvtps_pd(a: Exp[__m128]): Exp[__m128d] = {
    MM_CVTPS_PD(a)
  }
            
  def _mm_comieq_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_COMIEQ_SD(a, b)
  }
            
  def _mm_set_epi64(e1: Exp[__m64], e0: Exp[__m64]): Exp[__m128i] = {
    MM_SET_EPI64(e1, e0)
  }
            
  def _mm_storeu_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREU_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_loadr_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOADR_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cmpnge_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNGE_SD(a, b)
  }
            
  def _mm_add_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_ADD_PD(a, b)
  }
            
  def _mm_stream_si32[A[_], U:Integral](mem_addr: Exp[A[Int]], a: Exp[Int], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STREAM_SI32(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_subs_epu16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SUBS_EPU16(a, b)
  }
            
  def _mm_movemask_pd(a: Exp[__m128d]): Exp[Int] = {
    MM_MOVEMASK_PD(a)
  }
            
  def _mm_add_si64(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_ADD_SI64(a, b)
  }
            
  def _mm_comile_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_COMILE_SD(a, b)
  }
            
  def _mm_add_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_ADD_SD(a, b)
  }
            
  def _mm_castsi128_ps(a: Exp[__m128i]): Exp[__m128] = {
    MM_CASTSI128_PS(a)
  }
            
  def _mm_cvtsi64x_sd(a: Exp[__m128d], b: Exp[Long]): Exp[__m128d] = {
    MM_CVTSI64X_SD(a, b)
  }
            
  def _mm_set_epi32(e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]): Exp[__m128i] = {
    MM_SET_EPI32(e3, e2, e1, e0)
  }
            
  def _mm_cmpngt_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNGT_PD(a, b)
  }
            
  def _mm_max_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MAX_PD(a, b)
  }
            
  def _mm_max_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPI16(a, b)
  }
            
  def _mm_undefined_si128(): Exp[__m128i] = {
    MM_UNDEFINED_SI128()
  }
            
  def _mm_ucomieq_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMIEQ_SD(a, b)
  }
            
  def _mm_set_epi64x(e1: Exp[Long], e0: Exp[Long]): Exp[__m128i] = {
    MM_SET_EPI64X(e1, e0)
  }
            
  def _mm_sll_epi64(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SLL_EPI64(a, count)
  }
            
  def _mm_castpd_ps(a: Exp[__m128d]): Exp[__m128] = {
    MM_CASTPD_PS(a)
  }
            
  def _mm_sub_si64(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SUB_SI64(a, b)
  }
            
  def _mm_sqrt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_SQRT_SD(a, b)
  }
            
  def _mm_cmple_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPLE_SD(a, b)
  }
            
  def _mm_set_epi8(e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]): Exp[__m128i] = {
    MM_SET_EPI8(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm_cmpgt_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPGT_EPI16(a, b)
  }
            
  def _mm_cvtsi64_si128(a: Exp[Long]): Exp[__m128i] = {
    MM_CVTSI64_SI128(a)
  }
            
  def _mm_avg_epu8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_AVG_EPU8(a, b)
  }
            
  def _mm_add_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ADD_EPI16(a, b)
  }
            
  def _mm_store1_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE1_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_div_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_DIV_PD(a, b)
  }
            
  def _mm_load_pd1[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOAD_PD1(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cmpnle_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNLE_SD(a, b)
  }
            
  def _mm_cmpnge_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNGE_PD(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_CMPNLE_PD (a, b) =>
      _mm_cmpnle_pd(f(a), f(b))
    case MM_CVTTPD_PI32 (a) =>
      _mm_cvttpd_pi32(f(a))
    case MM_MULHI_EPU16 (a, b) =>
      _mm_mulhi_epu16(f(a), f(b))
    case MM_CMPORD_PD (a, b) =>
      _mm_cmpord_pd(f(a), f(b))
    case MM_SRLI_EPI16 (a, imm8) =>
      _mm_srli_epi16(f(a), f(imm8))
    case MM_MAX_SD (a, b) =>
      _mm_max_sd(f(a), f(b))
    case MM_SET1_EPI16 (a) =>
      _mm_set1_epi16(f(a))
    case iDef@MM_STORE_SD (mem_addr, a, mem_addrOffset) =>
      _mm_store_sd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SUB_EPI32 (a, b) =>
      _mm_sub_epi32(f(a), f(b))
    case iDef@MM_LOADH_PD (a, mem_addr, mem_addrOffset) =>
      _mm_loadh_pd(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SHUFFLEHI_EPI16 (a, imm8) =>
      _mm_shufflehi_epi16(f(a), f(imm8))
    case MM_SLL_EPI32 (a, count) =>
      _mm_sll_epi32(f(a), f(count))
    case MM_CMPORD_SD (a, b) =>
      _mm_cmpord_sd(f(a), f(b))
    case MM_UCOMIGT_SD (a, b) =>
      _mm_ucomigt_sd(f(a), f(b))
    case MM_SETZERO_PD () =>
      _mm_setzero_pd()
    case MM_CMPNEQ_PD (a, b) =>
      _mm_cmpneq_pd(f(a), f(b))
    case MM_SUBS_EPI8 (a, b) =>
      _mm_subs_epi8(f(a), f(b))
    case MM_ANDNOT_PD (a, b) =>
      _mm_andnot_pd(f(a), f(b))
    case MM_CVTSI32_SI128 (a) =>
      _mm_cvtsi32_si128(f(a))
    case iDef@MM_LOAD1_PD (mem_addr, mem_addrOffset) =>
      _mm_load1_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SETZERO_SI128 () =>
      _mm_setzero_si128()
    case MM_MFENCE () =>
      _mm_mfence()
    case MM_MAX_EPU8 (a, b) =>
      _mm_max_epu8(f(a), f(b))
    case MM_SET1_EPI32 (a) =>
      _mm_set1_epi32(f(a))
    case MM_CVTPS_PD (a) =>
      _mm_cvtps_pd(f(a))
    case MM_COMIEQ_SD (a, b) =>
      _mm_comieq_sd(f(a), f(b))
    case MM_SET_EPI64 (e1, e0) =>
      _mm_set_epi64(f(e1), f(e0))
    case iDef@MM_STOREU_PD (mem_addr, a, mem_addrOffset) =>
      _mm_storeu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOADR_PD (mem_addr, mem_addrOffset) =>
      _mm_loadr_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CMPNGE_SD (a, b) =>
      _mm_cmpnge_sd(f(a), f(b))
    case MM_ADD_PD (a, b) =>
      _mm_add_pd(f(a), f(b))
    case iDef@MM_STREAM_SI32 (mem_addr, a, mem_addrOffset) =>
      _mm_stream_si32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SUBS_EPU16 (a, b) =>
      _mm_subs_epu16(f(a), f(b))
    case MM_MOVEMASK_PD (a) =>
      _mm_movemask_pd(f(a))
    case MM_ADD_SI64 (a, b) =>
      _mm_add_si64(f(a), f(b))
    case MM_COMILE_SD (a, b) =>
      _mm_comile_sd(f(a), f(b))
    case MM_ADD_SD (a, b) =>
      _mm_add_sd(f(a), f(b))
    case MM_CASTSI128_PS (a) =>
      _mm_castsi128_ps(f(a))
    case MM_CVTSI64X_SD (a, b) =>
      _mm_cvtsi64x_sd(f(a), f(b))
    case MM_SET_EPI32 (e3, e2, e1, e0) =>
      _mm_set_epi32(f(e3), f(e2), f(e1), f(e0))
    case MM_CMPNGT_PD (a, b) =>
      _mm_cmpngt_pd(f(a), f(b))
    case MM_MAX_PD (a, b) =>
      _mm_max_pd(f(a), f(b))
    case MM_MAX_EPI16 (a, b) =>
      _mm_max_epi16(f(a), f(b))
    case MM_UNDEFINED_SI128 () =>
      _mm_undefined_si128()
    case MM_UCOMIEQ_SD (a, b) =>
      _mm_ucomieq_sd(f(a), f(b))
    case MM_SET_EPI64X (e1, e0) =>
      _mm_set_epi64x(f(e1), f(e0))
    case MM_SLL_EPI64 (a, count) =>
      _mm_sll_epi64(f(a), f(count))
    case MM_CASTPD_PS (a) =>
      _mm_castpd_ps(f(a))
    case MM_SUB_SI64 (a, b) =>
      _mm_sub_si64(f(a), f(b))
    case MM_SQRT_SD (a, b) =>
      _mm_sqrt_sd(f(a), f(b))
    case MM_CMPLE_SD (a, b) =>
      _mm_cmple_sd(f(a), f(b))
    case MM_SET_EPI8 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm_set_epi8(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM_CMPGT_EPI16 (a, b) =>
      _mm_cmpgt_epi16(f(a), f(b))
    case MM_CVTSI64_SI128 (a) =>
      _mm_cvtsi64_si128(f(a))
    case MM_AVG_EPU8 (a, b) =>
      _mm_avg_epu8(f(a), f(b))
    case MM_ADD_EPI16 (a, b) =>
      _mm_add_epi16(f(a), f(b))
    case iDef@MM_STORE1_PD (mem_addr, a, mem_addrOffset) =>
      _mm_store1_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_DIV_PD (a, b) =>
      _mm_div_pd(f(a), f(b))
    case iDef@MM_LOAD_PD1 (mem_addr, mem_addrOffset) =>
      _mm_load_pd1(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CMPNLE_SD (a, b) =>
      _mm_cmpnle_sd(f(a), f(b))
    case MM_CMPNGE_PD (a, b) =>
      _mm_cmpnge_pd(f(a), f(b))

    case Reflect(MM_CMPNLE_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNLE_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_PI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_PI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULHI_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULHI_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPORD_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPORD_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRLI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_SD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_SD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADH_PD (a, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADH_PD (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHUFFLEHI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SHUFFLEHI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLL_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLL_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPORD_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPORD_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMIGT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMIGT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETZERO_PD (), u, es) =>
      reflectMirrored(Reflect(MM_SETZERO_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUBS_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUBS_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ANDNOT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ANDNOT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI32_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI32_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD1_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD1_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETZERO_SI128 (), u, es) =>
      reflectMirrored(Reflect(MM_SETZERO_SI128 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MFENCE (), u, es) =>
      reflectMirrored(Reflect(MM_MFENCE (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMIEQ_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMIEQ_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_EPI64 (e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_EPI64 (f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREU_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADR_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADR_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNGE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNGE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STREAM_SI32 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STREAM_SI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUBS_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUBS_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEMASK_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEMASK_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_SI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_SI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMILE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMILE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTSI128_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTSI128_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI64X_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI64X_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_EPI32 (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_EPI32 (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNGT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNGT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNDEFINED_SI128 (), u, es) =>
      reflectMirrored(Reflect(MM_UNDEFINED_SI128 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMIEQ_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMIEQ_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_EPI64X (e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_EPI64X (f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLL_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLL_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTPD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTPD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_SI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_SI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SQRT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SQRT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_EPI8 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_EPI8 (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI64_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI64_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AVG_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_AVG_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE1_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE1_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_PD1 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_PD1 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNLE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNLE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNGE_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNGE_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSSE201 extends CGenIntrinsics {

  val IR: SSE2
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_CMPNLE_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnle_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTTPD_PI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttpd_pi32(${quote(a)})")
    case iDef@MM_MULHI_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mulhi_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPORD_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpord_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRLI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srli_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MAX_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET1_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_epi16(${quote(a)})")
    case iDef@MM_STORE_SD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_store_sd((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_SUB_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOADH_PD(a, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadh_pd(${quote(a)}, (double const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_SHUFFLEHI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_shufflehi_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SLL_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sll_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM_CMPORD_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpord_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_UCOMIGT_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomigt_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SETZERO_PD() =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setzero_pd()")
    case iDef@MM_CMPNEQ_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SUBS_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_subs_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_ANDNOT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_andnot_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSI32_SI128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi32_si128(${quote(a)})")
    case iDef@MM_LOAD1_PD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_load1_pd((double const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_SETZERO_SI128() =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setzero_si128()")
    case iDef@MM_MFENCE() =>
      headers += iDef.header
      stream.println(s"_mm_mfence();")
    case iDef@MM_MAX_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET1_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_epi32(${quote(a)})")
    case iDef@MM_CVTPS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtps_pd(${quote(a)})")
    case iDef@MM_COMIEQ_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comieq_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_EPI64(e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_epi64(${quote(e1)}, ${quote(e0)})")
    case iDef@MM_STOREU_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storeu_pd((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_LOADR_PD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadr_pd((double const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CMPNGE_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnge_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADD_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_STREAM_SI32(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_stream_si32((int*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_SUBS_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_subs_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVEMASK_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movemask_pd(${quote(a)})")
    case iDef@MM_ADD_SI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_si64(${quote(a)}, ${quote(b)})")
    case iDef@MM_COMILE_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comile_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADD_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CASTSI128_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_castsi128_ps(${quote(a)})")
    case iDef@MM_CVTSI64X_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi64x_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_EPI32(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_epi32(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_CMPNGT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpngt_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MAX_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MAX_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNDEFINED_SI128() =>
      headers += iDef.header
      emitValDef(sym, s"_mm_undefined_si128()")
    case iDef@MM_UCOMIEQ_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomieq_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_EPI64X(e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_epi64x(${quote(e1)}, ${quote(e0)})")
    case iDef@MM_SLL_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sll_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM_CASTPD_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_castpd_ps(${quote(a)})")
    case iDef@MM_SUB_SI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_si64(${quote(a)}, ${quote(b)})")
    case iDef@MM_SQRT_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sqrt_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLE_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_EPI8(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_epi8(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_CMPGT_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSI64_SI128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi64_si128(${quote(a)})")
    case iDef@MM_AVG_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_avg_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADD_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_STORE1_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_store1_pd((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_DIV_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOAD_PD1(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_load_pd1((double const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CMPNLE_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnle_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNGE_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnge_pd(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
