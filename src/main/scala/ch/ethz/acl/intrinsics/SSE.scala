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

    
trait SSE extends IntrinsicsBase {
  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTT_SS2SI(a: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store the upper 2 single-precision (32-bit) floating-point elements from "a"
   * into memory.
   * mem_addr: __m64*, a: __m128, mem_addrOffset: int
   */
  case class MM_STOREH_PI[A[_], U:Integral](mem_addr: Exp[A[__m64]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Divide the lower single-precision (32-bit) floating-point element in "a" by
   * the lower single-precision (32-bit) floating-point element in "b", store the
   * result in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_DIV_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for less-than-or-equal, store the result in the lower element of "dst",
   * and copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPLE_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for greater-than-or-equal, store the result in the lower element of "dst",
   * and copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPGE_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_SUB_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Macro: Get the exception state bits from the MXCSR control and status
   * register. The exception state may contain any of the following flags:
   * _MM_EXCEPT_INVALID, _MM_EXCEPT_DIV_ZERO, _MM_EXCEPT_DENORM,
   * _MM_EXCEPT_OVERFLOW, _MM_EXCEPT_UNDERFLOW, _MM_EXCEPT_INEXACT

   */
  case class MM_GET_EXCEPTION_STATE() extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Move the upper 2 single-precision (32-bit) floating-point elements from "b" to
   * the lower 2 elements of "dst", and copy the upper 2 elements from "a" to the
   * upper 2 elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_MOVEHL_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for less-than, store the result in the lower element of "dst", and copy
   * the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPLT_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m64, b: __m64
   */
  case class MM_MIN_PU8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Broadcast single-precision (32-bit) floating-point value "a" to all elements
   * of "dst".
   * a: float
   */
  case class MM_SET1_PS(a: Exp[Float]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m64, b: __m64
   */
  case class MM_MAX_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for equality, and return the boolean result (0 or 1).
   * a: __m128, b: __m128
   */
  case class MM_COMIEQ_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-greater-than, store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNGT_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst".
   * a: __m64, b: __m64
   */
  case class MM_MULHI_PU16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the lower packed 8-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst".
   * a: __m64
   */
  case class MM_CVTPI8_PS(a: Exp[__m64]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" using the control in "imm8", and store the
   * results in "dst".
   * a: __m64, imm8: int
   */
  case class M_PSHUFW(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the 32-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: int
   */
  case class MM_CVT_SI2SS(a: Exp[__m128], b: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 16-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTPS_PI16(a: Exp[__m128]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Return vector of type __m128 with all elements set to zero.

   */
  case class MM_SETZERO_PS() extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the lower packed unsigned 8-bit integers in "a" to packed
   * single-precision (32-bit) floating-point elements, and store the results in
   * "dst".
   * a: __m64
   */
  case class MM_CVTPU8_PS(a: Exp[__m64]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Conditionally store 8-bit integer elements from "a" into memory using "mask"
   * (elements are not stored when the highest bit is not set in the corresponding
   * element).
   * a: __m64, mask: __m64, mem_addr: char*, mem_addrOffset: int
   */
  case class M_MASKMOVQ[A[_], U:Integral](a: Exp[__m64], mask: Exp[__m64], mem_addr: Exp[A[Byte]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" to see if either is NaN, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPUNORD_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for less-than, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPLT_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst". The
   * maximum relative error for this approximation is less than 1.5*2^-12.
   * a: __m128
   */
  case class MM_RSQRT_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Extract a 16-bit integer from "a", selected with "imm8", and store the result
   * in the lower element of "dst".
   * a: __m64, imm8: int
   */
  case class MM_EXTRACT_PI16(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Set the MXCSR control and status register with the value in unsigned 32-bit
   * integer "a".
   * a: unsigned int
   */
  case class MM_SETCSR(a: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store 128-bits (composed of 4 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: float*, a: __m128, mem_addrOffset: int
   */
  case class MM_STORE_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m64, b: __m64
   */
  case class M_PAVGB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTTPS_PI32(a: Exp[__m128]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for greater-than-or-equal, and return the boolean result (0 or 1).
   * a: __m128, b: __m128
   */
  case class MM_COMIGE_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for greater-than-or-equal, and return the boolean result (0 or 1). This
   * instruction will not signal an exception for QNaNs.
   * a: __m128, b: __m128
   */
  case class MM_UCOMIGE_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128, b: __m128
   */
  case class MM_MAX_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-less-than, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNLT_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Broadcast single-precision (32-bit) floating-point value "a" to all elements
   * of "dst".
   * a: float
   */
  case class MM_SET_PS1(a: Exp[Float]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for less-than-or-equal, and return the boolean result (0 or 1).
   * a: __m128, b: __m128
   */
  case class MM_COMILE_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for equality, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPEQ_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * supplied values.
   * e3: float, e2: float, e1: float, e0: float
   */
  case class MM_SET_PS(e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for less-than, and return the boolean result (0 or 1).
   * a: __m128, b: __m128
   */
  case class MM_COMILT_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m64, b: __m64
   */
  case class M_PAVGW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-greater-than-or-equal, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNGE_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the 64-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __int64
   */
  case class MM_CVTSI64_SS(a: Exp[__m128], b: Exp[Long]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-greater-than-or-equal, store the result in the lower element of
   * "dst", and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNGE_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_ADD_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTTSS_SI64(a: Exp[__m128]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store the lower single-precision (32-bit) floating-point element from "a" into
   * memory. "mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: float*, a: __m128, mem_addrOffset: int
   */
  case class MM_STORE_SS[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-equal, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNEQ_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the absolute differences of packed unsigned 8-bit integers in "a" and
   * "b", then horizontally sum each consecutive 8 differences to produce four
   * unsigned 16-bit integers, and pack these unsigned 16-bit integers in the low
   * 16 bits of "dst".
   * a: __m64, b: __m64
   */
  case class M_PSADBW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Move the lower 2 single-precision (32-bit) floating-point elements from "b" to
   * the upper 2 elements of "dst", and copy the lower 2 elements from "a" to the
   * lower 2 elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_MOVELH_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "a", store the result in the lower element of "dst",
   * and copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * The maximum relative error for this approximation is less than 1.5*2^-12.
   * a: __m128
   */
  case class MM_RCP_SS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m64, b: __m64
   */
  case class M_PMAXSW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-less-than-or-equal, store the result in the lower element of
   * "dst", and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNLE_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for greater-than, store the result in the lower element of "dst", and copy
   * the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPGT_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for less-than-or-equal, and return the boolean result (0 or 1). This
   * instruction will not signal an exception for QNaNs.
   * a: __m128, b: __m128
   */
  case class MM_UCOMILE_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Load 2 single-precision (32-bit) floating-point elements from memory into the
   * lower 2 elements of "dst", and copy the upper 2 elements from "a" to "dst".
   * "mem_addr" does not need to be aligned on any particular boundary.
   * a: __m128, mem_addr: __m64 const*, mem_addrOffset: int
   */
  case class MM_LOADL_PI[A[_], U:Integral](a: Exp[__m128], mem_addr: Exp[A[__m64]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Load 128-bits (composed of 4 packed single-precision (32-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: float const*, mem_addrOffset: int
   */
  case class MM_LOAD_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of "a" and "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_UNPACKLO_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-greater-than, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNGT_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for equality, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128, b: __m128
   */
  case class MM_UCOMIEQ_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTSS_SI32(a: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the 16-bit integer "i" into "dst" at the
   * location specified by "imm8".
   * a: __m64, i: int, imm8: int
   */
  case class M_PINSRW(a: Exp[__m64], i: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTT_PS2PI(a: Exp[__m128]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_DIV_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Macro: Set the exception mask bits of the MXCSR control and status register to
   * the value in unsigned 32-bit integer "a". The exception mask may contain any
   * of the following flags: _MM_MASK_INVALID, _MM_MASK_DIV_ZERO, _MM_MASK_DENORM,
   * _MM_MASK_OVERFLOW, _MM_MASK_UNDERFLOW, _MM_MASK_INEXACT
   * a: unsigned int
   */
  case class MM_SET_EXCEPTION_MASK(a: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m64, b: __m64
   */
  case class M_PMINSW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Load a single-precision (32-bit) floating-point element from memory into all
   * elements of "dst".
   * mem_addr: float const*, mem_addrOffset: int
   */
  case class MM_LOAD_PS1[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_XOR_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" to see if neither is NaN, store the result in the lower element of "dst",
   * and copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPORD_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst", and copy the
   * upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128
   */
  case class MM_SQRT_SS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m64, b: __m64
   */
  case class MM_MAX_PU8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVT_SS2SI(a: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Copy the lower single-precision (32-bit) floating-point element of "a" to
   * "dst".
   * a: __m128
   */
  case class MM_CVTSS_F32(a: Exp[__m128]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Load 128-bits (composed of 4 packed single-precision (32-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: float const*, mem_addrOffset: int
   */
  case class MM_LOADU_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for not-equal, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128, b: __m128
   */
  case class MM_UCOMINEQ_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst".
   * a: __m128, b: __m128
   */
  case class MM_MIN_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store 64-bits of integer data from "a" into memory using a non-temporal memory
   * hint.
   * mem_addr: __m64*, a: __m64, mem_addrOffset: int
   */
  case class MM_STREAM_PI[A[_], U:Integral](mem_addr: Exp[A[__m64]], a: Exp[__m64], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for not-equal, and return the boolean result (0 or 1).
   * a: __m128, b: __m128
   */
  case class MM_COMINEQ_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128, b: __m128
   */
  case class MM_MIN_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst".
   * a: __m128, b: __m128
   */
  case class MM_MAX_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store the lower 2 single-precision (32-bit) floating-point elements from "a"
   * into memory.
   * mem_addr: __m64*, a: __m128, mem_addrOffset: int
   */
  case class MM_STOREL_PI[A[_], U:Integral](mem_addr: Exp[A[__m64]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Copy single-precision (32-bit) floating-point element "a" to the lower element
   * of "dst", and zero the upper 3 elements.
   * a: float
   */
  case class MM_SET_SS(a: Exp[Float]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the 16-bit integer "i" into "dst" at the
   * location specified by "imm8".
   * a: __m64, i: int, imm8: int
   */
  case class MM_INSERT_PI16(a: Exp[__m64], i: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Add the lower single-precision (32-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst", and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_ADD_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m64
   */
  case class MM_CVTPI16_PS(a: Exp[__m64]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVT_PS2PI(a: Exp[__m128]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half "a" and "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_UNPACKHI_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Load a single-precision (32-bit) floating-point element from memory into the
   * lower of "dst", and zero the upper 3 elements. "mem_addr" does not need to be
   * aligned on any particular boundary.
   * mem_addr: float const*, mem_addrOffset: int
   */
  case class MM_LOAD_SS[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Create mask from the most significant bit of each 8-bit element in "a", and
   * store the result in "dst".
   * a: __m64
   */
  case class MM_MOVEMASK_PI8(a: Exp[__m64]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for greater-than, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128, b: __m128
   */
  case class MM_UCOMIGT_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "b" to packed single-precision (32-bit)
   * floating-point elements, store the results in the lower 2 elements of "dst",
   * and copy the upper 2 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m64
   */
  case class MM_CVT_PI2PS(a: Exp[__m128], b: Exp[__m64]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Macro: Get the exception mask bits from the MXCSR control and status register.
   * The exception mask may contain any of the following flags: _MM_MASK_INVALID,
   * _MM_MASK_DIV_ZERO, _MM_MASK_DENORM, _MM_MASK_OVERFLOW, _MM_MASK_UNDERFLOW,
   * _MM_MASK_INEXACT

   */
  case class MM_GET_EXCEPTION_MASK() extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Load 2 single-precision (32-bit) floating-point elements from memory into the
   * upper 2 elements of "dst", and copy the lower 2 elements from "a" to "dst".
   * "mem_addr" does not need to be aligned on any particular boundary.
   * a: __m128, mem_addr: __m64 const*, mem_addrOffset: int
   */
  case class MM_LOADH_PI[A[_], U:Integral](a: Exp[__m128], mem_addr: Exp[A[__m64]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "a", store the result in the lower element
   * of "dst", and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". The maximum relative error for this approximation is less than
   * 1.5*2^-12.
   * a: __m128
   */
  case class MM_RSQRT_SS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" to see if either is NaN, store the result in the lower element of "dst",
   * and copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPUNORD_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store the lower single-precision (32-bit) floating-point element from "a" into
   * 4 contiguous elements in memory. "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: float*, a: __m128, mem_addrOffset: int
   */
  case class MM_STORE_PS1[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_SUB_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Create mask from the most significant bit of each 8-bit element in "a", and
   * store the result in "dst".
   * a: __m64
   */
  case class M_PMOVMSKB(a: Exp[__m64]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_MUL_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m64, b: __m64
   */
  case class M_PMAXUB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-equal, store the result in the lower element of "dst", and copy
   * the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNEQ_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_SQRT_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m64, b: __m64
   */
  case class MM_AVG_PU16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store 4 single-precision (32-bit) floating-point elements from "a" into memory
   * in reverse order.
   * 	"mem_addr" must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: float*, a: __m128, mem_addrOffset: int
   */
  case class MM_STORER_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "b" to packed single-precision (32-bit)
   * floating-point elements, store the results in the lower 2 elements of "dst",
   * and copy the upper 2 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m64
   */
  case class MM_CVTPI32_PS(a: Exp[__m128], b: Exp[__m64]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * supplied values in reverse order.
   * e3: float, e2: float, e1: float, e0: float
   */
  case class MM_SETR_PS(e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Move the lower single-precision (32-bit) floating-point element from "b" to
   * the lower element of "dst", and copy the upper 3 elements from "a" to the
   * upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_MOVE_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-less-than, store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNLT_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Load 4 single-precision (32-bit) floating-point elements from memory into
   * "dst" in reverse order. mem_addr must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: float const*, mem_addrOffset: int
   */
  case class MM_LOADR_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTSS_SI64(a: Exp[__m128]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for greater-than, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPGT_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for less-than, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128, b: __m128
   */
  case class MM_UCOMILT_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_MUL_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Return vector of type __m128 with undefined elements.

   */
  case class MM_UNDEFINED_PS() extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a serializing operation on all store-to-memory instructions that were
   * issued prior to this instruction. Guarantees that every store instruction that
   * precedes, in program order, is globally visible before any store instruction
   * which follows the fence in program order.

   */
  case class MM_SFENCE() extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_ANDNOT_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" for equality, store the result in the lower element of "dst", and copy the
   * upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPEQ_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for greater-than-or-equal, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPGE_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m64, b: __m64
   */
  case class MM_MIN_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Copy the lower single-precision (32-bit) floating-point element of "a" to
   * "dst".
   * a: __m512
   */
  case class MM512_CVTSS_F32(a: Exp[__m512]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 1.5*2^-12.
   * a: __m128
   */
  case class MM_RCP_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m64, b: __m64
   */
  case class M_PMINUB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Extract a 16-bit integer from "a", selected with "imm8", and store the result
   * in the lower element of "dst".
   * a: __m64, imm8: int
   */
  case class M_PEXTRW(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 8-bit integers, and store the results in lower 4 elements of "dst".
   * a: __m128
   */
  case class MM_CVTPS_PI8(a: Exp[__m128]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store 128-bits (composed of 4 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory using a non-temporal memory hint.
   * 	"mem_addr"
   * must be aligned on a 16-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: float*, a: __m128, mem_addrOffset: int
   */
  case class MM_STREAM_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-less-than-or-equal, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPNLE_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" for greater-than, and return the boolean result (0 or 1).
   * a: __m128, b: __m128
   */
  case class MM_COMIGT_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Set each bit of mask "dst" based on the most significant bit of the
   * corresponding packed single-precision (32-bit) floating-point element in "a".
   * a: __m128
   */
  case class MM_MOVEMASK_PS(a: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for less-than-or-equal, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPLE_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Macro: Get the rounding mode bits from the MXCSR control and status register.
   * The rounding mode may contain any of the following flags: _MM_ROUND_NEAREST,
   * _MM_ROUND_DOWN, _MM_ROUND_UP, _MM_ROUND_TOWARD_ZERO

   */
  case class MM_GET_ROUNDING_MODE() extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the 32-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: int
   */
  case class MM_CVTSI32_SS(a: Exp[__m128], b: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, store the results in the lower 2 elements of "dst",
   * then covert the packed 32-bit integers in "a" to single-precision (32-bit)
   * floating-point element, and store the results in the upper 2 elements of
   * "dst".
   * a: __m64, b: __m64
   */
  case class MM_CVTPI32X2_PS(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the absolute differences of packed unsigned 8-bit integers in "a" and
   * "b", then horizontally sum each consecutive 8 differences to produce four
   * unsigned 16-bit integers, and pack these unsigned 16-bit integers in the low
   * 16 bits of "dst".
   * a: __m64, b: __m64
   */
  case class MM_SAD_PU8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m64, b: __m64
   */
  case class MM_AVG_PU8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Macro: Set the rounding mode bits of the MXCSR control and status register to
   * the value in unsigned 32-bit integer "a". The rounding mode may contain any of
   * the following flags: _MM_ROUND_NEAREST, _MM_ROUND_DOWN, _MM_ROUND_UP,
   * _MM_ROUND_TOWARD_ZERO
   * a: unsigned int
   */
  case class MM_SET_ROUNDING_MODE(a: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTTSS_SI32(a: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" to see if neither is NaN, and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_CMPORD_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst".
   * a: __m128, b: __m128, imm8: unsigned int
   */
  case class MM_SHUFFLE_PS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[UInt]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" using the control in "imm8", and store the
   * results in "dst".
   * a: __m64, imm8: int
   */
  case class MM_SHUFFLE_PI16(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Load a single-precision (32-bit) floating-point element from memory into all
   * elements of "dst".
   * mem_addr: float const*, mem_addrOffset: int
   */
  case class MM_LOAD1_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store 128-bits (composed of 4 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: float*, a: __m128, mem_addrOffset: int
   */
  case class MM_STOREU_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Store the lower single-precision (32-bit) floating-point element from "a" into
   * 4 contiguous elements in memory. "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: float*, a: __m128, mem_addrOffset: int
   */
  case class MM_STORE1_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Macro: Transpose the 4x4 matrix formed by the 4 rows of single-precision
   * (32-bit) floating-point elements in "row0", "row1", "row2", and "row3", and
   * store the transposed matrix in these vectors ("row0" now contains column 0,
   * etc.).
   * row0: __m128, row1: __m128, row2: __m128, row3: __m128
   */
  case class MM_TRANSPOSE4_PS(row0: Exp[__m128], row1: Exp[__m128], row2: Exp[__m128], row3: Exp[__m128]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Fetch the line of data from memory that contains address "p" to a location in
   * the cache heirarchy specified by the locality hint "i".
   * p: char const*, i: int, pOffset: int
   */
  case class MM_PREFETCH[A[_], U:Integral](p: Exp[A[Byte]], i: Exp[Int], pOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Copy the lower single-precision (32-bit) floating-point element of "a" to
   * "dst".
   * a: __m256
   */
  case class MM256_CVTSS_F32(a: Exp[__m256]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_AND_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Macro: Set the exception state bits of the MXCSR control and status register
   * to the value in unsigned 32-bit integer "a". The exception state may contain
   * any of the following flags: _MM_EXCEPT_INVALID, _MM_EXCEPT_DIV_ZERO,
   * _MM_EXCEPT_DENORM, _MM_EXCEPT_OVERFLOW, _MM_EXCEPT_UNDERFLOW,
   * _MM_EXCEPT_INEXACT
   * a: unsigned int
   */
  case class MM_SET_EXCEPTION_STATE(a: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Macro: Set the flush zero bits of the MXCSR control and status register to the
   * value in unsigned 32-bit integer "a". The flush zero may contain any of the
   * following flags: _MM_FLUSH_ZERO_ON or _MM_FLUSH_ZERO_OFF
   * a: unsigned int
   */
  case class MM_SET_FLUSH_ZERO_MODE(a: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Get the unsigned 32-bit value of the MXCSR control and status register.

   */
  case class MM_GETCSR() extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Macro: Get the flush zero bits from the MXCSR control and status register. The
   * flush zero may contain any of the following flags: _MM_FLUSH_ZERO_ON or
   * _MM_FLUSH_ZERO_OFF

   */
  case class MM_GET_FLUSH_ZERO_MODE() extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_OR_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Conditionally store 8-bit integer elements from "a" into memory using "mask"
   * (elements are not stored when the highest bit is not set in the corresponding
   * element) and a non-temporal memory hint.
   * a: __m64, mask: __m64, mem_addr: char*, mem_addrOffset: int
   */
  case class MM_MASKMOVE_SI64[A[_], U:Integral](a: Exp[__m64], mask: Exp[__m64], mem_addr: Exp[A[Byte]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst".
   * a: __m64
   */
  case class MM_CVTPU16_PS(a: Exp[__m64]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTPS_PI32(a: Exp[__m128]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst".
   * a: __m64, b: __m64
   */
  case class M_PMULHUW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  def _mm_cvtt_ss2si(a: Exp[__m128]): Exp[Int] = {
    MM_CVTT_SS2SI(a)
  }
            
  def _mm_storeh_pi[A[_], U:Integral](mem_addr: Exp[A[__m64]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREH_PI(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_div_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_DIV_SS(a, b)
  }
            
  def _mm_cmple_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPLE_SS(a, b)
  }
            
  def _mm_cmpge_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPGE_SS(a, b)
  }
            
  def _mm_sub_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_SUB_PS(a, b)
  }
            
  def _MM_GET_EXCEPTION_STATE(): Exp[UInt] = {
    MM_GET_EXCEPTION_STATE()
  }
            
  def _mm_movehl_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MOVEHL_PS(a, b)
  }
            
  def _mm_cmplt_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPLT_SS(a, b)
  }
            
  def _mm_min_pu8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MIN_PU8(a, b)
  }
            
  def _mm_set1_ps(a: Exp[Float]): Exp[__m128] = {
    MM_SET1_PS(a)
  }
            
  def _mm_max_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MAX_PI16(a, b)
  }
            
  def _mm_comieq_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_COMIEQ_SS(a, b)
  }
            
  def _mm_cmpngt_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNGT_SS(a, b)
  }
            
  def _mm_mulhi_pu16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MULHI_PU16(a, b)
  }
            
  def _mm_cvtpi8_ps(a: Exp[__m64]): Exp[__m128] = {
    MM_CVTPI8_PS(a)
  }
            
  def _m_pshufw(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    M_PSHUFW(a, imm8)
  }
            
  def _mm_cvt_si2ss(a: Exp[__m128], b: Exp[Int]): Exp[__m128] = {
    MM_CVT_SI2SS(a, b)
  }
            
  def _mm_cvtps_pi16(a: Exp[__m128]): Exp[__m64] = {
    MM_CVTPS_PI16(a)
  }
            
  def _mm_setzero_ps(): Exp[__m128] = {
    MM_SETZERO_PS()
  }
            
  def _mm_cvtpu8_ps(a: Exp[__m64]): Exp[__m128] = {
    MM_CVTPU8_PS(a)
  }
            
  def _m_maskmovq[A[_], U:Integral](a: Exp[__m64], mask: Exp[__m64], mem_addr: Exp[A[Byte]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(M_MASKMOVQ(a, mask, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cmpunord_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPUNORD_PS(a, b)
  }
            
  def _mm_cmplt_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPLT_PS(a, b)
  }
            
  def _mm_rsqrt_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_RSQRT_PS(a)
  }
            
  def _mm_extract_pi16(a: Exp[__m64], imm8: Exp[Int]): Exp[Int] = {
    MM_EXTRACT_PI16(a, imm8)
  }
            
  def _mm_setcsr(a: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_SETCSR(a))
  }
            
  def _mm_store_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _m_pavgb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PAVGB(a, b)
  }
            
  def _mm_cvttps_pi32(a: Exp[__m128]): Exp[__m64] = {
    MM_CVTTPS_PI32(a)
  }
            
  def _mm_comige_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_COMIGE_SS(a, b)
  }
            
  def _mm_ucomige_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_UCOMIGE_SS(a, b)
  }
            
  def _mm_max_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MAX_SS(a, b)
  }
            
  def _mm_cmpnlt_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNLT_PS(a, b)
  }
            
  def _mm_set_ps1(a: Exp[Float]): Exp[__m128] = {
    MM_SET_PS1(a)
  }
            
  def _mm_comile_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_COMILE_SS(a, b)
  }
            
  def _mm_cmpeq_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPEQ_PS(a, b)
  }
            
  def _mm_set_ps(e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]): Exp[__m128] = {
    MM_SET_PS(e3, e2, e1, e0)
  }
            
  def _mm_comilt_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_COMILT_SS(a, b)
  }
            
  def _m_pavgw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PAVGW(a, b)
  }
            
  def _mm_cmpnge_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNGE_PS(a, b)
  }
            
  def _mm_cvtsi64_ss(a: Exp[__m128], b: Exp[Long]): Exp[__m128] = {
    MM_CVTSI64_SS(a, b)
  }
            
  def _mm_cmpnge_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNGE_SS(a, b)
  }
            
  def _mm_add_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_ADD_PS(a, b)
  }
            
  def _mm_cvttss_si64(a: Exp[__m128]): Exp[Long] = {
    MM_CVTTSS_SI64(a)
  }
            
  def _mm_store_ss[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_SS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cmpneq_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNEQ_PS(a, b)
  }
            
  def _m_psadbw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PSADBW(a, b)
  }
            
  def _mm_movelh_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MOVELH_PS(a, b)
  }
            
  def _mm_rcp_ss(a: Exp[__m128]): Exp[__m128] = {
    MM_RCP_SS(a)
  }
            
  def _m_pmaxsw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PMAXSW(a, b)
  }
            
  def _mm_cmpnle_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNLE_SS(a, b)
  }
            
  def _mm_cmpgt_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPGT_SS(a, b)
  }
            
  def _mm_ucomile_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_UCOMILE_SS(a, b)
  }
            
  def _mm_loadl_pi[A[_], U:Integral](a: Exp[__m128], mem_addr: Exp[A[__m64]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_LOADL_PI(a, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_load_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_LOAD_PS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_unpacklo_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_UNPACKLO_PS(a, b)
  }
            
  def _mm_cmpngt_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNGT_PS(a, b)
  }
            
  def _mm_ucomieq_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_UCOMIEQ_SS(a, b)
  }
            
  def _mm_cvtss_si32(a: Exp[__m128]): Exp[Int] = {
    MM_CVTSS_SI32(a)
  }
            
  def _m_pinsrw(a: Exp[__m64], i: Exp[Int], imm8: Exp[Int]): Exp[__m64] = {
    M_PINSRW(a, i, imm8)
  }
            
  def _mm_cvtt_ps2pi(a: Exp[__m128]): Exp[__m64] = {
    MM_CVTT_PS2PI(a)
  }
            
  def _mm_div_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_DIV_PS(a, b)
  }
            
  def _MM_SET_EXCEPTION_MASK(a: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_SET_EXCEPTION_MASK(a))
  }
            
  def _m_pminsw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PMINSW(a, b)
  }
            
  def _mm_load_ps1[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_LOAD_PS1(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_xor_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_XOR_PS(a, b)
  }
            
  def _mm_cmpord_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPORD_SS(a, b)
  }
            
  def _mm_sqrt_ss(a: Exp[__m128]): Exp[__m128] = {
    MM_SQRT_SS(a)
  }
            
  def _mm_max_pu8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MAX_PU8(a, b)
  }
            
  def _mm_cvt_ss2si(a: Exp[__m128]): Exp[Int] = {
    MM_CVT_SS2SI(a)
  }
            
  def _mm_cvtss_f32(a: Exp[__m128]): Exp[Float] = {
    MM_CVTSS_F32(a)
  }
            
  def _mm_loadu_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_LOADU_PS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_ucomineq_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_UCOMINEQ_SS(a, b)
  }
            
  def _mm_min_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MIN_PS(a, b)
  }
            
  def _mm_stream_pi[A[_], U:Integral](mem_addr: Exp[A[__m64]], a: Exp[__m64], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STREAM_PI(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_comineq_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_COMINEQ_SS(a, b)
  }
            
  def _mm_min_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MIN_SS(a, b)
  }
            
  def _mm_max_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MAX_PS(a, b)
  }
            
  def _mm_storel_pi[A[_], U:Integral](mem_addr: Exp[A[__m64]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREL_PI(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_set_ss(a: Exp[Float]): Exp[__m128] = {
    MM_SET_SS(a)
  }
            
  def _mm_insert_pi16(a: Exp[__m64], i: Exp[Int], imm8: Exp[Int]): Exp[__m64] = {
    MM_INSERT_PI16(a, i, imm8)
  }
            
  def _mm_add_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_ADD_SS(a, b)
  }
            
  def _mm_cvtpi16_ps(a: Exp[__m64]): Exp[__m128] = {
    MM_CVTPI16_PS(a)
  }
            
  def _mm_cvt_ps2pi(a: Exp[__m128]): Exp[__m64] = {
    MM_CVT_PS2PI(a)
  }
            
  def _mm_unpackhi_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_UNPACKHI_PS(a, b)
  }
            
  def _mm_load_ss[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_LOAD_SS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_movemask_pi8(a: Exp[__m64]): Exp[Int] = {
    MM_MOVEMASK_PI8(a)
  }
            
  def _mm_ucomigt_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_UCOMIGT_SS(a, b)
  }
            
  def _mm_cvt_pi2ps(a: Exp[__m128], b: Exp[__m64]): Exp[__m128] = {
    MM_CVT_PI2PS(a, b)
  }
            
  def _MM_GET_EXCEPTION_MASK(): Exp[UInt] = {
    MM_GET_EXCEPTION_MASK()
  }
            
  def _mm_loadh_pi[A[_], U:Integral](a: Exp[__m128], mem_addr: Exp[A[__m64]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_LOADH_PI(a, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_rsqrt_ss(a: Exp[__m128]): Exp[__m128] = {
    MM_RSQRT_SS(a)
  }
            
  def _mm_cmpunord_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPUNORD_SS(a, b)
  }
            
  def _mm_store_ps1[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_PS1(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_sub_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_SUB_SS(a, b)
  }
            
  def _m_pmovmskb(a: Exp[__m64]): Exp[Int] = {
    M_PMOVMSKB(a)
  }
            
  def _mm_mul_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MUL_PS(a, b)
  }
            
  def _m_pmaxub(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PMAXUB(a, b)
  }
            
  def _mm_cmpneq_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNEQ_SS(a, b)
  }
            
  def _mm_sqrt_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_SQRT_PS(a)
  }
            
  def _mm_avg_pu16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_AVG_PU16(a, b)
  }
            
  def _mm_storer_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORER_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cvtpi32_ps(a: Exp[__m128], b: Exp[__m64]): Exp[__m128] = {
    MM_CVTPI32_PS(a, b)
  }
            
  def _mm_setr_ps(e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]): Exp[__m128] = {
    MM_SETR_PS(e3, e2, e1, e0)
  }
            
  def _mm_move_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MOVE_SS(a, b)
  }
            
  def _mm_cmpnlt_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNLT_SS(a, b)
  }
            
  def _mm_loadr_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_LOADR_PS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cvtss_si64(a: Exp[__m128]): Exp[Long] = {
    MM_CVTSS_SI64(a)
  }
            
  def _mm_cmpgt_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPGT_PS(a, b)
  }
            
  def _mm_ucomilt_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_UCOMILT_SS(a, b)
  }
            
  def _mm_mul_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MUL_SS(a, b)
  }
            
  def _mm_undefined_ps(): Exp[__m128] = {
    MM_UNDEFINED_PS()
  }
            
  def _mm_sfence(): Exp[Unit] = {
    reflectEffect(MM_SFENCE())
  }
            
  def _mm_andnot_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_ANDNOT_PS(a, b)
  }
            
  def _mm_cmpeq_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPEQ_SS(a, b)
  }
            
  def _mm_cmpge_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPGE_PS(a, b)
  }
            
  def _mm_min_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MIN_PI16(a, b)
  }
            
  def _mm512_cvtss_f32(a: Exp[__m512]): Exp[Float] = {
    MM512_CVTSS_F32(a)
  }
            
  def _mm_rcp_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_RCP_PS(a)
  }
            
  def _m_pminub(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PMINUB(a, b)
  }
            
  def _m_pextrw(a: Exp[__m64], imm8: Exp[Int]): Exp[Int] = {
    M_PEXTRW(a, imm8)
  }
            
  def _mm_cvtps_pi8(a: Exp[__m128]): Exp[__m64] = {
    MM_CVTPS_PI8(a)
  }
            
  def _mm_stream_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STREAM_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cmpnle_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPNLE_PS(a, b)
  }
            
  def _mm_comigt_ss(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_COMIGT_SS(a, b)
  }
            
  def _mm_movemask_ps(a: Exp[__m128]): Exp[Int] = {
    MM_MOVEMASK_PS(a)
  }
            
  def _mm_cmple_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPLE_PS(a, b)
  }
            
  def _MM_GET_ROUNDING_MODE(): Exp[UInt] = {
    MM_GET_ROUNDING_MODE()
  }
            
  def _mm_cvtsi32_ss(a: Exp[__m128], b: Exp[Int]): Exp[__m128] = {
    MM_CVTSI32_SS(a, b)
  }
            
  def _mm_cvtpi32x2_ps(a: Exp[__m64], b: Exp[__m64]): Exp[__m128] = {
    MM_CVTPI32X2_PS(a, b)
  }
            
  def _mm_sad_pu8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SAD_PU8(a, b)
  }
            
  def _mm_avg_pu8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_AVG_PU8(a, b)
  }
            
  def _MM_SET_ROUNDING_MODE(a: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_SET_ROUNDING_MODE(a))
  }
            
  def _mm_cvttss_si32(a: Exp[__m128]): Exp[Int] = {
    MM_CVTTSS_SI32(a)
  }
            
  def _mm_cmpord_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CMPORD_PS(a, b)
  }
            
  def _mm_shuffle_ps(a: Exp[__m128], b: Exp[__m128], imm8: Exp[UInt]): Exp[__m128] = {
    MM_SHUFFLE_PS(a, b, imm8)
  }
            
  def _mm_shuffle_pi16(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    MM_SHUFFLE_PI16(a, imm8)
  }
            
  def _mm_load1_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_LOAD1_PS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_storeu_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREU_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_store1_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE1_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _MM_TRANSPOSE4_PS(row0: Exp[__m128], row1: Exp[__m128], row2: Exp[__m128], row3: Exp[__m128]): Exp[Unit] = {
    reflectEffect(MM_TRANSPOSE4_PS(row0, row1, row2, row3))
  }
            
  def _mm_prefetch[A[_], U:Integral](p: Exp[A[Byte]], i: Exp[Int], pOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(p)(MM_PREFETCH(p, i, pOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_cvtss_f32(a: Exp[__m256]): Exp[Float] = {
    MM256_CVTSS_F32(a)
  }
            
  def _mm_and_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_AND_PS(a, b)
  }
            
  def _MM_SET_EXCEPTION_STATE(a: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_SET_EXCEPTION_STATE(a))
  }
            
  def _MM_SET_FLUSH_ZERO_MODE(a: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_SET_FLUSH_ZERO_MODE(a))
  }
            
  def _mm_getcsr(): Exp[UInt] = {
    MM_GETCSR()
  }
            
  def _MM_GET_FLUSH_ZERO_MODE(): Exp[UInt] = {
    MM_GET_FLUSH_ZERO_MODE()
  }
            
  def _mm_or_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_OR_PS(a, b)
  }
            
  def _mm_maskmove_si64[A[_], U:Integral](a: Exp[__m64], mask: Exp[__m64], mem_addr: Exp[A[Byte]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASKMOVE_SI64(a, mask, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cvtpu16_ps(a: Exp[__m64]): Exp[__m128] = {
    MM_CVTPU16_PS(a)
  }
            
  def _mm_cvtps_pi32(a: Exp[__m128]): Exp[__m64] = {
    MM_CVTPS_PI32(a)
  }
            
  def _m_pmulhuw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PMULHUW(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_CVTT_SS2SI (a) =>
      _mm_cvtt_ss2si(f(a))
    case iDef@MM_STOREH_PI (mem_addr, a, mem_addrOffset) =>
      _mm_storeh_pi(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_DIV_SS (a, b) =>
      _mm_div_ss(f(a), f(b))
    case MM_CMPLE_SS (a, b) =>
      _mm_cmple_ss(f(a), f(b))
    case MM_CMPGE_SS (a, b) =>
      _mm_cmpge_ss(f(a), f(b))
    case MM_SUB_PS (a, b) =>
      _mm_sub_ps(f(a), f(b))
    case MM_GET_EXCEPTION_STATE () =>
      _MM_GET_EXCEPTION_STATE()
    case MM_MOVEHL_PS (a, b) =>
      _mm_movehl_ps(f(a), f(b))
    case MM_CMPLT_SS (a, b) =>
      _mm_cmplt_ss(f(a), f(b))
    case MM_MIN_PU8 (a, b) =>
      _mm_min_pu8(f(a), f(b))
    case MM_SET1_PS (a) =>
      _mm_set1_ps(f(a))
    case MM_MAX_PI16 (a, b) =>
      _mm_max_pi16(f(a), f(b))
    case MM_COMIEQ_SS (a, b) =>
      _mm_comieq_ss(f(a), f(b))
    case MM_CMPNGT_SS (a, b) =>
      _mm_cmpngt_ss(f(a), f(b))
    case MM_MULHI_PU16 (a, b) =>
      _mm_mulhi_pu16(f(a), f(b))
    case MM_CVTPI8_PS (a) =>
      _mm_cvtpi8_ps(f(a))
    case M_PSHUFW (a, imm8) =>
      _m_pshufw(f(a), f(imm8))
    case MM_CVT_SI2SS (a, b) =>
      _mm_cvt_si2ss(f(a), f(b))
    case MM_CVTPS_PI16 (a) =>
      _mm_cvtps_pi16(f(a))
    case MM_SETZERO_PS () =>
      _mm_setzero_ps()
    case MM_CVTPU8_PS (a) =>
      _mm_cvtpu8_ps(f(a))
    case iDef@M_MASKMOVQ (a, mask, mem_addr, mem_addrOffset) =>
      _m_maskmovq(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CMPUNORD_PS (a, b) =>
      _mm_cmpunord_ps(f(a), f(b))
    case MM_CMPLT_PS (a, b) =>
      _mm_cmplt_ps(f(a), f(b))
    case MM_RSQRT_PS (a) =>
      _mm_rsqrt_ps(f(a))
    case MM_EXTRACT_PI16 (a, imm8) =>
      _mm_extract_pi16(f(a), f(imm8))
    case MM_SETCSR (a) =>
      _mm_setcsr(f(a))
    case iDef@MM_STORE_PS (mem_addr, a, mem_addrOffset) =>
      _mm_store_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case M_PAVGB (a, b) =>
      _m_pavgb(f(a), f(b))
    case MM_CVTTPS_PI32 (a) =>
      _mm_cvttps_pi32(f(a))
    case MM_COMIGE_SS (a, b) =>
      _mm_comige_ss(f(a), f(b))
    case MM_UCOMIGE_SS (a, b) =>
      _mm_ucomige_ss(f(a), f(b))
    case MM_MAX_SS (a, b) =>
      _mm_max_ss(f(a), f(b))
    case MM_CMPNLT_PS (a, b) =>
      _mm_cmpnlt_ps(f(a), f(b))
    case MM_SET_PS1 (a) =>
      _mm_set_ps1(f(a))
    case MM_COMILE_SS (a, b) =>
      _mm_comile_ss(f(a), f(b))
    case MM_CMPEQ_PS (a, b) =>
      _mm_cmpeq_ps(f(a), f(b))
    case MM_SET_PS (e3, e2, e1, e0) =>
      _mm_set_ps(f(e3), f(e2), f(e1), f(e0))
    case MM_COMILT_SS (a, b) =>
      _mm_comilt_ss(f(a), f(b))
    case M_PAVGW (a, b) =>
      _m_pavgw(f(a), f(b))
    case MM_CMPNGE_PS (a, b) =>
      _mm_cmpnge_ps(f(a), f(b))
    case MM_CVTSI64_SS (a, b) =>
      _mm_cvtsi64_ss(f(a), f(b))
    case MM_CMPNGE_SS (a, b) =>
      _mm_cmpnge_ss(f(a), f(b))
    case MM_ADD_PS (a, b) =>
      _mm_add_ps(f(a), f(b))
    case MM_CVTTSS_SI64 (a) =>
      _mm_cvttss_si64(f(a))
    case iDef@MM_STORE_SS (mem_addr, a, mem_addrOffset) =>
      _mm_store_ss(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CMPNEQ_PS (a, b) =>
      _mm_cmpneq_ps(f(a), f(b))
    case M_PSADBW (a, b) =>
      _m_psadbw(f(a), f(b))
    case MM_MOVELH_PS (a, b) =>
      _mm_movelh_ps(f(a), f(b))
    case MM_RCP_SS (a) =>
      _mm_rcp_ss(f(a))
    case M_PMAXSW (a, b) =>
      _m_pmaxsw(f(a), f(b))
    case MM_CMPNLE_SS (a, b) =>
      _mm_cmpnle_ss(f(a), f(b))
    case MM_CMPGT_SS (a, b) =>
      _mm_cmpgt_ss(f(a), f(b))
    case MM_UCOMILE_SS (a, b) =>
      _mm_ucomile_ss(f(a), f(b))
    case iDef@MM_LOADL_PI (a, mem_addr, mem_addrOffset) =>
      _mm_loadl_pi(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOAD_PS (mem_addr, mem_addrOffset) =>
      _mm_load_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_UNPACKLO_PS (a, b) =>
      _mm_unpacklo_ps(f(a), f(b))
    case MM_CMPNGT_PS (a, b) =>
      _mm_cmpngt_ps(f(a), f(b))
    case MM_UCOMIEQ_SS (a, b) =>
      _mm_ucomieq_ss(f(a), f(b))
    case MM_CVTSS_SI32 (a) =>
      _mm_cvtss_si32(f(a))
    case M_PINSRW (a, i, imm8) =>
      _m_pinsrw(f(a), f(i), f(imm8))
    case MM_CVTT_PS2PI (a) =>
      _mm_cvtt_ps2pi(f(a))
    case MM_DIV_PS (a, b) =>
      _mm_div_ps(f(a), f(b))
    case MM_SET_EXCEPTION_MASK (a) =>
      _MM_SET_EXCEPTION_MASK(f(a))
    case M_PMINSW (a, b) =>
      _m_pminsw(f(a), f(b))
    case iDef@MM_LOAD_PS1 (mem_addr, mem_addrOffset) =>
      _mm_load_ps1(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_XOR_PS (a, b) =>
      _mm_xor_ps(f(a), f(b))
    case MM_CMPORD_SS (a, b) =>
      _mm_cmpord_ss(f(a), f(b))
    case MM_SQRT_SS (a) =>
      _mm_sqrt_ss(f(a))
    case MM_MAX_PU8 (a, b) =>
      _mm_max_pu8(f(a), f(b))
    case MM_CVT_SS2SI (a) =>
      _mm_cvt_ss2si(f(a))
    case MM_CVTSS_F32 (a) =>
      _mm_cvtss_f32(f(a))
    case iDef@MM_LOADU_PS (mem_addr, mem_addrOffset) =>
      _mm_loadu_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_UCOMINEQ_SS (a, b) =>
      _mm_ucomineq_ss(f(a), f(b))
    case MM_MIN_PS (a, b) =>
      _mm_min_ps(f(a), f(b))
    case iDef@MM_STREAM_PI (mem_addr, a, mem_addrOffset) =>
      _mm_stream_pi(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_COMINEQ_SS (a, b) =>
      _mm_comineq_ss(f(a), f(b))
    case MM_MIN_SS (a, b) =>
      _mm_min_ss(f(a), f(b))
    case MM_MAX_PS (a, b) =>
      _mm_max_ps(f(a), f(b))
    case iDef@MM_STOREL_PI (mem_addr, a, mem_addrOffset) =>
      _mm_storel_pi(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SET_SS (a) =>
      _mm_set_ss(f(a))
    case MM_INSERT_PI16 (a, i, imm8) =>
      _mm_insert_pi16(f(a), f(i), f(imm8))
    case MM_ADD_SS (a, b) =>
      _mm_add_ss(f(a), f(b))
    case MM_CVTPI16_PS (a) =>
      _mm_cvtpi16_ps(f(a))
    case MM_CVT_PS2PI (a) =>
      _mm_cvt_ps2pi(f(a))
    case MM_UNPACKHI_PS (a, b) =>
      _mm_unpackhi_ps(f(a), f(b))
    case iDef@MM_LOAD_SS (mem_addr, mem_addrOffset) =>
      _mm_load_ss(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_MOVEMASK_PI8 (a) =>
      _mm_movemask_pi8(f(a))
    case MM_UCOMIGT_SS (a, b) =>
      _mm_ucomigt_ss(f(a), f(b))
    case MM_CVT_PI2PS (a, b) =>
      _mm_cvt_pi2ps(f(a), f(b))
    case MM_GET_EXCEPTION_MASK () =>
      _MM_GET_EXCEPTION_MASK()
    case iDef@MM_LOADH_PI (a, mem_addr, mem_addrOffset) =>
      _mm_loadh_pi(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_RSQRT_SS (a) =>
      _mm_rsqrt_ss(f(a))
    case MM_CMPUNORD_SS (a, b) =>
      _mm_cmpunord_ss(f(a), f(b))
    case iDef@MM_STORE_PS1 (mem_addr, a, mem_addrOffset) =>
      _mm_store_ps1(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SUB_SS (a, b) =>
      _mm_sub_ss(f(a), f(b))
    case M_PMOVMSKB (a) =>
      _m_pmovmskb(f(a))
    case MM_MUL_PS (a, b) =>
      _mm_mul_ps(f(a), f(b))
    case M_PMAXUB (a, b) =>
      _m_pmaxub(f(a), f(b))
    case MM_CMPNEQ_SS (a, b) =>
      _mm_cmpneq_ss(f(a), f(b))
    case MM_SQRT_PS (a) =>
      _mm_sqrt_ps(f(a))
    case MM_AVG_PU16 (a, b) =>
      _mm_avg_pu16(f(a), f(b))
    case iDef@MM_STORER_PS (mem_addr, a, mem_addrOffset) =>
      _mm_storer_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CVTPI32_PS (a, b) =>
      _mm_cvtpi32_ps(f(a), f(b))
    case MM_SETR_PS (e3, e2, e1, e0) =>
      _mm_setr_ps(f(e3), f(e2), f(e1), f(e0))
    case MM_MOVE_SS (a, b) =>
      _mm_move_ss(f(a), f(b))
    case MM_CMPNLT_SS (a, b) =>
      _mm_cmpnlt_ss(f(a), f(b))
    case iDef@MM_LOADR_PS (mem_addr, mem_addrOffset) =>
      _mm_loadr_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CVTSS_SI64 (a) =>
      _mm_cvtss_si64(f(a))
    case MM_CMPGT_PS (a, b) =>
      _mm_cmpgt_ps(f(a), f(b))
    case MM_UCOMILT_SS (a, b) =>
      _mm_ucomilt_ss(f(a), f(b))
    case MM_MUL_SS (a, b) =>
      _mm_mul_ss(f(a), f(b))
    case MM_UNDEFINED_PS () =>
      _mm_undefined_ps()
    case MM_SFENCE () =>
      _mm_sfence()
    case MM_ANDNOT_PS (a, b) =>
      _mm_andnot_ps(f(a), f(b))
    case MM_CMPEQ_SS (a, b) =>
      _mm_cmpeq_ss(f(a), f(b))
    case MM_CMPGE_PS (a, b) =>
      _mm_cmpge_ps(f(a), f(b))
    case MM_MIN_PI16 (a, b) =>
      _mm_min_pi16(f(a), f(b))
    case MM512_CVTSS_F32 (a) =>
      _mm512_cvtss_f32(f(a))
    case MM_RCP_PS (a) =>
      _mm_rcp_ps(f(a))
    case M_PMINUB (a, b) =>
      _m_pminub(f(a), f(b))
    case M_PEXTRW (a, imm8) =>
      _m_pextrw(f(a), f(imm8))
    case MM_CVTPS_PI8 (a) =>
      _mm_cvtps_pi8(f(a))
    case iDef@MM_STREAM_PS (mem_addr, a, mem_addrOffset) =>
      _mm_stream_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CMPNLE_PS (a, b) =>
      _mm_cmpnle_ps(f(a), f(b))
    case MM_COMIGT_SS (a, b) =>
      _mm_comigt_ss(f(a), f(b))
    case MM_MOVEMASK_PS (a) =>
      _mm_movemask_ps(f(a))
    case MM_CMPLE_PS (a, b) =>
      _mm_cmple_ps(f(a), f(b))
    case MM_GET_ROUNDING_MODE () =>
      _MM_GET_ROUNDING_MODE()
    case MM_CVTSI32_SS (a, b) =>
      _mm_cvtsi32_ss(f(a), f(b))
    case MM_CVTPI32X2_PS (a, b) =>
      _mm_cvtpi32x2_ps(f(a), f(b))
    case MM_SAD_PU8 (a, b) =>
      _mm_sad_pu8(f(a), f(b))
    case MM_AVG_PU8 (a, b) =>
      _mm_avg_pu8(f(a), f(b))
    case MM_SET_ROUNDING_MODE (a) =>
      _MM_SET_ROUNDING_MODE(f(a))
    case MM_CVTTSS_SI32 (a) =>
      _mm_cvttss_si32(f(a))
    case MM_CMPORD_PS (a, b) =>
      _mm_cmpord_ps(f(a), f(b))
    case MM_SHUFFLE_PS (a, b, imm8) =>
      _mm_shuffle_ps(f(a), f(b), f(imm8))
    case MM_SHUFFLE_PI16 (a, imm8) =>
      _mm_shuffle_pi16(f(a), f(imm8))
    case iDef@MM_LOAD1_PS (mem_addr, mem_addrOffset) =>
      _mm_load1_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STOREU_PS (mem_addr, a, mem_addrOffset) =>
      _mm_storeu_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STORE1_PS (mem_addr, a, mem_addrOffset) =>
      _mm_store1_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_TRANSPOSE4_PS (row0, row1, row2, row3) =>
      _MM_TRANSPOSE4_PS(f(row0), f(row1), f(row2), f(row3))
    case iDef@MM_PREFETCH (p, i, pOffset) =>
      _mm_prefetch(iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(i, f), iDef.cont.applyTransformer(pOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CVTSS_F32 (a) =>
      _mm256_cvtss_f32(f(a))
    case MM_AND_PS (a, b) =>
      _mm_and_ps(f(a), f(b))
    case MM_SET_EXCEPTION_STATE (a) =>
      _MM_SET_EXCEPTION_STATE(f(a))
    case MM_SET_FLUSH_ZERO_MODE (a) =>
      _MM_SET_FLUSH_ZERO_MODE(f(a))
    case MM_GETCSR () =>
      _mm_getcsr()
    case MM_GET_FLUSH_ZERO_MODE () =>
      _MM_GET_FLUSH_ZERO_MODE()
    case MM_OR_PS (a, b) =>
      _mm_or_ps(f(a), f(b))
    case iDef@MM_MASKMOVE_SI64 (a, mask, mem_addr, mem_addrOffset) =>
      _mm_maskmove_si64(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CVTPU16_PS (a) =>
      _mm_cvtpu16_ps(f(a))
    case MM_CVTPS_PI32 (a) =>
      _mm_cvtps_pi32(f(a))
    case M_PMULHUW (a, b) =>
      _m_pmulhuw(f(a), f(b))

    case Reflect(MM_CVTT_SS2SI (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_SS2SI (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREH_PI (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREH_PI (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GET_EXCEPTION_STATE (), u, es) =>
      reflectMirrored(Reflect(MM_GET_EXCEPTION_STATE (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEHL_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MOVEHL_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_PU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_PU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMIEQ_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMIEQ_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNGT_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNGT_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULHI_PU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULHI_PU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPI8_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPI8_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSHUFW (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PSHUFW (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_SI2SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVT_SI2SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_PI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_PI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETZERO_PS (), u, es) =>
      reflectMirrored(Reflect(MM_SETZERO_PS (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPU8_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPU8_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@M_MASKMOVQ (a, mask, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(M_MASKMOVQ (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPUNORD_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPUNORD_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXTRACT_PI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_EXTRACT_PI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETCSR (a), u, es) =>
      reflectMirrored(Reflect(MM_SETCSR (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PAVGB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PAVGB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPS_PI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPS_PI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMIGE_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMIGE_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMIGE_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMIGE_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNLT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNLT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_PS1 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_PS1 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMILE_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMILE_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_PS (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_PS (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMILT_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMILT_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PAVGW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PAVGW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNGE_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNGE_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI64_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI64_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNGE_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNGE_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_SI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_SI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_SS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_SS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSADBW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PSADBW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVELH_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MOVELH_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP_SS (a), u, es) =>
      reflectMirrored(Reflect(MM_RCP_SS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PMAXSW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PMAXSW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNLE_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNLE_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMILE_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMILE_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADL_PI (a, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADL_PI (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNGT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNGT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMIEQ_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMIEQ_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PINSRW (a, i, imm8), u, es) =>
      reflectMirrored(Reflect(M_PINSRW (f(a), f(i), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_PS2PI (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_PS2PI (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_EXCEPTION_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_EXCEPTION_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PMINSW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PMINSW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_PS1 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_PS1 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_XOR_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_XOR_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPORD_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPORD_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SQRT_SS (a), u, es) =>
      reflectMirrored(Reflect(MM_SQRT_SS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_PU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_PU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_SS2SI (a), u, es) =>
      reflectMirrored(Reflect(MM_CVT_SS2SI (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_F32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_F32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADU_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADU_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMINEQ_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMINEQ_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STREAM_PI (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STREAM_PI (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMINEQ_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMINEQ_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREL_PI (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREL_PI (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_SS (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_SS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INSERT_PI16 (a, i, imm8), u, es) =>
      reflectMirrored(Reflect(MM_INSERT_PI16 (f(a), f(i), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPI16_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPI16_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_PS2PI (a), u, es) =>
      reflectMirrored(Reflect(MM_CVT_PS2PI (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_SS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_SS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEMASK_PI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEMASK_PI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMIGT_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMIGT_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_PI2PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVT_PI2PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GET_EXCEPTION_MASK (), u, es) =>
      reflectMirrored(Reflect(MM_GET_EXCEPTION_MASK (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADH_PI (a, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADH_PI (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT_SS (a), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT_SS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPUNORD_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPUNORD_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_PS1 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_PS1 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PMOVMSKB (a), u, es) =>
      reflectMirrored(Reflect(M_PMOVMSKB (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MUL_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MUL_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PMAXUB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PMAXUB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_SQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AVG_PU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_AVG_PU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORER_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORER_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPI32_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTPI32_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_PS (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_PS (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVE_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MOVE_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNLT_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNLT_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADR_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADR_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_SI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_SI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMILT_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMILT_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MUL_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MUL_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNDEFINED_PS (), u, es) =>
      reflectMirrored(Reflect(MM_UNDEFINED_PS (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SFENCE (), u, es) =>
      reflectMirrored(Reflect(MM_SFENCE (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ANDNOT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ANDNOT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSS_F32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSS_F32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_RCP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PMINUB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PMINUB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PEXTRW (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PEXTRW (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_PI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_PI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STREAM_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STREAM_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNLE_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNLE_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMIGT_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_COMIGT_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEMASK_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEMASK_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GET_ROUNDING_MODE (), u, es) =>
      reflectMirrored(Reflect(MM_GET_ROUNDING_MODE (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI32_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI32_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPI32X2_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTPI32X2_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SAD_PU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SAD_PU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AVG_PU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_AVG_PU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_ROUNDING_MODE (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_ROUNDING_MODE (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPORD_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPORD_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHUFFLE_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SHUFFLE_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHUFFLE_PI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SHUFFLE_PI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD1_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD1_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREU_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREU_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE1_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE1_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TRANSPOSE4_PS (row0, row1, row2, row3), u, es) =>
      reflectMirrored(Reflect(MM_TRANSPOSE4_PS (f(row0), f(row1), f(row2), f(row3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_PREFETCH (p, i, pOffset), u, es) =>
      reflectMirrored(Reflect(MM_PREFETCH (iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(i, f), iDef.cont.applyTransformer(pOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSS_F32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSS_F32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AND_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_AND_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_EXCEPTION_STATE (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_EXCEPTION_STATE (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_FLUSH_ZERO_MODE (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_FLUSH_ZERO_MODE (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETCSR (), u, es) =>
      reflectMirrored(Reflect(MM_GETCSR (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GET_FLUSH_ZERO_MODE (), u, es) =>
      reflectMirrored(Reflect(MM_GET_FLUSH_ZERO_MODE (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_OR_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_OR_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKMOVE_SI64 (a, mask, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKMOVE_SI64 (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPU16_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPU16_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_PI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_PI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PMULHUW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PMULHUW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSSE extends CGenIntrinsics {

  val IR: SSE
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_CVTT_SS2SI(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_ss2si(${quote(a)})")
    case iDef@MM_STOREH_PI(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storeh_pi((__m64*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_DIV_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLE_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGE_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_SUB_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_GET_EXCEPTION_STATE() =>
      headers += iDef.header
      emitValDef(sym, s"_MM_GET_EXCEPTION_STATE()")
    case iDef@MM_MOVEHL_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movehl_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLT_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_PU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_pu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET1_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_ps(${quote(a)})")
    case iDef@MM_MAX_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_COMIEQ_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comieq_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNGT_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpngt_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MULHI_PU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mulhi_pu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTPI8_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpi8_ps(${quote(a)})")
    case iDef@M_PSHUFW(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pshufw(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVT_SI2SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_si2ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTPS_PI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtps_pi16(${quote(a)})")
    case iDef@MM_SETZERO_PS() =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setzero_ps()")
    case iDef@MM_CVTPU8_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpu8_ps(${quote(a)})")
    case iDef@M_MASKMOVQ(a, mask, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_m_maskmovq(${quote(a)}, ${quote(mask)}, (char*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}));")
    case iDef@MM_CMPUNORD_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpunord_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_RSQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rsqrt_ps(${quote(a)})")
    case iDef@MM_EXTRACT_PI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_extract_pi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SETCSR(a) =>
      headers += iDef.header
      stream.println(s"_mm_setcsr(${quote(a)});")
    case iDef@MM_STORE_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_store_ps((float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@M_PAVGB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pavgb(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTTPS_PI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttps_pi32(${quote(a)})")
    case iDef@MM_COMIGE_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comige_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_UCOMIGE_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomige_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MAX_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNLT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnlt_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_PS1(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_ps1(${quote(a)})")
    case iDef@MM_COMILE_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comile_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPEQ_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_PS(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_ps(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_COMILT_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comilt_ss(${quote(a)}, ${quote(b)})")
    case iDef@M_PAVGW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pavgw(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNGE_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnge_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSI64_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi64_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNGE_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnge_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADD_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTTSS_SI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_si64(${quote(a)})")
    case iDef@MM_STORE_SS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_store_ss((float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_CMPNEQ_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_ps(${quote(a)}, ${quote(b)})")
    case iDef@M_PSADBW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psadbw(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVELH_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movelh_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_RCP_SS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp_ss(${quote(a)})")
    case iDef@M_PMAXSW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pmaxsw(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNLE_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnle_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_UCOMILE_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomile_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOADL_PI(a, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadl_pi(${quote(a)}, (__m64 const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_LOAD_PS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_load_ps((float const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_UNPACKLO_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpacklo_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNGT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpngt_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_UCOMIEQ_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomieq_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSS_SI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtss_si32(${quote(a)})")
    case iDef@M_PINSRW(a, i, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pinsrw(${quote(a)}, ${quote(i)}, ${quote(imm8)})")
    case iDef@MM_CVTT_PS2PI(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_ps2pi(${quote(a)})")
    case iDef@MM_DIV_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_EXCEPTION_MASK(a) =>
      headers += iDef.header
      stream.println(s"_MM_SET_EXCEPTION_MASK(${quote(a)});")
    case iDef@M_PMINSW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pminsw(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOAD_PS1(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_load_ps1((float const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_XOR_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_xor_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPORD_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpord_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_SQRT_SS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sqrt_ss(${quote(a)})")
    case iDef@MM_MAX_PU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_pu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_SS2SI(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_ss2si(${quote(a)})")
    case iDef@MM_CVTSS_F32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtss_f32(${quote(a)})")
    case iDef@MM_LOADU_PS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadu_ps((float const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_UCOMINEQ_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomineq_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_STREAM_PI(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_stream_pi((__m64*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_COMINEQ_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comineq_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MAX_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_STOREL_PI(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storel_pi((__m64*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_SET_SS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_ss(${quote(a)})")
    case iDef@MM_INSERT_PI16(a, i, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_insert_pi16(${quote(a)}, ${quote(i)}, ${quote(imm8)})")
    case iDef@MM_ADD_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTPI16_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpi16_ps(${quote(a)})")
    case iDef@MM_CVT_PS2PI(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_ps2pi(${quote(a)})")
    case iDef@MM_UNPACKHI_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpackhi_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOAD_SS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_load_ss((float const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MOVEMASK_PI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movemask_pi8(${quote(a)})")
    case iDef@MM_UCOMIGT_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomigt_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_PI2PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_pi2ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_GET_EXCEPTION_MASK() =>
      headers += iDef.header
      emitValDef(sym, s"_MM_GET_EXCEPTION_MASK()")
    case iDef@MM_LOADH_PI(a, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadh_pi(${quote(a)}, (__m64 const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_RSQRT_SS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rsqrt_ss(${quote(a)})")
    case iDef@MM_CMPUNORD_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpunord_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_STORE_PS1(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_store_ps1((float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_SUB_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_ss(${quote(a)}, ${quote(b)})")
    case iDef@M_PMOVMSKB(a) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pmovmskb(${quote(a)})")
    case iDef@MM_MUL_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mul_ps(${quote(a)}, ${quote(b)})")
    case iDef@M_PMAXUB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pmaxub(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNEQ_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_SQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sqrt_ps(${quote(a)})")
    case iDef@MM_AVG_PU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_avg_pu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_STORER_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storer_ps((float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_CVTPI32_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpi32_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_SETR_PS(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setr_ps(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_MOVE_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_move_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNLT_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnlt_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOADR_PS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadr_ps((float const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CVTSS_SI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtss_si64(${quote(a)})")
    case iDef@MM_CMPGT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_UCOMILT_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ucomilt_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MUL_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mul_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNDEFINED_PS() =>
      headers += iDef.header
      emitValDef(sym, s"_mm_undefined_ps()")
    case iDef@MM_SFENCE() =>
      headers += iDef.header
      stream.println(s"_mm_sfence();")
    case iDef@MM_ANDNOT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_andnot_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPEQ_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGE_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTSS_F32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtss_f32(${quote(a)})")
    case iDef@MM_RCP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp_ps(${quote(a)})")
    case iDef@M_PMINUB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pminub(${quote(a)}, ${quote(b)})")
    case iDef@M_PEXTRW(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pextrw(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTPS_PI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtps_pi8(${quote(a)})")
    case iDef@MM_STREAM_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_stream_ps((float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_CMPNLE_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpnle_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_COMIGT_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comigt_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVEMASK_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movemask_ps(${quote(a)})")
    case iDef@MM_CMPLE_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_GET_ROUNDING_MODE() =>
      headers += iDef.header
      emitValDef(sym, s"_MM_GET_ROUNDING_MODE()")
    case iDef@MM_CVTSI32_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi32_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTPI32X2_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpi32x2_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_SAD_PU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sad_pu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_AVG_PU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_avg_pu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_ROUNDING_MODE(a) =>
      headers += iDef.header
      stream.println(s"_MM_SET_ROUNDING_MODE(${quote(a)});")
    case iDef@MM_CVTTSS_SI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_si32(${quote(a)})")
    case iDef@MM_CMPORD_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpord_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_SHUFFLE_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_shuffle_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_SHUFFLE_PI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_shuffle_pi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_LOAD1_PS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_load1_ps((float const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_STOREU_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storeu_ps((float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_STORE1_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_store1_ps((float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_TRANSPOSE4_PS(row0, row1, row2, row3) =>
      headers += iDef.header
      stream.println(s"_MM_TRANSPOSE4_PS(${quote(row0)}, ${quote(row1)}, ${quote(row2)}, ${quote(row3)});")
    case iDef@MM_PREFETCH(p, i, pOffset) =>
      headers += iDef.header
      stream.println(s"_mm_prefetch((char const*) (${quote(p)  + (if(pOffset == Const(0)) "" else " + " + quote(pOffset))}), ${quote(i)});")
    case iDef@MM256_CVTSS_F32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtss_f32(${quote(a)})")
    case iDef@MM_AND_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_and_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_EXCEPTION_STATE(a) =>
      headers += iDef.header
      stream.println(s"_MM_SET_EXCEPTION_STATE(${quote(a)});")
    case iDef@MM_SET_FLUSH_ZERO_MODE(a) =>
      headers += iDef.header
      stream.println(s"_MM_SET_FLUSH_ZERO_MODE(${quote(a)});")
    case iDef@MM_GETCSR() =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getcsr()")
    case iDef@MM_GET_FLUSH_ZERO_MODE() =>
      headers += iDef.header
      emitValDef(sym, s"_MM_GET_FLUSH_ZERO_MODE()")
    case iDef@MM_OR_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_or_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKMOVE_SI64(a, mask, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_maskmove_si64(${quote(a)}, ${quote(mask)}, (char*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}));")
    case iDef@MM_CVTPU16_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpu16_ps(${quote(a)})")
    case iDef@MM_CVTPS_PI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtps_pi32(${quote(a)})")
    case iDef@M_PMULHUW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pmulhuw(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
