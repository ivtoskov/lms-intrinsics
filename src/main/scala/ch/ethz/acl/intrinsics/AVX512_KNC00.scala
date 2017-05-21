package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX512_KNC00 extends IntrinsicsBase {
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
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_ADD_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_ADD_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Blend packed double-precision (64-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_BLEND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_CMP_PD_MASK(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
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
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" to see if neither is NaN, and store the results in mask vector "k".
   * a: __m512d, b: __m512d
   */
  case class MM512_CMPORD_PD_MASK(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
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
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" for not-equal, and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_CMPNEQ_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
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
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" to see if neither is NaN, and store the results in mask vector "k" using
   * zeromask "k1" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_CMPORD_PD_MASK(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * a: __m512, b: __m512, imm8: const int
   */
  case class MM512_CMP_PS_MASK(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * a: __m512, b: __m512, imm8: const int, sae: const int
   */
  case class MM512_CMP_ROUND_PS_MASK(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for equality, and store the results in mask vector "k".
   * a: __m512, b: __m512
   */
  case class MM512_CMPEQ_PS_MASK(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-less-than-or-equal, and store the results in mask vector "k".
   * a: __m512, b: __m512
   */
  case class MM512_CMPNLE_PS_MASK(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for equality, and store the results in mask vector "k" using zeromask "k1"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_CMPEQ_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for less-than, and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_CMPLT_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" for not-less-than-or-equal, and store the results in mask vector "k" using
   * zeromask "k1" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_CMPNLE_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" to see if either is NaN, and store the results in mask vector "k" using
   * zeromask "k1" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_CMPUNORD_PS_MASK(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[Int] {
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "c" when the
   * corresponding mask bit is not set).
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8
   */
  case class MM512_MASK3_FMADD_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d
   */
  case class MM512_MASK_FMADD_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst". 
   * 	[round_note]
   * a: __m512d, b: __m512d, c: __m512d, rounding: int
   */
  case class MM512_FMSUB_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8
   */
  case class MM512_MASK3_FMSUB_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set). [round_note]
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d, rounding: int
   */
  case class MM512_MASK_FMSUB_ROUND_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst".
   * a: __m512, b: __m512, c: __m512
   */
  case class MM512_FMSUB_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m512, b: __m512, c: __m512, k: __mmask16
   */
  case class MM512_MASK3_FMSUB_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]) extends IntrinsicsDef[__m512] {
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set). [round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512, rounding: int
   */
  case class MM512_MASK_FMSUB_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst".
   * 	 [round_note]
   * a: __m512d, b: __m512d, c: __m512d, rounding: int
   */
  case class MM512_FNMADD_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).  [round_note]
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8, rounding: int
   */
  case class MM512_MASK3_FNMADD_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d
   */
  case class MM512_MASK_FNMADD_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set). [round_note]
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d, rounding: int
   */
  case class MM512_MASK_FNMADD_ROUND_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).  [round_note]
   * a: __m512, b: __m512, c: __m512, k: __mmask16, rounding: int
   */
  case class MM512_MASK3_FNMADD_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst".
   * a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_FNMSUB_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8
   */
  case class MM512_MASK3_FNMSUB_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set).
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d
   */
  case class MM512_MASK_FNMSUB_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst".
   * a: __m512, b: __m512, c: __m512
   */
  case class MM512_FNMSUB_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst". 
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512, rounding: int
   */
  case class MM512_FNMSUB_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set).
   * a: __m512, k: __mmask16, b: __m512, c: __m512
   */
  case class MM512_MASK_FNMSUB_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m512, k: __mmask16, vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I32GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
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
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * 	[round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_GETEXP_ROUND_PD(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_GETEXP_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_GETEXP_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m512d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM512_GETMANT_PD(a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * a: __m512d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM512_GETMANT_ROUND_PD(a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * src: __m512d, k: __mmask8, a: __m512d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM512_MASK_GETMANT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note][round_note]
   * src: __m512d, k: __mmask8, a: __m512d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM512_MASK_GETMANT_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * 	[getmant_note]
   * a: __m512, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM512_GETMANT_PS(a: Exp[__m512], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note][round_note]
   * src: __m512, k: __mmask16, a: __m512, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM512_MASK_GETMANT_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 64-byte
   * boundary or a general-protection exception may be generated.
   * src: __m512d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOAD_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 64-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m512d, mem_addrOffset: int
   */
  case class MM512_MASK_STORE_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 8 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" must be aligned on a 64-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: void*, a: __m512d, mem_addrOffset: int
   */
  case class MM512_STORE_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * Store 512-bits (composed of 16 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory. 
   * 	"mem_addr" must be aligned on a 64-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: void*, a: __m512, mem_addrOffset: int
   */
  case class MM512_STORE_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits (composed of 16 packed 32-bit integers) from memory into "dst".
   * 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_LOAD_EPI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits of integer data from memory into "dst". 
   * 	"mem_addr" must be
   * aligned on a 64-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_LOAD_SI512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
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
   * Store packed 64-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m512i, mem_addrOffset: int
   */
  case class MM512_MASK_STORE_EPI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).  RM.
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_MUL_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_MUL_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst". 
   * 	[round_note]
   * a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MUL_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).  RM.
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_MUL_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_MUL_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
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
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADD_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_AND_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 512 bits (representing integer data) in "a" and
   * "b", and store the result in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_AND_SI512(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 32-bit integers in "a" and then AND with
   * "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ANDNOT_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 512 bits (representing integer data) in "a" and
   * then AND with "b", and store the result in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ANDNOT_SI512(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 32-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ANDNOT_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
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
   * Compute the bitwise NOT of packed 64-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ANDNOT_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
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
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_AND_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 32-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_BLEND_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed 32-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m512i, b: __m512i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM512_CMP_EPI32_MASK(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPI32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGE_EPI32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed 32-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLE_EPI32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPNEQ_EPI32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512i, b: __m512i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM512_MASK_CMP_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGT_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed unsigned 32-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPU32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_add_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_ADD_PD(a, b)
  }
            
  def _mm512_add_round_pd(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_ADD_ROUND_PD(a, b, rounding)
  }
            
  def _mm512_mask_add_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ADD_PD(src, k, a, b)
  }
            
  def _mm512_mask_add_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ADD_ROUND_PD(src, k, a, b, rounding)
  }
            
  def _mm512_add_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_ADD_PS(a, b)
  }
            
  def _mm512_add_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_ADD_ROUND_PS(a, b, rounding)
  }
            
  def _mm512_mask_add_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ADD_PS(src, k, a, b)
  }
            
  def _mm512_mask_add_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ADD_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_alignr_epi32(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_ALIGNR_EPI32(a, b, count)
  }
            
  def _mm512_mask_alignr_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_ALIGNR_EPI32(src, k, a, b, count)
  }
            
  def _mm512_mask_blend_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_BLEND_PD(k, a, b)
  }
            
  def _mm512_mask_blend_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_BLEND_PS(k, a, b)
  }
            
  def _mm512_cmp_pd_mask(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_PD_MASK(a, b, imm8)
  }
            
  def _mm512_cmp_round_pd_mask(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM512_CMP_ROUND_PD_MASK(a, b, imm8, sae)
  }
            
  def _mm512_cmpeq_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPEQ_PD_MASK(a, b)
  }
            
  def _mm512_cmple_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPLE_PD_MASK(a, b)
  }
            
  def _mm512_cmplt_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPLT_PD_MASK(a, b)
  }
            
  def _mm512_cmpneq_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPNEQ_PD_MASK(a, b)
  }
            
  def _mm512_cmpnle_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPNLE_PD_MASK(a, b)
  }
            
  def _mm512_cmpnlt_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPNLT_PD_MASK(a, b)
  }
            
  def _mm512_cmpord_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPORD_PD_MASK(a, b)
  }
            
  def _mm512_cmpunord_pd_mask(a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_CMPUNORD_PD_MASK(a, b)
  }
            
  def _mm512_mask_cmp_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_PD_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_cmp_round_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_ROUND_PD_MASK(k1, a, b, imm8, sae)
  }
            
  def _mm512_mask_cmpeq_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPEQ_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmple_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPLE_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmplt_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPLT_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpneq_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPNEQ_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpnle_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPNLE_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpnlt_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPNLT_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpord_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPORD_PD_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpunord_pd_mask(k1: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[Int] = {
    MM512_MASK_CMPUNORD_PD_MASK(k1, a, b)
  }
            
  def _mm512_cmp_ps_mask(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_PS_MASK(a, b, imm8)
  }
            
  def _mm512_cmp_round_ps_mask(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM512_CMP_ROUND_PS_MASK(a, b, imm8, sae)
  }
            
  def _mm512_cmpeq_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPEQ_PS_MASK(a, b)
  }
            
  def _mm512_cmple_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPLE_PS_MASK(a, b)
  }
            
  def _mm512_cmplt_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPLT_PS_MASK(a, b)
  }
            
  def _mm512_cmpneq_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPNEQ_PS_MASK(a, b)
  }
            
  def _mm512_cmpnle_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPNLE_PS_MASK(a, b)
  }
            
  def _mm512_cmpnlt_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPNLT_PS_MASK(a, b)
  }
            
  def _mm512_cmpord_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPORD_PS_MASK(a, b)
  }
            
  def _mm512_cmpunord_ps_mask(a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_CMPUNORD_PS_MASK(a, b)
  }
            
  def _mm512_mask_cmp_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_PS_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_cmp_round_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_ROUND_PS_MASK(k1, a, b, imm8, sae)
  }
            
  def _mm512_mask_cmpeq_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPEQ_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmple_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPLE_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmplt_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPLT_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpneq_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPNEQ_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpnle_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPNLE_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpnlt_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPNLT_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpord_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPORD_PS_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpunord_ps_mask(k1: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[Int] = {
    MM512_MASK_CMPUNORD_PS_MASK(k1, a, b)
  }
            
  def _mm512_fmadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FMADD_PD(a, b, c)
  }
            
  def _mm512_fmadd_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FMADD_ROUND_PD(a, b, c, rounding)
  }
            
  def _mm512_mask3_fmadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMADD_PD(a, b, c, k)
  }
            
  def _mm512_mask3_fmadd_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMADD_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fmadd_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FMADD_PD(a, k, b, c)
  }
            
  def _mm512_mask_fmadd_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FMADD_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm512_fmadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FMADD_PS(a, b, c)
  }
            
  def _mm512_fmadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMADD_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_mask3_fmadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMADD_PS(a, b, c, k)
  }
            
  def _mm512_mask3_fmadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMADD_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fmadd_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMADD_PS(a, k, b, c)
  }
            
  def _mm512_mask_fmadd_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FMADD_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm512_fmsub_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FMSUB_PD(a, b, c)
  }
            
  def _mm512_fmsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FMSUB_ROUND_PD(a, b, c, rounding)
  }
            
  def _mm512_mask3_fmsub_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMSUB_PD(a, b, c, k)
  }
            
  def _mm512_mask3_fmsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMSUB_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fmsub_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FMSUB_PD(a, k, b, c)
  }
            
  def _mm512_mask_fmsub_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FMSUB_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm512_fmsub_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FMSUB_PS(a, b, c)
  }
            
  def _mm512_fmsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMSUB_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_mask3_fmsub_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMSUB_PS(a, b, c, k)
  }
            
  def _mm512_mask3_fmsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMSUB_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fmsub_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMSUB_PS(a, k, b, c)
  }
            
  def _mm512_mask_fmsub_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FMSUB_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm512_fnmadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FNMADD_PD(a, b, c)
  }
            
  def _mm512_fnmadd_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FNMADD_ROUND_PD(a, b, c, rounding)
  }
            
  def _mm512_mask3_fnmadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FNMADD_PD(a, b, c, k)
  }
            
  def _mm512_mask3_fnmadd_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FNMADD_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fnmadd_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FNMADD_PD(a, k, b, c)
  }
            
  def _mm512_mask_fnmadd_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FNMADD_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm512_fnmadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FNMADD_PS(a, b, c)
  }
            
  def _mm512_fnmadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FNMADD_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_mask3_fnmadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FNMADD_PS(a, b, c, k)
  }
            
  def _mm512_mask3_fnmadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FNMADD_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fnmadd_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FNMADD_PS(a, k, b, c)
  }
            
  def _mm512_mask_fnmadd_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FNMADD_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm512_fnmsub_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FNMSUB_PD(a, b, c)
  }
            
  def _mm512_fnmsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FNMSUB_ROUND_PD(a, b, c, rounding)
  }
            
  def _mm512_mask3_fnmsub_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FNMSUB_PD(a, b, c, k)
  }
            
  def _mm512_mask3_fnmsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FNMSUB_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fnmsub_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FNMSUB_PD(a, k, b, c)
  }
            
  def _mm512_mask_fnmsub_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FNMSUB_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm512_fnmsub_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FNMSUB_PS(a, b, c)
  }
            
  def _mm512_fnmsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FNMSUB_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_mask3_fnmsub_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FNMSUB_PS(a, b, c, k)
  }
            
  def _mm512_mask3_fnmsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FNMSUB_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fnmsub_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FNMSUB_PS(a, k, b, c)
  }
            
  def _mm512_mask_fnmsub_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FNMSUB_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm512_i32gather_ps[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(base_addr)(MM512_I32GATHER_PS(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i32gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(base_addr)(MM512_MASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_getexp_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_GETEXP_PD(a)
  }
            
  def _mm512_getexp_round_pd(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_GETEXP_ROUND_PD(a, rounding)
  }
            
  def _mm512_mask_getexp_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_GETEXP_PD(src, k, a)
  }
            
  def _mm512_mask_getexp_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_GETEXP_ROUND_PD(src, k, a, rounding)
  }
            
  def _mm512_getexp_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_GETEXP_PS(a)
  }
            
  def _mm512_getexp_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_GETEXP_ROUND_PS(a, rounding)
  }
            
  def _mm512_mask_getexp_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_GETEXP_PS(src, k, a)
  }
            
  def _mm512_mask_getexp_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_GETEXP_ROUND_PS(src, k, a, rounding)
  }
            
  def _mm512_getmant_pd(a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int]): Exp[__m512d] = {
    MM512_GETMANT_PD(a, interv, sc)
  }
            
  def _mm512_getmant_round_pd(a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_GETMANT_ROUND_PD(a, interv, sc, rounding)
  }
            
  def _mm512_mask_getmant_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_GETMANT_PD(src, k, a, interv, sc)
  }
            
  def _mm512_mask_getmant_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_GETMANT_ROUND_PD(src, k, a, interv, sc, rounding)
  }
            
  def _mm512_getmant_ps(a: Exp[__m512], interv: Exp[Int], sc: Exp[Int]): Exp[__m512] = {
    MM512_GETMANT_PS(a, interv, sc)
  }
            
  def _mm512_getmant_round_ps(a: Exp[__m512], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_GETMANT_ROUND_PS(a, interv, sc, rounding)
  }
            
  def _mm512_mask_getmant_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int]): Exp[__m512] = {
    MM512_MASK_GETMANT_PS(src, k, a, interv, sc)
  }
            
  def _mm512_mask_getmant_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_GETMANT_ROUND_PS(src, k, a, interv, sc, rounding)
  }
            
  def _mm512_load_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_LOAD_PD(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_load_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_mov_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_MOV_PD(src, k, a)
  }
            
  def _mm512_mask_store_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_store_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STORE_PD(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_load_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_LOAD_PS(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_load_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_mov_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MOV_PS(src, k, a)
  }
            
  def _mm512_mask_store_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_store_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STORE_PS(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_load_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_LOAD_EPI32(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_load_si512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_LOAD_SI512(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_load_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOAD_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_mov_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MOV_EPI32(src, k, a)
  }
            
  def _mm512_mask_store_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STORE_EPI32(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_store_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STORE_EPI32(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_store_si512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STORE_SI512(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_load_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_LOAD_EPI64(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_load_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOAD_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_mov_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MOV_EPI64(src, k, a)
  }
            
  def _mm512_mask_store_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STORE_EPI64(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_store_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STORE_EPI64(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_mul_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_MUL_PD(src, k, a, b)
  }
            
  def _mm512_mask_mul_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_MUL_ROUND_PD(src, k, a, b, rounding)
  }
            
  def _mm512_mul_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MUL_PD(a, b)
  }
            
  def _mm512_mul_round_pd(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MUL_ROUND_PD(a, b, rounding)
  }
            
  def _mm512_mask_mul_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MUL_PS(src, k, a, b)
  }
            
  def _mm512_mask_mul_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_MUL_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_mul_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MUL_PS(a, b)
  }
            
  def _mm512_mul_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MUL_ROUND_PS(a, b, rounding)
  }
            
  def _mm512_add_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADD_EPI32(a, b)
  }
            
  def _mm512_mask_add_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADD_EPI32(src, k, a, b)
  }
            
  def _mm512_and_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_AND_EPI32(a, b)
  }
            
  def _mm512_and_si512(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_AND_SI512(a, b)
  }
            
  def _mm512_andnot_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ANDNOT_EPI32(a, b)
  }
            
  def _mm512_andnot_si512(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ANDNOT_SI512(a, b)
  }
            
  def _mm512_mask_andnot_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ANDNOT_EPI32(src, k, a, b)
  }
            
  def _mm512_andnot_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ANDNOT_EPI64(a, b)
  }
            
  def _mm512_mask_andnot_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ANDNOT_EPI64(src, k, a, b)
  }
            
  def _mm512_and_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_AND_EPI64(a, b)
  }
            
  def _mm512_mask_and_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_AND_EPI64(src, k, a, b)
  }
            
  def _mm512_mask_blend_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_BLEND_EPI32(k, a, b)
  }
            
  def _mm512_mask_blend_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_BLEND_EPI64(k, a, b)
  }
            
  def _mm512_cmp_epi32_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_EPI32_MASK(a, b, imm8)
  }
            
  def _mm512_cmpeq_epi32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPEQ_EPI32_MASK(a, b)
  }
            
  def _mm512_cmpge_epi32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGE_EPI32_MASK(a, b)
  }
            
  def _mm512_cmpgt_epi32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGT_EPI32_MASK(a, b)
  }
            
  def _mm512_cmple_epi32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLE_EPI32_MASK(a, b)
  }
            
  def _mm512_cmpneq_epi32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPNEQ_EPI32_MASK(a, b)
  }
            
  def _mm512_mask_cmp_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_EPI32_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_cmpeq_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPEQ_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpge_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGE_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpgt_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGT_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmple_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLE_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpneq_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPNEQ_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_cmp_epu32_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_EPU32_MASK(a, b, imm8)
  }
            
  def _mm512_cmpeq_epu32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPEQ_EPU32_MASK(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_ADD_PD (a, b) =>
      _mm512_add_pd(f(a), f(b))
    case MM512_ADD_ROUND_PD (a, b, rounding) =>
      _mm512_add_round_pd(f(a), f(b), f(rounding))
    case MM512_MASK_ADD_PD (src, k, a, b) =>
      _mm512_mask_add_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_ADD_ROUND_PD (src, k, a, b, rounding) =>
      _mm512_mask_add_round_pd(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_ADD_PS (a, b) =>
      _mm512_add_ps(f(a), f(b))
    case MM512_ADD_ROUND_PS (a, b, rounding) =>
      _mm512_add_round_ps(f(a), f(b), f(rounding))
    case MM512_MASK_ADD_PS (src, k, a, b) =>
      _mm512_mask_add_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_ADD_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_add_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_ALIGNR_EPI32 (a, b, count) =>
      _mm512_alignr_epi32(f(a), f(b), f(count))
    case MM512_MASK_ALIGNR_EPI32 (src, k, a, b, count) =>
      _mm512_mask_alignr_epi32(f(src), f(k), f(a), f(b), f(count))
    case MM512_MASK_BLEND_PD (k, a, b) =>
      _mm512_mask_blend_pd(f(k), f(a), f(b))
    case MM512_MASK_BLEND_PS (k, a, b) =>
      _mm512_mask_blend_ps(f(k), f(a), f(b))
    case MM512_CMP_PD_MASK (a, b, imm8) =>
      _mm512_cmp_pd_mask(f(a), f(b), f(imm8))
    case MM512_CMP_ROUND_PD_MASK (a, b, imm8, sae) =>
      _mm512_cmp_round_pd_mask(f(a), f(b), f(imm8), f(sae))
    case MM512_CMPEQ_PD_MASK (a, b) =>
      _mm512_cmpeq_pd_mask(f(a), f(b))
    case MM512_CMPLE_PD_MASK (a, b) =>
      _mm512_cmple_pd_mask(f(a), f(b))
    case MM512_CMPLT_PD_MASK (a, b) =>
      _mm512_cmplt_pd_mask(f(a), f(b))
    case MM512_CMPNEQ_PD_MASK (a, b) =>
      _mm512_cmpneq_pd_mask(f(a), f(b))
    case MM512_CMPNLE_PD_MASK (a, b) =>
      _mm512_cmpnle_pd_mask(f(a), f(b))
    case MM512_CMPNLT_PD_MASK (a, b) =>
      _mm512_cmpnlt_pd_mask(f(a), f(b))
    case MM512_CMPORD_PD_MASK (a, b) =>
      _mm512_cmpord_pd_mask(f(a), f(b))
    case MM512_CMPUNORD_PD_MASK (a, b) =>
      _mm512_cmpunord_pd_mask(f(a), f(b))
    case MM512_MASK_CMP_PD_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_pd_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_CMP_ROUND_PD_MASK (k1, a, b, imm8, sae) =>
      _mm512_mask_cmp_round_pd_mask(f(k1), f(a), f(b), f(imm8), f(sae))
    case MM512_MASK_CMPEQ_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLE_PD_MASK (k1, a, b) =>
      _mm512_mask_cmple_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLT_PD_MASK (k1, a, b) =>
      _mm512_mask_cmplt_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNEQ_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNLE_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpnle_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNLT_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpnlt_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPORD_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpord_pd_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPUNORD_PD_MASK (k1, a, b) =>
      _mm512_mask_cmpunord_pd_mask(f(k1), f(a), f(b))
    case MM512_CMP_PS_MASK (a, b, imm8) =>
      _mm512_cmp_ps_mask(f(a), f(b), f(imm8))
    case MM512_CMP_ROUND_PS_MASK (a, b, imm8, sae) =>
      _mm512_cmp_round_ps_mask(f(a), f(b), f(imm8), f(sae))
    case MM512_CMPEQ_PS_MASK (a, b) =>
      _mm512_cmpeq_ps_mask(f(a), f(b))
    case MM512_CMPLE_PS_MASK (a, b) =>
      _mm512_cmple_ps_mask(f(a), f(b))
    case MM512_CMPLT_PS_MASK (a, b) =>
      _mm512_cmplt_ps_mask(f(a), f(b))
    case MM512_CMPNEQ_PS_MASK (a, b) =>
      _mm512_cmpneq_ps_mask(f(a), f(b))
    case MM512_CMPNLE_PS_MASK (a, b) =>
      _mm512_cmpnle_ps_mask(f(a), f(b))
    case MM512_CMPNLT_PS_MASK (a, b) =>
      _mm512_cmpnlt_ps_mask(f(a), f(b))
    case MM512_CMPORD_PS_MASK (a, b) =>
      _mm512_cmpord_ps_mask(f(a), f(b))
    case MM512_CMPUNORD_PS_MASK (a, b) =>
      _mm512_cmpunord_ps_mask(f(a), f(b))
    case MM512_MASK_CMP_PS_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_ps_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_CMP_ROUND_PS_MASK (k1, a, b, imm8, sae) =>
      _mm512_mask_cmp_round_ps_mask(f(k1), f(a), f(b), f(imm8), f(sae))
    case MM512_MASK_CMPEQ_PS_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLE_PS_MASK (k1, a, b) =>
      _mm512_mask_cmple_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLT_PS_MASK (k1, a, b) =>
      _mm512_mask_cmplt_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNEQ_PS_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNLE_PS_MASK (k1, a, b) =>
      _mm512_mask_cmpnle_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNLT_PS_MASK (k1, a, b) =>
      _mm512_mask_cmpnlt_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPORD_PS_MASK (k1, a, b) =>
      _mm512_mask_cmpord_ps_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPUNORD_PS_MASK (k1, a, b) =>
      _mm512_mask_cmpunord_ps_mask(f(k1), f(a), f(b))
    case MM512_FMADD_PD (a, b, c) =>
      _mm512_fmadd_pd(f(a), f(b), f(c))
    case MM512_FMADD_ROUND_PD (a, b, c, rounding) =>
      _mm512_fmadd_round_pd(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMADD_PD (a, b, c, k) =>
      _mm512_mask3_fmadd_pd(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FMADD_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fmadd_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FMADD_PD (a, k, b, c) =>
      _mm512_mask_fmadd_pd(f(a), f(k), f(b), f(c))
    case MM512_MASK_FMADD_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fmadd_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_FMADD_PS (a, b, c) =>
      _mm512_fmadd_ps(f(a), f(b), f(c))
    case MM512_FMADD_ROUND_PS (a, b, c, rounding) =>
      _mm512_fmadd_round_ps(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMADD_PS (a, b, c, k) =>
      _mm512_mask3_fmadd_ps(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FMADD_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fmadd_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FMADD_PS (a, k, b, c) =>
      _mm512_mask_fmadd_ps(f(a), f(k), f(b), f(c))
    case MM512_MASK_FMADD_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fmadd_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_FMSUB_PD (a, b, c) =>
      _mm512_fmsub_pd(f(a), f(b), f(c))
    case MM512_FMSUB_ROUND_PD (a, b, c, rounding) =>
      _mm512_fmsub_round_pd(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMSUB_PD (a, b, c, k) =>
      _mm512_mask3_fmsub_pd(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FMSUB_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fmsub_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FMSUB_PD (a, k, b, c) =>
      _mm512_mask_fmsub_pd(f(a), f(k), f(b), f(c))
    case MM512_MASK_FMSUB_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fmsub_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_FMSUB_PS (a, b, c) =>
      _mm512_fmsub_ps(f(a), f(b), f(c))
    case MM512_FMSUB_ROUND_PS (a, b, c, rounding) =>
      _mm512_fmsub_round_ps(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMSUB_PS (a, b, c, k) =>
      _mm512_mask3_fmsub_ps(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FMSUB_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fmsub_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FMSUB_PS (a, k, b, c) =>
      _mm512_mask_fmsub_ps(f(a), f(k), f(b), f(c))
    case MM512_MASK_FMSUB_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fmsub_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_FNMADD_PD (a, b, c) =>
      _mm512_fnmadd_pd(f(a), f(b), f(c))
    case MM512_FNMADD_ROUND_PD (a, b, c, rounding) =>
      _mm512_fnmadd_round_pd(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FNMADD_PD (a, b, c, k) =>
      _mm512_mask3_fnmadd_pd(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FNMADD_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fnmadd_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FNMADD_PD (a, k, b, c) =>
      _mm512_mask_fnmadd_pd(f(a), f(k), f(b), f(c))
    case MM512_MASK_FNMADD_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fnmadd_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_FNMADD_PS (a, b, c) =>
      _mm512_fnmadd_ps(f(a), f(b), f(c))
    case MM512_FNMADD_ROUND_PS (a, b, c, rounding) =>
      _mm512_fnmadd_round_ps(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FNMADD_PS (a, b, c, k) =>
      _mm512_mask3_fnmadd_ps(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FNMADD_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fnmadd_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FNMADD_PS (a, k, b, c) =>
      _mm512_mask_fnmadd_ps(f(a), f(k), f(b), f(c))
    case MM512_MASK_FNMADD_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fnmadd_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_FNMSUB_PD (a, b, c) =>
      _mm512_fnmsub_pd(f(a), f(b), f(c))
    case MM512_FNMSUB_ROUND_PD (a, b, c, rounding) =>
      _mm512_fnmsub_round_pd(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FNMSUB_PD (a, b, c, k) =>
      _mm512_mask3_fnmsub_pd(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FNMSUB_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fnmsub_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FNMSUB_PD (a, k, b, c) =>
      _mm512_mask_fnmsub_pd(f(a), f(k), f(b), f(c))
    case MM512_MASK_FNMSUB_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fnmsub_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_FNMSUB_PS (a, b, c) =>
      _mm512_fnmsub_ps(f(a), f(b), f(c))
    case MM512_FNMSUB_ROUND_PS (a, b, c, rounding) =>
      _mm512_fnmsub_round_ps(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FNMSUB_PS (a, b, c, k) =>
      _mm512_mask3_fnmsub_ps(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FNMSUB_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fnmsub_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FNMSUB_PS (a, k, b, c) =>
      _mm512_mask_fnmsub_ps(f(a), f(k), f(b), f(c))
    case MM512_MASK_FNMSUB_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fnmsub_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case iDef@MM512_I32GATHER_PS (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i32gather_ps(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i32gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_GETEXP_PD (a) =>
      _mm512_getexp_pd(f(a))
    case MM512_GETEXP_ROUND_PD (a, rounding) =>
      _mm512_getexp_round_pd(f(a), f(rounding))
    case MM512_MASK_GETEXP_PD (src, k, a) =>
      _mm512_mask_getexp_pd(f(src), f(k), f(a))
    case MM512_MASK_GETEXP_ROUND_PD (src, k, a, rounding) =>
      _mm512_mask_getexp_round_pd(f(src), f(k), f(a), f(rounding))
    case MM512_GETEXP_PS (a) =>
      _mm512_getexp_ps(f(a))
    case MM512_GETEXP_ROUND_PS (a, rounding) =>
      _mm512_getexp_round_ps(f(a), f(rounding))
    case MM512_MASK_GETEXP_PS (src, k, a) =>
      _mm512_mask_getexp_ps(f(src), f(k), f(a))
    case MM512_MASK_GETEXP_ROUND_PS (src, k, a, rounding) =>
      _mm512_mask_getexp_round_ps(f(src), f(k), f(a), f(rounding))
    case MM512_GETMANT_PD (a, interv, sc) =>
      _mm512_getmant_pd(f(a), f(interv), f(sc))
    case MM512_GETMANT_ROUND_PD (a, interv, sc, rounding) =>
      _mm512_getmant_round_pd(f(a), f(interv), f(sc), f(rounding))
    case MM512_MASK_GETMANT_PD (src, k, a, interv, sc) =>
      _mm512_mask_getmant_pd(f(src), f(k), f(a), f(interv), f(sc))
    case MM512_MASK_GETMANT_ROUND_PD (src, k, a, interv, sc, rounding) =>
      _mm512_mask_getmant_round_pd(f(src), f(k), f(a), f(interv), f(sc), f(rounding))
    case MM512_GETMANT_PS (a, interv, sc) =>
      _mm512_getmant_ps(f(a), f(interv), f(sc))
    case MM512_GETMANT_ROUND_PS (a, interv, sc, rounding) =>
      _mm512_getmant_round_ps(f(a), f(interv), f(sc), f(rounding))
    case MM512_MASK_GETMANT_PS (src, k, a, interv, sc) =>
      _mm512_mask_getmant_ps(f(src), f(k), f(a), f(interv), f(sc))
    case MM512_MASK_GETMANT_ROUND_PS (src, k, a, interv, sc, rounding) =>
      _mm512_mask_getmant_round_ps(f(src), f(k), f(a), f(interv), f(sc), f(rounding))
    case iDef@MM512_LOAD_PD (mem_addr, mem_addrOffset) =>
      _mm512_load_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_load_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MOV_PD (src, k, a) =>
      _mm512_mask_mov_pd(f(src), f(k), f(a))
    case iDef@MM512_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_store_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORE_PD (mem_addr, a, mem_addrOffset) =>
      _mm512_store_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOAD_PS (mem_addr, mem_addrOffset) =>
      _mm512_load_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_load_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MOV_PS (src, k, a) =>
      _mm512_mask_mov_ps(f(src), f(k), f(a))
    case iDef@MM512_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_store_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORE_PS (mem_addr, a, mem_addrOffset) =>
      _mm512_store_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOAD_EPI32 (mem_addr, mem_addrOffset) =>
      _mm512_load_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOAD_SI512 (mem_addr, mem_addrOffset) =>
      _mm512_load_si512(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOAD_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_load_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MOV_EPI32 (src, k, a) =>
      _mm512_mask_mov_epi32(f(src), f(k), f(a))
    case iDef@MM512_MASK_STORE_EPI32 (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_store_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORE_EPI32 (mem_addr, a, mem_addrOffset) =>
      _mm512_store_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORE_SI512 (mem_addr, a, mem_addrOffset) =>
      _mm512_store_si512(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOAD_EPI64 (mem_addr, mem_addrOffset) =>
      _mm512_load_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOAD_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_load_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MOV_EPI64 (src, k, a) =>
      _mm512_mask_mov_epi64(f(src), f(k), f(a))
    case iDef@MM512_MASK_STORE_EPI64 (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_store_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORE_EPI64 (mem_addr, a, mem_addrOffset) =>
      _mm512_store_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MUL_PD (src, k, a, b) =>
      _mm512_mask_mul_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_MUL_ROUND_PD (src, k, a, b, rounding) =>
      _mm512_mask_mul_round_pd(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MUL_PD (a, b) =>
      _mm512_mul_pd(f(a), f(b))
    case MM512_MUL_ROUND_PD (a, b, rounding) =>
      _mm512_mul_round_pd(f(a), f(b), f(rounding))
    case MM512_MASK_MUL_PS (src, k, a, b) =>
      _mm512_mask_mul_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_MUL_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_mul_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MUL_PS (a, b) =>
      _mm512_mul_ps(f(a), f(b))
    case MM512_MUL_ROUND_PS (a, b, rounding) =>
      _mm512_mul_round_ps(f(a), f(b), f(rounding))
    case MM512_ADD_EPI32 (a, b) =>
      _mm512_add_epi32(f(a), f(b))
    case MM512_MASK_ADD_EPI32 (src, k, a, b) =>
      _mm512_mask_add_epi32(f(src), f(k), f(a), f(b))
    case MM512_AND_EPI32 (a, b) =>
      _mm512_and_epi32(f(a), f(b))
    case MM512_AND_SI512 (a, b) =>
      _mm512_and_si512(f(a), f(b))
    case MM512_ANDNOT_EPI32 (a, b) =>
      _mm512_andnot_epi32(f(a), f(b))
    case MM512_ANDNOT_SI512 (a, b) =>
      _mm512_andnot_si512(f(a), f(b))
    case MM512_MASK_ANDNOT_EPI32 (src, k, a, b) =>
      _mm512_mask_andnot_epi32(f(src), f(k), f(a), f(b))
    case MM512_ANDNOT_EPI64 (a, b) =>
      _mm512_andnot_epi64(f(a), f(b))
    case MM512_MASK_ANDNOT_EPI64 (src, k, a, b) =>
      _mm512_mask_andnot_epi64(f(src), f(k), f(a), f(b))
    case MM512_AND_EPI64 (a, b) =>
      _mm512_and_epi64(f(a), f(b))
    case MM512_MASK_AND_EPI64 (src, k, a, b) =>
      _mm512_mask_and_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASK_BLEND_EPI32 (k, a, b) =>
      _mm512_mask_blend_epi32(f(k), f(a), f(b))
    case MM512_MASK_BLEND_EPI64 (k, a, b) =>
      _mm512_mask_blend_epi64(f(k), f(a), f(b))
    case MM512_CMP_EPI32_MASK (a, b, imm8) =>
      _mm512_cmp_epi32_mask(f(a), f(b), f(imm8))
    case MM512_CMPEQ_EPI32_MASK (a, b) =>
      _mm512_cmpeq_epi32_mask(f(a), f(b))
    case MM512_CMPGE_EPI32_MASK (a, b) =>
      _mm512_cmpge_epi32_mask(f(a), f(b))
    case MM512_CMPGT_EPI32_MASK (a, b) =>
      _mm512_cmpgt_epi32_mask(f(a), f(b))
    case MM512_CMPLE_EPI32_MASK (a, b) =>
      _mm512_cmple_epi32_mask(f(a), f(b))
    case MM512_CMPNEQ_EPI32_MASK (a, b) =>
      _mm512_cmpneq_epi32_mask(f(a), f(b))
    case MM512_MASK_CMP_EPI32_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_epi32_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_CMPEQ_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_epi32_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPGE_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epi32_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPGT_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmpgt_epi32_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLE_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmple_epi32_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNEQ_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epi32_mask(f(k1), f(a), f(b))
    case MM512_CMP_EPU32_MASK (a, b, imm8) =>
      _mm512_cmp_epu32_mask(f(a), f(b), f(imm8))
    case MM512_CMPEQ_EPU32_MASK (a, b) =>
      _mm512_cmpeq_epu32_mask(f(a), f(b))

    case Reflect(MM512_ADD_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_ROUND_PD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_ROUND_PD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_ROUND_PD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_ROUND_PD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ALIGNR_EPI32 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_ALIGNR_EPI32 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ALIGNR_EPI32 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ALIGNR_EPI32 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_PD_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_PD_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_ROUND_PD_MASK (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_ROUND_PD_MASK (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNLE_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNLE_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNLT_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNLT_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPORD_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPORD_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPUNORD_PD_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPUNORD_PD_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_PD_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_PD_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_ROUND_PD_MASK (k1, a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_ROUND_PD_MASK (f(k1), f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNLE_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNLE_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNLT_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNLT_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPORD_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPORD_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPUNORD_PD_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPUNORD_PD_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_PS_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_PS_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_ROUND_PS_MASK (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_ROUND_PS_MASK (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNLE_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNLE_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNLT_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNLT_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPORD_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPORD_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPUNORD_PS_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPUNORD_PS_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_PS_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_PS_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_ROUND_PS_MASK (k1, a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_ROUND_PS_MASK (f(k1), f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNLE_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNLE_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNLT_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNLT_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPORD_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPORD_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPUNORD_PS_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPUNORD_PS_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_ROUND_PD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_ROUND_PD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADD_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADD_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADD_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADD_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUB_ROUND_PD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUB_ROUND_PD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUB_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUB_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUB_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUB_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUB_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUB_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUB_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUB_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUB_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUB_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FNMADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMADD_ROUND_PD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FNMADD_ROUND_PD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMADD_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMADD_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMADD_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMADD_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FNMADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMADD_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FNMADD_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMADD_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMADD_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMADD_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMADD_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FNMSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMSUB_ROUND_PD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FNMSUB_ROUND_PD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMSUB_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMSUB_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMSUB_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMSUB_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FNMSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FNMSUB_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FNMSUB_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FNMSUB_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FNMSUB_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FNMSUB_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FNMSUB_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32GATHER_PS (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32GATHER_PS (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETEXP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_GETEXP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETEXP_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_GETEXP_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETEXP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETEXP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETEXP_ROUND_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETEXP_ROUND_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETEXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_GETEXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETEXP_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_GETEXP_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETEXP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETEXP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETEXP_ROUND_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETEXP_ROUND_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETMANT_PD (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM512_GETMANT_PD (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETMANT_ROUND_PD (a, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_GETMANT_ROUND_PD (f(a), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETMANT_PD (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETMANT_PD (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETMANT_ROUND_PD (src, k, a, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETMANT_ROUND_PD (f(src), f(k), f(a), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETMANT_PS (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM512_GETMANT_PS (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GETMANT_ROUND_PS (a, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_GETMANT_ROUND_PS (f(a), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETMANT_PS (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETMANT_PS (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GETMANT_ROUND_PS (src, k, a, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GETMANT_ROUND_PS (f(src), f(k), f(a), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOAD_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOAD_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOAD_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORE_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOAD_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOAD_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOAD_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORE_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOAD_EPI32 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOAD_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOAD_SI512 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOAD_SI512 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOAD_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOAD_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STORE_EPI32 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STORE_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORE_EPI32 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORE_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORE_SI512 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORE_SI512 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOAD_EPI64 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOAD_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOAD_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOAD_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STORE_EPI64 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STORE_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORE_EPI64 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORE_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MUL_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MUL_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MUL_ROUND_PD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MUL_ROUND_PD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MUL_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MUL_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MUL_ROUND_PD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MUL_ROUND_PD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MUL_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MUL_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MUL_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MUL_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MUL_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MUL_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MUL_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MUL_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AND_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AND_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AND_SI512 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AND_SI512 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ANDNOT_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ANDNOT_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ANDNOT_SI512 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ANDNOT_SI512 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ANDNOT_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ANDNOT_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ANDNOT_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ANDNOT_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ANDNOT_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ANDNOT_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AND_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AND_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_AND_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_AND_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPI32_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPI32_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGE_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGE_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_EPI32_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_EPI32_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGT_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGT_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPU32_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPU32_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512_KNC00 extends CGenIntrinsics {

  val IR: AVX512_KNC
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_ADD_PD(a, b) =>
      emitValDef(sym, s"_mm512_add_pd(${quote(a)}, ${quote(b)})")
    case MM512_ADD_ROUND_PD(a, b, rounding) =>
      emitValDef(sym, s"_mm512_add_round_pd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASK_ADD_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_add_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_ADD_ROUND_PD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_mask_add_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_ADD_PS(a, b) =>
      emitValDef(sym, s"_mm512_add_ps(${quote(a)}, ${quote(b)})")
    case MM512_ADD_ROUND_PS(a, b, rounding) =>
      emitValDef(sym, s"_mm512_add_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASK_ADD_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_add_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_ADD_ROUND_PS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_mask_add_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_ALIGNR_EPI32(a, b, count) =>
      emitValDef(sym, s"_mm512_alignr_epi32(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM512_MASK_ALIGNR_EPI32(src, k, a, b, count) =>
      emitValDef(sym, s"_mm512_mask_alignr_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM512_MASK_BLEND_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_mask_blend_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_BLEND_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_mask_blend_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_CMP_PD_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm512_cmp_pd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_CMP_ROUND_PD_MASK(a, b, imm8, sae) =>
      emitValDef(sym, s"_mm512_cmp_round_pd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM512_CMPEQ_PD_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpeq_pd_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPLE_PD_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmple_pd_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPLT_PD_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmplt_pd_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPNEQ_PD_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpneq_pd_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPNLE_PD_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpnle_pd_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPNLT_PD_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpnlt_pd_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPORD_PD_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpord_pd_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPUNORD_PD_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpunord_pd_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMP_PD_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_cmp_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_CMP_ROUND_PD_MASK(k1, a, b, imm8, sae) =>
      emitValDef(sym, s"_mm512_mask_cmp_round_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM512_MASK_CMPEQ_PD_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpeq_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLE_PD_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmple_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLT_PD_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmplt_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNEQ_PD_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpneq_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNLE_PD_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpnle_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNLT_PD_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpnlt_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPORD_PD_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpord_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPUNORD_PD_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpunord_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_CMP_PS_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm512_cmp_ps_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_CMP_ROUND_PS_MASK(a, b, imm8, sae) =>
      emitValDef(sym, s"_mm512_cmp_round_ps_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM512_CMPEQ_PS_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpeq_ps_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPLE_PS_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmple_ps_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPLT_PS_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmplt_ps_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPNEQ_PS_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpneq_ps_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPNLE_PS_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpnle_ps_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPNLT_PS_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpnlt_ps_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPORD_PS_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpord_ps_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPUNORD_PS_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpunord_ps_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMP_PS_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_cmp_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_CMP_ROUND_PS_MASK(k1, a, b, imm8, sae) =>
      emitValDef(sym, s"_mm512_mask_cmp_round_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM512_MASK_CMPEQ_PS_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpeq_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLE_PS_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmple_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLT_PS_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmplt_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNEQ_PS_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpneq_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNLE_PS_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpnle_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNLT_PS_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpnlt_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPORD_PS_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpord_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPUNORD_PS_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpunord_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_FMADD_PD(a, b, c) =>
      emitValDef(sym, s"_mm512_fmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_FMADD_ROUND_PD(a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_fmadd_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASK3_FMADD_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm512_mask3_fmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM512_MASK3_FMADD_ROUND_PD(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm512_mask3_fmadd_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM512_MASK_FMADD_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_fmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_FMADD_ROUND_PD(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm512_mask_fmadd_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_FMADD_PS(a, b, c) =>
      emitValDef(sym, s"_mm512_fmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_FMADD_ROUND_PS(a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_fmadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASK3_FMADD_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm512_mask3_fmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM512_MASK3_FMADD_ROUND_PS(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm512_mask3_fmadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM512_MASK_FMADD_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_fmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_FMADD_ROUND_PS(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm512_mask_fmadd_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_FMSUB_PD(a, b, c) =>
      emitValDef(sym, s"_mm512_fmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_FMSUB_ROUND_PD(a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_fmsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASK3_FMSUB_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm512_mask3_fmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM512_MASK3_FMSUB_ROUND_PD(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm512_mask3_fmsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM512_MASK_FMSUB_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_fmsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_FMSUB_ROUND_PD(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm512_mask_fmsub_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_FMSUB_PS(a, b, c) =>
      emitValDef(sym, s"_mm512_fmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_FMSUB_ROUND_PS(a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_fmsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASK3_FMSUB_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm512_mask3_fmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM512_MASK3_FMSUB_ROUND_PS(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm512_mask3_fmsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM512_MASK_FMSUB_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_fmsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_FMSUB_ROUND_PS(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm512_mask_fmsub_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_FNMADD_PD(a, b, c) =>
      emitValDef(sym, s"_mm512_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_FNMADD_ROUND_PD(a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_fnmadd_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASK3_FNMADD_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm512_mask3_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM512_MASK3_FNMADD_ROUND_PD(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm512_mask3_fnmadd_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM512_MASK_FNMADD_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_fnmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_FNMADD_ROUND_PD(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm512_mask_fnmadd_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_FNMADD_PS(a, b, c) =>
      emitValDef(sym, s"_mm512_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_FNMADD_ROUND_PS(a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_fnmadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASK3_FNMADD_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm512_mask3_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM512_MASK3_FNMADD_ROUND_PS(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm512_mask3_fnmadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM512_MASK_FNMADD_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_fnmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_FNMADD_ROUND_PS(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm512_mask_fnmadd_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_FNMSUB_PD(a, b, c) =>
      emitValDef(sym, s"_mm512_fnmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_FNMSUB_ROUND_PD(a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_fnmsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASK3_FNMSUB_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm512_mask3_fnmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM512_MASK3_FNMSUB_ROUND_PD(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm512_mask3_fnmsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM512_MASK_FNMSUB_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_fnmsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_FNMSUB_ROUND_PD(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm512_mask_fnmsub_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_FNMSUB_PS(a, b, c) =>
      emitValDef(sym, s"_mm512_fnmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_FNMSUB_ROUND_PS(a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_fnmsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASK3_FNMSUB_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm512_mask3_fnmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM512_MASK3_FNMSUB_ROUND_PS(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm512_mask3_fnmsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM512_MASK_FNMSUB_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_fnmsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_FNMSUB_ROUND_PS(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm512_mask_fnmsub_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_I32GATHER_PS(vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm512_i32gather_ps(${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM512_MASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_i32gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM512_GETEXP_PD(a) =>
      emitValDef(sym, s"_mm512_getexp_pd(${quote(a)})")
    case MM512_GETEXP_ROUND_PD(a, rounding) =>
      emitValDef(sym, s"_mm512_getexp_round_pd(${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_GETEXP_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_getexp_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_GETEXP_ROUND_PD(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_getexp_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_GETEXP_PS(a) =>
      emitValDef(sym, s"_mm512_getexp_ps(${quote(a)})")
    case MM512_GETEXP_ROUND_PS(a, rounding) =>
      emitValDef(sym, s"_mm512_getexp_round_ps(${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_GETEXP_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_getexp_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_GETEXP_ROUND_PS(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_getexp_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_GETMANT_PD(a, interv, sc) =>
      emitValDef(sym, s"_mm512_getmant_pd(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM512_GETMANT_ROUND_PD(a, interv, sc, rounding) =>
      emitValDef(sym, s"_mm512_getmant_round_pd(${quote(a)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM512_MASK_GETMANT_PD(src, k, a, interv, sc) =>
      emitValDef(sym, s"_mm512_mask_getmant_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM512_MASK_GETMANT_ROUND_PD(src, k, a, interv, sc, rounding) =>
      emitValDef(sym, s"_mm512_mask_getmant_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM512_GETMANT_PS(a, interv, sc) =>
      emitValDef(sym, s"_mm512_getmant_ps(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM512_GETMANT_ROUND_PS(a, interv, sc, rounding) =>
      emitValDef(sym, s"_mm512_getmant_round_ps(${quote(a)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM512_MASK_GETMANT_PS(src, k, a, interv, sc) =>
      emitValDef(sym, s"_mm512_mask_getmant_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM512_MASK_GETMANT_ROUND_PS(src, k, a, interv, sc, rounding) =>
      emitValDef(sym, s"_mm512_mask_getmant_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM512_LOAD_PD(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_load_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_load_pd(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_MOV_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_mov_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm512_mask_store_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_STORE_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_store_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM512_LOAD_PS(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_load_ps(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_load_ps(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_MOV_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_mov_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm512_mask_store_ps(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_STORE_PS(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_store_ps(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM512_LOAD_EPI32(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_load_epi32(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_LOAD_SI512(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_load_si512(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_LOAD_EPI32(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_load_epi32(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_MOV_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_mov_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_STORE_EPI32(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm512_mask_store_epi32(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_STORE_EPI32(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_store_epi32(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM512_STORE_SI512(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_store_si512(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM512_LOAD_EPI64(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_load_epi64(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_LOAD_EPI64(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_load_epi64(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_MOV_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_mov_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_STORE_EPI64(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm512_mask_store_epi64(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_STORE_EPI64(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_store_epi64(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM512_MASK_MUL_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_mul_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MUL_ROUND_PD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_mask_mul_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MUL_PD(a, b) =>
      emitValDef(sym, s"_mm512_mul_pd(${quote(a)}, ${quote(b)})")
    case MM512_MUL_ROUND_PD(a, b, rounding) =>
      emitValDef(sym, s"_mm512_mul_round_pd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASK_MUL_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_mul_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MUL_ROUND_PS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_mask_mul_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MUL_PS(a, b) =>
      emitValDef(sym, s"_mm512_mul_ps(${quote(a)}, ${quote(b)})")
    case MM512_MUL_ROUND_PS(a, b, rounding) =>
      emitValDef(sym, s"_mm512_mul_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_ADD_EPI32(a, b) =>
      emitValDef(sym, s"_mm512_add_epi32(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ADD_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_add_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_AND_EPI32(a, b) =>
      emitValDef(sym, s"_mm512_and_epi32(${quote(a)}, ${quote(b)})")
    case MM512_AND_SI512(a, b) =>
      emitValDef(sym, s"_mm512_and_si512(${quote(a)}, ${quote(b)})")
    case MM512_ANDNOT_EPI32(a, b) =>
      emitValDef(sym, s"_mm512_andnot_epi32(${quote(a)}, ${quote(b)})")
    case MM512_ANDNOT_SI512(a, b) =>
      emitValDef(sym, s"_mm512_andnot_si512(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ANDNOT_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_andnot_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_ANDNOT_EPI64(a, b) =>
      emitValDef(sym, s"_mm512_andnot_epi64(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ANDNOT_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_andnot_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_AND_EPI64(a, b) =>
      emitValDef(sym, s"_mm512_and_epi64(${quote(a)}, ${quote(b)})")
    case MM512_MASK_AND_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_and_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_BLEND_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm512_mask_blend_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_BLEND_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm512_mask_blend_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_CMP_EPI32_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm512_cmp_epi32_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_CMPEQ_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpeq_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPGE_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpge_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPGT_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpgt_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPLE_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmple_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPNEQ_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpneq_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMP_EPI32_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_cmp_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_CMPEQ_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpeq_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPGE_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpge_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPGT_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpgt_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLE_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmple_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNEQ_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpneq_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_CMP_EPU32_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm512_cmp_epu32_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_CMPEQ_EPU32_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpeq_epu32_mask(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
