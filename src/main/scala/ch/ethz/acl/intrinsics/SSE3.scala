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

    
trait SSE3 extends IntrinsicsBase {
  /**
   * Alternatively add and subtract packed double-precision (64-bit) floating-point
   * elements in "a" to/from packed elements in "b", and store the results in
   * "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_ADDSUB_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of double-precision (64-bit)
   * floating-point elements in "a" and "b", and pack the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_HSUB_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of double-precision (64-bit) floating-point
   * elements in "a" and "b", and pack the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_HADD_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into both
   * elements of "dst".
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOADDUP_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Alternatively add and subtract packed single-precision (32-bit) floating-point
   * elements in "a" to/from packed elements in "b", and store the results in
   * "dst".
   * a: __m128, b: __m128
   */
  case class MM_ADDSUB_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_MOVELDUP_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of single-precision (32-bit) floating-point
   * elements in "a" and "b", and pack the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_HADD_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Duplicate the low double-precision (64-bit) floating-point element from "a",
   * and store the results in "dst".
   * a: __m128d
   */
  case class MM_MOVEDUP_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of single-precision (32-bit) floating-point
   * elements in "a" and "b", and pack the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_HSUB_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_MOVEHDUP_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Load 128-bits of integer data from unaligned memory into "dst". This intrinsic
   * may perform better than "_mm_loadu_si128" when the data crosses a cache line
   * boundary.
   * mem_addr: __m128i const*, mem_addrOffset: int
   */
  case class MM_LDDQU_SI128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  def _mm_addsub_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_ADDSUB_PD(a, b)
  }
            
  def _mm_hsub_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_HSUB_PD(a, b)
  }
            
  def _mm_hadd_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_HADD_PD(a, b)
  }
            
  def _mm_loaddup_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOADDUP_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_addsub_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_ADDSUB_PS(a, b)
  }
            
  def _mm_moveldup_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_MOVELDUP_PS(a)
  }
            
  def _mm_hadd_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_HADD_PS(a, b)
  }
            
  def _mm_movedup_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_MOVEDUP_PD(a)
  }
            
  def _mm_hsub_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_HSUB_PS(a, b)
  }
            
  def _mm_movehdup_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_MOVEHDUP_PS(a)
  }
            
  def _mm_lddqu_si128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_LDDQU_SI128(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_ADDSUB_PD (a, b) =>
      _mm_addsub_pd(f(a), f(b))
    case MM_HSUB_PD (a, b) =>
      _mm_hsub_pd(f(a), f(b))
    case MM_HADD_PD (a, b) =>
      _mm_hadd_pd(f(a), f(b))
    case iDef@MM_LOADDUP_PD (mem_addr, mem_addrOffset) =>
      _mm_loaddup_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_ADDSUB_PS (a, b) =>
      _mm_addsub_ps(f(a), f(b))
    case MM_MOVELDUP_PS (a) =>
      _mm_moveldup_ps(f(a))
    case MM_HADD_PS (a, b) =>
      _mm_hadd_ps(f(a), f(b))
    case MM_MOVEDUP_PD (a) =>
      _mm_movedup_pd(f(a))
    case MM_HSUB_PS (a, b) =>
      _mm_hsub_ps(f(a), f(b))
    case MM_MOVEHDUP_PS (a) =>
      _mm_movehdup_ps(f(a))
    case iDef@MM_LDDQU_SI128 (mem_addr, mem_addrOffset) =>
      _mm_lddqu_si128(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)

    case Reflect(MM_ADDSUB_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDSUB_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HSUB_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HSUB_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HADD_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HADD_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADDUP_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADDUP_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADDSUB_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ADDSUB_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVELDUP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVELDUP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HADD_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HADD_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEDUP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEDUP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HSUB_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HSUB_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEHDUP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEHDUP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LDDQU_SI128 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LDDQU_SI128 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSSE3 extends CGenIntrinsics {

  val IR: SSE3
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_ADDSUB_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_addsub_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_HSUB_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hsub_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_HADD_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hadd_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOADDUP_PD(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loaddup_pd((double const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_ADDSUB_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_addsub_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVELDUP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_moveldup_ps(${quote(a)})")
    case iDef@MM_HADD_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hadd_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVEDUP_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movedup_pd(${quote(a)})")
    case iDef@MM_HSUB_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hsub_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVEHDUP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movehdup_ps(${quote(a)})")
    case iDef@MM_LDDQU_SI128(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_lddqu_si128((__m128i const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case _ => super.emitNode(sym, rhs)
  }
}
