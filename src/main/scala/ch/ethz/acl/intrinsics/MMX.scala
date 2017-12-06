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

    
trait MMX extends IntrinsicsBase {
  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_SUB_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PCMPEQD(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_UNPACKLO_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Copy 32-bit integer "a" to the lower elements of "dst", and zero the upper
   * element of "dst".
   * a: int
   */
  case class M_FROM_INT(a: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the supplied values.
   * e1: int, e0: int
   */
  case class MM_SET_PI32(e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Set packed 8-bit integers in "dst" with the supplied values in reverse order.
   * e7: char, e6: char, e5: char, e4: char, e3: char, e2: char, e1: char, e0: char
   */
  case class MM_SETR_PI8(e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PADDSB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class M_PSRAWI(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class M_PSLLDI(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class MM_SLL_PI16(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_CMPGT_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PSUBUSB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PACKSSWB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Copy 64-bit integer "a" to "dst".
   * a: __int64
   */
  case class MM_CVTSI64_M64(a: Exp[Long]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class M_PSLLW(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 64 bits (representing integer data) in "a" and then
   * AND with "b", and store the result in "dst".
   * a: __m64, b: __m64
   */
  case class M_PANDN(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PADDUSB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_CMPGT_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_SUBS_PU16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Copy 64-bit integer "a" to "dst".
   * a: __m64
   */
  case class MM_CVTM64_SI64(a: Exp[__m64]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 64 bits (representing integer data) in "a" and "b",
   * and store the result in "dst".
   * a: __m64, b: __m64
   */
  case class MM_AND_SI64(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class MM_SRAI_PI16(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst".
   * a: __m64, b: __m64
   */
  case class M_PMULLW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PSUBD(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PMADDWD(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compute the bitwise OR of 64 bits (representing integer data) in "a" and "b",
   * and store the result in "dst".
   * a: __m64, b: __m64
   */
  case class M_POR(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_SUBS_PU8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compute the bitwise OR of 64 bits (representing integer data) in "a" and "b",
   * and store the result in "dst".
   * a: __m64, b: __m64
   */
  case class MM_OR_SI64(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Copy the lower 32-bit integer in "a" to "dst".
   * a: __m64
   */
  case class M_TO_INT(a: Exp[__m64]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_ADD_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift 64-bit integer "a" left by "imm8" while shifting in zeros, and store the
   * result in "dst".
   * a: __m64, imm8: int
   */
  case class M_PSLLQI(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PADDSW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Broadcast 16-bit integer "a" to all all elements of "dst".
   * a: short
   */
  case class MM_SET1_PI16(a: Exp[Short]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_UNPACKHI_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class M_PSLLD(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Copy 64-bit integer "a" to "dst".
   * a: __int64
   */
  case class M_FROM_INT64(a: Exp[Long]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class M_PSLLWI(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 64 bits (representing integer data) in "a" and then
   * AND with "b", and store the result in "dst".
   * a: __m64, b: __m64
   */
  case class MM_ANDNOT_SI64(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst".
   * a: __m64, b: __m64
   */
  case class M_PMULHW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the supplied values in reverse order.
   * e1: int, e0: int
   */
  case class MM_SETR_PI32(e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_SUBS_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_ADDS_PU8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PUNPCKHDQ(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class MM_SRL_PI16(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PADDW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_ADDS_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst".
   * a: char
   */
  case class MM_SET1_PI8(a: Exp[Byte]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_ADD_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Empty the MMX state, which marks the x87 FPU registers as available for use by
   * x87 instructions. This instruction must be used at the end of all MMX
   * technology procedures.

   */
  case class MM_EMPTY() extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift 64-bit integer "a" left by "count" while shifting in zeros, and store
   * the result in "dst".
   * a: __m64, count: __m64
   */
  case class MM_SLL_SI64(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PCMPGTW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift 64-bit integer "a" left by "count" while shifting in zeros, and store
   * the result in "dst".
   * a: __m64, count: __m64
   */
  case class M_PSLLQ(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst".
   * a: __m64, b: __m64
   */
  case class MM_MULLO_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Set packed 8-bit integers in "dst" with the supplied values in reverse order.
   * e7: char, e6: char, e5: char, e4: char, e3: char, e2: char, e1: char, e0: char
   */
  case class MM_SET_PI8(e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class M_PSRLWI(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_MADD_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PCMPGTB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_UNPACKLO_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PCMPEQB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class MM_SRA_PI16(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_SUB_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_ADD_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class M_PSRADI(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compute the bitwise OR of 64 bits (representing integer data) in "a" and "b",
   * and store the result in "dst".
   * a: __m64, b: __m64
   */
  case class M_PXOR(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_UNPACKHI_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of 64 bits (representing integer data) in "a" and "b",
   * and store the result in "dst".
   * a: __m64, b: __m64
   */
  case class MM_XOR_SI64(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PUNPCKHWD(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PUNPCKLBW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift 64-bit integer "a" right by "count" while shifting in zeros, and store
   * the result in "dst".
   * a: __m64, count: __m64
   */
  case class MM_SRL_SI64(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst".
   * a: int
   */
  case class MM_SET1_PI32(a: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift 64-bit integer "a" right by "count" while shifting in zeros, and store
   * the result in "dst".
   * a: __m64, count: __m64
   */
  case class M_PSRLQ(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 64 bits (representing integer data) in "a" and "b",
   * and store the result in "dst".
   * a: __m64, b: __m64
   */
  case class M_PAND(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PSUBUSW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Return vector of type __m64 with all elements set to zero.

   */
  case class MM_SETZERO_SI64() extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PADDUSW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PUNPCKLDQ(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PADDD(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Empty the MMX state, which marks the x87 FPU registers as available for use by
   * x87 instructions. This instruction must be used at the end of all MMX
   * technology procedures.

   */
  case class M_EMPTY() extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class MM_SLLI_PI32(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class MM_SRLI_PI16(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PACKUSWB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class MM_SRA_PI32(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Copy 32-bit integer "a" to the lower elements of "dst", and zero the upper
   * element of "dst".
   * a: int
   */
  case class MM_CVTSI32_SI64(a: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PCMPEQW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PUNPCKLWD(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_PACKS_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_CMPGT_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class MM_SLL_PI32(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_CMPEQ_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PSUBB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PSUBSW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Copy 64-bit integer "a" to "dst".
   * a: __m64
   */
  case class M_TO_INT64(a: Exp[__m64]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class M_PSRLDI(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_CMPEQ_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_PACKS_PU16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_UNPACKLO_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using signed saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_PACKS_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_ADDS_PU16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_CMPEQ_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift 64-bit integer "a" right by "imm8" while shifting in zeros, and store
   * the result in "dst".
   * a: __m64, imm8: int
   */
  case class M_PSRLQI(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst".
   * a: __m64, b: __m64
   */
  case class MM_MULHI_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Copy the lower 32-bit integer in "a" to "dst".
   * a: __m64
   */
  case class MM_CVTSI64_SI32(a: Exp[__m64]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using signed saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PACKSSDW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Set packed 16-bit integers in "dst" with the supplied values in reverse order.
   * e3: short, e2: short, e1: short, e0: short
   */
  case class MM_SETR_PI16(e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class MM_SLLI_PI16(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_UNPACKHI_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_SUBS_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class M_PSRAD(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PSUBSB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class MM_SRAI_PI32(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PSUBW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class M_PSRLD(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_ADDS_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class M_PSRLW(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift 64-bit integer "a" right by "imm8" while shifting in zeros, and store
   * the result in "dst".
   * a: __m64, imm8: int
   */
  case class MM_SRLI_SI64(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift 64-bit integer "a" left by "imm8" while shifting in zeros, and store the
   * result in "dst".
   * a: __m64, imm8: int
   */
  case class MM_SLLI_SI64(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, imm8: int
   */
  case class MM_SRLI_PI32(a: Exp[__m64], imm8: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PADDB(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_SUB_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class MM_SRL_PI32(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of "a" and "b", and
   * store the results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PUNPCKHBW(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Set packed 16-bit integers in "dst" with the supplied values.
   * e3: short, e2: short, e1: short, e0: short
   */
  case class MM_SET_PI16(e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m64, count: __m64
   */
  case class M_PSRAW(a: Exp[__m64], count: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m64, b: __m64
   */
  case class M_PCMPGTD(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "mmintrin.h"
  }
      

  def _mm_sub_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SUB_PI16(a, b)
  }
            
  def _m_pcmpeqd(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PCMPEQD(a, b)
  }
            
  def _mm_unpacklo_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_UNPACKLO_PI8(a, b)
  }
            
  def _m_from_int(a: Exp[Int]): Exp[__m64] = {
    M_FROM_INT(a)
  }
            
  def _mm_set_pi32(e1: Exp[Int], e0: Exp[Int]): Exp[__m64] = {
    MM_SET_PI32(e1, e0)
  }
            
  def _mm_setr_pi8(e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]): Exp[__m64] = {
    MM_SETR_PI8(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _m_paddsb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PADDSB(a, b)
  }
            
  def _m_psrawi(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    M_PSRAWI(a, imm8)
  }
            
  def _m_pslldi(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    M_PSLLDI(a, imm8)
  }
            
  def _mm_sll_pi16(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    MM_SLL_PI16(a, count)
  }
            
  def _mm_cmpgt_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_CMPGT_PI16(a, b)
  }
            
  def _m_psubusb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PSUBUSB(a, b)
  }
            
  def _m_packsswb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PACKSSWB(a, b)
  }
            
  def _mm_cvtsi64_m64(a: Exp[Long]): Exp[__m64] = {
    MM_CVTSI64_M64(a)
  }
            
  def _m_psllw(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    M_PSLLW(a, count)
  }
            
  def _m_pandn(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PANDN(a, b)
  }
            
  def _m_paddusb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PADDUSB(a, b)
  }
            
  def _mm_cmpgt_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_CMPGT_PI32(a, b)
  }
            
  def _mm_subs_pu16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SUBS_PU16(a, b)
  }
            
  def _mm_cvtm64_si64(a: Exp[__m64]): Exp[Long] = {
    MM_CVTM64_SI64(a)
  }
            
  def _mm_and_si64(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_AND_SI64(a, b)
  }
            
  def _mm_srai_pi16(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    MM_SRAI_PI16(a, imm8)
  }
            
  def _m_pmullw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PMULLW(a, b)
  }
            
  def _m_psubd(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PSUBD(a, b)
  }
            
  def _m_pmaddwd(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PMADDWD(a, b)
  }
            
  def _m_por(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_POR(a, b)
  }
            
  def _mm_subs_pu8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SUBS_PU8(a, b)
  }
            
  def _mm_or_si64(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_OR_SI64(a, b)
  }
            
  def _m_to_int(a: Exp[__m64]): Exp[Int] = {
    M_TO_INT(a)
  }
            
  def _mm_add_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_ADD_PI8(a, b)
  }
            
  def _m_psllqi(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    M_PSLLQI(a, imm8)
  }
            
  def _m_paddsw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PADDSW(a, b)
  }
            
  def _mm_set1_pi16(a: Exp[Short]): Exp[__m64] = {
    MM_SET1_PI16(a)
  }
            
  def _mm_unpackhi_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_UNPACKHI_PI8(a, b)
  }
            
  def _m_pslld(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    M_PSLLD(a, count)
  }
            
  def _m_from_int64(a: Exp[Long]): Exp[__m64] = {
    M_FROM_INT64(a)
  }
            
  def _m_psllwi(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    M_PSLLWI(a, imm8)
  }
            
  def _mm_andnot_si64(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_ANDNOT_SI64(a, b)
  }
            
  def _m_pmulhw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PMULHW(a, b)
  }
            
  def _mm_setr_pi32(e1: Exp[Int], e0: Exp[Int]): Exp[__m64] = {
    MM_SETR_PI32(e1, e0)
  }
            
  def _mm_subs_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SUBS_PI16(a, b)
  }
            
  def _mm_adds_pu8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_ADDS_PU8(a, b)
  }
            
  def _m_punpckhdq(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PUNPCKHDQ(a, b)
  }
            
  def _mm_srl_pi16(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    MM_SRL_PI16(a, count)
  }
            
  def _m_paddw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PADDW(a, b)
  }
            
  def _mm_adds_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_ADDS_PI8(a, b)
  }
            
  def _mm_set1_pi8(a: Exp[Byte]): Exp[__m64] = {
    MM_SET1_PI8(a)
  }
            
  def _mm_add_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_ADD_PI32(a, b)
  }
            
  def _mm_empty(): Exp[Unit] = {
    reflectEffect(MM_EMPTY())
  }
            
  def _mm_sll_si64(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    MM_SLL_SI64(a, count)
  }
            
  def _m_pcmpgtw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PCMPGTW(a, b)
  }
            
  def _m_psllq(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    M_PSLLQ(a, count)
  }
            
  def _mm_mullo_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MULLO_PI16(a, b)
  }
            
  def _mm_set_pi8(e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]): Exp[__m64] = {
    MM_SET_PI8(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _m_psrlwi(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    M_PSRLWI(a, imm8)
  }
            
  def _mm_madd_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MADD_PI16(a, b)
  }
            
  def _m_pcmpgtb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PCMPGTB(a, b)
  }
            
  def _mm_unpacklo_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_UNPACKLO_PI32(a, b)
  }
            
  def _m_pcmpeqb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PCMPEQB(a, b)
  }
            
  def _mm_sra_pi16(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    MM_SRA_PI16(a, count)
  }
            
  def _mm_sub_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SUB_PI8(a, b)
  }
            
  def _mm_add_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_ADD_PI16(a, b)
  }
            
  def _m_psradi(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    M_PSRADI(a, imm8)
  }
            
  def _m_pxor(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PXOR(a, b)
  }
            
  def _mm_unpackhi_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_UNPACKHI_PI16(a, b)
  }
            
  def _mm_xor_si64(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_XOR_SI64(a, b)
  }
            
  def _m_punpckhwd(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PUNPCKHWD(a, b)
  }
            
  def _m_punpcklbw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PUNPCKLBW(a, b)
  }
            
  def _mm_srl_si64(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    MM_SRL_SI64(a, count)
  }
            
  def _mm_set1_pi32(a: Exp[Int]): Exp[__m64] = {
    MM_SET1_PI32(a)
  }
            
  def _m_psrlq(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    M_PSRLQ(a, count)
  }
            
  def _m_pand(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PAND(a, b)
  }
            
  def _m_psubusw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PSUBUSW(a, b)
  }
            
  def _mm_setzero_si64(): Exp[__m64] = {
    MM_SETZERO_SI64()
  }
            
  def _m_paddusw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PADDUSW(a, b)
  }
            
  def _m_punpckldq(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PUNPCKLDQ(a, b)
  }
            
  def _m_paddd(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PADDD(a, b)
  }
            
  def _m_empty(): Exp[Unit] = {
    reflectEffect(M_EMPTY())
  }
            
  def _mm_slli_pi32(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    MM_SLLI_PI32(a, imm8)
  }
            
  def _mm_srli_pi16(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    MM_SRLI_PI16(a, imm8)
  }
            
  def _m_packuswb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PACKUSWB(a, b)
  }
            
  def _mm_sra_pi32(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    MM_SRA_PI32(a, count)
  }
            
  def _mm_cvtsi32_si64(a: Exp[Int]): Exp[__m64] = {
    MM_CVTSI32_SI64(a)
  }
            
  def _m_pcmpeqw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PCMPEQW(a, b)
  }
            
  def _m_punpcklwd(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PUNPCKLWD(a, b)
  }
            
  def _mm_packs_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_PACKS_PI16(a, b)
  }
            
  def _mm_cmpgt_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_CMPGT_PI8(a, b)
  }
            
  def _mm_sll_pi32(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    MM_SLL_PI32(a, count)
  }
            
  def _mm_cmpeq_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_CMPEQ_PI16(a, b)
  }
            
  def _m_psubb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PSUBB(a, b)
  }
            
  def _m_psubsw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PSUBSW(a, b)
  }
            
  def _m_to_int64(a: Exp[__m64]): Exp[Long] = {
    M_TO_INT64(a)
  }
            
  def _m_psrldi(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    M_PSRLDI(a, imm8)
  }
            
  def _mm_cmpeq_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_CMPEQ_PI8(a, b)
  }
            
  def _mm_packs_pu16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_PACKS_PU16(a, b)
  }
            
  def _mm_unpacklo_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_UNPACKLO_PI16(a, b)
  }
            
  def _mm_packs_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_PACKS_PI32(a, b)
  }
            
  def _mm_adds_pu16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_ADDS_PU16(a, b)
  }
            
  def _mm_cmpeq_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_CMPEQ_PI32(a, b)
  }
            
  def _m_psrlqi(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    M_PSRLQI(a, imm8)
  }
            
  def _mm_mulhi_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MULHI_PI16(a, b)
  }
            
  def _mm_cvtsi64_si32(a: Exp[__m64]): Exp[Int] = {
    MM_CVTSI64_SI32(a)
  }
            
  def _m_packssdw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PACKSSDW(a, b)
  }
            
  def _mm_setr_pi16(e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]): Exp[__m64] = {
    MM_SETR_PI16(e3, e2, e1, e0)
  }
            
  def _mm_slli_pi16(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    MM_SLLI_PI16(a, imm8)
  }
            
  def _mm_unpackhi_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_UNPACKHI_PI32(a, b)
  }
            
  def _mm_subs_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SUBS_PI8(a, b)
  }
            
  def _m_psrad(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    M_PSRAD(a, count)
  }
            
  def _m_psubsb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PSUBSB(a, b)
  }
            
  def _mm_srai_pi32(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    MM_SRAI_PI32(a, imm8)
  }
            
  def _m_psubw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PSUBW(a, b)
  }
            
  def _m_psrld(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    M_PSRLD(a, count)
  }
            
  def _mm_adds_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_ADDS_PI16(a, b)
  }
            
  def _m_psrlw(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    M_PSRLW(a, count)
  }
            
  def _mm_srli_si64(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    MM_SRLI_SI64(a, imm8)
  }
            
  def _mm_slli_si64(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    MM_SLLI_SI64(a, imm8)
  }
            
  def _mm_srli_pi32(a: Exp[__m64], imm8: Exp[Int]): Exp[__m64] = {
    MM_SRLI_PI32(a, imm8)
  }
            
  def _m_paddb(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PADDB(a, b)
  }
            
  def _mm_sub_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SUB_PI32(a, b)
  }
            
  def _mm_srl_pi32(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    MM_SRL_PI32(a, count)
  }
            
  def _m_punpckhbw(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PUNPCKHBW(a, b)
  }
            
  def _mm_set_pi16(e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]): Exp[__m64] = {
    MM_SET_PI16(e3, e2, e1, e0)
  }
            
  def _m_psraw(a: Exp[__m64], count: Exp[__m64]): Exp[__m64] = {
    M_PSRAW(a, count)
  }
            
  def _m_pcmpgtd(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    M_PCMPGTD(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_SUB_PI16 (a, b) =>
      _mm_sub_pi16(f(a), f(b))
    case M_PCMPEQD (a, b) =>
      _m_pcmpeqd(f(a), f(b))
    case MM_UNPACKLO_PI8 (a, b) =>
      _mm_unpacklo_pi8(f(a), f(b))
    case M_FROM_INT (a) =>
      _m_from_int(f(a))
    case MM_SET_PI32 (e1, e0) =>
      _mm_set_pi32(f(e1), f(e0))
    case MM_SETR_PI8 (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm_setr_pi8(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case M_PADDSB (a, b) =>
      _m_paddsb(f(a), f(b))
    case M_PSRAWI (a, imm8) =>
      _m_psrawi(f(a), f(imm8))
    case M_PSLLDI (a, imm8) =>
      _m_pslldi(f(a), f(imm8))
    case MM_SLL_PI16 (a, count) =>
      _mm_sll_pi16(f(a), f(count))
    case MM_CMPGT_PI16 (a, b) =>
      _mm_cmpgt_pi16(f(a), f(b))
    case M_PSUBUSB (a, b) =>
      _m_psubusb(f(a), f(b))
    case M_PACKSSWB (a, b) =>
      _m_packsswb(f(a), f(b))
    case MM_CVTSI64_M64 (a) =>
      _mm_cvtsi64_m64(f(a))
    case M_PSLLW (a, count) =>
      _m_psllw(f(a), f(count))
    case M_PANDN (a, b) =>
      _m_pandn(f(a), f(b))
    case M_PADDUSB (a, b) =>
      _m_paddusb(f(a), f(b))
    case MM_CMPGT_PI32 (a, b) =>
      _mm_cmpgt_pi32(f(a), f(b))
    case MM_SUBS_PU16 (a, b) =>
      _mm_subs_pu16(f(a), f(b))
    case MM_CVTM64_SI64 (a) =>
      _mm_cvtm64_si64(f(a))
    case MM_AND_SI64 (a, b) =>
      _mm_and_si64(f(a), f(b))
    case MM_SRAI_PI16 (a, imm8) =>
      _mm_srai_pi16(f(a), f(imm8))
    case M_PMULLW (a, b) =>
      _m_pmullw(f(a), f(b))
    case M_PSUBD (a, b) =>
      _m_psubd(f(a), f(b))
    case M_PMADDWD (a, b) =>
      _m_pmaddwd(f(a), f(b))
    case M_POR (a, b) =>
      _m_por(f(a), f(b))
    case MM_SUBS_PU8 (a, b) =>
      _mm_subs_pu8(f(a), f(b))
    case MM_OR_SI64 (a, b) =>
      _mm_or_si64(f(a), f(b))
    case M_TO_INT (a) =>
      _m_to_int(f(a))
    case MM_ADD_PI8 (a, b) =>
      _mm_add_pi8(f(a), f(b))
    case M_PSLLQI (a, imm8) =>
      _m_psllqi(f(a), f(imm8))
    case M_PADDSW (a, b) =>
      _m_paddsw(f(a), f(b))
    case MM_SET1_PI16 (a) =>
      _mm_set1_pi16(f(a))
    case MM_UNPACKHI_PI8 (a, b) =>
      _mm_unpackhi_pi8(f(a), f(b))
    case M_PSLLD (a, count) =>
      _m_pslld(f(a), f(count))
    case M_FROM_INT64 (a) =>
      _m_from_int64(f(a))
    case M_PSLLWI (a, imm8) =>
      _m_psllwi(f(a), f(imm8))
    case MM_ANDNOT_SI64 (a, b) =>
      _mm_andnot_si64(f(a), f(b))
    case M_PMULHW (a, b) =>
      _m_pmulhw(f(a), f(b))
    case MM_SETR_PI32 (e1, e0) =>
      _mm_setr_pi32(f(e1), f(e0))
    case MM_SUBS_PI16 (a, b) =>
      _mm_subs_pi16(f(a), f(b))
    case MM_ADDS_PU8 (a, b) =>
      _mm_adds_pu8(f(a), f(b))
    case M_PUNPCKHDQ (a, b) =>
      _m_punpckhdq(f(a), f(b))
    case MM_SRL_PI16 (a, count) =>
      _mm_srl_pi16(f(a), f(count))
    case M_PADDW (a, b) =>
      _m_paddw(f(a), f(b))
    case MM_ADDS_PI8 (a, b) =>
      _mm_adds_pi8(f(a), f(b))
    case MM_SET1_PI8 (a) =>
      _mm_set1_pi8(f(a))
    case MM_ADD_PI32 (a, b) =>
      _mm_add_pi32(f(a), f(b))
    case MM_EMPTY () =>
      _mm_empty()
    case MM_SLL_SI64 (a, count) =>
      _mm_sll_si64(f(a), f(count))
    case M_PCMPGTW (a, b) =>
      _m_pcmpgtw(f(a), f(b))
    case M_PSLLQ (a, count) =>
      _m_psllq(f(a), f(count))
    case MM_MULLO_PI16 (a, b) =>
      _mm_mullo_pi16(f(a), f(b))
    case MM_SET_PI8 (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm_set_pi8(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case M_PSRLWI (a, imm8) =>
      _m_psrlwi(f(a), f(imm8))
    case MM_MADD_PI16 (a, b) =>
      _mm_madd_pi16(f(a), f(b))
    case M_PCMPGTB (a, b) =>
      _m_pcmpgtb(f(a), f(b))
    case MM_UNPACKLO_PI32 (a, b) =>
      _mm_unpacklo_pi32(f(a), f(b))
    case M_PCMPEQB (a, b) =>
      _m_pcmpeqb(f(a), f(b))
    case MM_SRA_PI16 (a, count) =>
      _mm_sra_pi16(f(a), f(count))
    case MM_SUB_PI8 (a, b) =>
      _mm_sub_pi8(f(a), f(b))
    case MM_ADD_PI16 (a, b) =>
      _mm_add_pi16(f(a), f(b))
    case M_PSRADI (a, imm8) =>
      _m_psradi(f(a), f(imm8))
    case M_PXOR (a, b) =>
      _m_pxor(f(a), f(b))
    case MM_UNPACKHI_PI16 (a, b) =>
      _mm_unpackhi_pi16(f(a), f(b))
    case MM_XOR_SI64 (a, b) =>
      _mm_xor_si64(f(a), f(b))
    case M_PUNPCKHWD (a, b) =>
      _m_punpckhwd(f(a), f(b))
    case M_PUNPCKLBW (a, b) =>
      _m_punpcklbw(f(a), f(b))
    case MM_SRL_SI64 (a, count) =>
      _mm_srl_si64(f(a), f(count))
    case MM_SET1_PI32 (a) =>
      _mm_set1_pi32(f(a))
    case M_PSRLQ (a, count) =>
      _m_psrlq(f(a), f(count))
    case M_PAND (a, b) =>
      _m_pand(f(a), f(b))
    case M_PSUBUSW (a, b) =>
      _m_psubusw(f(a), f(b))
    case MM_SETZERO_SI64 () =>
      _mm_setzero_si64()
    case M_PADDUSW (a, b) =>
      _m_paddusw(f(a), f(b))
    case M_PUNPCKLDQ (a, b) =>
      _m_punpckldq(f(a), f(b))
    case M_PADDD (a, b) =>
      _m_paddd(f(a), f(b))
    case M_EMPTY () =>
      _m_empty()
    case MM_SLLI_PI32 (a, imm8) =>
      _mm_slli_pi32(f(a), f(imm8))
    case MM_SRLI_PI16 (a, imm8) =>
      _mm_srli_pi16(f(a), f(imm8))
    case M_PACKUSWB (a, b) =>
      _m_packuswb(f(a), f(b))
    case MM_SRA_PI32 (a, count) =>
      _mm_sra_pi32(f(a), f(count))
    case MM_CVTSI32_SI64 (a) =>
      _mm_cvtsi32_si64(f(a))
    case M_PCMPEQW (a, b) =>
      _m_pcmpeqw(f(a), f(b))
    case M_PUNPCKLWD (a, b) =>
      _m_punpcklwd(f(a), f(b))
    case MM_PACKS_PI16 (a, b) =>
      _mm_packs_pi16(f(a), f(b))
    case MM_CMPGT_PI8 (a, b) =>
      _mm_cmpgt_pi8(f(a), f(b))
    case MM_SLL_PI32 (a, count) =>
      _mm_sll_pi32(f(a), f(count))
    case MM_CMPEQ_PI16 (a, b) =>
      _mm_cmpeq_pi16(f(a), f(b))
    case M_PSUBB (a, b) =>
      _m_psubb(f(a), f(b))
    case M_PSUBSW (a, b) =>
      _m_psubsw(f(a), f(b))
    case M_TO_INT64 (a) =>
      _m_to_int64(f(a))
    case M_PSRLDI (a, imm8) =>
      _m_psrldi(f(a), f(imm8))
    case MM_CMPEQ_PI8 (a, b) =>
      _mm_cmpeq_pi8(f(a), f(b))
    case MM_PACKS_PU16 (a, b) =>
      _mm_packs_pu16(f(a), f(b))
    case MM_UNPACKLO_PI16 (a, b) =>
      _mm_unpacklo_pi16(f(a), f(b))
    case MM_PACKS_PI32 (a, b) =>
      _mm_packs_pi32(f(a), f(b))
    case MM_ADDS_PU16 (a, b) =>
      _mm_adds_pu16(f(a), f(b))
    case MM_CMPEQ_PI32 (a, b) =>
      _mm_cmpeq_pi32(f(a), f(b))
    case M_PSRLQI (a, imm8) =>
      _m_psrlqi(f(a), f(imm8))
    case MM_MULHI_PI16 (a, b) =>
      _mm_mulhi_pi16(f(a), f(b))
    case MM_CVTSI64_SI32 (a) =>
      _mm_cvtsi64_si32(f(a))
    case M_PACKSSDW (a, b) =>
      _m_packssdw(f(a), f(b))
    case MM_SETR_PI16 (e3, e2, e1, e0) =>
      _mm_setr_pi16(f(e3), f(e2), f(e1), f(e0))
    case MM_SLLI_PI16 (a, imm8) =>
      _mm_slli_pi16(f(a), f(imm8))
    case MM_UNPACKHI_PI32 (a, b) =>
      _mm_unpackhi_pi32(f(a), f(b))
    case MM_SUBS_PI8 (a, b) =>
      _mm_subs_pi8(f(a), f(b))
    case M_PSRAD (a, count) =>
      _m_psrad(f(a), f(count))
    case M_PSUBSB (a, b) =>
      _m_psubsb(f(a), f(b))
    case MM_SRAI_PI32 (a, imm8) =>
      _mm_srai_pi32(f(a), f(imm8))
    case M_PSUBW (a, b) =>
      _m_psubw(f(a), f(b))
    case M_PSRLD (a, count) =>
      _m_psrld(f(a), f(count))
    case MM_ADDS_PI16 (a, b) =>
      _mm_adds_pi16(f(a), f(b))
    case M_PSRLW (a, count) =>
      _m_psrlw(f(a), f(count))
    case MM_SRLI_SI64 (a, imm8) =>
      _mm_srli_si64(f(a), f(imm8))
    case MM_SLLI_SI64 (a, imm8) =>
      _mm_slli_si64(f(a), f(imm8))
    case MM_SRLI_PI32 (a, imm8) =>
      _mm_srli_pi32(f(a), f(imm8))
    case M_PADDB (a, b) =>
      _m_paddb(f(a), f(b))
    case MM_SUB_PI32 (a, b) =>
      _mm_sub_pi32(f(a), f(b))
    case MM_SRL_PI32 (a, count) =>
      _mm_srl_pi32(f(a), f(count))
    case M_PUNPCKHBW (a, b) =>
      _m_punpckhbw(f(a), f(b))
    case MM_SET_PI16 (e3, e2, e1, e0) =>
      _mm_set_pi16(f(e3), f(e2), f(e1), f(e0))
    case M_PSRAW (a, count) =>
      _m_psraw(f(a), f(count))
    case M_PCMPGTD (a, b) =>
      _m_pcmpgtd(f(a), f(b))

    case Reflect(MM_SUB_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PCMPEQD (a, b), u, es) =>
      reflectMirrored(Reflect(M_PCMPEQD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_FROM_INT (a), u, es) =>
      reflectMirrored(Reflect(M_FROM_INT (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_PI32 (e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_PI32 (f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_PI8 (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_PI8 (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PADDSB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PADDSB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRAWI (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PSRAWI (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSLLDI (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PSLLDI (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLL_PI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLL_PI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSUBUSB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PSUBUSB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PACKSSWB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PACKSSWB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI64_M64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI64_M64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSLLW (a, count), u, es) =>
      reflectMirrored(Reflect(M_PSLLW (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PANDN (a, b), u, es) =>
      reflectMirrored(Reflect(M_PANDN (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PADDUSB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PADDUSB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUBS_PU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUBS_PU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTM64_SI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTM64_SI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AND_SI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_AND_SI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAI_PI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRAI_PI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PMULLW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PMULLW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSUBD (a, b), u, es) =>
      reflectMirrored(Reflect(M_PSUBD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PMADDWD (a, b), u, es) =>
      reflectMirrored(Reflect(M_PMADDWD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_POR (a, b), u, es) =>
      reflectMirrored(Reflect(M_POR (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUBS_PU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUBS_PU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_OR_SI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_OR_SI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_TO_INT (a), u, es) =>
      reflectMirrored(Reflect(M_TO_INT (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSLLQI (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PSLLQI (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PADDSW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PADDSW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_PI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_PI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSLLD (a, count), u, es) =>
      reflectMirrored(Reflect(M_PSLLD (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_FROM_INT64 (a), u, es) =>
      reflectMirrored(Reflect(M_FROM_INT64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSLLWI (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PSLLWI (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ANDNOT_SI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ANDNOT_SI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PMULHW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PMULHW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_PI32 (e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_PI32 (f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUBS_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUBS_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADDS_PU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDS_PU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PUNPCKHDQ (a, b), u, es) =>
      reflectMirrored(Reflect(M_PUNPCKHDQ (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRL_PI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRL_PI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PADDW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PADDW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADDS_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDS_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_PI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_PI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EMPTY (), u, es) =>
      reflectMirrored(Reflect(MM_EMPTY (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLL_SI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLL_SI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PCMPGTW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PCMPGTW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSLLQ (a, count), u, es) =>
      reflectMirrored(Reflect(M_PSLLQ (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULLO_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULLO_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_PI8 (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_PI8 (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRLWI (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PSRLWI (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MADD_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MADD_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PCMPGTB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PCMPGTB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PCMPEQB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PCMPEQB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRA_PI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRA_PI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADD_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRADI (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PSRADI (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PXOR (a, b), u, es) =>
      reflectMirrored(Reflect(M_PXOR (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_XOR_SI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_XOR_SI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PUNPCKHWD (a, b), u, es) =>
      reflectMirrored(Reflect(M_PUNPCKHWD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PUNPCKLBW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PUNPCKLBW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRL_SI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRL_SI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_PI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_PI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRLQ (a, count), u, es) =>
      reflectMirrored(Reflect(M_PSRLQ (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PAND (a, b), u, es) =>
      reflectMirrored(Reflect(M_PAND (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSUBUSW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PSUBUSW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETZERO_SI64 (), u, es) =>
      reflectMirrored(Reflect(MM_SETZERO_SI64 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PADDUSW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PADDUSW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PUNPCKLDQ (a, b), u, es) =>
      reflectMirrored(Reflect(M_PUNPCKLDQ (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PADDD (a, b), u, es) =>
      reflectMirrored(Reflect(M_PADDD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_EMPTY (), u, es) =>
      reflectMirrored(Reflect(M_EMPTY (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLI_PI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SLLI_PI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLI_PI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRLI_PI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PACKUSWB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PACKUSWB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRA_PI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRA_PI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI32_SI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI32_SI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PCMPEQW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PCMPEQW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PUNPCKLWD (a, b), u, es) =>
      reflectMirrored(Reflect(M_PUNPCKLWD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PACKS_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_PACKS_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLL_PI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLL_PI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSUBB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PSUBB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSUBSW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PSUBSW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_TO_INT64 (a), u, es) =>
      reflectMirrored(Reflect(M_TO_INT64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRLDI (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PSRLDI (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PACKS_PU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_PACKS_PU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PACKS_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_PACKS_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADDS_PU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDS_PU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRLQI (a, imm8), u, es) =>
      reflectMirrored(Reflect(M_PSRLQI (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULHI_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULHI_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSI64_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSI64_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PACKSSDW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PACKSSDW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_PI16 (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_PI16 (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLI_PI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SLLI_PI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUBS_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUBS_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRAD (a, count), u, es) =>
      reflectMirrored(Reflect(M_PSRAD (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSUBSB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PSUBSB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAI_PI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRAI_PI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSUBW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PSUBW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRLD (a, count), u, es) =>
      reflectMirrored(Reflect(M_PSRLD (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADDS_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDS_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRLW (a, count), u, es) =>
      reflectMirrored(Reflect(M_PSRLW (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLI_SI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRLI_SI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLI_SI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SLLI_SI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLI_PI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRLI_PI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PADDB (a, b), u, es) =>
      reflectMirrored(Reflect(M_PADDB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SUB_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRL_PI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRL_PI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PUNPCKHBW (a, b), u, es) =>
      reflectMirrored(Reflect(M_PUNPCKHBW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_PI16 (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_PI16 (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PSRAW (a, count), u, es) =>
      reflectMirrored(Reflect(M_PSRAW (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(M_PCMPGTD (a, b), u, es) =>
      reflectMirrored(Reflect(M_PCMPGTD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenMMX extends CGenIntrinsics {

  val IR: MMX
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_SUB_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_pi16(${quote(a)}, ${quote(b)})")
    case iDef@M_PCMPEQD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pcmpeqd(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNPACKLO_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpacklo_pi8(${quote(a)}, ${quote(b)})")
    case iDef@M_FROM_INT(a) =>
      headers += iDef.header
      emitValDef(sym, s"_m_from_int(${quote(a)})")
    case iDef@MM_SET_PI32(e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_pi32(${quote(e1)}, ${quote(e0)})")
    case iDef@MM_SETR_PI8(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setr_pi8(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@M_PADDSB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_paddsb(${quote(a)}, ${quote(b)})")
    case iDef@M_PSRAWI(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psrawi(${quote(a)}, ${quote(imm8)})")
    case iDef@M_PSLLDI(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pslldi(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SLL_PI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sll_pi16(${quote(a)}, ${quote(count)})")
    case iDef@MM_CMPGT_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_pi16(${quote(a)}, ${quote(b)})")
    case iDef@M_PSUBUSB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psubusb(${quote(a)}, ${quote(b)})")
    case iDef@M_PACKSSWB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_packsswb(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSI64_M64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi64_m64(${quote(a)})")
    case iDef@M_PSLLW(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psllw(${quote(a)}, ${quote(count)})")
    case iDef@M_PANDN(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pandn(${quote(a)}, ${quote(b)})")
    case iDef@M_PADDUSB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_paddusb(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_pi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_SUBS_PU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_subs_pu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTM64_SI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtm64_si64(${quote(a)})")
    case iDef@MM_AND_SI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_and_si64(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRAI_PI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srai_pi16(${quote(a)}, ${quote(imm8)})")
    case iDef@M_PMULLW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pmullw(${quote(a)}, ${quote(b)})")
    case iDef@M_PSUBD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psubd(${quote(a)}, ${quote(b)})")
    case iDef@M_PMADDWD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pmaddwd(${quote(a)}, ${quote(b)})")
    case iDef@M_POR(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_por(${quote(a)}, ${quote(b)})")
    case iDef@MM_SUBS_PU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_subs_pu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_OR_SI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_or_si64(${quote(a)}, ${quote(b)})")
    case iDef@M_TO_INT(a) =>
      headers += iDef.header
      emitValDef(sym, s"_m_to_int(${quote(a)})")
    case iDef@MM_ADD_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_pi8(${quote(a)}, ${quote(b)})")
    case iDef@M_PSLLQI(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psllqi(${quote(a)}, ${quote(imm8)})")
    case iDef@M_PADDSW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_paddsw(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET1_PI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_pi16(${quote(a)})")
    case iDef@MM_UNPACKHI_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpackhi_pi8(${quote(a)}, ${quote(b)})")
    case iDef@M_PSLLD(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pslld(${quote(a)}, ${quote(count)})")
    case iDef@M_FROM_INT64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_m_from_int64(${quote(a)})")
    case iDef@M_PSLLWI(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psllwi(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_ANDNOT_SI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_andnot_si64(${quote(a)}, ${quote(b)})")
    case iDef@M_PMULHW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pmulhw(${quote(a)}, ${quote(b)})")
    case iDef@MM_SETR_PI32(e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setr_pi32(${quote(e1)}, ${quote(e0)})")
    case iDef@MM_SUBS_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_subs_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADDS_PU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_adds_pu8(${quote(a)}, ${quote(b)})")
    case iDef@M_PUNPCKHDQ(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_punpckhdq(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRL_PI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srl_pi16(${quote(a)}, ${quote(count)})")
    case iDef@M_PADDW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_paddw(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADDS_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_adds_pi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET1_PI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_pi8(${quote(a)})")
    case iDef@MM_ADD_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_pi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_EMPTY() =>
      headers += iDef.header
      stream.println(s"_mm_empty();")
    case iDef@MM_SLL_SI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sll_si64(${quote(a)}, ${quote(count)})")
    case iDef@M_PCMPGTW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pcmpgtw(${quote(a)}, ${quote(b)})")
    case iDef@M_PSLLQ(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psllq(${quote(a)}, ${quote(count)})")
    case iDef@MM_MULLO_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mullo_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_PI8(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_pi8(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@M_PSRLWI(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psrlwi(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MADD_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_madd_pi16(${quote(a)}, ${quote(b)})")
    case iDef@M_PCMPGTB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pcmpgtb(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNPACKLO_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpacklo_pi32(${quote(a)}, ${quote(b)})")
    case iDef@M_PCMPEQB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pcmpeqb(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRA_PI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sra_pi16(${quote(a)}, ${quote(count)})")
    case iDef@MM_SUB_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_pi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADD_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_pi16(${quote(a)}, ${quote(b)})")
    case iDef@M_PSRADI(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psradi(${quote(a)}, ${quote(imm8)})")
    case iDef@M_PXOR(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pxor(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNPACKHI_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpackhi_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_XOR_SI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_xor_si64(${quote(a)}, ${quote(b)})")
    case iDef@M_PUNPCKHWD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_punpckhwd(${quote(a)}, ${quote(b)})")
    case iDef@M_PUNPCKLBW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_punpcklbw(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRL_SI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srl_si64(${quote(a)}, ${quote(count)})")
    case iDef@MM_SET1_PI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set1_pi32(${quote(a)})")
    case iDef@M_PSRLQ(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psrlq(${quote(a)}, ${quote(count)})")
    case iDef@M_PAND(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pand(${quote(a)}, ${quote(b)})")
    case iDef@M_PSUBUSW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psubusw(${quote(a)}, ${quote(b)})")
    case iDef@MM_SETZERO_SI64() =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setzero_si64()")
    case iDef@M_PADDUSW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_paddusw(${quote(a)}, ${quote(b)})")
    case iDef@M_PUNPCKLDQ(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_punpckldq(${quote(a)}, ${quote(b)})")
    case iDef@M_PADDD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_paddd(${quote(a)}, ${quote(b)})")
    case iDef@M_EMPTY() =>
      headers += iDef.header
      stream.println(s"_m_empty();")
    case iDef@MM_SLLI_PI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_slli_pi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SRLI_PI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srli_pi16(${quote(a)}, ${quote(imm8)})")
    case iDef@M_PACKUSWB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_packuswb(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRA_PI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sra_pi32(${quote(a)}, ${quote(count)})")
    case iDef@MM_CVTSI32_SI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi32_si64(${quote(a)})")
    case iDef@M_PCMPEQW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pcmpeqw(${quote(a)}, ${quote(b)})")
    case iDef@M_PUNPCKLWD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_punpcklwd(${quote(a)}, ${quote(b)})")
    case iDef@MM_PACKS_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_packs_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_pi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_SLL_PI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sll_pi32(${quote(a)}, ${quote(count)})")
    case iDef@MM_CMPEQ_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_pi16(${quote(a)}, ${quote(b)})")
    case iDef@M_PSUBB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psubb(${quote(a)}, ${quote(b)})")
    case iDef@M_PSUBSW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psubsw(${quote(a)}, ${quote(b)})")
    case iDef@M_TO_INT64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_m_to_int64(${quote(a)})")
    case iDef@M_PSRLDI(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psrldi(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CMPEQ_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_pi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_PACKS_PU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_packs_pu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_UNPACKLO_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpacklo_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_PACKS_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_packs_pi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_ADDS_PU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_adds_pu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPEQ_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_pi32(${quote(a)}, ${quote(b)})")
    case iDef@M_PSRLQI(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psrlqi(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MULHI_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mulhi_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSI64_SI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsi64_si32(${quote(a)})")
    case iDef@M_PACKSSDW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_packssdw(${quote(a)}, ${quote(b)})")
    case iDef@MM_SETR_PI16(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_setr_pi16(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_SLLI_PI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_slli_pi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_UNPACKHI_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_unpackhi_pi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_SUBS_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_subs_pi8(${quote(a)}, ${quote(b)})")
    case iDef@M_PSRAD(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psrad(${quote(a)}, ${quote(count)})")
    case iDef@M_PSUBSB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psubsb(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRAI_PI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srai_pi32(${quote(a)}, ${quote(imm8)})")
    case iDef@M_PSUBW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psubw(${quote(a)}, ${quote(b)})")
    case iDef@M_PSRLD(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psrld(${quote(a)}, ${quote(count)})")
    case iDef@MM_ADDS_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_adds_pi16(${quote(a)}, ${quote(b)})")
    case iDef@M_PSRLW(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psrlw(${quote(a)}, ${quote(count)})")
    case iDef@MM_SRLI_SI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srli_si64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SLLI_SI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_slli_si64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SRLI_PI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srli_pi32(${quote(a)}, ${quote(imm8)})")
    case iDef@M_PADDB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_paddb(${quote(a)}, ${quote(b)})")
    case iDef@MM_SUB_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_pi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_SRL_PI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srl_pi32(${quote(a)}, ${quote(count)})")
    case iDef@M_PUNPCKHBW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_punpckhbw(${quote(a)}, ${quote(b)})")
    case iDef@MM_SET_PI16(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_set_pi16(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@M_PSRAW(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_m_psraw(${quote(a)}, ${quote(count)})")
    case iDef@M_PCMPGTD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_m_pcmpgtd(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
