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

    
trait AVX00 extends IntrinsicsBase {
  /**
   * Compute the bitwise AND of 256 bits (representing integer data) in "a" and
   * "b", and set "ZF" to 1 if the result is zero, otherwise set "ZF" to 0. Compute
   * the bitwise NOT of "a" and then AND with "b", and set "CF" to 1 if the result
   * is zero, otherwise set "CF" to 0. Return 1 if both the "ZF" and "CF" values
   * are zero, otherwise return 0.
   * a: __m256i, b: __m256i
   */
  case class MM256_TESTNZC_SI256(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values.
   * e3: double, e2: double, e1: double, e0: double
   */
  case class MM256_SET_PD(e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 256 bits (representing double-precision (64-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 256-bit
   * value, and set "ZF" to 1 if the sign bit of each 64-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 64-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return 1 if both the "ZF" and "CF" values are zero,
   * otherwise return 0.
   * a: __m256d, b: __m256d
   */
  case class MM256_TESTNZC_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 256-bits (composed of 8 packed single-precision (32-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: float const *, mem_addrOffset: int
   */
  case class MM256_LOADU_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract a 64-bit integer from "a", selected with "index", and store the result
   * in "dst".
   * a: __m256i, index: const int
   */
  case class MM256_EXTRACT_EPI64(a: Exp[__m256i], index: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_XOR_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store the high and low 128-bit halves (each composed of 2 packed
   * double-precision (64-bit) floating-point elements) from "a" into memory two
   * different 128-bit locations.
   * 	"hiaddr" and "loaddr" do not need to be aligned
   * on any particular boundary.
   * hiaddr: double*, loaddr: double*, a: __m256d, hiaddrOffset: int, loaddrOffset: int
   */
  case class MM256_STOREU2_M128D[A[_], U:Integral](hiaddr: Exp[A[Double]], loaddr: Exp[A[Double]], a: Exp[__m256d], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_MUL_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 256 bits (representing double-precision (64-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 256-bit
   * value, and set "ZF" to 1 if the sign bit of each 64-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 64-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return the "CF" value.
   * a: __m256d, b: __m256d
   */
  case class MM256_TESTC_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_MUL_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPI32_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 256-bits (composed of 4 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" must be aligned on a 32-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double *, a: __m256d, mem_addrOffset: int
   */
  case class MM256_STORE_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of single-precision (32-bit) floating-point
   * elements in "a" and "b", and pack the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_HSUB_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 8-bit integers in "dst" with the supplied values in reverse order.
   * e31: char, e30: char, e29: char, e28: char, e27: char, e26: char, e25: char, e24: char, e23: char, e22: char, e21: char, e20: char, e19: char, e18: char, e17: char, e16: char, e15: char, e14: char, e13: char, e12: char, e11: char, e10: char, e9: char, e8: char, e7: char, e6: char, e5: char, e4: char, e3: char, e2: char, e1: char, e0: char
   */
  case class MM256_SETR_EPI8(e31: Exp[Byte], e30: Exp[Byte], e29: Exp[Byte], e28: Exp[Byte], e27: Exp[Byte], e26: Exp[Byte], e25: Exp[Byte], e24: Exp[Byte], e23: Exp[Byte], e22: Exp[Byte], e21: Exp[Byte], e20: Exp[Byte], e19: Exp[Byte], e18: Exp[Byte], e17: Exp[Byte], e16: Exp[Byte], e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Conditionally multiply the packed single-precision (32-bit) floating-point
   * elements in "a" and "b" using the high 4 bits in "imm8", sum the four
   * products, and conditionally store the sum in "dst" using the low 4 bits of
   * "imm8".
   * a: __m256, b: __m256, imm8: const int
   */
  case class MM256_DP_PS(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m256d
   */
  case class MM256_CVTPD_PS(a: Exp[__m256d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 256-bits (composed of 8 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" must be aligned on a 32-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: float *, a: __m256, mem_addrOffset: int
   */
  case class MM256_STORE_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128 to type __m256; the upper 128 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM256_ZEXTPS128_PS256(a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 256-bits (composed of 4 packed double-precision (64-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" must be aligned on a 32-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double const *, mem_addrOffset: int
   */
  case class MM256_LOAD_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128 to type __m256; the upper 128 bits of the result
   * are undefined. This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM256_CASTPS128_PS256(a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of double-precision (64-bit)
   * floating-point elements in "a" and "b", and pack the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_HSUB_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 packed single-precision (32-bit)
   * floating-point elements) selected by "imm8" from "a" and "b", and store the
   * results in "dst".
   * a: __m256, b: __m256, imm8: int
   */
  case class MM256_PERMUTE2F128_PS(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using "mask".
   * mem_addr: double *, mask: __m128i, a: __m128d, mem_addrOffset: int
   */
  case class MM_MASKSTORE_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mask: Exp[__m128i], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_MIN_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the supplied values in reverse order.
   * e7: int, e6: int, e5: int, e4: int, e3: int, e2: int, e1: int, e0: int
   */
  case class MM256_SETR_EPI32(e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed single-precision (32-bit) floating-point elements from "a" into
   * memory using "mask".
   * mem_addr: float *, mask: __m256i, a: __m256, mem_addrOffset: int
   */
  case class MM256_MASKSTORE_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mask: Exp[__m256i], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Alternatively add and subtract packed single-precision (32-bit) floating-point
   * elements in "a" to/from packed elements in "b", and store the results in
   * "dst".
   * a: __m256, b: __m256
   */
  case class MM256_ADDSUB_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_ADD_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero the contents of all XMM or YMM registers.

   */
  case class MM256_ZEROALL() extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 256 bits (representing integer data) in "a" and
   * "b", and set "ZF" to 1 if the result is zero, otherwise set "ZF" to 0. Compute
   * the bitwise NOT of "a" and then AND with "b", and set "CF" to 1 if the result
   * is zero, otherwise set "CF" to 0. Return the "CF" value.
   * a: __m256i, b: __m256i
   */
  case class MM256_TESTC_SI256(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed single-precision (32-bit) floating-point elements from "a" and
   * "b" using "mask", and store the results in "dst".
   * a: __m256, b: __m256, mask: __m256
   */
  case class MM256_BLENDV_PS(a: Exp[__m256], b: Exp[__m256], mask: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_MIN_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_ADD_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast a single-precision (32-bit) floating-point element from memory to
   * all elements of "dst".
   * mem_addr: float const *, mem_addrOffset: int
   */
  case class MM_BROADCAST_SS[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_AND_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTTPD_EPI32(a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 16-bit integers in "dst" with the supplied values.
   * e15: short, e14: short, e13: short, e12: short, e11: short, e10: short, e9: short, e8: short, e7: short, e6: short, e5: short, e4: short, e3: short, e2: short, e1: short, e0: short
   */
  case class MM256_SET_EPI16(e15: Exp[Short], e14: Exp[Short], e13: Exp[Short], e12: Exp[Short], e11: Exp[Short], e10: Exp[Short], e9: Exp[Short], e8: Exp[Short], e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load two 128-bit values (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from memory, and combine them into a 256-bit value in
   * "dst".
   * 	"hiaddr" and "loaddr" do not need to be aligned on any particular
   * boundary.
   * hiaddr: double const*, loaddr: double const*, hiaddrOffset: int, loaddrOffset: int
   */
  case class MM256_LOADU2_M128D[A[_], U:Integral](hiaddr: Exp[A[Double]], loaddr: Exp[A[Double]], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_ANDNOT_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m256, b: __m256
   */
  case class MM256_UNPACKLO_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTPD_EPI32(a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256i to type __m256d. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero
   * latency.
   * a: __m256i
   */
  case class MM256_CASTSI256_PD(a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256d to type __m128d. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero
   * latency.
   * a: __m256d
   */
  case class MM256_CASTPD256_PD128(a: Exp[__m256d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero the upper 128 bits of all YMM registers; the lower 128-bits of the
   * registers are unmodified.

   */
  case class MM256_ZEROUPPER() extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 256 bits (representing single-precision (32-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 256-bit
   * value, and set "ZF" to 1 if the sign bit of each 32-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 32-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return 1 if both the "ZF" and "CF" values are zero,
   * otherwise return 0.
   * a: __m256, b: __m256
   */
  case class MM256_TESTNZC_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Alternatively add and subtract packed double-precision (64-bit) floating-point
   * elements in "a" to/from packed elements in "b", and store the results in
   * "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_ADDSUB_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_SQRT_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 256-bits of integer data from "a" into memory.
   * 	"mem_addr" must be
   * aligned on a 32-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: __m256i *, a: __m256i, mem_addrOffset: int
   */
  case class MM256_STORE_SI256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 256-bits (composed of 4 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory using a non-temporal memory hint.
   * 	"mem_addr"
   * must be aligned on a 32-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: double *, a: __m256d, mem_addrOffset: int
   */
  case class MM256_STREAM_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst". This intrinsic may
   * generate the "vpbroadcastb".
   * a: char
   */
  case class MM256_SET1_EPI8(a: Exp[Byte]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m256
   */
  case class MM256_CVTPS_EPI32(a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed single-precision (32-bit) floating-point elements from "a" and
   * "b" using control mask "imm8", and store the results in "dst".
   * a: __m256, b: __m256, imm8: const int
   */
  case class MM256_BLEND_PS(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_OR_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the 32-bit integer "i" into "dst" at the
   * location specified by "index".
   * a: __m256i, i: __int32, index: const int
   */
  case class MM256_INSERT_EPI32(a: Exp[__m256i], i: Exp[Int], index: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) selected by "imm8" from "a" and "b", and store the
   * results in "dst".
   * a: __m256d, b: __m256d, imm8: int
   */
  case class MM256_PERMUTE2F128_PD(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using "mask".
   * mem_addr: double *, mask: __m256i, a: __m256d, mem_addrOffset: int
   */
  case class MM256_MASKSTORE_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mask: Exp[__m256i], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in "dst".
   * a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_CMP_PD(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the 64-bit integer "i" into "dst" at the
   * location specified by "index".
   * a: __m256i, i: __int64, index: const int
   */
  case class MM256_INSERT_EPI64(a: Exp[__m256i], i: Exp[Long], index: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_SQRT_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m256d, imm8: const int
   */
  case class MM256_EXTRACTF128_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m256 with undefined elements.

   */
  case class MM256_UNDEFINED_PS() extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_SUB_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract a 16-bit integer from "a", selected with "index", and store the result
   * in "dst".
   * a: __m256i, index: const int
   */
  case class MM256_EXTRACT_EPI16(a: Exp[__m256i], index: Exp[Int]) extends IntrinsicsDef[Short] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m256, imm8: const int
   */
  case class MM256_EXTRACTF128_PS(a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the supplied values.
   * e7: int, e6: int, e5: int, e4: int, e3: int, e2: int, e1: int, e0: int
   */
  case class MM256_SET_EPI32(e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in "dst".
   * a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_CMP_PD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst".
   * a: __m256, imm8: int
   */
  case class MM256_PERMUTE_PS(a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "b", and store the results in "dst".
   * a: __m128, b: __m128i
   */
  case class MM_PERMUTEVAR_PS(a: Exp[__m128], b: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing single-precision (32-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 128-bit
   * value, and set "ZF" to 1 if the sign bit of each 32-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 32-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return the "ZF" value.
   * a: __m128, b: __m128
   */
  case class MM_TESTZ_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast a double-precision (64-bit) floating-point element from memory to
   * all elements of "dst".
   * mem_addr: double const *, mem_addrOffset: int
   */
  case class MM256_BROADCAST_SD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst".
   * a: __m256d, imm8: int
   */
  case class MM256_PERMUTE_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 256-bits (composed of 8 packed single-precision (32-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" must be aligned on a 32-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: float const *, mem_addrOffset: int
   */
  case class MM256_LOAD_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst".
   * a: __m256
   */
  case class MM256_FLOOR_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", store the result in
   * the lower element of "dst", and copy the upper element from "a" to the upper
   * element of "dst".
   * a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_CMP_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask "dst" based on the most significant bit of the
   * corresponding packed double-precision (64-bit) floating-point element in "a".
   * a: __m256d
   */
  case class MM256_MOVEMASK_PD(a: Exp[__m256d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed __m256d vector "dst" with the supplied values.
   * lo: __m128d, hi: __m128d
   */
  case class MM256_SETR_M128D(lo: Exp[__m128d], hi: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m128
   */
  case class MM256_CVTPS_PD(a: Exp[__m128]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 256-bits (composed of 4 packed double-precision (64-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: double const *, mem_addrOffset: int
   */
  case class MM256_LOADU_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_MAX_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * supplied values in reverse order.
   * e7: float, e6: float, e5: float, e4: float, e3: float, e2: float, e1: float, e0: float
   */
  case class MM256_SETR_PS(e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing single-precision (32-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 128-bit
   * value, and set "ZF" to 1 if the sign bit of each 32-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 32-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return the "CF" value.
   * a: __m128, b: __m128
   */
  case class MM_TESTC_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing double-precision (64-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 128-bit
   * value, and set "ZF" to 1 if the sign bit of each 64-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 64-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return the "CF" value.
   * a: __m128d, b: __m128d
   */
  case class MM_TESTC_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast a single-precision (32-bit) floating-point element from memory to
   * all elements of "dst".
   * mem_addr: float const *, mem_addrOffset: int
   */
  case class MM256_BROADCAST_SS[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load two 128-bit values (composed of 4 packed single-precision (32-bit)
   * floating-point elements) from memory, and combine them into a 256-bit value in
   * "dst".
   * 	"hiaddr" and "loaddr" do not need to be aligned on any particular
   * boundary.
   * hiaddr: float const*, loaddr: float const*, hiaddrOffset: int, loaddrOffset: int
   */
  case class MM256_LOADU2_M128[A[_], U:Integral](hiaddr: Exp[A[Float]], loaddr: Exp[A[Float]], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst".
   * a: __m256d, b: __m256i
   */
  case class MM256_PERMUTEVAR_PD(a: Exp[__m256d], b: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst". The
   * maximum relative error for this approximation is less than 1.5*2^-12.
   * a: __m256
   */
  case class MM256_RSQRT_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst".
   * a: __m128d, imm8: int
   */
  case class MM_PERMUTE_PD(a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 128 bits from memory (composed of 2 packed double-precision (64-bit)
   * floating-point elements) to all elements of "dst".
   * mem_addr: __m128d const *, mem_addrOffset: int
   */
  case class MM256_BROADCAST_PD[A[_], U:Integral](mem_addr: Exp[A[__m128d]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a"
   * using the "rounding" parameter, and store the results as packed
   * single-precision floating-point elements in "dst".
   * 	[round_note]
   * a: __m256, rounding: int
   */
  case class MM256_ROUND_PS(a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_XOR_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst".
   * a: __m256, b: __m256, imm8: const int
   */
  case class MM256_SHUFFLE_PS(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract an 8-bit integer from "a", selected with "index", and store the result
   * in "dst".
   * a: __m256i, index: const int
   */
  case class MM256_EXTRACT_EPI8(a: Exp[__m256i], index: Exp[Int]) extends IntrinsicsDef[Byte] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_UNPACKHI_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using "mask" (elements are zeroed out when the high bit of the
   * corresponding element is not set).
   * mem_addr: float const *, mask: __m128i, mem_addrOffset: int
   */
  case class MM_MASKLOAD_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mask: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_MOVEHDUP_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a"
   * using the "rounding" parameter, and store the results as packed
   * double-precision floating-point elements in "dst".
   * 	[round_note]
   * a: __m256d, rounding: int
   */
  case class MM256_ROUND_PD(a: Exp[__m256d], rounding: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing double-precision (64-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 128-bit
   * value, and set "ZF" to 1 if the sign bit of each 64-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 64-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return 1 if both the "ZF" and "CF" values are zero,
   * otherwise return 0.
   * a: __m128d, b: __m128d
   */
  case class MM_TESTNZC_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 256 bits (representing single-precision (32-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 256-bit
   * value, and set "ZF" to 1 if the sign bit of each 32-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 32-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return the "CF" value.
   * a: __m256, b: __m256
   */
  case class MM256_TESTC_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 256-bits (composed of 4 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: double *, a: __m256d, mem_addrOffset: int
   */
  case class MM256_STOREU_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * supplied values.
   * e7: float, e6: float, e5: float, e4: float, e3: float, e2: float, e1: float, e0: float
   */
  case class MM256_SET_PS(e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_DIV_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI32_PS(a: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the 8-bit integer "i" into "dst" at the location
   * specified by "index".
   * a: __m256i, i: __int8, index: const int
   */
  case class MM256_INSERT_EPI8(a: Exp[__m256i], i: Exp[Byte], index: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
  case class MM256_EXTRACTF128_SI256(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast double-precision (64-bit) floating-point value "a" to all elements
   * of "dst".
   * a: double
   */
  case class MM256_SET1_PD(a: Exp[Double]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed __m256d vector "dst" with the supplied values.
   * hi: __m128d, lo: __m128d
   */
  case class MM256_SET_M128D(hi: Exp[__m128d], lo: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m256i with all elements set to zero.

   */
  case class MM256_SETZERO_SI256() extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask "dst" based on the most significant bit of the
   * corresponding packed single-precision (32-bit) floating-point element in "a".
   * a: __m256
   */
  case class MM256_MOVEMASK_PS(a: Exp[__m256]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256d to type __m256i. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero
   * latency.
   * a: __m256d
   */
  case class MM256_CASTPD_SI256(a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of integer data) selected by "imm8" from "a" and
   * "b", and store the results in "dst".
   * a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_PERMUTE2F128_SI256(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_DIV_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in "dst".
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_CMP_PS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 256-bits of integer data from memory into "dst".
   * 	"mem_addr" must be
   * aligned on a 32-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: __m256i const *, mem_addrOffset: int
   */
  case class MM256_LOAD_SI256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 16-bit integer "a" to all all elements of "dst". This intrinsic may
   * generate the "vpbroadcastw".
   * a: short
   */
  case class MM256_SET1_EPI16(a: Exp[Short]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing single-precision (32-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 128-bit
   * value, and set "ZF" to 1 if the sign bit of each 32-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 32-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return 1 if both the "ZF" and "CF" values are zero,
   * otherwise return 0.
   * a: __m128, b: __m128
   */
  case class MM_TESTNZC_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed single-precision (32-bit) floating-point elements from "a" into
   * memory using "mask".
   * mem_addr: float *, mask: __m128i, a: __m128, mem_addrOffset: int
   */
  case class MM_MASKSTORE_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mask: Exp[__m128i], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128i to type __m256i; the upper 128 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m128i
   */
  case class MM256_ZEXTSI128_SI256(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst".
   * a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_SHUFFLE_PD(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_ANDNOT_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128d to type __m256d; the upper 128 bits of the result
   * are undefined. This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m128d
   */
  case class MM256_CASTPD128_PD256(a: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128d to type __m256d; the upper 128 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m128d
   */
  case class MM256_ZEXTPD128_PD256(a: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst".
   * a: __m256
   */
  case class MM256_CEIL_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 256-bits (composed of 8 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: float *, a: __m256, mem_addrOffset: int
   */
  case class MM256_STOREU_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using "mask" (elements are zeroed out when the high bit of the
   * corresponding element is not set).
   * mem_addr: float const *, mask: __m256i, mem_addrOffset: int
   */
  case class MM256_MASKLOAD_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], mask: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract a 32-bit integer from "a", selected with "index", and store the result
   * in "dst".
   * a: __m256i, index: const int
   */
  case class MM256_EXTRACT_EPI32(a: Exp[__m256i], index: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 128 bits from memory (composed of 4 packed single-precision (32-bit)
   * floating-point elements) to all elements of "dst".
   * mem_addr: __m128 const *, mem_addrOffset: int
   */
  case class MM256_BROADCAST_PS[A[_], U:Integral](mem_addr: Exp[A[__m128]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128i to type __m256i; the upper 128 bits of the result
   * are undefined. This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m128i
   */
  case class MM256_CASTSI128_SI256(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 256-bits of integer data from memory into "dst".
   * 	"mem_addr" does not
   * need to be aligned on any particular boundary.
   * mem_addr: __m256i const *, mem_addrOffset: int
   */
  case class MM256_LOADU_SI256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m256, b: __m128, imm8: int
   */
  case class MM256_INSERTF128_PS(a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 256 bits (representing single-precision (32-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 256-bit
   * value, and set "ZF" to 1 if the sign bit of each 32-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 32-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return the "ZF" value.
   * a: __m256, b: __m256
   */
  case class MM256_TESTZ_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 256-bits of integer data from "a" into memory using a non-temporal
   * memory hint.
   * 	"mem_addr" must be aligned on a 32-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: __m256i *, a: __m256i, mem_addrOffset: int
   */
  case class MM256_STREAM_SI256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_SUB_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load two 128-bit values (composed of integer data) from memory, and combine
   * them into a 256-bit value in "dst".
   * 	"hiaddr" and "loaddr" do not need to be
   * aligned on any particular boundary.
   * hiaddr: __m128i const*, loaddr: __m128i const*, hiaddrOffset: int, loaddrOffset: int
   */
  case class MM256_LOADU2_M128I[A[_], U:Integral](hiaddr: Exp[A[__m128i]], loaddr: Exp[A[__m128i]], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of single-precision (32-bit) floating-point
   * elements in "a" and "b", and pack the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_HADD_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using "mask" (elements are zeroed out when the high bit of the
   * corresponding element is not set).
   * mem_addr: double const *, mask: __m256i, mem_addrOffset: int
   */
  case class MM256_MASKLOAD_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mask: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m256d to type __m256.
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m256d
   */
  case class MM256_CASTPD_PS(a: Exp[__m256d]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the 16-bit integer "i" into "dst" at the
   * location specified by "index".
   * a: __m256i, i: __int16, index: const int
   */
  case class MM256_INSERT_EPI16(a: Exp[__m256i], i: Exp[Short], index: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m256d, b: __m128d, imm8: int
   */
  case class MM256_INSERTF128_PD(a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256i to type __m256. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero
   * latency.
   * a: __m256i
   */
  case class MM256_CASTSI256_PS(a: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed __m256 vector "dst" with the supplied values.
   * hi: __m128, lo: __m128
   */
  case class MM256_SET_M128(hi: Exp[__m128], lo: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed __m256 vector "dst" with the supplied values.
   * lo: __m128, hi: __m128
   */
  case class MM256_SETR_M128(lo: Exp[__m128], hi: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m256
   */
  case class MM256_CVTTPS_EPI32(a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256 to type __m256i. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero
   * latency.
   * a: __m256
   */
  case class MM256_CASTPS_SI256(a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed double-precision (64-bit) floating-point elements from "a" and
   * "b" using "mask", and store the results in "dst".
   * a: __m256d, b: __m256d, mask: __m256d
   */
  case class MM256_BLENDV_PD(a: Exp[__m256d], b: Exp[__m256d], mask: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m256d with undefined elements.

   */
  case class MM256_UNDEFINED_PD() extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_INSERTF128_SI256(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst". This intrinsic may
   * generate the "vpbroadcastd".
   * a: int
   */
  case class MM256_SET1_EPI32(a: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of double-precision (64-bit) floating-point
   * elements in "a" and "b", and pack the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_HADD_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 256 bits (representing integer data) in "a" and
   * "b", and set "ZF" to 1 if the result is zero, otherwise set "ZF" to 0. Compute
   * the bitwise NOT of "a" and then AND with "b", and set "CF" to 1 if the result
   * is zero, otherwise set "CF" to 0. Return the "ZF" value.
   * a: __m256i, b: __m256i
   */
  case class MM256_TESTZ_SI256(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m256 with all elements set to zero.

   */
  case class MM256_SETZERO_PS() extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst".
   * a: __m256, b: __m256i
   */
  case class MM256_PERMUTEVAR_PS(a: Exp[__m256], b: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in "dst".
   * a: __m256, b: __m256, imm8: const int
   */
  case class MM256_CMP_PS(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 1.5*2^-12.
   * a: __m256
   */
  case class MM256_RCP_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed __m256i vector "dst" with the supplied values.
   * hi: __m128i, lo: __m128i
   */
  case class MM256_SET_M128I(hi: Exp[__m128i], lo: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed __m256i vector "dst" with the supplied values.
   * lo: __m128i, hi: __m128i
   */
  case class MM256_SETR_M128I(lo: Exp[__m128i], hi: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_MOVELDUP_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256 to type __m128. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero
   * latency.
   * a: __m256
   */
  case class MM256_CASTPS256_PS128(a: Exp[__m256]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 256 bits (representing double-precision (64-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 256-bit
   * value, and set "ZF" to 1 if the sign bit of each 64-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 64-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return the "ZF" value.
   * a: __m256d, b: __m256d
   */
  case class MM256_TESTZ_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the supplied values.
   * e3: __int64, e2: __int64, e1: __int64, e0: __int64
   */
  case class MM256_SET_EPI64X(e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m256, b: __m256
   */
  case class MM256_UNPACKHI_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_MOVEDUP_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_UNPACKLO_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256i to type __m128i. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero
   * latency.
   * a: __m256i
   */
  case class MM256_CASTSI256_SI128(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 8-bit integers in "dst" with the supplied values in reverse order.
   * e31: char, e30: char, e29: char, e28: char, e27: char, e26: char, e25: char, e24: char, e23: char, e22: char, e21: char, e20: char, e19: char, e18: char, e17: char, e16: char, e15: char, e14: char, e13: char, e12: char, e11: char, e10: char, e9: char, e8: char, e7: char, e6: char, e5: char, e4: char, e3: char, e2: char, e1: char, e0: char
   */
  case class MM256_SET_EPI8(e31: Exp[Byte], e30: Exp[Byte], e29: Exp[Byte], e28: Exp[Byte], e27: Exp[Byte], e26: Exp[Byte], e25: Exp[Byte], e24: Exp[Byte], e23: Exp[Byte], e22: Exp[Byte], e21: Exp[Byte], e20: Exp[Byte], e19: Exp[Byte], e18: Exp[Byte], e17: Exp[Byte], e16: Exp[Byte], e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 256-bits (composed of 8 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory using a non-temporal memory hint.
   * 	"mem_addr"
   * must be aligned on a 32-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: float *, a: __m256, mem_addrOffset: int
   */
  case class MM256_STREAM_PS[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m256d
   */
  case class MM256_CEIL_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_OR_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst".
   * a: __m128, imm8: int
   */
  case class MM_PERMUTE_PS(a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" using the
   * control in "b", and store the results in "dst".
   * a: __m128d, b: __m128i
   */
  case class MM_PERMUTEVAR_PD(a: Exp[__m128d], b: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing double-precision (64-bit)
   * floating-point elements) in "a" and "b", producing an intermediate 128-bit
   * value, and set "ZF" to 1 if the sign bit of each 64-bit element in the
   * intermediate value is zero, otherwise set "ZF" to 0. Compute the bitwise NOT
   * of "a" and then AND with "b", producing an intermediate value, and set "CF" to
   * 1 if the sign bit of each 64-bit element in the intermediate value is zero,
   * otherwise set "CF" to 0. Return the "ZF" value.
   * a: __m128d, b: __m128d
   */
  case class MM_TESTZ_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed double-precision (64-bit) floating-point elements from "a" and
   * "b" using control mask "imm8", and store the results in "dst".
   * a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_BLEND_PD(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values in reverse order.
   * e3: double, e2: double, e1: double, e0: double
   */
  case class MM256_SETR_PD(e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m256d with all elements set to zero.

   */
  case class MM256_SETZERO_PD() extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_MAX_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using "mask" (elements are zeroed out when the high bit of the
   * corresponding element is not set).
   * mem_addr: double const *, mask: __m128i, mem_addrOffset: int
   */
  case class MM_MASKLOAD_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mask: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_testnzc_si256(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TESTNZC_SI256(a, b)
  }
            
  def _mm256_set_pd(e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]): Exp[__m256d] = {
    MM256_SET_PD(e3, e2, e1, e0)
  }
            
  def _mm256_testnzc_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[Int] = {
    MM256_TESTNZC_PD(a, b)
  }
            
  def _mm256_loadu_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_LOADU_PS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_extract_epi64(a: Exp[__m256i], index: Exp[Int]): Exp[Long] = {
    MM256_EXTRACT_EPI64(a, index)
  }
            
  def _mm256_xor_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_XOR_PD(a, b)
  }
            
  def _mm256_storeu2_m128d[A[_], U:Integral](hiaddr: Exp[A[Double]], loaddr: Exp[A[Double]], a: Exp[__m256d], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(hiaddr, loaddr)(MM256_STOREU2_M128D(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_mul_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MUL_PS(a, b)
  }
            
  def _mm256_testc_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[Int] = {
    MM256_TESTC_PD(a, b)
  }
            
  def _mm256_mul_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MUL_PD(a, b)
  }
            
  def _mm256_cvtepi32_pd(a: Exp[__m128i]): Exp[__m256d] = {
    MM256_CVTEPI32_PD(a)
  }
            
  def _mm256_store_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_STORE_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_hsub_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_HSUB_PS(a, b)
  }
            
  def _mm256_setr_epi8(e31: Exp[Byte], e30: Exp[Byte], e29: Exp[Byte], e28: Exp[Byte], e27: Exp[Byte], e26: Exp[Byte], e25: Exp[Byte], e24: Exp[Byte], e23: Exp[Byte], e22: Exp[Byte], e21: Exp[Byte], e20: Exp[Byte], e19: Exp[Byte], e18: Exp[Byte], e17: Exp[Byte], e16: Exp[Byte], e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]): Exp[__m256i] = {
    MM256_SETR_EPI8(e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_dp_ps(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_DP_PS(a, b, imm8)
  }
            
  def _mm256_cvtpd_ps(a: Exp[__m256d]): Exp[__m128] = {
    MM256_CVTPD_PS(a)
  }
            
  def _mm256_store_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_STORE_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_zextps128_ps256(a: Exp[__m128]): Exp[__m256] = {
    MM256_ZEXTPS128_PS256(a)
  }
            
  def _mm256_load_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_LOAD_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_castps128_ps256(a: Exp[__m128]): Exp[__m256] = {
    MM256_CASTPS128_PS256(a)
  }
            
  def _mm256_hsub_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_HSUB_PD(a, b)
  }
            
  def _mm256_permute2f128_ps(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_PERMUTE2F128_PS(a, b, imm8)
  }
            
  def _mm_maskstore_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mask: Exp[__m128i], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASKSTORE_PD(mem_addr, mask, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_min_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MIN_PD(a, b)
  }
            
  def _mm256_setr_epi32(e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]): Exp[__m256i] = {
    MM256_SETR_EPI32(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_maskstore_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mask: Exp[__m256i], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASKSTORE_PS(mem_addr, mask, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_addsub_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_ADDSUB_PS(a, b)
  }
            
  def _mm256_add_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_ADD_PD(a, b)
  }
            
  def _mm256_zeroall(): Exp[Unit] = {
    reflectEffect(MM256_ZEROALL())
  }
            
  def _mm256_testc_si256(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TESTC_SI256(a, b)
  }
            
  def _mm256_blendv_ps(a: Exp[__m256], b: Exp[__m256], mask: Exp[__m256]): Exp[__m256] = {
    MM256_BLENDV_PS(a, b, mask)
  }
            
  def _mm256_min_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MIN_PS(a, b)
  }
            
  def _mm256_add_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_ADD_PS(a, b)
  }
            
  def _mm_broadcast_ss[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_BROADCAST_SS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_and_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_AND_PS(a, b)
  }
            
  def _mm256_cvttpd_epi32(a: Exp[__m256d]): Exp[__m128i] = {
    MM256_CVTTPD_EPI32(a)
  }
            
  def _mm256_set_epi16(e15: Exp[Short], e14: Exp[Short], e13: Exp[Short], e12: Exp[Short], e11: Exp[Short], e10: Exp[Short], e9: Exp[Short], e8: Exp[Short], e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]): Exp[__m256i] = {
    MM256_SET_EPI16(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_loadu2_m128d[A[_], U:Integral](hiaddr: Exp[A[Double]], loaddr: Exp[A[Double]], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(hiaddr, loaddr)(MM256_LOADU2_M128D(hiaddr, loaddr, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_andnot_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_ANDNOT_PS(a, b)
  }
            
  def _mm256_unpacklo_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_UNPACKLO_PS(a, b)
  }
            
  def _mm256_cvtpd_epi32(a: Exp[__m256d]): Exp[__m128i] = {
    MM256_CVTPD_EPI32(a)
  }
            
  def _mm256_castsi256_pd(a: Exp[__m256i]): Exp[__m256d] = {
    MM256_CASTSI256_PD(a)
  }
            
  def _mm256_castpd256_pd128(a: Exp[__m256d]): Exp[__m128d] = {
    MM256_CASTPD256_PD128(a)
  }
            
  def _mm256_zeroupper(): Exp[Unit] = {
    reflectEffect(MM256_ZEROUPPER())
  }
            
  def _mm256_testnzc_ps(a: Exp[__m256], b: Exp[__m256]): Exp[Int] = {
    MM256_TESTNZC_PS(a, b)
  }
            
  def _mm256_addsub_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_ADDSUB_PD(a, b)
  }
            
  def _mm256_sqrt_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SQRT_PD(a)
  }
            
  def _mm256_store_si256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_STORE_SI256(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_stream_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_STREAM_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_set1_epi8(a: Exp[Byte]): Exp[__m256i] = {
    MM256_SET1_EPI8(a)
  }
            
  def _mm256_cvtps_epi32(a: Exp[__m256]): Exp[__m256i] = {
    MM256_CVTPS_EPI32(a)
  }
            
  def _mm256_blend_ps(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_BLEND_PS(a, b, imm8)
  }
            
  def _mm256_or_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_OR_PD(a, b)
  }
            
  def _mm256_insert_epi32(a: Exp[__m256i], i: Exp[Int], index: Exp[Int]): Exp[__m256i] = {
    MM256_INSERT_EPI32(a, i, index)
  }
            
  def _mm256_permute2f128_pd(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_PERMUTE2F128_PD(a, b, imm8)
  }
            
  def _mm256_maskstore_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mask: Exp[__m256i], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASKSTORE_PD(mem_addr, mask, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_cmp_pd(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_CMP_PD(a, b, imm8)
  }
            
  def _mm256_insert_epi64(a: Exp[__m256i], i: Exp[Long], index: Exp[Int]): Exp[__m256i] = {
    MM256_INSERT_EPI64(a, i, index)
  }
            
  def _mm256_sqrt_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_SQRT_PS(a)
  }
            
  def _mm256_extractf128_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m128d] = {
    MM256_EXTRACTF128_PD(a, imm8)
  }
            
  def _mm256_undefined_ps(): Exp[__m256] = {
    MM256_UNDEFINED_PS()
  }
            
  def _mm256_sub_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_SUB_PD(a, b)
  }
            
  def _mm256_extract_epi16(a: Exp[__m256i], index: Exp[Int]): Exp[Short] = {
    MM256_EXTRACT_EPI16(a, index)
  }
            
  def _mm256_extractf128_ps(a: Exp[__m256], imm8: Exp[Int]): Exp[__m128] = {
    MM256_EXTRACTF128_PS(a, imm8)
  }
            
  def _mm256_set_epi32(e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]): Exp[__m256i] = {
    MM256_SET_EPI32(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm_cmp_pd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_CMP_PD(a, b, imm8)
  }
            
  def _mm256_permute_ps(a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_PERMUTE_PS(a, imm8)
  }
            
  def _mm_permutevar_ps(a: Exp[__m128], b: Exp[__m128i]): Exp[__m128] = {
    MM_PERMUTEVAR_PS(a, b)
  }
            
  def _mm_testz_ps(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_TESTZ_PS(a, b)
  }
            
  def _mm256_broadcast_sd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_BROADCAST_SD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_permute_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_PERMUTE_PD(a, imm8)
  }
            
  def _mm256_load_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_LOAD_PS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_floor_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_FLOOR_PS(a)
  }
            
  def _mm_cmp_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_CMP_SD(a, b, imm8)
  }
            
  def _mm256_movemask_pd(a: Exp[__m256d]): Exp[Int] = {
    MM256_MOVEMASK_PD(a)
  }
            
  def _mm256_setr_m128d(lo: Exp[__m128d], hi: Exp[__m128d]): Exp[__m256d] = {
    MM256_SETR_M128D(lo, hi)
  }
            
  def _mm256_cvtps_pd(a: Exp[__m128]): Exp[__m256d] = {
    MM256_CVTPS_PD(a)
  }
            
  def _mm256_loadu_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_LOADU_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_max_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MAX_PD(a, b)
  }
            
  def _mm256_setr_ps(e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]): Exp[__m256] = {
    MM256_SETR_PS(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm_testc_ps(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_TESTC_PS(a, b)
  }
            
  def _mm_testc_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_TESTC_PD(a, b)
  }
            
  def _mm256_broadcast_ss[A[_], U:Integral](mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_BROADCAST_SS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_loadu2_m128[A[_], U:Integral](hiaddr: Exp[A[Float]], loaddr: Exp[A[Float]], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(hiaddr, loaddr)(MM256_LOADU2_M128(hiaddr, loaddr, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_permutevar_pd(a: Exp[__m256d], b: Exp[__m256i]): Exp[__m256d] = {
    MM256_PERMUTEVAR_PD(a, b)
  }
            
  def _mm256_rsqrt_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_RSQRT_PS(a)
  }
            
  def _mm_permute_pd(a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_PERMUTE_PD(a, imm8)
  }
            
  def _mm256_broadcast_pd[A[_], U:Integral](mem_addr: Exp[A[__m128d]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_BROADCAST_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_round_ps(a: Exp[__m256], rounding: Exp[Int]): Exp[__m256] = {
    MM256_ROUND_PS(a, rounding)
  }
            
  def _mm256_xor_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_XOR_PS(a, b)
  }
            
  def _mm256_shuffle_ps(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_SHUFFLE_PS(a, b, imm8)
  }
            
  def _mm256_extract_epi8(a: Exp[__m256i], index: Exp[Int]): Exp[Byte] = {
    MM256_EXTRACT_EPI8(a, index)
  }
            
  def _mm256_unpackhi_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_UNPACKHI_PD(a, b)
  }
            
  def _mm_maskload_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mask: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASKLOAD_PS(mem_addr, mask, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_movehdup_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_MOVEHDUP_PS(a)
  }
            
  def _mm256_round_pd(a: Exp[__m256d], rounding: Exp[Int]): Exp[__m256d] = {
    MM256_ROUND_PD(a, rounding)
  }
            
  def _mm_testnzc_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_TESTNZC_PD(a, b)
  }
            
  def _mm256_testc_ps(a: Exp[__m256], b: Exp[__m256]): Exp[Int] = {
    MM256_TESTC_PS(a, b)
  }
            
  def _mm256_storeu_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_STOREU_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_set_ps(e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]): Exp[__m256] = {
    MM256_SET_PS(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_div_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_DIV_PS(a, b)
  }
            
  def _mm256_cvtepi32_ps(a: Exp[__m256i]): Exp[__m256] = {
    MM256_CVTEPI32_PS(a)
  }
            
  def _mm256_insert_epi8(a: Exp[__m256i], i: Exp[Byte], index: Exp[Int]): Exp[__m256i] = {
    MM256_INSERT_EPI8(a, i, index)
  }
            
  def _mm256_extractf128_si256(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_EXTRACTF128_SI256(a, imm8)
  }
            
  def _mm256_set1_pd(a: Exp[Double]): Exp[__m256d] = {
    MM256_SET1_PD(a)
  }
            
  def _mm256_set_m128d(hi: Exp[__m128d], lo: Exp[__m128d]): Exp[__m256d] = {
    MM256_SET_M128D(hi, lo)
  }
            
  def _mm256_setzero_si256(): Exp[__m256i] = {
    MM256_SETZERO_SI256()
  }
            
  def _mm256_movemask_ps(a: Exp[__m256]): Exp[Int] = {
    MM256_MOVEMASK_PS(a)
  }
            
  def _mm256_castpd_si256(a: Exp[__m256d]): Exp[__m256i] = {
    MM256_CASTPD_SI256(a)
  }
            
  def _mm256_permute2f128_si256(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_PERMUTE2F128_SI256(a, b, imm8)
  }
            
  def _mm256_div_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_DIV_PD(a, b)
  }
            
  def _mm_cmp_ps(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_CMP_PS(a, b, imm8)
  }
            
  def _mm256_load_si256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_LOAD_SI256(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_set1_epi16(a: Exp[Short]): Exp[__m256i] = {
    MM256_SET1_EPI16(a)
  }
            
  def _mm_testnzc_ps(a: Exp[__m128], b: Exp[__m128]): Exp[Int] = {
    MM_TESTNZC_PS(a, b)
  }
            
  def _mm_maskstore_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mask: Exp[__m128i], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASKSTORE_PS(mem_addr, mask, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_zextsi128_si256(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_ZEXTSI128_SI256(a)
  }
            
  def _mm256_shuffle_pd(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_SHUFFLE_PD(a, b, imm8)
  }
            
  def _mm256_andnot_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_ANDNOT_PD(a, b)
  }
            
  def _mm256_castpd128_pd256(a: Exp[__m128d]): Exp[__m256d] = {
    MM256_CASTPD128_PD256(a)
  }
            
  def _mm256_zextpd128_pd256(a: Exp[__m128d]): Exp[__m256d] = {
    MM256_ZEXTPD128_PD256(a)
  }
            
  def _mm256_ceil_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_CEIL_PS(a)
  }
            
  def _mm256_storeu_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_STOREU_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskload_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], mask: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASKLOAD_PS(mem_addr, mask, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_extract_epi32(a: Exp[__m256i], index: Exp[Int]): Exp[Int] = {
    MM256_EXTRACT_EPI32(a, index)
  }
            
  def _mm256_broadcast_ps[A[_], U:Integral](mem_addr: Exp[A[__m128]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_BROADCAST_PS(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_castsi128_si256(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_CASTSI128_SI256(a)
  }
            
  def _mm256_loadu_si256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_LOADU_SI256(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_insertf128_ps(a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]): Exp[__m256] = {
    MM256_INSERTF128_PS(a, b, imm8)
  }
            
  def _mm256_testz_ps(a: Exp[__m256], b: Exp[__m256]): Exp[Int] = {
    MM256_TESTZ_PS(a, b)
  }
            
  def _mm256_stream_si256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_STREAM_SI256(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_sub_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_SUB_PS(a, b)
  }
            
  def _mm256_loadu2_m128i[A[_], U:Integral](hiaddr: Exp[A[__m128i]], loaddr: Exp[A[__m128i]], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(hiaddr, loaddr)(MM256_LOADU2_M128I(hiaddr, loaddr, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_hadd_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_HADD_PS(a, b)
  }
            
  def _mm256_maskload_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mask: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASKLOAD_PD(mem_addr, mask, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_castpd_ps(a: Exp[__m256d]): Exp[__m256] = {
    MM256_CASTPD_PS(a)
  }
            
  def _mm256_insert_epi16(a: Exp[__m256i], i: Exp[Short], index: Exp[Int]): Exp[__m256i] = {
    MM256_INSERT_EPI16(a, i, index)
  }
            
  def _mm256_insertf128_pd(a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_INSERTF128_PD(a, b, imm8)
  }
            
  def _mm256_castsi256_ps(a: Exp[__m256i]): Exp[__m256] = {
    MM256_CASTSI256_PS(a)
  }
            
  def _mm256_set_m128(hi: Exp[__m128], lo: Exp[__m128]): Exp[__m256] = {
    MM256_SET_M128(hi, lo)
  }
            
  def _mm256_setr_m128(lo: Exp[__m128], hi: Exp[__m128]): Exp[__m256] = {
    MM256_SETR_M128(lo, hi)
  }
            
  def _mm256_cvttps_epi32(a: Exp[__m256]): Exp[__m256i] = {
    MM256_CVTTPS_EPI32(a)
  }
            
  def _mm256_castps_si256(a: Exp[__m256]): Exp[__m256i] = {
    MM256_CASTPS_SI256(a)
  }
            
  def _mm256_blendv_pd(a: Exp[__m256d], b: Exp[__m256d], mask: Exp[__m256d]): Exp[__m256d] = {
    MM256_BLENDV_PD(a, b, mask)
  }
            
  def _mm256_undefined_pd(): Exp[__m256d] = {
    MM256_UNDEFINED_PD()
  }
            
  def _mm256_insertf128_si256(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_INSERTF128_SI256(a, b, imm8)
  }
            
  def _mm256_set1_epi32(a: Exp[Int]): Exp[__m256i] = {
    MM256_SET1_EPI32(a)
  }
            
  def _mm256_hadd_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_HADD_PD(a, b)
  }
            
  def _mm256_testz_si256(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TESTZ_SI256(a, b)
  }
            
  def _mm256_setzero_ps(): Exp[__m256] = {
    MM256_SETZERO_PS()
  }
            
  def _mm256_permutevar_ps(a: Exp[__m256], b: Exp[__m256i]): Exp[__m256] = {
    MM256_PERMUTEVAR_PS(a, b)
  }
            
  def _mm256_cmp_ps(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_CMP_PS(a, b, imm8)
  }
            
  def _mm256_rcp_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_RCP_PS(a)
  }
            
  def _mm256_set_m128i(hi: Exp[__m128i], lo: Exp[__m128i]): Exp[__m256i] = {
    MM256_SET_M128I(hi, lo)
  }
            
  def _mm256_setr_m128i(lo: Exp[__m128i], hi: Exp[__m128i]): Exp[__m256i] = {
    MM256_SETR_M128I(lo, hi)
  }
            
  def _mm256_moveldup_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_MOVELDUP_PS(a)
  }
            
  def _mm256_castps256_ps128(a: Exp[__m256]): Exp[__m128] = {
    MM256_CASTPS256_PS128(a)
  }
            
  def _mm256_testz_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[Int] = {
    MM256_TESTZ_PD(a, b)
  }
            
  def _mm256_set_epi64x(e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]): Exp[__m256i] = {
    MM256_SET_EPI64X(e3, e2, e1, e0)
  }
            
  def _mm256_unpackhi_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_UNPACKHI_PS(a, b)
  }
            
  def _mm256_movedup_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MOVEDUP_PD(a)
  }
            
  def _mm256_unpacklo_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_UNPACKLO_PD(a, b)
  }
            
  def _mm256_castsi256_si128(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CASTSI256_SI128(a)
  }
            
  def _mm256_set_epi8(e31: Exp[Byte], e30: Exp[Byte], e29: Exp[Byte], e28: Exp[Byte], e27: Exp[Byte], e26: Exp[Byte], e25: Exp[Byte], e24: Exp[Byte], e23: Exp[Byte], e22: Exp[Byte], e21: Exp[Byte], e20: Exp[Byte], e19: Exp[Byte], e18: Exp[Byte], e17: Exp[Byte], e16: Exp[Byte], e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]): Exp[__m256i] = {
    MM256_SET_EPI8(e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_stream_ps[A[_], U:Integral](mem_addr: Exp[A[Float]], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_STREAM_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_ceil_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_CEIL_PD(a)
  }
            
  def _mm256_or_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_OR_PS(a, b)
  }
            
  def _mm_permute_ps(a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_PERMUTE_PS(a, imm8)
  }
            
  def _mm_permutevar_pd(a: Exp[__m128d], b: Exp[__m128i]): Exp[__m128d] = {
    MM_PERMUTEVAR_PD(a, b)
  }
            
  def _mm_testz_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_TESTZ_PD(a, b)
  }
            
  def _mm256_blend_pd(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_BLEND_PD(a, b, imm8)
  }
            
  def _mm256_setr_pd(e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]): Exp[__m256d] = {
    MM256_SETR_PD(e3, e2, e1, e0)
  }
            
  def _mm256_setzero_pd(): Exp[__m256d] = {
    MM256_SETZERO_PD()
  }
            
  def _mm256_max_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MAX_PS(a, b)
  }
            
  def _mm_maskload_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mask: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASKLOAD_PD(mem_addr, mask, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_TESTNZC_SI256 (a, b) =>
      _mm256_testnzc_si256(f(a), f(b))
    case MM256_SET_PD (e3, e2, e1, e0) =>
      _mm256_set_pd(f(e3), f(e2), f(e1), f(e0))
    case MM256_TESTNZC_PD (a, b) =>
      _mm256_testnzc_pd(f(a), f(b))
    case iDef@MM256_LOADU_PS (mem_addr, mem_addrOffset) =>
      _mm256_loadu_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_EXTRACT_EPI64 (a, index) =>
      _mm256_extract_epi64(f(a), f(index))
    case MM256_XOR_PD (a, b) =>
      _mm256_xor_pd(f(a), f(b))
    case iDef@MM256_STOREU2_M128D (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      _mm256_storeu2_m128d(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MUL_PS (a, b) =>
      _mm256_mul_ps(f(a), f(b))
    case MM256_TESTC_PD (a, b) =>
      _mm256_testc_pd(f(a), f(b))
    case MM256_MUL_PD (a, b) =>
      _mm256_mul_pd(f(a), f(b))
    case MM256_CVTEPI32_PD (a) =>
      _mm256_cvtepi32_pd(f(a))
    case iDef@MM256_STORE_PD (mem_addr, a, mem_addrOffset) =>
      _mm256_store_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_HSUB_PS (a, b) =>
      _mm256_hsub_ps(f(a), f(b))
    case MM256_SETR_EPI8 (e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm256_setr_epi8(f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM256_DP_PS (a, b, imm8) =>
      _mm256_dp_ps(f(a), f(b), f(imm8))
    case MM256_CVTPD_PS (a) =>
      _mm256_cvtpd_ps(f(a))
    case iDef@MM256_STORE_PS (mem_addr, a, mem_addrOffset) =>
      _mm256_store_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_ZEXTPS128_PS256 (a) =>
      _mm256_zextps128_ps256(f(a))
    case iDef@MM256_LOAD_PD (mem_addr, mem_addrOffset) =>
      _mm256_load_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CASTPS128_PS256 (a) =>
      _mm256_castps128_ps256(f(a))
    case MM256_HSUB_PD (a, b) =>
      _mm256_hsub_pd(f(a), f(b))
    case MM256_PERMUTE2F128_PS (a, b, imm8) =>
      _mm256_permute2f128_ps(f(a), f(b), f(imm8))
    case iDef@MM_MASKSTORE_PD (mem_addr, mask, a, mem_addrOffset) =>
      _mm_maskstore_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MIN_PD (a, b) =>
      _mm256_min_pd(f(a), f(b))
    case MM256_SETR_EPI32 (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm256_setr_epi32(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case iDef@MM256_MASKSTORE_PS (mem_addr, mask, a, mem_addrOffset) =>
      _mm256_maskstore_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_ADDSUB_PS (a, b) =>
      _mm256_addsub_ps(f(a), f(b))
    case MM256_ADD_PD (a, b) =>
      _mm256_add_pd(f(a), f(b))
    case MM256_ZEROALL () =>
      _mm256_zeroall()
    case MM256_TESTC_SI256 (a, b) =>
      _mm256_testc_si256(f(a), f(b))
    case MM256_BLENDV_PS (a, b, mask) =>
      _mm256_blendv_ps(f(a), f(b), f(mask))
    case MM256_MIN_PS (a, b) =>
      _mm256_min_ps(f(a), f(b))
    case MM256_ADD_PS (a, b) =>
      _mm256_add_ps(f(a), f(b))
    case iDef@MM_BROADCAST_SS (mem_addr, mem_addrOffset) =>
      _mm_broadcast_ss(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_AND_PS (a, b) =>
      _mm256_and_ps(f(a), f(b))
    case MM256_CVTTPD_EPI32 (a) =>
      _mm256_cvttpd_epi32(f(a))
    case MM256_SET_EPI16 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm256_set_epi16(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case iDef@MM256_LOADU2_M128D (hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      _mm256_loadu2_m128d(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_ANDNOT_PS (a, b) =>
      _mm256_andnot_ps(f(a), f(b))
    case MM256_UNPACKLO_PS (a, b) =>
      _mm256_unpacklo_ps(f(a), f(b))
    case MM256_CVTPD_EPI32 (a) =>
      _mm256_cvtpd_epi32(f(a))
    case MM256_CASTSI256_PD (a) =>
      _mm256_castsi256_pd(f(a))
    case MM256_CASTPD256_PD128 (a) =>
      _mm256_castpd256_pd128(f(a))
    case MM256_ZEROUPPER () =>
      _mm256_zeroupper()
    case MM256_TESTNZC_PS (a, b) =>
      _mm256_testnzc_ps(f(a), f(b))
    case MM256_ADDSUB_PD (a, b) =>
      _mm256_addsub_pd(f(a), f(b))
    case MM256_SQRT_PD (a) =>
      _mm256_sqrt_pd(f(a))
    case iDef@MM256_STORE_SI256 (mem_addr, a, mem_addrOffset) =>
      _mm256_store_si256(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_STREAM_PD (mem_addr, a, mem_addrOffset) =>
      _mm256_stream_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SET1_EPI8 (a) =>
      _mm256_set1_epi8(f(a))
    case MM256_CVTPS_EPI32 (a) =>
      _mm256_cvtps_epi32(f(a))
    case MM256_BLEND_PS (a, b, imm8) =>
      _mm256_blend_ps(f(a), f(b), f(imm8))
    case MM256_OR_PD (a, b) =>
      _mm256_or_pd(f(a), f(b))
    case MM256_INSERT_EPI32 (a, i, index) =>
      _mm256_insert_epi32(f(a), f(i), f(index))
    case MM256_PERMUTE2F128_PD (a, b, imm8) =>
      _mm256_permute2f128_pd(f(a), f(b), f(imm8))
    case iDef@MM256_MASKSTORE_PD (mem_addr, mask, a, mem_addrOffset) =>
      _mm256_maskstore_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CMP_PD (a, b, imm8) =>
      _mm256_cmp_pd(f(a), f(b), f(imm8))
    case MM256_INSERT_EPI64 (a, i, index) =>
      _mm256_insert_epi64(f(a), f(i), f(index))
    case MM256_SQRT_PS (a) =>
      _mm256_sqrt_ps(f(a))
    case MM256_EXTRACTF128_PD (a, imm8) =>
      _mm256_extractf128_pd(f(a), f(imm8))
    case MM256_UNDEFINED_PS () =>
      _mm256_undefined_ps()
    case MM256_SUB_PD (a, b) =>
      _mm256_sub_pd(f(a), f(b))
    case MM256_EXTRACT_EPI16 (a, index) =>
      _mm256_extract_epi16(f(a), f(index))
    case MM256_EXTRACTF128_PS (a, imm8) =>
      _mm256_extractf128_ps(f(a), f(imm8))
    case MM256_SET_EPI32 (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm256_set_epi32(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM_CMP_PD (a, b, imm8) =>
      _mm_cmp_pd(f(a), f(b), f(imm8))
    case MM256_PERMUTE_PS (a, imm8) =>
      _mm256_permute_ps(f(a), f(imm8))
    case MM_PERMUTEVAR_PS (a, b) =>
      _mm_permutevar_ps(f(a), f(b))
    case MM_TESTZ_PS (a, b) =>
      _mm_testz_ps(f(a), f(b))
    case iDef@MM256_BROADCAST_SD (mem_addr, mem_addrOffset) =>
      _mm256_broadcast_sd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_PERMUTE_PD (a, imm8) =>
      _mm256_permute_pd(f(a), f(imm8))
    case iDef@MM256_LOAD_PS (mem_addr, mem_addrOffset) =>
      _mm256_load_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_FLOOR_PS (a) =>
      _mm256_floor_ps(f(a))
    case MM_CMP_SD (a, b, imm8) =>
      _mm_cmp_sd(f(a), f(b), f(imm8))
    case MM256_MOVEMASK_PD (a) =>
      _mm256_movemask_pd(f(a))
    case MM256_SETR_M128D (lo, hi) =>
      _mm256_setr_m128d(f(lo), f(hi))
    case MM256_CVTPS_PD (a) =>
      _mm256_cvtps_pd(f(a))
    case iDef@MM256_LOADU_PD (mem_addr, mem_addrOffset) =>
      _mm256_loadu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MAX_PD (a, b) =>
      _mm256_max_pd(f(a), f(b))
    case MM256_SETR_PS (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm256_setr_ps(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM_TESTC_PS (a, b) =>
      _mm_testc_ps(f(a), f(b))
    case MM_TESTC_PD (a, b) =>
      _mm_testc_pd(f(a), f(b))
    case iDef@MM256_BROADCAST_SS (mem_addr, mem_addrOffset) =>
      _mm256_broadcast_ss(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_LOADU2_M128 (hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      _mm256_loadu2_m128(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_PERMUTEVAR_PD (a, b) =>
      _mm256_permutevar_pd(f(a), f(b))
    case MM256_RSQRT_PS (a) =>
      _mm256_rsqrt_ps(f(a))
    case MM_PERMUTE_PD (a, imm8) =>
      _mm_permute_pd(f(a), f(imm8))
    case iDef@MM256_BROADCAST_PD (mem_addr, mem_addrOffset) =>
      _mm256_broadcast_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_ROUND_PS (a, rounding) =>
      _mm256_round_ps(f(a), f(rounding))
    case MM256_XOR_PS (a, b) =>
      _mm256_xor_ps(f(a), f(b))
    case MM256_SHUFFLE_PS (a, b, imm8) =>
      _mm256_shuffle_ps(f(a), f(b), f(imm8))
    case MM256_EXTRACT_EPI8 (a, index) =>
      _mm256_extract_epi8(f(a), f(index))
    case MM256_UNPACKHI_PD (a, b) =>
      _mm256_unpackhi_pd(f(a), f(b))
    case iDef@MM_MASKLOAD_PS (mem_addr, mask, mem_addrOffset) =>
      _mm_maskload_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MOVEHDUP_PS (a) =>
      _mm256_movehdup_ps(f(a))
    case MM256_ROUND_PD (a, rounding) =>
      _mm256_round_pd(f(a), f(rounding))
    case MM_TESTNZC_PD (a, b) =>
      _mm_testnzc_pd(f(a), f(b))
    case MM256_TESTC_PS (a, b) =>
      _mm256_testc_ps(f(a), f(b))
    case iDef@MM256_STOREU_PD (mem_addr, a, mem_addrOffset) =>
      _mm256_storeu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SET_PS (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm256_set_ps(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM256_DIV_PS (a, b) =>
      _mm256_div_ps(f(a), f(b))
    case MM256_CVTEPI32_PS (a) =>
      _mm256_cvtepi32_ps(f(a))
    case MM256_INSERT_EPI8 (a, i, index) =>
      _mm256_insert_epi8(f(a), f(i), f(index))
    case MM256_EXTRACTF128_SI256 (a, imm8) =>
      _mm256_extractf128_si256(f(a), f(imm8))
    case MM256_SET1_PD (a) =>
      _mm256_set1_pd(f(a))
    case MM256_SET_M128D (hi, lo) =>
      _mm256_set_m128d(f(hi), f(lo))
    case MM256_SETZERO_SI256 () =>
      _mm256_setzero_si256()
    case MM256_MOVEMASK_PS (a) =>
      _mm256_movemask_ps(f(a))
    case MM256_CASTPD_SI256 (a) =>
      _mm256_castpd_si256(f(a))
    case MM256_PERMUTE2F128_SI256 (a, b, imm8) =>
      _mm256_permute2f128_si256(f(a), f(b), f(imm8))
    case MM256_DIV_PD (a, b) =>
      _mm256_div_pd(f(a), f(b))
    case MM_CMP_PS (a, b, imm8) =>
      _mm_cmp_ps(f(a), f(b), f(imm8))
    case iDef@MM256_LOAD_SI256 (mem_addr, mem_addrOffset) =>
      _mm256_load_si256(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SET1_EPI16 (a) =>
      _mm256_set1_epi16(f(a))
    case MM_TESTNZC_PS (a, b) =>
      _mm_testnzc_ps(f(a), f(b))
    case iDef@MM_MASKSTORE_PS (mem_addr, mask, a, mem_addrOffset) =>
      _mm_maskstore_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_ZEXTSI128_SI256 (a) =>
      _mm256_zextsi128_si256(f(a))
    case MM256_SHUFFLE_PD (a, b, imm8) =>
      _mm256_shuffle_pd(f(a), f(b), f(imm8))
    case MM256_ANDNOT_PD (a, b) =>
      _mm256_andnot_pd(f(a), f(b))
    case MM256_CASTPD128_PD256 (a) =>
      _mm256_castpd128_pd256(f(a))
    case MM256_ZEXTPD128_PD256 (a) =>
      _mm256_zextpd128_pd256(f(a))
    case MM256_CEIL_PS (a) =>
      _mm256_ceil_ps(f(a))
    case iDef@MM256_STOREU_PS (mem_addr, a, mem_addrOffset) =>
      _mm256_storeu_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_MASKLOAD_PS (mem_addr, mask, mem_addrOffset) =>
      _mm256_maskload_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_EXTRACT_EPI32 (a, index) =>
      _mm256_extract_epi32(f(a), f(index))
    case iDef@MM256_BROADCAST_PS (mem_addr, mem_addrOffset) =>
      _mm256_broadcast_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CASTSI128_SI256 (a) =>
      _mm256_castsi128_si256(f(a))
    case iDef@MM256_LOADU_SI256 (mem_addr, mem_addrOffset) =>
      _mm256_loadu_si256(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_INSERTF128_PS (a, b, imm8) =>
      _mm256_insertf128_ps(f(a), f(b), f(imm8))
    case MM256_TESTZ_PS (a, b) =>
      _mm256_testz_ps(f(a), f(b))
    case iDef@MM256_STREAM_SI256 (mem_addr, a, mem_addrOffset) =>
      _mm256_stream_si256(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SUB_PS (a, b) =>
      _mm256_sub_ps(f(a), f(b))
    case iDef@MM256_LOADU2_M128I (hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      _mm256_loadu2_m128i(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_HADD_PS (a, b) =>
      _mm256_hadd_ps(f(a), f(b))
    case iDef@MM256_MASKLOAD_PD (mem_addr, mask, mem_addrOffset) =>
      _mm256_maskload_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CASTPD_PS (a) =>
      _mm256_castpd_ps(f(a))
    case MM256_INSERT_EPI16 (a, i, index) =>
      _mm256_insert_epi16(f(a), f(i), f(index))
    case MM256_INSERTF128_PD (a, b, imm8) =>
      _mm256_insertf128_pd(f(a), f(b), f(imm8))
    case MM256_CASTSI256_PS (a) =>
      _mm256_castsi256_ps(f(a))
    case MM256_SET_M128 (hi, lo) =>
      _mm256_set_m128(f(hi), f(lo))
    case MM256_SETR_M128 (lo, hi) =>
      _mm256_setr_m128(f(lo), f(hi))
    case MM256_CVTTPS_EPI32 (a) =>
      _mm256_cvttps_epi32(f(a))
    case MM256_CASTPS_SI256 (a) =>
      _mm256_castps_si256(f(a))
    case MM256_BLENDV_PD (a, b, mask) =>
      _mm256_blendv_pd(f(a), f(b), f(mask))
    case MM256_UNDEFINED_PD () =>
      _mm256_undefined_pd()
    case MM256_INSERTF128_SI256 (a, b, imm8) =>
      _mm256_insertf128_si256(f(a), f(b), f(imm8))
    case MM256_SET1_EPI32 (a) =>
      _mm256_set1_epi32(f(a))
    case MM256_HADD_PD (a, b) =>
      _mm256_hadd_pd(f(a), f(b))
    case MM256_TESTZ_SI256 (a, b) =>
      _mm256_testz_si256(f(a), f(b))
    case MM256_SETZERO_PS () =>
      _mm256_setzero_ps()
    case MM256_PERMUTEVAR_PS (a, b) =>
      _mm256_permutevar_ps(f(a), f(b))
    case MM256_CMP_PS (a, b, imm8) =>
      _mm256_cmp_ps(f(a), f(b), f(imm8))
    case MM256_RCP_PS (a) =>
      _mm256_rcp_ps(f(a))
    case MM256_SET_M128I (hi, lo) =>
      _mm256_set_m128i(f(hi), f(lo))
    case MM256_SETR_M128I (lo, hi) =>
      _mm256_setr_m128i(f(lo), f(hi))
    case MM256_MOVELDUP_PS (a) =>
      _mm256_moveldup_ps(f(a))
    case MM256_CASTPS256_PS128 (a) =>
      _mm256_castps256_ps128(f(a))
    case MM256_TESTZ_PD (a, b) =>
      _mm256_testz_pd(f(a), f(b))
    case MM256_SET_EPI64X (e3, e2, e1, e0) =>
      _mm256_set_epi64x(f(e3), f(e2), f(e1), f(e0))
    case MM256_UNPACKHI_PS (a, b) =>
      _mm256_unpackhi_ps(f(a), f(b))
    case MM256_MOVEDUP_PD (a) =>
      _mm256_movedup_pd(f(a))
    case MM256_UNPACKLO_PD (a, b) =>
      _mm256_unpacklo_pd(f(a), f(b))
    case MM256_CASTSI256_SI128 (a) =>
      _mm256_castsi256_si128(f(a))
    case MM256_SET_EPI8 (e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm256_set_epi8(f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case iDef@MM256_STREAM_PS (mem_addr, a, mem_addrOffset) =>
      _mm256_stream_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CEIL_PD (a) =>
      _mm256_ceil_pd(f(a))
    case MM256_OR_PS (a, b) =>
      _mm256_or_ps(f(a), f(b))
    case MM_PERMUTE_PS (a, imm8) =>
      _mm_permute_ps(f(a), f(imm8))
    case MM_PERMUTEVAR_PD (a, b) =>
      _mm_permutevar_pd(f(a), f(b))
    case MM_TESTZ_PD (a, b) =>
      _mm_testz_pd(f(a), f(b))
    case MM256_BLEND_PD (a, b, imm8) =>
      _mm256_blend_pd(f(a), f(b), f(imm8))
    case MM256_SETR_PD (e3, e2, e1, e0) =>
      _mm256_setr_pd(f(e3), f(e2), f(e1), f(e0))
    case MM256_SETZERO_PD () =>
      _mm256_setzero_pd()
    case MM256_MAX_PS (a, b) =>
      _mm256_max_ps(f(a), f(b))
    case iDef@MM_MASKLOAD_PD (mem_addr, mask, mem_addrOffset) =>
      _mm_maskload_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)

    case Reflect(MM256_TESTNZC_SI256 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTNZC_SI256 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_PD (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SET_PD (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTNZC_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTNZC_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOADU_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOADU_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACT_EPI64 (a, index), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACT_EPI64 (f(a), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_XOR_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_XOR_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STOREU2_M128D (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STOREU2_M128D (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MUL_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MUL_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTC_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTC_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MUL_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MUL_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STORE_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HSUB_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HSUB_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_EPI8 (e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_EPI8 (f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DP_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_DP_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STORE_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ZEXTPS128_PS256 (a), u, es) =>
      reflectMirrored(Reflect(MM256_ZEXTPS128_PS256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOAD_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOAD_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTPS128_PS256 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTPS128_PS256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HSUB_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HSUB_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTE2F128_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTE2F128_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKSTORE_PD (mem_addr, mask, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKSTORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_EPI32 (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_EPI32 (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKSTORE_PS (mem_addr, mask, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKSTORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADDSUB_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADDSUB_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADD_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADD_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ZEROALL (), u, es) =>
      reflectMirrored(Reflect(MM256_ZEROALL (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTC_SI256 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTC_SI256 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BLENDV_PS (a, b, mask), u, es) =>
      reflectMirrored(Reflect(MM256_BLENDV_PS (f(a), f(b), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADD_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADD_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_BROADCAST_SS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_BROADCAST_SS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_AND_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_AND_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_EPI16 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SET_EPI16 (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOADU2_M128D (hiaddr, loaddr, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOADU2_M128D (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ANDNOT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ANDNOT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTSI256_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTSI256_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTPD256_PD128 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTPD256_PD128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ZEROUPPER (), u, es) =>
      reflectMirrored(Reflect(MM256_ZEROUPPER (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTNZC_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTNZC_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ADDSUB_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ADDSUB_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SQRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SQRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STORE_SI256 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STORE_SI256 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STREAM_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STREAM_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET1_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_SET1_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BLEND_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_BLEND_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_OR_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_OR_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERT_EPI32 (a, i, index), u, es) =>
      reflectMirrored(Reflect(MM256_INSERT_EPI32 (f(a), f(i), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTE2F128_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTE2F128_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKSTORE_PD (mem_addr, mask, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKSTORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERT_EPI64 (a, i, index), u, es) =>
      reflectMirrored(Reflect(MM256_INSERT_EPI64 (f(a), f(i), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_SQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTF128_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTF128_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNDEFINED_PS (), u, es) =>
      reflectMirrored(Reflect(MM256_UNDEFINED_PS (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUB_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUB_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACT_EPI16 (a, index), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACT_EPI16 (f(a), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTF128_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTF128_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_EPI32 (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SET_EPI32 (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEVAR_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEVAR_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTZ_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTZ_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_BROADCAST_SD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_SD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOAD_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOAD_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FLOOR_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_FLOOR_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_SD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_SD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEMASK_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEMASK_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_M128D (lo, hi), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_M128D (f(lo), f(hi)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOADU_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOADU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_PS (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_PS (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTC_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTC_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTC_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTC_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_BROADCAST_SS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_SS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOADU2_M128 (hiaddr, loaddr, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOADU2_M128 (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEVAR_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEVAR_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RSQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_RSQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_BROADCAST_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_XOR_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_XOR_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACT_EPI8 (a, index), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACT_EPI8 (f(a), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKLOAD_PS (mem_addr, mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKLOAD_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEHDUP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEHDUP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTNZC_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTNZC_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTC_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTC_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STOREU_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STOREU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_PS (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SET_PS (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI32_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI32_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERT_EPI8 (a, i, index), u, es) =>
      reflectMirrored(Reflect(MM256_INSERT_EPI8 (f(a), f(i), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTF128_SI256 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTF128_SI256 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET1_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SET1_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_M128D (hi, lo), u, es) =>
      reflectMirrored(Reflect(MM256_SET_M128D (f(hi), f(lo)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETZERO_SI256 (), u, es) =>
      reflectMirrored(Reflect(MM256_SETZERO_SI256 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEMASK_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEMASK_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTPD_SI256 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTPD_SI256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTE2F128_SI256 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTE2F128_SI256 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOAD_SI256 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOAD_SI256 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET1_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_SET1_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTNZC_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTNZC_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKSTORE_PS (mem_addr, mask, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKSTORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ZEXTSI128_SI256 (a), u, es) =>
      reflectMirrored(Reflect(MM256_ZEXTSI128_SI256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ANDNOT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ANDNOT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTPD128_PD256 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTPD128_PD256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ZEXTPD128_PD256 (a), u, es) =>
      reflectMirrored(Reflect(MM256_ZEXTPD128_PD256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CEIL_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CEIL_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STOREU_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STOREU_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKLOAD_PS (mem_addr, mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKLOAD_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACT_EPI32 (a, index), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACT_EPI32 (f(a), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_BROADCAST_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTSI128_SI256 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTSI128_SI256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOADU_SI256 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOADU_SI256 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTF128_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTF128_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTZ_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTZ_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STREAM_SI256 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STREAM_SI256 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUB_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUB_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOADU2_M128I (hiaddr, loaddr, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOADU2_M128I (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HADD_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HADD_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKLOAD_PD (mem_addr, mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKLOAD_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTPD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTPD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERT_EPI16 (a, i, index), u, es) =>
      reflectMirrored(Reflect(MM256_INSERT_EPI16 (f(a), f(i), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTF128_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTF128_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTSI256_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTSI256_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_M128 (hi, lo), u, es) =>
      reflectMirrored(Reflect(MM256_SET_M128 (f(hi), f(lo)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_M128 (lo, hi), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_M128 (f(lo), f(hi)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTPS_SI256 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTPS_SI256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BLENDV_PD (a, b, mask), u, es) =>
      reflectMirrored(Reflect(MM256_BLENDV_PD (f(a), f(b), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNDEFINED_PD (), u, es) =>
      reflectMirrored(Reflect(MM256_UNDEFINED_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTF128_SI256 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTF128_SI256 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET1_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_SET1_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HADD_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HADD_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTZ_SI256 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTZ_SI256 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETZERO_PS (), u, es) =>
      reflectMirrored(Reflect(MM256_SETZERO_PS (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEVAR_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEVAR_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RCP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_RCP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_M128I (hi, lo), u, es) =>
      reflectMirrored(Reflect(MM256_SET_M128I (f(hi), f(lo)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_M128I (lo, hi), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_M128I (f(lo), f(hi)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVELDUP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVELDUP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTPS256_PS128 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTPS256_PS128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTZ_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTZ_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_EPI64X (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SET_EPI64X (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKHI_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKHI_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEDUP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEDUP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTSI256_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTSI256_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_EPI8 (e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SET_EPI8 (f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STREAM_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STREAM_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CEIL_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CEIL_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_OR_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_OR_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEVAR_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEVAR_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTZ_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTZ_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BLEND_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_BLEND_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_PD (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_PD (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETZERO_PD (), u, es) =>
      reflectMirrored(Reflect(MM256_SETZERO_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKLOAD_PD (mem_addr, mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKLOAD_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX00 extends CGenIntrinsics {

  val IR: AVX
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_TESTNZC_SI256(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testnzc_si256(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SET_PD(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_pd(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_TESTNZC_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testnzc_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_LOADU_PS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_loadu_ps((float const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_EXTRACT_EPI64(a, index) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extract_epi64(${quote(a)}, ${quote(index)})")
    case iDef@MM256_XOR_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_xor_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_STOREU2_M128D(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_storeu2_m128d((double*) (${quote(hiaddr)  + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}), (double*) (${quote(loaddr)  + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))}), ${quote(a)});")
    case iDef@MM256_MUL_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mul_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_TESTC_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testc_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MUL_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mul_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTEPI32_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi32_pd(${quote(a)})")
    case iDef@MM256_STORE_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_store_pd((double *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM256_HSUB_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hsub_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SETR_EPI8(e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_epi8(${quote(e31)}, ${quote(e30)}, ${quote(e29)}, ${quote(e28)}, ${quote(e27)}, ${quote(e26)}, ${quote(e25)}, ${quote(e24)}, ${quote(e23)}, ${quote(e22)}, ${quote(e21)}, ${quote(e20)}, ${quote(e19)}, ${quote(e18)}, ${quote(e17)}, ${quote(e16)}, ${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_DP_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_dp_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_CVTPD_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtpd_ps(${quote(a)})")
    case iDef@MM256_STORE_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_store_ps((float *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM256_ZEXTPS128_PS256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_zextps128_ps256(${quote(a)})")
    case iDef@MM256_LOAD_PD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_load_pd((double const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_CASTPS128_PS256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castps128_ps256(${quote(a)})")
    case iDef@MM256_HSUB_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hsub_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_PERMUTE2F128_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permute2f128_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKSTORE_PD(mem_addr, mask, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_maskstore_pd((double *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)}, ${quote(a)});")
    case iDef@MM256_MIN_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_min_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SETR_EPI32(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_epi32(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_MASKSTORE_PS(mem_addr, mask, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_maskstore_ps((float *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)}, ${quote(a)});")
    case iDef@MM256_ADDSUB_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_addsub_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ADD_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_add_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ZEROALL() =>
      headers += iDef.header
      stream.println(s"_mm256_zeroall();")
    case iDef@MM256_TESTC_SI256(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testc_si256(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BLENDV_PS(a, b, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_blendv_ps(${quote(a)}, ${quote(b)}, ${quote(mask)})")
    case iDef@MM256_MIN_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_min_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ADD_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_add_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_BROADCAST_SS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcast_ss((float const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_AND_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_and_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTTPD_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvttpd_epi32(${quote(a)})")
    case iDef@MM256_SET_EPI16(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_epi16(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_LOADU2_M128D(hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_loadu2_m128d((double const*) (${quote(hiaddr)  + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}), (double const*) (${quote(loaddr)  + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))}))")
    case iDef@MM256_ANDNOT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_andnot_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_UNPACKLO_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpacklo_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTPD_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtpd_epi32(${quote(a)})")
    case iDef@MM256_CASTSI256_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castsi256_pd(${quote(a)})")
    case iDef@MM256_CASTPD256_PD128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castpd256_pd128(${quote(a)})")
    case iDef@MM256_ZEROUPPER() =>
      headers += iDef.header
      stream.println(s"_mm256_zeroupper();")
    case iDef@MM256_TESTNZC_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testnzc_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ADDSUB_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_addsub_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SQRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sqrt_pd(${quote(a)})")
    case iDef@MM256_STORE_SI256(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_store_si256((__m256i *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM256_STREAM_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_stream_pd((double *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM256_SET1_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set1_epi8(${quote(a)})")
    case iDef@MM256_CVTPS_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtps_epi32(${quote(a)})")
    case iDef@MM256_BLEND_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_blend_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_OR_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_or_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_INSERT_EPI32(a, i, index) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_insert_epi32(${quote(a)}, ${quote(i)}, ${quote(index)})")
    case iDef@MM256_PERMUTE2F128_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permute2f128_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKSTORE_PD(mem_addr, mask, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_maskstore_pd((double *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)}, ${quote(a)});")
    case iDef@MM256_CMP_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_INSERT_EPI64(a, i, index) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_insert_epi64(${quote(a)}, ${quote(i)}, ${quote(index)})")
    case iDef@MM256_SQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sqrt_ps(${quote(a)})")
    case iDef@MM256_EXTRACTF128_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extractf128_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_UNDEFINED_PS() =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_undefined_ps()")
    case iDef@MM256_SUB_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sub_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_EXTRACT_EPI16(a, index) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extract_epi16(${quote(a)}, ${quote(index)})")
    case iDef@MM256_EXTRACTF128_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extractf128_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_SET_EPI32(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_epi32(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_CMP_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_PERMUTE_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permute_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_PERMUTEVAR_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutevar_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_TESTZ_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testz_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BROADCAST_SD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcast_sd((double const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_PERMUTE_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permute_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_LOAD_PS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_load_ps((float const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_FLOOR_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_floor_ps(${quote(a)})")
    case iDef@MM_CMP_SD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MOVEMASK_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movemask_pd(${quote(a)})")
    case iDef@MM256_SETR_M128D(lo, hi) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_m128d(${quote(lo)}, ${quote(hi)})")
    case iDef@MM256_CVTPS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtps_pd(${quote(a)})")
    case iDef@MM256_LOADU_PD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_loadu_pd((double const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MAX_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SETR_PS(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_ps(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_TESTC_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testc_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_TESTC_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testc_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BROADCAST_SS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcast_ss((float const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_LOADU2_M128(hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_loadu2_m128((float const*) (${quote(hiaddr)  + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}), (float const*) (${quote(loaddr)  + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))}))")
    case iDef@MM256_PERMUTEVAR_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutevar_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_RSQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rsqrt_ps(${quote(a)})")
    case iDef@MM_PERMUTE_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permute_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_BROADCAST_PD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcast_pd((__m128d const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_ROUND_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_round_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_XOR_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_xor_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SHUFFLE_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shuffle_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_EXTRACT_EPI8(a, index) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extract_epi8(${quote(a)}, ${quote(index)})")
    case iDef@MM256_UNPACKHI_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpackhi_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKLOAD_PS(mem_addr, mask, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskload_ps((float const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)})")
    case iDef@MM256_MOVEHDUP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movehdup_ps(${quote(a)})")
    case iDef@MM256_ROUND_PD(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_round_pd(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_TESTNZC_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testnzc_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_TESTC_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testc_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_STOREU_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_storeu_pd((double *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM256_SET_PS(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_ps(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_DIV_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTEPI32_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi32_ps(${quote(a)})")
    case iDef@MM256_INSERT_EPI8(a, i, index) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_insert_epi8(${quote(a)}, ${quote(i)}, ${quote(index)})")
    case iDef@MM256_EXTRACTF128_SI256(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extractf128_si256(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_SET1_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set1_pd(${quote(a)})")
    case iDef@MM256_SET_M128D(hi, lo) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_m128d(${quote(hi)}, ${quote(lo)})")
    case iDef@MM256_SETZERO_SI256() =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setzero_si256()")
    case iDef@MM256_MOVEMASK_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movemask_ps(${quote(a)})")
    case iDef@MM256_CASTPD_SI256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castpd_si256(${quote(a)})")
    case iDef@MM256_PERMUTE2F128_SI256(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permute2f128_si256(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_DIV_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMP_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_LOAD_SI256(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_load_si256((__m256i const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_SET1_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set1_epi16(${quote(a)})")
    case iDef@MM_TESTNZC_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testnzc_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKSTORE_PS(mem_addr, mask, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_maskstore_ps((float *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)}, ${quote(a)});")
    case iDef@MM256_ZEXTSI128_SI256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_zextsi128_si256(${quote(a)})")
    case iDef@MM256_SHUFFLE_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shuffle_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_ANDNOT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_andnot_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CASTPD128_PD256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castpd128_pd256(${quote(a)})")
    case iDef@MM256_ZEXTPD128_PD256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_zextpd128_pd256(${quote(a)})")
    case iDef@MM256_CEIL_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_ceil_ps(${quote(a)})")
    case iDef@MM256_STOREU_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_storeu_ps((float *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM256_MASKLOAD_PS(mem_addr, mask, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskload_ps((float const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)})")
    case iDef@MM256_EXTRACT_EPI32(a, index) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extract_epi32(${quote(a)}, ${quote(index)})")
    case iDef@MM256_BROADCAST_PS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcast_ps((__m128 const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_CASTSI128_SI256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castsi128_si256(${quote(a)})")
    case iDef@MM256_LOADU_SI256(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_loadu_si256((__m256i const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_INSERTF128_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_insertf128_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_TESTZ_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testz_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_STREAM_SI256(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_stream_si256((__m256i *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM256_SUB_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sub_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_LOADU2_M128I(hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_loadu2_m128i((__m128i const*) (${quote(hiaddr)  + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}), (__m128i const*) (${quote(loaddr)  + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))}))")
    case iDef@MM256_HADD_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hadd_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKLOAD_PD(mem_addr, mask, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskload_pd((double const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)})")
    case iDef@MM256_CASTPD_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castpd_ps(${quote(a)})")
    case iDef@MM256_INSERT_EPI16(a, i, index) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_insert_epi16(${quote(a)}, ${quote(i)}, ${quote(index)})")
    case iDef@MM256_INSERTF128_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_insertf128_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_CASTSI256_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castsi256_ps(${quote(a)})")
    case iDef@MM256_SET_M128(hi, lo) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_m128(${quote(hi)}, ${quote(lo)})")
    case iDef@MM256_SETR_M128(lo, hi) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_m128(${quote(lo)}, ${quote(hi)})")
    case iDef@MM256_CVTTPS_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvttps_epi32(${quote(a)})")
    case iDef@MM256_CASTPS_SI256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castps_si256(${quote(a)})")
    case iDef@MM256_BLENDV_PD(a, b, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_blendv_pd(${quote(a)}, ${quote(b)}, ${quote(mask)})")
    case iDef@MM256_UNDEFINED_PD() =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_undefined_pd()")
    case iDef@MM256_INSERTF128_SI256(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_insertf128_si256(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_SET1_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set1_epi32(${quote(a)})")
    case iDef@MM256_HADD_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hadd_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_TESTZ_SI256(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testz_si256(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SETZERO_PS() =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setzero_ps()")
    case iDef@MM256_PERMUTEVAR_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutevar_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMP_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_RCP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rcp_ps(${quote(a)})")
    case iDef@MM256_SET_M128I(hi, lo) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_m128i(${quote(hi)}, ${quote(lo)})")
    case iDef@MM256_SETR_M128I(lo, hi) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_m128i(${quote(lo)}, ${quote(hi)})")
    case iDef@MM256_MOVELDUP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_moveldup_ps(${quote(a)})")
    case iDef@MM256_CASTPS256_PS128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castps256_ps128(${quote(a)})")
    case iDef@MM256_TESTZ_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testz_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SET_EPI64X(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_epi64x(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_UNPACKHI_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpackhi_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MOVEDUP_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movedup_pd(${quote(a)})")
    case iDef@MM256_UNPACKLO_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpacklo_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CASTSI256_SI128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castsi256_si128(${quote(a)})")
    case iDef@MM256_SET_EPI8(e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_epi8(${quote(e31)}, ${quote(e30)}, ${quote(e29)}, ${quote(e28)}, ${quote(e27)}, ${quote(e26)}, ${quote(e25)}, ${quote(e24)}, ${quote(e23)}, ${quote(e22)}, ${quote(e21)}, ${quote(e20)}, ${quote(e19)}, ${quote(e18)}, ${quote(e17)}, ${quote(e16)}, ${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_STREAM_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_stream_ps((float *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM256_CEIL_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_ceil_pd(${quote(a)})")
    case iDef@MM256_OR_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_or_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_PERMUTE_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permute_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_PERMUTEVAR_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutevar_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_TESTZ_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testz_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BLEND_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_blend_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_SETR_PD(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_pd(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_SETZERO_PD() =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setzero_pd()")
    case iDef@MM256_MAX_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKLOAD_PD(mem_addr, mask, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskload_pd((double const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)})")
    case _ => super.emitNode(sym, rhs)
  }
}
