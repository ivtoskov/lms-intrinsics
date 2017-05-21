package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait KNC00 extends IntrinsicsBase {
  /**
   * Fetch the line of data from memory that contains address "p" to a location in
   * the cache heirarchy specified by the locality hint "i".
   * p: char const*, i: int, pOffset: int
   */
  case class MM_PREFETCH[A[_], U:Integral](p: Exp[A[Byte]], i: Exp[Int], pOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Loads a big-endian word (16-bit) value from address "ptr" and stores the
   * result in "dst".
   * ptr: void const *, ptrOffset: int
   */
  case class LOADBE_I16[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Short] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads a big-endian double word (32-bit) value from address "ptr" and stores
   * the result in "dst".
   * ptr: void const *, ptrOffset: int
   */
  case class LOADBE_I32[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Int] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads a big-endian quad word (64-bit) value from address "ptr" and stores the
   * result in "dst".
   * ptr: void const *, ptrOffset: int
   */
  case class LOADBE_I64[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Long] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores word-sized (16-bit) "data" to address "ptr" in big-endian format.
   * ptr: void *, data: short, ptrOffset: int
   */
  case class STOREBE_I16[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Short], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores double word-sized (32-bit) "data" to address "ptr" in big-endian
   * format.
   * ptr: void *, data: int, ptrOffset: int
   */
  case class STOREBE_I32[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Int], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores quad word-sized (64-bit) "data" to address "ptr" in big-endian
   * format.
   * ptr: void *, data: __int64, ptrOffset: int
   */
  case class STOREBE_I64[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Long], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 16-bit masks "a" and then AND with "b", and store
   * the result in "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KANDN(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 16-bit masks "a" and "b", and store the result in
   * "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KAND(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy 16-bit mask "a" to "k".
   * a: __mmask16
   */
  case class MM512_KMOV(a: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 16-bit mask "a", and store the result in "k".
   * a: __mmask16
   */
  case class MM512_KNOT(a: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of 16-bit masks "a" and "b", and store the result in
   * "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KOR(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XNOR of 16-bit masks "a" and "b", and store the result in
   * "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KXNOR(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of 16-bit masks "a" and "b", and store the result in
   * "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KXOR(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLT_EPI32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 16 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to single-precision
   * (32-bit) floating-point elements, storing the results in "dst". "hint"
   * indicates to the processor whether the data is non-temporal.
   * mt: void const *, conv: _MM_UPCONV_PS_ENUM, bc: _MM_BROADCAST32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOAD_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 16 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to single-precision
   * (32-bit) floating-point elements, storing the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). "hint" indicates to the processor whether the data is non-temporal.
   * src: __m512, k: __mmask16, mt: void const *, conv: _MM_UPCONV_PS_ENUM, bc: _MM_BROADCAST32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOAD_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 16 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to 32-bit integer
   * elements, storing the results in "dst". "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, bc: _MM_BROADCAST32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOAD_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 16 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to 32-bit integer
   * elements, storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set). "hint"
   * indicates to the processor whether the data is non-temporal.
   * src: __m512i, k: __mmask16, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, bc: _MM_BROADCAST32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOAD_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 8 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to double-precision
   * (64-bit) floating-point elements, storing the results in "dst". "hint"
   * indicates to the processor whether the data is non-temporal.
   * mt: void const *, conv: _MM_UPCONV_PD_ENUM, bc: _MM_BROADCAST64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOAD_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 8 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to double-precision
   * (64-bit) floating-point elements, storing the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). "hint" indicates to the processor whether the data is non-temporal.
   * src: __m512d, k: __mmask8, mt: void const *, conv: _MM_UPCONV_PD_ENUM, bc: _MM_BROADCAST64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOAD_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 8 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to 64-bit integer
   * elements, storing the results in "dst". "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, bc: _MM_BROADCAST64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOAD_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 8 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to 64-bit integer
   * elements, storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set). "hint"
   * indicates to the processor whether the data is non-temporal.
   * src: __m512i, k: __mmask8, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, bc: _MM_BROADCAST64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOAD_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the four groups of packed
   * 4xsingle-precision (32-bit) floating-point elements in "v" using swizzle
   * parameter "s", storing the results in "dst".
   * v: __m512, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_SWIZZLE_PS(v: Exp[__m512], s: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the two groups of packed 4x
   * double-precision (64-bit) floating-point elements in "v" using swizzle
   * parameter "s", storing the results in "dst".
   * v: __m512d, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_SWIZZLE_PD(v: Exp[__m512d], s: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the four groups of packed 4x
   * 32-bit integer elements in "v" using swizzle parameter "s", storing the
   * results in "dst".
   * v: __m512i, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_SWIZZLE_EPI32(v: Exp[__m512i], s: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the two groups of packed 4x64-bit
   * integer elements in "v" using swizzle parameter "s", storing the results in
   * "dst".
   * v: __m512i, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_SWIZZLE_EPI64(v: Exp[__m512i], s: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the four groups of packed 4x
   * single-precision (32-bit) floating-point elements in "v" using swizzle
   * parameter "s", storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, v: __m512, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_MASK_SWIZZLE_PS(src: Exp[__m512], k: Exp[Int], v: Exp[__m512], s: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the two groups of packed 4x
   * double-precision (64-bit) floating-point elements in "v" using swizzle
   * parameter "s", storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, v: __m512d, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_MASK_SWIZZLE_PD(src: Exp[__m512d], k: Exp[Int], v: Exp[__m512d], s: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the four groups of packed
   * 4x32-bit integer elements in "v" using swizzle parameter "s", storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, v: __m512i, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_MASK_SWIZZLE_EPI32(src: Exp[__m512i], k: Exp[Int], v: Exp[__m512i], s: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the four groups of packed
   * 4x64-bit integer elements in "v" using swizzle parameter "s", storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, v: __m512i, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_MASK_SWIZZLE_EPI64(src: Exp[__m512i], k: Exp[Int], v: Exp[__m512i], s: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed single-precision (32-bit) floating-point elements stored
   * in "v" to a smaller type depending on "conv" and stores them in memory
   * location "mt". "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, v: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTSTORE_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed 32-bit integer elements stored in "v" to a smaller type
   * depending on "conv" and stores them in memory location "mt". "hint" indicates
   * to the processor whether the data is non-temporal.
   * mt: void *, v: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTSTORE_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed double-precision (64-bit) floating-point elements stored
   * in "v" to a smaller type depending on "conv" and stores them in memory
   * location "mt". "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, v: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTSTORE_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed 64-bit integer elements stored in "v" to a smaller type
   * depending on "conv" and stores them in memory location "mt". "hint" indicates
   * to the processor whether the data is non-temporal.
   * mt: void *, v: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTSTORE_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed single-precision (32-bit) floating-point elements stored
   * in "v" to a smaller type depending on "conv" and stores them in memory
   * location "mt" using writemask "k" (elements are not written to memory when the
   * corresponding mask bit is not set). "hint" indicates to the processor whether
   * the data is non-temporal.
   * mt: void *, k: __mmask16, v: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTSTORE_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed double-precision (64-bit) floating-point elements stored
   * in "v" to a smaller type depending on "conv" and stores them in memory
   * location "mt" (elements in "mt" are unaltered when the corresponding mask bit
   * is not set). "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, k: __mmask8, v: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTSTORE_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed 32-bit integer elements stored in "v" to a smaller type
   * depending on "conv" and stores them in memory location "mt" (elements in "mt"
   * are unaltered when the corresponding mask bit is not set). "hint" indicates to
   * the processor whether the data is non-temporal.
   * mt: void *, k: __mmask16, v: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTSTORE_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed 64-bit integer elements stored in "v" to a smaller type
   * depending on "conv" and stores them in memory location "mt" (elements in "mt"
   * are unaltered when the corresponding mask bit is not set). "hint" indicates to
   * the processor whether the data is non-temporal.
   * mt: void *, k: __mmask8, v: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTSTORE_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements from "v" to
   * memory address "mt" with a no-read hint to the processor.
   * mt: void *, v: __m512, mtOffset: int
   */
  case class MM512_STORENR_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements from "v" to
   * memory address "mt" with a no-read hint to the processor.
   * mt: void *, v: __m512d, mtOffset: int
   */
  case class MM512_STORENR_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements from "v" to
   * memory address "mt" with a no-read hint and using a weakly-ordered memory
   * consistency model (stores performed with this function are not globally
   * ordered, and subsequent stores from the same thread can be observed before
   * them).
   * mt: void *, v: __m512, mtOffset: int
   */
  case class MM512_STORENRNGO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements from "v" to
   * memory address "mt" with a no-read hint and using a weakly-ordered memory
   * consistency model (stores performed with this function are not globally
   * ordered, and subsequent stores from the same thread can be observed before
   * them).
   * mt: void *, v: __m512d, mtOffset: int
   */
  case class MM512_STORENRNGO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition of packed 32-bit integers in "v2" and
   * "v3" and the corresponding bit in "k2", storing the result of the addition in
   * "dst" and the result of the carry in "k2_res".
   * v2: __m512i, k2: __mmask16, v3: __m512i, k2_res: __mmask16 *, k2_resOffset: int
   */
  case class MM512_ADC_EPI32[A[_], U:Integral](v2: Exp[__m512i], k2: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition of packed 32-bit integers in "v2" and
   * "v3" and the corresponding bit in "k2", storing the result of the addition in
   * "dst" and the result of the carry in "k2_res" using writemask "k1" (elements
   * are copied from "v2" when the corresponding mask bit is not set).
   * v2: __m512i, k1: __mmask16, k2: __mmask16, v3: __m512i, k2_res: __mmask16 *, k2_resOffset: int
   */
  case class MM512_MASK_ADC_EPI32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition between packed double-precision (64-bit)
   * floating-point elements in "v2" and "v3" and negates their sum, storing the
   * results in "dst".
   * v2: __m512d, v3: __m512d
   */
  case class MM512_ADDN_PD(v2: Exp[__m512d], v3: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition between packed double-precision (64-bit)
   * floating-point elements in "v2" and "v3" and negates their sum, storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, v2: __m512d, v3: __m512d
   */
  case class MM512_MASK_ADDN_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition between packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3" and negates their sum, storing the
   * results in "dst".
   * v2: __m512, v3: __m512
   */
  case class MM512_ADDN_PS(v2: Exp[__m512], v3: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition between packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3" and negates their sum, storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512
   */
  case class MM512_MASK_ADDN_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element by element addition between packed double-precision (64-bit)
   * floating-point elements in "v2" and "v3" and negates the sum, storing the
   * result in "dst".
   * 	[round_note]
   * v2: __m512d, v3: __m512d, rounding: int
   */
  case class MM512_ADDN_ROUND_PD(v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element by element addition between packed double-precision (64-bit)
   * floating-point elements in "v2" and "v3" and negates the sum, storing the
   * result in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, v2: __m512d, v3: __m512d, rounding: int
   */
  case class MM512_MASK_ADDN_ROUND_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element by element addition between packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3" and negates the sum, storing the
   * result in "dst".
   * 	[round_note]
   * v2: __m512, v3: __m512, rounding: int
   */
  case class MM512_ADDN_ROUND_PS(v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element by element addition between packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3" and negates the sum, storing the
   * result in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512, rounding: int
   */
  case class MM512_MASK_ADDN_ROUND_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed double-precision (64-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst".
   * v2: __m512d, v3: __m512d
   */
  case class MM512_SUBR_PD(v2: Exp[__m512d], v3: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed double-precision (64-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, v2: __m512d, v3: __m512d
   */
  case class MM512_MASK_SUBR_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed single-precision (32-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst".
   * v2: __m512, v3: __m512
   */
  case class MM512_SUBR_PS(v2: Exp[__m512], v3: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed single-precision (32-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512
   */
  case class MM512_MASK_SUBR_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed double-precision (64-bit)
   * floating-point elements in "v2" from "v3" storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512d, v3: __m512d, rounding: int
   */
  case class MM512_SUBR_ROUND_PD(v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed double-precision (64-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, v2: __m512d, v3: __m512d, rounding: int
   */
  case class MM512_MASK_SUBR_ROUND_PD(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed single-precision (32-bit)
   * floating-point elements in "v2" from "v3" storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512, v3: __m512, rounding: int
   */
  case class MM512_SUBR_ROUND_PS(v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed single-precision (32-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512, rounding: int
   */
  case class MM512_MASK_SUBR_ROUND_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v2" from "v3" storing the results in "dst".
   * v2: __m512i, v3: __m512i
   */
  case class MM512_SUBR_EPI32(v2: Exp[__m512i], v3: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v2" from "v3" storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set)
   * src: __m512i, k: __mmask16, v2: __m512i, v3: __m512i
   */
  case class MM512_MASK_SUBR_EPI32(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512i], v3: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition of packed 32-bit integer elements in "v2"
   * and "v3", storing the resultant carry in "k2_res" (carry flag) and the
   * addition results in "dst".
   * v2: __m512i, v3: __m512i, k2_res: __mmask16 *, k2_resOffset: int
   */
  case class MM512_ADDSETC_EPI32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition of packed 32-bit integer elements in "v2"
   * and "v3", storing the resultant carry in "k2_res" (carry flag) and the
   * addition results in "dst" using writemask "k" (elements are copied from "v2"
   * and "k_old" when the corresponding mask bit is not set).
   * v2: __m512i, k: __mmask16, k_old: __mmask16, v3: __m512i, k2_res: __mmask16 *, k2_resOffset: int
   */
  case class MM512_MASK_ADDSETC_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element addition of packed 32-bit integer elements in
   * "v2" and "v3", storing the results in "dst" and the sign of the sum in "sign"
   * (sign flag).
   * v2: __m512i, v3: __m512i, sign: __mmask16 *, signOffset: int
   */
  case class MM512_ADDSETS_EPI32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], sign: Exp[A[Int]], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element addition of packed 32-bit integer elements in
   * "v2" and "v3", storing the results in "dst" and the sign of the sum in "sign"
   * (sign flag). Results are stored using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, v2: __m512i, v3: __m512i, sign: __mmask16 *, signOffset: int
   */
  case class MM512_MASK_ADDSETS_EPI32[A[_], U:Integral](src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512i], v3: Exp[__m512i], sign: Exp[A[Int]], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element addition of packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3", storing the results in "dst" and the
   * sign of the sum in "sign" (sign flag).
   * v2: __m512, v3: __m512, sign: __mmask16 *, signOffset: int
   */
  case class MM512_ADDSETS_PS[A[_], U:Integral](v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element addition of packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3", storing the results in "dst" and the
   * sign of the sum in "sign" (sign flag). Results are stored using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512, sign: __mmask16 *, signOffset: int
   */
  case class MM512_MASK_ADDSETS_PS[A[_], U:Integral](src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element addition of packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3", storing the results in "dst" and the
   * sign of the sum in "sign" (sign flag).
   * 	[round_note]
   * v2: __m512, v3: __m512, sign: __mmask16 *, rounding: int, signOffset: int
   */
  case class MM512_ADDSETS_ROUND_PS[A[_], U:Integral](v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], rounding: Exp[Int], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element addition of packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3", storing the results in "dst" and the
   * sign of the sum in "sign" (sign flag). Results are stored using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512, sign: __mmask16 *, rounding: int, signOffset: int
   */
  case class MM512_MASK_ADDSETS_ROUND_PS[A[_], U:Integral](src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], rounding: Exp[Int], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v3" from "v2", storing the results in "dst" and the nth borrow bit in the nth
   * position of "borrow" (borrow flag).
   * v2: __m512i, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_SUBSETB_EPI32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v3" from "v2", storing the results in "dst" and the nth borrow bit in the nth
   * position of "borrow" (borrow flag). Results are stored using writemask "k"
   * (elements are copied from "v2" and "k_old" when the corresponding mask bit is
   * not set).
   * v2: __m512i, k: __mmask16, k_old: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_MASK_SUBSETB_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v2" from "v3", storing the results in "dst" and "v2". The borrowed value from
   * the subtraction difference for the nth element is written to the nth bit of
   * "borrow" (borrow flag).
   * v2: __m512i, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_SUBRSETB_EPI32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v2" from "v3", storing the results in "dst" and "v2". The borrowed value from
   * the subtraction difference for the nth element is written to the nth bit of
   * "borrow" (borrow flag). Results are written using writemask "k" (elements are
   * copied from "k" to "k_old" when the corresponding mask bit is not set).
   * v2: __m512i, k: __mmask16, k_old: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_MASK_SUBRSETB_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element three-input subtraction of packed 32-bit integer
   * elements of "v3" as well as the corresponding bit from "k" from "v2". The
   * borrowed value from the subtraction difference for the nth element is written
   * to the nth bit of "borrow" (borrow flag). Results are stored in "dst".
   * v2: __m512i, k: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_SBB_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element three-input subtraction of packed 32-bit integer
   * elements of "v3" as well as the corresponding bit from "k2" from "v2". The
   * borrowed value from the subtraction difference for the nth element is written
   * to the nth bit of "borrow" (borrow flag). Results are stored in "dst" using
   * writemask "k1" (elements are copied from "v2" when the corresponding mask bit
   * is not set).
   * v2: __m512i, k1: __mmask16, k2: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_MASK_SBB_EPI32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element three-input subtraction of packed 32-bit integer
   * elements of "v2" as well as the corresponding bit from "k" from "v3". The
   * borrowed value from the subtraction difference for the nth element is written
   * to the nth bit of "borrow" (borrow flag). Results are stored in "dst".
   * v2: __m512i, k: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_SBBR_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element three-input subtraction of packed 32-bit integer
   * elements of "v2" as well as the corresponding bit from "k2" from "v3". The
   * borrowed value from the subtraction difference for the nth element is written
   * to the nth bit of "borrow" (borrow flag). Results are stored in "dst" using
   * writemask "k1" (elements are copied from "v2" when the corresponding mask bit
   * is not set).
   * v2: __m512i, k1: __mmask16, k2: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_MASK_SBBR_EPI32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed double-precision (64-bit)
   * floating-point elements in "v2" to packed single-precision (32-bit)
   * floating-point elements, storing the results in "dst". Results are written to
   * the lower half of "dst", and the upper half locations are set to
   * '0'.
   * 	[round_note]
   * v2: __m512d, rounding: int
   */
  case class MM512_CVT_ROUNDPD_PSLO(v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed double-precision (64-bit)
   * floating-point elements in "v2" to packed single-precision (32-bit)
   * floating-point elements, storing the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * Results are written to the lower half of "dst", and the upper half locations
   * are set to '0'.
   * 	[round_note]
   * src: __m512, k: __mmask8, v2: __m512d, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPD_PSLO(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed double-precision (64-bit)
   * floating-point elements in "v2" to packed 32-bit unsigned integer elements,
   * storing the results in "dst". Results are written to the lower half of "dst",
   * and the upper half locations are set to '0'.
   * 	[round_note]
   * v2: __m512d, rounding: int
   */
  case class MM512_CVTFXPNT_ROUNDPD_EPU32LO(v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed double-precision (64-bit)
   * floating-point elements in "v2" to packed 32-bit unsigned integer elements,
   * storing the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). Results are written to the
   * lower half of "dst", and the upper half locations are set to
   * '0'.
   * 	[round_note]
   * src: __m512i, k: __mmask8, v2: __m512d, rounding: int
   */
  case class MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed single-precision (32-bit)
   * floating-point elements in "v2" to packed 32-bit integer elements and performs
   * an optional exponent adjust using "expadj", storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32(v2: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed single-precision (32-bit)
   * floating-point elements in "v2" to packed 32-bit unsigned integer elements and
   * performing an optional exponent adjust using "expadj", storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32(v2: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed 32-bit unsigned integer
   * elements in "v2" to packed single-precision (32-bit) floating-point elements
   * and performing an optional exponent adjust using "expadj", storing the results
   * in "dst".
   * 	[round_note]
   * v2: __m512i, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS(v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed 32-bit unsigned integer
   * elements in "v2" to packed single-precision (32-bit) floating-point elements
   * and performing an optional exponent adjust using "expadj", storing the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, v2: __m512i, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Approximates the base-2 exponent of the packed single-precision (32-bit)
   * floating-point elements in "v2" with eight bits for sign and magnitude and 24
   * bits for the fractional part. Results are stored in "dst".
   * v2: __m512i
   */
  case class MM512_EXP223_PS(v2: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Approximates the base-2 exponent of the packed single-precision (32-bit)
   * floating-point elements in "v2" with eight bits for sign and magnitude and 24
   * bits for the fractional part. Results are stored in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, v2: __m512i
   */
  case class MM512_MASK_EXP223_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fixes up NaN's from packed double-precision (64-bit) floating-point elements
   * in "v1" and "v2", storing the results in "dst" and storing the quietized NaN's
   * from "v1" in "v3".
   * v1: __m512d, v2: __m512d, v3: __m512i
   */
  case class MM512_FIXUPNAN_PD(v1: Exp[__m512d], v2: Exp[__m512d], v3: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fixes up NaN's from packed double-precision (64-bit) floating-point elements
   * in "v1" and "v2", storing the results in "dst" using writemask "k" (only
   * elements whose corresponding mask bit is set are used in the computation).
   * Quietized NaN's from "v1" are stored in "v3".
   * v1: __m512d, k: __mmask8, v2: __m512d, v3: __m512i
   */
  case class MM512_MASK_FIXUPNAN_PD(v1: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fixes up NaN's from packed single-precision (32-bit) floating-point elements
   * in "v1" and "v2", storing the results in "dst" and storing the quietized NaN's
   * from "v1" in "v3".
   * v1: __m512, v2: __m512, v3: __m512i
   */
  case class MM512_FIXUPNAN_PS(v1: Exp[__m512], v2: Exp[__m512], v3: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fixes up NaN's from packed single-precision (32-bit) floating-point elements
   * in "v1" and "v2", storing the results in "dst" using writemask "k" (only
   * elements whose corresponding mask bit is set are used in the computation).
   * Quietized NaN's from "v1" are stored in "v3".
   * v1: __m512, k: __mmask16, v2: __m512, v3: __m512i
   */
  case class MM512_MASK_FIXUPNAN_PS(v1: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64, up-converted depending on the value
   * of "conv", and expanded into packed 32-bit integers in "dst". The initial
   * values of "dst" are copied from "src". Only those converted doublewords that
   * occur at or after the first 64-byte-aligned address following (mt-64) are
   * loaded. Elements in the resulting vector that do not map to those doublewords
   * are taken from "src". "hint" indicates to the processor whether the loaded
   * data is non-temporal.
   * src: __m512i, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKHI_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64, up-converted depending on the value
   * of "conv", and expanded into packed 32-bit integers in "dst". The initial
   * values of "dst" are copied from "src". Only those converted doublewords that
   * occur at or after the first 64-byte-aligned address following (mt-64) are
   * loaded. Elements in the resulting vector that do not map to those doublewords
   * are taken from "src". "hint" indicates to the processor whether the loaded
   * data is non-temporal. Elements are copied to "dst" according to element
   * selector "k" (elements are skipped when the corresponding mask bit is not
   * set).
   * src: __m512i, k: __mmask16, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKHI_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt, up-converted depending on the value of
   * "conv", and expanded into packed 32-bit integers in "dst". The initial values
   * of "dst" are copied from "src". Only those converted doublewords that occur
   * before first 64-byte-aligned address following "mt" are loaded. Elements in
   * the resulting vector that do not map to those doublewords are taken from
   * "src". "hint" indicates to the processor whether the loaded data is
   * non-temporal.
   * src: __m512i, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKLO_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt, up-converted depending on the value of
   * "conv", and expanded into packed 32-bit integers in "dst". The initial values
   * of "dst" are copied from "src". Only those converted doublewords that occur
   * before first 64-byte-aligned address following "mt" are loaded. Elements in
   * the resulting vector that do not map to those doublewords are taken from
   * "src". "hint" indicates to the processor whether the loaded data is
   * non-temporal. Elements are copied to "dst" according to element selector "k"
   * (elements are skipped when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKLO_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64, up-converted depending on the value of "conv",
   * and expanded into packed 64-bit integers in "dst". The initial values of "dst"
   * are copied from "src". Only those converted quadwords that occur at or after
   * the first 64-byte-aligned address following (mt-64) are loaded. Elements in
   * the resulting vector that do not map to those quadwords are taken from "src".
   * "hint" indicates to the processor whether the loaded data is non-temporal.
   * src: __m512i, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKHI_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64, up-converted depending on the value of "conv",
   * and expanded into packed 64-bit integers in "dst". The initial values of "dst"
   * are copied from "src". Only those converted quadwords that occur at or after
   * the first 64-byte-aligned address following (mt-64) are loaded. Elements in
   * the resulting vector that do not map to those quadwords are taken from "src".
   * "hint" indicates to the processor whether the loaded data is non-temporal.
   * Elements are copied to "dst" according to element selector "k" (elements are
   * skipped when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKHI_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt, up-converted depending on the value of "conv", and
   * expanded into packed 64-bit integers in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quad that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those quadwords are taken from "src". "hint"
   * indicates to the processor whether the loaded data is non-temporal.
   * src: __m512i, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKLO_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt, up-converted depending on the value of "conv", and
   * expanded into packed 64-bit integers in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quadwords that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those quadwords are taken from "src". "hint"
   * indicates to the processor whether the loaded data is non-temporal. Elements
   * are copied to "dst" according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKLO_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64, up-converted depending on the value
   * of "conv", and expanded into packed single-precision (32-bit) floating-point
   * elements in "dst". The initial values of "dst" are copied from "src". Only
   * those converted quadwords that occur at or after the first 64-byte-aligned
   * address following (mt-64) are loaded. Elements in the resulting vector that do
   * not map to those quadwords are taken from "src". "hint" indicates to the
   * processor whether the loaded data is non-temporal.
   * src: __m512, mt: void const *, conv: _MM_UPCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKHI_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64, up-converted depending on the value
   * of "conv", and expanded into packed single-precision (32-bit) floating-point
   * elements in "dst". The initial values of "dst" are copied from "src". Only
   * those converted quadwords that occur at or after the first 64-byte-aligned
   * address following (mt-64) are loaded. Elements in the resulting vector that do
   * not map to those quadwords are taken from "src". "hint" indicates to the
   * processor whether the loaded data is non-temporal. Elements are copied to
   * "dst" according to element selector "k" (elements are skipped when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, mt: void const *, conv: _MM_UPCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKHI_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt, up-converted depending on the value of
   * "conv", and expanded into packed single-precision (32-bit) floating-point
   * elements in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur before first 64-byte-aligned address
   * following "mt" are loaded. Elements in the resulting vector that do not map to
   * those doublewords are taken from "src". "hint" indicates to the processor
   * whether the loaded data is non-temporal.
   * src: __m512, mt: void const *, conv: _MM_UPCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKLO_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt, up-converted depending on the value of
   * "conv", and expanded into packed single-precision (32-bit) floating-point
   * elements in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur before first 64-byte-aligned address
   * following "mt" are loaded. Elements in the resulting vector that do not map to
   * those doublewords are taken from "src". "hint" indicates to the processor
   * whether the loaded data is non-temporal. Elements are copied to "dst"
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * src: __m512, k: __mmask16, mt: void const *, conv: _MM_UPCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKLO_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64, up-converted depending on the value of "conv",
   * and expanded into packed double-precision (64-bit) floating-point values in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quadwords that occur at or after the first 64-byte-aligned address following
   * (mt-64) are loaded. Elements in the resulting vector that do not map to those
   * quadwords are taken from "src". "hint" indicates to the processor whether the
   * loaded data is non-temporal.
   * src: __m512d, mt: void const *, conv: _MM_UPCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKHI_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64, up-converted depending on the value of "conv",
   * and expanded into packed double-precision (64-bit) floating-point values in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quadwords that occur at or after the first 64-byte-aligned address following
   * (mt-64) are loaded. Elements in the resulting vector that do not map to those
   * quadwords are taken from "src". "hint" indicates to the processor whether the
   * loaded data is non-temporal. Elements are copied to "dst" according to element
   * selector "k" (elements are skipped when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, mt: void const *, conv: _MM_UPCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKHI_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt, up-converted depending on the value of "conv", and
   * expanded into packed double-precision (64-bit) floating-point elements in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quad that occur before first 64-byte-aligned address following "mt" are
   * loaded. Elements in the resulting vector that do not map to those quadwords
   * are taken from "src". "hint" indicates to the processor whether the loaded
   * data is non-temporal.
   * src: __m512d, mt: void const *, conv: _MM_UPCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKLO_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt, up-converted depending on the value of "conv", and
   * expanded into packed double-precision (64-bit) floating-point elements in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quad that occur before first 64-byte-aligned address following "mt" are
   * loaded. Elements in the resulting vector that do not map to those quadwords
   * are taken from "src". "hint" indicates to the processor whether the loaded
   * data is non-temporal. Elements are copied to "dst" according to element
   * selector "k" (elemenst are skipped when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, mt: void const *, conv: _MM_UPCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKLO_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 32-bit integer elements of "v1" into a
   * byte/word/doubleword stream according to "conv" at a logically mapped starting
   * address (mt-64), storing the high-64-byte elements of that stream (those
   * elemetns of the stream that map at or after the first 64-byte-aligned address
   * following (m5-64)). "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTOREHI_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 32-bit integer elements of "v1" into a
   * byte/word/doubleword stream according to "conv" at a logically mapped starting
   * address (mt-64), storing the high-64-byte elements of that stream (those
   * elemetns of the stream that map at or after the first 64-byte-aligned address
   * following (m5-64)). "hint" indicates to the processor whether the data is
   * non-temporal. Elements are stored to memory according to element selector "k"
   * (elements are skipped when the corresonding mask bit is not set).
   * mt: void *, k: __mmask16, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTOREHI_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 32-bit integer elements of "v1" into a
   * byte/word/doubleword stream according to "conv" at a logically mapped starting
   * address "mt", storing the low-64-byte elements of that stream (those elements
   * of the stream that map before the first 64-byte-aligned address follwing
   * "mt"). "hint" indicates to the processor whether the data is non-temporal.
   * mt: void *, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTORELO_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 32-bit integer elements of "v1" into a
   * byte/word/doubleword stream according to "conv" at a logically mapped starting
   * address "mt", storing the low-64-byte elements of that stream (those elements
   * of the stream that map before the first 64-byte-aligned address follwing
   * "mt"). "hint" indicates to the processor whether the data is non-temporal.
   * Elements are written to memory according to element selector "k" (elements are
   * skipped when the corresponding mask bit is not set).
   * mt: void *, k: __mmask16, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTORELO_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 64-bit integer elements of "v1" into a
   * quadword stream according to "conv" at a logically mapped starting address
   * (mt-64), storing the high-64-byte elements of that stream (those elemetns of
   * the stream that map at or after the first 64-byte-aligned address following
   * (m5-64)). "hint" indicates to the processor whether the data is non-temporal.
   * mt: void *, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTOREHI_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 64-bit integer elements of "v1" into a
   * quadword stream according to "conv" at a logically mapped starting address
   * (mt-64), storing the high-64-byte elements of that stream (those elemetns of
   * the stream that map at or after the first 64-byte-aligned address following
   * (mt-64)). "hint" indicates to the processor whether the data is non-temporal.
   * Elements are stored to memory according to element selector "k" (elements are
   * skipped when the corresonding mask bit is not set).
   * mt: void *, k: __mmask8, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTOREHI_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 64-bit integer elements of "v1" into a
   * quadword stream according to "conv" at a logically mapped starting address
   * "mt", storing the low-64-byte elements of that stream (those elements of the
   * stream that map before the first 64-byte-aligned address follwing "mt").
   * "hint" indicates to the processor whether the data is non-temporal.
   * mt: void *, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTORELO_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 64-bit integer elements of "v1" into a
   * quadword stream according to "conv" at a logically mapped starting address
   * "mt", storing the low-64-byte elements of that stream (those elements of the
   * stream that map before the first 64-byte-aligned address follwing "mt").
   * "hint" indicates to the processor whether the data is non-temporal. Elements
   * are stored to memory according to element selector "k" (elements are skipped
   * whent he corresponding mask bit is not set).
   * mt: void *, k: __mmask8, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTORELO_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed single-precision (32-bit) floating-point
   * elements of "v1" into a byte/word/doubleword stream according to "conv" at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void *, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTOREHI_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed single-precision (32-bit) floating-point
   * elements of "v1" into a byte/word/doubleword stream according to "conv" at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). "hint" indicates to the processor
   * whether the data is non-temporal. Elements are stored to memory according to
   * element selector "k" (elements are skipped when the corresponding mask bit is
   * not set).
   * mt: void *, k: __mmask16, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTOREHI_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed single-precision (32-bit) floating-point
   * elements of "v1" into a byte/word/doubleword stream according to "conv" at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt"). "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void *, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTORELO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed single-precision (32-bit) floating-point
   * elements of "v1" into a byte/word/doubleword stream according to "conv" at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt"). "hint" indicates to the processor
   * whether the data is non-temporal. Elements are stored to memory according to
   * element selector "k" (elements are skipped when the corresponding mask bit is
   * not set).
   * mt: void *, k: __mmask16, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTORELO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed double-precision (64-bit) floating-point
   * elements of "v1" into a quadword stream according to "conv" at a logically
   * mapped starting address (mt-64), storing the high-64-byte elements of that
   * stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void *, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTOREHI_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed double-precision (64-bit) floating-point
   * elements of "v1" into a quadword stream according to "conv" at a logically
   * mapped starting address (mt-64), storing the high-64-byte elements of that
   * stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). "hint" indicates to the processor
   * whether the data is non-temporal. Elements are stored to memory according to
   * element selector "k" (elements are skipped when the corresponding mask bit is
   * not set).
   * mt: void *, k: __mmask8, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTOREHI_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed double-precision (64-bit) floating-point
   * elements of "v1" into a quadword stream according to "conv" at a logically
   * mapped starting address "mt", storing the low-64-byte elements of that stream
   * (those elements of the stream that map before the first 64-byte-aligned
   * address follwing "mt"). "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTORELO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed double-precision (64-bit) floating-point
   * elements of "v1" into a quadword stream according to "conv" at a logically
   * mapped starting address "mt", storing the low-64-byte elements of that stream
   * (those elements of the stream that map before the first 64-byte-aligned
   * address follwing "mt"). "hint" indicates to the processor whether the data is
   * non-temporal. Elements are stored to memory according to element selector "k"
   * (elements are skipped when the corresponding mask bit is not set).
   * mt: void *, k: __mmask8, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTORELO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed 64-bit integer elements located in "v1" and stores them in
   * memory locations starting at location "mv" at packed 32-bit integer indices
   * stored in "index" scaled by "scale".
   * mv: void*, index: __m512i, v1: __m512i, scale: int, mvOffset: int
   */
  case class MM512_I32LOSCATTER_EPI64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed 64-bit integer elements located in "v1" and stores them in
   * memory locations starting at location "mv" at packed 32-bit integer indices
   * stored in "index" scaled by "scale" using writemask "k" (elements whose
   * corresponding mask bit is not set are not written to memory).
   * mv: void*, k: __mmask8, index: __m512i, v1: __m512i, scale: int, mvOffset: int
   */
  case class MM512_MASK_I32LOSCATTER_EPI64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64 and expands them into packed 32-bit
   * integers in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur at or after the first 64-byte-aligned
   * address following (mt-64) are loaded. Elements in the resulting vector that do
   * not map to those doublewords are taken from "src".
   * src: __m512i, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKHI_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64 and expands them into packed 32-bit
   * integers in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur at or after the first 64-byte-aligned
   * address following (mt-64) are loaded. Elements in the resulting vector that do
   * not map to those doublewords are taken from "src". Elements are loaded from
   * memory according to element selector "k" (elements are skipped when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, mt: void const *, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKHI_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt and expanded into packed 32-bit
   * integers in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur before first 64-byte-aligned address
   * following "mt" are loaded. Elements in the resulting vector that do not map to
   * those doublewords are taken from "src".
   * src: __m512i, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKLO_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt and expands them into packed 32-bit
   * integers in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur before first 64-byte-aligned address
   * following "mt" are loaded. Elements in the resulting vector that do not map to
   * those doublewords are taken from "src". Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKLO_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64 and expands them into packed 64-bit integers in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quadwords that occur at or after the first 64-byte-aligned address following
   * (mt-64) are loaded. Elements in the resulting vector that do not map to those
   * quadwords are taken from "src".
   * src: __m512i, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKHI_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64 and expands them into packed 64-bit integers in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quadwords that occur at or after the first 64-byte-aligned address following
   * (mt-64) are loaded. Elements in the resulting vector that do not map to those
   * quadwords are taken from "src". Elements are loaded from memory according to
   * element selector "k" (elements are skipped when the corresponding mask bit is
   * not set).
   * src: __m512i, k: __mmask8, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKHI_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt and expands them into packed 64-bit integers in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quad that occur before first 64-byte-aligned address following "mt" are
   * loaded. Elements in the resulting vector that do not map to those quadwords
   * are taken from "src".
   * src: __m512i, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKLO_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt and expands them into packed 64-bit integers in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quad that occur before first 64-byte-aligned address following "mt" are
   * loaded. Elements in the resulting vector that do not map to those quadwords
   * are taken from "src". Elements are loaded from memory according to element
   * selector "k" (elements are skipped when the corresponding mask bit is not
   * set).
   * src: __m512i, k: __mmask8, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKLO_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64 and expands them into packed
   * single-precision (32-bit) floating-point elements in "dst". The initial values
   * of "dst" are copied from "src". Only those converted quadwords that occur at
   * or after the first 64-byte-aligned address following (mt-64) are loaded.
   * Elements in the resulting vector that do not map to those quadwords are taken
   * from "src".
   * src: __m512, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKHI_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the doubleword stream starting at
   * element-aligned address mt-64 and expands them into packed single-precision
   * (32-bit) floating-point elements in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quadwords that occur at or after the
   * first 64-byte-aligned address following (mt-64) are loaded. Elements in the
   * resulting vector that do not map to those quadwords are taken from "src".
   * Elements are loaded from memory according to element selector "k" (elements
   * are skipped when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKHI_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the doubleword stream starting at
   * element-aligned address mt and expanded into packed single-precision (32-bit)
   * floating-point elements in "dst". The initial values of "dst" are copied from
   * "src". Only those converted doublewords that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those doublewords are taken from "src".
   * src: __m512, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKLO_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the doubleword stream starting at
   * element-aligned address mt and expanded into packed single-precision (32-bit)
   * floating-point elements in "dst". The initial values of "dst" are copied from
   * "src". Only those converted doublewords that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those doublewords are taken from "src". Elements are
   * loaded from memory according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKLO_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64 and expands them into packed double-precision
   * (64-bit) floating-point values in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quadwords that occur at or after the
   * first 64-byte-aligned address following (mt-64) are loaded. Elements in the
   * resulting vector that do not map to those quadwords are taken from "src".
   * src: __m512d, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKHI_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64 and expands them into packed double-precision
   * (64-bit) floating-point values in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quadwords that occur at or after the
   * first 64-byte-aligned address following (mt-64) are loaded. Elements in the
   * resulting vector that do not map to those quadwords are taken from "src".
   * Elements are loaded from memory according to element selector "k" (elements
   * are skipped when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKHI_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt and expands them into packed double-precision
   * (64-bit) floating-point elements in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quad that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those quadwords are taken from "src".
   * src: __m512d, mt: void const*, mtOffset: int
   */
  case class MM512_LOADUNPACKLO_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt and expands them into packed double-precision
   * (64-bit) floating-point values in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quad that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those quadwords are taken from "src". Elements are
   * loaded from memory according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKLO_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 32-bit integer elements of "v1" into a doubleword stream at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elements of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)).
   * mt: void*, v1: __m512i, mtOffset: int
   */
  case class MM512_PACKSTOREHI_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 32-bit integer elements of "v1" into a doubleword stream at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elements of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * mt: void*, k: __mmask16, v1: __m512i, mtOffset: int
   */
  case class MM512_MASK_PACKSTOREHI_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 32-bit integer elements of "v1" into a doubleword stream at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt").
   * mt: void*, v1: __m512i, mtOffset: int
   */
  case class MM512_PACKSTORELO_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 32-bit integer elements of "v1" into a doubleword stream at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt"). Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * mt: void*, k: __mmask16, v1: __m512i, mtOffset: int
   */
  case class MM512_MASK_PACKSTORELO_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 64-bit integer elements of "v1" into a quadword stream at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)).
   * mt: void*, v1: __m512i, mtOffset: int
   */
  case class MM512_PACKSTOREHI_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 64-bit integer elements of "v1" into a quadword stream at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * mt: void*, k: __mmask8, v1: __m512i, mtOffset: int
   */
  case class MM512_MASK_PACKSTOREHI_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 64-bit integer elements of "v1" into a quadword stream at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt").
   * mt: void*, v1: __m512i, mtOffset: int
   */
  case class MM512_PACKSTORELO_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 64-bit integer elements of "v1" into a quadword stream at a
   * logically mapped starting address "mt", storing the low-64-byte elements of
   * that stream (those elements of the stream that map before the first
   * 64-byte-aligned address follwing "mt"). Elements are loaded from memory
   * according to element selector "k" (elements are skipped when the corresponding
   * mask bit is not set).
   * mt: void*, k: __mmask8, v1: __m512i, mtOffset: int
   */
  case class MM512_MASK_PACKSTORELO_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements of "v1" into a
   * doubleword stream at a logically mapped starting address (mt-64), storing the
   * high-64-byte elements of that stream (those elemetns of the stream that map at
   * or after the first 64-byte-aligned address following (m5-64)).
   * mt: void*, v1: __m512, mtOffset: int
   */
  case class MM512_PACKSTOREHI_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements of "v1" into a
   * doubleword stream at a logically mapped starting address (mt-64), storing the
   * high-64-byte elements of that stream (those elemetns of the stream that map at
   * or after the first 64-byte-aligned address following (m5-64)). Elements are
   * loaded from memory according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * mt: void*, k: __mmask16, v1: __m512, mtOffset: int
   */
  case class MM512_MASK_PACKSTOREHI_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements of "v1" into a
   * doubleword stream at a logically mapped starting address "mt", storing the
   * low-64-byte elements of that stream (those elements of the stream that map
   * before the first 64-byte-aligned address follwing "mt").
   * mt: void*, v1: __m512, mtOffset: int
   */
  case class MM512_PACKSTORELO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements of "v1" into a
   * doubleword stream at a logically mapped starting address "mt", storing the
   * low-64-byte elements of that stream (those elements of the stream that map
   * before the first 64-byte-aligned address follwing "mt"). Elements are loaded
   * from memory according to element selector "k" (elements are skipped when the
   * corresponding mask bit is not set).
   * mt: void*, k: __mmask16, v1: __m512, mtOffset: int
   */
  case class MM512_MASK_PACKSTORELO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements of "v1" into a
   * quadword stream at a logically mapped starting address (mt-64), storing the
   * high-64-byte elements of that stream (those elemetns of the stream that map at
   * or after the first 64-byte-aligned address following (m5-64)).
   * mt: void*, v1: __m512d, mtOffset: int
   */
  case class MM512_PACKSTOREHI_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements of "v1" into a
   * quadword stream at a logically mapped starting address (mt-64), storing the
   * high-64-byte elements of that stream (those elemetns of the stream that map at
   * or after the first 64-byte-aligned address following (m5-64)). Elements are
   * loaded from memory according to element selector "k" (elements are skipped
   * when the corresponding mask bit is not set).
   * mt: void*, k: __mmask8, v1: __m512d, mtOffset: int
   */
  case class MM512_MASK_PACKSTOREHI_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements of "v1" into a
   * quadword stream at a logically mapped starting address "mt", storing the
   * low-64-byte elements of that stream (those elements of the stream that map
   * before the first 64-byte-aligned address follwing "mt").
   * mt: void*, v1: __m512d, mtOffset: int
   */
  case class MM512_PACKSTORELO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed double-precision (64-bit) floating-point elements of "v1" into a
   * quadword stream at a logically mapped starting address "mt", storing the
   * low-64-byte elements of that stream (those elements of the stream that map
   * before the first 64-byte-aligned address follwing "mt"). Elements are loaded
   * from memory according to element selector "k" (elements are skipped when the
   * corresponding mask bit is not set).
   * mt: void*, k: __mmask8, v1: __m512d, mtOffset: int
   */
  case class MM512_MASK_PACKSTORELO_PD[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of set bits in 32-bit unsigned integer "r1", returning the
   * results in "dst".
   * r1: unsigned int
   */
  case class MM_COUNTBITS_32(r1: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of set bits in double-precision (32-bit) unsigned integer
   * "r1", returning the results in "dst".
   * r1: unsigned __int64
   */
  case class MM_COUNTBITS_64(r1: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Inserts the low byte of mask "k2" into the high byte of "dst", and copies the
   * low byte of "k1" to the low byte of "dst".
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KMOVLHB(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element conversion of elements in packed
   * double-precision (64-bit) floating-point vector "v2" to 32-bit integer
   * elements, storing them in the lower half of "dst". The elements in the upper
   * half of "dst" are set to 0.
   * 	[round_note]
   * v2: __m512d, rounding: int
   */
  case class MM512_CVTFXPNT_ROUNDPD_EPI32LO(v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element conversion of elements in packed
   * double-precision (64-bit) floating-point vector "v2" to 32-bit integer
   * elements, storing them in the lower half of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * The elements in the upper half of "dst" are set to 0.
   * 	[round_note]
   * src: __m512i, k: __mmask8, v2: __m512d, rounding: int
   */
  case class MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element conversion of packed 32-bit integer elements in
   * "v2" to packed single-precision (32-bit) floating-point elements and
   * performing an optional exponent adjust using "expadj", storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512i, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS(v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a" with absolute error of 2^(-23) and store the
   * results in "dst".
   * a: __m512
   */
  case class MM512_LOG2AE23_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a" with absolute error of 2^(-23) and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_LOG2AE23_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 32-bit integer elements in "a" and "b", add the intermediate
   * result to packed elements in "c" and store the results in "dst".
   * a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_FMADD_EPI32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 32-bit integer elements in "a" and "b", add the intermediate
   * result to packed elements in "c" and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set).
   * a: __m512i, k: __mmask16, b: __m512i, c: __m512i
   */
  case class MM512_MASK_FMADD_EPI32(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 32-bit integer elements in "a" and "b", add the intermediate
   * result to packed elements in "c" and store the results in "dst" using
   * writemask "k" (elements are copied from "c" when the corresponding mask bit is
   * not set).
   * a: __m512i, b: __m512i, c: __m512i, k: __mmask16
   */
  case class MM512_MASK3_FMADD_EPI32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 32-bit integer elements in each 4-element set of "a" and by
   * element 1 of the corresponding 4-element set from "b", add the intermediate
   * result to element 0 of the corresponding 4-element set from "b", and store the
   * results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_FMADD233_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 32-bit integer elements in each 4-element set of "a" and by
   * element 1 of the corresponding 4-element set from "b", add the intermediate
   * result to element 0 of the corresponding 4-element set from "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_FMADD233_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in each
   * 4-element set of "a" and by element 1 of the corresponding 4-element set from
   * "b", add the intermediate result to element 0 of the corresponding 4-element
   * set from "b", and store the results in "dst".
   * 	[round_note]
   * a: __m512, b: __m512, rounding: int
   */
  case class MM512_FMADD233_ROUND_PS(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in each
   * 4-element set of "a" and by element 1 of the corresponding 4-element set from
   * "b", add the intermediate result to element 0 of the corresponding 4-element
   * set from "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASK_FMADD233_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_prefetch[A[_], U:Integral](p: Exp[A[Byte]], i: Exp[Int], pOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(p)(MM_PREFETCH(p, i, pOffset)(implicitly[Integral[U]], cont))
  }
            
  def _loadbe_i16[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Short] = {
    cont.read(ptr)(LOADBE_I16(ptr, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _loadbe_i32[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Int] = {
    cont.read(ptr)(LOADBE_I32(ptr, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _loadbe_i64[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Long] = {
    cont.read(ptr)(LOADBE_I64(ptr, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _storebe_i16[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Short], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(ptr)(STOREBE_I16(ptr, data, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _storebe_i32[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Int], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(ptr)(STOREBE_I32(ptr, data, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _storebe_i64[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Long], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(ptr)(STOREBE_I64(ptr, data, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_kandn(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KANDN(a, b)
  }
            
  def _mm512_kand(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KAND(a, b)
  }
            
  def _mm512_kmov(a: Exp[Int]): Exp[Int] = {
    MM512_KMOV(a)
  }
            
  def _mm512_knot(a: Exp[Int]): Exp[Int] = {
    MM512_KNOT(a)
  }
            
  def _mm512_kor(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KOR(a, b)
  }
            
  def _mm512_kxnor(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KXNOR(a, b)
  }
            
  def _mm512_kxor(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KXOR(a, b)
  }
            
  def _mm512_cmplt_epi32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLT_EPI32_MASK(a, b)
  }
            
  def _mm512_mask_cmplt_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLT_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_extload_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_EXTLOAD_PS(mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extload_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_EXTLOAD_PS(src, k, mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extload_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOAD_EPI32(mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extload_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOAD_EPI32(src, k, mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extload_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_EXTLOAD_PD(mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extload_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_EXTLOAD_PD(src, k, mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extload_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOAD_EPI64(mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extload_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOAD_EPI64(src, k, mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_swizzle_ps(v: Exp[__m512], s: Exp[Int]): Exp[__m512] = {
    MM512_SWIZZLE_PS(v, s)
  }
            
  def _mm512_swizzle_pd(v: Exp[__m512d], s: Exp[Int]): Exp[__m512d] = {
    MM512_SWIZZLE_PD(v, s)
  }
            
  def _mm512_swizzle_epi32(v: Exp[__m512i], s: Exp[Int]): Exp[__m512i] = {
    MM512_SWIZZLE_EPI32(v, s)
  }
            
  def _mm512_swizzle_epi64(v: Exp[__m512i], s: Exp[Int]): Exp[__m512i] = {
    MM512_SWIZZLE_EPI64(v, s)
  }
            
  def _mm512_mask_swizzle_ps(src: Exp[__m512], k: Exp[Int], v: Exp[__m512], s: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SWIZZLE_PS(src, k, v, s)
  }
            
  def _mm512_mask_swizzle_pd(src: Exp[__m512d], k: Exp[Int], v: Exp[__m512d], s: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SWIZZLE_PD(src, k, v, s)
  }
            
  def _mm512_mask_swizzle_epi32(src: Exp[__m512i], k: Exp[Int], v: Exp[__m512i], s: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SWIZZLE_EPI32(src, k, v, s)
  }
            
  def _mm512_mask_swizzle_epi64(src: Exp[__m512i], k: Exp[Int], v: Exp[__m512i], s: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SWIZZLE_EPI64(src, k, v, s)
  }
            
  def _mm512_extstore_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTSTORE_PS(mt, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extstore_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTSTORE_EPI32(mt, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extstore_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTSTORE_PD(mt, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extstore_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTSTORE_EPI64(mt, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extstore_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTSTORE_PS(mt, k, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extstore_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTSTORE_PD(mt, k, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extstore_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTSTORE_EPI32(mt, k, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extstore_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTSTORE_EPI64(mt, k, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_storenr_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_STORENR_PS(mt, v, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_storenr_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_STORENR_PD(mt, v, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_storenrngo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_STORENRNGO_PS(mt, v, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_storenrngo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_STORENRNGO_PD(mt, v, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_adc_epi32[A[_], U:Integral](v2: Exp[__m512i], k2: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(k2_res)(MM512_ADC_EPI32(v2, k2, v3, k2_res, k2_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_adc_epi32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(k2_res)(MM512_MASK_ADC_EPI32(v2, k1, k2, v3, k2_res, k2_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_addn_pd(v2: Exp[__m512d], v3: Exp[__m512d]): Exp[__m512d] = {
    MM512_ADDN_PD(v2, v3)
  }
            
  def _mm512_mask_addn_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ADDN_PD(src, k, v2, v3)
  }
            
  def _mm512_addn_ps(v2: Exp[__m512], v3: Exp[__m512]): Exp[__m512] = {
    MM512_ADDN_PS(v2, v3)
  }
            
  def _mm512_mask_addn_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ADDN_PS(src, k, v2, v3)
  }
            
  def _mm512_addn_round_pd(v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_ADDN_ROUND_PD(v2, v3, rounding)
  }
            
  def _mm512_mask_addn_round_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ADDN_ROUND_PD(src, k, v2, v3, rounding)
  }
            
  def _mm512_addn_round_ps(v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_ADDN_ROUND_PS(v2, v3, rounding)
  }
            
  def _mm512_mask_addn_round_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ADDN_ROUND_PS(src, k, v2, v3, rounding)
  }
            
  def _mm512_subr_pd(v2: Exp[__m512d], v3: Exp[__m512d]): Exp[__m512d] = {
    MM512_SUBR_PD(v2, v3)
  }
            
  def _mm512_mask_subr_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SUBR_PD(src, k, v2, v3)
  }
            
  def _mm512_subr_ps(v2: Exp[__m512], v3: Exp[__m512]): Exp[__m512] = {
    MM512_SUBR_PS(v2, v3)
  }
            
  def _mm512_mask_subr_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SUBR_PS(src, k, v2, v3)
  }
            
  def _mm512_subr_round_pd(v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_SUBR_ROUND_PD(v2, v3, rounding)
  }
            
  def _mm512_mask_subr_round_pd(src: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SUBR_ROUND_PD(src, k, v2, v3, rounding)
  }
            
  def _mm512_subr_round_ps(v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_SUBR_ROUND_PS(v2, v3, rounding)
  }
            
  def _mm512_mask_subr_round_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SUBR_ROUND_PS(src, k, v2, v3, rounding)
  }
            
  def _mm512_subr_epi32(v2: Exp[__m512i], v3: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUBR_EPI32(v2, v3)
  }
            
  def _mm512_mask_subr_epi32(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512i], v3: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBR_EPI32(src, k, v2, v3)
  }
            
  def _mm512_addsetc_epi32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(k2_res)(MM512_ADDSETC_EPI32(v2, v3, k2_res, k2_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_addsetc_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(k2_res)(MM512_MASK_ADDSETC_EPI32(v2, k, k_old, v3, k2_res, k2_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_addsets_epi32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], sign: Exp[A[Int]], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(sign)(MM512_ADDSETS_EPI32(v2, v3, sign, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_addsets_epi32[A[_], U:Integral](src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512i], v3: Exp[__m512i], sign: Exp[A[Int]], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(sign)(MM512_MASK_ADDSETS_EPI32(src, k, v2, v3, sign, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_addsets_ps[A[_], U:Integral](v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(sign)(MM512_ADDSETS_PS(v2, v3, sign, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_addsets_ps[A[_], U:Integral](src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(sign)(MM512_MASK_ADDSETS_PS(src, k, v2, v3, sign, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_addsets_round_ps[A[_], U:Integral](v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], rounding: Exp[Int], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(sign)(MM512_ADDSETS_ROUND_PS(v2, v3, sign, rounding, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_addsets_round_ps[A[_], U:Integral](src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], rounding: Exp[Int], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(sign)(MM512_MASK_ADDSETS_ROUND_PS(src, k, v2, v3, sign, rounding, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_subsetb_epi32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_SUBSETB_EPI32(v2, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_subsetb_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_MASK_SUBSETB_EPI32(v2, k, k_old, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_subrsetb_epi32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_SUBRSETB_EPI32(v2, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_subrsetb_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_MASK_SUBRSETB_EPI32(v2, k, k_old, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_sbb_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_SBB_EPI32(v2, k, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_sbb_epi32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_MASK_SBB_EPI32(v2, k1, k2, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_sbbr_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_SBBR_EPI32(v2, k, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_sbbr_epi32[A[_], U:Integral](v2: Exp[__m512i], k1: Exp[Int], k2: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_MASK_SBBR_EPI32(v2, k1, k2, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvt_roundpd_pslo(v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512] = {
    MM512_CVT_ROUNDPD_PSLO(v2, rounding)
  }
            
  def _mm512_mask_cvt_roundpd_pslo(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVT_ROUNDPD_PSLO(src, k, v2, rounding)
  }
            
  def _mm512_cvtfxpnt_roundpd_epu32lo(v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVTFXPNT_ROUNDPD_EPU32LO(v2, rounding)
  }
            
  def _mm512_mask_cvtfxpnt_roundpd_epu32lo(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO(src, k, v2, rounding)
  }
            
  def _mm512_cvtfxpnt_round_adjustps_epi32(v2: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512i] = {
    MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32(v2, rounding, expadj)
  }
            
  def _mm512_cvtfxpnt_round_adjustps_epu32(v2: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512i] = {
    MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32(v2, rounding, expadj)
  }
            
  def _mm512_cvtfxpnt_round_adjustepu32_ps(v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS(v2, rounding, expadj)
  }
            
  def _mm512_mask_cvtfxpnt_round_adjustepu32_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS(src, k, v2, rounding, expadj)
  }
            
  def _mm512_exp223_ps(v2: Exp[__m512i]): Exp[__m512] = {
    MM512_EXP223_PS(v2)
  }
            
  def _mm512_mask_exp223_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_EXP223_PS(src, k, v2)
  }
            
  def _mm512_fixupnan_pd(v1: Exp[__m512d], v2: Exp[__m512d], v3: Exp[__m512i]): Exp[__m512d] = {
    MM512_FIXUPNAN_PD(v1, v2, v3)
  }
            
  def _mm512_mask_fixupnan_pd(v1: Exp[__m512d], k: Exp[Int], v2: Exp[__m512d], v3: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASK_FIXUPNAN_PD(v1, k, v2, v3)
  }
            
  def _mm512_fixupnan_ps(v1: Exp[__m512], v2: Exp[__m512], v3: Exp[__m512i]): Exp[__m512] = {
    MM512_FIXUPNAN_PS(v1, v2, v3)
  }
            
  def _mm512_mask_fixupnan_ps(v1: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_FIXUPNAN_PS(v1, k, v2, v3)
  }
            
  def _mm512_extloadunpackhi_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOADUNPACKHI_EPI32(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpackhi_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKHI_EPI32(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpacklo_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOADUNPACKLO_EPI32(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpacklo_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKLO_EPI32(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpackhi_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOADUNPACKHI_EPI64(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpackhi_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKHI_EPI64(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpacklo_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOADUNPACKLO_EPI64(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpacklo_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKLO_EPI64(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpackhi_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_EXTLOADUNPACKHI_PS(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpackhi_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKHI_PS(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpacklo_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_EXTLOADUNPACKLO_PS(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpacklo_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKLO_PS(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpackhi_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_EXTLOADUNPACKHI_PD(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpackhi_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKHI_PD(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpacklo_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_EXTLOADUNPACKLO_PD(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpacklo_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKLO_PD(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorehi_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTOREHI_EPI32(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorehi_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTOREHI_EPI32(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorelo_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTORELO_EPI32(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorelo_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTORELO_EPI32(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorehi_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTOREHI_EPI64(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorehi_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTOREHI_EPI64(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorelo_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTORELO_EPI64(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorelo_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTORELO_EPI64(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorehi_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTOREHI_PS(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorehi_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTOREHI_PS(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorelo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTORELO_PS(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorelo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTORELO_PS(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorehi_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTOREHI_PD(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorehi_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTOREHI_PD(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorelo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTORELO_PD(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorelo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTORELO_PD(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i32loscatter_epi64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I32LOSCATTER_EPI64(mv, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i32loscatter_epi64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I32LOSCATTER_EPI64(mv, k, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpackhi_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_LOADUNPACKHI_EPI32(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpackhi_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKHI_EPI32(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpacklo_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_LOADUNPACKLO_EPI32(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpacklo_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKLO_EPI32(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpackhi_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_LOADUNPACKHI_EPI64(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpackhi_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKHI_EPI64(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpacklo_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_LOADUNPACKLO_EPI64(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpacklo_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKLO_EPI64(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpackhi_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_LOADUNPACKHI_PS(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpackhi_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKHI_PS(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpacklo_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_LOADUNPACKLO_PS(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpacklo_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKLO_PS(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpackhi_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_LOADUNPACKHI_PD(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpackhi_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKHI_PD(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadunpacklo_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_LOADUNPACKLO_PD(src, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpacklo_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKLO_PD(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorehi_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTOREHI_EPI32(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorehi_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTOREHI_EPI32(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorelo_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTORELO_EPI32(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorelo_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTORELO_EPI32(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorehi_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTOREHI_EPI64(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorehi_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTOREHI_EPI64(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorelo_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTORELO_EPI64(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorelo_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTORELO_EPI64(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorehi_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTOREHI_PS(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorehi_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTOREHI_PS(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorelo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTORELO_PS(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorelo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTORELO_PS(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorehi_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTOREHI_PD(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorehi_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTOREHI_PD(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_packstorelo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTORELO_PD(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packstorelo_pd[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512d], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTORELO_PD(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_countbits_32(r1: Exp[UInt]): Exp[UInt] = {
    MM_COUNTBITS_32(r1)
  }
            
  def _mm_countbits_64(r1: Exp[ULong]): Exp[ULong] = {
    MM_COUNTBITS_64(r1)
  }
            
  def _mm512_kmovlhb(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KMOVLHB(k1, k2)
  }
            
  def _mm512_cvtfxpnt_roundpd_epi32lo(v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVTFXPNT_ROUNDPD_EPI32LO(v2, rounding)
  }
            
  def _mm512_mask_cvtfxpnt_roundpd_epi32lo(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO(src, k, v2, rounding)
  }
            
  def _mm512_cvtfxpnt_round_adjustepi32_ps(v2: Exp[__m512i], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS(v2, rounding, expadj)
  }
            
  def _mm512_log2ae23_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_LOG2AE23_PS(a)
  }
            
  def _mm512_mask_log2ae23_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_LOG2AE23_PS(src, k, a)
  }
            
  def _mm512_fmadd_epi32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_FMADD_EPI32(a, b, c)
  }
            
  def _mm512_mask_fmadd_epi32(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_FMADD_EPI32(a, k, b, c)
  }
            
  def _mm512_mask3_fmadd_epi32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], k: Exp[Int]): Exp[__m512i] = {
    MM512_MASK3_FMADD_EPI32(a, b, c, k)
  }
            
  def _mm512_fmadd233_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_FMADD233_EPI32(a, b)
  }
            
  def _mm512_mask_fmadd233_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_FMADD233_EPI32(src, k, a, b)
  }
            
  def _mm512_fmadd233_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMADD233_ROUND_PS(a, b, rounding)
  }
            
  def _mm512_mask_fmadd233_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FMADD233_ROUND_PS(src, k, a, b, rounding)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case iDef@MM_PREFETCH (p, i, pOffset) =>
      _mm_prefetch(iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(i, f), iDef.cont.applyTransformer(pOffset, f))(iDef.integralType, iDef.cont)
    case iDef@LOADBE_I16 (ptr, ptrOffset) =>
      _loadbe_i16(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@LOADBE_I32 (ptr, ptrOffset) =>
      _loadbe_i32(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@LOADBE_I64 (ptr, ptrOffset) =>
      _loadbe_i64(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@STOREBE_I16 (ptr, data, ptrOffset) =>
      _storebe_i16(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@STOREBE_I32 (ptr, data, ptrOffset) =>
      _storebe_i32(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@STOREBE_I64 (ptr, data, ptrOffset) =>
      _storebe_i64(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_KANDN (a, b) =>
      _mm512_kandn(f(a), f(b))
    case MM512_KAND (a, b) =>
      _mm512_kand(f(a), f(b))
    case MM512_KMOV (a) =>
      _mm512_kmov(f(a))
    case MM512_KNOT (a) =>
      _mm512_knot(f(a))
    case MM512_KOR (a, b) =>
      _mm512_kor(f(a), f(b))
    case MM512_KXNOR (a, b) =>
      _mm512_kxnor(f(a), f(b))
    case MM512_KXOR (a, b) =>
      _mm512_kxor(f(a), f(b))
    case MM512_CMPLT_EPI32_MASK (a, b) =>
      _mm512_cmplt_epi32_mask(f(a), f(b))
    case MM512_MASK_CMPLT_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epi32_mask(f(k1), f(a), f(b))
    case iDef@MM512_EXTLOAD_PS (mt, conv, bc, hint, mtOffset) =>
      _mm512_extload_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOAD_PS (src, k, mt, conv, bc, hint, mtOffset) =>
      _mm512_mask_extload_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOAD_EPI32 (mt, conv, bc, hint, mtOffset) =>
      _mm512_extload_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOAD_EPI32 (src, k, mt, conv, bc, hint, mtOffset) =>
      _mm512_mask_extload_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOAD_PD (mt, conv, bc, hint, mtOffset) =>
      _mm512_extload_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOAD_PD (src, k, mt, conv, bc, hint, mtOffset) =>
      _mm512_mask_extload_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOAD_EPI64 (mt, conv, bc, hint, mtOffset) =>
      _mm512_extload_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOAD_EPI64 (src, k, mt, conv, bc, hint, mtOffset) =>
      _mm512_mask_extload_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SWIZZLE_PS (v, s) =>
      _mm512_swizzle_ps(f(v), f(s))
    case MM512_SWIZZLE_PD (v, s) =>
      _mm512_swizzle_pd(f(v), f(s))
    case MM512_SWIZZLE_EPI32 (v, s) =>
      _mm512_swizzle_epi32(f(v), f(s))
    case MM512_SWIZZLE_EPI64 (v, s) =>
      _mm512_swizzle_epi64(f(v), f(s))
    case MM512_MASK_SWIZZLE_PS (src, k, v, s) =>
      _mm512_mask_swizzle_ps(f(src), f(k), f(v), f(s))
    case MM512_MASK_SWIZZLE_PD (src, k, v, s) =>
      _mm512_mask_swizzle_pd(f(src), f(k), f(v), f(s))
    case MM512_MASK_SWIZZLE_EPI32 (src, k, v, s) =>
      _mm512_mask_swizzle_epi32(f(src), f(k), f(v), f(s))
    case MM512_MASK_SWIZZLE_EPI64 (src, k, v, s) =>
      _mm512_mask_swizzle_epi64(f(src), f(k), f(v), f(s))
    case iDef@MM512_EXTSTORE_PS (mt, v, conv, hint, mtOffset) =>
      _mm512_extstore_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTSTORE_EPI32 (mt, v, conv, hint, mtOffset) =>
      _mm512_extstore_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTSTORE_PD (mt, v, conv, hint, mtOffset) =>
      _mm512_extstore_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTSTORE_EPI64 (mt, v, conv, hint, mtOffset) =>
      _mm512_extstore_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTSTORE_PS (mt, k, v, conv, hint, mtOffset) =>
      _mm512_mask_extstore_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTSTORE_PD (mt, k, v, conv, hint, mtOffset) =>
      _mm512_mask_extstore_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTSTORE_EPI32 (mt, k, v, conv, hint, mtOffset) =>
      _mm512_mask_extstore_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTSTORE_EPI64 (mt, k, v, conv, hint, mtOffset) =>
      _mm512_mask_extstore_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORENR_PS (mt, v, mtOffset) =>
      _mm512_storenr_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORENR_PD (mt, v, mtOffset) =>
      _mm512_storenr_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORENRNGO_PS (mt, v, mtOffset) =>
      _mm512_storenrngo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_STORENRNGO_PD (mt, v, mtOffset) =>
      _mm512_storenrngo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_ADC_EPI32 (v2, k2, v3, k2_res, k2_resOffset) =>
      _mm512_adc_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_ADC_EPI32 (v2, k1, k2, v3, k2_res, k2_resOffset) =>
      _mm512_mask_adc_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont)
    case MM512_ADDN_PD (v2, v3) =>
      _mm512_addn_pd(f(v2), f(v3))
    case MM512_MASK_ADDN_PD (src, k, v2, v3) =>
      _mm512_mask_addn_pd(f(src), f(k), f(v2), f(v3))
    case MM512_ADDN_PS (v2, v3) =>
      _mm512_addn_ps(f(v2), f(v3))
    case MM512_MASK_ADDN_PS (src, k, v2, v3) =>
      _mm512_mask_addn_ps(f(src), f(k), f(v2), f(v3))
    case MM512_ADDN_ROUND_PD (v2, v3, rounding) =>
      _mm512_addn_round_pd(f(v2), f(v3), f(rounding))
    case MM512_MASK_ADDN_ROUND_PD (src, k, v2, v3, rounding) =>
      _mm512_mask_addn_round_pd(f(src), f(k), f(v2), f(v3), f(rounding))
    case MM512_ADDN_ROUND_PS (v2, v3, rounding) =>
      _mm512_addn_round_ps(f(v2), f(v3), f(rounding))
    case MM512_MASK_ADDN_ROUND_PS (src, k, v2, v3, rounding) =>
      _mm512_mask_addn_round_ps(f(src), f(k), f(v2), f(v3), f(rounding))
    case MM512_SUBR_PD (v2, v3) =>
      _mm512_subr_pd(f(v2), f(v3))
    case MM512_MASK_SUBR_PD (src, k, v2, v3) =>
      _mm512_mask_subr_pd(f(src), f(k), f(v2), f(v3))
    case MM512_SUBR_PS (v2, v3) =>
      _mm512_subr_ps(f(v2), f(v3))
    case MM512_MASK_SUBR_PS (src, k, v2, v3) =>
      _mm512_mask_subr_ps(f(src), f(k), f(v2), f(v3))
    case MM512_SUBR_ROUND_PD (v2, v3, rounding) =>
      _mm512_subr_round_pd(f(v2), f(v3), f(rounding))
    case MM512_MASK_SUBR_ROUND_PD (src, k, v2, v3, rounding) =>
      _mm512_mask_subr_round_pd(f(src), f(k), f(v2), f(v3), f(rounding))
    case MM512_SUBR_ROUND_PS (v2, v3, rounding) =>
      _mm512_subr_round_ps(f(v2), f(v3), f(rounding))
    case MM512_MASK_SUBR_ROUND_PS (src, k, v2, v3, rounding) =>
      _mm512_mask_subr_round_ps(f(src), f(k), f(v2), f(v3), f(rounding))
    case MM512_SUBR_EPI32 (v2, v3) =>
      _mm512_subr_epi32(f(v2), f(v3))
    case MM512_MASK_SUBR_EPI32 (src, k, v2, v3) =>
      _mm512_mask_subr_epi32(f(src), f(k), f(v2), f(v3))
    case iDef@MM512_ADDSETC_EPI32 (v2, v3, k2_res, k2_resOffset) =>
      _mm512_addsetc_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_ADDSETC_EPI32 (v2, k, k_old, v3, k2_res, k2_resOffset) =>
      _mm512_mask_addsetc_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_ADDSETS_EPI32 (v2, v3, sign, signOffset) =>
      _mm512_addsets_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_ADDSETS_EPI32 (src, k, v2, v3, sign, signOffset) =>
      _mm512_mask_addsets_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_ADDSETS_PS (v2, v3, sign, signOffset) =>
      _mm512_addsets_ps(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_ADDSETS_PS (src, k, v2, v3, sign, signOffset) =>
      _mm512_mask_addsets_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_ADDSETS_ROUND_PS (v2, v3, sign, rounding, signOffset) =>
      _mm512_addsets_round_ps(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(rounding, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_ADDSETS_ROUND_PS (src, k, v2, v3, sign, rounding, signOffset) =>
      _mm512_mask_addsets_round_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(rounding, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_SUBSETB_EPI32 (v2, v3, borrow, borrowOffset) =>
      _mm512_subsetb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_SUBSETB_EPI32 (v2, k, k_old, v3, borrow, borrowOffset) =>
      _mm512_mask_subsetb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_SUBRSETB_EPI32 (v2, v3, borrow, borrowOffset) =>
      _mm512_subrsetb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_SUBRSETB_EPI32 (v2, k, k_old, v3, borrow, borrowOffset) =>
      _mm512_mask_subrsetb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_SBB_EPI32 (v2, k, v3, borrow, borrowOffset) =>
      _mm512_sbb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_SBB_EPI32 (v2, k1, k2, v3, borrow, borrowOffset) =>
      _mm512_mask_sbb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_SBBR_EPI32 (v2, k, v3, borrow, borrowOffset) =>
      _mm512_sbbr_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_SBBR_EPI32 (v2, k1, k2, v3, borrow, borrowOffset) =>
      _mm512_mask_sbbr_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case MM512_CVT_ROUNDPD_PSLO (v2, rounding) =>
      _mm512_cvt_roundpd_pslo(f(v2), f(rounding))
    case MM512_MASK_CVT_ROUNDPD_PSLO (src, k, v2, rounding) =>
      _mm512_mask_cvt_roundpd_pslo(f(src), f(k), f(v2), f(rounding))
    case MM512_CVTFXPNT_ROUNDPD_EPU32LO (v2, rounding) =>
      _mm512_cvtfxpnt_roundpd_epu32lo(f(v2), f(rounding))
    case MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO (src, k, v2, rounding) =>
      _mm512_mask_cvtfxpnt_roundpd_epu32lo(f(src), f(k), f(v2), f(rounding))
    case MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32 (v2, rounding, expadj) =>
      _mm512_cvtfxpnt_round_adjustps_epi32(f(v2), f(rounding), f(expadj))
    case MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32 (v2, rounding, expadj) =>
      _mm512_cvtfxpnt_round_adjustps_epu32(f(v2), f(rounding), f(expadj))
    case MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS (v2, rounding, expadj) =>
      _mm512_cvtfxpnt_round_adjustepu32_ps(f(v2), f(rounding), f(expadj))
    case MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS (src, k, v2, rounding, expadj) =>
      _mm512_mask_cvtfxpnt_round_adjustepu32_ps(f(src), f(k), f(v2), f(rounding), f(expadj))
    case MM512_EXP223_PS (v2) =>
      _mm512_exp223_ps(f(v2))
    case MM512_MASK_EXP223_PS (src, k, v2) =>
      _mm512_mask_exp223_ps(f(src), f(k), f(v2))
    case MM512_FIXUPNAN_PD (v1, v2, v3) =>
      _mm512_fixupnan_pd(f(v1), f(v2), f(v3))
    case MM512_MASK_FIXUPNAN_PD (v1, k, v2, v3) =>
      _mm512_mask_fixupnan_pd(f(v1), f(k), f(v2), f(v3))
    case MM512_FIXUPNAN_PS (v1, v2, v3) =>
      _mm512_fixupnan_ps(f(v1), f(v2), f(v3))
    case MM512_MASK_FIXUPNAN_PS (v1, k, v2, v3) =>
      _mm512_mask_fixupnan_ps(f(v1), f(k), f(v2), f(v3))
    case iDef@MM512_EXTLOADUNPACKHI_EPI32 (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpackhi_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKHI_EPI32 (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpackhi_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKLO_EPI32 (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpacklo_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKLO_EPI32 (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpacklo_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKHI_EPI64 (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpackhi_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKHI_EPI64 (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpackhi_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKLO_EPI64 (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpacklo_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKLO_EPI64 (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpacklo_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKHI_PS (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpackhi_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKHI_PS (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpackhi_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKLO_PS (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpacklo_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKLO_PS (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpacklo_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKHI_PD (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpackhi_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKHI_PD (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpackhi_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKLO_PD (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpacklo_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKLO_PD (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpacklo_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTOREHI_EPI32 (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorehi_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTOREHI_EPI32 (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorehi_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTORELO_EPI32 (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorelo_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTORELO_EPI32 (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorelo_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTOREHI_EPI64 (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorehi_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTOREHI_EPI64 (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorehi_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTORELO_EPI64 (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorelo_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTORELO_EPI64 (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorelo_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTOREHI_PS (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorehi_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTOREHI_PS (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorehi_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTORELO_PS (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorelo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTORELO_PS (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorelo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTOREHI_PD (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorehi_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTOREHI_PD (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorehi_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTORELO_PD (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorelo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTORELO_PD (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorelo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I32LOSCATTER_EPI64 (mv, index, v1, scale, mvOffset) =>
      _mm512_i32loscatter_epi64(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I32LOSCATTER_EPI64 (mv, k, index, v1, scale, mvOffset) =>
      _mm512_mask_i32loscatter_epi64(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKHI_EPI32 (src, mt, mtOffset) =>
      _mm512_loadunpackhi_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKHI_EPI32 (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpackhi_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKLO_EPI32 (src, mt, mtOffset) =>
      _mm512_loadunpacklo_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKLO_EPI32 (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpacklo_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKHI_EPI64 (src, mt, mtOffset) =>
      _mm512_loadunpackhi_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKHI_EPI64 (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpackhi_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKLO_EPI64 (src, mt, mtOffset) =>
      _mm512_loadunpacklo_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKLO_EPI64 (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpacklo_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKHI_PS (src, mt, mtOffset) =>
      _mm512_loadunpackhi_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKHI_PS (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpackhi_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKLO_PS (src, mt, mtOffset) =>
      _mm512_loadunpacklo_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKLO_PS (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpacklo_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKHI_PD (src, mt, mtOffset) =>
      _mm512_loadunpackhi_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKHI_PD (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpackhi_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADUNPACKLO_PD (src, mt, mtOffset) =>
      _mm512_loadunpacklo_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKLO_PD (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpacklo_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTOREHI_EPI32 (mt, v1, mtOffset) =>
      _mm512_packstorehi_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTOREHI_EPI32 (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorehi_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTORELO_EPI32 (mt, v1, mtOffset) =>
      _mm512_packstorelo_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTORELO_EPI32 (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorelo_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTOREHI_EPI64 (mt, v1, mtOffset) =>
      _mm512_packstorehi_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTOREHI_EPI64 (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorehi_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTORELO_EPI64 (mt, v1, mtOffset) =>
      _mm512_packstorelo_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTORELO_EPI64 (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorelo_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTOREHI_PS (mt, v1, mtOffset) =>
      _mm512_packstorehi_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTOREHI_PS (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorehi_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTORELO_PS (mt, v1, mtOffset) =>
      _mm512_packstorelo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTORELO_PS (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorelo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTOREHI_PD (mt, v1, mtOffset) =>
      _mm512_packstorehi_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTOREHI_PD (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorehi_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PACKSTORELO_PD (mt, v1, mtOffset) =>
      _mm512_packstorelo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PACKSTORELO_PD (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorelo_pd(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_COUNTBITS_32 (r1) =>
      _mm_countbits_32(f(r1))
    case MM_COUNTBITS_64 (r1) =>
      _mm_countbits_64(f(r1))
    case MM512_KMOVLHB (k1, k2) =>
      _mm512_kmovlhb(f(k1), f(k2))
    case MM512_CVTFXPNT_ROUNDPD_EPI32LO (v2, rounding) =>
      _mm512_cvtfxpnt_roundpd_epi32lo(f(v2), f(rounding))
    case MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO (src, k, v2, rounding) =>
      _mm512_mask_cvtfxpnt_roundpd_epi32lo(f(src), f(k), f(v2), f(rounding))
    case MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS (v2, rounding, expadj) =>
      _mm512_cvtfxpnt_round_adjustepi32_ps(f(v2), f(rounding), f(expadj))
    case MM512_LOG2AE23_PS (a) =>
      _mm512_log2ae23_ps(f(a))
    case MM512_MASK_LOG2AE23_PS (src, k, a) =>
      _mm512_mask_log2ae23_ps(f(src), f(k), f(a))
    case MM512_FMADD_EPI32 (a, b, c) =>
      _mm512_fmadd_epi32(f(a), f(b), f(c))
    case MM512_MASK_FMADD_EPI32 (a, k, b, c) =>
      _mm512_mask_fmadd_epi32(f(a), f(k), f(b), f(c))
    case MM512_MASK3_FMADD_EPI32 (a, b, c, k) =>
      _mm512_mask3_fmadd_epi32(f(a), f(b), f(c), f(k))
    case MM512_FMADD233_EPI32 (a, b) =>
      _mm512_fmadd233_epi32(f(a), f(b))
    case MM512_MASK_FMADD233_EPI32 (src, k, a, b) =>
      _mm512_mask_fmadd233_epi32(f(src), f(k), f(a), f(b))
    case MM512_FMADD233_ROUND_PS (a, b, rounding) =>
      _mm512_fmadd233_round_ps(f(a), f(b), f(rounding))
    case MM512_MASK_FMADD233_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_fmadd233_round_ps(f(src), f(k), f(a), f(b), f(rounding))

    case Reflect(iDef@MM_PREFETCH (p, i, pOffset), u, es) =>
      reflectMirrored(Reflect(MM_PREFETCH (iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(i, f), iDef.cont.applyTransformer(pOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@LOADBE_I16 (ptr, ptrOffset), u, es) =>
      reflectMirrored(Reflect(LOADBE_I16 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@LOADBE_I32 (ptr, ptrOffset), u, es) =>
      reflectMirrored(Reflect(LOADBE_I32 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@LOADBE_I64 (ptr, ptrOffset), u, es) =>
      reflectMirrored(Reflect(LOADBE_I64 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@STOREBE_I16 (ptr, data, ptrOffset), u, es) =>
      reflectMirrored(Reflect(STOREBE_I16 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@STOREBE_I32 (ptr, data, ptrOffset), u, es) =>
      reflectMirrored(Reflect(STOREBE_I32 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@STOREBE_I64 (ptr, data, ptrOffset), u, es) =>
      reflectMirrored(Reflect(STOREBE_I64 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KANDN (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KANDN (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KAND (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KAND (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KMOV (a), u, es) =>
      reflectMirrored(Reflect(MM512_KMOV (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KNOT (a), u, es) =>
      reflectMirrored(Reflect(MM512_KNOT (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KOR (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KOR (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KXNOR (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KXNOR (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KXOR (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KXOR (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOAD_PS (mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOAD_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOAD_PS (src, k, mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOAD_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOAD_EPI32 (mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOAD_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOAD_EPI32 (src, k, mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOAD_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOAD_PD (mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOAD_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOAD_PD (src, k, mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOAD_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOAD_EPI64 (mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOAD_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOAD_EPI64 (src, k, mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOAD_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SWIZZLE_PS (v, s), u, es) =>
      reflectMirrored(Reflect(MM512_SWIZZLE_PS (f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SWIZZLE_PD (v, s), u, es) =>
      reflectMirrored(Reflect(MM512_SWIZZLE_PD (f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SWIZZLE_EPI32 (v, s), u, es) =>
      reflectMirrored(Reflect(MM512_SWIZZLE_EPI32 (f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SWIZZLE_EPI64 (v, s), u, es) =>
      reflectMirrored(Reflect(MM512_SWIZZLE_EPI64 (f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SWIZZLE_PS (src, k, v, s), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SWIZZLE_PS (f(src), f(k), f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SWIZZLE_PD (src, k, v, s), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SWIZZLE_PD (f(src), f(k), f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SWIZZLE_EPI32 (src, k, v, s), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SWIZZLE_EPI32 (f(src), f(k), f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SWIZZLE_EPI64 (src, k, v, s), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SWIZZLE_EPI64 (f(src), f(k), f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTSTORE_PS (mt, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTSTORE_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTSTORE_EPI32 (mt, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTSTORE_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTSTORE_PD (mt, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTSTORE_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTSTORE_EPI64 (mt, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTSTORE_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTSTORE_PS (mt, k, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTSTORE_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTSTORE_PD (mt, k, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTSTORE_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTSTORE_EPI32 (mt, k, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTSTORE_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTSTORE_EPI64 (mt, k, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTSTORE_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORENR_PS (mt, v, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORENR_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORENR_PD (mt, v, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORENR_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORENRNGO_PS (mt, v, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORENRNGO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STORENRNGO_PD (mt, v, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STORENRNGO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADC_EPI32 (v2, k2, v3, k2_res, k2_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADC_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADC_EPI32 (v2, k1, k2, v3, k2_res, k2_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADC_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDN_PD (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_ADDN_PD (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDN_PD (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDN_PD (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDN_PS (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_ADDN_PS (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDN_PS (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDN_PS (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDN_ROUND_PD (v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ADDN_ROUND_PD (f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDN_ROUND_PD (src, k, v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDN_ROUND_PD (f(src), f(k), f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDN_ROUND_PS (v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ADDN_ROUND_PS (f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDN_ROUND_PS (src, k, v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDN_ROUND_PS (f(src), f(k), f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_PD (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_PD (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_PD (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_PD (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_PS (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_PS (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_PS (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_PS (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_ROUND_PD (v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_ROUND_PD (f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_ROUND_PD (src, k, v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_ROUND_PD (f(src), f(k), f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_ROUND_PS (v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_ROUND_PS (f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_ROUND_PS (src, k, v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_ROUND_PS (f(src), f(k), f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_EPI32 (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_EPI32 (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_EPI32 (src, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_EPI32 (f(src), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADDSETC_EPI32 (v2, v3, k2_res, k2_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADDSETC_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADDSETC_EPI32 (v2, k, k_old, v3, k2_res, k2_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDSETC_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADDSETS_EPI32 (v2, v3, sign, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADDSETS_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADDSETS_EPI32 (src, k, v2, v3, sign, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDSETS_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADDSETS_PS (v2, v3, sign, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADDSETS_PS (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADDSETS_PS (src, k, v2, v3, sign, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDSETS_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADDSETS_ROUND_PS (v2, v3, sign, rounding, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADDSETS_ROUND_PS (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(rounding, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADDSETS_ROUND_PS (src, k, v2, v3, sign, rounding, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDSETS_ROUND_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(rounding, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SUBSETB_EPI32 (v2, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SUBSETB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SUBSETB_EPI32 (v2, k, k_old, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBSETB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SUBRSETB_EPI32 (v2, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SUBRSETB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SUBRSETB_EPI32 (v2, k, k_old, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBRSETB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SBB_EPI32 (v2, k, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SBB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SBB_EPI32 (v2, k1, k2, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SBB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SBBR_EPI32 (v2, k, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SBBR_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SBBR_EPI32 (v2, k1, k2, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SBBR_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k1, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_PSLO (v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_PSLO (f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_PSLO (src, k, v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_PSLO (f(src), f(k), f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUNDPD_EPU32LO (v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUNDPD_EPU32LO (f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO (src, k, v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO (f(src), f(k), f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32 (v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32 (f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32 (v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32 (f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS (v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS (f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS (src, k, v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS (f(src), f(k), f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP223_PS (v2), u, es) =>
      reflectMirrored(Reflect(MM512_EXP223_PS (f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP223_PS (src, k, v2), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP223_PS (f(src), f(k), f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPNAN_PD (v1, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPNAN_PD (f(v1), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPNAN_PD (v1, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPNAN_PD (f(v1), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPNAN_PS (v1, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPNAN_PS (f(v1), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPNAN_PS (v1, k, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPNAN_PS (f(v1), f(k), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKHI_EPI32 (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKHI_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKHI_EPI32 (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKHI_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKLO_EPI32 (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKLO_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKLO_EPI32 (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKLO_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKHI_EPI64 (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKHI_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKHI_EPI64 (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKHI_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKLO_EPI64 (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKLO_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKLO_EPI64 (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKLO_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKHI_PS (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKHI_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKHI_PS (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKHI_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKLO_PS (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKLO_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKLO_PS (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKLO_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKHI_PD (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKHI_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKHI_PD (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKHI_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKLO_PD (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKLO_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKLO_PD (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKLO_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTOREHI_EPI32 (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTOREHI_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTOREHI_EPI32 (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTOREHI_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTORELO_EPI32 (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTORELO_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTORELO_EPI32 (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTORELO_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTOREHI_EPI64 (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTOREHI_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTOREHI_EPI64 (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTOREHI_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTORELO_EPI64 (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTORELO_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTORELO_EPI64 (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTORELO_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTOREHI_PS (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTOREHI_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTOREHI_PS (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTOREHI_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTORELO_PS (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTORELO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTORELO_PS (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTORELO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTOREHI_PD (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTOREHI_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTOREHI_PD (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTOREHI_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTORELO_PD (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTORELO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTORELO_PD (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTORELO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32LOSCATTER_EPI64 (mv, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32LOSCATTER_EPI64 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32LOSCATTER_EPI64 (mv, k, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32LOSCATTER_EPI64 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKHI_EPI32 (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKHI_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKHI_EPI32 (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKHI_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKLO_EPI32 (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKLO_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKLO_EPI32 (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKLO_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKHI_EPI64 (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKHI_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKHI_EPI64 (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKHI_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKLO_EPI64 (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKLO_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKLO_EPI64 (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKLO_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKHI_PS (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKHI_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKHI_PS (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKHI_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKLO_PS (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKLO_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKLO_PS (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKLO_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKHI_PD (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKHI_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKHI_PD (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKHI_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADUNPACKLO_PD (src, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADUNPACKLO_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKLO_PD (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKLO_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTOREHI_EPI32 (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTOREHI_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTOREHI_EPI32 (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTOREHI_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTORELO_EPI32 (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTORELO_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTORELO_EPI32 (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTORELO_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTOREHI_EPI64 (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTOREHI_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTOREHI_EPI64 (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTOREHI_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTORELO_EPI64 (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTORELO_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTORELO_EPI64 (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTORELO_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTOREHI_PS (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTOREHI_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTOREHI_PS (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTOREHI_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTORELO_PS (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTORELO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTORELO_PS (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTORELO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTOREHI_PD (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTOREHI_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTOREHI_PD (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTOREHI_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTORELO_PD (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTORELO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTORELO_PD (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTORELO_PD (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COUNTBITS_32 (r1), u, es) =>
      reflectMirrored(Reflect(MM_COUNTBITS_32 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COUNTBITS_64 (r1), u, es) =>
      reflectMirrored(Reflect(MM_COUNTBITS_64 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KMOVLHB (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KMOVLHB (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUNDPD_EPI32LO (v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUNDPD_EPI32LO (f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO (src, k, v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO (f(src), f(k), f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS (v2, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS (f(v2), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG2AE23_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG2AE23_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG2AE23_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG2AE23_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD_EPI32 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD_EPI32 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD_EPI32 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD_EPI32 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADD_EPI32 (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADD_EPI32 (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD233_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD233_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD233_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD233_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD233_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD233_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD233_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD233_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenKNC00 extends CGenIntrinsics {

  val IR: KNC
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM_PREFETCH(p, i, pOffset) =>
      stream.println(s"_mm_prefetch(${quote(p) + (if(pOffset == Const(0)) "" else " + " + quote(pOffset))}, ${quote(i)});")
    case LOADBE_I16(ptr, ptrOffset) =>
      emitValDef(sym, s"_loadbe_i16(${quote(ptr) + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))})")
    case LOADBE_I32(ptr, ptrOffset) =>
      emitValDef(sym, s"_loadbe_i32(${quote(ptr) + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))})")
    case LOADBE_I64(ptr, ptrOffset) =>
      emitValDef(sym, s"_loadbe_i64(${quote(ptr) + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))})")
    case STOREBE_I16(ptr, data, ptrOffset) =>
      stream.println(s"_storebe_i16(${quote(ptr) + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}, ${quote(data)});")
    case STOREBE_I32(ptr, data, ptrOffset) =>
      stream.println(s"_storebe_i32(${quote(ptr) + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}, ${quote(data)});")
    case STOREBE_I64(ptr, data, ptrOffset) =>
      stream.println(s"_storebe_i64(${quote(ptr) + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}, ${quote(data)});")
    case MM512_KANDN(a, b) =>
      emitValDef(sym, s"_mm512_kandn(${quote(a)}, ${quote(b)})")
    case MM512_KAND(a, b) =>
      emitValDef(sym, s"_mm512_kand(${quote(a)}, ${quote(b)})")
    case MM512_KMOV(a) =>
      emitValDef(sym, s"_mm512_kmov(${quote(a)})")
    case MM512_KNOT(a) =>
      emitValDef(sym, s"_mm512_knot(${quote(a)})")
    case MM512_KOR(a, b) =>
      emitValDef(sym, s"_mm512_kor(${quote(a)}, ${quote(b)})")
    case MM512_KXNOR(a, b) =>
      emitValDef(sym, s"_mm512_kxnor(${quote(a)}, ${quote(b)})")
    case MM512_KXOR(a, b) =>
      emitValDef(sym, s"_mm512_kxor(${quote(a)}, ${quote(b)})")
    case MM512_CMPLT_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmplt_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLT_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmplt_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_EXTLOAD_PS(mt, conv, bc, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extload_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case MM512_MASK_EXTLOAD_PS(src, k, mt, conv, bc, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extload_ps(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case MM512_EXTLOAD_EPI32(mt, conv, bc, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extload_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case MM512_MASK_EXTLOAD_EPI32(src, k, mt, conv, bc, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extload_epi32(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case MM512_EXTLOAD_PD(mt, conv, bc, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extload_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case MM512_MASK_EXTLOAD_PD(src, k, mt, conv, bc, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extload_pd(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case MM512_EXTLOAD_EPI64(mt, conv, bc, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extload_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case MM512_MASK_EXTLOAD_EPI64(src, k, mt, conv, bc, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extload_epi64(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case MM512_SWIZZLE_PS(v, s) =>
      emitValDef(sym, s"_mm512_swizzle_ps(${quote(v)}, ${quote(s)})")
    case MM512_SWIZZLE_PD(v, s) =>
      emitValDef(sym, s"_mm512_swizzle_pd(${quote(v)}, ${quote(s)})")
    case MM512_SWIZZLE_EPI32(v, s) =>
      emitValDef(sym, s"_mm512_swizzle_epi32(${quote(v)}, ${quote(s)})")
    case MM512_SWIZZLE_EPI64(v, s) =>
      emitValDef(sym, s"_mm512_swizzle_epi64(${quote(v)}, ${quote(s)})")
    case MM512_MASK_SWIZZLE_PS(src, k, v, s) =>
      emitValDef(sym, s"_mm512_mask_swizzle_ps(${quote(src)}, ${quote(k)}, ${quote(v)}, ${quote(s)})")
    case MM512_MASK_SWIZZLE_PD(src, k, v, s) =>
      emitValDef(sym, s"_mm512_mask_swizzle_pd(${quote(src)}, ${quote(k)}, ${quote(v)}, ${quote(s)})")
    case MM512_MASK_SWIZZLE_EPI32(src, k, v, s) =>
      emitValDef(sym, s"_mm512_mask_swizzle_epi32(${quote(src)}, ${quote(k)}, ${quote(v)}, ${quote(s)})")
    case MM512_MASK_SWIZZLE_EPI64(src, k, v, s) =>
      emitValDef(sym, s"_mm512_mask_swizzle_epi64(${quote(src)}, ${quote(k)}, ${quote(v)}, ${quote(s)})")
    case MM512_EXTSTORE_PS(mt, v, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extstore_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTSTORE_EPI32(mt, v, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extstore_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTSTORE_PD(mt, v, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extstore_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTSTORE_EPI64(mt, v, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extstore_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTSTORE_PS(mt, k, v, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extstore_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTSTORE_PD(mt, k, v, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extstore_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTSTORE_EPI32(mt, k, v, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extstore_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTSTORE_EPI64(mt, k, v, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extstore_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_STORENR_PS(mt, v, mtOffset) =>
      stream.println(s"_mm512_storenr_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v)});")
    case MM512_STORENR_PD(mt, v, mtOffset) =>
      stream.println(s"_mm512_storenr_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v)});")
    case MM512_STORENRNGO_PS(mt, v, mtOffset) =>
      stream.println(s"_mm512_storenrngo_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v)});")
    case MM512_STORENRNGO_PD(mt, v, mtOffset) =>
      stream.println(s"_mm512_storenrngo_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v)});")
    case MM512_ADC_EPI32(v2, k2, v3, k2_res, k2_resOffset) =>
      emitValDef(sym, s"_mm512_adc_epi32(${quote(v2)}, ${quote(k2)}, ${quote(v3)}, ${quote(k2_res) + (if(k2_resOffset == Const(0)) "" else " + " + quote(k2_resOffset))})")
    case MM512_MASK_ADC_EPI32(v2, k1, k2, v3, k2_res, k2_resOffset) =>
      emitValDef(sym, s"_mm512_mask_adc_epi32(${quote(v2)}, ${quote(k1)}, ${quote(k2)}, ${quote(v3)}, ${quote(k2_res) + (if(k2_resOffset == Const(0)) "" else " + " + quote(k2_resOffset))})")
    case MM512_ADDN_PD(v2, v3) =>
      emitValDef(sym, s"_mm512_addn_pd(${quote(v2)}, ${quote(v3)})")
    case MM512_MASK_ADDN_PD(src, k, v2, v3) =>
      emitValDef(sym, s"_mm512_mask_addn_pd(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case MM512_ADDN_PS(v2, v3) =>
      emitValDef(sym, s"_mm512_addn_ps(${quote(v2)}, ${quote(v3)})")
    case MM512_MASK_ADDN_PS(src, k, v2, v3) =>
      emitValDef(sym, s"_mm512_mask_addn_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case MM512_ADDN_ROUND_PD(v2, v3, rounding) =>
      emitValDef(sym, s"_mm512_addn_round_pd(${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case MM512_MASK_ADDN_ROUND_PD(src, k, v2, v3, rounding) =>
      emitValDef(sym, s"_mm512_mask_addn_round_pd(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case MM512_ADDN_ROUND_PS(v2, v3, rounding) =>
      emitValDef(sym, s"_mm512_addn_round_ps(${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case MM512_MASK_ADDN_ROUND_PS(src, k, v2, v3, rounding) =>
      emitValDef(sym, s"_mm512_mask_addn_round_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case MM512_SUBR_PD(v2, v3) =>
      emitValDef(sym, s"_mm512_subr_pd(${quote(v2)}, ${quote(v3)})")
    case MM512_MASK_SUBR_PD(src, k, v2, v3) =>
      emitValDef(sym, s"_mm512_mask_subr_pd(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case MM512_SUBR_PS(v2, v3) =>
      emitValDef(sym, s"_mm512_subr_ps(${quote(v2)}, ${quote(v3)})")
    case MM512_MASK_SUBR_PS(src, k, v2, v3) =>
      emitValDef(sym, s"_mm512_mask_subr_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case MM512_SUBR_ROUND_PD(v2, v3, rounding) =>
      emitValDef(sym, s"_mm512_subr_round_pd(${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case MM512_MASK_SUBR_ROUND_PD(src, k, v2, v3, rounding) =>
      emitValDef(sym, s"_mm512_mask_subr_round_pd(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case MM512_SUBR_ROUND_PS(v2, v3, rounding) =>
      emitValDef(sym, s"_mm512_subr_round_ps(${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case MM512_MASK_SUBR_ROUND_PS(src, k, v2, v3, rounding) =>
      emitValDef(sym, s"_mm512_mask_subr_round_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case MM512_SUBR_EPI32(v2, v3) =>
      emitValDef(sym, s"_mm512_subr_epi32(${quote(v2)}, ${quote(v3)})")
    case MM512_MASK_SUBR_EPI32(src, k, v2, v3) =>
      emitValDef(sym, s"_mm512_mask_subr_epi32(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case MM512_ADDSETC_EPI32(v2, v3, k2_res, k2_resOffset) =>
      emitValDef(sym, s"_mm512_addsetc_epi32(${quote(v2)}, ${quote(v3)}, ${quote(k2_res) + (if(k2_resOffset == Const(0)) "" else " + " + quote(k2_resOffset))})")
    case MM512_MASK_ADDSETC_EPI32(v2, k, k_old, v3, k2_res, k2_resOffset) =>
      emitValDef(sym, s"_mm512_mask_addsetc_epi32(${quote(v2)}, ${quote(k)}, ${quote(k_old)}, ${quote(v3)}, ${quote(k2_res) + (if(k2_resOffset == Const(0)) "" else " + " + quote(k2_resOffset))})")
    case MM512_ADDSETS_EPI32(v2, v3, sign, signOffset) =>
      emitValDef(sym, s"_mm512_addsets_epi32(${quote(v2)}, ${quote(v3)}, ${quote(sign) + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))})")
    case MM512_MASK_ADDSETS_EPI32(src, k, v2, v3, sign, signOffset) =>
      emitValDef(sym, s"_mm512_mask_addsets_epi32(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(sign) + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))})")
    case MM512_ADDSETS_PS(v2, v3, sign, signOffset) =>
      emitValDef(sym, s"_mm512_addsets_ps(${quote(v2)}, ${quote(v3)}, ${quote(sign) + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))})")
    case MM512_MASK_ADDSETS_PS(src, k, v2, v3, sign, signOffset) =>
      emitValDef(sym, s"_mm512_mask_addsets_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(sign) + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))})")
    case MM512_ADDSETS_ROUND_PS(v2, v3, sign, rounding, signOffset) =>
      emitValDef(sym, s"_mm512_addsets_round_ps(${quote(v2)}, ${quote(v3)}, ${quote(sign) + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))}, ${quote(rounding)})")
    case MM512_MASK_ADDSETS_ROUND_PS(src, k, v2, v3, sign, rounding, signOffset) =>
      emitValDef(sym, s"_mm512_mask_addsets_round_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(sign) + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))}, ${quote(rounding)})")
    case MM512_SUBSETB_EPI32(v2, v3, borrow, borrowOffset) =>
      emitValDef(sym, s"_mm512_subsetb_epi32(${quote(v2)}, ${quote(v3)}, ${quote(borrow) + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))})")
    case MM512_MASK_SUBSETB_EPI32(v2, k, k_old, v3, borrow, borrowOffset) =>
      emitValDef(sym, s"_mm512_mask_subsetb_epi32(${quote(v2)}, ${quote(k)}, ${quote(k_old)}, ${quote(v3)}, ${quote(borrow) + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))})")
    case MM512_SUBRSETB_EPI32(v2, v3, borrow, borrowOffset) =>
      emitValDef(sym, s"_mm512_subrsetb_epi32(${quote(v2)}, ${quote(v3)}, ${quote(borrow) + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))})")
    case MM512_MASK_SUBRSETB_EPI32(v2, k, k_old, v3, borrow, borrowOffset) =>
      emitValDef(sym, s"_mm512_mask_subrsetb_epi32(${quote(v2)}, ${quote(k)}, ${quote(k_old)}, ${quote(v3)}, ${quote(borrow) + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))})")
    case MM512_SBB_EPI32(v2, k, v3, borrow, borrowOffset) =>
      emitValDef(sym, s"_mm512_sbb_epi32(${quote(v2)}, ${quote(k)}, ${quote(v3)}, ${quote(borrow) + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))})")
    case MM512_MASK_SBB_EPI32(v2, k1, k2, v3, borrow, borrowOffset) =>
      emitValDef(sym, s"_mm512_mask_sbb_epi32(${quote(v2)}, ${quote(k1)}, ${quote(k2)}, ${quote(v3)}, ${quote(borrow) + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))})")
    case MM512_SBBR_EPI32(v2, k, v3, borrow, borrowOffset) =>
      emitValDef(sym, s"_mm512_sbbr_epi32(${quote(v2)}, ${quote(k)}, ${quote(v3)}, ${quote(borrow) + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))})")
    case MM512_MASK_SBBR_EPI32(v2, k1, k2, v3, borrow, borrowOffset) =>
      emitValDef(sym, s"_mm512_mask_sbbr_epi32(${quote(v2)}, ${quote(k1)}, ${quote(k2)}, ${quote(v3)}, ${quote(borrow) + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))})")
    case MM512_CVT_ROUNDPD_PSLO(v2, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundpd_pslo(${quote(v2)}, ${quote(rounding)})")
    case MM512_MASK_CVT_ROUNDPD_PSLO(src, k, v2, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_pslo(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(rounding)})")
    case MM512_CVTFXPNT_ROUNDPD_EPU32LO(v2, rounding) =>
      emitValDef(sym, s"_mm512_cvtfxpnt_roundpd_epu32lo(${quote(v2)}, ${quote(rounding)})")
    case MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO(src, k, v2, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvtfxpnt_roundpd_epu32lo(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(rounding)})")
    case MM512_CVTFXPNT_ROUND_ADJUSTPS_EPI32(v2, rounding, expadj) =>
      emitValDef(sym, s"_mm512_cvtfxpnt_round_adjustps_epi32(${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case MM512_CVTFXPNT_ROUND_ADJUSTPS_EPU32(v2, rounding, expadj) =>
      emitValDef(sym, s"_mm512_cvtfxpnt_round_adjustps_epu32(${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case MM512_CVTFXPNT_ROUND_ADJUSTEPU32_PS(v2, rounding, expadj) =>
      emitValDef(sym, s"_mm512_cvtfxpnt_round_adjustepu32_ps(${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case MM512_MASK_CVTFXPNT_ROUND_ADJUSTEPU32_PS(src, k, v2, rounding, expadj) =>
      emitValDef(sym, s"_mm512_mask_cvtfxpnt_round_adjustepu32_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case MM512_EXP223_PS(v2) =>
      emitValDef(sym, s"_mm512_exp223_ps(${quote(v2)})")
    case MM512_MASK_EXP223_PS(src, k, v2) =>
      emitValDef(sym, s"_mm512_mask_exp223_ps(${quote(src)}, ${quote(k)}, ${quote(v2)})")
    case MM512_FIXUPNAN_PD(v1, v2, v3) =>
      emitValDef(sym, s"_mm512_fixupnan_pd(${quote(v1)}, ${quote(v2)}, ${quote(v3)})")
    case MM512_MASK_FIXUPNAN_PD(v1, k, v2, v3) =>
      emitValDef(sym, s"_mm512_mask_fixupnan_pd(${quote(v1)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case MM512_FIXUPNAN_PS(v1, v2, v3) =>
      emitValDef(sym, s"_mm512_fixupnan_ps(${quote(v1)}, ${quote(v2)}, ${quote(v3)})")
    case MM512_MASK_FIXUPNAN_PS(v1, k, v2, v3) =>
      emitValDef(sym, s"_mm512_mask_fixupnan_ps(${quote(v1)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)})")
    case MM512_EXTLOADUNPACKHI_EPI32(src, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extloadunpackhi_epi32(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_MASK_EXTLOADUNPACKHI_EPI32(src, k, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extloadunpackhi_epi32(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_EXTLOADUNPACKLO_EPI32(src, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extloadunpacklo_epi32(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_MASK_EXTLOADUNPACKLO_EPI32(src, k, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extloadunpacklo_epi32(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_EXTLOADUNPACKHI_EPI64(src, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extloadunpackhi_epi64(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_MASK_EXTLOADUNPACKHI_EPI64(src, k, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extloadunpackhi_epi64(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_EXTLOADUNPACKLO_EPI64(src, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extloadunpacklo_epi64(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_MASK_EXTLOADUNPACKLO_EPI64(src, k, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extloadunpacklo_epi64(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_EXTLOADUNPACKHI_PS(src, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extloadunpackhi_ps(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_MASK_EXTLOADUNPACKHI_PS(src, k, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extloadunpackhi_ps(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_EXTLOADUNPACKLO_PS(src, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extloadunpacklo_ps(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_MASK_EXTLOADUNPACKLO_PS(src, k, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extloadunpacklo_ps(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_EXTLOADUNPACKHI_PD(src, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extloadunpackhi_pd(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_MASK_EXTLOADUNPACKHI_PD(src, k, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extloadunpackhi_pd(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_EXTLOADUNPACKLO_PD(src, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_extloadunpacklo_pd(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_MASK_EXTLOADUNPACKLO_PD(src, k, mt, conv, hint, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_extloadunpacklo_pd(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(conv)}, ${quote(hint)})")
    case MM512_EXTPACKSTOREHI_EPI32(mt, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extpackstorehi_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTPACKSTOREHI_EPI32(mt, k, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extpackstorehi_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTPACKSTORELO_EPI32(mt, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extpackstorelo_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTPACKSTORELO_EPI32(mt, k, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extpackstorelo_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTPACKSTOREHI_EPI64(mt, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extpackstorehi_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTPACKSTOREHI_EPI64(mt, k, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extpackstorehi_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTPACKSTORELO_EPI64(mt, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extpackstorelo_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTPACKSTORELO_EPI64(mt, k, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extpackstorelo_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTPACKSTOREHI_PS(mt, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extpackstorehi_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTPACKSTOREHI_PS(mt, k, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extpackstorehi_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTPACKSTORELO_PS(mt, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extpackstorelo_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTPACKSTORELO_PS(mt, k, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extpackstorelo_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTPACKSTOREHI_PD(mt, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extpackstorehi_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTPACKSTOREHI_PD(mt, k, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extpackstorehi_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_EXTPACKSTORELO_PD(mt, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_extpackstorelo_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_MASK_EXTPACKSTORELO_PD(mt, k, v1, conv, hint, mtOffset) =>
      stream.println(s"_mm512_mask_extpackstorelo_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case MM512_I32LOSCATTER_EPI64(mv, index, v1, scale, mvOffset) =>
      stream.println(s"_mm512_i32loscatter_epi64(${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case MM512_MASK_I32LOSCATTER_EPI64(mv, k, index, v1, scale, mvOffset) =>
      stream.println(s"_mm512_mask_i32loscatter_epi64(${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case MM512_LOADUNPACKHI_EPI32(src, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_loadunpackhi_epi32(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_MASK_LOADUNPACKHI_EPI32(src, k, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_loadunpackhi_epi32(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_LOADUNPACKLO_EPI32(src, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_loadunpacklo_epi32(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_MASK_LOADUNPACKLO_EPI32(src, k, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_loadunpacklo_epi32(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_LOADUNPACKHI_EPI64(src, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_loadunpackhi_epi64(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_MASK_LOADUNPACKHI_EPI64(src, k, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_loadunpackhi_epi64(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_LOADUNPACKLO_EPI64(src, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_loadunpacklo_epi64(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_MASK_LOADUNPACKLO_EPI64(src, k, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_loadunpacklo_epi64(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_LOADUNPACKHI_PS(src, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_loadunpackhi_ps(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_MASK_LOADUNPACKHI_PS(src, k, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_loadunpackhi_ps(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_LOADUNPACKLO_PS(src, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_loadunpacklo_ps(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_MASK_LOADUNPACKLO_PS(src, k, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_loadunpacklo_ps(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_LOADUNPACKHI_PD(src, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_loadunpackhi_pd(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_MASK_LOADUNPACKHI_PD(src, k, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_loadunpackhi_pd(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_LOADUNPACKLO_PD(src, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_loadunpacklo_pd(${quote(src)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_MASK_LOADUNPACKLO_PD(src, k, mt, mtOffset) =>
      emitValDef(sym, s"_mm512_mask_loadunpacklo_pd(${quote(src)}, ${quote(k)}, ${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))})")
    case MM512_PACKSTOREHI_EPI32(mt, v1, mtOffset) =>
      stream.println(s"_mm512_packstorehi_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)});")
    case MM512_MASK_PACKSTOREHI_EPI32(mt, k, v1, mtOffset) =>
      stream.println(s"_mm512_mask_packstorehi_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)});")
    case MM512_PACKSTORELO_EPI32(mt, v1, mtOffset) =>
      stream.println(s"_mm512_packstorelo_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)});")
    case MM512_MASK_PACKSTORELO_EPI32(mt, k, v1, mtOffset) =>
      stream.println(s"_mm512_mask_packstorelo_epi32(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)});")
    case MM512_PACKSTOREHI_EPI64(mt, v1, mtOffset) =>
      stream.println(s"_mm512_packstorehi_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)});")
    case MM512_MASK_PACKSTOREHI_EPI64(mt, k, v1, mtOffset) =>
      stream.println(s"_mm512_mask_packstorehi_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)});")
    case MM512_PACKSTORELO_EPI64(mt, v1, mtOffset) =>
      stream.println(s"_mm512_packstorelo_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)});")
    case MM512_MASK_PACKSTORELO_EPI64(mt, k, v1, mtOffset) =>
      stream.println(s"_mm512_mask_packstorelo_epi64(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)});")
    case MM512_PACKSTOREHI_PS(mt, v1, mtOffset) =>
      stream.println(s"_mm512_packstorehi_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)});")
    case MM512_MASK_PACKSTOREHI_PS(mt, k, v1, mtOffset) =>
      stream.println(s"_mm512_mask_packstorehi_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)});")
    case MM512_PACKSTORELO_PS(mt, v1, mtOffset) =>
      stream.println(s"_mm512_packstorelo_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)});")
    case MM512_MASK_PACKSTORELO_PS(mt, k, v1, mtOffset) =>
      stream.println(s"_mm512_mask_packstorelo_ps(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)});")
    case MM512_PACKSTOREHI_PD(mt, v1, mtOffset) =>
      stream.println(s"_mm512_packstorehi_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)});")
    case MM512_MASK_PACKSTOREHI_PD(mt, k, v1, mtOffset) =>
      stream.println(s"_mm512_mask_packstorehi_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)});")
    case MM512_PACKSTORELO_PD(mt, v1, mtOffset) =>
      stream.println(s"_mm512_packstorelo_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(v1)});")
    case MM512_MASK_PACKSTORELO_PD(mt, k, v1, mtOffset) =>
      stream.println(s"_mm512_mask_packstorelo_pd(${quote(mt) + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}, ${quote(k)}, ${quote(v1)});")
    case MM_COUNTBITS_32(r1) =>
      emitValDef(sym, s"_mm_countbits_32(${quote(r1)})")
    case MM_COUNTBITS_64(r1) =>
      emitValDef(sym, s"_mm_countbits_64(${quote(r1)})")
    case MM512_KMOVLHB(k1, k2) =>
      emitValDef(sym, s"_mm512_kmovlhb(${quote(k1)}, ${quote(k2)})")
    case MM512_CVTFXPNT_ROUNDPD_EPI32LO(v2, rounding) =>
      emitValDef(sym, s"_mm512_cvtfxpnt_roundpd_epi32lo(${quote(v2)}, ${quote(rounding)})")
    case MM512_MASK_CVTFXPNT_ROUNDPD_EPI32LO(src, k, v2, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvtfxpnt_roundpd_epi32lo(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(rounding)})")
    case MM512_CVTFXPNT_ROUND_ADJUSTEPI32_PS(v2, rounding, expadj) =>
      emitValDef(sym, s"_mm512_cvtfxpnt_round_adjustepi32_ps(${quote(v2)}, ${quote(rounding)}, ${quote(expadj)})")
    case MM512_LOG2AE23_PS(a) =>
      emitValDef(sym, s"_mm512_log2ae23_ps(${quote(a)})")
    case MM512_MASK_LOG2AE23_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_log2ae23_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_FMADD_EPI32(a, b, c) =>
      emitValDef(sym, s"_mm512_fmadd_epi32(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_FMADD_EPI32(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_fmadd_epi32(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK3_FMADD_EPI32(a, b, c, k) =>
      emitValDef(sym, s"_mm512_mask3_fmadd_epi32(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM512_FMADD233_EPI32(a, b) =>
      emitValDef(sym, s"_mm512_fmadd233_epi32(${quote(a)}, ${quote(b)})")
    case MM512_MASK_FMADD233_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_fmadd233_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_FMADD233_ROUND_PS(a, b, rounding) =>
      emitValDef(sym, s"_mm512_fmadd233_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASK_FMADD233_ROUND_PS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_mask_fmadd233_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case _ => super.emitNode(sym, rhs)
  }
}
