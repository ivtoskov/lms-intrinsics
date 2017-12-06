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

    
trait AVX01 extends IntrinsicsBase {
  /**
   * Store 256-bits of integer data from "a" into memory.
   * 	"mem_addr" does not need
   * to be aligned on any particular boundary.
   * mem_addr: __m256i *, a: __m256i, mem_addrOffset: int
   */
  case class MM256_STOREU_SI256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store the high and low 128-bit halves (each composed of 4 packed
   * single-precision (32-bit) floating-point elements) from "a" into memory two
   * different 128-bit locations.
   * 	"hiaddr" and "loaddr" do not need to be aligned
   * on any particular boundary.
   * hiaddr: float*, loaddr: float*, a: __m256, hiaddrOffset: int, loaddrOffset: int
   */
  case class MM256_STOREU2_M128[A[_], U:Integral](hiaddr: Exp[A[Float]], loaddr: Exp[A[Float]], a: Exp[__m256], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m256 to type __m256d.
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m256
   */
  case class MM256_CASTPS_PD(a: Exp[__m256]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", store the result in
   * the lower element of "dst", and copy the upper 3 packed elements from "a" to
   * the upper elements of "dst".
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_CMP_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m256i with undefined elements.

   */
  case class MM256_UNDEFINED_SI256() extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the supplied values in reverse order.
   * e3: __int64, e2: __int64, e1: __int64, e0: __int64
   */
  case class MM256_SETR_EPI64X(e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast single-precision (32-bit) floating-point value "a" to all elements
   * of "dst".
   * a: float
   */
  case class MM256_SET1_PS(a: Exp[Float]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_AND_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 16-bit integers in "dst" with the supplied values in reverse order.
   * e15: short, e14: short, e13: short, e12: short, e11: short, e10: short, e9: short, e8: short, e7: short, e6: short, e5: short, e4: short, e3: short, e2: short, e1: short, e0: short
   */
  case class MM256_SETR_EPI16(e15: Exp[Short], e14: Exp[Short], e13: Exp[Short], e12: Exp[Short], e11: Exp[Short], e10: Exp[Short], e9: Exp[Short], e8: Exp[Short], e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store the high and low 128-bit halves (each composed of integer data) from "a"
   * into memory two different 128-bit locations.
   * 	"hiaddr" and "loaddr" do not
   * need to be aligned on any particular boundary.
   * hiaddr: __m128i*, loaddr: __m128i*, a: __m256i, hiaddrOffset: int, loaddrOffset: int
   */
  case class MM256_STOREU2_M128I[A[_], U:Integral](hiaddr: Exp[A[__m128i]], loaddr: Exp[A[__m128i]], a: Exp[__m256i], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m256d
   */
  case class MM256_FLOOR_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 256-bits of integer data from unaligned memory into "dst". This intrinsic
   * may perform better than "_mm256_loadu_si256" when the data crosses a cache
   * line boundary.
   * mem_addr: __m256i const *, mem_addrOffset: int
   */
  case class MM256_LDDQU_SI256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst". This intrinsic may
   * generate the "vpbroadcastq".
   * a: long long
   */
  case class MM256_SET1_EPI64X(a: Exp[Long]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_storeu_si256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_STOREU_SI256(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_storeu2_m128[A[_], U:Integral](hiaddr: Exp[A[Float]], loaddr: Exp[A[Float]], a: Exp[__m256], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(hiaddr, loaddr)(MM256_STOREU2_M128(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_castps_pd(a: Exp[__m256]): Exp[__m256d] = {
    MM256_CASTPS_PD(a)
  }
            
  def _mm_cmp_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_CMP_SS(a, b, imm8)
  }
            
  def _mm256_undefined_si256(): Exp[__m256i] = {
    MM256_UNDEFINED_SI256()
  }
            
  def _mm256_setr_epi64x(e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]): Exp[__m256i] = {
    MM256_SETR_EPI64X(e3, e2, e1, e0)
  }
            
  def _mm256_set1_ps(a: Exp[Float]): Exp[__m256] = {
    MM256_SET1_PS(a)
  }
            
  def _mm256_and_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_AND_PD(a, b)
  }
            
  def _mm256_setr_epi16(e15: Exp[Short], e14: Exp[Short], e13: Exp[Short], e12: Exp[Short], e11: Exp[Short], e10: Exp[Short], e9: Exp[Short], e8: Exp[Short], e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]): Exp[__m256i] = {
    MM256_SETR_EPI16(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_storeu2_m128i[A[_], U:Integral](hiaddr: Exp[A[__m128i]], loaddr: Exp[A[__m128i]], a: Exp[__m256i], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(hiaddr, loaddr)(MM256_STOREU2_M128I(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_floor_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_FLOOR_PD(a)
  }
            
  def _mm256_lddqu_si256[A[_], U:Integral](mem_addr: Exp[A[__m256i]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_LDDQU_SI256(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_set1_epi64x(a: Exp[Long]): Exp[__m256i] = {
    MM256_SET1_EPI64X(a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case iDef@MM256_STOREU_SI256 (mem_addr, a, mem_addrOffset) =>
      _mm256_storeu_si256(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_STOREU2_M128 (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      _mm256_storeu2_m128(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_CASTPS_PD (a) =>
      _mm256_castps_pd(f(a))
    case MM_CMP_SS (a, b, imm8) =>
      _mm_cmp_ss(f(a), f(b), f(imm8))
    case MM256_UNDEFINED_SI256 () =>
      _mm256_undefined_si256()
    case MM256_SETR_EPI64X (e3, e2, e1, e0) =>
      _mm256_setr_epi64x(f(e3), f(e2), f(e1), f(e0))
    case MM256_SET1_PS (a) =>
      _mm256_set1_ps(f(a))
    case MM256_AND_PD (a, b) =>
      _mm256_and_pd(f(a), f(b))
    case MM256_SETR_EPI16 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm256_setr_epi16(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case iDef@MM256_STOREU2_M128I (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      _mm256_storeu2_m128i(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_FLOOR_PD (a) =>
      _mm256_floor_pd(f(a))
    case iDef@MM256_LDDQU_SI256 (mem_addr, mem_addrOffset) =>
      _mm256_lddqu_si256(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SET1_EPI64X (a) =>
      _mm256_set1_epi64x(f(a))

    case Reflect(iDef@MM256_STOREU_SI256 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STOREU_SI256 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STOREU2_M128 (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STOREU2_M128 (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CASTPS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CASTPS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_SS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_SS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UNDEFINED_SI256 (), u, es) =>
      reflectMirrored(Reflect(MM256_UNDEFINED_SI256 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_EPI64X (e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_EPI64X (f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET1_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_SET1_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_AND_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_AND_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_EPI16 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_EPI16 (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STOREU2_M128I (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STOREU2_M128I (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FLOOR_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_FLOOR_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LDDQU_SI256 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LDDQU_SI256 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET1_EPI64X (a), u, es) =>
      reflectMirrored(Reflect(MM256_SET1_EPI64X (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX01 extends CGenIntrinsics {

  val IR: AVX
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_STOREU_SI256(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_storeu_si256((__m256i *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM256_STOREU2_M128(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_storeu2_m128((float*) (${quote(hiaddr)  + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}), (float*) (${quote(loaddr)  + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))}), ${quote(a)});")
    case iDef@MM256_CASTPS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_castps_pd(${quote(a)})")
    case iDef@MM_CMP_SS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_UNDEFINED_SI256() =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_undefined_si256()")
    case iDef@MM256_SETR_EPI64X(e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_epi64x(${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_SET1_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set1_ps(${quote(a)})")
    case iDef@MM256_AND_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_and_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SETR_EPI16(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_epi16(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_STOREU2_M128I(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_storeu2_m128i((__m128i*) (${quote(hiaddr)  + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}), (__m128i*) (${quote(loaddr)  + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))}), ${quote(a)});")
    case iDef@MM256_FLOOR_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_floor_pd(${quote(a)})")
    case iDef@MM256_LDDQU_SI256(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_lddqu_si256((__m256i const *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_SET1_EPI64X(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set1_epi64x(${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
