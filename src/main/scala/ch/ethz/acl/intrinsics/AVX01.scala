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
   * Return vector of type __m256i with undefined elements.

   */
  case class MM256_UNDEFINED_SI256() extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
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
      

  def _mm256_undefined_si256(): Exp[__m256i] = {
    MM256_UNDEFINED_SI256()
  }
            
  def _mm256_set_m128(hi: Exp[__m128], lo: Exp[__m128]): Exp[__m256] = {
    MM256_SET_M128(hi, lo)
  }
            
  def _mm256_set_m128d(hi: Exp[__m128d], lo: Exp[__m128d]): Exp[__m256d] = {
    MM256_SET_M128D(hi, lo)
  }
            
  def _mm256_set_m128i(hi: Exp[__m128i], lo: Exp[__m128i]): Exp[__m256i] = {
    MM256_SET_M128I(hi, lo)
  }
            
  def _mm256_setr_m128(lo: Exp[__m128], hi: Exp[__m128]): Exp[__m256] = {
    MM256_SETR_M128(lo, hi)
  }
            
  def _mm256_setr_m128d(lo: Exp[__m128d], hi: Exp[__m128d]): Exp[__m256d] = {
    MM256_SETR_M128D(lo, hi)
  }
            
  def _mm256_setr_m128i(lo: Exp[__m128i], hi: Exp[__m128i]): Exp[__m256i] = {
    MM256_SETR_M128I(lo, hi)
  }
            
  def _mm256_loadu2_m128[A[_], U:Integral](hiaddr: Exp[A[Float]], loaddr: Exp[A[Float]], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(hiaddr, loaddr)(MM256_LOADU2_M128(hiaddr, loaddr, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_loadu2_m128d[A[_], U:Integral](hiaddr: Exp[A[Double]], loaddr: Exp[A[Double]], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(hiaddr, loaddr)(MM256_LOADU2_M128D(hiaddr, loaddr, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_loadu2_m128i[A[_], U:Integral](hiaddr: Exp[A[__m128i]], loaddr: Exp[A[__m128i]], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(hiaddr, loaddr)(MM256_LOADU2_M128I(hiaddr, loaddr, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_storeu2_m128[A[_], U:Integral](hiaddr: Exp[A[Float]], loaddr: Exp[A[Float]], a: Exp[__m256], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(hiaddr, loaddr)(MM256_STOREU2_M128(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_storeu2_m128d[A[_], U:Integral](hiaddr: Exp[A[Double]], loaddr: Exp[A[Double]], a: Exp[__m256d], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(hiaddr, loaddr)(MM256_STOREU2_M128D(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_storeu2_m128i[A[_], U:Integral](hiaddr: Exp[A[__m128i]], loaddr: Exp[A[__m128i]], a: Exp[__m256i], hiaddrOffset: Exp[U], loaddrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(hiaddr, loaddr)(MM256_STOREU2_M128I(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset)(implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_UNDEFINED_SI256 () =>
      _mm256_undefined_si256()
    case MM256_SET_M128 (hi, lo) =>
      _mm256_set_m128(f(hi), f(lo))
    case MM256_SET_M128D (hi, lo) =>
      _mm256_set_m128d(f(hi), f(lo))
    case MM256_SET_M128I (hi, lo) =>
      _mm256_set_m128i(f(hi), f(lo))
    case MM256_SETR_M128 (lo, hi) =>
      _mm256_setr_m128(f(lo), f(hi))
    case MM256_SETR_M128D (lo, hi) =>
      _mm256_setr_m128d(f(lo), f(hi))
    case MM256_SETR_M128I (lo, hi) =>
      _mm256_setr_m128i(f(lo), f(hi))
    case iDef@MM256_LOADU2_M128 (hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      _mm256_loadu2_m128(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_LOADU2_M128D (hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      _mm256_loadu2_m128d(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_LOADU2_M128I (hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      _mm256_loadu2_m128i(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_STOREU2_M128 (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      _mm256_storeu2_m128(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_STOREU2_M128D (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      _mm256_storeu2_m128d(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_STOREU2_M128I (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      _mm256_storeu2_m128i(iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont)

    case Reflect(MM256_UNDEFINED_SI256 (), u, es) =>
      reflectMirrored(Reflect(MM256_UNDEFINED_SI256 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_M128 (hi, lo), u, es) =>
      reflectMirrored(Reflect(MM256_SET_M128 (f(hi), f(lo)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_M128D (hi, lo), u, es) =>
      reflectMirrored(Reflect(MM256_SET_M128D (f(hi), f(lo)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SET_M128I (hi, lo), u, es) =>
      reflectMirrored(Reflect(MM256_SET_M128I (f(hi), f(lo)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_M128 (lo, hi), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_M128 (f(lo), f(hi)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_M128D (lo, hi), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_M128D (f(lo), f(hi)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SETR_M128I (lo, hi), u, es) =>
      reflectMirrored(Reflect(MM256_SETR_M128I (f(lo), f(hi)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOADU2_M128 (hiaddr, loaddr, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOADU2_M128 (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOADU2_M128D (hiaddr, loaddr, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOADU2_M128D (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_LOADU2_M128I (hiaddr, loaddr, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_LOADU2_M128I (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STOREU2_M128 (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STOREU2_M128 (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STOREU2_M128D (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STOREU2_M128D (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_STOREU2_M128I (hiaddr, loaddr, a, hiaddrOffset, loaddrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_STOREU2_M128I (iDef.cont.applyTransformer(hiaddr, f), iDef.cont.applyTransformer(loaddr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(hiaddrOffset, f), iDef.cont.applyTransformer(loaddrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX01 extends CGenIntrinsics {

  val IR: AVX
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_UNDEFINED_SI256() =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_undefined_si256()")
    case iDef@MM256_SET_M128(hi, lo) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_m128(${quote(hi)}, ${quote(lo)})")
    case iDef@MM256_SET_M128D(hi, lo) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_m128d(${quote(hi)}, ${quote(lo)})")
    case iDef@MM256_SET_M128I(hi, lo) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_set_m128i(${quote(hi)}, ${quote(lo)})")
    case iDef@MM256_SETR_M128(lo, hi) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_m128(${quote(lo)}, ${quote(hi)})")
    case iDef@MM256_SETR_M128D(lo, hi) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_m128d(${quote(lo)}, ${quote(hi)})")
    case iDef@MM256_SETR_M128I(lo, hi) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_setr_m128i(${quote(lo)}, ${quote(hi)})")
    case iDef@MM256_LOADU2_M128(hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_loadu2_m128((float const*) ${quote(hiaddr) + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}, (float const*) ${quote(loaddr) + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))})")
    case iDef@MM256_LOADU2_M128D(hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_loadu2_m128d((double const*) ${quote(hiaddr) + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}, (double const*) ${quote(loaddr) + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))})")
    case iDef@MM256_LOADU2_M128I(hiaddr, loaddr, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_loadu2_m128i((__m128i const*) ${quote(hiaddr) + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}, (__m128i const*) ${quote(loaddr) + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))})")
    case iDef@MM256_STOREU2_M128(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_storeu2_m128((float*) ${quote(hiaddr) + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}, (float*) ${quote(loaddr) + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))}, ${quote(a)});")
    case iDef@MM256_STOREU2_M128D(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_storeu2_m128d((double*) ${quote(hiaddr) + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}, (double*) ${quote(loaddr) + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))}, ${quote(a)});")
    case iDef@MM256_STOREU2_M128I(hiaddr, loaddr, a, hiaddrOffset, loaddrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_storeu2_m128i((__m128i*) ${quote(hiaddr) + (if(hiaddrOffset == Const(0)) "" else " + " + quote(hiaddrOffset))}, (__m128i*) ${quote(loaddr) + (if(loaddrOffset == Const(0)) "" else " + " + quote(loaddrOffset))}, ${quote(a)});")
    case _ => super.emitNode(sym, rhs)
  }
}
