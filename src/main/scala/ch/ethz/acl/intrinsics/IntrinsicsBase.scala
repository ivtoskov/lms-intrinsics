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

import ch.ethz.acl.intrinsics.MicroArchType.MicroArchType
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.lms.common._
import scala.language.higherKinds
import scala.lms.internal.CCodegen

trait IntrinsicsBase extends EffectExp {

  abstract class __m64
  abstract class __m128
  abstract class __m128d
  abstract class __m128i
  abstract class __m256
  abstract class __m256d
  abstract class __m256i
  abstract class __m512
  abstract class __m512d
  abstract class __m512i
  abstract class VoidPointer
  abstract class DoubleVoidPointer

  implicit def byteTyp    : Typ[Byte]
  implicit def charTyp    : Typ[Char]
  implicit def shortTyp   : Typ[Short]
  implicit def intTyp     : Typ[Int]
  implicit def longTyp    : Typ[Long]
  implicit def floatTyp   : Typ[Float]
  implicit def doubleTyp  : Typ[Double]

  implicit def uIntTyp    : Typ[UInt]
  implicit def uByteTyp   : Typ[UByte]
  implicit def uShortTyp  : Typ[UShort]
  implicit def uLongTyp   : Typ[ULong]
  implicit def anyTyp     : Typ[Any]

  implicit def __m64Typ   : Typ[__m64]     = manifestTyp
  implicit def __m128Typ  : Typ[__m128]    = manifestTyp
  implicit def __m128dTyp : Typ[__m128d]   = manifestTyp
  implicit def __m128iTyp : Typ[__m128i]   = manifestTyp
  implicit def __m256Typ  : Typ[__m256]    = manifestTyp
  implicit def __m256dTyp : Typ[__m256d]   = manifestTyp
  implicit def __m256iTyp : Typ[__m256i]   = manifestTyp
  implicit def __m512Typ  : Typ[__m512]    = manifestTyp
  implicit def __m512dTyp : Typ[__m512d]   = manifestTyp
  implicit def __m512iTyp : Typ[__m512i]   = manifestTyp
  implicit def voidPointerTyp: Typ[VoidPointer] = manifestTyp
  implicit def doubleVoidPointerTyp: Typ[DoubleVoidPointer] = manifestTyp

  case class Performance (latency: Option[Double], throughput: Option[Double])

  object IntrinsicsType extends Enumeration {
    type IntrinsicsType = Value
    val FloatingPoint = Value
    val Integer = Value
    val Mask = Value
  }

  object IntrinsicsCategory extends Enumeration {
    type IntrinsicsCategory     = Value
    val ApplicationTargeted     = Value
    val Arithmetic              = Value
    val BitManipulation         = Value
    val Cast                    = Value
    val Compare                 = Value
    val Convert                 = Value
    val Cryptography            = Value
    val ElementaryMathFunctions = Value
    val GeneralSupport          = Value
    val Load                    = Value
    val Logical                 = Value
    val Mask                    = Value
    val Miscellaneous           = Value
    val Move                    = Value
    val OSTargeted              = Value
    val ProbabilityStatistics   = Value
    val Random                  = Value
    val IntrinsicsSet           = Value
    val Shift                   = Value
    val SpecialMathFunctions    = Value
    val Store                   = Value
    val StringCompare           = Value
    val Swizzle                 = Value
    val Trigonometry            = Value
  }

  abstract class IntrinsicsDef[T:Manifest] extends Def[T] {
    val category: List[IntrinsicsCategory.IntrinsicsCategory]
    val intrinsicType: List[IntrinsicsType.IntrinsicsType]
    val performance: Map[MicroArchType, Performance]
    val header: String
  }

  abstract class PointerIntrinsicsDef[U:Integral, T:Manifest] extends IntrinsicsDef[T] {
    val integralType = implicitly[Integral[U]]
  }

  abstract class VoidPointerIntrinsicsDef[V:Typ, U:Integral, T:Manifest] extends PointerIntrinsicsDef[U, T] {
    val voidType = typ[V]
  }

  abstract class Container[C[_]] {
    def write[A:Typ, T:Typ](c: Exp[C[T]]*)(writeObject: Def[A]): Exp[A]
    def read[A:Typ, T:Typ](c: Exp[C[T]]*)(readObject: Def[A]): Exp[A]
    def apply[T:Typ](c: Exp[C[T]], i: Exp[Int]): Exp[T]
    def update[T:Typ](c: Exp[C[T]], i: Exp[Int], elem: Exp[T]): Exp[Unit]
    def newInstance[T:Typ](size: Exp[Int]): Exp[C[T]]
    def applyTransformer[A](x: Exp[A], f: Transformer): Exp[A]
  }

  def isIntrinsicType[T](m: Typ[T]): Boolean = m match {
    case _ if m <:< manifestTyp[__m64]   => true
    case _ if m <:< manifestTyp[__m128]  => true
    case _ if m <:< manifestTyp[__m128d] => true
    case _ if m <:< manifestTyp[__m128i] => true
    case _ if m <:< manifestTyp[__m256]  => true
    case _ if m <:< manifestTyp[__m256d] => true
    case _ if m <:< manifestTyp[__m256i] => true
    case _ if m <:< manifestTyp[__m512]  => true
    case _ if m <:< manifestTyp[__m512d] => true
    case _ if m <:< manifestTyp[__m512i] => true
    case _ => false
  }

  override def isPrimitiveType[T](m: Typ[T]): Boolean = {
    isIntrinsicType(m) || super.isPrimitiveType(m)
  }
}

trait IntrinsicsArrays extends IntrinsicsBase with ArrayOps {

  implicit object ArrayContainerExp extends Container[Array]
  {
    def write[A:Typ, T:Typ](c: Exp[Array[T]]*)(writeObject: Def[A]): Exp[A] = {
      reflectWrite(c.toArray:_*)(writeObject)
    }

    def read[A:Typ, T:Typ](c: Exp[Array[T]]*)(readObject: Def[A]): Exp[A] = {
      toAtom(readObject)
    }

    def apply[T:Typ](c: Exp[Array[T]], i: Exp[Int]): Exp[T] = {
      array_apply(c, i)
    }

    def update[T:Typ](c: Exp[Array[T]], i: Exp[Int], elem: Exp[T]): Exp[Unit] = {
      array_update(c, i, elem)
    }

    def applyTransformer[A](x: Exp[A], f: Transformer): Exp[A] = {
      f(x)
    }

    def newInstance[T:Typ](size: Exp[Int]): Exp[Array[T]] = {
      array_obj_new[T](size)
    }
  }

}

trait CGenIntrinsics extends CCodegen {
  val headers = scala.collection.mutable.Set[String]()

  val IR: IntrinsicsBase
  import IR._

  override def remap[T](m: Typ[T]): String = m match {
    case _ if m <:< ManifestTyp(manifest[__m64])             => "__m64"
    case _ if m <:< ManifestTyp(manifest[__m128])            => "__m128"
    case _ if m <:< ManifestTyp(manifest[__m128d])           => "__m128d"
    case _ if m <:< ManifestTyp(manifest[__m128i])           => "__m128i"
    case _ if m <:< ManifestTyp(manifest[__m256])            => "__m256"
    case _ if m <:< ManifestTyp(manifest[__m256d])           => "__m256d"
    case _ if m <:< ManifestTyp(manifest[__m256i])           => "__m256i"
    case _ if m <:< ManifestTyp(manifest[__m512])            => "__m512"
    case _ if m <:< ManifestTyp(manifest[__m512d])           => "__m512d"
    case _ if m <:< ManifestTyp(manifest[__m512i])           => "__m512i"
    case _ if m <:< ManifestTyp(manifest[VoidPointer])       => "void*"
    case _ if m <:< ManifestTyp(manifest[DoubleVoidPointer]) => "void**"
    case _ => super.remap(m)
  }

  override def isPrimitiveType[T](m: Typ[T]): Boolean = {
    isIntrinsicType(m) || super.isPrimitiveType(m)
  }

  def getHeaders = headers
}
