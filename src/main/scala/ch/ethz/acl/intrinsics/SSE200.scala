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

    
trait SSE200 extends IntrinsicsBase {
  /**
   * Store 64-bit integer "a" into memory using a non-temporal hint to minimize
   * cache pollution. If the cache line containing address "mem_addr" is already in
   * the cache, the cache will be updated.
   * mem_addr: __int64*, a: __int64, mem_addrOffset: int
   */
  case class MM_STREAM_SI64[A[_], U:Integral](mem_addr: Exp[A[Long]], a: Exp[Long], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UNPACKLO_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPU8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_MIN_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Move the lower double-precision (64-bit) floating-point element from "b" to
   * the lower element of "dst", and copy the upper element from "a" to the upper
   * element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_MOVE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for greater-than-or-equal, and return the boolean result (0 or 1). This
   * instruction will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMIGE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy double-precision (64-bit) floating-point element "a" to the lower element
   * of "dst", and zero the upper element.
   * a: double
   */
  case class MM_SET_SD(a: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for not-equal, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMINEQ_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift "a" right by "imm8" bytes while shifting in zeros, and store the results
   * in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_BSRLI_SI128(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_PS(a: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_SI32(a: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy 64-bit integer "a" to the lower element of "dst", and zero the upper
   * element.
   * a: __int64
   */
  case class MM_CVTSI64X_SI128(a: Exp[Long]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRA_EPI16(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in "dst". Note: This intrinsic emits the pcmpgtb instruction with the
   * order of the operands switched.
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 128-bits of integer data from "a" into memory. 
   * 	"mem_addr" must be
   * aligned on a 16-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: __m128i*, a: __m128i, mem_addrOffset: int
   */
  case class MM_STORE_SI128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Invalidate and flush the cache line that contains "p" from all levels of the
   * cache hierarchy.
   * p: void const*, pOffset: int
   */
  case class MM_CLFLUSH[A[_], T:Typ, U:Integral](p: Exp[A[T]], pOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRA_EPI32(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SRAI_EPI32(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift "a" right by "imm8" bytes while shifting in zeros, and store the results
   * in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SRLI_SI128(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Broadcast double-precision (64-bit) floating-point value "a" to all elements
   * of "dst".
   * a: double
   */
  case class MM_SET_PD1(a: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for not-equal, and return the boolean result (0 or 1).
   * a: __m128d, b: __m128d
   */
  case class MM_COMINEQ_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-less-than, store the result in the lower element of "dst", and
   * copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNLT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower 32-bit integer in "a" to "dst".
   * a: __m512i
   */
  case class MM512_CVTSI512_SI32(a: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTTPS_EPI32(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst".
   * a: __m64
   */
  case class MM_SET1_EPI64(a: Exp[__m64]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_SI64X(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SLL_EPI16(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_OR_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load 128-bits of integer data from memory into "dst". 
   * 	"mem_addr" must be
   * aligned on a 16-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: __m128i const*, mem_addrOffset: int
   */
  case class MM_LOAD_SI128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ADD_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_SUB_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_UNPACKHI_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MULLO_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values.
   * e1: double, e0: double
   */
  case class MM_SET_PD(e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for equality, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPEQ_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing integer data) in "a" and
   * "b", and store the result in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_AND_SI128(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for equality, store the result in the lower element of "dst", and copy the
   * upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPEQ_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load 64-bit integer from memory into the first element of "dst".
   * mem_addr: __m128i const*, mem_addrOffset: int
   */
  case class MM_LOADL_EPI64[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SRAI_EPI16(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_PACKS_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than, and store the
   * results in "dst". Note: This intrinsic emits the pcmpgtd instruction with the
   * order of the operands switched.
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the bitwise OR of 128 bits (representing integer data) in "a" and "b",
   * and store the result in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_OR_SI128(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_SQRT_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-equal, store the result in the lower element of "dst", and copy
   * the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNEQ_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Broadcast double-precision (64-bit) floating-point value "a" to all elements
   * of "dst".
   * a: double
   */
  case class MM_SET1_PD(a: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SUB_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UNPACKLO_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values in reverse order.
   * e1: double, e0: double
   */
  case class MM_SETR_PD(e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * memory.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STOREL_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128 to type __m128i. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM_CASTPS_SI128(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * 2 contiguous elements in memory. "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORE_PD1[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 128 bits (representing integer data) in "a" and
   * then AND with "b", and store the result in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ANDNOT_SI128(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst". This intrinsic may
   * generate "vpbroadcastb".
   * a: char
   */
  case class MM_SET1_EPI8(a: Exp[Byte]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 2 double-precision (64-bit) floating-point elements from "a" into memory
   * in reverse order.
   * 	"mem_addr" must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORER_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract the lower double-precision (64-bit) floating-point element in "b"
   * from the lower double-precision (64-bit) floating-point element in "a", store
   * the result in the lower element of "dst", and copy the upper element from "a"
   * to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_SUB_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_MUL_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for greater-than-or-equal, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPGE_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRL_EPI32(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for less-than, and return the boolean result (0 or 1).
   * a: __m128d, b: __m128d
   */
  case class MM_COMILT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of "a" and "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_UNPACKLO_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" using the control in "imm8", and store the
   * results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SHUFFLE_EPI32(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRL_EPI64(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRL_EPI16(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_PI32(a: Exp[__m128d]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for greater-than, and return the boolean result (0 or 1).
   * a: __m128d, b: __m128d
   */
  case class MM_COMIGT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of "a" using the control in "imm8".
   * Store the results in the low 64 bits of "dst", with the high 64 bits being
   * copied from from "a" to "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SHUFFLELO_EPI16(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower 64-bit integer in "a" to the lower element of "dst", and zero
   * the upper element.
   * a: __m128i
   */
  case class MM_MOVE_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOAD_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ADDS_EPU16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UNPACKHI_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower 64-bit integer in "a" to "dst".
   * a: __m128i
   */
  case class MM_MOVEPI64_PI64(a: Exp[__m128i]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTTPD_EPI32(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UNPACKHI_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTPS_EPI32(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the 64-bit integer "b" to a double-precision (64-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: __int64
   */
  case class MM_CVTSI64_SD(a: Exp[__m128d], b: Exp[Long]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SLLI_EPI32(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower 64-bit integer in "a" to "dst".
   * a: __m128i
   */
  case class MM_CVTSI128_SI64(a: Exp[__m128i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Provide a hint to the processor that the code sequence is a spin-wait loop.
   * This can help improve the performance and power consumption of spin-wait
   * loops.

   */
  case class MM_PAUSE() extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower double-precision (64-bit) floating-point element of "a" to
   * "dst".
   * a: __m512d
   */
  case class MM512_CVTSD_F64(a: Exp[__m512d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m128 to type __m128d. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM_CASTPS_PD(a: Exp[__m128]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128i to type __m128d. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128i
   */
  case class MM_CASTSI128_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for less-than, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPLT_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SRLI_EPI32(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for less-than-or-equal, and return the boolean result (0 or 1). This
   * instruction will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMILE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the 32-bit integer "b" to a double-precision (64-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: int
   */
  case class MM_CVTSI32_SD(a: Exp[__m128d], b: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_XOR_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MUL_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_AND_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_AVG_EPU16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements using the control in
   * "imm8", and store the results in "dst".
   * a: __m128d, b: __m128d, imm8: int
   */
  case class MM_SHUFFLE_PD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_EPI32(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Multiply packed signed 16-bit integers in "a" and "b", producing intermediate
   * signed 32-bit integers. Horizontally add adjacent pairs of intermediate 32-bit
   * integers, and pack the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MADD_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the supplied values in reverse order.
   * e1: __m64, e0: __m64
   */
  case class MM_SETR_EPI64(e1: Exp[__m64], e0: Exp[__m64]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the 64-bit integer "a" to the lower element of "dst", and zero the upper
   * element.
   * a: __m64
   */
  case class MM_MOVPI64_EPI64(a: Exp[__m64]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower 32-bit integer in "a" to "dst".
   * a: __m128i
   */
  case class MM_CVTSI128_SI32(a: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MULHI_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower 64-bit integer in "a" to "dst".
   * a: __m128i
   */
  case class MM_CVTSI128_SI64X(a: Exp[__m128i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in "dst". Note: This intrinsic emits the pcmpgtw instruction with the
   * order of the operands switched.
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "b" to a
   * single-precision (32-bit) floating-point element, store the result in the
   * lower element of "dst", and copy the upper element from "a" to the upper
   * element of "dst".
   * a: __m128, b: __m128d
   */
  case class MM_CVTSD_SS(a: Exp[__m128], b: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SUB_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower double-precision (64-bit) floating-point element of "a" to
   * "dst".
   * a: __m128d
   */
  case class MM_CVTSD_F64(a: Exp[__m128d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-greater-than, store the result in the lower element of "dst", and
   * copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNGT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add packed 64-bit integers in "a" and "b", and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ADD_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Conditionally store 8-bit integer elements from "a" into memory using "mask"
   * (elements are not stored when the highest bit is not set in the corresponding
   * element) and a non-temporal memory hint. "mem_addr" does not need to be
   * aligned on any particular boundary.
   * a: __m128i, mask: __m128i, mem_addr: char*, mem_addrOffset: int
   */
  case class MM_MASKMOVEU_SI128[A[_], U:Integral](a: Exp[__m128i], mask: Exp[__m128i], mem_addr: Exp[A[Byte]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_MIN_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed 8-bit integers in "dst" with the supplied values in reverse order.
   * e15: char, e14: char, e13: char, e12: char, e11: char, e10: char, e9: char, e8: char, e7: char, e6: char, e5: char, e4: char, e3: char, e2: char, e1: char, e0: char
   */
  case class MM_SETR_EPI8(e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the 16-bit integer "i" into "dst" at the
   * location specified by "imm8".
   * a: __m128i, i: int, imm8: int
   */
  case class MM_INSERT_EPI16(a: Exp[__m128i], i: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UNPACKLO_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for greater-than-or-equal, store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPGE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into the
   * lower of "dst", and zero the upper element. "mem_addr" does not need to be
   * aligned on any particular boundary.
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOAD_SD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SUBS_EPU8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 64-bit integer from the first element of "a" into memory.
   * mem_addr: __m128i*, a: __m128i, mem_addrOffset: int
   */
  case class MM_STOREL_EPI64[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for greater-than, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPGT_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SLLI_EPI64(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift "a" left by "imm8" bytes while shifting in zeros, and store the results
   * in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_BSLLI_SI128(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Divide the lower double-precision (64-bit) floating-point element in "a" by
   * the lower double-precision (64-bit) floating-point element in "b", store the
   * result in the lower element of "dst", and copy the upper element from "a" to
   * the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_DIV_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SUB_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed 16-bit integers in "dst" with the supplied values.
   * e7: short, e6: short, e5: short, e4: short, e3: short, e2: short, e1: short, e0: short
   */
  case class MM_SET_EPI16(e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst". This intrinsic may
   * generate the "vpbroadcastq".
   * a: __int64
   */
  case class MM_SET1_EPI64X(a: Exp[Long]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load 128-bits of integer data from memory into "dst".
   * 	"mem_addr" does not
   * need to be aligned on any particular boundary.
   * mem_addr: __m128i const*, mem_addrOffset: int
   */
  case class MM_LOADU_SI128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_SI32(a: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift "a" left by "imm8" bytes while shifting in zeros, and store the results
   * in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SLLI_SI128(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SLLI_EPI16(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" to see if either is NaN, store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPUNORD_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Return vector of type __m128d with undefined elements.

   */
  case class MM_UNDEFINED_PD() extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOADU_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "b" to a
   * double-precision (64-bit) floating-point element, store the result in the
   * lower element of "dst", and copy the upper element from "a" to the upper
   * element of "dst".
   * a: __m128d, b: __m128
   */
  case class MM_CVTSS_SD(a: Exp[__m128d], b: Exp[__m128]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ADDS_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128d to type __m128i. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128d
   */
  case class MM_CASTPD_SI128(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UNPACKHI_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for greater-than, store the result in the lower element of "dst", and copy
   * the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPGT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_SI64X(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" for less-than, store the result in the lower element of "dst", and copy
   * the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPLT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower double-precision (64-bit) floating-point element of "a" to
   * "dst".
   * a: __m256d
   */
  case class MM256_CVTSD_F64(a: Exp[__m256d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ADD_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UNPACKLO_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into the
   * lower element of "dst", and copy the upper element from "a" to "dst".
   * "mem_addr" does not need to be aligned on any particular boundary.
   * a: __m128d, mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOADL_PD[A[_], U:Integral](a: Exp[__m128d], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed 16-bit integers in "dst" with the supplied values in reverse order.
   * e7: short, e6: short, e5: short, e4: short, e3: short, e2: short, e1: short, e0: short
   */
  case class MM_SETR_EPI16(e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SUBS_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_MUL_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory using a non-temporal memory hint.
   * 	"mem_addr"
   * must be aligned on a 16-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STREAM_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_SI64(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Create mask from the most significant bit of each 8-bit element in "a", and
   * store the result in "dst".
   * a: __m128i
   */
  case class MM_MOVEMASK_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m64
   */
  case class MM_CVTPI32_PD(a: Exp[__m64]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORE_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UNPACKHI_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of 128 bits (representing integer data) in "a" and
   * "b", and store the result in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_XOR_SI128(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI32_PS(a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_SI64(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Perform a serializing operation on all load-from-memory instructions that were
   * issued prior to this instruction. Guarantees that every load instruction that
   * precedes, in program order, is globally visible before any load instruction
   * which follows the fence in program order.

   */
  case class MM_LFENCE() extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower 32-bit integer in "a" to "dst".
   * a: __m256i
   */
  case class MM256_CVTSI256_SI32(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_PACKUS_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 128-bits of integer data from "a" into memory.
   * 	"mem_addr" does not need
   * to be aligned on any particular boundary.
   * mem_addr: __m128i*, a: __m128i, mem_addrOffset: int
   */
  case class MM_STOREU_SI128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using signed saturation, and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_PACKS_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" to see if either is NaN, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPUNORD_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for greater-than-or-equal, and return the boolean result (0 or 1).
   * a: __m128d, b: __m128d
   */
  case class MM_COMIGE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the upper double-precision (64-bit) floating-point element from "a" into
   * memory.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STOREH_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-less-than, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPNLT_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Extract a 16-bit integer from "a", selected with "imm8", and store the result
   * in the lower element of "dst".
   * a: __m128i, imm8: int
   */
  case class MM_EXTRACT_EPI16(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compute the absolute differences of packed unsigned 8-bit integers in "a" and
   * "b", then horizontally sum each consecutive 8 differences to produce two
   * unsigned 16-bit integers, and pack these unsigned 16-bit integers in the low
   * 16 bits of 64-bit elements in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SAD_EPU8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ADDS_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for less-than, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMILT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 128-bits of integer data from "a" into memory using a non-temporal
   * memory hint. 
   * 	"mem_addr" must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: __m128i*, a: __m128i, mem_addrOffset: int
   */
  case class MM_STREAM_SI128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_SRLI_EPI64(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI32_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ADDS_EPU8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from "a" and "b", and store the
   * unsigned 64-bit result in "dst".
   * a: __m64, b: __m64
   */
  case class MM_MUL_SU32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the supplied values in reverse order.
   * e3: int, e2: int, e1: int, e0: int
   */
  case class MM_SETR_EPI32(e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for less-than-or-equal, and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CMPLE_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  def _mm_stream_si64[A[_], U:Integral](mem_addr: Exp[A[Long]], a: Exp[Long], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STREAM_SI64(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_unpacklo_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UNPACKLO_EPI8(a, b)
  }
            
  def _mm_min_epu8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPU8(a, b)
  }
            
  def _mm_min_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MIN_PD(a, b)
  }
            
  def _mm_move_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MOVE_SD(a, b)
  }
            
  def _mm_ucomige_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMIGE_SD(a, b)
  }
            
  def _mm_set_sd(a: Exp[Double]): Exp[__m128d] = {
    MM_SET_SD(a)
  }
            
  def _mm_ucomineq_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMINEQ_SD(a, b)
  }
            
  def _mm_bsrli_si128(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_BSRLI_SI128(a, imm8)
  }
            
  def _mm_cvtpd_ps(a: Exp[__m128d]): Exp[__m128] = {
    MM_CVTPD_PS(a)
  }
            
  def _mm_cvtsd_si32(a: Exp[__m128d]): Exp[Int] = {
    MM_CVTSD_SI32(a)
  }
            
  def _mm_cvtsi64x_si128(a: Exp[Long]): Exp[__m128i] = {
    MM_CVTSI64X_SI128(a)
  }
            
  def _mm_sra_epi16(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRA_EPI16(a, count)
  }
            
  def _mm_cmplt_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPLT_EPI8(a, b)
  }
            
  def _mm_store_si128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_SI128(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_clflush[A[_], T:Typ, U:Integral](p: Exp[A[T]], pOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(p)(MM_CLFLUSH(p, pOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_sra_epi32(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRA_EPI32(a, count)
  }
            
  def _mm_srai_epi32(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SRAI_EPI32(a, imm8)
  }
            
  def _mm_srli_si128(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SRLI_SI128(a, imm8)
  }
            
  def _mm_set_pd1(a: Exp[Double]): Exp[__m128d] = {
    MM_SET_PD1(a)
  }
            
  def _mm_comineq_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_COMINEQ_SD(a, b)
  }
            
  def _mm_cmpnlt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNLT_SD(a, b)
  }
            
  def _mm512_cvtsi512_si32(a: Exp[__m512i]): Exp[Int] = {
    MM512_CVTSI512_SI32(a)
  }
            
  def _mm_cvttps_epi32(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTTPS_EPI32(a)
  }
            
  def _mm_set1_epi64(a: Exp[__m64]): Exp[__m128i] = {
    MM_SET1_EPI64(a)
  }
            
  def _mm_cvtsd_si64x(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTSD_SI64X(a)
  }
            
  def _mm_sll_epi16(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SLL_EPI16(a, count)
  }
            
  def _mm_or_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_OR_PD(a, b)
  }
            
  def _mm_load_si128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_LOAD_SI128(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_add_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ADD_EPI32(a, b)
  }
            
  def _mm_sub_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_SUB_PD(a, b)
  }
            
  def _mm_unpackhi_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_UNPACKHI_PD(a, b)
  }
            
  def _mm_mullo_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MULLO_EPI16(a, b)
  }
            
  def _mm_set_pd(e1: Exp[Double], e0: Exp[Double]): Exp[__m128d] = {
    MM_SET_PD(e1, e0)
  }
            
  def _mm_cmpeq_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPEQ_PD(a, b)
  }
            
  def _mm_cmpgt_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPGT_EPI8(a, b)
  }
            
  def _mm_and_si128(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_AND_SI128(a, b)
  }
            
  def _mm_cmpeq_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPEQ_SD(a, b)
  }
            
  def _mm_loadl_epi64[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_LOADL_EPI64(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_srai_epi16(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SRAI_EPI16(a, imm8)
  }
            
  def _mm_packs_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PACKS_EPI16(a, b)
  }
            
  def _mm_cmplt_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPLT_EPI32(a, b)
  }
            
  def _mm_or_si128(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_OR_SI128(a, b)
  }
            
  def _mm_sqrt_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_SQRT_PD(a)
  }
            
  def _mm_cmpneq_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNEQ_SD(a, b)
  }
            
  def _mm_set1_pd(a: Exp[Double]): Exp[__m128d] = {
    MM_SET1_PD(a)
  }
            
  def _mm_sub_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SUB_EPI64(a, b)
  }
            
  def _mm_unpacklo_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UNPACKLO_EPI32(a, b)
  }
            
  def _mm_setr_pd(e1: Exp[Double], e0: Exp[Double]): Exp[__m128d] = {
    MM_SETR_PD(e1, e0)
  }
            
  def _mm_storel_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREL_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_castps_si128(a: Exp[__m128]): Exp[__m128i] = {
    MM_CASTPS_SI128(a)
  }
            
  def _mm_store_pd1[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_PD1(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_andnot_si128(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ANDNOT_SI128(a, b)
  }
            
  def _mm_set1_epi8(a: Exp[Byte]): Exp[__m128i] = {
    MM_SET1_EPI8(a)
  }
            
  def _mm_storer_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORER_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_sub_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_SUB_SD(a, b)
  }
            
  def _mm_mul_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MUL_PD(a, b)
  }
            
  def _mm_cmpge_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPGE_PD(a, b)
  }
            
  def _mm_srl_epi32(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRL_EPI32(a, count)
  }
            
  def _mm_comilt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_COMILT_SD(a, b)
  }
            
  def _mm_unpacklo_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_UNPACKLO_PD(a, b)
  }
            
  def _mm_shuffle_epi32(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SHUFFLE_EPI32(a, imm8)
  }
            
  def _mm_srl_epi64(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRL_EPI64(a, count)
  }
            
  def _mm_srl_epi16(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRL_EPI16(a, count)
  }
            
  def _mm_cvtpd_pi32(a: Exp[__m128d]): Exp[__m64] = {
    MM_CVTPD_PI32(a)
  }
            
  def _mm_comigt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_COMIGT_SD(a, b)
  }
            
  def _mm_shufflelo_epi16(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SHUFFLELO_EPI16(a, imm8)
  }
            
  def _mm_cmpeq_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPEQ_EPI16(a, b)
  }
            
  def _mm_move_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_MOVE_EPI64(a)
  }
            
  def _mm_load_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOAD_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_adds_epu16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ADDS_EPU16(a, b)
  }
            
  def _mm_unpackhi_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UNPACKHI_EPI32(a, b)
  }
            
  def _mm_movepi64_pi64(a: Exp[__m128i]): Exp[__m64] = {
    MM_MOVEPI64_PI64(a)
  }
            
  def _mm_cvttpd_epi32(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTTPD_EPI32(a)
  }
            
  def _mm_unpackhi_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UNPACKHI_EPI64(a, b)
  }
            
  def _mm_cmpeq_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPEQ_EPI32(a, b)
  }
            
  def _mm_cvtps_epi32(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTPS_EPI32(a)
  }
            
  def _mm_cvtsi64_sd(a: Exp[__m128d], b: Exp[Long]): Exp[__m128d] = {
    MM_CVTSI64_SD(a, b)
  }
            
  def _mm_slli_epi32(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SLLI_EPI32(a, imm8)
  }
            
  def _mm_cvtsi128_si64(a: Exp[__m128i]): Exp[Long] = {
    MM_CVTSI128_SI64(a)
  }
            
  def _mm_pause(): Exp[Unit] = {
    reflectEffect(MM_PAUSE())
  }
            
  def _mm512_cvtsd_f64(a: Exp[__m512d]): Exp[Double] = {
    MM512_CVTSD_F64(a)
  }
            
  def _mm_castps_pd(a: Exp[__m128]): Exp[__m128d] = {
    MM_CASTPS_PD(a)
  }
            
  def _mm_castsi128_pd(a: Exp[__m128i]): Exp[__m128d] = {
    MM_CASTSI128_PD(a)
  }
            
  def _mm_cmplt_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPLT_PD(a, b)
  }
            
  def _mm_srli_epi32(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SRLI_EPI32(a, imm8)
  }
            
  def _mm_ucomile_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMILE_SD(a, b)
  }
            
  def _mm_cvtsi32_sd(a: Exp[__m128d], b: Exp[Int]): Exp[__m128d] = {
    MM_CVTSI32_SD(a, b)
  }
            
  def _mm_xor_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_XOR_PD(a, b)
  }
            
  def _mm_mul_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MUL_EPU32(a, b)
  }
            
  def _mm_and_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_AND_PD(a, b)
  }
            
  def _mm_avg_epu16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_AVG_EPU16(a, b)
  }
            
  def _mm_shuffle_pd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_SHUFFLE_PD(a, b, imm8)
  }
            
  def _mm_cvtpd_epi32(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTPD_EPI32(a)
  }
            
  def _mm_madd_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MADD_EPI16(a, b)
  }
            
  def _mm_setr_epi64(e1: Exp[__m64], e0: Exp[__m64]): Exp[__m128i] = {
    MM_SETR_EPI64(e1, e0)
  }
            
  def _mm_min_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPI16(a, b)
  }
            
  def _mm_movpi64_epi64(a: Exp[__m64]): Exp[__m128i] = {
    MM_MOVPI64_EPI64(a)
  }
            
  def _mm_cvtsi128_si32(a: Exp[__m128i]): Exp[Int] = {
    MM_CVTSI128_SI32(a)
  }
            
  def _mm_mulhi_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MULHI_EPI16(a, b)
  }
            
  def _mm_cvtsi128_si64x(a: Exp[__m128i]): Exp[Long] = {
    MM_CVTSI128_SI64X(a)
  }
            
  def _mm_cmplt_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPLT_EPI16(a, b)
  }
            
  def _mm_cvtsd_ss(a: Exp[__m128], b: Exp[__m128d]): Exp[__m128] = {
    MM_CVTSD_SS(a, b)
  }
            
  def _mm_sub_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SUB_EPI16(a, b)
  }
            
  def _mm_cvtsd_f64(a: Exp[__m128d]): Exp[Double] = {
    MM_CVTSD_F64(a)
  }
            
  def _mm_cmpngt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNGT_SD(a, b)
  }
            
  def _mm_add_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ADD_EPI64(a, b)
  }
            
  def _mm_maskmoveu_si128[A[_], U:Integral](a: Exp[__m128i], mask: Exp[__m128i], mem_addr: Exp[A[Byte]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASKMOVEU_SI128(a, mask, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_min_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MIN_SD(a, b)
  }
            
  def _mm_setr_epi8(e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]): Exp[__m128i] = {
    MM_SETR_EPI8(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm_insert_epi16(a: Exp[__m128i], i: Exp[Int], imm8: Exp[Int]): Exp[__m128i] = {
    MM_INSERT_EPI16(a, i, imm8)
  }
            
  def _mm_unpacklo_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UNPACKLO_EPI16(a, b)
  }
            
  def _mm_cmpge_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPGE_SD(a, b)
  }
            
  def _mm_load_sd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOAD_SD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_subs_epu8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SUBS_EPU8(a, b)
  }
            
  def _mm_storel_epi64[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREL_EPI64(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cmpgt_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPGT_PD(a, b)
  }
            
  def _mm_slli_epi64(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SLLI_EPI64(a, imm8)
  }
            
  def _mm_bslli_si128(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_BSLLI_SI128(a, imm8)
  }
            
  def _mm_div_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_DIV_SD(a, b)
  }
            
  def _mm_sub_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SUB_EPI8(a, b)
  }
            
  def _mm_set_epi16(e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]): Exp[__m128i] = {
    MM_SET_EPI16(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm_set1_epi64x(a: Exp[Long]): Exp[__m128i] = {
    MM_SET1_EPI64X(a)
  }
            
  def _mm_loadu_si128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_LOADU_SI128(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cvttsd_si32(a: Exp[__m128d]): Exp[Int] = {
    MM_CVTTSD_SI32(a)
  }
            
  def _mm_slli_si128(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SLLI_SI128(a, imm8)
  }
            
  def _mm_slli_epi16(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SLLI_EPI16(a, imm8)
  }
            
  def _mm_cmpunord_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPUNORD_SD(a, b)
  }
            
  def _mm_undefined_pd(): Exp[__m128d] = {
    MM_UNDEFINED_PD()
  }
            
  def _mm_loadu_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOADU_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cvtss_sd(a: Exp[__m128d], b: Exp[__m128]): Exp[__m128d] = {
    MM_CVTSS_SD(a, b)
  }
            
  def _mm_adds_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ADDS_EPI16(a, b)
  }
            
  def _mm_castpd_si128(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CASTPD_SI128(a)
  }
            
  def _mm_unpackhi_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UNPACKHI_EPI16(a, b)
  }
            
  def _mm_cmpgt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPGT_SD(a, b)
  }
            
  def _mm_cvttsd_si64x(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTTSD_SI64X(a)
  }
            
  def _mm_cmplt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPLT_SD(a, b)
  }
            
  def _mm256_cvtsd_f64(a: Exp[__m256d]): Exp[Double] = {
    MM256_CVTSD_F64(a)
  }
            
  def _mm_add_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ADD_EPI8(a, b)
  }
            
  def _mm_cmpgt_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPGT_EPI32(a, b)
  }
            
  def _mm_unpacklo_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UNPACKLO_EPI64(a, b)
  }
            
  def _mm_loadl_pd[A[_], U:Integral](a: Exp[__m128d], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOADL_PD(a, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_setr_epi16(e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]): Exp[__m128i] = {
    MM_SETR_EPI16(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm_subs_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SUBS_EPI16(a, b)
  }
            
  def _mm_mul_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MUL_SD(a, b)
  }
            
  def _mm_stream_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STREAM_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cvttsd_si64(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTTSD_SI64(a)
  }
            
  def _mm_movemask_epi8(a: Exp[__m128i]): Exp[Int] = {
    MM_MOVEMASK_EPI8(a)
  }
            
  def _mm_cvtpi32_pd(a: Exp[__m64]): Exp[__m128d] = {
    MM_CVTPI32_PD(a)
  }
            
  def _mm_store_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_unpackhi_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UNPACKHI_EPI8(a, b)
  }
            
  def _mm_xor_si128(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_XOR_SI128(a, b)
  }
            
  def _mm_cvtepi32_ps(a: Exp[__m128i]): Exp[__m128] = {
    MM_CVTEPI32_PS(a)
  }
            
  def _mm_cvtsd_si64(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTSD_SI64(a)
  }
            
  def _mm_lfence(): Exp[Unit] = {
    reflectEffect(MM_LFENCE())
  }
            
  def _mm256_cvtsi256_si32(a: Exp[__m256i]): Exp[Int] = {
    MM256_CVTSI256_SI32(a)
  }
            
  def _mm_packus_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PACKUS_EPI16(a, b)
  }
            
  def _mm_storeu_si128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREU_SI128(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_packs_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PACKS_EPI32(a, b)
  }
            
  def _mm_cmpunord_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPUNORD_PD(a, b)
  }
            
  def _mm_comige_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_COMIGE_SD(a, b)
  }
            
  def _mm_storeh_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREH_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cmpnlt_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPNLT_PD(a, b)
  }
            
  def _mm_extract_epi16(a: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_EXTRACT_EPI16(a, imm8)
  }
            
  def _mm_sad_epu8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SAD_EPU8(a, b)
  }
            
  def _mm_adds_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ADDS_EPI8(a, b)
  }
            
  def _mm_cmpeq_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPEQ_EPI8(a, b)
  }
            
  def _mm_ucomilt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMILT_SD(a, b)
  }
            
  def _mm_stream_si128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STREAM_SI128(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_srli_epi64(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_SRLI_EPI64(a, imm8)
  }
            
  def _mm_cvtepi32_pd(a: Exp[__m128i]): Exp[__m128d] = {
    MM_CVTEPI32_PD(a)
  }
            
  def _mm_adds_epu8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ADDS_EPU8(a, b)
  }
            
  def _mm_mul_su32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MUL_SU32(a, b)
  }
            
  def _mm_setr_epi32(e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]): Exp[__m128i] = {
    MM_SETR_EPI32(e3, e2, e1, e0)
  }
            
  def _mm_cmple_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CMPLE_PD(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case iDef@MM_STREAM_SI64 (mem_addr, a, mem_addrOffset) =>
      _mm_stream_si64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_UNPACKLO_EPI8 (a, b) =>
      _mm_unpacklo_epi8(f(a), f(b))
    case MM_MIN_EPU8 (a, b) =>
      _mm_min_epu8(f(a), f(b))
    case MM_MIN_PD (a, b) =>
      _mm_min_pd(f(a), f(b))
    case MM_MOVE_SD (a, b) =>
      _mm_move_sd(f(a), f(b))
    case MM_UCOMIGE_SD (a, b) =>
      _mm_ucomige_sd(f(a), f(b))
    case MM_SET_SD (a) =>
      _mm_set_sd(f(a))
    case MM_UCOMINEQ_SD (a, b) =>
      _mm_ucomineq_sd(f(a), f(b))
    case MM_BSRLI_SI128 (a, imm8) =>
      _mm_bsrli_si128(f(a), f(imm8))
    case MM_CVTPD_PS (a) =>
      _mm_cvtpd_ps(f(a))
    case MM_CVTSD_SI32 (a) =>
      _mm_cvtsd_si32(f(a))
    case MM_CVTSI64X_SI128 (a) =>
      _mm_cvtsi64x_si128(f(a))
    case MM_SRA_EPI16 (a, count) =>
      _mm_sra_epi16(f(a), f(count))
    case MM_CMPLT_EPI8 (a, b) =>
      _mm_cmplt_epi8(f(a), f(b))
    case iDef@MM_STORE_SI128 (mem_addr, a, mem_addrOffset) =>
      _mm_store_si128(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_CLFLUSH (p, pOffset) =>
      _mm_clflush(iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(pOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_SRA_EPI32 (a, count) =>
      _mm_sra_epi32(f(a), f(count))
    case MM_SRAI_EPI32 (a, imm8) =>
      _mm_srai_epi32(f(a), f(imm8))
    case MM_SRLI_SI128 (a, imm8) =>
      _mm_srli_si128(f(a), f(imm8))
    case MM_SET_PD1 (a) =>
      _mm_set_pd1(f(a))
    case MM_COMINEQ_SD (a, b) =>
      _mm_comineq_sd(f(a), f(b))
    case MM_CMPNLT_SD (a, b) =>
      _mm_cmpnlt_sd(f(a), f(b))
    case MM512_CVTSI512_SI32 (a) =>
      _mm512_cvtsi512_si32(f(a))
    case MM_CVTTPS_EPI32 (a) =>
      _mm_cvttps_epi32(f(a))
    case MM_SET1_EPI64 (a) =>
      _mm_set1_epi64(f(a))
    case MM_CVTSD_SI64X (a) =>
      _mm_cvtsd_si64x(f(a))
    case MM_SLL_EPI16 (a, count) =>
      _mm_sll_epi16(f(a), f(count))
    case MM_OR_PD (a, b) =>
      _mm_or_pd(f(a), f(b))
    case iDef@MM_LOAD_SI128 (mem_addr, mem_addrOffset) =>
      _mm_load_si128(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_ADD_EPI32 (a, b) =>
      _mm_add_epi32(f(a), f(b))
    case MM_SUB_PD (a, b) =>
      _mm_sub_pd(f(a), f(b))
    case MM_UNPACKHI_PD (a, b) =>
      _mm_unpackhi_pd(f(a), f(b))
    case MM_MULLO_EPI16 (a, b) =>
      _mm_mullo_epi16(f(a), f(b))
    case MM_SET_PD (e1, e0) =>
      _mm_set_pd(f(e1), f(e0))
    case MM_CMPEQ_PD (a, b) =>
      _mm_cmpeq_pd(f(a), f(b))
    case MM_CMPGT_EPI8 (a, b) =>
      _mm_cmpgt_epi8(f(a), f(b))
    case MM_AND_SI128 (a, b) =>
      _mm_and_si128(f(a), f(b))
    case MM_CMPEQ_SD (a, b) =>
      _mm_cmpeq_sd(f(a), f(b))
    case iDef@MM_LOADL_EPI64 (mem_addr, mem_addrOffset) =>
      _mm_loadl_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SRAI_EPI16 (a, imm8) =>
      _mm_srai_epi16(f(a), f(imm8))
    case MM_PACKS_EPI16 (a, b) =>
      _mm_packs_epi16(f(a), f(b))
    case MM_CMPLT_EPI32 (a, b) =>
      _mm_cmplt_epi32(f(a), f(b))
    case MM_OR_SI128 (a, b) =>
      _mm_or_si128(f(a), f(b))
    case MM_SQRT_PD (a) =>
      _mm_sqrt_pd(f(a))
    case MM_CMPNEQ_SD (a, b) =>
      _mm_cmpneq_sd(f(a), f(b))
    case MM_SET1_PD (a) =>
      _mm_set1_pd(f(a))
    case MM_SUB_EPI64 (a, b) =>
      _mm_sub_epi64(f(a), f(b))
    case MM_UNPACKLO_EPI32 (a, b) =>
      _mm_unpacklo_epi32(f(a), f(b))
    case MM_SETR_PD (e1, e0) =>
      _mm_setr_pd(f(e1), f(e0))
    case iDef@MM_STOREL_PD (mem_addr, a, mem_addrOffset) =>
      _mm_storel_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CASTPS_SI128 (a) =>
      _mm_castps_si128(f(a))
    case iDef@MM_STORE_PD1 (mem_addr, a, mem_addrOffset) =>
      _mm_store_pd1(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_ANDNOT_SI128 (a, b) =>
      _mm_andnot_si128(f(a), f(b))
    case MM_SET1_EPI8 (a) =>
      _mm_set1_epi8(f(a))
    case iDef@MM_STORER_PD (mem_addr, a, mem_addrOffset) =>
      _mm_storer_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SUB_SD (a, b) =>
      _mm_sub_sd(f(a), f(b))
    case MM_MUL_PD (a, b) =>
      _mm_mul_pd(f(a), f(b))
    case MM_CMPGE_PD (a, b) =>
      _mm_cmpge_pd(f(a), f(b))
    case MM_SRL_EPI32 (a, count) =>
      _mm_srl_epi32(f(a), f(count))
    case MM_COMILT_SD (a, b) =>
      _mm_comilt_sd(f(a), f(b))
    case MM_UNPACKLO_PD (a, b) =>
      _mm_unpacklo_pd(f(a), f(b))
    case MM_SHUFFLE_EPI32 (a, imm8) =>
      _mm_shuffle_epi32(f(a), f(imm8))
    case MM_SRL_EPI64 (a, count) =>
      _mm_srl_epi64(f(a), f(count))
    case MM_SRL_EPI16 (a, count) =>
      _mm_srl_epi16(f(a), f(count))
    case MM_CVTPD_PI32 (a) =>
      _mm_cvtpd_pi32(f(a))
    case MM_COMIGT_SD (a, b) =>
      _mm_comigt_sd(f(a), f(b))
    case MM_SHUFFLELO_EPI16 (a, imm8) =>
      _mm_shufflelo_epi16(f(a), f(imm8))
    case MM_CMPEQ_EPI16 (a, b) =>
      _mm_cmpeq_epi16(f(a), f(b))
    case MM_MOVE_EPI64 (a) =>
      _mm_move_epi64(f(a))
    case iDef@MM_LOAD_PD (mem_addr, mem_addrOffset) =>
      _mm_load_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_ADDS_EPU16 (a, b) =>
      _mm_adds_epu16(f(a), f(b))
    case MM_UNPACKHI_EPI32 (a, b) =>
      _mm_unpackhi_epi32(f(a), f(b))
    case MM_MOVEPI64_PI64 (a) =>
      _mm_movepi64_pi64(f(a))
    case MM_CVTTPD_EPI32 (a) =>
      _mm_cvttpd_epi32(f(a))
    case MM_UNPACKHI_EPI64 (a, b) =>
      _mm_unpackhi_epi64(f(a), f(b))
    case MM_CMPEQ_EPI32 (a, b) =>
      _mm_cmpeq_epi32(f(a), f(b))
    case MM_CVTPS_EPI32 (a) =>
      _mm_cvtps_epi32(f(a))
    case MM_CVTSI64_SD (a, b) =>
      _mm_cvtsi64_sd(f(a), f(b))
    case MM_SLLI_EPI32 (a, imm8) =>
      _mm_slli_epi32(f(a), f(imm8))
    case MM_CVTSI128_SI64 (a) =>
      _mm_cvtsi128_si64(f(a))
    case MM_PAUSE () =>
      _mm_pause()
    case MM512_CVTSD_F64 (a) =>
      _mm512_cvtsd_f64(f(a))
    case MM_CASTPS_PD (a) =>
      _mm_castps_pd(f(a))
    case MM_CASTSI128_PD (a) =>
      _mm_castsi128_pd(f(a))
    case MM_CMPLT_PD (a, b) =>
      _mm_cmplt_pd(f(a), f(b))
    case MM_SRLI_EPI32 (a, imm8) =>
      _mm_srli_epi32(f(a), f(imm8))
    case MM_UCOMILE_SD (a, b) =>
      _mm_ucomile_sd(f(a), f(b))
    case MM_CVTSI32_SD (a, b) =>
      _mm_cvtsi32_sd(f(a), f(b))
    case MM_XOR_PD (a, b) =>
      _mm_xor_pd(f(a), f(b))
    case MM_MUL_EPU32 (a, b) =>
      _mm_mul_epu32(f(a), f(b))
    case MM_AND_PD (a, b) =>
      _mm_and_pd(f(a), f(b))
    case MM_AVG_EPU16 (a, b) =>
      _mm_avg_epu16(f(a), f(b))
    case MM_SHUFFLE_PD (a, b, imm8) =>
      _mm_shuffle_pd(f(a), f(b), f(imm8))
    case MM_CVTPD_EPI32 (a) =>
      _mm_cvtpd_epi32(f(a))
    case MM_MADD_EPI16 (a, b) =>
      _mm_madd_epi16(f(a), f(b))
    case MM_SETR_EPI64 (e1, e0) =>
      _mm_setr_epi64(f(e1), f(e0))
    case MM_MIN_EPI16 (a, b) =>
      _mm_min_epi16(f(a), f(b))
    case MM_MOVPI64_EPI64 (a) =>
      _mm_movpi64_epi64(f(a))
    case MM_CVTSI128_SI32 (a) =>
      _mm_cvtsi128_si32(f(a))
    case MM_MULHI_EPI16 (a, b) =>
      _mm_mulhi_epi16(f(a), f(b))
    case MM_CVTSI128_SI64X (a) =>
      _mm_cvtsi128_si64x(f(a))
    case MM_CMPLT_EPI16 (a, b) =>
      _mm_cmplt_epi16(f(a), f(b))
    case MM_CVTSD_SS (a, b) =>
      _mm_cvtsd_ss(f(a), f(b))
    case MM_SUB_EPI16 (a, b) =>
      _mm_sub_epi16(f(a), f(b))
    case MM_CVTSD_F64 (a) =>
      _mm_cvtsd_f64(f(a))
    case MM_CMPNGT_SD (a, b) =>
      _mm_cmpngt_sd(f(a), f(b))
    case MM_ADD_EPI64 (a, b) =>
      _mm_add_epi64(f(a), f(b))
    case iDef@MM_MASKMOVEU_SI128 (a, mask, mem_addr, mem_addrOffset) =>
      _mm_maskmoveu_si128(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_MIN_SD (a, b) =>
      _mm_min_sd(f(a), f(b))
    case MM_SETR_EPI8 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm_setr_epi8(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM_INSERT_EPI16 (a, i, imm8) =>
      _mm_insert_epi16(f(a), f(i), f(imm8))
    case MM_UNPACKLO_EPI16 (a, b) =>
      _mm_unpacklo_epi16(f(a), f(b))
    case MM_CMPGE_SD (a, b) =>
      _mm_cmpge_sd(f(a), f(b))
    case iDef@MM_LOAD_SD (mem_addr, mem_addrOffset) =>
      _mm_load_sd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SUBS_EPU8 (a, b) =>
      _mm_subs_epu8(f(a), f(b))
    case iDef@MM_STOREL_EPI64 (mem_addr, a, mem_addrOffset) =>
      _mm_storel_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CMPGT_PD (a, b) =>
      _mm_cmpgt_pd(f(a), f(b))
    case MM_SLLI_EPI64 (a, imm8) =>
      _mm_slli_epi64(f(a), f(imm8))
    case MM_BSLLI_SI128 (a, imm8) =>
      _mm_bslli_si128(f(a), f(imm8))
    case MM_DIV_SD (a, b) =>
      _mm_div_sd(f(a), f(b))
    case MM_SUB_EPI8 (a, b) =>
      _mm_sub_epi8(f(a), f(b))
    case MM_SET_EPI16 (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm_set_epi16(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM_SET1_EPI64X (a) =>
      _mm_set1_epi64x(f(a))
    case iDef@MM_LOADU_SI128 (mem_addr, mem_addrOffset) =>
      _mm_loadu_si128(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CVTTSD_SI32 (a) =>
      _mm_cvttsd_si32(f(a))
    case MM_SLLI_SI128 (a, imm8) =>
      _mm_slli_si128(f(a), f(imm8))
    case MM_SLLI_EPI16 (a, imm8) =>
      _mm_slli_epi16(f(a), f(imm8))
    case MM_CMPUNORD_SD (a, b) =>
      _mm_cmpunord_sd(f(a), f(b))
    case MM_UNDEFINED_PD () =>
      _mm_undefined_pd()
    case iDef@MM_LOADU_PD (mem_addr, mem_addrOffset) =>
      _mm_loadu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CVTSS_SD (a, b) =>
      _mm_cvtss_sd(f(a), f(b))
    case MM_ADDS_EPI16 (a, b) =>
      _mm_adds_epi16(f(a), f(b))
    case MM_CASTPD_SI128 (a) =>
      _mm_castpd_si128(f(a))
    case MM_UNPACKHI_EPI16 (a, b) =>
      _mm_unpackhi_epi16(f(a), f(b))
    case MM_CMPGT_SD (a, b) =>
      _mm_cmpgt_sd(f(a), f(b))
    case MM_CVTTSD_SI64X (a) =>
      _mm_cvttsd_si64x(f(a))
    case MM_CMPLT_SD (a, b) =>
      _mm_cmplt_sd(f(a), f(b))
    case MM256_CVTSD_F64 (a) =>
      _mm256_cvtsd_f64(f(a))
    case MM_ADD_EPI8 (a, b) =>
      _mm_add_epi8(f(a), f(b))
    case MM_CMPGT_EPI32 (a, b) =>
      _mm_cmpgt_epi32(f(a), f(b))
    case MM_UNPACKLO_EPI64 (a, b) =>
      _mm_unpacklo_epi64(f(a), f(b))
    case iDef@MM_LOADL_PD (a, mem_addr, mem_addrOffset) =>
      _mm_loadl_pd(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SETR_EPI16 (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm_setr_epi16(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM_SUBS_EPI16 (a, b) =>
      _mm_subs_epi16(f(a), f(b))
    case MM_MUL_SD (a, b) =>
      _mm_mul_sd(f(a), f(b))
    case iDef@MM_STREAM_PD (mem_addr, a, mem_addrOffset) =>
      _mm_stream_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CVTTSD_SI64 (a) =>
      _mm_cvttsd_si64(f(a))
    case MM_MOVEMASK_EPI8 (a) =>
      _mm_movemask_epi8(f(a))
    case MM_CVTPI32_PD (a) =>
      _mm_cvtpi32_pd(f(a))
    case iDef@MM_STORE_PD (mem_addr, a, mem_addrOffset) =>
      _mm_store_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_UNPACKHI_EPI8 (a, b) =>
      _mm_unpackhi_epi8(f(a), f(b))
    case MM_XOR_SI128 (a, b) =>
      _mm_xor_si128(f(a), f(b))
    case MM_CVTEPI32_PS (a) =>
      _mm_cvtepi32_ps(f(a))
    case MM_CVTSD_SI64 (a) =>
      _mm_cvtsd_si64(f(a))
    case MM_LFENCE () =>
      _mm_lfence()
    case MM256_CVTSI256_SI32 (a) =>
      _mm256_cvtsi256_si32(f(a))
    case MM_PACKUS_EPI16 (a, b) =>
      _mm_packus_epi16(f(a), f(b))
    case iDef@MM_STOREU_SI128 (mem_addr, a, mem_addrOffset) =>
      _mm_storeu_si128(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_PACKS_EPI32 (a, b) =>
      _mm_packs_epi32(f(a), f(b))
    case MM_CMPUNORD_PD (a, b) =>
      _mm_cmpunord_pd(f(a), f(b))
    case MM_COMIGE_SD (a, b) =>
      _mm_comige_sd(f(a), f(b))
    case iDef@MM_STOREH_PD (mem_addr, a, mem_addrOffset) =>
      _mm_storeh_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CMPNLT_PD (a, b) =>
      _mm_cmpnlt_pd(f(a), f(b))
    case MM_EXTRACT_EPI16 (a, imm8) =>
      _mm_extract_epi16(f(a), f(imm8))
    case MM_SAD_EPU8 (a, b) =>
      _mm_sad_epu8(f(a), f(b))
    case MM_ADDS_EPI8 (a, b) =>
      _mm_adds_epi8(f(a), f(b))
    case MM_CMPEQ_EPI8 (a, b) =>
      _mm_cmpeq_epi8(f(a), f(b))
    case MM_UCOMILT_SD (a, b) =>
      _mm_ucomilt_sd(f(a), f(b))
    case iDef@MM_STREAM_SI128 (mem_addr, a, mem_addrOffset) =>
      _mm_stream_si128(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SRLI_EPI64 (a, imm8) =>
      _mm_srli_epi64(f(a), f(imm8))
    case MM_CVTEPI32_PD (a) =>
      _mm_cvtepi32_pd(f(a))
    case MM_ADDS_EPU8 (a, b) =>
      _mm_adds_epu8(f(a), f(b))
    case MM_MUL_SU32 (a, b) =>
      _mm_mul_su32(f(a), f(b))
    case MM_SETR_EPI32 (e3, e2, e1, e0) =>
      _mm_setr_epi32(f(e3), f(e2), f(e1), f(e0))
    case MM_CMPLE_PD (a, b) =>
      _mm_cmple_pd(f(a), f(b))

    case Reflect(iDef@MM_STREAM_SI64 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STREAM_SI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MOVE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMIGE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMIGE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_SD (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_SD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMINEQ_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMINEQ_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BSRLI_SI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_BSRLI_SI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI64X_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI64X_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRA_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRA_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_SI128 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_SI128 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_CLFLUSH (p, pOffset), u, es) =>
      reflectMirrored(Reflect(MM_CLFLUSH (iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(pOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRA_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRA_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAI_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRAI_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLI_SI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRLI_SI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_PD1 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_PD1 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMINEQ_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMINEQ_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNLT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNLT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSI512_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSI512_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_SI64X (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_SI64X (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLL_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLL_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_OR_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_OR_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_SI128 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_SI128 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULLO_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULLO_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_PD (e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_PD (f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AND_SI128 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_AND_SI128 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADL_EPI64 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADL_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRAI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PACKS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_PACKS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_OR_SI128 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_OR_SI128 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SQRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SQRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_PD (e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_PD (f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREL_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREL_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTPS_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTPS_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_PD1 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_PD1 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ANDNOT_SI128 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ANDNOT_SI128 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORER_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORER_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MUL_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MUL_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRL_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRL_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMILT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMILT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHUFFLE_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SHUFFLE_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRL_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRL_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRL_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRL_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_PI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_PI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMIGT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMIGT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHUFFLELO_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SHUFFLELO_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVE_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVE_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADDS_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDS_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEPI64_PI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEPI64_PI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI64_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI64_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLI_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SLLI_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI128_SI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI128_SI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PAUSE (), u, es) =>
      reflectMirrored(Reflect(MM_PAUSE (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSD_F64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSD_F64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTPS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTPS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTSI128_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTSI128_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLI_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRLI_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMILE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMILE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI32_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI32_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_XOR_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_XOR_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MUL_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MUL_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AND_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_AND_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AVG_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_AVG_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHUFFLE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SHUFFLE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_EPI64 (e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_EPI64 (f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVPI64_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVPI64_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI128_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI128_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULHI_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULHI_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI128_SI64X (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI128_SI64X (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_F64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_F64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNGT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNGT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKMOVEU_SI128 (a, mask, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKMOVEU_SI128 (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_EPI8 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_EPI8 (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INSERT_EPI16 (a, i, imm8), u, es) =>
      reflectMirrored(Reflect(MM_INSERT_EPI16 (f(a), f(i), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_SD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_SD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUBS_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUBS_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREL_EPI64 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREL_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SLLI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BSLLI_SI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_BSLLI_SI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_EPI16 (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_EPI16 (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_EPI64X (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_EPI64X (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADU_SI128 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADU_SI128 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLI_SI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SLLI_SI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SLLI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPUNORD_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPUNORD_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNDEFINED_PD (), u, es) =>
      reflectMirrored(Reflect(MM_UNDEFINED_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADU_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADDS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTPD_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTPD_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_SI64X (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_SI64X (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSD_F64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSD_F64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADL_PD (a, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADL_PD (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_EPI16 (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_EPI16 (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MUL_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MUL_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STREAM_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STREAM_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_SI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_SI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEMASK_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEMASK_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPI32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPI32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_XOR_SI128 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_XOR_SI128 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI32_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI32_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_SI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_SI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LFENCE (), u, es) =>
      reflectMirrored(Reflect(MM_LFENCE (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSI256_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSI256_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PACKUS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_PACKUS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREU_SI128 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREU_SI128 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PACKS_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_PACKS_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPUNORD_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPUNORD_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMIGE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMIGE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREH_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREH_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNLT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNLT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXTRACT_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_EXTRACT_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SAD_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SAD_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADDS_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDS_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMILT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMILT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STREAM_SI128 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STREAM_SI128 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRLI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADDS_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDS_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MUL_SU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MUL_SU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_EPI32 (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_EPI32 (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSSE200 extends CGenIntrinsics {

  val IR: SSE2
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_STREAM_SI64(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_stream_si64((__int64*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_UNPACKLO_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpacklo_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVE_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_move_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_UCOMIGE_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomige_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_SD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_sd(${quote(a)})")
    case iDef@MM_UCOMINEQ_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomineq_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_BSRLI_SI128(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_bsrli_si128(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTPD_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpd_ps(${quote(a)})")
    case iDef@MM_CVTSD_SI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsd_si32(${quote(a)})")
    case iDef@MM_CVTSI64X_SI128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi64x_si128(${quote(a)})")
    case iDef@MM_SRA_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sra_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM_CMPLT_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_STORE_SI128(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_store_si128((__m128i*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_CLFLUSH(p, pOffset) =>
      headers += iDef.header
      stream.println(s"_mm_clflush((void const*) (${quote(p)  + (if(pOffset == Const(0)) "" else " + " + quote(pOffset))}));")
    case iDef@MM_SRA_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sra_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM_SRAI_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srai_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SRLI_SI128(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srli_si128(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SET_PD1(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_pd1(${quote(a)})")
    case iDef@MM_COMINEQ_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comineq_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNLT_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnlt_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTSI512_SI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtsi512_si32(${quote(a)})")
    case iDef@MM_CVTTPS_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttps_epi32(${quote(a)})")
    case iDef@MM_SET1_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_epi64(${quote(a)})")
    case iDef@MM_CVTSD_SI64X(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsd_si64x(${quote(a)})")
    case iDef@MM_SLL_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sll_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM_OR_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_or_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOAD_SI128(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_load_si128((__m128i const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_ADD_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_SUB_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNPACKHI_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpackhi_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MULLO_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mullo_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_PD(e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_pd(${quote(e1)}, ${quote(e0)})")
    case iDef@MM_CMPEQ_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_AND_SI128(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_and_si128(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPEQ_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOADL_EPI64(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadl_epi64((__m128i const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_SRAI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srai_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_PACKS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_packs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLT_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_OR_SI128(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_or_si128(${quote(a)}, ${quote(b)})")
    case iDef@MM_SQRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sqrt_pd(${quote(a)})")
    case iDef@MM_CMPNEQ_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET1_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_pd(${quote(a)})")
    case iDef@MM_SUB_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNPACKLO_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpacklo_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_SETR_PD(e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setr_pd(${quote(e1)}, ${quote(e0)})")
    case iDef@MM_STOREL_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storel_pd((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_CASTPS_SI128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_castps_si128(${quote(a)})")
    case iDef@MM_STORE_PD1(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_store_pd1((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_ANDNOT_SI128(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_andnot_si128(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET1_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_epi8(${quote(a)})")
    case iDef@MM_STORER_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storer_pd((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_SUB_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MUL_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mul_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGE_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRL_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srl_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM_COMILT_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comilt_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNPACKLO_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpacklo_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SHUFFLE_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_shuffle_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SRL_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srl_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM_SRL_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srl_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM_CVTPD_PI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpd_pi32(${quote(a)})")
    case iDef@MM_COMIGT_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comigt_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SHUFFLELO_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_shufflelo_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CMPEQ_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVE_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_move_epi64(${quote(a)})")
    case iDef@MM_LOAD_PD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_load_pd((double const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_ADDS_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_adds_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNPACKHI_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpackhi_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVEPI64_PI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movepi64_pi64(${quote(a)})")
    case iDef@MM_CVTTPD_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttpd_epi32(${quote(a)})")
    case iDef@MM_UNPACKHI_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpackhi_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPEQ_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTPS_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtps_epi32(${quote(a)})")
    case iDef@MM_CVTSI64_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi64_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SLLI_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_slli_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTSI128_SI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi128_si64(${quote(a)})")
    case iDef@MM_PAUSE() =>
      headers += iDef.header
      stream.println(s"_mm_pause();")
    case iDef@MM512_CVTSD_F64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtsd_f64(${quote(a)})")
    case iDef@MM_CASTPS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_castps_pd(${quote(a)})")
    case iDef@MM_CASTSI128_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_castsi128_pd(${quote(a)})")
    case iDef@MM_CMPLT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRLI_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srli_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_UCOMILE_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomile_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSI32_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi32_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_XOR_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_xor_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MUL_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mul_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM_AND_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_and_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_AVG_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_avg_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_SHUFFLE_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_shuffle_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CVTPD_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpd_epi32(${quote(a)})")
    case iDef@MM_MADD_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_madd_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_SETR_EPI64(e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setr_epi64(${quote(e1)}, ${quote(e0)})")
    case iDef@MM_MIN_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVPI64_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movpi64_epi64(${quote(a)})")
    case iDef@MM_CVTSI128_SI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi128_si32(${quote(a)})")
    case iDef@MM_MULHI_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mulhi_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSI128_SI64X(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi128_si64x(${quote(a)})")
    case iDef@MM_CMPLT_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSD_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsd_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_SUB_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSD_F64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsd_f64(${quote(a)})")
    case iDef@MM_CMPNGT_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpngt_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADD_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKMOVEU_SI128(a, mask, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_maskmoveu_si128(${quote(a)}, ${quote(mask)}, (char*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}));")
    case iDef@MM_MIN_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SETR_EPI8(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setr_epi8(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_INSERT_EPI16(a, i, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_insert_epi16(${quote(a)}, ${quote(i)}, ${quote(imm8)})")
    case iDef@MM_UNPACKLO_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpacklo_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGE_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOAD_SD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_load_sd((double const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_SUBS_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_subs_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_STOREL_EPI64(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storel_epi64((__m128i*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_CMPGT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SLLI_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_slli_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_BSLLI_SI128(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_bslli_si128(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_DIV_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_SUB_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_EPI16(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_epi16(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_SET1_EPI64X(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_epi64x(${quote(a)})")
    case iDef@MM_LOADU_SI128(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadu_si128((__m128i const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CVTTSD_SI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_si32(${quote(a)})")
    case iDef@MM_SLLI_SI128(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_slli_si128(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SLLI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_slli_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CMPUNORD_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpunord_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNDEFINED_PD() =>
      headers += iDef.header
      emitValDef(sym, s"_mm_undefined_pd()")
    case iDef@MM_LOADU_PD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadu_pd((double const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CVTSS_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtss_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADDS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_adds_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CASTPD_SI128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_castpd_si128(${quote(a)})")
    case iDef@MM_UNPACKHI_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpackhi_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTTSD_SI64X(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_si64x(${quote(a)})")
    case iDef@MM_CMPLT_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTSD_F64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtsd_f64(${quote(a)})")
    case iDef@MM_ADD_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNPACKLO_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpacklo_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOADL_PD(a, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadl_pd(${quote(a)}, (double const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_SETR_EPI16(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setr_epi16(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_SUBS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_subs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MUL_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mul_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_STREAM_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_stream_pd((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_CVTTSD_SI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_si64(${quote(a)})")
    case iDef@MM_MOVEMASK_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movemask_epi8(${quote(a)})")
    case iDef@MM_CVTPI32_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpi32_pd(${quote(a)})")
    case iDef@MM_STORE_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_store_pd((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_UNPACKHI_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpackhi_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_XOR_SI128(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_xor_si128(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTEPI32_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi32_ps(${quote(a)})")
    case iDef@MM_CVTSD_SI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsd_si64(${quote(a)})")
    case iDef@MM_LFENCE() =>
      headers += iDef.header
      stream.println(s"_mm_lfence();")
    case iDef@MM256_CVTSI256_SI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtsi256_si32(${quote(a)})")
    case iDef@MM_PACKUS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_packus_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_STOREU_SI128(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storeu_si128((__m128i*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_PACKS_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_packs_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPUNORD_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpunord_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_COMIGE_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comige_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_STOREH_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storeh_pd((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_CMPNLT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnlt_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_EXTRACT_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_extract_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SAD_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sad_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADDS_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_adds_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPEQ_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_UCOMILT_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomilt_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_STREAM_SI128(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_stream_si128((__m128i*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_SRLI_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srli_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTEPI32_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi32_pd(${quote(a)})")
    case iDef@MM_ADDS_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_adds_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MUL_SU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mul_su32(${quote(a)}, ${quote(b)})")
    case iDef@MM_SETR_EPI32(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setr_epi32(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_CMPLE_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_pd(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
