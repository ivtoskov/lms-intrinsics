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

    
trait AVX201 extends IntrinsicsBase {
  /**
   * Negate packed 32-bit integers in "a" when the corresponding signed 32-bit
   * integer in "b" is negative, and store the results in "dst". Element in "dst"
   * are zeroed out when the corresponding element in "b" is zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_SIGN_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UNPACKLO_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_SRLI_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 32-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * base_addr: int const*, vindex: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I32GATHER_EPI32[A[_], U:Integral](base_addr: Exp[A[Int]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using "mask" (elements are copied from "src" when the highest bit is not set
   * in the corresponding element). "scale" should be 1, 2, 4 or 8.
   * src: __m128d, base_addr: double const*, vindex: __m128i, mask: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64GATHER_PD[A[_], U:Integral](src: Exp[__m128d], base_addr: Exp[A[Double]], vindex: Exp[__m128i], mask: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * base_addr: __int64 const*, vindex: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I64GATHER_EPI64[A[_], U:Integral](base_addr: Exp[A[Long]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM256_BROADCASTD_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using "mask" (elements are copied from "src" when the highest bit is not set
   * in the corresponding element). "scale" should be 1, 2, 4 or 8.
   * src: __m256d, base_addr: double const*, vindex: __m256i, mask: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64GATHER_PD[A[_], U:Integral](src: Exp[__m256d], base_addr: Exp[A[Double]], vindex: Exp[__m256i], mask: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 32-bit integers from "a" and "b" using control mask "imm8", and
   * store the results in "dst".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_BLEND_EPI32(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift 128-bit lanes in "a" right by "imm8" bytes while shifting in zeros, and
   * store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_BSRLI_EPI128(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM256_BROADCASTB_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_SUBS_EPU8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_SLLI_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift 128-bit lanes in "a" left by "imm8" bytes while shifting in zeros, and
   * store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_BSLLI_EPI128(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 64-bit integers from "a" into memory using "mask" (elements are
   * not stored when the highest bit is not set in the corresponding element).
   * mem_addr: __int64*, mask: __m256i, a: __m256i, mem_addrOffset: int
   */
  case class MM256_MASKSTORE_EPI64[A[_], U:Integral](mem_addr: Exp[A[Long]], mask: Exp[__m256i], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_sign_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SIGN_EPI32(a, b)
  }
            
  def _mm256_unpacklo_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UNPACKLO_EPI16(a, b)
  }
            
  def _mm256_srli_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SRLI_EPI32(a, imm8)
  }
            
  def _mm256_i32gather_epi32[A[_], U:Integral](base_addr: Exp[A[Int]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_I32GATHER_EPI32(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i64gather_pd[A[_], U:Integral](src: Exp[__m128d], base_addr: Exp[A[Double]], vindex: Exp[__m128i], mask: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(base_addr)(MM_MASK_I64GATHER_PD(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_i64gather_epi64[A[_], U:Integral](base_addr: Exp[A[Long]], vindex: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_I64GATHER_EPI64(base_addr, vindex, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_broadcastd_epi32(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_BROADCASTD_EPI32(a)
  }
            
  def _mm256_mask_i64gather_pd[A[_], U:Integral](src: Exp[__m256d], base_addr: Exp[A[Double]], vindex: Exp[__m256i], mask: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(base_addr)(MM256_MASK_I64GATHER_PD(src, base_addr, vindex, mask, scale, base_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_blend_epi32(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_BLEND_EPI32(a, b, imm8)
  }
            
  def _mm256_cmpeq_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_CMPEQ_EPI64(a, b)
  }
            
  def _mm256_bsrli_epi128(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_BSRLI_EPI128(a, imm8)
  }
            
  def _mm256_broadcastb_epi8(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_BROADCASTB_EPI8(a)
  }
            
  def _mm256_subs_epu8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_SUBS_EPU8(a, b)
  }
            
  def _mm256_slli_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SLLI_EPI32(a, imm8)
  }
            
  def _mm256_bslli_epi128(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_BSLLI_EPI128(a, imm8)
  }
            
  def _mm256_maskstore_epi64[A[_], U:Integral](mem_addr: Exp[A[Long]], mask: Exp[__m256i], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASKSTORE_EPI64(mem_addr, mask, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_SIGN_EPI32 (a, b) =>
      _mm256_sign_epi32(f(a), f(b))
    case MM256_UNPACKLO_EPI16 (a, b) =>
      _mm256_unpacklo_epi16(f(a), f(b))
    case MM256_SRLI_EPI32 (a, imm8) =>
      _mm256_srli_epi32(f(a), f(imm8))
    case iDef@MM256_I32GATHER_EPI32 (base_addr, vindex, scale, base_addrOffset) =>
      _mm256_i32gather_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I64GATHER_PD (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm_mask_i64gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_I64GATHER_EPI64 (base_addr, vindex, scale, base_addrOffset) =>
      _mm256_i64gather_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_BROADCASTD_EPI32 (a) =>
      _mm256_broadcastd_epi32(f(a))
    case iDef@MM256_MASK_I64GATHER_PD (src, base_addr, vindex, mask, scale, base_addrOffset) =>
      _mm256_mask_i64gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_BLEND_EPI32 (a, b, imm8) =>
      _mm256_blend_epi32(f(a), f(b), f(imm8))
    case MM256_CMPEQ_EPI64 (a, b) =>
      _mm256_cmpeq_epi64(f(a), f(b))
    case MM256_BSRLI_EPI128 (a, imm8) =>
      _mm256_bsrli_epi128(f(a), f(imm8))
    case MM256_BROADCASTB_EPI8 (a) =>
      _mm256_broadcastb_epi8(f(a))
    case MM256_SUBS_EPU8 (a, b) =>
      _mm256_subs_epu8(f(a), f(b))
    case MM256_SLLI_EPI32 (a, imm8) =>
      _mm256_slli_epi32(f(a), f(imm8))
    case MM256_BSLLI_EPI128 (a, imm8) =>
      _mm256_bslli_epi128(f(a), f(imm8))
    case iDef@MM256_MASKSTORE_EPI64 (mem_addr, mask, a, mem_addrOffset) =>
      _mm256_maskstore_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)

    case Reflect(MM256_SIGN_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SIGN_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNPACKLO_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UNPACKLO_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRLI_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SRLI_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32GATHER_EPI32 (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32GATHER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64GATHER_PD (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64GATHER_EPI64 (base_addr, vindex, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64GATHER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64GATHER_PD (src, base_addr, vindex, mask, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BLEND_EPI32 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_BLEND_EPI32 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BSRLI_EPI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_BSRLI_EPI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTB_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTB_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SUBS_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SUBS_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLLI_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SLLI_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BSLLI_EPI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_BSLLI_EPI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKSTORE_EPI64 (mem_addr, mask, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKSTORE_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX201 extends CGenIntrinsics {

  val IR: AVX2
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_SIGN_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sign_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_UNPACKLO_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_unpacklo_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SRLI_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srli_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_I32GATHER_EPI32(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_i32gather_epi32((int const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM_MASK_I64GATHER_PD(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_i64gather_pd(${quote(src)}, (double const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_I64GATHER_EPI64(base_addr, vindex, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_i64gather_epi64((__int64 const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)})")
    case iDef@MM256_BROADCASTD_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcastd_epi32(${quote(a)})")
    case iDef@MM256_MASK_I64GATHER_PD(src, base_addr, vindex, mask, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_i64gather_pd(${quote(src)}, (double const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(mask)}, ${quote(scale)})")
    case iDef@MM256_BLEND_EPI32(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_blend_epi32(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_CMPEQ_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BSRLI_EPI128(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_bsrli_epi128(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_BROADCASTB_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcastb_epi8(${quote(a)})")
    case iDef@MM256_SUBS_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_subs_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SLLI_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_slli_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_BSLLI_EPI128(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_bslli_epi128(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKSTORE_EPI64(mem_addr, mask, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_maskstore_epi64((__int64*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(mask)}, ${quote(a)});")
    case _ => super.emitNode(sym, rhs)
  }
}
