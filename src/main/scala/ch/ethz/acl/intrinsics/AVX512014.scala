package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
trait AVX512014 extends IntrinsicsBase {
  /**
   * Load contiguous active 32-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_EXPAND_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_EXPANDLOADU_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_EXPAND_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_EXPANDLOADU_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_EXPAND_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_EXPANDLOADU_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_EXPAND_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_EXPANDLOADU_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_EXPAND_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_EXPANDLOADU_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 32-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m256i, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I32GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 32-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m128i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I32GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 32-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m256i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I32GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 32-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m128i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I32GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 64-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m128i, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I64GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 64-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m128i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I64GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m256i, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I64GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m128i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I64GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst".
   * a: __m256i
   */
  case class MM256_LZCNT_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_LZCNT_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_LZCNT_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM_LZCNT_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_LZCNT_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_LZCNT_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst".
   * a: __m256i
   */
  case class MM256_LZCNT_EPI64(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_LZCNT_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_LZCNT_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM_LZCNT_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_LZCNT_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_LZCNT_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MADDUBS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MADDUBS_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Vertically multiply each unsigned 8-bit integer from "a" with the
   * corresponding signed 8-bit integer from "b", producing intermediate signed
   * 16-bit integers. Horizontally add adjacent pairs of intermediate signed 16-bit
   * integers, and pack the saturated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MADDUBS_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MADDUBS_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MADDUBS_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MADDUBS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MADDUBS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MADD_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MADD_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MADD_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MADD_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MADD_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MADD_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MADD_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPU8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPU8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPU32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPU32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPU64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPU64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPU64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPU64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPU64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MIN_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MIN_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MIN_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPU8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPU8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MIN_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPU32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPU32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPU64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPU64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MIN_EPU64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPU64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPU64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MIN_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 8-bit integer in "a".
   * a: __m256i
   */
  case class MM256_MOVEPI8_MASK(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 8-bit integer in "a".
   * a: __m512i
   */
  case class MM512_MOVEPI8_MASK(a: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 8-bit integer in "a".
   * a: __m128i
   */
  case class MM_MOVEPI8_MASK(a: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 32-bit integer in "a".
   * a: __m256i
   */
  case class MM256_MOVEPI32_MASK(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 32-bit integer in "a".
   * a: __m512i
   */
  case class MM512_MOVEPI32_MASK(a: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 32-bit integer in "a".
   * a: __m128i
   */
  case class MM_MOVEPI32_MASK(a: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI32_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI32_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI32_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI32_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI32_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI32_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI32_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI32_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI32_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI32_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 8-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask32
   */
  case class MM256_MOVM_EPI8(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 8-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask64
   */
  case class MM512_MOVM_EPI8(k: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 8-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask16
   */
  case class MM_MOVM_EPI8(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 32-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM256_MOVM_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 32-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask16
   */
  case class MM512_MOVM_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 32-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM_MOVM_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 64-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM256_MOVM_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 64-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM512_MOVM_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 64-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM_MOVM_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 16-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask16
   */
  case class MM256_MOVM_EPI16(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 16-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask32
   */
  case class MM512_MOVM_EPI16(k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 16-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM_MOVM_EPI16(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 64-bit integer in "a".
   * a: __m256i
   */
  case class MM256_MOVEPI64_MASK(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_maskz_expand_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_EXPAND_EPI32(k, a)
  }
            
  def _mm_maskz_expandloadu_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKZ_EXPANDLOADU_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_expand_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_EXPAND_EPI64(src, k, a)
  }
            
  def _mm256_mask_expandloadu_epi64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_expand_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_EXPAND_EPI64(k, a)
  }
            
  def _mm256_maskz_expandloadu_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKZ_EXPANDLOADU_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_expand_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_EXPAND_EPI64(src, k, a)
  }
            
  def _mm_mask_expandloadu_epi64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_expand_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_EXPAND_EPI64(k, a)
  }
            
  def _mm_maskz_expandloadu_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKZ_EXPANDLOADU_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mmask_i32gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_MMASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mmask_i32gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MMASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mmask_i32gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_MMASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mmask_i32gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MMASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mmask_i64gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM256_MMASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mmask_i64gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MMASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mmask_i64gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_MMASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mmask_i64gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MMASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_lzcnt_epi32(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_LZCNT_EPI32(a)
  }
            
  def _mm256_mask_lzcnt_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_LZCNT_EPI32(src, k, a)
  }
            
  def _mm256_maskz_lzcnt_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_LZCNT_EPI32(k, a)
  }
            
  def _mm_lzcnt_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_LZCNT_EPI32(a)
  }
            
  def _mm_mask_lzcnt_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_LZCNT_EPI32(src, k, a)
  }
            
  def _mm_maskz_lzcnt_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_LZCNT_EPI32(k, a)
  }
            
  def _mm256_lzcnt_epi64(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_LZCNT_EPI64(a)
  }
            
  def _mm256_mask_lzcnt_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_LZCNT_EPI64(src, k, a)
  }
            
  def _mm256_maskz_lzcnt_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_LZCNT_EPI64(k, a)
  }
            
  def _mm_lzcnt_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_LZCNT_EPI64(a)
  }
            
  def _mm_mask_lzcnt_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_LZCNT_EPI64(src, k, a)
  }
            
  def _mm_maskz_lzcnt_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_LZCNT_EPI64(k, a)
  }
            
  def _mm256_mask_maddubs_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MADDUBS_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_maddubs_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MADDUBS_EPI16(k, a, b)
  }
            
  def _mm512_maddubs_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MADDUBS_EPI16(a, b)
  }
            
  def _mm512_mask_maddubs_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MADDUBS_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_maddubs_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MADDUBS_EPI16(k, a, b)
  }
            
  def _mm_mask_maddubs_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MADDUBS_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_maddubs_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MADDUBS_EPI16(k, a, b)
  }
            
  def _mm256_mask_madd_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MADD_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_madd_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MADD_EPI16(k, a, b)
  }
            
  def _mm512_madd_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MADD_EPI16(a, b)
  }
            
  def _mm512_mask_madd_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MADD_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_madd_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MADD_EPI16(k, a, b)
  }
            
  def _mm_mask_madd_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MADD_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_madd_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MADD_EPI16(k, a, b)
  }
            
  def _mm256_mask_max_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_max_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPI8(k, a, b)
  }
            
  def _mm512_mask_max_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_max_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPI8(k, a, b)
  }
            
  def _mm512_max_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPI8(a, b)
  }
            
  def _mm_mask_max_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_max_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPI8(k, a, b)
  }
            
  def _mm256_mask_max_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_max_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPI32(k, a, b)
  }
            
  def _mm_mask_max_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_max_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPI32(k, a, b)
  }
            
  def _mm256_mask_max_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_max_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPI64(k, a, b)
  }
            
  def _mm256_max_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPI64(a, b)
  }
            
  def _mm_mask_max_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_max_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPI64(k, a, b)
  }
            
  def _mm_max_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPI64(a, b)
  }
            
  def _mm256_mask_max_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_max_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPI16(k, a, b)
  }
            
  def _mm512_mask_max_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_max_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPI16(k, a, b)
  }
            
  def _mm512_max_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPI16(a, b)
  }
            
  def _mm_mask_max_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_max_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPI16(k, a, b)
  }
            
  def _mm256_mask_max_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPU8(src, k, a, b)
  }
            
  def _mm256_maskz_max_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPU8(k, a, b)
  }
            
  def _mm512_mask_max_epu8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPU8(src, k, a, b)
  }
            
  def _mm512_maskz_max_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPU8(k, a, b)
  }
            
  def _mm512_max_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPU8(a, b)
  }
            
  def _mm_mask_max_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPU8(src, k, a, b)
  }
            
  def _mm_maskz_max_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPU8(k, a, b)
  }
            
  def _mm256_mask_max_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPU32(src, k, a, b)
  }
            
  def _mm256_maskz_max_epu32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPU32(k, a, b)
  }
            
  def _mm_mask_max_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPU32(src, k, a, b)
  }
            
  def _mm_maskz_max_epu32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPU32(k, a, b)
  }
            
  def _mm256_mask_max_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPU64(src, k, a, b)
  }
            
  def _mm256_maskz_max_epu64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPU64(k, a, b)
  }
            
  def _mm256_max_epu64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPU64(a, b)
  }
            
  def _mm_mask_max_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPU64(src, k, a, b)
  }
            
  def _mm_maskz_max_epu64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPU64(k, a, b)
  }
            
  def _mm_max_epu64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPU64(a, b)
  }
            
  def _mm256_mask_max_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPU16(src, k, a, b)
  }
            
  def _mm256_maskz_max_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPU16(k, a, b)
  }
            
  def _mm512_mask_max_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPU16(src, k, a, b)
  }
            
  def _mm512_maskz_max_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPU16(k, a, b)
  }
            
  def _mm512_max_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPU16(a, b)
  }
            
  def _mm_mask_max_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPU16(src, k, a, b)
  }
            
  def _mm_maskz_max_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPU16(k, a, b)
  }
            
  def _mm256_mask_min_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_min_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPI8(k, a, b)
  }
            
  def _mm512_mask_min_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_min_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPI8(k, a, b)
  }
            
  def _mm512_min_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MIN_EPI8(a, b)
  }
            
  def _mm_mask_min_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_min_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPI8(k, a, b)
  }
            
  def _mm256_mask_min_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_min_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPI32(k, a, b)
  }
            
  def _mm_mask_min_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_min_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPI32(k, a, b)
  }
            
  def _mm256_mask_min_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_min_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPI64(k, a, b)
  }
            
  def _mm256_min_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MIN_EPI64(a, b)
  }
            
  def _mm_mask_min_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_min_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPI64(k, a, b)
  }
            
  def _mm_min_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPI64(a, b)
  }
            
  def _mm256_mask_min_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_min_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPI16(k, a, b)
  }
            
  def _mm512_mask_min_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_min_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPI16(k, a, b)
  }
            
  def _mm512_min_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MIN_EPI16(a, b)
  }
            
  def _mm_mask_min_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_min_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPI16(k, a, b)
  }
            
  def _mm256_mask_min_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPU8(src, k, a, b)
  }
            
  def _mm256_maskz_min_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPU8(k, a, b)
  }
            
  def _mm512_mask_min_epu8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPU8(src, k, a, b)
  }
            
  def _mm512_maskz_min_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPU8(k, a, b)
  }
            
  def _mm512_min_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MIN_EPU8(a, b)
  }
            
  def _mm_mask_min_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPU8(src, k, a, b)
  }
            
  def _mm_maskz_min_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPU8(k, a, b)
  }
            
  def _mm256_mask_min_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPU32(src, k, a, b)
  }
            
  def _mm256_maskz_min_epu32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPU32(k, a, b)
  }
            
  def _mm_mask_min_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPU32(src, k, a, b)
  }
            
  def _mm_maskz_min_epu32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPU32(k, a, b)
  }
            
  def _mm256_mask_min_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPU64(src, k, a, b)
  }
            
  def _mm256_maskz_min_epu64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPU64(k, a, b)
  }
            
  def _mm256_min_epu64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MIN_EPU64(a, b)
  }
            
  def _mm_mask_min_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPU64(src, k, a, b)
  }
            
  def _mm_maskz_min_epu64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPU64(k, a, b)
  }
            
  def _mm_min_epu64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPU64(a, b)
  }
            
  def _mm256_mask_min_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPU16(src, k, a, b)
  }
            
  def _mm256_maskz_min_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPU16(k, a, b)
  }
            
  def _mm512_mask_min_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPU16(src, k, a, b)
  }
            
  def _mm512_maskz_min_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPU16(k, a, b)
  }
            
  def _mm512_min_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MIN_EPU16(a, b)
  }
            
  def _mm_mask_min_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPU16(src, k, a, b)
  }
            
  def _mm_maskz_min_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPU16(k, a, b)
  }
            
  def _mm256_movepi8_mask(a: Exp[__m256i]): Exp[Int] = {
    MM256_MOVEPI8_MASK(a)
  }
            
  def _mm512_movepi8_mask(a: Exp[__m512i]): Exp[Long] = {
    MM512_MOVEPI8_MASK(a)
  }
            
  def _mm_movepi8_mask(a: Exp[__m128i]): Exp[Int] = {
    MM_MOVEPI8_MASK(a)
  }
            
  def _mm256_movepi32_mask(a: Exp[__m256i]): Exp[Int] = {
    MM256_MOVEPI32_MASK(a)
  }
            
  def _mm512_movepi32_mask(a: Exp[__m512i]): Exp[Int] = {
    MM512_MOVEPI32_MASK(a)
  }
            
  def _mm_movepi32_mask(a: Exp[__m128i]): Exp[Int] = {
    MM_MOVEPI32_MASK(a)
  }
            
  def _mm256_cvtepi32_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI32_EPI8(a)
  }
            
  def _mm256_mask_cvtepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI32_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtepi32_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI32_EPI8(k, a)
  }
            
  def _mm_cvtepi32_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI32_EPI8(a)
  }
            
  def _mm_mask_cvtepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI32_EPI8(src, k, a)
  }
            
  def _mm_mask_cvtepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtepi32_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI32_EPI8(k, a)
  }
            
  def _mm256_cvtepi32_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI32_EPI16(a)
  }
            
  def _mm256_mask_cvtepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI32_EPI16(src, k, a)
  }
            
  def _mm256_mask_cvtepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtepi32_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI32_EPI16(k, a)
  }
            
  def _mm_cvtepi32_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI32_EPI16(a)
  }
            
  def _mm_mask_cvtepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI32_EPI16(src, k, a)
  }
            
  def _mm_mask_cvtepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtepi32_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI32_EPI16(k, a)
  }
            
  def _mm256_movm_epi8(k: Exp[Int]): Exp[__m256i] = {
    MM256_MOVM_EPI8(k)
  }
            
  def _mm512_movm_epi8(k: Exp[Long]): Exp[__m512i] = {
    MM512_MOVM_EPI8(k)
  }
            
  def _mm_movm_epi8(k: Exp[Int]): Exp[__m128i] = {
    MM_MOVM_EPI8(k)
  }
            
  def _mm256_movm_epi32(k: Exp[Int]): Exp[__m256i] = {
    MM256_MOVM_EPI32(k)
  }
            
  def _mm512_movm_epi32(k: Exp[Int]): Exp[__m512i] = {
    MM512_MOVM_EPI32(k)
  }
            
  def _mm_movm_epi32(k: Exp[Int]): Exp[__m128i] = {
    MM_MOVM_EPI32(k)
  }
            
  def _mm256_movm_epi64(k: Exp[Int]): Exp[__m256i] = {
    MM256_MOVM_EPI64(k)
  }
            
  def _mm512_movm_epi64(k: Exp[Int]): Exp[__m512i] = {
    MM512_MOVM_EPI64(k)
  }
            
  def _mm_movm_epi64(k: Exp[Int]): Exp[__m128i] = {
    MM_MOVM_EPI64(k)
  }
            
  def _mm256_movm_epi16(k: Exp[Int]): Exp[__m256i] = {
    MM256_MOVM_EPI16(k)
  }
            
  def _mm512_movm_epi16(k: Exp[Int]): Exp[__m512i] = {
    MM512_MOVM_EPI16(k)
  }
            
  def _mm_movm_epi16(k: Exp[Int]): Exp[__m128i] = {
    MM_MOVM_EPI16(k)
  }
            
  def _mm256_movepi64_mask(a: Exp[__m256i]): Exp[Int] = {
    MM256_MOVEPI64_MASK(a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_MASKZ_EXPAND_EPI32 (k, a) =>
      _mm_maskz_expand_epi32(f(k), f(a))
    case iDef@MM_MASKZ_EXPANDLOADU_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_expandloadu_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_EXPAND_EPI64 (src, k, a) =>
      _mm256_mask_expand_epi64(f(src), f(k), f(a))
    case iDef@MM256_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_expandloadu_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_EXPAND_EPI64 (k, a) =>
      _mm256_maskz_expand_epi64(f(k), f(a))
    case iDef@MM256_MASKZ_EXPANDLOADU_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_expandloadu_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_EXPAND_EPI64 (src, k, a) =>
      _mm_mask_expand_epi64(f(src), f(k), f(a))
    case iDef@MM_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_expandloadu_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_EXPAND_EPI64 (k, a) =>
      _mm_maskz_expand_epi64(f(k), f(a))
    case iDef@MM_MASKZ_EXPANDLOADU_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_expandloadu_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MMASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i32gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MMASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i32gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MMASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i32gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MMASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i32gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MMASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i64gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MMASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i64gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MMASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i64gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MMASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i64gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_LZCNT_EPI32 (a) =>
      _mm256_lzcnt_epi32(f(a))
    case MM256_MASK_LZCNT_EPI32 (src, k, a) =>
      _mm256_mask_lzcnt_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_LZCNT_EPI32 (k, a) =>
      _mm256_maskz_lzcnt_epi32(f(k), f(a))
    case MM_LZCNT_EPI32 (a) =>
      _mm_lzcnt_epi32(f(a))
    case MM_MASK_LZCNT_EPI32 (src, k, a) =>
      _mm_mask_lzcnt_epi32(f(src), f(k), f(a))
    case MM_MASKZ_LZCNT_EPI32 (k, a) =>
      _mm_maskz_lzcnt_epi32(f(k), f(a))
    case MM256_LZCNT_EPI64 (a) =>
      _mm256_lzcnt_epi64(f(a))
    case MM256_MASK_LZCNT_EPI64 (src, k, a) =>
      _mm256_mask_lzcnt_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_LZCNT_EPI64 (k, a) =>
      _mm256_maskz_lzcnt_epi64(f(k), f(a))
    case MM_LZCNT_EPI64 (a) =>
      _mm_lzcnt_epi64(f(a))
    case MM_MASK_LZCNT_EPI64 (src, k, a) =>
      _mm_mask_lzcnt_epi64(f(src), f(k), f(a))
    case MM_MASKZ_LZCNT_EPI64 (k, a) =>
      _mm_maskz_lzcnt_epi64(f(k), f(a))
    case MM256_MASK_MADDUBS_EPI16 (src, k, a, b) =>
      _mm256_mask_maddubs_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MADDUBS_EPI16 (k, a, b) =>
      _mm256_maskz_maddubs_epi16(f(k), f(a), f(b))
    case MM512_MADDUBS_EPI16 (a, b) =>
      _mm512_maddubs_epi16(f(a), f(b))
    case MM512_MASK_MADDUBS_EPI16 (src, k, a, b) =>
      _mm512_mask_maddubs_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MADDUBS_EPI16 (k, a, b) =>
      _mm512_maskz_maddubs_epi16(f(k), f(a), f(b))
    case MM_MASK_MADDUBS_EPI16 (src, k, a, b) =>
      _mm_mask_maddubs_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MADDUBS_EPI16 (k, a, b) =>
      _mm_maskz_maddubs_epi16(f(k), f(a), f(b))
    case MM256_MASK_MADD_EPI16 (src, k, a, b) =>
      _mm256_mask_madd_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MADD_EPI16 (k, a, b) =>
      _mm256_maskz_madd_epi16(f(k), f(a), f(b))
    case MM512_MADD_EPI16 (a, b) =>
      _mm512_madd_epi16(f(a), f(b))
    case MM512_MASK_MADD_EPI16 (src, k, a, b) =>
      _mm512_mask_madd_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MADD_EPI16 (k, a, b) =>
      _mm512_maskz_madd_epi16(f(k), f(a), f(b))
    case MM_MASK_MADD_EPI16 (src, k, a, b) =>
      _mm_mask_madd_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MADD_EPI16 (k, a, b) =>
      _mm_maskz_madd_epi16(f(k), f(a), f(b))
    case MM256_MASK_MAX_EPI8 (src, k, a, b) =>
      _mm256_mask_max_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_EPI8 (k, a, b) =>
      _mm256_maskz_max_epi8(f(k), f(a), f(b))
    case MM512_MASK_MAX_EPI8 (src, k, a, b) =>
      _mm512_mask_max_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MAX_EPI8 (k, a, b) =>
      _mm512_maskz_max_epi8(f(k), f(a), f(b))
    case MM512_MAX_EPI8 (a, b) =>
      _mm512_max_epi8(f(a), f(b))
    case MM_MASK_MAX_EPI8 (src, k, a, b) =>
      _mm_mask_max_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_EPI8 (k, a, b) =>
      _mm_maskz_max_epi8(f(k), f(a), f(b))
    case MM256_MASK_MAX_EPI32 (src, k, a, b) =>
      _mm256_mask_max_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_EPI32 (k, a, b) =>
      _mm256_maskz_max_epi32(f(k), f(a), f(b))
    case MM_MASK_MAX_EPI32 (src, k, a, b) =>
      _mm_mask_max_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_EPI32 (k, a, b) =>
      _mm_maskz_max_epi32(f(k), f(a), f(b))
    case MM256_MASK_MAX_EPI64 (src, k, a, b) =>
      _mm256_mask_max_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_EPI64 (k, a, b) =>
      _mm256_maskz_max_epi64(f(k), f(a), f(b))
    case MM256_MAX_EPI64 (a, b) =>
      _mm256_max_epi64(f(a), f(b))
    case MM_MASK_MAX_EPI64 (src, k, a, b) =>
      _mm_mask_max_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_EPI64 (k, a, b) =>
      _mm_maskz_max_epi64(f(k), f(a), f(b))
    case MM_MAX_EPI64 (a, b) =>
      _mm_max_epi64(f(a), f(b))
    case MM256_MASK_MAX_EPI16 (src, k, a, b) =>
      _mm256_mask_max_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_EPI16 (k, a, b) =>
      _mm256_maskz_max_epi16(f(k), f(a), f(b))
    case MM512_MASK_MAX_EPI16 (src, k, a, b) =>
      _mm512_mask_max_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MAX_EPI16 (k, a, b) =>
      _mm512_maskz_max_epi16(f(k), f(a), f(b))
    case MM512_MAX_EPI16 (a, b) =>
      _mm512_max_epi16(f(a), f(b))
    case MM_MASK_MAX_EPI16 (src, k, a, b) =>
      _mm_mask_max_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_EPI16 (k, a, b) =>
      _mm_maskz_max_epi16(f(k), f(a), f(b))
    case MM256_MASK_MAX_EPU8 (src, k, a, b) =>
      _mm256_mask_max_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_EPU8 (k, a, b) =>
      _mm256_maskz_max_epu8(f(k), f(a), f(b))
    case MM512_MASK_MAX_EPU8 (src, k, a, b) =>
      _mm512_mask_max_epu8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MAX_EPU8 (k, a, b) =>
      _mm512_maskz_max_epu8(f(k), f(a), f(b))
    case MM512_MAX_EPU8 (a, b) =>
      _mm512_max_epu8(f(a), f(b))
    case MM_MASK_MAX_EPU8 (src, k, a, b) =>
      _mm_mask_max_epu8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_EPU8 (k, a, b) =>
      _mm_maskz_max_epu8(f(k), f(a), f(b))
    case MM256_MASK_MAX_EPU32 (src, k, a, b) =>
      _mm256_mask_max_epu32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_EPU32 (k, a, b) =>
      _mm256_maskz_max_epu32(f(k), f(a), f(b))
    case MM_MASK_MAX_EPU32 (src, k, a, b) =>
      _mm_mask_max_epu32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_EPU32 (k, a, b) =>
      _mm_maskz_max_epu32(f(k), f(a), f(b))
    case MM256_MASK_MAX_EPU64 (src, k, a, b) =>
      _mm256_mask_max_epu64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_EPU64 (k, a, b) =>
      _mm256_maskz_max_epu64(f(k), f(a), f(b))
    case MM256_MAX_EPU64 (a, b) =>
      _mm256_max_epu64(f(a), f(b))
    case MM_MASK_MAX_EPU64 (src, k, a, b) =>
      _mm_mask_max_epu64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_EPU64 (k, a, b) =>
      _mm_maskz_max_epu64(f(k), f(a), f(b))
    case MM_MAX_EPU64 (a, b) =>
      _mm_max_epu64(f(a), f(b))
    case MM256_MASK_MAX_EPU16 (src, k, a, b) =>
      _mm256_mask_max_epu16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_EPU16 (k, a, b) =>
      _mm256_maskz_max_epu16(f(k), f(a), f(b))
    case MM512_MASK_MAX_EPU16 (src, k, a, b) =>
      _mm512_mask_max_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MAX_EPU16 (k, a, b) =>
      _mm512_maskz_max_epu16(f(k), f(a), f(b))
    case MM512_MAX_EPU16 (a, b) =>
      _mm512_max_epu16(f(a), f(b))
    case MM_MASK_MAX_EPU16 (src, k, a, b) =>
      _mm_mask_max_epu16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_EPU16 (k, a, b) =>
      _mm_maskz_max_epu16(f(k), f(a), f(b))
    case MM256_MASK_MIN_EPI8 (src, k, a, b) =>
      _mm256_mask_min_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_EPI8 (k, a, b) =>
      _mm256_maskz_min_epi8(f(k), f(a), f(b))
    case MM512_MASK_MIN_EPI8 (src, k, a, b) =>
      _mm512_mask_min_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MIN_EPI8 (k, a, b) =>
      _mm512_maskz_min_epi8(f(k), f(a), f(b))
    case MM512_MIN_EPI8 (a, b) =>
      _mm512_min_epi8(f(a), f(b))
    case MM_MASK_MIN_EPI8 (src, k, a, b) =>
      _mm_mask_min_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPI8 (k, a, b) =>
      _mm_maskz_min_epi8(f(k), f(a), f(b))
    case MM256_MASK_MIN_EPI32 (src, k, a, b) =>
      _mm256_mask_min_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_EPI32 (k, a, b) =>
      _mm256_maskz_min_epi32(f(k), f(a), f(b))
    case MM_MASK_MIN_EPI32 (src, k, a, b) =>
      _mm_mask_min_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPI32 (k, a, b) =>
      _mm_maskz_min_epi32(f(k), f(a), f(b))
    case MM256_MASK_MIN_EPI64 (src, k, a, b) =>
      _mm256_mask_min_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_EPI64 (k, a, b) =>
      _mm256_maskz_min_epi64(f(k), f(a), f(b))
    case MM256_MIN_EPI64 (a, b) =>
      _mm256_min_epi64(f(a), f(b))
    case MM_MASK_MIN_EPI64 (src, k, a, b) =>
      _mm_mask_min_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPI64 (k, a, b) =>
      _mm_maskz_min_epi64(f(k), f(a), f(b))
    case MM_MIN_EPI64 (a, b) =>
      _mm_min_epi64(f(a), f(b))
    case MM256_MASK_MIN_EPI16 (src, k, a, b) =>
      _mm256_mask_min_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_EPI16 (k, a, b) =>
      _mm256_maskz_min_epi16(f(k), f(a), f(b))
    case MM512_MASK_MIN_EPI16 (src, k, a, b) =>
      _mm512_mask_min_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MIN_EPI16 (k, a, b) =>
      _mm512_maskz_min_epi16(f(k), f(a), f(b))
    case MM512_MIN_EPI16 (a, b) =>
      _mm512_min_epi16(f(a), f(b))
    case MM_MASK_MIN_EPI16 (src, k, a, b) =>
      _mm_mask_min_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPI16 (k, a, b) =>
      _mm_maskz_min_epi16(f(k), f(a), f(b))
    case MM256_MASK_MIN_EPU8 (src, k, a, b) =>
      _mm256_mask_min_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_EPU8 (k, a, b) =>
      _mm256_maskz_min_epu8(f(k), f(a), f(b))
    case MM512_MASK_MIN_EPU8 (src, k, a, b) =>
      _mm512_mask_min_epu8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MIN_EPU8 (k, a, b) =>
      _mm512_maskz_min_epu8(f(k), f(a), f(b))
    case MM512_MIN_EPU8 (a, b) =>
      _mm512_min_epu8(f(a), f(b))
    case MM_MASK_MIN_EPU8 (src, k, a, b) =>
      _mm_mask_min_epu8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPU8 (k, a, b) =>
      _mm_maskz_min_epu8(f(k), f(a), f(b))
    case MM256_MASK_MIN_EPU32 (src, k, a, b) =>
      _mm256_mask_min_epu32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_EPU32 (k, a, b) =>
      _mm256_maskz_min_epu32(f(k), f(a), f(b))
    case MM_MASK_MIN_EPU32 (src, k, a, b) =>
      _mm_mask_min_epu32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPU32 (k, a, b) =>
      _mm_maskz_min_epu32(f(k), f(a), f(b))
    case MM256_MASK_MIN_EPU64 (src, k, a, b) =>
      _mm256_mask_min_epu64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_EPU64 (k, a, b) =>
      _mm256_maskz_min_epu64(f(k), f(a), f(b))
    case MM256_MIN_EPU64 (a, b) =>
      _mm256_min_epu64(f(a), f(b))
    case MM_MASK_MIN_EPU64 (src, k, a, b) =>
      _mm_mask_min_epu64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPU64 (k, a, b) =>
      _mm_maskz_min_epu64(f(k), f(a), f(b))
    case MM_MIN_EPU64 (a, b) =>
      _mm_min_epu64(f(a), f(b))
    case MM256_MASK_MIN_EPU16 (src, k, a, b) =>
      _mm256_mask_min_epu16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_EPU16 (k, a, b) =>
      _mm256_maskz_min_epu16(f(k), f(a), f(b))
    case MM512_MASK_MIN_EPU16 (src, k, a, b) =>
      _mm512_mask_min_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MIN_EPU16 (k, a, b) =>
      _mm512_maskz_min_epu16(f(k), f(a), f(b))
    case MM512_MIN_EPU16 (a, b) =>
      _mm512_min_epu16(f(a), f(b))
    case MM_MASK_MIN_EPU16 (src, k, a, b) =>
      _mm_mask_min_epu16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPU16 (k, a, b) =>
      _mm_maskz_min_epu16(f(k), f(a), f(b))
    case MM256_MOVEPI8_MASK (a) =>
      _mm256_movepi8_mask(f(a))
    case MM512_MOVEPI8_MASK (a) =>
      _mm512_movepi8_mask(f(a))
    case MM_MOVEPI8_MASK (a) =>
      _mm_movepi8_mask(f(a))
    case MM256_MOVEPI32_MASK (a) =>
      _mm256_movepi32_mask(f(a))
    case MM512_MOVEPI32_MASK (a) =>
      _mm512_movepi32_mask(f(a))
    case MM_MOVEPI32_MASK (a) =>
      _mm_movepi32_mask(f(a))
    case MM256_CVTEPI32_EPI8 (a) =>
      _mm256_cvtepi32_epi8(f(a))
    case MM256_MASK_CVTEPI32_EPI8 (src, k, a) =>
      _mm256_mask_cvtepi32_epi8(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTEPI32_EPI8 (k, a) =>
      _mm256_maskz_cvtepi32_epi8(f(k), f(a))
    case MM_CVTEPI32_EPI8 (a) =>
      _mm_cvtepi32_epi8(f(a))
    case MM_MASK_CVTEPI32_EPI8 (src, k, a) =>
      _mm_mask_cvtepi32_epi8(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTEPI32_EPI8 (k, a) =>
      _mm_maskz_cvtepi32_epi8(f(k), f(a))
    case MM256_CVTEPI32_EPI16 (a) =>
      _mm256_cvtepi32_epi16(f(a))
    case MM256_MASK_CVTEPI32_EPI16 (src, k, a) =>
      _mm256_mask_cvtepi32_epi16(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTEPI32_EPI16 (k, a) =>
      _mm256_maskz_cvtepi32_epi16(f(k), f(a))
    case MM_CVTEPI32_EPI16 (a) =>
      _mm_cvtepi32_epi16(f(a))
    case MM_MASK_CVTEPI32_EPI16 (src, k, a) =>
      _mm_mask_cvtepi32_epi16(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTEPI32_EPI16 (k, a) =>
      _mm_maskz_cvtepi32_epi16(f(k), f(a))
    case MM256_MOVM_EPI8 (k) =>
      _mm256_movm_epi8(f(k))
    case MM512_MOVM_EPI8 (k) =>
      _mm512_movm_epi8(f(k))
    case MM_MOVM_EPI8 (k) =>
      _mm_movm_epi8(f(k))
    case MM256_MOVM_EPI32 (k) =>
      _mm256_movm_epi32(f(k))
    case MM512_MOVM_EPI32 (k) =>
      _mm512_movm_epi32(f(k))
    case MM_MOVM_EPI32 (k) =>
      _mm_movm_epi32(f(k))
    case MM256_MOVM_EPI64 (k) =>
      _mm256_movm_epi64(f(k))
    case MM512_MOVM_EPI64 (k) =>
      _mm512_movm_epi64(f(k))
    case MM_MOVM_EPI64 (k) =>
      _mm_movm_epi64(f(k))
    case MM256_MOVM_EPI16 (k) =>
      _mm256_movm_epi16(f(k))
    case MM512_MOVM_EPI16 (k) =>
      _mm512_movm_epi16(f(k))
    case MM_MOVM_EPI16 (k) =>
      _mm_movm_epi16(f(k))
    case MM256_MOVEPI64_MASK (a) =>
      _mm256_movepi64_mask(f(a))

    case Reflect(MM_MASKZ_EXPAND_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPAND_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_EXPANDLOADU_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPANDLOADU_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXPAND_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPAND_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPANDLOADU_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXPAND_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPAND_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_EXPANDLOADU_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPANDLOADU_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_EXPAND_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPAND_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPANDLOADU_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_EXPAND_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPAND_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_EXPANDLOADU_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPANDLOADU_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I32GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I32GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I32GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I32GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I64GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I64GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I64GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I64GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LZCNT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_LZCNT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_LZCNT_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LZCNT_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_LZCNT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LZCNT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LZCNT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_LZCNT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_LZCNT_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LZCNT_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_LZCNT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LZCNT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LZCNT_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_LZCNT_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_LZCNT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LZCNT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_LZCNT_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LZCNT_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LZCNT_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_LZCNT_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_LZCNT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LZCNT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_LZCNT_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LZCNT_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MADDUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MADDUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MADDUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MADDUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MADDUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MADDUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MADDUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MADDUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MADDUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MADDUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MADDUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MADDUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MADDUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MADDUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEPI8_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEPI8_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEPI8_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEPI8_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEPI8_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEPI8_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEPI32_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEPI32_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEPI32_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEPI32_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEPI32_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEPI32_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVM_EPI8 (k), u, es) =>
      reflectMirrored(Reflect(MM256_MOVM_EPI8 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVM_EPI8 (k), u, es) =>
      reflectMirrored(Reflect(MM512_MOVM_EPI8 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVM_EPI8 (k), u, es) =>
      reflectMirrored(Reflect(MM_MOVM_EPI8 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVM_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM256_MOVM_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVM_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM512_MOVM_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVM_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM_MOVM_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVM_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM256_MOVM_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVM_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM512_MOVM_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVM_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM_MOVM_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVM_EPI16 (k), u, es) =>
      reflectMirrored(Reflect(MM256_MOVM_EPI16 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVM_EPI16 (k), u, es) =>
      reflectMirrored(Reflect(MM512_MOVM_EPI16 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVM_EPI16 (k), u, es) =>
      reflectMirrored(Reflect(MM_MOVM_EPI16 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEPI64_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEPI64_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512014 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM_MASKZ_EXPAND_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_expand_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASKZ_EXPANDLOADU_EPI32(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_maskz_expandloadu_epi32(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASK_EXPAND_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_expand_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_mask_expandloadu_epi64(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASKZ_EXPAND_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_expand_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_EXPANDLOADU_EPI64(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_maskz_expandloadu_epi64(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASK_EXPAND_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_expand_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_mask_expandloadu_epi64(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASKZ_EXPAND_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_expand_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASKZ_EXPANDLOADU_EPI64(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_maskz_expandloadu_epi64(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MMASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm256_mmask_i32gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM_MMASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm_mmask_i32gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM256_MMASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm256_mmask_i32gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM_MMASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm_mmask_i32gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM256_MMASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm256_mmask_i64gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM_MMASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm_mmask_i64gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM256_MMASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm256_mmask_i64gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM_MMASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm_mmask_i64gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM256_LZCNT_EPI32(a) =>
      emitValDef(sym, s"_mm256_lzcnt_epi32(${quote(a)})")
    case MM256_MASK_LZCNT_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_lzcnt_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_LZCNT_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_lzcnt_epi32(${quote(k)}, ${quote(a)})")
    case MM_LZCNT_EPI32(a) =>
      emitValDef(sym, s"_mm_lzcnt_epi32(${quote(a)})")
    case MM_MASK_LZCNT_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_lzcnt_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_LZCNT_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_lzcnt_epi32(${quote(k)}, ${quote(a)})")
    case MM256_LZCNT_EPI64(a) =>
      emitValDef(sym, s"_mm256_lzcnt_epi64(${quote(a)})")
    case MM256_MASK_LZCNT_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_lzcnt_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_LZCNT_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_lzcnt_epi64(${quote(k)}, ${quote(a)})")
    case MM_LZCNT_EPI64(a) =>
      emitValDef(sym, s"_mm_lzcnt_epi64(${quote(a)})")
    case MM_MASK_LZCNT_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_lzcnt_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_LZCNT_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_lzcnt_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_MADDUBS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_maddubs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MADDUBS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_maddubs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MADDUBS_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_maddubs_epi16(${quote(a)}, ${quote(b)})")
    case MM512_MASK_MADDUBS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_maddubs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MADDUBS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_maddubs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MADDUBS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_maddubs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MADDUBS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_maddubs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MADD_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_madd_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MADD_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_madd_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MADD_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_madd_epi16(${quote(a)}, ${quote(b)})")
    case MM512_MASK_MADD_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_madd_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MADD_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_madd_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MADD_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_madd_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MADD_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_madd_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MAX_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MAX_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_max_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MAX_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_max_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MAX_EPI8(a, b) =>
      emitValDef(sym, s"_mm512_max_epi8(${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MAX_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MAX_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MAX_EPI64(a, b) =>
      emitValDef(sym, s"_mm256_max_epi64(${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MAX_EPI64(a, b) =>
      emitValDef(sym, s"_mm_max_epi64(${quote(a)}, ${quote(b)})")
    case MM256_MASK_MAX_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MAX_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_max_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MAX_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_max_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MAX_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_max_epi16(${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MAX_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MAX_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_max_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MAX_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_max_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MAX_EPU8(a, b) =>
      emitValDef(sym, s"_mm512_max_epu8(${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MAX_EPU32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_EPU32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_EPU32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_EPU32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MAX_EPU64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_EPU64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MAX_EPU64(a, b) =>
      emitValDef(sym, s"_mm256_max_epu64(${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_EPU64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_EPU64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MAX_EPU64(a, b) =>
      emitValDef(sym, s"_mm_max_epu64(${quote(a)}, ${quote(b)})")
    case MM256_MASK_MAX_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MAX_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_max_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MAX_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_max_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MAX_EPU16(a, b) =>
      emitValDef(sym, s"_mm512_max_epu16(${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MIN_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_min_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MIN_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_min_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MIN_EPI8(a, b) =>
      emitValDef(sym, s"_mm512_min_epi8(${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MIN_EPI64(a, b) =>
      emitValDef(sym, s"_mm256_min_epi64(${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MIN_EPI64(a, b) =>
      emitValDef(sym, s"_mm_min_epi64(${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MIN_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_min_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MIN_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_min_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MIN_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_min_epi16(${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MIN_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_min_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MIN_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_min_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MIN_EPU8(a, b) =>
      emitValDef(sym, s"_mm512_min_epu8(${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_EPU32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_EPU32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_EPU32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_EPU32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_EPU64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_EPU64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MIN_EPU64(a, b) =>
      emitValDef(sym, s"_mm256_min_epu64(${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_EPU64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_EPU64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MIN_EPU64(a, b) =>
      emitValDef(sym, s"_mm_min_epu64(${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MIN_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_min_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MIN_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_min_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MIN_EPU16(a, b) =>
      emitValDef(sym, s"_mm512_min_epu16(${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MOVEPI8_MASK(a) =>
      emitValDef(sym, s"_mm256_movepi8_mask(${quote(a)})")
    case MM512_MOVEPI8_MASK(a) =>
      emitValDef(sym, s"_mm512_movepi8_mask(${quote(a)})")
    case MM_MOVEPI8_MASK(a) =>
      emitValDef(sym, s"_mm_movepi8_mask(${quote(a)})")
    case MM256_MOVEPI32_MASK(a) =>
      emitValDef(sym, s"_mm256_movepi32_mask(${quote(a)})")
    case MM512_MOVEPI32_MASK(a) =>
      emitValDef(sym, s"_mm512_movepi32_mask(${quote(a)})")
    case MM_MOVEPI32_MASK(a) =>
      emitValDef(sym, s"_mm_movepi32_mask(${quote(a)})")
    case MM256_CVTEPI32_EPI8(a) =>
      emitValDef(sym, s"_mm256_cvtepi32_epi8(${quote(a)})")
    case MM256_MASK_CVTEPI32_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtepi32_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTEPI32_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi32_epi8(${quote(k)}, ${quote(a)})")
    case MM_CVTEPI32_EPI8(a) =>
      emitValDef(sym, s"_mm_cvtepi32_epi8(${quote(a)})")
    case MM_MASK_CVTEPI32_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtepi32_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTEPI32_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi32_epi8(${quote(k)}, ${quote(a)})")
    case MM256_CVTEPI32_EPI16(a) =>
      emitValDef(sym, s"_mm256_cvtepi32_epi16(${quote(a)})")
    case MM256_MASK_CVTEPI32_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtepi32_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTEPI32_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi32_epi16(${quote(k)}, ${quote(a)})")
    case MM_CVTEPI32_EPI16(a) =>
      emitValDef(sym, s"_mm_cvtepi32_epi16(${quote(a)})")
    case MM_MASK_CVTEPI32_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtepi32_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTEPI32_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi32_epi16(${quote(k)}, ${quote(a)})")
    case MM256_MOVM_EPI8(k) =>
      emitValDef(sym, s"_mm256_movm_epi8(${quote(k)})")
    case MM512_MOVM_EPI8(k) =>
      emitValDef(sym, s"_mm512_movm_epi8(${quote(k)})")
    case MM_MOVM_EPI8(k) =>
      emitValDef(sym, s"_mm_movm_epi8(${quote(k)})")
    case MM256_MOVM_EPI32(k) =>
      emitValDef(sym, s"_mm256_movm_epi32(${quote(k)})")
    case MM512_MOVM_EPI32(k) =>
      emitValDef(sym, s"_mm512_movm_epi32(${quote(k)})")
    case MM_MOVM_EPI32(k) =>
      emitValDef(sym, s"_mm_movm_epi32(${quote(k)})")
    case MM256_MOVM_EPI64(k) =>
      emitValDef(sym, s"_mm256_movm_epi64(${quote(k)})")
    case MM512_MOVM_EPI64(k) =>
      emitValDef(sym, s"_mm512_movm_epi64(${quote(k)})")
    case MM_MOVM_EPI64(k) =>
      emitValDef(sym, s"_mm_movm_epi64(${quote(k)})")
    case MM256_MOVM_EPI16(k) =>
      emitValDef(sym, s"_mm256_movm_epi16(${quote(k)})")
    case MM512_MOVM_EPI16(k) =>
      emitValDef(sym, s"_mm512_movm_epi16(${quote(k)})")
    case MM_MOVM_EPI16(k) =>
      emitValDef(sym, s"_mm_movm_epi16(${quote(k)})")
    case MM256_MOVEPI64_MASK(a) =>
      emitValDef(sym, s"_mm256_movepi64_mask(${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
