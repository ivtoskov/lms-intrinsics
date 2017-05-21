package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX512020 extends IntrinsicsBase {
  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask64, idx: __m512i, a: __m512i
   */
  case class MM512_MASKZ_PERMUTEXVAR_EPI8(k: Exp[Long], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m256i, a: __m256i
   */
  case class MM256_PERMUTEXVAR_EPI8(idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, idx: __m256i, a: __m256i
   */
  case class MM256_MASK_PERMUTEXVAR_EPI8(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask32, idx: __m256i, a: __m256i
   */
  case class MM256_MASKZ_PERMUTEXVAR_EPI8(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst".
   * idx: __m128i, a: __m128i
   */
  case class MM_PERMUTEXVAR_EPI8(idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, idx: __m128i, a: __m128i
   */
  case class MM_MASK_PERMUTEXVAR_EPI8(src: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, idx: __m128i, a: __m128i
   */
  case class MM_MASKZ_PERMUTEXVAR_EPI8(k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_PERMUTEX2VAR_EPI8(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512i, k: __mmask64, idx: __m512i, b: __m512i
   */
  case class MM512_MASK_PERMUTEX2VAR_EPI8(a: Exp[__m512i], k: Exp[Long], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512i, idx: __m512i, k: __mmask64, b: __m512i
   */
  case class MM512_MASK2_PERMUTEX2VAR_EPI8(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Long], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_MASKZ_PERMUTEX2VAR_EPI8(k: Exp[Long], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_PERMUTEX2VAR_EPI8(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask32, idx: __m256i, b: __m256i
   */
  case class MM256_MASK_PERMUTEX2VAR_EPI8(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256i, idx: __m256i, k: __mmask32, b: __m256i
   */
  case class MM256_MASK2_PERMUTEX2VAR_EPI8(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEX2VAR_EPI8(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst".
   * a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_PERMUTEX2VAR_EPI8(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask16, idx: __m128i, b: __m128i
   */
  case class MM_MASK_PERMUTEX2VAR_EPI8(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

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
   * Shuffle 8-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_MASKZ_PERMUTEX2VAR_EPI8(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_maskz_permutexvar_epi8(k: Exp[Long], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEXVAR_EPI8(k, idx, a)
  }
            
  def _mm256_permutexvar_epi8(idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEXVAR_EPI8(idx, a)
  }
            
  def _mm256_mask_permutexvar_epi8(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEXVAR_EPI8(src, k, idx, a)
  }
            
  def _mm256_maskz_permutexvar_epi8(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEXVAR_EPI8(k, idx, a)
  }
            
  def _mm_permutexvar_epi8(idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEXVAR_EPI8(idx, a)
  }
            
  def _mm_mask_permutexvar_epi8(src: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEXVAR_EPI8(src, k, idx, a)
  }
            
  def _mm_maskz_permutexvar_epi8(k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEXVAR_EPI8(k, idx, a)
  }
            
  def _mm512_permutex2var_epi8(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEX2VAR_EPI8(a, idx, b)
  }
            
  def _mm512_mask_permutex2var_epi8(a: Exp[__m512i], k: Exp[Long], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b)
  }
            
  def _mm512_mask2_permutex2var_epi8(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Long], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b)
  }
            
  def _mm512_maskz_permutex2var_epi8(k: Exp[Long], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b)
  }
            
  def _mm256_permutex2var_epi8(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEX2VAR_EPI8(a, idx, b)
  }
            
  def _mm256_mask_permutex2var_epi8(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b)
  }
            
  def _mm256_mask2_permutex2var_epi8(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b)
  }
            
  def _mm256_maskz_permutex2var_epi8(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b)
  }
            
  def _mm_permutex2var_epi8(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEX2VAR_EPI8(a, idx, b)
  }
            
  def _mm_mask_permutex2var_epi8(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b)
  }
            
  def _mm_mask2_permutex2var_epi8(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b)
  }
            
  def _mm_maskz_permutex2var_epi8(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a) =>
      _mm512_maskz_permutexvar_epi8(f(k), f(idx), f(a))
    case MM256_PERMUTEXVAR_EPI8 (idx, a) =>
      _mm256_permutexvar_epi8(f(idx), f(a))
    case MM256_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a) =>
      _mm256_mask_permutexvar_epi8(f(src), f(k), f(idx), f(a))
    case MM256_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a) =>
      _mm256_maskz_permutexvar_epi8(f(k), f(idx), f(a))
    case MM_PERMUTEXVAR_EPI8 (idx, a) =>
      _mm_permutexvar_epi8(f(idx), f(a))
    case MM_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a) =>
      _mm_mask_permutexvar_epi8(f(src), f(k), f(idx), f(a))
    case MM_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a) =>
      _mm_maskz_permutexvar_epi8(f(k), f(idx), f(a))
    case MM512_PERMUTEX2VAR_EPI8 (a, idx, b) =>
      _mm512_permutex2var_epi8(f(a), f(idx), f(b))
    case MM512_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b) =>
      _mm512_mask_permutex2var_epi8(f(a), f(k), f(idx), f(b))
    case MM512_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b) =>
      _mm512_mask2_permutex2var_epi8(f(a), f(idx), f(k), f(b))
    case MM512_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b) =>
      _mm512_maskz_permutex2var_epi8(f(k), f(a), f(idx), f(b))
    case MM256_PERMUTEX2VAR_EPI8 (a, idx, b) =>
      _mm256_permutex2var_epi8(f(a), f(idx), f(b))
    case MM256_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b) =>
      _mm256_mask_permutex2var_epi8(f(a), f(k), f(idx), f(b))
    case MM256_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b) =>
      _mm256_mask2_permutex2var_epi8(f(a), f(idx), f(k), f(b))
    case MM256_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b) =>
      _mm256_maskz_permutex2var_epi8(f(k), f(a), f(idx), f(b))
    case MM_PERMUTEX2VAR_EPI8 (a, idx, b) =>
      _mm_permutex2var_epi8(f(a), f(idx), f(b))
    case MM_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b) =>
      _mm_mask_permutex2var_epi8(f(a), f(k), f(idx), f(b))
    case MM_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b) =>
      _mm_mask2_permutex2var_epi8(f(a), f(idx), f(k), f(b))
    case MM_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b) =>
      _mm_maskz_permutex2var_epi8(f(k), f(a), f(idx), f(b))

    case Reflect(MM512_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEXVAR_EPI8 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_EPI8 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_EPI8 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_EPI8 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_EPI8 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEXVAR_EPI8 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEXVAR_EPI8 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEXVAR_EPI8 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEXVAR_EPI8 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX2VAR_EPI8 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEX2VAR_EPI8 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI8 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_EPI8 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_EPI8 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI8 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_EPI8 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_EPI8 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_EPI8 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512020 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_MASKZ_PERMUTEXVAR_EPI8(k, idx, a) =>
      emitValDef(sym, s"_mm512_maskz_permutexvar_epi8(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_PERMUTEXVAR_EPI8(idx, a) =>
      emitValDef(sym, s"_mm256_permutexvar_epi8(${quote(idx)}, ${quote(a)})")
    case MM256_MASK_PERMUTEXVAR_EPI8(src, k, idx, a) =>
      emitValDef(sym, s"_mm256_mask_permutexvar_epi8(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_MASKZ_PERMUTEXVAR_EPI8(k, idx, a) =>
      emitValDef(sym, s"_mm256_maskz_permutexvar_epi8(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM_PERMUTEXVAR_EPI8(idx, a) =>
      emitValDef(sym, s"_mm_permutexvar_epi8(${quote(idx)}, ${quote(a)})")
    case MM_MASK_PERMUTEXVAR_EPI8(src, k, idx, a) =>
      emitValDef(sym, s"_mm_mask_permutexvar_epi8(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM_MASKZ_PERMUTEXVAR_EPI8(k, idx, a) =>
      emitValDef(sym, s"_mm_maskz_permutexvar_epi8(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM512_PERMUTEX2VAR_EPI8(a, idx, b) =>
      emitValDef(sym, s"_mm512_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM512_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b) =>
      emitValDef(sym, s"_mm512_mask_permutex2var_epi8(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM512_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b) =>
      emitValDef(sym, s"_mm512_mask2_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM512_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b) =>
      emitValDef(sym, s"_mm512_maskz_permutex2var_epi8(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_PERMUTEX2VAR_EPI8(a, idx, b) =>
      emitValDef(sym, s"_mm256_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b) =>
      emitValDef(sym, s"_mm256_mask_permutex2var_epi8(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b) =>
      emitValDef(sym, s"_mm256_mask2_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM256_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b) =>
      emitValDef(sym, s"_mm256_maskz_permutex2var_epi8(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_PERMUTEX2VAR_EPI8(a, idx, b) =>
      emitValDef(sym, s"_mm_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b) =>
      emitValDef(sym, s"_mm_mask_permutex2var_epi8(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b) =>
      emitValDef(sym, s"_mm_mask2_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b) =>
      emitValDef(sym, s"_mm_maskz_permutex2var_epi8(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
