package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX51202 extends IntrinsicsBase {
  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FMSUBADD_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FNMADD_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). [round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FNMADD_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FNMADD_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). [round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FNMADD_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst", and copy the upper element
   * from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_FNMADD_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FNMADD_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FNMADD_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASK_FNMADD_ROUND_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FNMADD_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASKZ_FNMADD_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FNMADD_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst", and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_FNMADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FNMADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FNMADD_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * a: __m128, k: __mmask8, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASK_FNMADD_ROUND_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FNMADD_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASKZ_FNMADD_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FNMADD_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FNMSUB_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set). [round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FNMSUB_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FNMSUB_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FNMSUB_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_FNMSUB_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "c" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FNMSUB_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "c" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FNMSUB_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "c" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASK_FNMSUB_ROUND_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "c" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FNMSUB_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASKZ_FNMSUB_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FNMSUB_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", subtract the lower element in "c" from the negated intermediate
   * result, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_FNMSUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", subtract the lower element in "c" from the negated intermediate
   * result, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst" using writemask "k" (elements
   * are copied from "c" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FNMSUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst" using writemask "k" (elements
   * are copied from "c" when the corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FNMSUB_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "c" when mask bit 0 is not set), and copy the
   * upper 3 packed elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, k: __mmask8, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASK_FNMSUB_ROUND_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "c" when mask bit 0 is not set), and copy the
   * upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FNMSUB_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using zeromask "k" (the
   * element is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASKZ_FNMSUB_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using zeromask "k" (the
   * element is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FNMSUB_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * vindex: __m256i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I32GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m512d, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I32GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I64GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m512d, k: __mmask8, vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I64GATHER_PS[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m256, k: __mmask8, vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each element.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_GETEXP_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_GETEXP_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each element.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_GETEXP_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * 	[round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_GETEXP_ROUND_PS(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst", and copy the upper element from "a" to the upper element of "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_GETEXP_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst", and copy the upper element from "a" to the upper element of "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for the lower element.
   * a: __m128d, b: __m128d
   */
  case class MM_GETEXP_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using writemask "k" (the element is copied from "src" when mask bit 0 is
   * not set), and copy the upper element from "a" to the upper element of "dst".
   * This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_GETEXP_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using writemask "k" (the element is copied from "src" when mask bit 0 is
   * not set), and copy the upper element from "a" to the upper element of "dst".
   * This intrinsic essentially calculates "floor(log2(x))" for the lower element.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_GETEXP_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_GETEXP_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for the lower element.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_GETEXP_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst", and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_GETEXP_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst", and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * a: __m128, b: __m128
   */
  case class MM_GETEXP_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using writemask "k" (the element is copied from "src" when mask bit 0 is
   * not set), and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_GETEXP_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using writemask "k" (the element is copied from "src" when mask bit 0 is
   * not set), and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_GETEXP_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_GETEXP_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_GETEXP_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m512d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM512_MASKZ_GETMANT_PD(k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * k: __mmask8, a: __m512d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM512_MASKZ_GETMANT_ROUND_PD(k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask16, a: __m512, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM512_MASKZ_GETMANT_PS(k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * k: __mmask16, a: __m512, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM512_MASKZ_GETMANT_ROUND_PS(k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst", and copy the
   * upper element from "b" to the upper element of "dst". This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_GETMANT_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst", and copy the
   * upper element from "b" to the upper element of "dst". This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_GETMANT_SD(a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper element from "b" to the upper element of "dst". This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_MASK_GETMANT_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper element from "b" to the upper element of "dst". This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASK_GETMANT_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "b" to the upper element of "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * k: __mmask8, a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_MASKZ_GETMANT_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "b" to the upper element of "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASKZ_GETMANT_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst", and copy the
   * upper 3 packed elements from "b" to the upper elements of "dst". This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note][round_note]
   * a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_GETMANT_ROUND_SS(a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst", and copy the
   * upper 3 packed elements from "b" to the upper elements of "dst". This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_GETMANT_SS(a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of "dst". This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note][round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_MASK_GETMANT_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of "dst". This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASK_GETMANT_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * 3 packed elements from "b" to the upper elements of "dst". This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * k: __mmask8, a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_MASKZ_GETMANT_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * 3 packed elements from "b" to the upper elements of "dst". This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASKZ_GETMANT_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m512, b: __m128, imm8: int
   */
  case class MM512_INSERTF32X4(a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m128, imm8: int
   */
  case class MM512_MASK_INSERTF32X4(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m128, imm8: int
   */
  case class MM512_MASKZ_INSERTF32X4(k: Exp[Int], a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 256 bits (composed of 4 packed double-precision
   * (64-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m512d, b: __m256d, imm8: int
   */
  case class MM512_INSERTF64X4(a: Exp[__m512d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 4 packed double-precision
   * (64-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m256d, imm8: int
   */
  case class MM512_MASK_INSERTF64X4(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 4 packed double-precision
   * (64-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m256d, imm8: int
   */
  case class MM512_MASKZ_INSERTF64X4(k: Exp[Int], a: Exp[__m512d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m512i, b: __m128i, imm8: int
   */
  case class MM512_INSERTI32X4(a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m128i, imm8: int
   */
  case class MM512_MASK_INSERTI32X4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512i, b: __m128i, imm8: int
   */
  case class MM512_MASKZ_INSERTI32X4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 256 bits (composed of 4 packed 64-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_INSERTI64X4(a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 4 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_MASK_INSERTI64X4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 4 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_MASKZ_INSERTI64X4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_MAX_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).  
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MASK_MAX_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_MAX_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set). 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MASKZ_MAX_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_MAX_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst". 
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MAX_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_MAX_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).  
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512, k: __mmask16, a: __m512, b: __m512, sae: int
   */
  case class MM512_MASK_MAX_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_MAX_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set). 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask16, a: __m512, b: __m512, sae: int
   */
  case class MM512_MASKZ_MAX_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_MAX_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst". 
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m512, b: __m512, sae: int
   */
  case class MM512_MAX_ROUND_PS(a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, sae: int
   */
  case class MM_MASK_MAX_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_MAX_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * k: __mmask8, a: __m128d, b: __m128d, sae: int
   */
  case class MM_MASKZ_MAX_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MAX_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m128d, b: __m128d, sae: int
   */
  case class MM_MAX_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * src: __m128, k: __mmask8, a: __m128, b: __m128, sae: int
   */
  case class MM_MASK_MAX_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_MAX_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * k: __mmask8, a: __m128, b: __m128, sae: int
   */
  case class MM_MASKZ_MAX_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MAX_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m128, b: __m128, sae: int
   */
  case class MM_MAX_ROUND_SS(a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_MIN_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).  
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MASK_MIN_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_MIN_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set). 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MASKZ_MIN_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_MIN_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst". 
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MIN_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_MIN_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).  
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512, k: __mmask16, a: __m512, b: __m512, sae: int
   */
  case class MM512_MASK_MIN_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_MIN_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set). 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask16, a: __m512, b: __m512, sae: int
   */
  case class MM512_MASKZ_MIN_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_MIN_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst". 
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m512, b: __m512, sae: int
   */
  case class MM512_MIN_ROUND_PS(a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, sae: int
   */
  case class MM_MASK_MIN_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_MIN_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * k: __mmask8, a: __m128d, b: __m128d, sae: int
   */
  case class MM_MASKZ_MIN_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MIN_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" , and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * a: __m128d, b: __m128d, sae: int
   */
  case class MM_MIN_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * src: __m128, k: __mmask8, a: __m128, b: __m128, sae: int
   */
  case class MM_MASK_MIN_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_MIN_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * k: __mmask8, a: __m128, b: __m128, sae: int
   */
  case class MM_MASKZ_MIN_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MIN_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m128, b: __m128, sae: int
   */
  case class MM_MIN_ROUND_SS(a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 64-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOAD_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_MOV_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 64-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOAD_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_MOV_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_MOVEDUP_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_MOVEDUP_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_MOVEDUP_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOAD_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 32-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_MOV_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOAD_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 64-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_MOV_EPI64(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits of integer data from memory into "dst".
   * 	"mem_addr" does not
   * need to be aligned on any particular boundary.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_LOADU_SI512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m512i, k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOADU_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 32-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask16, a: __m512i, mem_addrOffset: int
   */
  case class MM512_MASK_STOREU_EPI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOADU_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits of integer data from "a" into memory.
   * 	"mem_addr" does not need
   * to be aligned on any particular boundary.
   * mem_addr: void*, a: __m512i, mem_addrOffset: int
   */
  case class MM512_STOREU_SI512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m512i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOADU_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 64-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m512i, mem_addrOffset: int
   */
  case class MM512_MASK_STOREU_EPI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOADU_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
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
   * Store 512-bits of integer data from "a" into memory using a non-temporal
   * memory hint. 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: void*, a: __m512i, mem_addrOffset: int
   */
  case class MM512_STREAM_SI512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 8 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory using a non-temporal memory hint. 
   * 	"mem_addr"
   * must be aligned on a 64-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: void*, a: __m512d, mem_addrOffset: int
   */
  case class MM512_STREAM_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 16 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory using a non-temporal memory hint. 
   * 	"mem_addr"
   * must be aligned on a 64-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: void*, a: __m512, mem_addrOffset: int
   */
  case class MM512_STREAM_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into the
   * lower element of "dst" using writemask "k" (the element is copied from "src"
   * when mask bit 0 is not set), and set the upper element of "dst" to zero.
   * "mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * src: __m128d, k: __mmask8, mem_addr: const double*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_SD[A[_], U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move the lower double-precision (64-bit) floating-point element from "b" to
   * the lower element of "dst" using writemask "k" (the element is copied from
   * "src" when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_MOVE_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: double*, k: __mmask8, a: __m128d, mem_addrOffset: int
   */
  case class MM_MASK_STORE_SD[A[_], U:Integral](mem_addr: Exp[A[Double]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and set the upper element of "dst" to zero. "mem_addr" must
   * be aligned on a 16-byte boundary or a general-protection exception may be
   * generated.
   * k: __mmask8, mem_addr: const double*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_SD[A[_], U:Integral](k: Exp[Int], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move the lower double-precision (64-bit) floating-point element from "b" to
   * the lower element of "dst" using zeromask "k" (the element is zeroed out when
   * mask bit 0 is not set), and copy the upper element from "a" to the upper
   * element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MOVE_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_MOVEHDUP_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_MOVEHDUP_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_MOVEHDUP_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_MOVELDUP_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_MOVELDUP_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_MOVELDUP_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load a single-precision (32-bit) floating-point element from memory into the
   * lower element of "dst" using writemask "k" (the element is copied from "src"
   * when mask bit 0 is not set), and set the upper elements of "dst" to zero.
   * "mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * src: __m128, k: __mmask8, mem_addr: const float*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_SS[A[_], U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move the lower single-precision (32-bit) floating-point element from "b" to
   * the lower element of "dst" using writemask "k" (the element is copied from
   * "src" when mask bit 0 is not set), and copy the upper 3 packed elements from
   * "a" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_MOVE_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store the lower single-precision (32-bit) floating-point element from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: float*, k: __mmask8, a: __m128, mem_addrOffset: int
   */
  case class MM_MASK_STORE_SS[A[_], U:Integral](mem_addr: Exp[A[Float]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load a single-precision (32-bit) floating-point element from memory into the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and set the upper elements of "dst" to zero. "mem_addr"
   * must be aligned on a 16-byte boundary or a general-protection exception may be
   * generated.
   * k: __mmask8, mem_addr: const float*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_SS[A[_], U:Integral](k: Exp[Int], mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move the lower single-precision (32-bit) floating-point element from "b" to
   * the lower element of "dst" using zeromask "k" (the element is zeroed out when
   * mask bit 0 is not set), and copy the upper 3 packed elements from "a" to the
   * upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MOVE_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits (composed of 8 packed double-precision (64-bit) floating-point
   * elements) from memory into "dst". 
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_LOADU_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memoy into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * src: __m512d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOADU_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m512d, mem_addrOffset: int
   */
  case class MM512_MASK_STOREU_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memoy into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	"mem_addr" does not need to be aligned on any particular
   * boundary.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 8 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory. 
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: void*, a: __m512d, mem_addrOffset: int
   */
  case class MM512_STOREU_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_maskz_fmsubadd_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FMSUBADD_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm512_maskz_fnmadd_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FNMADD_PD(k, a, b, c)
  }
            
  def _mm512_maskz_fnmadd_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FNMADD_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm512_maskz_fnmadd_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FNMADD_PS(k, a, b, c)
  }
            
  def _mm512_maskz_fnmadd_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FNMADD_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm_fnmadd_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FNMADD_ROUND_SD(a, b, c, rounding)
  }
            
  def _mm_mask3_fnmadd_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMADD_ROUND_SD(a, b, c, k, rounding)
  }
            
  def _mm_mask3_fnmadd_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMADD_SD(a, b, c, k)
  }
            
  def _mm_mask_fnmadd_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FNMADD_ROUND_SD(a, k, b, c, rounding)
  }
            
  def _mm_mask_fnmadd_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FNMADD_SD(a, k, b, c)
  }
            
  def _mm_maskz_fnmadd_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FNMADD_ROUND_SD(k, a, b, c, rounding)
  }
            
  def _mm_maskz_fnmadd_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FNMADD_SD(k, a, b, c)
  }
            
  def _mm_fnmadd_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_FNMADD_ROUND_SS(a, b, c, rounding)
  }
            
  def _mm_mask3_fnmadd_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMADD_ROUND_SS(a, b, c, k, rounding)
  }
            
  def _mm_mask3_fnmadd_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMADD_SS(a, b, c, k)
  }
            
  def _mm_mask_fnmadd_round_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_FNMADD_ROUND_SS(a, k, b, c, rounding)
  }
            
  def _mm_mask_fnmadd_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FNMADD_SS(a, k, b, c)
  }
            
  def _mm_maskz_fnmadd_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FNMADD_ROUND_SS(k, a, b, c, rounding)
  }
            
  def _mm_maskz_fnmadd_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FNMADD_SS(k, a, b, c)
  }
            
  def _mm512_maskz_fnmsub_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FNMSUB_PD(k, a, b, c)
  }
            
  def _mm512_maskz_fnmsub_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FNMSUB_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm512_maskz_fnmsub_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FNMSUB_PS(k, a, b, c)
  }
            
  def _mm512_maskz_fnmsub_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FNMSUB_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm_fnmsub_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FNMSUB_ROUND_SD(a, b, c, rounding)
  }
            
  def _mm_mask3_fnmsub_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMSUB_ROUND_SD(a, b, c, k, rounding)
  }
            
  def _mm_mask3_fnmsub_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMSUB_SD(a, b, c, k)
  }
            
  def _mm_mask_fnmsub_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FNMSUB_ROUND_SD(a, k, b, c, rounding)
  }
            
  def _mm_mask_fnmsub_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FNMSUB_SD(a, k, b, c)
  }
            
  def _mm_maskz_fnmsub_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FNMSUB_ROUND_SD(k, a, b, c, rounding)
  }
            
  def _mm_maskz_fnmsub_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FNMSUB_SD(k, a, b, c)
  }
            
  def _mm_fnmsub_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_FNMSUB_ROUND_SS(a, b, c, rounding)
  }
            
  def _mm_mask3_fnmsub_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMSUB_ROUND_SS(a, b, c, k, rounding)
  }
            
  def _mm_mask3_fnmsub_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMSUB_SS(a, b, c, k)
  }
            
  def _mm_mask_fnmsub_round_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_FNMSUB_ROUND_SS(a, k, b, c, rounding)
  }
            
  def _mm_mask_fnmsub_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FNMSUB_SS(a, k, b, c)
  }
            
  def _mm_maskz_fnmsub_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FNMSUB_ROUND_SS(k, a, b, c, rounding)
  }
            
  def _mm_maskz_fnmsub_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FNMSUB_SS(k, a, b, c)
  }
            
  def _mm512_i32gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(base_addr)(MM512_I32GATHER_PD(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i32gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(base_addr)(MM512_MASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(base_addr)(MM512_I64GATHER_PD(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(base_addr)(MM512_MASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64gather_ps[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(base_addr)(MM512_I64GATHER_PS(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(base_addr)(MM512_MASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_getexp_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_GETEXP_PD(k, a)
  }
            
  def _mm512_maskz_getexp_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_GETEXP_ROUND_PD(k, a, rounding)
  }
            
  def _mm512_maskz_getexp_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_GETEXP_PS(k, a)
  }
            
  def _mm512_maskz_getexp_round_ps(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_GETEXP_ROUND_PS(k, a, rounding)
  }
            
  def _mm_getexp_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_GETEXP_ROUND_SD(a, b, rounding)
  }
            
  def _mm_getexp_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_GETEXP_SD(a, b)
  }
            
  def _mm_mask_getexp_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_GETEXP_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_mask_getexp_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_GETEXP_SD(src, k, a, b)
  }
            
  def _mm_maskz_getexp_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_GETEXP_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_getexp_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_GETEXP_SD(k, a, b)
  }
            
  def _mm_getexp_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_GETEXP_ROUND_SS(a, b, rounding)
  }
            
  def _mm_getexp_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_GETEXP_SS(a, b)
  }
            
  def _mm_mask_getexp_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_GETEXP_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_mask_getexp_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_GETEXP_SS(src, k, a, b)
  }
            
  def _mm_maskz_getexp_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_GETEXP_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_getexp_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_GETEXP_SS(k, a, b)
  }
            
  def _mm512_maskz_getmant_pd(k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_GETMANT_PD(k, a, interv, sc)
  }
            
  def _mm512_maskz_getmant_round_pd(k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_GETMANT_ROUND_PD(k, a, interv, sc, rounding)
  }
            
  def _mm512_maskz_getmant_ps(k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_GETMANT_PS(k, a, interv, sc)
  }
            
  def _mm512_maskz_getmant_round_ps(k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_GETMANT_ROUND_PS(k, a, interv, sc, rounding)
  }
            
  def _mm_getmant_round_sd(a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_GETMANT_ROUND_SD(a, b, interv, sc, rounding)
  }
            
  def _mm_getmant_sd(a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_GETMANT_SD(a, b, interv, sc)
  }
            
  def _mm_mask_getmant_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_GETMANT_ROUND_SD(src, k, a, b, interv, sc, rounding)
  }
            
  def _mm_mask_getmant_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_MASK_GETMANT_SD(src, k, a, b, interv, sc)
  }
            
  def _mm_maskz_getmant_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_GETMANT_ROUND_SD(k, a, b, interv, sc, rounding)
  }
            
  def _mm_maskz_getmant_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_GETMANT_SD(k, a, b, interv, sc)
  }
            
  def _mm_getmant_round_ss(a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_GETMANT_ROUND_SS(a, b, interv, sc, rounding)
  }
            
  def _mm_getmant_ss(a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_GETMANT_SS(a, b, interv, sc)
  }
            
  def _mm_mask_getmant_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_GETMANT_ROUND_SS(src, k, a, b, interv, sc, rounding)
  }
            
  def _mm_mask_getmant_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_MASK_GETMANT_SS(src, k, a, b, interv, sc)
  }
            
  def _mm_maskz_getmant_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_GETMANT_ROUND_SS(k, a, b, interv, sc, rounding)
  }
            
  def _mm_maskz_getmant_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_GETMANT_SS(k, a, b, interv, sc)
  }
            
  def _mm512_insertf32x4(a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]): Exp[__m512] = {
    MM512_INSERTF32X4(a, b, imm8)
  }
            
  def _mm512_mask_insertf32x4(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_INSERTF32X4(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_insertf32x4(k: Exp[Int], a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_INSERTF32X4(k, a, b, imm8)
  }
            
  def _mm512_insertf64x4(a: Exp[__m512d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_INSERTF64X4(a, b, imm8)
  }
            
  def _mm512_mask_insertf64x4(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_INSERTF64X4(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_insertf64x4(k: Exp[Int], a: Exp[__m512d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_INSERTF64X4(k, a, b, imm8)
  }
            
  def _mm512_inserti32x4(a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_INSERTI32X4(a, b, imm8)
  }
            
  def _mm512_mask_inserti32x4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_INSERTI32X4(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_inserti32x4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_INSERTI32X4(k, a, b, imm8)
  }
            
  def _mm512_inserti64x4(a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_INSERTI64X4(a, b, imm8)
  }
            
  def _mm512_mask_inserti64x4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_INSERTI64X4(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_inserti64x4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_INSERTI64X4(k, a, b, imm8)
  }
            
  def _mm512_mask_max_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_MAX_PD(src, k, a, b)
  }
            
  def _mm512_mask_max_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_MAX_ROUND_PD(src, k, a, b, sae)
  }
            
  def _mm512_maskz_max_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_MAX_PD(k, a, b)
  }
            
  def _mm512_maskz_max_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_MAX_ROUND_PD(k, a, b, sae)
  }
            
  def _mm512_max_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MAX_PD(a, b)
  }
            
  def _mm512_max_round_pd(a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MAX_ROUND_PD(a, b, sae)
  }
            
  def _mm512_mask_max_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MAX_PS(src, k, a, b)
  }
            
  def _mm512_mask_max_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASK_MAX_ROUND_PS(src, k, a, b, sae)
  }
            
  def _mm512_maskz_max_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_MAX_PS(k, a, b)
  }
            
  def _mm512_maskz_max_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_MAX_ROUND_PS(k, a, b, sae)
  }
            
  def _mm512_max_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MAX_PS(a, b)
  }
            
  def _mm512_max_round_ps(a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MAX_ROUND_PS(a, b, sae)
  }
            
  def _mm_mask_max_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MASK_MAX_ROUND_SD(src, k, a, b, sae)
  }
            
  def _mm_mask_max_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MAX_SD(src, k, a, b)
  }
            
  def _mm_maskz_max_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_MAX_ROUND_SD(k, a, b, sae)
  }
            
  def _mm_maskz_max_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MAX_SD(k, a, b)
  }
            
  def _mm_max_round_sd(a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MAX_ROUND_SD(a, b, sae)
  }
            
  def _mm_mask_max_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MASK_MAX_ROUND_SS(src, k, a, b, sae)
  }
            
  def _mm_mask_max_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MAX_SS(src, k, a, b)
  }
            
  def _mm_maskz_max_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_MAX_ROUND_SS(k, a, b, sae)
  }
            
  def _mm_maskz_max_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MAX_SS(k, a, b)
  }
            
  def _mm_max_round_ss(a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MAX_ROUND_SS(a, b, sae)
  }
            
  def _mm512_mask_min_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_MIN_PD(src, k, a, b)
  }
            
  def _mm512_mask_min_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_MIN_ROUND_PD(src, k, a, b, sae)
  }
            
  def _mm512_maskz_min_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_MIN_PD(k, a, b)
  }
            
  def _mm512_maskz_min_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_MIN_ROUND_PD(k, a, b, sae)
  }
            
  def _mm512_min_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MIN_PD(a, b)
  }
            
  def _mm512_min_round_pd(a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MIN_ROUND_PD(a, b, sae)
  }
            
  def _mm512_mask_min_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MIN_PS(src, k, a, b)
  }
            
  def _mm512_mask_min_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASK_MIN_ROUND_PS(src, k, a, b, sae)
  }
            
  def _mm512_maskz_min_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_MIN_PS(k, a, b)
  }
            
  def _mm512_maskz_min_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_MIN_ROUND_PS(k, a, b, sae)
  }
            
  def _mm512_min_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MIN_PS(a, b)
  }
            
  def _mm512_min_round_ps(a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MIN_ROUND_PS(a, b, sae)
  }
            
  def _mm_mask_min_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MASK_MIN_ROUND_SD(src, k, a, b, sae)
  }
            
  def _mm_mask_min_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MIN_SD(src, k, a, b)
  }
            
  def _mm_maskz_min_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_MIN_ROUND_SD(k, a, b, sae)
  }
            
  def _mm_maskz_min_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MIN_SD(k, a, b)
  }
            
  def _mm_min_round_sd(a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MIN_ROUND_SD(a, b, sae)
  }
            
  def _mm_mask_min_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MASK_MIN_ROUND_SS(src, k, a, b, sae)
  }
            
  def _mm_mask_min_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MIN_SS(src, k, a, b)
  }
            
  def _mm_maskz_min_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_MIN_ROUND_SS(k, a, b, sae)
  }
            
  def _mm_maskz_min_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MIN_SS(k, a, b)
  }
            
  def _mm_min_round_ss(a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MIN_ROUND_SS(a, b, sae)
  }
            
  def _mm512_maskz_load_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_mov_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_MOV_PD(k, a)
  }
            
  def _mm512_maskz_load_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_mov_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_MOV_PS(k, a)
  }
            
  def _mm512_mask_movedup_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_MOVEDUP_PD(src, k, a)
  }
            
  def _mm512_maskz_movedup_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_MOVEDUP_PD(k, a)
  }
            
  def _mm512_movedup_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MOVEDUP_PD(a)
  }
            
  def _mm512_maskz_load_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOAD_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_mov_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MOV_EPI32(k, a)
  }
            
  def _mm512_maskz_load_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOAD_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_mov_epi64(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MOV_EPI64(k, a)
  }
            
  def _mm512_loadu_si512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_LOADU_SI512(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadu_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOADU_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_storeu_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STOREU_EPI32(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_loadu_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOADU_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_storeu_si512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STOREU_SI512(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadu_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOADU_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_storeu_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STOREU_EPI64(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_loadu_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOADU_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_stream_load_si512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_STREAM_LOAD_SI512(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_stream_si512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STREAM_SI512(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_stream_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STREAM_PD(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_stream_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STREAM_PS(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_load_sd[A[_], U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASK_LOAD_SD(src, k, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_move_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MOVE_SD(src, k, a, b)
  }
            
  def _mm_mask_store_sd[A[_], U:Integral](mem_addr: Exp[A[Double]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_SD(mem_addr, k, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_load_sd[A[_], U:Integral](k: Exp[Int], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_SD(k, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_move_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MOVE_SD(k, a, b)
  }
            
  def _mm512_mask_movehdup_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MOVEHDUP_PS(src, k, a)
  }
            
  def _mm512_maskz_movehdup_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_MOVEHDUP_PS(k, a)
  }
            
  def _mm512_movehdup_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_MOVEHDUP_PS(a)
  }
            
  def _mm512_mask_moveldup_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MOVELDUP_PS(src, k, a)
  }
            
  def _mm512_maskz_moveldup_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_MOVELDUP_PS(k, a)
  }
            
  def _mm512_moveldup_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_MOVELDUP_PS(a)
  }
            
  def _mm_mask_load_ss[A[_], U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASK_LOAD_SS(src, k, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_move_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MOVE_SS(src, k, a, b)
  }
            
  def _mm_mask_store_ss[A[_], U:Integral](mem_addr: Exp[A[Float]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_SS(mem_addr, k, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_load_ss[A[_], U:Integral](k: Exp[Int], mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_SS(k, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_move_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MOVE_SS(k, a, b)
  }
            
  def _mm512_loadu_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_LOADU_PD(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASK_LOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_storeu_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STOREU_PD(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_loadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASKZ_LOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_storeu_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STOREU_PD(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASKZ_FMSUBADD_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fmsubadd_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASKZ_FNMADD_PD (k, a, b, c) =>
      _mm512_maskz_fnmadd_pd(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FNMADD_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fnmadd_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASKZ_FNMADD_PS (k, a, b, c) =>
      _mm512_maskz_fnmadd_ps(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FNMADD_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fnmadd_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM_FNMADD_ROUND_SD (a, b, c, rounding) =>
      _mm_fnmadd_round_sd(f(a), f(b), f(c), f(rounding))
    case MM_MASK3_FNMADD_ROUND_SD (a, b, c, k, rounding) =>
      _mm_mask3_fnmadd_round_sd(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASK3_FNMADD_SD (a, b, c, k) =>
      _mm_mask3_fnmadd_sd(f(a), f(b), f(c), f(k))
    case MM_MASK_FNMADD_ROUND_SD (a, k, b, c, rounding) =>
      _mm_mask_fnmadd_round_sd(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASK_FNMADD_SD (a, k, b, c) =>
      _mm_mask_fnmadd_sd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FNMADD_ROUND_SD (k, a, b, c, rounding) =>
      _mm_maskz_fnmadd_round_sd(f(k), f(a), f(b), f(c), f(rounding))
    case MM_MASKZ_FNMADD_SD (k, a, b, c) =>
      _mm_maskz_fnmadd_sd(f(k), f(a), f(b), f(c))
    case MM_FNMADD_ROUND_SS (a, b, c, rounding) =>
      _mm_fnmadd_round_ss(f(a), f(b), f(c), f(rounding))
    case MM_MASK3_FNMADD_ROUND_SS (a, b, c, k, rounding) =>
      _mm_mask3_fnmadd_round_ss(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASK3_FNMADD_SS (a, b, c, k) =>
      _mm_mask3_fnmadd_ss(f(a), f(b), f(c), f(k))
    case MM_MASK_FNMADD_ROUND_SS (a, k, b, c, rounding) =>
      _mm_mask_fnmadd_round_ss(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASK_FNMADD_SS (a, k, b, c) =>
      _mm_mask_fnmadd_ss(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FNMADD_ROUND_SS (k, a, b, c, rounding) =>
      _mm_maskz_fnmadd_round_ss(f(k), f(a), f(b), f(c), f(rounding))
    case MM_MASKZ_FNMADD_SS (k, a, b, c) =>
      _mm_maskz_fnmadd_ss(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FNMSUB_PD (k, a, b, c) =>
      _mm512_maskz_fnmsub_pd(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FNMSUB_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fnmsub_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASKZ_FNMSUB_PS (k, a, b, c) =>
      _mm512_maskz_fnmsub_ps(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FNMSUB_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fnmsub_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM_FNMSUB_ROUND_SD (a, b, c, rounding) =>
      _mm_fnmsub_round_sd(f(a), f(b), f(c), f(rounding))
    case MM_MASK3_FNMSUB_ROUND_SD (a, b, c, k, rounding) =>
      _mm_mask3_fnmsub_round_sd(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASK3_FNMSUB_SD (a, b, c, k) =>
      _mm_mask3_fnmsub_sd(f(a), f(b), f(c), f(k))
    case MM_MASK_FNMSUB_ROUND_SD (a, k, b, c, rounding) =>
      _mm_mask_fnmsub_round_sd(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASK_FNMSUB_SD (a, k, b, c) =>
      _mm_mask_fnmsub_sd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FNMSUB_ROUND_SD (k, a, b, c, rounding) =>
      _mm_maskz_fnmsub_round_sd(f(k), f(a), f(b), f(c), f(rounding))
    case MM_MASKZ_FNMSUB_SD (k, a, b, c) =>
      _mm_maskz_fnmsub_sd(f(k), f(a), f(b), f(c))
    case MM_FNMSUB_ROUND_SS (a, b, c, rounding) =>
      _mm_fnmsub_round_ss(f(a), f(b), f(c), f(rounding))
    case MM_MASK3_FNMSUB_ROUND_SS (a, b, c, k, rounding) =>
      _mm_mask3_fnmsub_round_ss(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASK3_FNMSUB_SS (a, b, c, k) =>
      _mm_mask3_fnmsub_ss(f(a), f(b), f(c), f(k))
    case MM_MASK_FNMSUB_ROUND_SS (a, k, b, c, rounding) =>
      _mm_mask_fnmsub_round_ss(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASK_FNMSUB_SS (a, k, b, c) =>
      _mm_mask_fnmsub_ss(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FNMSUB_ROUND_SS (k, a, b, c, rounding) =>
      _mm_maskz_fnmsub_round_ss(f(k), f(a), f(b), f(c), f(rounding))
    case MM_MASKZ_FNMSUB_SS (k, a, b, c) =>
      _mm_maskz_fnmsub_ss(f(k), f(a), f(b), f(c))
    case iDef@MM512_I32GATHER_PD (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i32gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i32gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64GATHER_PD (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i64gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i64gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64GATHER_PS (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i64gather_ps(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i64gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_GETEXP_PD (k, a) =>
      _mm512_maskz_getexp_pd(f(k), f(a))
    case MM512_MASKZ_GETEXP_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_getexp_round_pd(f(k), f(a), f(rounding))
    case MM512_MASKZ_GETEXP_PS (k, a) =>
      _mm512_maskz_getexp_ps(f(k), f(a))
    case MM512_MASKZ_GETEXP_ROUND_PS (k, a, rounding) =>
      _mm512_maskz_getexp_round_ps(f(k), f(a), f(rounding))
    case MM_GETEXP_ROUND_SD (a, b, rounding) =>
      _mm_getexp_round_sd(f(a), f(b), f(rounding))
    case MM_GETEXP_SD (a, b) =>
      _mm_getexp_sd(f(a), f(b))
    case MM_MASK_GETEXP_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_getexp_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_GETEXP_SD (src, k, a, b) =>
      _mm_mask_getexp_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_GETEXP_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_getexp_round_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_GETEXP_SD (k, a, b) =>
      _mm_maskz_getexp_sd(f(k), f(a), f(b))
    case MM_GETEXP_ROUND_SS (a, b, rounding) =>
      _mm_getexp_round_ss(f(a), f(b), f(rounding))
    case MM_GETEXP_SS (a, b) =>
      _mm_getexp_ss(f(a), f(b))
    case MM_MASK_GETEXP_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_getexp_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_GETEXP_SS (src, k, a, b) =>
      _mm_mask_getexp_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_GETEXP_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_getexp_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_GETEXP_SS (k, a, b) =>
      _mm_maskz_getexp_ss(f(k), f(a), f(b))
    case MM512_MASKZ_GETMANT_PD (k, a, interv, sc) =>
      _mm512_maskz_getmant_pd(f(k), f(a), f(interv), f(sc))
    case MM512_MASKZ_GETMANT_ROUND_PD (k, a, interv, sc, rounding) =>
      _mm512_maskz_getmant_round_pd(f(k), f(a), f(interv), f(sc), f(rounding))
    case MM512_MASKZ_GETMANT_PS (k, a, interv, sc) =>
      _mm512_maskz_getmant_ps(f(k), f(a), f(interv), f(sc))
    case MM512_MASKZ_GETMANT_ROUND_PS (k, a, interv, sc, rounding) =>
      _mm512_maskz_getmant_round_ps(f(k), f(a), f(interv), f(sc), f(rounding))
    case MM_GETMANT_ROUND_SD (a, b, interv, sc, rounding) =>
      _mm_getmant_round_sd(f(a), f(b), f(interv), f(sc), f(rounding))
    case MM_GETMANT_SD (a, b, interv, sc) =>
      _mm_getmant_sd(f(a), f(b), f(interv), f(sc))
    case MM_MASK_GETMANT_ROUND_SD (src, k, a, b, interv, sc, rounding) =>
      _mm_mask_getmant_round_sd(f(src), f(k), f(a), f(b), f(interv), f(sc), f(rounding))
    case MM_MASK_GETMANT_SD (src, k, a, b, interv, sc) =>
      _mm_mask_getmant_sd(f(src), f(k), f(a), f(b), f(interv), f(sc))
    case MM_MASKZ_GETMANT_ROUND_SD (k, a, b, interv, sc, rounding) =>
      _mm_maskz_getmant_round_sd(f(k), f(a), f(b), f(interv), f(sc), f(rounding))
    case MM_MASKZ_GETMANT_SD (k, a, b, interv, sc) =>
      _mm_maskz_getmant_sd(f(k), f(a), f(b), f(interv), f(sc))
    case MM_GETMANT_ROUND_SS (a, b, interv, sc, rounding) =>
      _mm_getmant_round_ss(f(a), f(b), f(interv), f(sc), f(rounding))
    case MM_GETMANT_SS (a, b, interv, sc) =>
      _mm_getmant_ss(f(a), f(b), f(interv), f(sc))
    case MM_MASK_GETMANT_ROUND_SS (src, k, a, b, interv, sc, rounding) =>
      _mm_mask_getmant_round_ss(f(src), f(k), f(a), f(b), f(interv), f(sc), f(rounding))
    case MM_MASK_GETMANT_SS (src, k, a, b, interv, sc) =>
      _mm_mask_getmant_ss(f(src), f(k), f(a), f(b), f(interv), f(sc))
    case MM_MASKZ_GETMANT_ROUND_SS (k, a, b, interv, sc, rounding) =>
      _mm_maskz_getmant_round_ss(f(k), f(a), f(b), f(interv), f(sc), f(rounding))
    case MM_MASKZ_GETMANT_SS (k, a, b, interv, sc) =>
      _mm_maskz_getmant_ss(f(k), f(a), f(b), f(interv), f(sc))
    case MM512_INSERTF32X4 (a, b, imm8) =>
      _mm512_insertf32x4(f(a), f(b), f(imm8))
    case MM512_MASK_INSERTF32X4 (src, k, a, b, imm8) =>
      _mm512_mask_insertf32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_INSERTF32X4 (k, a, b, imm8) =>
      _mm512_maskz_insertf32x4(f(k), f(a), f(b), f(imm8))
    case MM512_INSERTF64X4 (a, b, imm8) =>
      _mm512_insertf64x4(f(a), f(b), f(imm8))
    case MM512_MASK_INSERTF64X4 (src, k, a, b, imm8) =>
      _mm512_mask_insertf64x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_INSERTF64X4 (k, a, b, imm8) =>
      _mm512_maskz_insertf64x4(f(k), f(a), f(b), f(imm8))
    case MM512_INSERTI32X4 (a, b, imm8) =>
      _mm512_inserti32x4(f(a), f(b), f(imm8))
    case MM512_MASK_INSERTI32X4 (src, k, a, b, imm8) =>
      _mm512_mask_inserti32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_INSERTI32X4 (k, a, b, imm8) =>
      _mm512_maskz_inserti32x4(f(k), f(a), f(b), f(imm8))
    case MM512_INSERTI64X4 (a, b, imm8) =>
      _mm512_inserti64x4(f(a), f(b), f(imm8))
    case MM512_MASK_INSERTI64X4 (src, k, a, b, imm8) =>
      _mm512_mask_inserti64x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_INSERTI64X4 (k, a, b, imm8) =>
      _mm512_maskz_inserti64x4(f(k), f(a), f(b), f(imm8))
    case MM512_MASK_MAX_PD (src, k, a, b) =>
      _mm512_mask_max_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_MAX_ROUND_PD (src, k, a, b, sae) =>
      _mm512_mask_max_round_pd(f(src), f(k), f(a), f(b), f(sae))
    case MM512_MASKZ_MAX_PD (k, a, b) =>
      _mm512_maskz_max_pd(f(k), f(a), f(b))
    case MM512_MASKZ_MAX_ROUND_PD (k, a, b, sae) =>
      _mm512_maskz_max_round_pd(f(k), f(a), f(b), f(sae))
    case MM512_MAX_PD (a, b) =>
      _mm512_max_pd(f(a), f(b))
    case MM512_MAX_ROUND_PD (a, b, sae) =>
      _mm512_max_round_pd(f(a), f(b), f(sae))
    case MM512_MASK_MAX_PS (src, k, a, b) =>
      _mm512_mask_max_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_MAX_ROUND_PS (src, k, a, b, sae) =>
      _mm512_mask_max_round_ps(f(src), f(k), f(a), f(b), f(sae))
    case MM512_MASKZ_MAX_PS (k, a, b) =>
      _mm512_maskz_max_ps(f(k), f(a), f(b))
    case MM512_MASKZ_MAX_ROUND_PS (k, a, b, sae) =>
      _mm512_maskz_max_round_ps(f(k), f(a), f(b), f(sae))
    case MM512_MAX_PS (a, b) =>
      _mm512_max_ps(f(a), f(b))
    case MM512_MAX_ROUND_PS (a, b, sae) =>
      _mm512_max_round_ps(f(a), f(b), f(sae))
    case MM_MASK_MAX_ROUND_SD (src, k, a, b, sae) =>
      _mm_mask_max_round_sd(f(src), f(k), f(a), f(b), f(sae))
    case MM_MASK_MAX_SD (src, k, a, b) =>
      _mm_mask_max_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_ROUND_SD (k, a, b, sae) =>
      _mm_maskz_max_round_sd(f(k), f(a), f(b), f(sae))
    case MM_MASKZ_MAX_SD (k, a, b) =>
      _mm_maskz_max_sd(f(k), f(a), f(b))
    case MM_MAX_ROUND_SD (a, b, sae) =>
      _mm_max_round_sd(f(a), f(b), f(sae))
    case MM_MASK_MAX_ROUND_SS (src, k, a, b, sae) =>
      _mm_mask_max_round_ss(f(src), f(k), f(a), f(b), f(sae))
    case MM_MASK_MAX_SS (src, k, a, b) =>
      _mm_mask_max_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_ROUND_SS (k, a, b, sae) =>
      _mm_maskz_max_round_ss(f(k), f(a), f(b), f(sae))
    case MM_MASKZ_MAX_SS (k, a, b) =>
      _mm_maskz_max_ss(f(k), f(a), f(b))
    case MM_MAX_ROUND_SS (a, b, sae) =>
      _mm_max_round_ss(f(a), f(b), f(sae))
    case MM512_MASK_MIN_PD (src, k, a, b) =>
      _mm512_mask_min_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_MIN_ROUND_PD (src, k, a, b, sae) =>
      _mm512_mask_min_round_pd(f(src), f(k), f(a), f(b), f(sae))
    case MM512_MASKZ_MIN_PD (k, a, b) =>
      _mm512_maskz_min_pd(f(k), f(a), f(b))
    case MM512_MASKZ_MIN_ROUND_PD (k, a, b, sae) =>
      _mm512_maskz_min_round_pd(f(k), f(a), f(b), f(sae))
    case MM512_MIN_PD (a, b) =>
      _mm512_min_pd(f(a), f(b))
    case MM512_MIN_ROUND_PD (a, b, sae) =>
      _mm512_min_round_pd(f(a), f(b), f(sae))
    case MM512_MASK_MIN_PS (src, k, a, b) =>
      _mm512_mask_min_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_MIN_ROUND_PS (src, k, a, b, sae) =>
      _mm512_mask_min_round_ps(f(src), f(k), f(a), f(b), f(sae))
    case MM512_MASKZ_MIN_PS (k, a, b) =>
      _mm512_maskz_min_ps(f(k), f(a), f(b))
    case MM512_MASKZ_MIN_ROUND_PS (k, a, b, sae) =>
      _mm512_maskz_min_round_ps(f(k), f(a), f(b), f(sae))
    case MM512_MIN_PS (a, b) =>
      _mm512_min_ps(f(a), f(b))
    case MM512_MIN_ROUND_PS (a, b, sae) =>
      _mm512_min_round_ps(f(a), f(b), f(sae))
    case MM_MASK_MIN_ROUND_SD (src, k, a, b, sae) =>
      _mm_mask_min_round_sd(f(src), f(k), f(a), f(b), f(sae))
    case MM_MASK_MIN_SD (src, k, a, b) =>
      _mm_mask_min_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_ROUND_SD (k, a, b, sae) =>
      _mm_maskz_min_round_sd(f(k), f(a), f(b), f(sae))
    case MM_MASKZ_MIN_SD (k, a, b) =>
      _mm_maskz_min_sd(f(k), f(a), f(b))
    case MM_MIN_ROUND_SD (a, b, sae) =>
      _mm_min_round_sd(f(a), f(b), f(sae))
    case MM_MASK_MIN_ROUND_SS (src, k, a, b, sae) =>
      _mm_mask_min_round_ss(f(src), f(k), f(a), f(b), f(sae))
    case MM_MASK_MIN_SS (src, k, a, b) =>
      _mm_mask_min_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_ROUND_SS (k, a, b, sae) =>
      _mm_maskz_min_round_ss(f(k), f(a), f(b), f(sae))
    case MM_MASKZ_MIN_SS (k, a, b) =>
      _mm_maskz_min_ss(f(k), f(a), f(b))
    case MM_MIN_ROUND_SS (a, b, sae) =>
      _mm_min_round_ss(f(a), f(b), f(sae))
    case iDef@MM512_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_load_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_MOV_PD (k, a) =>
      _mm512_maskz_mov_pd(f(k), f(a))
    case iDef@MM512_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_load_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_MOV_PS (k, a) =>
      _mm512_maskz_mov_ps(f(k), f(a))
    case MM512_MASK_MOVEDUP_PD (src, k, a) =>
      _mm512_mask_movedup_pd(f(src), f(k), f(a))
    case MM512_MASKZ_MOVEDUP_PD (k, a) =>
      _mm512_maskz_movedup_pd(f(k), f(a))
    case MM512_MOVEDUP_PD (a) =>
      _mm512_movedup_pd(f(a))
    case iDef@MM512_MASKZ_LOAD_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_load_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_MOV_EPI32 (k, a) =>
      _mm512_maskz_mov_epi32(f(k), f(a))
    case iDef@MM512_MASKZ_LOAD_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_load_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_MOV_EPI64 (k, a) =>
      _mm512_maskz_mov_epi64(f(k), f(a))
    case iDef@MM512_LOADU_SI512 (mem_addr, mem_addrOffset) =>
      _mm512_loadu_si512(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADU_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_loadu_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_STOREU_EPI32 (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_storeu_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASKZ_LOADU_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_loadu_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STOREU_SI512 (mem_addr, a, mem_addrOffset) =>
      _mm512_storeu_si512(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADU_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_loadu_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_STOREU_EPI64 (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_storeu_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASKZ_LOADU_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_loadu_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STREAM_LOAD_SI512 (mem_addr, mem_addrOffset) =>
      _mm512_stream_load_si512(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STREAM_SI512 (mem_addr, a, mem_addrOffset) =>
      _mm512_stream_si512(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STREAM_PD (mem_addr, a, mem_addrOffset) =>
      _mm512_stream_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STREAM_PS (mem_addr, a, mem_addrOffset) =>
      _mm512_stream_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_LOAD_SD (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_sd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_MASK_MOVE_SD (src, k, a, b) =>
      _mm_mask_move_sd(f(src), f(k), f(a), f(b))
    case iDef@MM_MASK_STORE_SD (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_sd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_MASKZ_LOAD_SD (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_sd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_MASKZ_MOVE_SD (k, a, b) =>
      _mm_maskz_move_sd(f(k), f(a), f(b))
    case MM512_MASK_MOVEHDUP_PS (src, k, a) =>
      _mm512_mask_movehdup_ps(f(src), f(k), f(a))
    case MM512_MASKZ_MOVEHDUP_PS (k, a) =>
      _mm512_maskz_movehdup_ps(f(k), f(a))
    case MM512_MOVEHDUP_PS (a) =>
      _mm512_movehdup_ps(f(a))
    case MM512_MASK_MOVELDUP_PS (src, k, a) =>
      _mm512_mask_moveldup_ps(f(src), f(k), f(a))
    case MM512_MASKZ_MOVELDUP_PS (k, a) =>
      _mm512_maskz_moveldup_ps(f(k), f(a))
    case MM512_MOVELDUP_PS (a) =>
      _mm512_moveldup_ps(f(a))
    case iDef@MM_MASK_LOAD_SS (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_ss(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_MASK_MOVE_SS (src, k, a, b) =>
      _mm_mask_move_ss(f(src), f(k), f(a), f(b))
    case iDef@MM_MASK_STORE_SS (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_ss(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_MASKZ_LOAD_SS (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_ss(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_MASKZ_MOVE_SS (k, a, b) =>
      _mm_maskz_move_ss(f(k), f(a), f(b))
    case iDef@MM512_LOADU_PD (mem_addr, mem_addrOffset) =>
      _mm512_loadu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_loadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_STOREU_PD (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_storeu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASKZ_LOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_loadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STOREU_PD (mem_addr, a, mem_addrOffset) =>
      _mm512_storeu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)

    case Reflect(MM512_MASKZ_FMSUBADD_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUBADD_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMADD_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMADD_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMADD_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMADD_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMADD_ROUND_SD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FNMADD_ROUND_SD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_ROUND_SD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_ROUND_SD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_SD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_SD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_ROUND_SD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_ROUND_SD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_SD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_SD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_ROUND_SD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_ROUND_SD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_SD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_SD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMADD_ROUND_SS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FNMADD_ROUND_SS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_ROUND_SS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_ROUND_SS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_SS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_SS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_ROUND_SS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_ROUND_SS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_SS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_SS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_ROUND_SS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_ROUND_SS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_SS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_SS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMSUB_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMSUB_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMSUB_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMSUB_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMSUB_ROUND_SD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FNMSUB_ROUND_SD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_ROUND_SD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_ROUND_SD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_SD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_SD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMSUB_ROUND_SD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMSUB_ROUND_SD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMSUB_SD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMSUB_SD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_ROUND_SD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_ROUND_SD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_SD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_SD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMSUB_ROUND_SS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FNMSUB_ROUND_SS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_ROUND_SS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_ROUND_SS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_SS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_SS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMSUB_ROUND_SS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMSUB_ROUND_SS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMSUB_SS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMSUB_SS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_ROUND_SS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_ROUND_SS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_SS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_SS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32GATHER_PD (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_PD (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_PS (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_PS (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETEXP_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETEXP_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETEXP_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETEXP_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETEXP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETEXP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETEXP_ROUND_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETEXP_ROUND_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETMANT_PD (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETMANT_PD (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETMANT_ROUND_PD (k, a, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETMANT_ROUND_PD (f(k), f(a), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETMANT_PS (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETMANT_PS (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETMANT_ROUND_PS (k, a, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETMANT_ROUND_PS (f(k), f(a), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_ROUND_SD (a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_ROUND_SD (f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_SD (a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_SD (f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_ROUND_SD (src, k, a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_ROUND_SD (f(src), f(k), f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_SD (src, k, a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_SD (f(src), f(k), f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_ROUND_SD (k, a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_ROUND_SD (f(k), f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_SD (k, a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_SD (f(k), f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_ROUND_SS (a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_ROUND_SS (f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_SS (a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_SS (f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_ROUND_SS (src, k, a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_ROUND_SS (f(src), f(k), f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_SS (src, k, a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_SS (f(src), f(k), f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_ROUND_SS (k, a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_ROUND_SS (f(k), f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_SS (k, a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_SS (f(k), f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTF32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTF32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTF32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTF32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTF32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTF32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTF64X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTF64X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTF64X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTF64X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTF64X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTF64X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTI32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTI32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTI32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTI32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTI32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTI32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTI64X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTI64X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTI64X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTI64X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTI64X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTI64X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_ROUND_PD (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_ROUND_PD (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_ROUND_PD (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_ROUND_PD (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_ROUND_PD (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_ROUND_PD (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_ROUND_PS (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_ROUND_PS (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_ROUND_PS (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_ROUND_PS (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_ROUND_PS (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_ROUND_PS (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_ROUND_SD (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_ROUND_SD (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_ROUND_SD (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_ROUND_SD (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_ROUND_SD (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MAX_ROUND_SD (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_ROUND_SS (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_ROUND_SS (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_ROUND_SS (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_ROUND_SS (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_ROUND_SS (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MAX_ROUND_SS (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_ROUND_PD (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_ROUND_PD (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_ROUND_PD (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_ROUND_PD (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_ROUND_PD (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_ROUND_PD (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_ROUND_PS (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_ROUND_PS (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_ROUND_PS (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_ROUND_PS (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_ROUND_PS (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_ROUND_PS (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_ROUND_SD (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_ROUND_SD (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_ROUND_SD (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_ROUND_SD (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_ROUND_SD (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MIN_ROUND_SD (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_ROUND_SS (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_ROUND_SS (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_ROUND_SS (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_ROUND_SS (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_ROUND_SS (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MIN_ROUND_SS (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOAD_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOAD_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOVEDUP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOVEDUP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOVEDUP_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOVEDUP_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEDUP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEDUP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOAD_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOAD_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOAD_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOAD_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADU_SI512 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADU_SI512 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADU_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADU_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STOREU_EPI32 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STOREU_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOADU_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOADU_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STOREU_SI512 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STOREU_SI512 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADU_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADU_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STOREU_EPI64 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STOREU_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOADU_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOADU_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STREAM_LOAD_SI512 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STREAM_LOAD_SI512 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STREAM_SI512 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STREAM_SI512 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STREAM_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STREAM_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STREAM_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STREAM_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_SD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_SD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOVE_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOVE_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_SD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_SD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_SD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_SD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOVE_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOVE_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOVEHDUP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOVEHDUP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOVEHDUP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOVEHDUP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEHDUP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEHDUP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOVELDUP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOVELDUP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOVELDUP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOVELDUP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVELDUP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVELDUP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_SS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_SS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOVE_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOVE_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_SS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_SS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_SS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_SS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOVE_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOVE_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADU_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STOREU_PD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STOREU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STOREU_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STOREU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX51202 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_MASKZ_FMSUBADD_ROUND_PS(k, a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_maskz_fmsubadd_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASKZ_FNMADD_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm512_maskz_fnmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASKZ_FNMADD_ROUND_PD(k, a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_maskz_fnmadd_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASKZ_FNMADD_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm512_maskz_fnmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASKZ_FNMADD_ROUND_PS(k, a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_maskz_fnmadd_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_FNMADD_ROUND_SD(a, b, c, rounding) =>
      emitValDef(sym, s"_mm_fnmadd_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASK3_FNMADD_ROUND_SD(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm_mask3_fnmadd_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM_MASK3_FNMADD_SD(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fnmadd_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FNMADD_ROUND_SD(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm_mask_fnmadd_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASK_FNMADD_SD(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fnmadd_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FNMADD_ROUND_SD(k, a, b, c, rounding) =>
      emitValDef(sym, s"_mm_maskz_fnmadd_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASKZ_FNMADD_SD(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fnmadd_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_FNMADD_ROUND_SS(a, b, c, rounding) =>
      emitValDef(sym, s"_mm_fnmadd_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASK3_FNMADD_ROUND_SS(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm_mask3_fnmadd_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM_MASK3_FNMADD_SS(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fnmadd_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FNMADD_ROUND_SS(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm_mask_fnmadd_round_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASK_FNMADD_SS(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fnmadd_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FNMADD_ROUND_SS(k, a, b, c, rounding) =>
      emitValDef(sym, s"_mm_maskz_fnmadd_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASKZ_FNMADD_SS(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fnmadd_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASKZ_FNMSUB_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm512_maskz_fnmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASKZ_FNMSUB_ROUND_PD(k, a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_maskz_fnmsub_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM512_MASKZ_FNMSUB_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm512_maskz_fnmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASKZ_FNMSUB_ROUND_PS(k, a, b, c, rounding) =>
      emitValDef(sym, s"_mm512_maskz_fnmsub_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_FNMSUB_ROUND_SD(a, b, c, rounding) =>
      emitValDef(sym, s"_mm_fnmsub_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASK3_FNMSUB_ROUND_SD(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm_mask3_fnmsub_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM_MASK3_FNMSUB_SD(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fnmsub_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FNMSUB_ROUND_SD(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm_mask_fnmsub_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASK_FNMSUB_SD(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fnmsub_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FNMSUB_ROUND_SD(k, a, b, c, rounding) =>
      emitValDef(sym, s"_mm_maskz_fnmsub_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASKZ_FNMSUB_SD(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fnmsub_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_FNMSUB_ROUND_SS(a, b, c, rounding) =>
      emitValDef(sym, s"_mm_fnmsub_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASK3_FNMSUB_ROUND_SS(a, b, c, k, rounding) =>
      emitValDef(sym, s"_mm_mask3_fnmsub_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case MM_MASK3_FNMSUB_SS(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fnmsub_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FNMSUB_ROUND_SS(a, k, b, c, rounding) =>
      emitValDef(sym, s"_mm_mask_fnmsub_round_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASK_FNMSUB_SS(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fnmsub_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FNMSUB_ROUND_SS(k, a, b, c, rounding) =>
      emitValDef(sym, s"_mm_maskz_fnmsub_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case MM_MASKZ_FNMSUB_SS(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fnmsub_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_I32GATHER_PD(vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm512_i32gather_pd(${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM512_MASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_i32gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM512_I64GATHER_PD(vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm512_i64gather_pd(${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM512_MASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_i64gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM512_I64GATHER_PS(vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm512_i64gather_ps(${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM512_MASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_i64gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM512_MASKZ_GETEXP_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_getexp_pd(${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_GETEXP_ROUND_PD(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_getexp_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_GETEXP_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_getexp_ps(${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_GETEXP_ROUND_PS(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_getexp_round_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM_GETEXP_ROUND_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_getexp_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_GETEXP_SD(a, b) =>
      emitValDef(sym, s"_mm_getexp_sd(${quote(a)}, ${quote(b)})")
    case MM_MASK_GETEXP_ROUND_SD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_getexp_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_GETEXP_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_getexp_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_GETEXP_ROUND_SD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_getexp_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_GETEXP_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_getexp_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_GETEXP_ROUND_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_getexp_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_GETEXP_SS(a, b) =>
      emitValDef(sym, s"_mm_getexp_ss(${quote(a)}, ${quote(b)})")
    case MM_MASK_GETEXP_ROUND_SS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_getexp_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_GETEXP_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_getexp_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_GETEXP_ROUND_SS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_getexp_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_GETEXP_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_getexp_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_GETMANT_PD(k, a, interv, sc) =>
      emitValDef(sym, s"_mm512_maskz_getmant_pd(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM512_MASKZ_GETMANT_ROUND_PD(k, a, interv, sc, rounding) =>
      emitValDef(sym, s"_mm512_maskz_getmant_round_pd(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM512_MASKZ_GETMANT_PS(k, a, interv, sc) =>
      emitValDef(sym, s"_mm512_maskz_getmant_ps(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM512_MASKZ_GETMANT_ROUND_PS(k, a, interv, sc, rounding) =>
      emitValDef(sym, s"_mm512_maskz_getmant_round_ps(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM_GETMANT_ROUND_SD(a, b, interv, sc, rounding) =>
      emitValDef(sym, s"_mm_getmant_round_sd(${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM_GETMANT_SD(a, b, interv, sc) =>
      emitValDef(sym, s"_mm_getmant_sd(${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case MM_MASK_GETMANT_ROUND_SD(src, k, a, b, interv, sc, rounding) =>
      emitValDef(sym, s"_mm_mask_getmant_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM_MASK_GETMANT_SD(src, k, a, b, interv, sc) =>
      emitValDef(sym, s"_mm_mask_getmant_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case MM_MASKZ_GETMANT_ROUND_SD(k, a, b, interv, sc, rounding) =>
      emitValDef(sym, s"_mm_maskz_getmant_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM_MASKZ_GETMANT_SD(k, a, b, interv, sc) =>
      emitValDef(sym, s"_mm_maskz_getmant_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case MM_GETMANT_ROUND_SS(a, b, interv, sc, rounding) =>
      emitValDef(sym, s"_mm_getmant_round_ss(${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM_GETMANT_SS(a, b, interv, sc) =>
      emitValDef(sym, s"_mm_getmant_ss(${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case MM_MASK_GETMANT_ROUND_SS(src, k, a, b, interv, sc, rounding) =>
      emitValDef(sym, s"_mm_mask_getmant_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM_MASK_GETMANT_SS(src, k, a, b, interv, sc) =>
      emitValDef(sym, s"_mm_mask_getmant_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case MM_MASKZ_GETMANT_ROUND_SS(k, a, b, interv, sc, rounding) =>
      emitValDef(sym, s"_mm_maskz_getmant_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case MM_MASKZ_GETMANT_SS(k, a, b, interv, sc) =>
      emitValDef(sym, s"_mm_maskz_getmant_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case MM512_INSERTF32X4(a, b, imm8) =>
      emitValDef(sym, s"_mm512_insertf32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_INSERTF32X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_insertf32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_INSERTF32X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_insertf32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_INSERTF64X4(a, b, imm8) =>
      emitValDef(sym, s"_mm512_insertf64x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_INSERTF64X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_insertf64x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_INSERTF64X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_insertf64x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_INSERTI32X4(a, b, imm8) =>
      emitValDef(sym, s"_mm512_inserti32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_INSERTI32X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_inserti32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_INSERTI32X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_inserti32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_INSERTI64X4(a, b, imm8) =>
      emitValDef(sym, s"_mm512_inserti64x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_INSERTI64X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_inserti64x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_INSERTI64X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_inserti64x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_MAX_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_max_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MAX_ROUND_PD(src, k, a, b, sae) =>
      emitValDef(sym, s"_mm512_mask_max_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MASKZ_MAX_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_max_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MAX_ROUND_PD(k, a, b, sae) =>
      emitValDef(sym, s"_mm512_maskz_max_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MAX_PD(a, b) =>
      emitValDef(sym, s"_mm512_max_pd(${quote(a)}, ${quote(b)})")
    case MM512_MAX_ROUND_PD(a, b, sae) =>
      emitValDef(sym, s"_mm512_max_round_pd(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MASK_MAX_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_max_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MAX_ROUND_PS(src, k, a, b, sae) =>
      emitValDef(sym, s"_mm512_mask_max_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MASKZ_MAX_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_max_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MAX_ROUND_PS(k, a, b, sae) =>
      emitValDef(sym, s"_mm512_maskz_max_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MAX_PS(a, b) =>
      emitValDef(sym, s"_mm512_max_ps(${quote(a)}, ${quote(b)})")
    case MM512_MAX_ROUND_PS(a, b, sae) =>
      emitValDef(sym, s"_mm512_max_round_ps(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASK_MAX_ROUND_SD(src, k, a, b, sae) =>
      emitValDef(sym, s"_mm_mask_max_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASK_MAX_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_ROUND_SD(k, a, b, sae) =>
      emitValDef(sym, s"_mm_maskz_max_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASKZ_MAX_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MAX_ROUND_SD(a, b, sae) =>
      emitValDef(sym, s"_mm_max_round_sd(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASK_MAX_ROUND_SS(src, k, a, b, sae) =>
      emitValDef(sym, s"_mm_mask_max_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASK_MAX_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_ROUND_SS(k, a, b, sae) =>
      emitValDef(sym, s"_mm_maskz_max_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASKZ_MAX_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MAX_ROUND_SS(a, b, sae) =>
      emitValDef(sym, s"_mm_max_round_ss(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MASK_MIN_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_min_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MIN_ROUND_PD(src, k, a, b, sae) =>
      emitValDef(sym, s"_mm512_mask_min_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MASKZ_MIN_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_min_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MIN_ROUND_PD(k, a, b, sae) =>
      emitValDef(sym, s"_mm512_maskz_min_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MIN_PD(a, b) =>
      emitValDef(sym, s"_mm512_min_pd(${quote(a)}, ${quote(b)})")
    case MM512_MIN_ROUND_PD(a, b, sae) =>
      emitValDef(sym, s"_mm512_min_round_pd(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MASK_MIN_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_min_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MIN_ROUND_PS(src, k, a, b, sae) =>
      emitValDef(sym, s"_mm512_mask_min_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MASKZ_MIN_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_min_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MIN_ROUND_PS(k, a, b, sae) =>
      emitValDef(sym, s"_mm512_maskz_min_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MIN_PS(a, b) =>
      emitValDef(sym, s"_mm512_min_ps(${quote(a)}, ${quote(b)})")
    case MM512_MIN_ROUND_PS(a, b, sae) =>
      emitValDef(sym, s"_mm512_min_round_ps(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASK_MIN_ROUND_SD(src, k, a, b, sae) =>
      emitValDef(sym, s"_mm_mask_min_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASK_MIN_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_ROUND_SD(k, a, b, sae) =>
      emitValDef(sym, s"_mm_maskz_min_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASKZ_MIN_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MIN_ROUND_SD(a, b, sae) =>
      emitValDef(sym, s"_mm_min_round_sd(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASK_MIN_ROUND_SS(src, k, a, b, sae) =>
      emitValDef(sym, s"_mm_mask_min_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASK_MIN_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_ROUND_SS(k, a, b, sae) =>
      emitValDef(sym, s"_mm_maskz_min_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM_MASKZ_MIN_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MIN_ROUND_SS(a, b, sae) =>
      emitValDef(sym, s"_mm_min_round_ss(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case MM512_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_maskz_load_pd(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASKZ_MOV_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_mov_pd(${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_maskz_load_ps(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASKZ_MOV_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_mov_ps(${quote(k)}, ${quote(a)})")
    case MM512_MASK_MOVEDUP_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_movedup_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_MOVEDUP_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_movedup_pd(${quote(k)}, ${quote(a)})")
    case MM512_MOVEDUP_PD(a) =>
      emitValDef(sym, s"_mm512_movedup_pd(${quote(a)})")
    case MM512_MASKZ_LOAD_EPI32(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_maskz_load_epi32(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASKZ_MOV_EPI32(k, a) =>
      emitValDef(sym, s"_mm512_maskz_mov_epi32(${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_LOAD_EPI64(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_maskz_load_epi64(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASKZ_MOV_EPI64(k, a) =>
      emitValDef(sym, s"_mm512_maskz_mov_epi64(${quote(k)}, ${quote(a)})")
    case MM512_LOADU_SI512(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_loadu_si512(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_LOADU_EPI32(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_loadu_epi32(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_STOREU_EPI32(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm512_mask_storeu_epi32(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_MASKZ_LOADU_EPI32(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_maskz_loadu_epi32(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_STOREU_SI512(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_storeu_si512(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM512_MASK_LOADU_EPI64(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_loadu_epi64(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_STOREU_EPI64(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm512_mask_storeu_epi64(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_MASKZ_LOADU_EPI64(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_maskz_loadu_epi64(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_STREAM_LOAD_SI512(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_stream_load_si512(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_STREAM_SI512(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_stream_si512(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM512_STREAM_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_stream_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM512_STREAM_PS(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_stream_ps(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_MASK_LOAD_SD(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_mask_load_sd(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASK_MOVE_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_move_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_STORE_SD(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm_mask_store_sd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_LOAD_SD(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_maskz_load_sd(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASKZ_MOVE_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_move_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MOVEHDUP_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_movehdup_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_MOVEHDUP_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_movehdup_ps(${quote(k)}, ${quote(a)})")
    case MM512_MOVEHDUP_PS(a) =>
      emitValDef(sym, s"_mm512_movehdup_ps(${quote(a)})")
    case MM512_MASK_MOVELDUP_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_moveldup_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_MOVELDUP_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_moveldup_ps(${quote(k)}, ${quote(a)})")
    case MM512_MOVELDUP_PS(a) =>
      emitValDef(sym, s"_mm512_moveldup_ps(${quote(a)})")
    case MM_MASK_LOAD_SS(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_mask_load_ss(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASK_MOVE_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_move_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_STORE_SS(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm_mask_store_ss(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_LOAD_SS(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_maskz_load_ss(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASKZ_MOVE_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_move_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_LOADU_PD(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_loadu_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_LOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_mask_loadu_pd(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_MASK_STOREU_PD(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm512_mask_storeu_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_MASKZ_LOADU_PD(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm512_maskz_loadu_pd(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM512_STOREU_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm512_storeu_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case _ => super.emitNode(sym, rhs)
  }
}
