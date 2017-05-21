package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait SVML02 extends IntrinsicsBase {
  /**
   * Compute the exponential value of packed double-precision (64-bit)
   * floating-point elements in "a" raised by packed elements in "b", and store the
   * results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_POW_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of packed double-precision (64-bit)
   * floating-point elements in "a" raised by packed elements in "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_POW_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of packed single-precision (32-bit)
   * floating-point elements in "a" raised by packed elements in "b", and store the
   * results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_POW_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of packed single-precision (32-bit)
   * floating-point elements in "a" raised by packed elements in "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_POW_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Computes the reciprocal of packed double-precision (64-bit) floating-point
   * elements in "a", storing the results in "dst".
   * a: __m512d
   */
  case class MM512_RECIP_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Computes the reciprocal of packed double-precision (64-bit) floating-point
   * elements in "a", storing the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RECIP_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Computes the reciprocal of packed single-precision (32-bit) floating-point
   * elements in "a", storing the results in "dst".
   * a: __m512
   */
  case class MM512_RECIP_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Computes the reciprocal of packed single-precision (32-bit) floating-point
   * elements in "a", storing the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RECIP_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rounds the packed double-precision (64-bit) floating-point elements in "a" to
   * the nearest even integer value and stores the results in "dst".
   * a: __m512d
   */
  case class MM512_RINT_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rounds the packed double-precision (64-bit) floating-point elements in "a" to
   * the nearest even integer value and stores the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RINT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rounds the packed single-precision (32-bit) floating-point elements in "a" to
   * the nearest even integer value and stores the results in "dst".
   * a: __m512
   */
  case class MM512_RINT_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rounds the packed single-precision (32-bit) floating-point elements in "a" to
   * the nearest even integer value and stores the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RINT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" to
   * the nearest integer value, and store the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m512d
   */
  case class MM512_SVML_ROUND_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" to
   * the nearest integer value, and store the results as packed double-precision
   * floating-point elements in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_SVML_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_SIN_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_SIN_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m512
   */
  case class MM512_SIN_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_SIN_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic sine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_SINH_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic sine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_SINH_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic sine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m512
   */
  case class MM512_SINH_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic sine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_SINH_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_SIND_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_SIND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m512
   */
  case class MM512_SIND_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_SIND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_TAN_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_TAN_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m512
   */
  case class MM512_TAN_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_TAN_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in degrees, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_TAND_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in degrees, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_TAND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in degrees, and store the results in "dst".
   * a: __m512
   */
  case class MM512_TAND_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in degrees, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_TAND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic tangent of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m512d
   */
  case class MM512_TANH_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic tangent of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_TANH_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic tangent of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m512
   */
  case class MM512_TANH_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic tangent of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_TANH_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Truncate the packed double-precision (64-bit) floating-point elements in "a",
   * and store the results as packed double-precision floating-point elements in
   * "dst".
   * a: __m512d
   */
  case class MM512_TRUNC_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Truncate the packed double-precision (64-bit) floating-point elements in "a",
   * and store the results as packed double-precision floating-point elements in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_TRUNC_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Truncate the packed single-precision (32-bit) floating-point elements in "a",
   * and store the results as packed single-precision floating-point elements in
   * "dst".
   * a: __m512
   */
  case class MM512_TRUNC_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Truncate the packed single-precision (32-bit) floating-point elements in "a",
   * and store the results as packed single-precision floating-point elements in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_TRUNC_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_DIV_EPU32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_DIV_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 8-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_DIV_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 16-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_DIV_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 64-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_DIV_EPU64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_REM_EPU32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_REM_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 8-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_REM_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 16-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_REM_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 64-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_REM_EPU64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Computes the sine and cosine of the packed double-precision (64-bit)
   * floating-point elements in "a" and stores the results of the sine computation
   * in "dst" and the results of the cosine computation in "cos_res".
   * cos_res: __m512d *, a: __m512d, cos_resOffset: int
   */
  case class MM512_SINCOS_PD[A[_], U:Integral](cos_res: Exp[A[__m512d]], a: Exp[__m512d], cos_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Computes the sine and cosine of the packed double-precision (64-bit)
   * floating-point elements in "a" and stores the results of the sine computation
   * in "dst" and the results of the cosine computation in "cos_res". Elements are
   * written to their respective locations using writemask "k" (elements are copied
   * from "sin_src" or "cos_src" when the corresponding mask bit is not set).
   * cos_res: __m512d *, sin_src: __m512d, cos_src: __m512d, k: __mmask8, a: __m512d, cos_resOffset: int
   */
  case class MM512_MASK_SINCOS_PD[A[_], U:Integral](cos_res: Exp[A[__m512d]], sin_src: Exp[__m512d], cos_src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], cos_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Computes the sine and cosine of the packed single-precision (32-bit)
   * floating-point elements in "a" and stores the results of the sine computation
   * in "dst" and the results of the cosine computation in "cos_res".
   * cos_res: __m512 *, a: __m512, cos_resOffset: int
   */
  case class MM512_SINCOS_PS[A[_], U:Integral](cos_res: Exp[A[__m512]], a: Exp[__m512], cos_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Computes the sine and cosine of the packed single-precision (32-bit)
   * floating-point elements in "a" and stores the results of the sine computation
   * in "dst" and the results of the cosine computation in "cos_res". Elements are
   * written to their respective locations using writemask "k" (elements are copied
   * from "sin_src" or "cos_src" when the corresponding mask bit is not set).
   * cos_res: __m512 *, sin_src: __m512, cos_src: __m512, k: __mmask16, a: __m512, cos_resOffset: int
   */
  case class MM512_MASK_SINCOS_PS[A[_], U:Integral](cos_res: Exp[A[__m512]], sin_src: Exp[__m512], cos_src: Exp[__m512], k: Exp[Int], a: Exp[__m512], cos_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_pow_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_POW_PD(a, b)
  }
            
  def _mm512_mask_pow_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_POW_PD(src, k, a, b)
  }
            
  def _mm512_pow_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_POW_PS(a, b)
  }
            
  def _mm512_mask_pow_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_POW_PS(src, k, a, b)
  }
            
  def _mm512_recip_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RECIP_PD(a)
  }
            
  def _mm512_mask_recip_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RECIP_PD(src, k, a)
  }
            
  def _mm512_recip_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RECIP_PS(a)
  }
            
  def _mm512_mask_recip_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RECIP_PS(src, k, a)
  }
            
  def _mm512_rint_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RINT_PD(a)
  }
            
  def _mm512_mask_rint_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RINT_PD(src, k, a)
  }
            
  def _mm512_rint_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RINT_PS(a)
  }
            
  def _mm512_mask_rint_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RINT_PS(src, k, a)
  }
            
  def _mm512_svml_round_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_SVML_ROUND_PD(a)
  }
            
  def _mm512_mask_svml_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SVML_ROUND_PD(src, k, a)
  }
            
  def _mm512_sin_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_SIN_PD(a)
  }
            
  def _mm512_mask_sin_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SIN_PD(src, k, a)
  }
            
  def _mm512_sin_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_SIN_PS(a)
  }
            
  def _mm512_mask_sin_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SIN_PS(src, k, a)
  }
            
  def _mm512_sinh_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_SINH_PD(a)
  }
            
  def _mm512_mask_sinh_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SINH_PD(src, k, a)
  }
            
  def _mm512_sinh_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_SINH_PS(a)
  }
            
  def _mm512_mask_sinh_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SINH_PS(src, k, a)
  }
            
  def _mm512_sind_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_SIND_PD(a)
  }
            
  def _mm512_mask_sind_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SIND_PD(src, k, a)
  }
            
  def _mm512_sind_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_SIND_PS(a)
  }
            
  def _mm512_mask_sind_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SIND_PS(src, k, a)
  }
            
  def _mm512_tan_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_TAN_PD(a)
  }
            
  def _mm512_mask_tan_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_TAN_PD(src, k, a)
  }
            
  def _mm512_tan_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_TAN_PS(a)
  }
            
  def _mm512_mask_tan_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_TAN_PS(src, k, a)
  }
            
  def _mm512_tand_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_TAND_PD(a)
  }
            
  def _mm512_mask_tand_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_TAND_PD(src, k, a)
  }
            
  def _mm512_tand_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_TAND_PS(a)
  }
            
  def _mm512_mask_tand_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_TAND_PS(src, k, a)
  }
            
  def _mm512_tanh_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_TANH_PD(a)
  }
            
  def _mm512_mask_tanh_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_TANH_PD(src, k, a)
  }
            
  def _mm512_tanh_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_TANH_PS(a)
  }
            
  def _mm512_mask_tanh_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_TANH_PS(src, k, a)
  }
            
  def _mm512_trunc_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_TRUNC_PD(a)
  }
            
  def _mm512_mask_trunc_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_TRUNC_PD(src, k, a)
  }
            
  def _mm512_trunc_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_TRUNC_PS(a)
  }
            
  def _mm512_mask_trunc_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_TRUNC_PS(src, k, a)
  }
            
  def _mm512_div_epu32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_DIV_EPU32(a, b)
  }
            
  def _mm512_mask_div_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_DIV_EPU32(src, k, a, b)
  }
            
  def _mm512_div_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_DIV_EPU8(a, b)
  }
            
  def _mm512_div_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_DIV_EPU16(a, b)
  }
            
  def _mm512_div_epu64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_DIV_EPU64(a, b)
  }
            
  def _mm512_rem_epu32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPU32(a, b)
  }
            
  def _mm512_mask_rem_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_REM_EPU32(src, k, a, b)
  }
            
  def _mm512_rem_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPU8(a, b)
  }
            
  def _mm512_rem_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPU16(a, b)
  }
            
  def _mm512_rem_epu64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPU64(a, b)
  }
            
  def _mm512_sincos_pd[A[_], U:Integral](cos_res: Exp[A[__m512d]], a: Exp[__m512d], cos_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.write(cos_res)(MM512_SINCOS_PD(cos_res, a, cos_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_sincos_pd[A[_], U:Integral](cos_res: Exp[A[__m512d]], sin_src: Exp[__m512d], cos_src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], cos_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.write(cos_res)(MM512_MASK_SINCOS_PD(cos_res, sin_src, cos_src, k, a, cos_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_sincos_ps[A[_], U:Integral](cos_res: Exp[A[__m512]], a: Exp[__m512], cos_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(cos_res)(MM512_SINCOS_PS(cos_res, a, cos_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_sincos_ps[A[_], U:Integral](cos_res: Exp[A[__m512]], sin_src: Exp[__m512], cos_src: Exp[__m512], k: Exp[Int], a: Exp[__m512], cos_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(cos_res)(MM512_MASK_SINCOS_PS(cos_res, sin_src, cos_src, k, a, cos_resOffset)(implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_POW_PD (a, b) =>
      _mm512_pow_pd(f(a), f(b))
    case MM512_MASK_POW_PD (src, k, a, b) =>
      _mm512_mask_pow_pd(f(src), f(k), f(a), f(b))
    case MM512_POW_PS (a, b) =>
      _mm512_pow_ps(f(a), f(b))
    case MM512_MASK_POW_PS (src, k, a, b) =>
      _mm512_mask_pow_ps(f(src), f(k), f(a), f(b))
    case MM512_RECIP_PD (a) =>
      _mm512_recip_pd(f(a))
    case MM512_MASK_RECIP_PD (src, k, a) =>
      _mm512_mask_recip_pd(f(src), f(k), f(a))
    case MM512_RECIP_PS (a) =>
      _mm512_recip_ps(f(a))
    case MM512_MASK_RECIP_PS (src, k, a) =>
      _mm512_mask_recip_ps(f(src), f(k), f(a))
    case MM512_RINT_PD (a) =>
      _mm512_rint_pd(f(a))
    case MM512_MASK_RINT_PD (src, k, a) =>
      _mm512_mask_rint_pd(f(src), f(k), f(a))
    case MM512_RINT_PS (a) =>
      _mm512_rint_ps(f(a))
    case MM512_MASK_RINT_PS (src, k, a) =>
      _mm512_mask_rint_ps(f(src), f(k), f(a))
    case MM512_SVML_ROUND_PD (a) =>
      _mm512_svml_round_pd(f(a))
    case MM512_MASK_SVML_ROUND_PD (src, k, a) =>
      _mm512_mask_svml_round_pd(f(src), f(k), f(a))
    case MM512_SIN_PD (a) =>
      _mm512_sin_pd(f(a))
    case MM512_MASK_SIN_PD (src, k, a) =>
      _mm512_mask_sin_pd(f(src), f(k), f(a))
    case MM512_SIN_PS (a) =>
      _mm512_sin_ps(f(a))
    case MM512_MASK_SIN_PS (src, k, a) =>
      _mm512_mask_sin_ps(f(src), f(k), f(a))
    case MM512_SINH_PD (a) =>
      _mm512_sinh_pd(f(a))
    case MM512_MASK_SINH_PD (src, k, a) =>
      _mm512_mask_sinh_pd(f(src), f(k), f(a))
    case MM512_SINH_PS (a) =>
      _mm512_sinh_ps(f(a))
    case MM512_MASK_SINH_PS (src, k, a) =>
      _mm512_mask_sinh_ps(f(src), f(k), f(a))
    case MM512_SIND_PD (a) =>
      _mm512_sind_pd(f(a))
    case MM512_MASK_SIND_PD (src, k, a) =>
      _mm512_mask_sind_pd(f(src), f(k), f(a))
    case MM512_SIND_PS (a) =>
      _mm512_sind_ps(f(a))
    case MM512_MASK_SIND_PS (src, k, a) =>
      _mm512_mask_sind_ps(f(src), f(k), f(a))
    case MM512_TAN_PD (a) =>
      _mm512_tan_pd(f(a))
    case MM512_MASK_TAN_PD (src, k, a) =>
      _mm512_mask_tan_pd(f(src), f(k), f(a))
    case MM512_TAN_PS (a) =>
      _mm512_tan_ps(f(a))
    case MM512_MASK_TAN_PS (src, k, a) =>
      _mm512_mask_tan_ps(f(src), f(k), f(a))
    case MM512_TAND_PD (a) =>
      _mm512_tand_pd(f(a))
    case MM512_MASK_TAND_PD (src, k, a) =>
      _mm512_mask_tand_pd(f(src), f(k), f(a))
    case MM512_TAND_PS (a) =>
      _mm512_tand_ps(f(a))
    case MM512_MASK_TAND_PS (src, k, a) =>
      _mm512_mask_tand_ps(f(src), f(k), f(a))
    case MM512_TANH_PD (a) =>
      _mm512_tanh_pd(f(a))
    case MM512_MASK_TANH_PD (src, k, a) =>
      _mm512_mask_tanh_pd(f(src), f(k), f(a))
    case MM512_TANH_PS (a) =>
      _mm512_tanh_ps(f(a))
    case MM512_MASK_TANH_PS (src, k, a) =>
      _mm512_mask_tanh_ps(f(src), f(k), f(a))
    case MM512_TRUNC_PD (a) =>
      _mm512_trunc_pd(f(a))
    case MM512_MASK_TRUNC_PD (src, k, a) =>
      _mm512_mask_trunc_pd(f(src), f(k), f(a))
    case MM512_TRUNC_PS (a) =>
      _mm512_trunc_ps(f(a))
    case MM512_MASK_TRUNC_PS (src, k, a) =>
      _mm512_mask_trunc_ps(f(src), f(k), f(a))
    case MM512_DIV_EPU32 (a, b) =>
      _mm512_div_epu32(f(a), f(b))
    case MM512_MASK_DIV_EPU32 (src, k, a, b) =>
      _mm512_mask_div_epu32(f(src), f(k), f(a), f(b))
    case MM512_DIV_EPU8 (a, b) =>
      _mm512_div_epu8(f(a), f(b))
    case MM512_DIV_EPU16 (a, b) =>
      _mm512_div_epu16(f(a), f(b))
    case MM512_DIV_EPU64 (a, b) =>
      _mm512_div_epu64(f(a), f(b))
    case MM512_REM_EPU32 (a, b) =>
      _mm512_rem_epu32(f(a), f(b))
    case MM512_MASK_REM_EPU32 (src, k, a, b) =>
      _mm512_mask_rem_epu32(f(src), f(k), f(a), f(b))
    case MM512_REM_EPU8 (a, b) =>
      _mm512_rem_epu8(f(a), f(b))
    case MM512_REM_EPU16 (a, b) =>
      _mm512_rem_epu16(f(a), f(b))
    case MM512_REM_EPU64 (a, b) =>
      _mm512_rem_epu64(f(a), f(b))
    case iDef@MM512_SINCOS_PD (cos_res, a, cos_resOffset) =>
      _mm512_sincos_pd(iDef.cont.applyTransformer(cos_res, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(cos_resOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_SINCOS_PD (cos_res, sin_src, cos_src, k, a, cos_resOffset) =>
      _mm512_mask_sincos_pd(iDef.cont.applyTransformer(cos_res, f), iDef.cont.applyTransformer(sin_src, f), iDef.cont.applyTransformer(cos_src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(cos_resOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_SINCOS_PS (cos_res, a, cos_resOffset) =>
      _mm512_sincos_ps(iDef.cont.applyTransformer(cos_res, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(cos_resOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_SINCOS_PS (cos_res, sin_src, cos_src, k, a, cos_resOffset) =>
      _mm512_mask_sincos_ps(iDef.cont.applyTransformer(cos_res, f), iDef.cont.applyTransformer(sin_src, f), iDef.cont.applyTransformer(cos_src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(cos_resOffset, f))(iDef.integralType, iDef.cont)

    case Reflect(MM512_POW_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_POW_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_POW_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_POW_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_POW_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_POW_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_POW_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_POW_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RECIP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RECIP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RECIP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RECIP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RECIP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RECIP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RECIP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RECIP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RINT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RINT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RINT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RINT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RINT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RINT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RINT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RINT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SVML_ROUND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SVML_ROUND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SVML_ROUND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SVML_ROUND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SIN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SIN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SIN_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SIN_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SIN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_SIN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SIN_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SIN_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SINH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SINH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SINH_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SINH_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SINH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_SINH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SINH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SINH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SIND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SIND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SIND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SIND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SIND_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_SIND_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SIND_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SIND_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TAN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_TAN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TAN_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TAN_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TAN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_TAN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TAN_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TAN_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TAND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_TAND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TAND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TAND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TAND_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_TAND_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TAND_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TAND_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TANH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_TANH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TANH_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TANH_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TANH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_TANH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TANH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TANH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TRUNC_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_TRUNC_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TRUNC_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TRUNC_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TRUNC_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_TRUNC_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TRUNC_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TRUNC_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REM_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REM_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SINCOS_PD (cos_res, a, cos_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SINCOS_PD (iDef.cont.applyTransformer(cos_res, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(cos_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SINCOS_PD (cos_res, sin_src, cos_src, k, a, cos_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SINCOS_PD (iDef.cont.applyTransformer(cos_res, f), iDef.cont.applyTransformer(sin_src, f), iDef.cont.applyTransformer(cos_src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(cos_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SINCOS_PS (cos_res, a, cos_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SINCOS_PS (iDef.cont.applyTransformer(cos_res, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(cos_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SINCOS_PS (cos_res, sin_src, cos_src, k, a, cos_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SINCOS_PS (iDef.cont.applyTransformer(cos_res, f), iDef.cont.applyTransformer(sin_src, f), iDef.cont.applyTransformer(cos_src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(cos_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenSVML02 extends CGenIntrinsics {

  val IR: SVML
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_POW_PD(a, b) =>
      emitValDef(sym, s"_mm512_pow_pd(${quote(a)}, ${quote(b)})")
    case MM512_MASK_POW_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_pow_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_POW_PS(a, b) =>
      emitValDef(sym, s"_mm512_pow_ps(${quote(a)}, ${quote(b)})")
    case MM512_MASK_POW_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_pow_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_RECIP_PD(a) =>
      emitValDef(sym, s"_mm512_recip_pd(${quote(a)})")
    case MM512_MASK_RECIP_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_recip_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_RECIP_PS(a) =>
      emitValDef(sym, s"_mm512_recip_ps(${quote(a)})")
    case MM512_MASK_RECIP_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_recip_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_RINT_PD(a) =>
      emitValDef(sym, s"_mm512_rint_pd(${quote(a)})")
    case MM512_MASK_RINT_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rint_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_RINT_PS(a) =>
      emitValDef(sym, s"_mm512_rint_ps(${quote(a)})")
    case MM512_MASK_RINT_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rint_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_SVML_ROUND_PD(a) =>
      emitValDef(sym, s"_mm512_svml_round_pd(${quote(a)})")
    case MM512_MASK_SVML_ROUND_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_svml_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_SIN_PD(a) =>
      emitValDef(sym, s"_mm512_sin_pd(${quote(a)})")
    case MM512_MASK_SIN_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_sin_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_SIN_PS(a) =>
      emitValDef(sym, s"_mm512_sin_ps(${quote(a)})")
    case MM512_MASK_SIN_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_sin_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_SINH_PD(a) =>
      emitValDef(sym, s"_mm512_sinh_pd(${quote(a)})")
    case MM512_MASK_SINH_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_sinh_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_SINH_PS(a) =>
      emitValDef(sym, s"_mm512_sinh_ps(${quote(a)})")
    case MM512_MASK_SINH_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_sinh_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_SIND_PD(a) =>
      emitValDef(sym, s"_mm512_sind_pd(${quote(a)})")
    case MM512_MASK_SIND_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_sind_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_SIND_PS(a) =>
      emitValDef(sym, s"_mm512_sind_ps(${quote(a)})")
    case MM512_MASK_SIND_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_sind_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_TAN_PD(a) =>
      emitValDef(sym, s"_mm512_tan_pd(${quote(a)})")
    case MM512_MASK_TAN_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_tan_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_TAN_PS(a) =>
      emitValDef(sym, s"_mm512_tan_ps(${quote(a)})")
    case MM512_MASK_TAN_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_tan_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_TAND_PD(a) =>
      emitValDef(sym, s"_mm512_tand_pd(${quote(a)})")
    case MM512_MASK_TAND_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_tand_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_TAND_PS(a) =>
      emitValDef(sym, s"_mm512_tand_ps(${quote(a)})")
    case MM512_MASK_TAND_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_tand_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_TANH_PD(a) =>
      emitValDef(sym, s"_mm512_tanh_pd(${quote(a)})")
    case MM512_MASK_TANH_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_tanh_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_TANH_PS(a) =>
      emitValDef(sym, s"_mm512_tanh_ps(${quote(a)})")
    case MM512_MASK_TANH_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_tanh_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_TRUNC_PD(a) =>
      emitValDef(sym, s"_mm512_trunc_pd(${quote(a)})")
    case MM512_MASK_TRUNC_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_trunc_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_TRUNC_PS(a) =>
      emitValDef(sym, s"_mm512_trunc_ps(${quote(a)})")
    case MM512_MASK_TRUNC_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_trunc_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_DIV_EPU32(a, b) =>
      emitValDef(sym, s"_mm512_div_epu32(${quote(a)}, ${quote(b)})")
    case MM512_MASK_DIV_EPU32(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_div_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_DIV_EPU8(a, b) =>
      emitValDef(sym, s"_mm512_div_epu8(${quote(a)}, ${quote(b)})")
    case MM512_DIV_EPU16(a, b) =>
      emitValDef(sym, s"_mm512_div_epu16(${quote(a)}, ${quote(b)})")
    case MM512_DIV_EPU64(a, b) =>
      emitValDef(sym, s"_mm512_div_epu64(${quote(a)}, ${quote(b)})")
    case MM512_REM_EPU32(a, b) =>
      emitValDef(sym, s"_mm512_rem_epu32(${quote(a)}, ${quote(b)})")
    case MM512_MASK_REM_EPU32(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_rem_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_REM_EPU8(a, b) =>
      emitValDef(sym, s"_mm512_rem_epu8(${quote(a)}, ${quote(b)})")
    case MM512_REM_EPU16(a, b) =>
      emitValDef(sym, s"_mm512_rem_epu16(${quote(a)}, ${quote(b)})")
    case MM512_REM_EPU64(a, b) =>
      emitValDef(sym, s"_mm512_rem_epu64(${quote(a)}, ${quote(b)})")
    case MM512_SINCOS_PD(cos_res, a, cos_resOffset) =>
      emitValDef(sym, s"_mm512_sincos_pd(${quote(cos_res) + (if(cos_resOffset == Const(0)) "" else " + " + quote(cos_resOffset))}, ${quote(a)})")
    case MM512_MASK_SINCOS_PD(cos_res, sin_src, cos_src, k, a, cos_resOffset) =>
      emitValDef(sym, s"_mm512_mask_sincos_pd(${quote(cos_res) + (if(cos_resOffset == Const(0)) "" else " + " + quote(cos_resOffset))}, ${quote(sin_src)}, ${quote(cos_src)}, ${quote(k)}, ${quote(a)})")
    case MM512_SINCOS_PS(cos_res, a, cos_resOffset) =>
      emitValDef(sym, s"_mm512_sincos_ps(${quote(cos_res) + (if(cos_resOffset == Const(0)) "" else " + " + quote(cos_resOffset))}, ${quote(a)})")
    case MM512_MASK_SINCOS_PS(cos_res, sin_src, cos_src, k, a, cos_resOffset) =>
      emitValDef(sym, s"_mm512_mask_sincos_ps(${quote(cos_res) + (if(cos_resOffset == Const(0)) "" else " + " + quote(cos_resOffset))}, ${quote(sin_src)}, ${quote(cos_src)}, ${quote(k)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
