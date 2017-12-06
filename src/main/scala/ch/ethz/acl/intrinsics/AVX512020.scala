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

    
trait AVX512020 extends IntrinsicsBase {
  /**
   * Shuffle 8-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "a" when the corresponding mask bit is not set).
   * a: __m128i, idx: __m128i, k: __mmask16, b: __m128i
   */
  case class MM_MASK2_PERMUTEX2VAR_EPI8(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM256_CVTTPS_EPU64(a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 32-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m256i
   */
  case class MM512_MASK_CVTEPI32_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 2 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI8_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits of integer data from memory into "dst" using a non-temporal
   * memory hint. 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_STREAM_LOAD_SI512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_ROR_EPI64(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_UNPACKLO_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 64-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ANDNOT_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTSEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_CVTTPS_EPU32(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FMADD_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGE_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULHI_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". The maximum relative error for this approximation is less
   * than 2^-28. [round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_RSQRT28_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FNMADD_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTSEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_mask2_permutex2var_epi8(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b)
  }
            
  def _mm256_cvttps_epu64(a: Exp[__m128]): Exp[__m256i] = {
    MM256_CVTTPS_EPU64(a)
  }
            
  def _mm512_mask_cvtepi32_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_CVTEPI32_EPI64(src, k, a)
  }
            
  def _mm_mask_cvtepi8_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI8_EPI64(src, k, a)
  }
            
  def _mm512_stream_load_si512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_STREAM_LOAD_SI512(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cvtsepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_ror_epi64(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_ROR_EPI64(a, imm8)
  }
            
  def _mm512_unpacklo_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_UNPACKLO_PD(a, b)
  }
            
  def _mm256_maskz_andnot_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ANDNOT_EPI64(k, a, b)
  }
            
  def _mm512_mask_cvtsepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvttps_epu32(k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPS_EPU32(k, a)
  }
            
  def _mm512_maskz_fmadd_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FMADD_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm512_cmpge_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGE_EPI16_MASK(a, b)
  }
            
  def _mm256_mask_mulhi_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULHI_EPU16(src, k, a, b)
  }
            
  def _mm512_mask_min_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPU64(src, k, a, b)
  }
            
  def _mm_mask_rsqrt28_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_RSQRT28_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_maskz_fnmadd_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FNMADD_PS(k, a, b, c)
  }
            
  def _mm_mask_cvtsepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI64_EPI8(src, k, a)
  }
            
  def _mm_mask_cmplt_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPI16_MASK(k1, a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b) =>
      _mm_mask2_permutex2var_epi8(f(a), f(idx), f(k), f(b))
    case MM256_CVTTPS_EPU64 (a) =>
      _mm256_cvttps_epu64(f(a))
    case MM512_MASK_CVTEPI32_EPI64 (src, k, a) =>
      _mm512_mask_cvtepi32_epi64(f(src), f(k), f(a))
    case MM_MASK_CVTEPI8_EPI64 (src, k, a) =>
      _mm_mask_cvtepi8_epi64(f(src), f(k), f(a))
    case iDef@MM512_STREAM_LOAD_SI512 (mem_addr, mem_addrOffset) =>
      _mm512_stream_load_si512(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_ROR_EPI64 (a, imm8) =>
      _mm512_ror_epi64(f(a), f(imm8))
    case MM512_UNPACKLO_PD (a, b) =>
      _mm512_unpacklo_pd(f(a), f(b))
    case MM256_MASKZ_ANDNOT_EPI64 (k, a, b) =>
      _mm256_maskz_andnot_epi64(f(k), f(a), f(b))
    case iDef@MM512_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtsepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTTPS_EPU32 (k, a) =>
      _mm256_maskz_cvttps_epu32(f(k), f(a))
    case MM512_MASKZ_FMADD_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fmadd_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_CMPGE_EPI16_MASK (a, b) =>
      _mm512_cmpge_epi16_mask(f(a), f(b))
    case MM256_MASK_MULHI_EPU16 (src, k, a, b) =>
      _mm256_mask_mulhi_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASK_MIN_EPU64 (src, k, a, b) =>
      _mm512_mask_min_epu64(f(src), f(k), f(a), f(b))
    case MM_MASK_RSQRT28_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_rsqrt28_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_FNMADD_PS (k, a, b, c) =>
      _mm_maskz_fnmadd_ps(f(k), f(a), f(b), f(c))
    case MM_MASK_CVTSEPI64_EPI8 (src, k, a) =>
      _mm_mask_cvtsepi64_epi8(f(src), f(k), f(a))
    case MM_MASK_CMPLT_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmplt_epi16_mask(f(k1), f(a), f(b))

    case Reflect(MM_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI8_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI8_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STREAM_LOAD_SI512 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STREAM_LOAD_SI512 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROR_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_ROR_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ANDNOT_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ANDNOT_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADD_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADD_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULHI_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULHI_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT28_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT28_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512020 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask2_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM256_CVTTPS_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvttps_epu64(${quote(a)})")
    case iDef@MM512_MASK_CVTEPI32_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CVTEPI8_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi8_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_STREAM_LOAD_SI512(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_stream_load_si512((void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtsepi32_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_ROR_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_ror_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_UNPACKLO_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpacklo_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_ANDNOT_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_andnot_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtsepi32_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_CVTTPS_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvttps_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_FMADD_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmadd_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_CMPGE_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpge_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MULHI_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mulhi_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MIN_EPU64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_RSQRT28_ROUND_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rsqrt28_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FNMADD_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_CVTSEPI64_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtsepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CMPLT_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmplt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
