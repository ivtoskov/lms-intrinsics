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

    
trait SSE42 extends IntrinsicsBase {
  /**
   * Compare packed strings in "a" and "b" with lengths "la" and "lb" using the
   * control in "imm8", and store the generated mask in "dst".
   * 	[strcmp_note]
   * a: __m128i, la: int, b: __m128i, lb: int, imm8: const int
   */
  case class MM_CMPESTRM(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings with implicit lengths in "a" and "b" using the control
   * in "imm8", and returns 1 if any character in "a" was null, and 0
   * otherwise.
   * 	[strcmp_note]
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMPISTRS(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings with implicit lengths in "a" and "b" using the control
   * in "imm8", and returns bit 0 of the resulting bit mask.
   * 	[strcmp_note]
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMPISTRO(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings with implicit lengths in "a" and "b" using the control
   * in "imm8", and store the generated index in "dst".
   * 	[strcmp_note]
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMPISTRI(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings in "a" and "b" with lengths "la" and "lb" using the
   * control in "imm8", and returns 1 if the resulting mask was non-zero, and 0
   * otherwise.
   * 	[strcmp_note]
   * a: __m128i, la: int, b: __m128i, lb: int, imm8: const int
   */
  case class MM_CMPESTRC(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings with implicit lengths in "a" and "b" using the control
   * in "imm8", and store the generated mask in "dst".
   * 	[strcmp_note]
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMPISTRM(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings in "a" and "b" with lengths "la" and "lb" using the
   * control in "imm8", and returns bit 0 of the resulting bit
   * mask.
   * 	[strcmp_note]
   * a: __m128i, la: int, b: __m128i, lb: int, imm8: const int
   */
  case class MM_CMPESTRO(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings with implicit lengths in "a" and "b" using the control
   * in "imm8", and returns 1 if "b" did not contain a null character and the
   * resulting mask was zero, and 0 otherwise.
   * 	[strcmp_note]
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMPISTRA(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Starting with the initial value in "crc", accumulates a CRC32 value for
   * unsigned 16-bit integer "v", and stores the result in "dst".
   * crc: unsigned int, v: unsigned short
   */
  case class MM_CRC32_U16(crc: Exp[UInt], v: Exp[UShort]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings in "a" and "b" with lengths "la" and "lb" using the
   * control in "imm8", and returns 1 if "b" did not contain a null character and
   * the resulting mask was zero, and 0 otherwise.
   * 	[strcmp_note]
   * a: __m128i, la: int, b: __m128i, lb: int, imm8: const int
   */
  case class MM_CMPESTRA(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings in "a" and "b" with lengths "la" and "lb" using the
   * control in "imm8", and store the generated index in "dst".
   * 	[strcmp_note]
   * a: __m128i, la: int, b: __m128i, lb: int, imm8: const int
   */
  case class MM_CMPESTRI(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Starting with the initial value in "crc", accumulates a CRC32 value for
   * unsigned 32-bit integer "v", and stores the result in "dst".
   * crc: unsigned int, v: unsigned int
   */
  case class MM_CRC32_U32(crc: Exp[UInt], v: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Starting with the initial value in "crc", accumulates a CRC32 value for
   * unsigned 8-bit integer "v", and stores the result in "dst".
   * crc: unsigned int, v: unsigned char
   */
  case class MM_CRC32_U8(crc: Exp[UInt], v: Exp[UByte]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings in "a" and "b" with lengths "la" and "lb" using the
   * control in "imm8", and returns 1 if any character in "a" was null, and 0
   * otherwise.
   * 	[strcmp_note]
   * a: __m128i, la: int, b: __m128i, lb: int, imm8: const int
   */
  case class MM_CMPESTRS(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings in "a" and "b" with lengths "la" and "lb" using the
   * control in "imm8", and returns 1 if any character in "b" was null, and 0
   * otherwise.
   * 	[strcmp_note]
   * a: __m128i, la: int, b: __m128i, lb: int, imm8: const int
   */
  case class MM_CMPESTRZ(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Starting with the initial value in "crc", accumulates a CRC32 value for
   * unsigned 64-bit integer "v", and stores the result in "dst".
   * crc: unsigned __int64, v: unsigned __int64
   */
  case class MM_CRC32_U64(crc: Exp[ULong], v: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings with implicit lengths in "a" and "b" using the control
   * in "imm8", and returns 1 if any character in "b" was null, and 0
   * otherwise.
   * 	[strcmp_note]
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMPISTRZ(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Compare packed strings with implicit lengths in "a" and "b" using the control
   * in "imm8", and returns 1 if the resulting mask was non-zero, and 0
   * otherwise.
   * 	[strcmp_note]
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMPISTRC(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.StringCompare)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  def _mm_cmpestrm(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]): Exp[__m128i] = {
    MM_CMPESTRM(a, la, b, lb, imm8)
  }
            
  def _mm_cmpistrs(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPISTRS(a, b, imm8)
  }
            
  def _mm_cmpistro(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPISTRO(a, b, imm8)
  }
            
  def _mm_cmpistri(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPISTRI(a, b, imm8)
  }
            
  def _mm_cmpestrc(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPESTRC(a, la, b, lb, imm8)
  }
            
  def _mm_cmpistrm(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_CMPISTRM(a, b, imm8)
  }
            
  def _mm_cmpestro(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPESTRO(a, la, b, lb, imm8)
  }
            
  def _mm_cmpistra(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPISTRA(a, b, imm8)
  }
            
  def _mm_crc32_u16(crc: Exp[UInt], v: Exp[UShort]): Exp[UInt] = {
    MM_CRC32_U16(crc, v)
  }
            
  def _mm_cmpestra(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPESTRA(a, la, b, lb, imm8)
  }
            
  def _mm_cmpgt_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPGT_EPI64(a, b)
  }
            
  def _mm_cmpestri(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPESTRI(a, la, b, lb, imm8)
  }
            
  def _mm_crc32_u32(crc: Exp[UInt], v: Exp[UInt]): Exp[UInt] = {
    MM_CRC32_U32(crc, v)
  }
            
  def _mm_crc32_u8(crc: Exp[UInt], v: Exp[UByte]): Exp[UInt] = {
    MM_CRC32_U8(crc, v)
  }
            
  def _mm_cmpestrs(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPESTRS(a, la, b, lb, imm8)
  }
            
  def _mm_cmpestrz(a: Exp[__m128i], la: Exp[Int], b: Exp[__m128i], lb: Exp[Int], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPESTRZ(a, la, b, lb, imm8)
  }
            
  def _mm_crc32_u64(crc: Exp[ULong], v: Exp[ULong]): Exp[ULong] = {
    MM_CRC32_U64(crc, v)
  }
            
  def _mm_cmpistrz(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPISTRZ(a, b, imm8)
  }
            
  def _mm_cmpistrc(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMPISTRC(a, b, imm8)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_CMPESTRM (a, la, b, lb, imm8) =>
      _mm_cmpestrm(f(a), f(la), f(b), f(lb), f(imm8))
    case MM_CMPISTRS (a, b, imm8) =>
      _mm_cmpistrs(f(a), f(b), f(imm8))
    case MM_CMPISTRO (a, b, imm8) =>
      _mm_cmpistro(f(a), f(b), f(imm8))
    case MM_CMPISTRI (a, b, imm8) =>
      _mm_cmpistri(f(a), f(b), f(imm8))
    case MM_CMPESTRC (a, la, b, lb, imm8) =>
      _mm_cmpestrc(f(a), f(la), f(b), f(lb), f(imm8))
    case MM_CMPISTRM (a, b, imm8) =>
      _mm_cmpistrm(f(a), f(b), f(imm8))
    case MM_CMPESTRO (a, la, b, lb, imm8) =>
      _mm_cmpestro(f(a), f(la), f(b), f(lb), f(imm8))
    case MM_CMPISTRA (a, b, imm8) =>
      _mm_cmpistra(f(a), f(b), f(imm8))
    case MM_CRC32_U16 (crc, v) =>
      _mm_crc32_u16(f(crc), f(v))
    case MM_CMPESTRA (a, la, b, lb, imm8) =>
      _mm_cmpestra(f(a), f(la), f(b), f(lb), f(imm8))
    case MM_CMPGT_EPI64 (a, b) =>
      _mm_cmpgt_epi64(f(a), f(b))
    case MM_CMPESTRI (a, la, b, lb, imm8) =>
      _mm_cmpestri(f(a), f(la), f(b), f(lb), f(imm8))
    case MM_CRC32_U32 (crc, v) =>
      _mm_crc32_u32(f(crc), f(v))
    case MM_CRC32_U8 (crc, v) =>
      _mm_crc32_u8(f(crc), f(v))
    case MM_CMPESTRS (a, la, b, lb, imm8) =>
      _mm_cmpestrs(f(a), f(la), f(b), f(lb), f(imm8))
    case MM_CMPESTRZ (a, la, b, lb, imm8) =>
      _mm_cmpestrz(f(a), f(la), f(b), f(lb), f(imm8))
    case MM_CRC32_U64 (crc, v) =>
      _mm_crc32_u64(f(crc), f(v))
    case MM_CMPISTRZ (a, b, imm8) =>
      _mm_cmpistrz(f(a), f(b), f(imm8))
    case MM_CMPISTRC (a, b, imm8) =>
      _mm_cmpistrc(f(a), f(b), f(imm8))

    case Reflect(MM_CMPESTRM (a, la, b, lb, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPESTRM (f(a), f(la), f(b), f(lb), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPISTRS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPISTRS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPISTRO (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPISTRO (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPISTRI (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPISTRI (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPESTRC (a, la, b, lb, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPESTRC (f(a), f(la), f(b), f(lb), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPISTRM (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPISTRM (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPESTRO (a, la, b, lb, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPESTRO (f(a), f(la), f(b), f(lb), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPISTRA (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPISTRA (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CRC32_U16 (crc, v), u, es) =>
      reflectMirrored(Reflect(MM_CRC32_U16 (f(crc), f(v)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPESTRA (a, la, b, lb, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPESTRA (f(a), f(la), f(b), f(lb), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPESTRI (a, la, b, lb, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPESTRI (f(a), f(la), f(b), f(lb), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CRC32_U32 (crc, v), u, es) =>
      reflectMirrored(Reflect(MM_CRC32_U32 (f(crc), f(v)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CRC32_U8 (crc, v), u, es) =>
      reflectMirrored(Reflect(MM_CRC32_U8 (f(crc), f(v)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPESTRS (a, la, b, lb, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPESTRS (f(a), f(la), f(b), f(lb), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPESTRZ (a, la, b, lb, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPESTRZ (f(a), f(la), f(b), f(lb), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CRC32_U64 (crc, v), u, es) =>
      reflectMirrored(Reflect(MM_CRC32_U64 (f(crc), f(v)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPISTRZ (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPISTRZ (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPISTRC (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMPISTRC (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSSE42 extends CGenIntrinsics {

  val IR: SSE42
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_CMPESTRM(a, la, b, lb, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpestrm(${quote(a)}, ${quote(la)}, ${quote(b)}, ${quote(lb)}, ${quote(imm8)})")
    case iDef@MM_CMPISTRS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpistrs(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CMPISTRO(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpistro(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CMPISTRI(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpistri(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CMPESTRC(a, la, b, lb, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpestrc(${quote(a)}, ${quote(la)}, ${quote(b)}, ${quote(lb)}, ${quote(imm8)})")
    case iDef@MM_CMPISTRM(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpistrm(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CMPESTRO(a, la, b, lb, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpestro(${quote(a)}, ${quote(la)}, ${quote(b)}, ${quote(lb)}, ${quote(imm8)})")
    case iDef@MM_CMPISTRA(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpistra(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CRC32_U16(crc, v) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_crc32_u16(${quote(crc)}, ${quote(v)})")
    case iDef@MM_CMPESTRA(a, la, b, lb, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpestra(${quote(a)}, ${quote(la)}, ${quote(b)}, ${quote(lb)}, ${quote(imm8)})")
    case iDef@MM_CMPGT_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPESTRI(a, la, b, lb, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpestri(${quote(a)}, ${quote(la)}, ${quote(b)}, ${quote(lb)}, ${quote(imm8)})")
    case iDef@MM_CRC32_U32(crc, v) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_crc32_u32(${quote(crc)}, ${quote(v)})")
    case iDef@MM_CRC32_U8(crc, v) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_crc32_u8(${quote(crc)}, ${quote(v)})")
    case iDef@MM_CMPESTRS(a, la, b, lb, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpestrs(${quote(a)}, ${quote(la)}, ${quote(b)}, ${quote(lb)}, ${quote(imm8)})")
    case iDef@MM_CMPESTRZ(a, la, b, lb, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpestrz(${quote(a)}, ${quote(la)}, ${quote(b)}, ${quote(lb)}, ${quote(imm8)})")
    case iDef@MM_CRC32_U64(crc, v) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_crc32_u64(${quote(crc)}, ${quote(v)})")
    case iDef@MM_CMPISTRZ(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpistrz(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CMPISTRC(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpistrc(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case _ => super.emitNode(sym, rhs)
  }
}
