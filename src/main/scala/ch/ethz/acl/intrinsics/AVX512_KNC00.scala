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

    
trait AVX512_KNC00 extends IntrinsicsBase {
  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * k1: __mmask16, a: __m512, b: __m512, imm8: const int, sae: const int
   */
  case class MM512_MASK_CMP_ROUND_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" within 128-bit lanes using the control in
   * "imm8", and store the results in "dst".
   * a: __m512i, imm8: _MM_PERM_ENUM
   */
  case class MM512_SHUFFLE_EPI32(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d
   */
  case class MM512_MASK_FMSUB_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst". 
   * 	[round_note]
   * a: __m512, b: __m512, rounding: int
   */
  case class MM512_MUL_ROUND_PS(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * src: __m512, k: __mmask16, a: __m512, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM512_MASK_GETMANT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set). [round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512, rounding: int
   */
  case class MM512_MASK_FNMADD_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst".
   * a: __m512, b: __m512, c: __m512
   */
  case class MM512_FNMADD_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 16 packed single-precision (32-bit) floating-point elements in
   * "v1" according to "conv" and stores them in memory locations starting at
   * location "mv" at packed 32-bit integer indices stored in "index" scaled by
   * "scale" using writemask "k" (elements are written only when the corresponding
   * mask bit is not set).
   * mv: void *, k: __mmask16, index: __m512i, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I32EXTSCATTER_PS[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed single-precision (32-bit) floating-point elements in "a" by
   * maximum using mask "k". Returns the minimum of all active elements in "a".
   * k: __mmask16, a: __m512
   */
  case class MM512_MASK_REDUCE_MIN_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, imm8: unsigned int
   */
  case class MM512_SLLI_EPI32(a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of the lower half of packed 32-bit
   * integer elements in "v2" to packed double-precision (64-bit) floating-point
   * elements, storing the results in "dst".
   * v2: __m512i
   */
  case class MM512_CVTEPI32LO_PD(v2: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed single-precision (32-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_BLEND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLE_EPU32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULLO_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set). 
   * 	[round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512, rounding: int
   */
  case class MM512_MASK_FNMSUB_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 double-precision (64-bit) floating-point elements in memory
   * locations starting at location "mv" at packed 32-bit integer indices stored in
   * the lower half of "index" scaled by "scale" using "conv" to 64-bit
   * floating-point elements and stores them in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, index: __m512i, mv: void const *, conv: _MM_UPCONV_PD_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I32LOEXTGATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULLO_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512d to type __m512i.
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512d
   */
  case class MM512_CASTPD_SI512(a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SRLV_EPI32(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_GETEXP_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" to see if neither is NaN, and store the results in mask vector "k" using
   * zeromask "k1" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_CMPORD_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 16 packed 32-bit integer elements in "v1" using "conv" and
   * stores them in memory locations starting at location "mv" at packed 32-bit
   * integer indices stored in "index" scaled by "scale". Elements are written
   * using writemask "k" (elements are only written when the corresponding mask bit
   * is set; otherwise, elements are left unchanged in memory). "hint" indicates to
   * the processor whether the data is non-temporal.
   * mv: void *, k: __mmask16, index: __m512i, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I32EXTSCATTER_EPI32[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed single-precision (32-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 64-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: void*, k: __mmask16, a: __m512, mem_addrOffset: int
   */
  case class MM512_MASK_STORE_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * a: __m512, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM512_GETMANT_ROUND_PS(a: Exp[__m512], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits (composed of 8 packed 64-bit integers) from memory into "dst".
   * 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_LOAD_EPI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGE_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst".
   * a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_FNMADD_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 64-bit integers from "a" to "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_MOV_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 128-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 64 bytes (16 elements) in
   * "dst".
   * a: __m512i, b: __m512i, count: const int
   */
  case class MM512_ALIGNR_EPI32(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed 32-bit integers in "a" by multiplication. Returns the
   * product of all elements in "a".
   * a: __m512i
   */
  case class MM512_REDUCE_MUL_EPI32(a: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of the lower half of packed
   * single-precision (32-bit) floating-point elements in "v2" to packed
   * double-precision (64-bit) floating-point elements, storing the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, v2: __m512
   */
  case class MM512_MASK_CVTPSLO_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).  [round_note]
   * a: __m512, b: __m512, c: __m512, k: __mmask16, rounding: int
   */
  case class MM512_MASK3_FNMSUB_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed 64-bit integers in "a" by maximum. Returns the maximum of
   * all elements in "a".
   * a: __m512i
   */
  case class MM512_REDUCE_MAX_EPI64(a: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLE_EPU32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" to see if either is NaN, and store the results in mask vector "k".
   * a: __m512, b: __m512
   */
  case class MM512_CMPUNORD_PS_MASK(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * k1: __mmask8, a: __m512d, b: __m512d, imm8: const int, sae: const int
   */
  case class MM512_MASK_CMP_ROUND_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst".
   * a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_FMADD_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPEQ_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-less-than, and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_CMPNLT_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed unsigned 32-bit integers in "a" by maximum using mask "k".
   * Returns the minimum of all active elements in "a".
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASK_REDUCE_MIN_EPU32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 512 bits (composed of packed 64-bit integers) in
   * "a" and then AND with "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ANDNOT_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 8 packed double-precision (64-bit) floating-point elements in
   * "v1" and stores them in memory locations starting at location "mv" at packed
   * 32-bit integer indices stored in "index" scaled by "scale" using "conv".
   * mv: void *, index: __m512i, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I32LOEXTSCATTER_PD[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512d], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).
   * a: __m512, b: __m512, c: __m512, k: __mmask16
   */
  case class MM512_MASK3_FNMSUB_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-less-than, and store the results in mask vector "k".
   * a: __m512, b: __m512
   */
  case class MM512_CMPNLT_PS_MASK(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set). [round_note]
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8, rounding: int
   */
  case class MM512_MASK3_FNMSUB_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Finds the absolute value of each packed double-precision (64-bit)
   * floating-point element in "v2", storing the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, v2: __m512d
   */
  case class MM512_MASK_ABS_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPNEQ_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst". 
   * 	[round_note]
   * a: __m512d, b: __m512d, c: __m512d, rounding: int
   */
  case class MM512_FMADD_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" to see if either is NaN, and store the results in mask vector "k".
   * a: __m512d, b: __m512d
   */
  case class MM512_CMPUNORD_PD_MASK(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_XOR_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_SUB_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m512, b: __m512, c: __m512, k: __mmask16
   */
  case class MM512_MASK3_FNMADD_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed double-precision (64-bit) floating-point elements in "a" by
   * multiplication using mask "k". Returns the product of all active elements in
   * "a".
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASK_REDUCE_MUL_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 16 packed 32-bit integers) from "a" into memory.
   * 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void*, a: __m512i, mem_addrOffset: int
   */
  case class MM512_STORE_EPI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASK_SUB_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * 	[round_note]
   * a: __m512, rounding: int
   */
  case class MM512_GETEXP_ROUND_PS(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed 32-bit integers in "a" by maximum using mask "k". Returns
   * the minimum of all active elements in "a".
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASK_REDUCE_MIN_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGE_EPU32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASK_SUB_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 16 single-precision (32-bit) memory locations starting at location
   * "mv" at packed 32-bit integer indices stored in "index" scaled by "scale"
   * using "conv" to single-precision (32-bit) floating-point elements and stores
   * them in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, index: __m512i, mv: void const *, conv: _MM_UPCONV_PS_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I32EXTGATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 64-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_BLEND_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * src: __m512i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOAD_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetches 16 single-precision (32-bit) floating-point elements in memory
   * starting at location "mv" at packed 32-bit integer indices stored in "index"
   * scaled by "scale". The "hint" parameter may be 1 (_MM_HINT_T0) for prefetching
   * to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache. Only those
   * elements whose corresponding mask bit in "k" is set are loaded into the
   * desired cache.
   * mv: void*, k: __mmask16, index: __m512i, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_PREFETCH_I32SCATTER_PS[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed 64-bit integers in "a" by maximum using mask "k". Returns
   * the maximum of all active elements in "a".
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASK_REDUCE_MAX_EPI64(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst". 
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512, rounding: int
   */
  case class MM512_FMADD_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 8 packed 64-bit integer elements in "v1" and stores them in
   * memory locations starting at location "mv" at packed 32-bit integer indices
   * stored in "index" scaled by "scale" using "conv".
   * mv: void *, index: __m512i, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I32LOEXTSCATTER_EPI64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed unsigned 32-bit integers in "a" by maximum. Returns the
   * maximum of all elements in "a".
   * a: __m512i
   */
  case class MM512_REDUCE_MAX_EPU32(a: Exp[__m512i]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "c" when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8, rounding: int
   */
  case class MM512_MASK3_FMADD_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed 64-bit integers in "a" by bitwise AND. Returns the bitwise
   * AND of all elements in "a".
   * a: __m512i
   */
  case class MM512_REDUCE_AND_EPI64(a: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for less-than, and store the results in mask vector "k".
   * a: __m512, b: __m512
   */
  case class MM512_CMPLT_PS_MASK(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 double-precision (64-bit) memory locations starting at location
   * "mv" at packed 32-bit integer indices stored in the lower half of "index"
   * scaled by "scale" using "conv" to 64-bit integer elements and stores them in
   * "dst".
   * index: __m512i, mv: void const *, conv: _MM_UPCONV_EPI64_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I32LOEXTGATHER_EPI64[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" within 128-bit lanes using the control in
   * "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, imm8: _MM_PERM_ENUM
   */
  case class MM512_MASK_SHUFFLE_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-less-than, and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_CMPNLT_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for equality, and store the results in mask vector "k" using zeromask "k1"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_CMPEQ_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for less-than-or-equal, and store the results in mask vector "k" using
   * zeromask "k1" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_CMPLE_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst".
   * a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_FMSUB_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * 	[round_note]
   * a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_SUB_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m512, k: __mmask16, b: __m512, c: __m512
   */
  case class MM512_MASK_FMADD_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASK_SRLI_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512 to type __m512d.
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512
   */
  case class MM512_CASTPS_PD(a: Exp[__m512]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-equal, and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_CMPNEQ_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGE_EPU32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SRAV_EPI32(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 32-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m512i, k: __mmask16, vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I32GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-equal, and store the results in mask vector "k".
   * a: __m512, b: __m512
   */
  case class MM512_CMPNEQ_PS_MASK(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of the lower half of packed
   * single-precision (32-bit) floating-point elements in "v2" to packed
   * double-precision (64-bit) floating-point elements, storing the results in
   * "dst".
   * v2: __m512
   */
  case class MM512_CVTPSLO_PD(v2: Exp[__m512]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits (composed of 8 packed double-precision (64-bit) floating-point
   * elements) from memory into "dst". 
   * 	"mem_addr" must be aligned on a 64-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_LOAD_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).  
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASK_MUL_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8
   */
  case class MM512_MASK3_FNMADD_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for less-than-or-equal, and store the results in mask vector "k".
   * a: __m512, b: __m512
   */
  case class MM512_CMPLE_PS_MASK(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-less-than, and store the results in mask vector "k".
   * a: __m512d, b: __m512d
   */
  case class MM512_CMPNLT_PD_MASK(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 32-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void*, k: __mmask16, a: __m512i, mem_addrOffset: int
   */
  case class MM512_MASK_STORE_EPI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLE_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 128-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 64 bytes (16 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i, count: const int
   */
  case class MM512_MASK_ALIGNR_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of the lower half of packed 32-bit
   * unsigned integer elements in "v2" to packed double-precision (64-bit)
   * floating-point elements, storing the results in "dst".
   * v2: __m512i
   */
  case class MM512_CVTEPU32LO_PD(v2: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-less-than-or-equal, and store the results in mask vector "k".
   * a: __m512d, b: __m512d
   */
  case class MM512_CMPNLE_PD_MASK(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPU32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed double-precision (64-bit) floating-point elements in "v1" to
   * memory locations starting at location "mv" at packed 32-bit integer indices
   * stored in "index" scaled by "scale". Only those elements whose corresponding
   * mask bit is set in writemask "k" are written to memory.
   * mv: void*, k: __mmask8, index: __m512i, v1: __m512d, scale: int, mvOffset: int
   */
  case class MM512_MASK_I32LOSCATTER_PD[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512d], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m512, k: __mmask16, b: __m512, c: __m512
   */
  case class MM512_MASK_FMSUB_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" to see if either is NaN, and store the results in mask vector "k" using
   * zeromask "k1" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_CMPUNORD_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "c" when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512, k: __mmask16, rounding: int
   */
  case class MM512_MASK3_FMADD_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-less-than-or-equal, and store the results in mask vector "k" using
   * zeromask "k1" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_CMPNLE_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 32-bit integers from "a" to "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_MOV_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst".
   * a: __m512, b: __m512, c: __m512
   */
  case class MM512_FMADD_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 32-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask16, vindex: __m512i, a: __m512i, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I32SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m512i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged in cache using
   * writemask "k" (elements are brought into cache only when their corresponding
   * mask bits are set). "scale" should be 1, 2, 4 or 8. The "hint" parameter may
   * be 1 (_MM_HINT_T0) for prefetching to L1 cache, or 2 (_MM_HINT_T1) for
   * prefetching to L2 cache.
   * vindex: __m512i, mask: __mmask16, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I32GATHER_PS[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_ADD_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for less-than-or-equal, and store the results in mask vector "k".
   * a: __m512d, b: __m512d
   */
  case class MM512_CMPLE_PD_MASK(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGT_EPI32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetches a set of 16 single-precision (32-bit) memory locations pointed by
   * base address "mv" and 32-bit integer index vector "index" with scale "scale"
   * to L1 or L2 level of cache depending on the value of "hint". The "hint"
   * parameter may be 1 (_MM_HINT_T0) for prefetching to L1 cache, or 2
   * (_MM_HINT_T1) for prefetching to L2 cache.
   * The "conv" parameter specifies the
   * granularity used by compilers to better encode the instruction. It should be
   * the same as the "conv" parameter specified for the subsequent gather
   * intrinsic.
   * index: __m512i, mv: void const *, conv: _MM_UPCONV_PS_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_PREFETCH_I32EXTGATHER_PS[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * a: __m512
   */
  case class MM512_GETEXP_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I32GATHER_PS[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetches a set of 16 single-precision (32-bit) memory locations pointed by
   * base address "mv" and 32-bit integer index vector "index" with scale "scale"
   * to L1 or L2 level of cache depending on the value of "hint". The "hint"
   * parameter may be 1 (_MM_HINT_T0) for prefetching to L1 cache, or 2
   * (_MM_HINT_T1) for prefetching to L2 cache.
   * The "conv" parameter specifies the
   * granularity used by compilers to better encode the instruction. It should be
   * the same as the "conv" parameter specified for the subsequent gather
   * intrinsic. Only those elements whose corresponding mask bit in "k" is set are
   * loaded into cache.
   * mv: void *, k: __mmask16, index: __m512i, conv: _MM_UPCONV_PS_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_PREFETCH_I32EXTSCATTER_PS[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * a: __m512d
   */
  case class MM512_GETEXP_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst".  
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512, rounding: int
   */
  case class MM512_FNMADD_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 64-byte
   * boundary or a general-protection exception may be generated.
   * src: __m512, k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOAD_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512, rounding: int
   */
  case class MM512_MASK_FMADD_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 32-bit integers in "a" and "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_OR_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_ADD_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of the lower half of packed 32-bit
   * integer elements in "v2" to packed double-precision (64-bit) floating-point
   * elements, storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, v2: __m512i
   */
  case class MM512_MASK_CVTEPI32LO_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set).
   * 	[round_note]
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d, rounding: int
   */
  case class MM512_MASK_FNMSUB_ROUND_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * 	 [round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASK_MUL_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_GETEXP_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).  [round_note]
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8, rounding: int
   */
  case class MM512_MASK3_FMSUB_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).  [round_note]
   * a: __m512, b: __m512, c: __m512, k: __mmask16, rounding: int
   */
  case class MM512_MASK3_FMSUB_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed double-precision (64-bit) floating-point elements in "v1" and
   * to memory locations starting at location "mv" at packed 32-bit integer indices
   * stored in "index" scaled by "scale".
   * mv: void*, index: __m512i, v1: __m512d, scale: int, mvOffset: int
   */
  case class MM512_I32LOSCATTER_PD[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512d], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for less-than-or-equal, and store the results in mask vector "k" using
   * zeromask "k1" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_CMPLE_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d, rounding: int
   */
  case class MM512_MASK_FMADD_ROUND_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst". 
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512, rounding: int
   */
  case class MM512_FMSUB_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-equal, and store the results in mask vector "k".
   * a: __m512d, b: __m512d
   */
  case class MM512_CMPNEQ_PD_MASK(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k1: __mmask8, a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_MASK_CMP_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed double-precision (64-bit) floating-point elements in "a" by
   * addition. Returns the sum of all elements in "a".
   * a: __m512d
   */
  case class MM512_REDUCE_ADD_PD(a: Exp[__m512d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, a: __m512, scale: int, base_addrOffset: int
   */
  case class MM512_I32SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m512], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed unsigned 32-bit integers in "a" by minimum. Returns the
   * minimum of all elements in "a".
   * a: __m512i
   */
  case class MM512_REDUCE_MIN_EPU32(a: Exp[__m512i]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed 64-bit integers in "a" by minimum. Returns the minimum of
   * all elements in "a".
   * a: __m512i
   */
  case class MM512_REDUCE_MIN_EPI64(a: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for less-than, and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_CMPLT_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512i to type __m512d.
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512i
   */
  case class MM512_CASTSI512_PD(a: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" to see if neither is NaN, and store the results in mask vector "k".
   * a: __m512, b: __m512
   */
  case class MM512_CMPORD_PS_MASK(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). 
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASK_ADD_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUB_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 8 packed 64-bit integers) from "a" into memory.
   * 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void*, a: __m512i, mem_addrOffset: int
   */
  case class MM512_STORE_EPI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed unsigned 64-bit integers in "a" by maximum. Returns the
   * maximum of all elements in "a".
   * a: __m512i
   */
  case class MM512_REDUCE_MAX_EPU64(a: Exp[__m512i]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits of integer data from "a" into memory. 
   * 	"mem_addr" must be
   * aligned on a 64-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: void*, a: __m512i, mem_addrOffset: int
   */
  case class MM512_STORE_SI512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Finds the absolute value of each packed single-precision (32-bit)
   * floating-point element in "v2", storing the results in "dst".
   * v2: __m512
   */
  case class MM512_ABS_PS(v2: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, count: __m512i
   */
  case class MM512_MASK_SRLV_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 512 bits (composed of packed 64-bit integers) in
   * "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_AND_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for equality, and store the results in mask vector "k".
   * a: __m512d, b: __m512d
   */
  case class MM512_CMPEQ_PD_MASK(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for less-than, and store the results in mask vector "k".
   * a: __m512d, b: __m512d
   */
  case class MM512_CMPLT_PD_MASK(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 16 single-precision (32-bit) memory locations starting at location
   * "mv" at packed 32-bit integer indices stored in "index" scaled by "scale"
   * using "conv" to 32-bit integer elements and stores them in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask16, index: __m512i, mv: void const *, conv: _MM_UPCONV_EPI32_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I32EXTGATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * a: __m512d, b: __m512d, imm8: const int, sae: const int
   */
  case class MM512_CMP_ROUND_PD_MASK(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m512i, b: __m512i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM512_CMP_EPU32_MASK(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASK_SLLI_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" to
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_MOV_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). 
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASK_ADD_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADD_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	"mem_addr" must be aligned on a 64-byte boundary or a
   * general-protection exception may be generated.
   * src: __m512i, k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOAD_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst".
   * 	[round_note]
   * a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_ADD_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed 64-bit integers in "a" by addition. Returns the sum of all
   * elements in "a".
   * a: __m512i
   */
  case class MM512_REDUCE_ADD_EPI64(a: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_GETEXP_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst".
   * 	[round_note]
   * a: __m512, b: __m512, rounding: int
   */
  case class MM512_ADD_ROUND_PS(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask16, a: __m512i, b: __m512i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM512_MASK_CMP_EPU32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m512, k: __mmask16, b: __m512, c: __m512
   */
  case class MM512_MASK_FNMADD_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" to
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_MOV_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits (composed of 16 packed single-precision (32-bit) floating-point
   * elements) from memory into "dst". 
   * 	"mem_addr" must be aligned on a 64-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_LOAD_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k1: __mmask16, a: __m512, b: __m512, imm8: const int
   */
  case class MM512_MASK_CMP_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGT_EPU32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reduce the packed single-precision (32-bit) floating-point elements in "a" by
   * addition. Returns the sum of all elements in "a".
   * a: __m512
   */
  case class MM512_REDUCE_ADD_PS(a: Exp[__m512]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_SUB_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst".  
   * 	[round_note]
   * a: __m512d, b: __m512d, c: __m512d, rounding: int
   */
  case class MM512_FNMSUB_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "c" when the
   * corresponding mask bit is not set).
   * a: __m512, b: __m512, c: __m512, k: __mmask16
   */
  case class MM512_MASK3_FMADD_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MIN_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512 to type __m512i.
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512
   */
  case class MM512_CASTPS_SI512(a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_mask_cmp_round_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_ROUND_PS_MASK(k1, a, b, imm8, sae)
  }
            
  def _mm512_shuffle_epi32(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_SHUFFLE_EPI32(a, imm8)
  }
            
  def _mm512_mask_fmsub_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FMSUB_PD(a, k, b, c)
  }
            
  def _mm512_mul_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MUL_ROUND_PS(a, b, rounding)
  }
            
  def _mm512_mask_getmant_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int]): Exp[__m512] = {
    MM512_MASK_GETMANT_PS(src, k, a, interv, sc)
  }
            
  def _mm512_mask_fnmadd_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FNMADD_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm512_fnmadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FNMADD_PS(a, b, c)
  }
            
  def _mm512_mask_i32extscatter_ps[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I32EXTSCATTER_PS(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_reduce_min_ps(k: Exp[Int], a: Exp[__m512]): Exp[Float] = {
    MM512_MASK_REDUCE_MIN_PS(k, a)
  }
            
  def _mm512_slli_epi32(a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_SLLI_EPI32(a, imm8)
  }
            
  def _mm512_cvtepi32lo_pd(v2: Exp[__m512i]): Exp[__m512d] = {
    MM512_CVTEPI32LO_PD(v2)
  }
            
  def _mm512_mask_blend_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_BLEND_PS(k, a, b)
  }
            
  def _mm512_cmple_epu32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLE_EPU32_MASK(a, b)
  }
            
  def _mm512_mullo_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULLO_EPI32(a, b)
  }
            
  def _mm512_mask_fnmsub_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FNMSUB_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm512_mask_i32loextgather_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mv)(MM512_MASK_I32LOEXTGATHER_PD(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_mullo_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULLO_EPI32(src, k, a, b)
  }
            
  def _mm512_castpd_si512(a: Exp[__m512d]): Exp[__m512i] = {
    MM512_CASTPD_SI512(a)
  }
            
  def _mm512_srlv_epi32(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SRLV_EPI32(a, count)
  }
            
  def _mm512_mask_getexp_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_GETEXP_PD(src, k, a)
  }
            
  def _mm512_mask_cmpord_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPORD_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_i32extscatter_epi32[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I32EXTSCATTER_EPI32(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_store_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_getmant_round_ps(a: Exp[__m512], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_GETMANT_ROUND_PS(a, interv, sc, rounding)
  }
            
  def _mm512_load_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_LOAD_EPI64(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cmpge_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGE_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_fnmadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FNMADD_PD(a, b, c)
  }
            
  def _mm512_mask_mov_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MOV_EPI64(src, k, a)
  }
            
  def _mm512_alignr_epi32(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_ALIGNR_EPI32(a, b, count)
  }
            
  def _mm512_reduce_mul_epi32(a: Exp[__m512i]): Exp[Int] = {
    MM512_REDUCE_MUL_EPI32(a)
  }
            
  def _mm512_mask_cvtpslo_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512]): Exp[__m512d] = {
    MM512_MASK_CVTPSLO_PD(src, k, v2)
  }
            
  def _mm512_mask3_fnmsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FNMSUB_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_reduce_max_epi64(a: Exp[__m512i]): Exp[Long] = {
    MM512_REDUCE_MAX_EPI64(a)
  }
            
  def _mm512_mask_cmple_epu32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLE_EPU32_MASK(k1, a, b)
  }
            
  def _mm512_cmpunord_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPUNORD_PS_MASK(a, b)
  }
            
  def _mm512_mask_cmp_round_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_ROUND_PD_MASK(k1, a, b, imm8, sae)
  }
            
  def _mm512_fmadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FMADD_PD(a, b, c)
  }
            
  def _mm512_mask_cmpeq_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPEQ_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpnlt_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPNLT_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_reduce_min_epu32(k: Exp[Int], a: Exp[__m512i]): Exp[UInt] = {
    MM512_MASK_REDUCE_MIN_EPU32(k, a)
  }
            
  def _mm512_andnot_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ANDNOT_EPI64(a, b)
  }
            
  def _mm512_i32loextscatter_pd[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512d], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I32LOEXTSCATTER_PD(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask3_fnmsub_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FNMSUB_PS(a, b, c, k)
  }
            
  def _mm512_cmpnlt_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPNLT_PS_MASK(a, b)
  }
            
  def _mm512_mask3_fnmsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FNMSUB_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm512_mask_abs_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ABS_PD(src, k, v2)
  }
            
  def _mm512_mask_cmpneq_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPNEQ_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_fmadd_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FMADD_ROUND_PD(a, b, c, rounding)
  }
            
  def _mm512_cmpunord_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPUNORD_PD_MASK(a, b)
  }
            
  def _mm512_mask_xor_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_XOR_EPI32(src, k, a, b)
  }
            
  def _mm512_sub_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_SUB_PS(a, b)
  }
            
  def _mm512_mask3_fnmadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FNMADD_PS(a, b, c, k)
  }
            
  def _mm512_mask_reduce_mul_pd(k: Exp[Int], a: Exp[__m512d]): Exp[Double] = {
    MM512_MASK_REDUCE_MUL_PD(k, a)
  }
            
  def _mm512_store_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STORE_EPI32(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_sub_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SUB_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_getexp_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_GETEXP_ROUND_PS(a, rounding)
  }
            
  def _mm512_mask_reduce_min_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_REDUCE_MIN_EPI32(k, a)
  }
            
  def _mm512_cmpge_epu32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGE_EPU32_MASK(a, b)
  }
            
  def _mm512_mask_sub_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SUB_ROUND_PD(src, k, a, b, rounding)
  }
            
  def _mm512_mask_i32extgather_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mv)(MM512_MASK_I32EXTGATHER_PS(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_blend_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_BLEND_EPI64(k, a, b)
  }
            
  def _mm512_mask_load_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOAD_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_prefetch_i32scatter_ps[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_PREFETCH_I32SCATTER_PS(mv, k, index, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_reduce_max_epi64(k: Exp[Int], a: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_REDUCE_MAX_EPI64(k, a)
  }
            
  def _mm512_fmadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMADD_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_i32loextscatter_epi64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I32LOEXTSCATTER_EPI64(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_reduce_max_epu32(a: Exp[__m512i]): Exp[UInt] = {
    MM512_REDUCE_MAX_EPU32(a)
  }
            
  def _mm512_mask3_fmadd_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMADD_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm512_reduce_and_epi64(a: Exp[__m512i]): Exp[Long] = {
    MM512_REDUCE_AND_EPI64(a)
  }
            
  def _mm512_cmplt_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPLT_PS_MASK(a, b)
  }
            
  def _mm512_i32loextgather_epi64[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_I32LOEXTGATHER_EPI64(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_shuffle_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SHUFFLE_EPI32(src, k, a, imm8)
  }
            
  def _mm512_mask_cmpnlt_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPNLT_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpeq_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPEQ_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmple_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPLE_PD_MASK(k1, a, b)
  }
            
  def _mm512_fmsub_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FMSUB_PD(a, b, c)
  }
            
  def _mm512_sub_round_pd(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_SUB_ROUND_PD(a, b, rounding)
  }
            
  def _mm512_mask_fmadd_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMADD_PS(a, k, b, c)
  }
            
  def _mm512_mask_srli_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASK_SRLI_EPI32(src, k, a, imm8)
  }
            
  def _mm512_castps_pd(a: Exp[__m512]): Exp[__m512d] = {
    MM512_CASTPS_PD(a)
  }
            
  def _mm512_mask_cmpneq_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPNEQ_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpge_epu32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGE_EPU32_MASK(k1, a, b)
  }
            
  def _mm512_srav_epi32(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SRAV_EPI32(a, count)
  }
            
  def _mm512_mask_i32gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(base_addr)(MM512_MASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cmpneq_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPNEQ_PS_MASK(a, b)
  }
            
  def _mm512_cvtpslo_pd(v2: Exp[__m512]): Exp[__m512d] = {
    MM512_CVTPSLO_PD(v2)
  }
            
  def _mm512_load_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_LOAD_PD(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_max_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPI32(src, k, a, b)
  }
            
  def _mm512_mask_mul_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_MUL_ROUND_PD(src, k, a, b, rounding)
  }
            
  def _mm512_mask3_fnmadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FNMADD_PD(a, b, c, k)
  }
            
  def _mm512_cmple_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPLE_PS_MASK(a, b)
  }
            
  def _mm512_cmpnlt_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPNLT_PD_MASK(a, b)
  }
            
  def _mm512_mask_store_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STORE_EPI32(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cmple_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLE_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_mask_alignr_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_ALIGNR_EPI32(src, k, a, b, count)
  }
            
  def _mm512_cvtepu32lo_pd(v2: Exp[__m512i]): Exp[__m512d] = {
    MM512_CVTEPU32LO_PD(v2)
  }
            
  def _mm512_cmpnle_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPNLE_PD_MASK(a, b)
  }
            
  def _mm512_max_epu32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPU32(a, b)
  }
            
  def _mm512_mask_i32loscatter_pd[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512d], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I32LOSCATTER_PD(mv, k, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_fmsub_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMSUB_PS(a, k, b, c)
  }
            
  def _mm512_mask_cmpunord_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPUNORD_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask3_fmadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMADD_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_mask_cmpnle_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPNLE_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_mov_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MOV_EPI32(src, k, a)
  }
            
  def _mm512_fmadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FMADD_PS(a, b, c)
  }
            
  def _mm512_mask_i32scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m512i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_prefetch_i32gather_ps[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_MASK_PREFETCH_I32GATHER_PS(vindex, mask, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_add_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_ADD_PD(a, b)
  }
            
  def _mm512_cmple_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPLE_PD_MASK(a, b)
  }
            
  def _mm512_cmpgt_epi32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGT_EPI32_MASK(a, b)
  }
            
  def _mm512_prefetch_i32extgather_ps[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(mv)(MM512_PREFETCH_I32EXTGATHER_PS(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_getexp_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_GETEXP_PS(a)
  }
            
  def _mm512_i32gather_ps[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(base_addr)(MM512_I32GATHER_PS(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_prefetch_i32extscatter_ps[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_PREFETCH_I32EXTSCATTER_PS(mv, k, index, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_getexp_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_GETEXP_PD(a)
  }
            
  def _mm512_fnmadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FNMADD_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_mask_load_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_fmadd_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FMADD_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm512_mask_or_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_OR_EPI32(src, k, a, b)
  }
            
  def _mm512_add_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_ADD_PS(a, b)
  }
            
  def _mm512_mask_cvtepi32lo_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASK_CVTEPI32LO_PD(src, k, v2)
  }
            
  def _mm512_mask_fnmsub_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FNMSUB_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm512_mask_mul_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_MUL_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_mask_getexp_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_GETEXP_ROUND_PD(src, k, a, rounding)
  }
            
  def _mm512_mask_min_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPI32(src, k, a, b)
  }
            
  def _mm512_mask3_fmsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMSUB_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm512_mask3_fmsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMSUB_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_i32loscatter_pd[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512d], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I32LOSCATTER_PD(mv, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cmple_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPLE_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_fmadd_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FMADD_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm512_fmsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMSUB_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_cmpneq_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPNEQ_PD_MASK(a, b)
  }
            
  def _mm512_mask_cmp_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_PD_MASK(k1, a, b, imm8)
  }
            
  def _mm512_reduce_add_pd(a: Exp[__m512d]): Exp[Double] = {
    MM512_REDUCE_ADD_PD(a)
  }
            
  def _mm512_i32scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m512], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_I32SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_reduce_min_epu32(a: Exp[__m512i]): Exp[UInt] = {
    MM512_REDUCE_MIN_EPU32(a)
  }
            
  def _mm512_reduce_min_epi64(a: Exp[__m512i]): Exp[Long] = {
    MM512_REDUCE_MIN_EPI64(a)
  }
            
  def _mm512_mask_cmplt_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPLT_PD_MASK(k1, a, b)
  }
            
  def _mm512_castsi512_pd(a: Exp[__m512i]): Exp[__m512d] = {
    MM512_CASTSI512_PD(a)
  }
            
  def _mm512_cmpord_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPORD_PS_MASK(a, b)
  }
            
  def _mm512_mask_add_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ADD_ROUND_PD(src, k, a, b, rounding)
  }
            
  def _mm512_sub_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUB_EPI32(a, b)
  }
            
  def _mm512_store_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STORE_EPI64(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_reduce_max_epu64(a: Exp[__m512i]): Exp[ULong] = {
    MM512_REDUCE_MAX_EPU64(a)
  }
            
  def _mm512_store_si512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STORE_SI512(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_abs_ps(v2: Exp[__m512]): Exp[__m512] = {
    MM512_ABS_PS(v2)
  }
            
  def _mm512_mask_srlv_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SRLV_EPI32(src, k, a, count)
  }
            
  def _mm512_and_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_AND_EPI64(a, b)
  }
            
  def _mm512_cmpeq_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPEQ_PD_MASK(a, b)
  }
            
  def _mm512_cmplt_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPLT_PD_MASK(a, b)
  }
            
  def _mm512_mask_i32extgather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_MASK_I32EXTGATHER_EPI32(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cmp_round_pd_mask(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM512_CMP_ROUND_PD_MASK(a, b, imm8, sae)
  }
            
  def _mm512_cmp_epu32_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_EPU32_MASK(a, b, imm8)
  }
            
  def _mm512_mask_slli_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASK_SLLI_EPI32(src, k, a, imm8)
  }
            
  def _mm512_mask_mov_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_MOV_PD(src, k, a)
  }
            
  def _mm512_mask_add_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ADD_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_mask_add_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADD_EPI32(src, k, a, b)
  }
            
  def _mm512_mask_load_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOAD_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_add_round_pd(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_ADD_ROUND_PD(a, b, rounding)
  }
            
  def _mm512_reduce_add_epi64(a: Exp[__m512i]): Exp[Long] = {
    MM512_REDUCE_ADD_EPI64(a)
  }
            
  def _mm512_mask_getexp_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_GETEXP_PS(src, k, a)
  }
            
  def _mm512_add_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_ADD_ROUND_PS(a, b, rounding)
  }
            
  def _mm512_mask_cmp_epu32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_EPU32_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_fnmadd_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FNMADD_PS(a, k, b, c)
  }
            
  def _mm512_mask_mov_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MOV_PS(src, k, a)
  }
            
  def _mm512_load_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_LOAD_PS(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cmp_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_PS_MASK(k1, a, b, imm8)
  }
            
  def _mm512_cmpgt_epu32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGT_EPU32_MASK(a, b)
  }
            
  def _mm512_reduce_add_ps(a: Exp[__m512]): Exp[Float] = {
    MM512_REDUCE_ADD_PS(a)
  }
            
  def _mm512_mask_min_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPU32(src, k, a, b)
  }
            
  def _mm512_mask_sub_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SUB_PS(src, k, a, b)
  }
            
  def _mm512_fnmsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FNMSUB_ROUND_PD(a, b, c, rounding)
  }
            
  def _mm512_mask3_fmadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMADD_PS(a, b, c, k)
  }
            
  def _mm512_min_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MIN_EPI32(a, b)
  }
            
  def _mm512_castps_si512(a: Exp[__m512]): Exp[__m512i] = {
    MM512_CASTPS_SI512(a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASK_CMP_ROUND_PS_MASK (k1, a, b, imm8, sae) =>
      _mm512_mask_cmp_round_ps_mask(f(k1), f(a), f(b), f(imm8), f(sae))
    case MM512_SHUFFLE_EPI32 (a, imm8) =>
      _mm512_shuffle_epi32(f(a), f(imm8))
    case MM512_MASK_FMSUB_PD (a, k, b, c) =>
      _mm512_mask_fmsub_pd(f(a), f(k), f(b), f(c))
    case MM512_MUL_ROUND_PS (a, b, rounding) =>
      _mm512_mul_round_ps(f(a), f(b), f(rounding))
    case MM512_MASK_GETMANT_PS (src, k, a, interv, sc) =>
      _mm512_mask_getmant_ps(f(src), f(k), f(a), f(interv), f(sc))
    case MM512_MASK_FNMADD_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fnmadd_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_FNMADD_PS (a, b, c) =>
      _mm512_fnmadd_ps(f(a), f(b), f(c))
    case iDef@MM512_MASK_I32EXTSCATTER_PS (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i32extscatter_ps(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_REDUCE_MIN_PS (k, a) =>
      _mm512_mask_reduce_min_ps(f(k), f(a))
    case MM512_SLLI_EPI32 (a, imm8) =>
      _mm512_slli_epi32(f(a), f(imm8))
    case MM512_CVTEPI32LO_PD (v2) =>
      _mm512_cvtepi32lo_pd(f(v2))
    case MM512_MASK_BLEND_PS (k, a, b) =>
      _mm512_mask_blend_ps(f(k), f(a), f(b))
    case MM512_CMPLE_EPU32_MASK (a, b) =>
      _mm512_cmple_epu32_mask(f(a), f(b))
    case MM512_MULLO_EPI32 (a, b) =>
      _mm512_mullo_epi32(f(a), f(b))
    case MM512_MASK_FNMSUB_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fnmsub_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case iDef@MM512_MASK_I32LOEXTGATHER_PD (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i32loextgather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MULLO_EPI32 (src, k, a, b) =>
      _mm512_mask_mullo_epi32(f(src), f(k), f(a), f(b))
    case MM512_CASTPD_SI512 (a) =>
      _mm512_castpd_si512(f(a))
    case MM512_SRLV_EPI32 (a, count) =>
      _mm512_srlv_epi32(f(a), f(count))
    case MM512_MASK_GETEXP_PD (src, k, a) =>
      _mm512_mask_getexp_pd(f(src), f(k), f(a))
    case MM512_MASK_CMPORD_PS_MASK (k1, a, b) =>
      _mm512_mask_cmpord_ps_mask(f(k1), f(a), f(b))
    case iDef@MM512_MASK_I32EXTSCATTER_EPI32 (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i32extscatter_epi32(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_store_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_GETMANT_ROUND_PS (a, interv, sc, rounding) =>
      _mm512_getmant_round_ps(f(a), f(interv), f(sc), f(rounding))
    case iDef@MM512_LOAD_EPI64 (mem_addr, mem_addrOffset) =>
      _mm512_load_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CMPGE_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epi32_mask(f(k1), f(a), f(b))
    case MM512_FNMADD_PD (a, b, c) =>
      _mm512_fnmadd_pd(f(a), f(b), f(c))
    case MM512_MASK_MOV_EPI64 (src, k, a) =>
      _mm512_mask_mov_epi64(f(src), f(k), f(a))
    case MM512_ALIGNR_EPI32 (a, b, count) =>
      _mm512_alignr_epi32(f(a), f(b), f(count))
    case MM512_REDUCE_MUL_EPI32 (a) =>
      _mm512_reduce_mul_epi32(f(a))
    case MM512_MASK_CVTPSLO_PD (src, k, v2) =>
      _mm512_mask_cvtpslo_pd(f(src), f(k), f(v2))
    case MM512_MASK3_FNMSUB_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fnmsub_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_REDUCE_MAX_EPI64 (a) =>
      _mm512_reduce_max_epi64(f(a))
    case MM512_MASK_CMPLE_EPU32_MASK (k1, a, b) =>
      _mm512_mask_cmple_epu32_mask(f(k1), f(a), f(b))
    case MM512_CMPUNORD_PS_MASK (a, b) =>
      _mm512_cmpunord_ps_mask(f(a), f(b))
    case MM512_MASK_CMP_ROUND_PD_MASK (k1, a, b, imm8, sae) =>
      _mm512_mask_cmp_round_pd_mask(f(k1), f(a), f(b), f(imm8), f(sae))
    case MM512_FMADD_PD (a, b, c) =>
      _mm512_fmadd_pd(f(a), f(b), f(c))
    case MM512_MASK_CMPEQ_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_epi32_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNLT_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpnlt_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_REDUCE_MIN_EPU32 (k, a) =>
      _mm512_mask_reduce_min_epu32(f(k), f(a))
    case MM512_ANDNOT_EPI64 (a, b) =>
      _mm512_andnot_epi64(f(a), f(b))
    case iDef@MM512_I32LOEXTSCATTER_PD (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i32loextscatter_pd(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK3_FNMSUB_PS (a, b, c, k) =>
      _mm512_mask3_fnmsub_ps(f(a), f(b), f(c), f(k))
    case MM512_CMPNLT_PS_MASK (a, b) =>
      _mm512_cmpnlt_ps_mask(f(a), f(b))
    case MM512_MASK3_FNMSUB_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fnmsub_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_ABS_PD (src, k, v2) =>
      _mm512_mask_abs_pd(f(src), f(k), f(v2))
    case MM512_MASK_CMPNEQ_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epi32_mask(f(k1), f(a), f(b))
    case MM512_FMADD_ROUND_PD (a, b, c, rounding) =>
      _mm512_fmadd_round_pd(f(a), f(b), f(c), f(rounding))
    case MM512_CMPUNORD_PD_MASK (a, b) =>
      _mm512_cmpunord_pd_mask(f(a), f(b))
    case MM512_MASK_XOR_EPI32 (src, k, a, b) =>
      _mm512_mask_xor_epi32(f(src), f(k), f(a), f(b))
    case MM512_SUB_PS (a, b) =>
      _mm512_sub_ps(f(a), f(b))
    case MM512_MASK3_FNMADD_PS (a, b, c, k) =>
      _mm512_mask3_fnmadd_ps(f(a), f(b), f(c), f(k))
    case MM512_MASK_REDUCE_MUL_PD (k, a) =>
      _mm512_mask_reduce_mul_pd(f(k), f(a))
    case iDef@MM512_STORE_EPI32 (mem_addr, a, mem_addrOffset) =>
      _mm512_store_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SUB_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_sub_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_GETEXP_ROUND_PS (a, rounding) =>
      _mm512_getexp_round_ps(f(a), f(rounding))
    case MM512_MASK_REDUCE_MIN_EPI32 (k, a) =>
      _mm512_mask_reduce_min_epi32(f(k), f(a))
    case MM512_CMPGE_EPU32_MASK (a, b) =>
      _mm512_cmpge_epu32_mask(f(a), f(b))
    case MM512_MASK_SUB_ROUND_PD (src, k, a, b, rounding) =>
      _mm512_mask_sub_round_pd(f(src), f(k), f(a), f(b), f(rounding))
    case iDef@MM512_MASK_I32EXTGATHER_PS (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i32extgather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_BLEND_EPI64 (k, a, b) =>
      _mm512_mask_blend_epi64(f(k), f(a), f(b))
    case iDef@MM512_MASK_LOAD_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_load_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PREFETCH_I32SCATTER_PS (mv, k, index, scale, hint, mvOffset) =>
      _mm512_mask_prefetch_i32scatter_ps(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_REDUCE_MAX_EPI64 (k, a) =>
      _mm512_mask_reduce_max_epi64(f(k), f(a))
    case MM512_FMADD_ROUND_PS (a, b, c, rounding) =>
      _mm512_fmadd_round_ps(f(a), f(b), f(c), f(rounding))
    case iDef@MM512_I32LOEXTSCATTER_EPI64 (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i32loextscatter_epi64(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_REDUCE_MAX_EPU32 (a) =>
      _mm512_reduce_max_epu32(f(a))
    case MM512_MASK3_FMADD_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fmadd_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_REDUCE_AND_EPI64 (a) =>
      _mm512_reduce_and_epi64(f(a))
    case MM512_CMPLT_PS_MASK (a, b) =>
      _mm512_cmplt_ps_mask(f(a), f(b))
    case iDef@MM512_I32LOEXTGATHER_EPI64 (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_i32loextgather_epi64(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SHUFFLE_EPI32 (src, k, a, imm8) =>
      _mm512_mask_shuffle_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_CMPNLT_PS_MASK (k1, a, b) =>
      _mm512_mask_cmpnlt_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPEQ_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLE_PD_MASK (k1, a, b) =>
      _mm512_mask_cmple_pd_mask(f(k1), f(a), f(b))
    case MM512_FMSUB_PD (a, b, c) =>
      _mm512_fmsub_pd(f(a), f(b), f(c))
    case MM512_SUB_ROUND_PD (a, b, rounding) =>
      _mm512_sub_round_pd(f(a), f(b), f(rounding))
    case MM512_MASK_FMADD_PS (a, k, b, c) =>
      _mm512_mask_fmadd_ps(f(a), f(k), f(b), f(c))
    case MM512_MASK_SRLI_EPI32 (src, k, a, imm8) =>
      _mm512_mask_srli_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_CASTPS_PD (a) =>
      _mm512_castps_pd(f(a))
    case MM512_MASK_CMPNEQ_PS_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPGE_EPU32_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epu32_mask(f(k1), f(a), f(b))
    case MM512_SRAV_EPI32 (a, count) =>
      _mm512_srav_epi32(f(a), f(count))
    case iDef@MM512_MASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i32gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CMPNEQ_PS_MASK (a, b) =>
      _mm512_cmpneq_ps_mask(f(a), f(b))
    case MM512_CVTPSLO_PD (v2) =>
      _mm512_cvtpslo_pd(f(v2))
    case iDef@MM512_LOAD_PD (mem_addr, mem_addrOffset) =>
      _mm512_load_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MAX_EPI32 (src, k, a, b) =>
      _mm512_mask_max_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASK_MUL_ROUND_PD (src, k, a, b, rounding) =>
      _mm512_mask_mul_round_pd(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASK3_FNMADD_PD (a, b, c, k) =>
      _mm512_mask3_fnmadd_pd(f(a), f(b), f(c), f(k))
    case MM512_CMPLE_PS_MASK (a, b) =>
      _mm512_cmple_ps_mask(f(a), f(b))
    case MM512_CMPNLT_PD_MASK (a, b) =>
      _mm512_cmpnlt_pd_mask(f(a), f(b))
    case iDef@MM512_MASK_STORE_EPI32 (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_store_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CMPLE_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmple_epi32_mask(f(k1), f(a), f(b))
    case MM512_MASK_ALIGNR_EPI32 (src, k, a, b, count) =>
      _mm512_mask_alignr_epi32(f(src), f(k), f(a), f(b), f(count))
    case MM512_CVTEPU32LO_PD (v2) =>
      _mm512_cvtepu32lo_pd(f(v2))
    case MM512_CMPNLE_PD_MASK (a, b) =>
      _mm512_cmpnle_pd_mask(f(a), f(b))
    case MM512_MAX_EPU32 (a, b) =>
      _mm512_max_epu32(f(a), f(b))
    case iDef@MM512_MASK_I32LOSCATTER_PD (mv, k, index, v1, scale, mvOffset) =>
      _mm512_mask_i32loscatter_pd(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_FMSUB_PS (a, k, b, c) =>
      _mm512_mask_fmsub_ps(f(a), f(k), f(b), f(c))
    case MM512_MASK_CMPUNORD_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpunord_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK3_FMADD_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fmadd_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_CMPNLE_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpnle_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_MOV_EPI32 (src, k, a) =>
      _mm512_mask_mov_epi32(f(src), f(k), f(a))
    case MM512_FMADD_PS (a, b, c) =>
      _mm512_fmadd_ps(f(a), f(b), f(c))
    case iDef@MM512_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm512_mask_i32scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PREFETCH_I32GATHER_PS (vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i32gather_ps(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_ADD_PD (a, b) =>
      _mm512_add_pd(f(a), f(b))
    case MM512_CMPLE_PD_MASK (a, b) =>
      _mm512_cmple_pd_mask(f(a), f(b))
    case MM512_CMPGT_EPI32_MASK (a, b) =>
      _mm512_cmpgt_epi32_mask(f(a), f(b))
    case iDef@MM512_PREFETCH_I32EXTGATHER_PS (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_prefetch_i32extgather_ps(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_GETEXP_PS (a) =>
      _mm512_getexp_ps(f(a))
    case iDef@MM512_I32GATHER_PS (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i32gather_ps(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PREFETCH_I32EXTSCATTER_PS (mv, k, index, conv, scale, hint, mvOffset) =>
      _mm512_mask_prefetch_i32extscatter_ps(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_GETEXP_PD (a) =>
      _mm512_getexp_pd(f(a))
    case MM512_FNMADD_ROUND_PS (a, b, c, rounding) =>
      _mm512_fnmadd_round_ps(f(a), f(b), f(c), f(rounding))
    case iDef@MM512_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_load_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_FMADD_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fmadd_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_MASK_OR_EPI32 (src, k, a, b) =>
      _mm512_mask_or_epi32(f(src), f(k), f(a), f(b))
    case MM512_ADD_PS (a, b) =>
      _mm512_add_ps(f(a), f(b))
    case MM512_MASK_CVTEPI32LO_PD (src, k, v2) =>
      _mm512_mask_cvtepi32lo_pd(f(src), f(k), f(v2))
    case MM512_MASK_FNMSUB_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fnmsub_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_MASK_MUL_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_mul_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASK_GETEXP_ROUND_PD (src, k, a, rounding) =>
      _mm512_mask_getexp_round_pd(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_MIN_EPI32 (src, k, a, b) =>
      _mm512_mask_min_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASK3_FMSUB_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fmsub_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK3_FMSUB_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fmsub_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case iDef@MM512_I32LOSCATTER_PD (mv, index, v1, scale, mvOffset) =>
      _mm512_i32loscatter_pd(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CMPLE_PS_MASK (k1, a, b) =>
      _mm512_mask_cmple_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_FMADD_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fmadd_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_FMSUB_ROUND_PS (a, b, c, rounding) =>
      _mm512_fmsub_round_ps(f(a), f(b), f(c), f(rounding))
    case MM512_CMPNEQ_PD_MASK (a, b) =>
      _mm512_cmpneq_pd_mask(f(a), f(b))
    case MM512_MASK_CMP_PD_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_pd_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_REDUCE_ADD_PD (a) =>
      _mm512_reduce_add_pd(f(a))
    case iDef@MM512_I32SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm512_i32scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_REDUCE_MIN_EPU32 (a) =>
      _mm512_reduce_min_epu32(f(a))
    case MM512_REDUCE_MIN_EPI64 (a) =>
      _mm512_reduce_min_epi64(f(a))
    case MM512_MASK_CMPLT_PD_MASK (k1, a, b) =>
      _mm512_mask_cmplt_pd_mask(f(k1), f(a), f(b))
    case MM512_CASTSI512_PD (a) =>
      _mm512_castsi512_pd(f(a))
    case MM512_CMPORD_PS_MASK (a, b) =>
      _mm512_cmpord_ps_mask(f(a), f(b))
    case MM512_MASK_ADD_ROUND_PD (src, k, a, b, rounding) =>
      _mm512_mask_add_round_pd(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_SUB_EPI32 (a, b) =>
      _mm512_sub_epi32(f(a), f(b))
    case iDef@MM512_STORE_EPI64 (mem_addr, a, mem_addrOffset) =>
      _mm512_store_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_REDUCE_MAX_EPU64 (a) =>
      _mm512_reduce_max_epu64(f(a))
    case iDef@MM512_STORE_SI512 (mem_addr, a, mem_addrOffset) =>
      _mm512_store_si512(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_ABS_PS (v2) =>
      _mm512_abs_ps(f(v2))
    case MM512_MASK_SRLV_EPI32 (src, k, a, count) =>
      _mm512_mask_srlv_epi32(f(src), f(k), f(a), f(count))
    case MM512_AND_EPI64 (a, b) =>
      _mm512_and_epi64(f(a), f(b))
    case MM512_CMPEQ_PD_MASK (a, b) =>
      _mm512_cmpeq_pd_mask(f(a), f(b))
    case MM512_CMPLT_PD_MASK (a, b) =>
      _mm512_cmplt_pd_mask(f(a), f(b))
    case iDef@MM512_MASK_I32EXTGATHER_EPI32 (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i32extgather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CMP_ROUND_PD_MASK (a, b, imm8, sae) =>
      _mm512_cmp_round_pd_mask(f(a), f(b), f(imm8), f(sae))
    case MM512_CMP_EPU32_MASK (a, b, imm8) =>
      _mm512_cmp_epu32_mask(f(a), f(b), f(imm8))
    case MM512_MASK_SLLI_EPI32 (src, k, a, imm8) =>
      _mm512_mask_slli_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_MOV_PD (src, k, a) =>
      _mm512_mask_mov_pd(f(src), f(k), f(a))
    case MM512_MASK_ADD_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_add_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASK_ADD_EPI32 (src, k, a, b) =>
      _mm512_mask_add_epi32(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_LOAD_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_load_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_ADD_ROUND_PD (a, b, rounding) =>
      _mm512_add_round_pd(f(a), f(b), f(rounding))
    case MM512_REDUCE_ADD_EPI64 (a) =>
      _mm512_reduce_add_epi64(f(a))
    case MM512_MASK_GETEXP_PS (src, k, a) =>
      _mm512_mask_getexp_ps(f(src), f(k), f(a))
    case MM512_ADD_ROUND_PS (a, b, rounding) =>
      _mm512_add_round_ps(f(a), f(b), f(rounding))
    case MM512_MASK_CMP_EPU32_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_epu32_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_FNMADD_PS (a, k, b, c) =>
      _mm512_mask_fnmadd_ps(f(a), f(k), f(b), f(c))
    case MM512_MASK_MOV_PS (src, k, a) =>
      _mm512_mask_mov_ps(f(src), f(k), f(a))
    case iDef@MM512_LOAD_PS (mem_addr, mem_addrOffset) =>
      _mm512_load_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CMP_PS_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_ps_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_CMPGT_EPU32_MASK (a, b) =>
      _mm512_cmpgt_epu32_mask(f(a), f(b))
    case MM512_REDUCE_ADD_PS (a) =>
      _mm512_reduce_add_ps(f(a))
    case MM512_MASK_MIN_EPU32 (src, k, a, b) =>
      _mm512_mask_min_epu32(f(src), f(k), f(a), f(b))
    case MM512_MASK_SUB_PS (src, k, a, b) =>
      _mm512_mask_sub_ps(f(src), f(k), f(a), f(b))
    case MM512_FNMSUB_ROUND_PD (a, b, c, rounding) =>
      _mm512_fnmsub_round_pd(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMADD_PS (a, b, c, k) =>
      _mm512_mask3_fmadd_ps(f(a), f(b), f(c), f(k))
    case MM512_MIN_EPI32 (a, b) =>
      _mm512_min_epi32(f(a), f(b))
    case MM512_CASTPS_SI512 (a) =>
      _mm512_castps_si512(f(a))

    case Reflect(MM512_MASK_CMP_ROUND_PS_MASK (k1, a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_ROUND_PS_MASK (f(k1), f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MUL_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MUL_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETMANT_PS (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETMANT_PS (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMADD_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMADD_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FNMADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32EXTSCATTER_PS (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32EXTSCATTER_PS (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_MIN_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_MIN_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLLI_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SLLI_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI32LO_PD (v2), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI32LO_PD (f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULLO_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULLO_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMSUB_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMSUB_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32LOEXTGATHER_PD (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32LOEXTGATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPD_SI512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPD_SI512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRLV_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRLV_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETEXP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETEXP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPORD_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPORD_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32EXTSCATTER_EPI32 (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32EXTSCATTER_EPI32 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETMANT_ROUND_PS (a, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_GETMANT_ROUND_PS (f(a), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOAD_EPI64 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOAD_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FNMADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ALIGNR_EPI32 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_ALIGNR_EPI32 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_MUL_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_MUL_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPSLO_PD (src, k, v2), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPSLO_PD (f(src), f(k), f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMSUB_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMSUB_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_MAX_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_MAX_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPUNORD_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPUNORD_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_ROUND_PD_MASK (k1, a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_ROUND_PD_MASK (f(k1), f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNLT_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNLT_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_MIN_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_MIN_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ANDNOT_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ANDNOT_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32LOEXTSCATTER_PD (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32LOEXTSCATTER_PD (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNLT_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNLT_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMSUB_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMSUB_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ABS_PD (src, k, v2), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ABS_PD (f(src), f(k), f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_ROUND_PD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_ROUND_PD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPUNORD_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPUNORD_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_XOR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_XOR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUB_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUB_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_MUL_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_MUL_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORE_EPI32 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORE_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUB_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUB_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETEXP_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_GETEXP_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_MIN_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_MIN_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGE_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGE_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUB_ROUND_PD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUB_ROUND_PD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32EXTGATHER_PS (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32EXTGATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOAD_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOAD_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I32SCATTER_PS (mv, k, index, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I32SCATTER_PS (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_MAX_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_MAX_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32LOEXTSCATTER_EPI64 (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32LOEXTSCATTER_EPI64 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_MAX_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_MAX_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADD_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADD_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_AND_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_AND_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32LOEXTGATHER_EPI64 (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32LOEXTGATHER_EPI64 (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNLT_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNLT_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUB_ROUND_PD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SUB_ROUND_PD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRLI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRLI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRAV_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRAV_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPSLO_PD (v2), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPSLO_PD (f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOAD_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOAD_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MUL_ROUND_PD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MUL_ROUND_PD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNLT_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNLT_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STORE_EPI32 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STORE_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ALIGNR_EPI32 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ALIGNR_EPI32 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU32LO_PD (v2), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU32LO_PD (f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNLE_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNLE_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32LOSCATTER_PD (mv, k, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32LOSCATTER_PD (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPUNORD_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPUNORD_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADD_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADD_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNLE_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNLE_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I32GATHER_PS (vindex, mask, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I32GATHER_PS (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I32EXTGATHER_PS (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I32EXTGATHER_PS (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETEXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_GETEXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32GATHER_PS (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32GATHER_PS (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I32EXTSCATTER_PS (mv, k, index, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I32EXTSCATTER_PS (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETEXP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_GETEXP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMADD_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FNMADD_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOAD_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_OR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_OR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI32LO_PD (src, k, v2), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32LO_PD (f(src), f(k), f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMSUB_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMSUB_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MUL_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MUL_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETEXP_ROUND_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETEXP_ROUND_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUB_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUB_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUB_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUB_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32LOSCATTER_PD (mv, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32LOSCATTER_PD (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUB_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUB_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_PD_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_PD_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_ADD_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_ADD_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_MIN_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_MIN_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_MIN_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_MIN_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTSI512_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTSI512_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPORD_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPORD_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_ROUND_PD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_ROUND_PD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUB_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUB_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORE_EPI64 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORE_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_MAX_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_MAX_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORE_SI512 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORE_SI512 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ABS_PS (v2), u, es) =>
      reflectMirrored(Reflect(MM512_ABS_PS (f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRLV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRLV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AND_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AND_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32EXTGATHER_EPI32 (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32EXTGATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_ROUND_PD_MASK (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_ROUND_PD_MASK (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPU32_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPU32_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLLI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLLI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOAD_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOAD_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_ROUND_PD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_ROUND_PD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_ADD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_ADD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETEXP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETEXP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_EPU32_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_EPU32_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOAD_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOAD_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_PS_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_PS_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_ADD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_ADD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUB_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUB_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMSUB_ROUND_PD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FNMSUB_ROUND_PD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPS_SI512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS_SI512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512_KNC00 extends CGenIntrinsics {

  val IR: AVX512_KNC
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_MASK_CMP_ROUND_PS_MASK(k1, a, b, imm8, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_round_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case iDef@MM512_SHUFFLE_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shuffle_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_FMSUB_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MUL_ROUND_PS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mul_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_GETMANT_PS(src, k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_getmant_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM512_MASK_FNMADD_ROUND_PS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fnmadd_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_FNMADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_I32EXTSCATTER_PS(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i32extscatter_ps((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_REDUCE_MIN_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_min_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_SLLI_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_slli_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_CVTEPI32LO_PD(v2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi32lo_pd(${quote(v2)})")
    case iDef@MM512_MASK_BLEND_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_blend_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPLE_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmple_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MULLO_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mullo_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_FNMSUB_ROUND_PS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fnmsub_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_I32LOEXTGATHER_PD(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i32loextgather_pd(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_MULLO_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mullo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CASTPD_SI512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castpd_si512(${quote(a)})")
    case iDef@MM512_SRLV_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srlv_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_GETEXP_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_getexp_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPORD_PS_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpord_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_I32EXTSCATTER_EPI32(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i32extscatter_epi32((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_store_ps((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_GETMANT_ROUND_PS(a, interv, sc, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_getmant_round_ps(${quote(a)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case iDef@MM512_LOAD_EPI64(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_load_epi64((void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_CMPGE_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpge_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_FNMADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_MOV_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mov_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ALIGNR_EPI32(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_alignr_epi32(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM512_REDUCE_MUL_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_mul_epi32(${quote(a)})")
    case iDef@MM512_MASK_CVTPSLO_PD(src, k, v2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtpslo_pd(${quote(src)}, ${quote(k)}, ${quote(v2)})")
    case iDef@MM512_MASK3_FNMSUB_ROUND_PS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fnmsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_REDUCE_MAX_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_max_epi64(${quote(a)})")
    case iDef@MM512_MASK_CMPLE_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPUNORD_PS_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpunord_ps_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMP_ROUND_PD_MASK(k1, a, b, imm8, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_round_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case iDef@MM512_FMADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_CMPEQ_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpeq_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPNLT_PD_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpnlt_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_REDUCE_MIN_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_min_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_ANDNOT_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_andnot_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_I32LOEXTSCATTER_PD(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i32loextscatter_pd((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK3_FNMSUB_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fnmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_CMPNLT_PS_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpnlt_ps_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK3_FNMSUB_ROUND_PD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fnmsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_MASK_ABS_PD(src, k, v2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_abs_pd(${quote(src)}, ${quote(k)}, ${quote(v2)})")
    case iDef@MM512_MASK_CMPNEQ_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpneq_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_FMADD_ROUND_PD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmadd_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_CMPUNORD_PD_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpunord_pd_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_XOR_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_xor_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SUB_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sub_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK3_FNMADD_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK_REDUCE_MUL_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_mul_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_STORE_EPI32(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_store_epi32((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM512_MASK_SUB_ROUND_PS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sub_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_GETEXP_ROUND_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_getexp_round_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_REDUCE_MIN_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_min_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CMPGE_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpge_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SUB_ROUND_PD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sub_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_I32EXTGATHER_PS(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i32extgather_ps(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_BLEND_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_blend_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_LOAD_EPI64(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_load_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_PREFETCH_I32SCATTER_PS(mv, k, index, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_prefetch_i32scatter_ps((void*) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_REDUCE_MAX_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_max_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_FMADD_ROUND_PS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_I32LOEXTSCATTER_EPI64(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i32loextscatter_epi64((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_REDUCE_MAX_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_max_epu32(${quote(a)})")
    case iDef@MM512_MASK3_FMADD_ROUND_PD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmadd_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_REDUCE_AND_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_and_epi64(${quote(a)})")
    case iDef@MM512_CMPLT_PS_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmplt_ps_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_I32LOEXTGATHER_EPI64(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i32loextgather_epi64(${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_SHUFFLE_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shuffle_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CMPNLT_PS_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpnlt_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPEQ_PD_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpeq_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPLE_PD_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_FMSUB_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_SUB_ROUND_PD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sub_round_pd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FMADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_SRLI_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srli_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_CASTPS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castps_pd(${quote(a)})")
    case iDef@MM512_MASK_CMPNEQ_PS_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpneq_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPGE_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpge_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SRAV_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srav_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i32gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM512_CMPNEQ_PS_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpneq_ps_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTPSLO_PD(v2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtpslo_pd(${quote(v2)})")
    case iDef@MM512_LOAD_PD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_load_pd((void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_MAX_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MUL_ROUND_PD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mul_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK3_FNMADD_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_CMPLE_PS_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmple_ps_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPNLT_PD_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpnlt_pd_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_STORE_EPI32(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_store_epi32((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_CMPLE_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ALIGNR_EPI32(src, k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_alignr_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM512_CVTEPU32LO_PD(v2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu32lo_pd(${quote(v2)})")
    case iDef@MM512_CMPNLE_PD_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpnle_pd_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MAX_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_I32LOSCATTER_PD(mv, k, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i32loscatter_pd((void*) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_MASK_FMSUB_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_CMPUNORD_PD_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpunord_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK3_FMADD_ROUND_PS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CMPNLE_PD_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpnle_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MOV_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mov_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_FMADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i32scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASK_PREFETCH_I32GATHER_PS(vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_prefetch_i32gather_ps(${quote(vindex)}, ${quote(mask)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_ADD_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_add_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPLE_PD_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmple_pd_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPGT_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpgt_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_PREFETCH_I32EXTGATHER_PS(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_prefetch_i32extgather_ps(${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_GETEXP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_getexp_ps(${quote(a)})")
    case iDef@MM512_I32GATHER_PS(vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i32gather_ps(${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM512_MASK_PREFETCH_I32EXTSCATTER_PS(mv, k, index, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_prefetch_i32extscatter_ps((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_GETEXP_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_getexp_pd(${quote(a)})")
    case iDef@MM512_FNMADD_ROUND_PS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fnmadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_load_ps(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_FMADD_ROUND_PS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmadd_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_OR_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_or_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_ADD_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_add_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTEPI32LO_PD(src, k, v2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi32lo_pd(${quote(src)}, ${quote(k)}, ${quote(v2)})")
    case iDef@MM512_MASK_FNMSUB_ROUND_PD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fnmsub_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_MUL_ROUND_PS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mul_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_GETEXP_ROUND_PD(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_getexp_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_MIN_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK3_FMSUB_ROUND_PD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_MASK3_FMSUB_ROUND_PS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_I32LOSCATTER_PD(mv, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i32loscatter_pd((void*) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_MASK_CMPLE_PS_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_FMADD_ROUND_PD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmadd_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_FMSUB_ROUND_PS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_CMPNEQ_PD_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpneq_pd_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMP_PD_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_REDUCE_ADD_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_add_pd(${quote(a)})")
    case iDef@MM512_I32SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i32scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_REDUCE_MIN_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_min_epu32(${quote(a)})")
    case iDef@MM512_REDUCE_MIN_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_min_epi64(${quote(a)})")
    case iDef@MM512_MASK_CMPLT_PD_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmplt_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CASTSI512_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castsi512_pd(${quote(a)})")
    case iDef@MM512_CMPORD_PS_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpord_ps_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ADD_ROUND_PD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_add_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_SUB_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sub_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_STORE_EPI64(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_store_epi64((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM512_REDUCE_MAX_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_max_epu64(${quote(a)})")
    case iDef@MM512_STORE_SI512(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_store_si512((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM512_ABS_PS(v2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_abs_ps(${quote(v2)})")
    case iDef@MM512_MASK_SRLV_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srlv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_AND_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_and_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPEQ_PD_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpeq_pd_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPLT_PD_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmplt_pd_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_I32EXTGATHER_EPI32(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i32extgather_epi32(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_CMP_ROUND_PD_MASK(a, b, imm8, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmp_round_pd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case iDef@MM512_CMP_EPU32_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmp_epu32_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_SLLI_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_slli_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_MOV_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mov_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_ADD_ROUND_PS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_add_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_ADD_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_add_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_LOAD_EPI32(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_load_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_ADD_ROUND_PD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_add_round_pd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_REDUCE_ADD_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_add_epi64(${quote(a)})")
    case iDef@MM512_MASK_GETEXP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_getexp_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ADD_ROUND_PS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_add_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CMP_EPU32_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_FNMADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fnmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_MOV_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mov_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOAD_PS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_load_ps((void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_CMP_PS_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_CMPGT_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpgt_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_REDUCE_ADD_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_add_ps(${quote(a)})")
    case iDef@MM512_MASK_MIN_EPU32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SUB_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sub_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_FNMSUB_ROUND_PD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fnmsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK3_FMADD_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MIN_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_min_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CASTPS_SI512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castps_si512(${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
