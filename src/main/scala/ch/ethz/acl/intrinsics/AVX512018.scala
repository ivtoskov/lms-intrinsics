package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX512018 extends IntrinsicsBase {
  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUBS_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUBS_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUBS_EPU8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUBS_EPU8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUBS_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUBS_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUBS_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUBS_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUBS_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUBS_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUBS_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUBS_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUBS_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUBS_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUB_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUB_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUB_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUB_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUB_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUB_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUB_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "src", "a", and "b" are used to form a 3 bit index into "imm8", and
   * the value at that bit in "imm8" is written to the corresponding bit in "dst"
   * using writemask "k" at 32-bit granularity (32-bit elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_MASK_TERNARYLOGIC_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst" using
   * zeromask "k" at 32-bit granularity (32-bit elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, c: __m256i, imm8: int
   */
  case class MM256_MASKZ_TERNARYLOGIC_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m256i, b: __m256i, c: __m256i, imm8: int
   */
  case class MM256_TERNARYLOGIC_EPI32(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "src", "a", and "b" are used to form a 3 bit index into "imm8", and
   * the value at that bit in "imm8" is written to the corresponding bit in "dst"
   * using writemask "k" at 32-bit granularity (32-bit elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, imm8: int
   */
  case class MM_MASK_TERNARYLOGIC_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst" using
   * zeromask "k" at 32-bit granularity (32-bit elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, c: __m128i, imm8: int
   */
  case class MM_MASKZ_TERNARYLOGIC_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m128i, b: __m128i, c: __m128i, imm8: int
   */
  case class MM_TERNARYLOGIC_EPI32(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "src", "a", and "b" are used to form a 3 bit index into "imm8", and
   * the value at that bit in "imm8" is written to the corresponding bit in "dst"
   * using writemask "k" at 64-bit granularity (64-bit elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_MASK_TERNARYLOGIC_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst" using
   * zeromask "k" at 64-bit granularity (64-bit elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, c: __m256i, imm8: int
   */
  case class MM256_MASKZ_TERNARYLOGIC_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m256i, b: __m256i, c: __m256i, imm8: int
   */
  case class MM256_TERNARYLOGIC_EPI64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "src", "a", and "b" are used to form a 3 bit index into "imm8", and
   * the value at that bit in "imm8" is written to the corresponding bit in "dst"
   * using writemask "k" at 64-bit granularity (64-bit elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, imm8: int
   */
  case class MM_MASK_TERNARYLOGIC_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst" using
   * zeromask "k" at 64-bit granularity (64-bit elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, c: __m128i, imm8: int
   */
  case class MM_MASKZ_TERNARYLOGIC_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m128i, b: __m128i, c: __m128i, imm8: int
   */
  case class MM_TERNARYLOGIC_EPI64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TEST_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is non-zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TEST_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TEST_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is non-zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TEST_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_TEST_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is non-zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TEST_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TEST_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TEST_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TEST_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TEST_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TEST_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TEST_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TEST_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TEST_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TEST_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TEST_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TEST_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TEST_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TEST_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TEST_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TESTN_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TESTN_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TESTN_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TESTN_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_TESTN_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTN_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TESTN_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TESTN_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TESTN_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTN_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TESTN_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TESTN_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TESTN_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTN_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TESTN_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TESTN_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TESTN_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TESTN_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TESTN_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTN_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKHI_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKHI_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKHI_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKHI_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKHI_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKHI_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKHI_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKHI_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKHI_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKHI_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKHI_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKHI_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKHI_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKHI_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKHI_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKHI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKHI_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKHI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKHI_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKHI_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKHI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKHI_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKLO_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKLO_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKLO_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKLO_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKLO_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKLO_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKLO_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKLO_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKLO_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKLO_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKLO_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKLO_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKLO_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKLO_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKLO_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKLO_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKLO_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKLO_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKLO_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKLO_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKLO_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKLO_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_XOR_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_XOR_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_XOR_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_XOR_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_XOR_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_XOR_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_XOR_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_XOR_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d, imm8: int
   */
  case class MM256_MASK_RANGE_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask8, a: __m256d, b: __m256d, imm8: int
   */
  case class MM256_MASKZ_RANGE_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * a: __m256d, b: __m256d, imm8: int
   */
  case class MM256_RANGE_PD(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, imm8: int
   */
  case class MM512_MASK_RANGE_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign
   * bit.
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASK_RANGE_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask8, a: __m512d, b: __m512d, imm8: int
   */
  case class MM512_MASKZ_RANGE_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASKZ_RANGE_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * a: __m512d, b: __m512d, imm8: int
   */
  case class MM512_RANGE_PD(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * a: __m512d, b: __m512d, imm8: int, rounding: int
   */
  case class MM512_RANGE_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASK_RANGE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASKZ_RANGE_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * a: __m128d, b: __m128d, imm8: int
   */
  case class MM_RANGE_PD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m256, k: __mmask8, a: __m256, b: __m256, imm8: int
   */
  case class MM256_MASK_RANGE_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask8, a: __m256, b: __m256, imm8: int
   */
  case class MM256_MASKZ_RANGE_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * a: __m256, b: __m256, imm8: int
   */
  case class MM256_RANGE_PS(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m512, k: __mmask16, a: __m512, b: __m512, imm8: int
   */
  case class MM512_MASK_RANGE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign
   * bit.
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, imm8: int, rounding: int
   */
  case class MM512_MASK_RANGE_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask16, a: __m512, b: __m512, imm8: int
   */
  case class MM512_MASKZ_RANGE_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, imm8: int, rounding: int
   */
  case class MM512_MASKZ_RANGE_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * a: __m512, b: __m512, imm8: int
   */
  case class MM512_RANGE_PS(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * a: __m512, b: __m512, imm8: int, rounding: int
   */
  case class MM512_RANGE_ROUND_PS(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASK_RANGE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASKZ_RANGE_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * a: __m128, b: __m128, imm8: int
   */
  case class MM_RANGE_PS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower double-precision (64-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	imm8[1:0] specifies the
   * operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_MASK_RANGE_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower double-precision (64-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	imm8[1:0] specifies the
   * operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASK_RANGE_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower double-precision (64-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	imm8[1:0] specifies the
   * operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_MASKZ_RANGE_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower double-precision (64-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	imm8[1:0] specifies the
   * operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASKZ_RANGE_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower double-precision (64-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	imm8[1:0] specifies the
   * operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_RANGE_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower single-precision (32-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper 3 packed elements from "a" to the upper elements of "dst".
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign
   * bit.
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: int, rounding: int
   */
  case class MM_MASK_RANGE_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower single-precision (32-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper 3 packed elements from "a" to the upper elements of "dst".
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASK_RANGE_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower single-precision (32-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, imm8: int, rounding: int
   */
  case class MM_MASKZ_RANGE_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower single-precision (32-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASKZ_RANGE_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower single-precision (32-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * a: __m128, b: __m128, imm8: int, rounding: int
   */
  case class MM_RANGE_ROUND_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_RCP14_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_RCP14_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m256d
   */
  case class MM256_RCP14_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_RCP14_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_RCP14_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m128d
   */
  case class MM_RCP14_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_RCP14_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_RCP14_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m256
   */
  case class MM256_RCP14_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_RCP14_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_RCP14_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m128
   */
  case class MM_RCP14_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_REDUCE_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASKZ_REDUCE_PD(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m256d, imm8: int
   */
  case class MM256_REDUCE_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASK_REDUCE_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_mask_subs_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUBS_EPU8(src, k, a, b)
  }
            
  def _mm256_maskz_subs_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUBS_EPU8(k, a, b)
  }
            
  def _mm512_mask_subs_epu8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBS_EPU8(src, k, a, b)
  }
            
  def _mm512_maskz_subs_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUBS_EPU8(k, a, b)
  }
            
  def _mm512_subs_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUBS_EPU8(a, b)
  }
            
  def _mm_mask_subs_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUBS_EPU8(src, k, a, b)
  }
            
  def _mm_maskz_subs_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUBS_EPU8(k, a, b)
  }
            
  def _mm256_mask_subs_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUBS_EPU16(src, k, a, b)
  }
            
  def _mm256_maskz_subs_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUBS_EPU16(k, a, b)
  }
            
  def _mm512_mask_subs_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBS_EPU16(src, k, a, b)
  }
            
  def _mm512_maskz_subs_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUBS_EPU16(k, a, b)
  }
            
  def _mm512_subs_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUBS_EPU16(a, b)
  }
            
  def _mm_mask_subs_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUBS_EPU16(src, k, a, b)
  }
            
  def _mm_maskz_subs_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUBS_EPU16(k, a, b)
  }
            
  def _mm256_mask_sub_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUB_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_sub_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUB_EPI16(k, a, b)
  }
            
  def _mm512_mask_sub_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUB_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_sub_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUB_EPI16(k, a, b)
  }
            
  def _mm512_sub_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUB_EPI16(a, b)
  }
            
  def _mm_mask_sub_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUB_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_sub_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUB_EPI16(k, a, b)
  }
            
  def _mm256_mask_ternarylogic_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_ternarylogic_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8)
  }
            
  def _mm256_ternarylogic_epi32(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_TERNARYLOGIC_EPI32(a, b, c, imm8)
  }
            
  def _mm_mask_ternarylogic_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8)
  }
            
  def _mm_maskz_ternarylogic_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8)
  }
            
  def _mm_ternarylogic_epi32(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_TERNARYLOGIC_EPI32(a, b, c, imm8)
  }
            
  def _mm256_mask_ternarylogic_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_ternarylogic_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8)
  }
            
  def _mm256_ternarylogic_epi64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_TERNARYLOGIC_EPI64(a, b, c, imm8)
  }
            
  def _mm_mask_ternarylogic_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8)
  }
            
  def _mm_maskz_ternarylogic_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8)
  }
            
  def _mm_ternarylogic_epi64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_TERNARYLOGIC_EPI64(a, b, c, imm8)
  }
            
  def _mm256_mask_test_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TEST_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_test_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TEST_EPI8_MASK(a, b)
  }
            
  def _mm512_mask_test_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_TEST_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_test_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_TEST_EPI8_MASK(a, b)
  }
            
  def _mm_mask_test_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TEST_EPI8_MASK(k1, a, b)
  }
            
  def _mm_test_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TEST_EPI8_MASK(a, b)
  }
            
  def _mm256_mask_test_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TEST_EPI32_MASK(k1, a, b)
  }
            
  def _mm256_test_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TEST_EPI32_MASK(a, b)
  }
            
  def _mm_mask_test_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TEST_EPI32_MASK(k1, a, b)
  }
            
  def _mm_test_epi32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TEST_EPI32_MASK(a, b)
  }
            
  def _mm256_mask_test_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TEST_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_test_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TEST_EPI64_MASK(a, b)
  }
            
  def _mm_mask_test_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TEST_EPI64_MASK(k1, a, b)
  }
            
  def _mm_test_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TEST_EPI64_MASK(a, b)
  }
            
  def _mm256_mask_test_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TEST_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_test_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TEST_EPI16_MASK(a, b)
  }
            
  def _mm512_mask_test_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TEST_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_test_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_TEST_EPI16_MASK(a, b)
  }
            
  def _mm_mask_test_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TEST_EPI16_MASK(k1, a, b)
  }
            
  def _mm_test_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TEST_EPI16_MASK(a, b)
  }
            
  def _mm256_mask_testn_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TESTN_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_testn_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TESTN_EPI8_MASK(a, b)
  }
            
  def _mm512_mask_testn_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_TESTN_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_testn_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_TESTN_EPI8_MASK(a, b)
  }
            
  def _mm_mask_testn_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TESTN_EPI8_MASK(k1, a, b)
  }
            
  def _mm_testn_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTN_EPI8_MASK(a, b)
  }
            
  def _mm256_mask_testn_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TESTN_EPI32_MASK(k1, a, b)
  }
            
  def _mm256_testn_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TESTN_EPI32_MASK(a, b)
  }
            
  def _mm_mask_testn_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TESTN_EPI32_MASK(k1, a, b)
  }
            
  def _mm_testn_epi32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTN_EPI32_MASK(a, b)
  }
            
  def _mm256_mask_testn_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TESTN_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_testn_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TESTN_EPI64_MASK(a, b)
  }
            
  def _mm_mask_testn_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TESTN_EPI64_MASK(k1, a, b)
  }
            
  def _mm_testn_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTN_EPI64_MASK(a, b)
  }
            
  def _mm256_mask_testn_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TESTN_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_testn_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TESTN_EPI16_MASK(a, b)
  }
            
  def _mm512_mask_testn_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TESTN_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_testn_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_TESTN_EPI16_MASK(a, b)
  }
            
  def _mm_mask_testn_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TESTN_EPI16_MASK(k1, a, b)
  }
            
  def _mm_testn_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTN_EPI16_MASK(a, b)
  }
            
  def _mm256_mask_unpackhi_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKHI_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_unpackhi_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKHI_EPI8(k, a, b)
  }
            
  def _mm512_mask_unpackhi_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKHI_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_unpackhi_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKHI_EPI8(k, a, b)
  }
            
  def _mm512_unpackhi_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKHI_EPI8(a, b)
  }
            
  def _mm_mask_unpackhi_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKHI_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_unpackhi_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKHI_EPI8(k, a, b)
  }
            
  def _mm256_mask_unpackhi_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKHI_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_unpackhi_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKHI_EPI32(k, a, b)
  }
            
  def _mm_mask_unpackhi_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKHI_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_unpackhi_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKHI_EPI32(k, a, b)
  }
            
  def _mm256_mask_unpackhi_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKHI_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_unpackhi_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKHI_EPI64(k, a, b)
  }
            
  def _mm_mask_unpackhi_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKHI_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_unpackhi_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKHI_EPI64(k, a, b)
  }
            
  def _mm256_mask_unpackhi_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKHI_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_unpackhi_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKHI_EPI16(k, a, b)
  }
            
  def _mm512_mask_unpackhi_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKHI_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_unpackhi_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKHI_EPI16(k, a, b)
  }
            
  def _mm512_unpackhi_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKHI_EPI16(a, b)
  }
            
  def _mm_mask_unpackhi_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKHI_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_unpackhi_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKHI_EPI16(k, a, b)
  }
            
  def _mm256_mask_unpacklo_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKLO_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_unpacklo_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKLO_EPI8(k, a, b)
  }
            
  def _mm512_mask_unpacklo_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKLO_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_unpacklo_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKLO_EPI8(k, a, b)
  }
            
  def _mm512_unpacklo_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKLO_EPI8(a, b)
  }
            
  def _mm_mask_unpacklo_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKLO_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_unpacklo_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKLO_EPI8(k, a, b)
  }
            
  def _mm256_mask_unpacklo_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKLO_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_unpacklo_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKLO_EPI32(k, a, b)
  }
            
  def _mm_mask_unpacklo_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKLO_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_unpacklo_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKLO_EPI32(k, a, b)
  }
            
  def _mm256_mask_unpacklo_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKLO_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_unpacklo_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKLO_EPI64(k, a, b)
  }
            
  def _mm_mask_unpacklo_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKLO_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_unpacklo_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKLO_EPI64(k, a, b)
  }
            
  def _mm256_mask_unpacklo_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKLO_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_unpacklo_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKLO_EPI16(k, a, b)
  }
            
  def _mm512_mask_unpacklo_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKLO_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_unpacklo_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKLO_EPI16(k, a, b)
  }
            
  def _mm512_unpacklo_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKLO_EPI16(a, b)
  }
            
  def _mm_mask_unpacklo_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKLO_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_unpacklo_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKLO_EPI16(k, a, b)
  }
            
  def _mm256_mask_xor_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_XOR_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_xor_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_XOR_EPI32(k, a, b)
  }
            
  def _mm_mask_xor_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_XOR_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_xor_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_XOR_EPI32(k, a, b)
  }
            
  def _mm256_mask_xor_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_XOR_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_xor_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_XOR_EPI64(k, a, b)
  }
            
  def _mm_mask_xor_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_XOR_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_xor_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_XOR_EPI64(k, a, b)
  }
            
  def _mm256_mask_range_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_RANGE_PD(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_range_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_RANGE_PD(k, a, b, imm8)
  }
            
  def _mm256_range_pd(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_RANGE_PD(a, b, imm8)
  }
            
  def _mm512_mask_range_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_RANGE_PD(src, k, a, b, imm8)
  }
            
  def _mm512_mask_range_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_RANGE_ROUND_PD(src, k, a, b, imm8, rounding)
  }
            
  def _mm512_maskz_range_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_RANGE_PD(k, a, b, imm8)
  }
            
  def _mm512_maskz_range_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_RANGE_ROUND_PD(k, a, b, imm8, rounding)
  }
            
  def _mm512_range_pd(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_RANGE_PD(a, b, imm8)
  }
            
  def _mm512_range_round_pd(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_RANGE_ROUND_PD(a, b, imm8, rounding)
  }
            
  def _mm_mask_range_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_RANGE_PD(src, k, a, b, imm8)
  }
            
  def _mm_maskz_range_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RANGE_PD(k, a, b, imm8)
  }
            
  def _mm_range_pd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_RANGE_PD(a, b, imm8)
  }
            
  def _mm256_mask_range_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_RANGE_PS(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_range_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_RANGE_PS(k, a, b, imm8)
  }
            
  def _mm256_range_ps(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_RANGE_PS(a, b, imm8)
  }
            
  def _mm512_mask_range_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_RANGE_PS(src, k, a, b, imm8)
  }
            
  def _mm512_mask_range_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_RANGE_ROUND_PS(src, k, a, b, imm8, rounding)
  }
            
  def _mm512_maskz_range_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_RANGE_PS(k, a, b, imm8)
  }
            
  def _mm512_maskz_range_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_RANGE_ROUND_PS(k, a, b, imm8, rounding)
  }
            
  def _mm512_range_ps(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_RANGE_PS(a, b, imm8)
  }
            
  def _mm512_range_round_ps(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_RANGE_ROUND_PS(a, b, imm8, rounding)
  }
            
  def _mm_mask_range_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_RANGE_PS(src, k, a, b, imm8)
  }
            
  def _mm_maskz_range_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_RANGE_PS(k, a, b, imm8)
  }
            
  def _mm_range_ps(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_RANGE_PS(a, b, imm8)
  }
            
  def _mm_mask_range_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_RANGE_ROUND_SD(src, k, a, b, imm8, rounding)
  }
            
  def _mm_mask_range_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_RANGE_SD(src, k, a, b, imm8)
  }
            
  def _mm_maskz_range_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RANGE_ROUND_SD(k, a, b, imm8, rounding)
  }
            
  def _mm_maskz_range_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RANGE_SD(k, a, b, imm8)
  }
            
  def _mm_range_round_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_RANGE_ROUND_SD(a, b, imm8, rounding)
  }
            
  def _mm_mask_range_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_RANGE_ROUND_SS(src, k, a, b, imm8, rounding)
  }
            
  def _mm_mask_range_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_RANGE_SS(src, k, a, b, imm8)
  }
            
  def _mm_maskz_range_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_RANGE_ROUND_SS(k, a, b, imm8, rounding)
  }
            
  def _mm_maskz_range_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_RANGE_SS(k, a, b, imm8)
  }
            
  def _mm_range_round_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_RANGE_ROUND_SS(a, b, imm8, rounding)
  }
            
  def _mm256_mask_rcp14_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_RCP14_PD(src, k, a)
  }
            
  def _mm256_maskz_rcp14_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_RCP14_PD(k, a)
  }
            
  def _mm256_rcp14_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_RCP14_PD(a)
  }
            
  def _mm_mask_rcp14_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RCP14_PD(src, k, a)
  }
            
  def _mm_maskz_rcp14_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RCP14_PD(k, a)
  }
            
  def _mm_rcp14_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_RCP14_PD(a)
  }
            
  def _mm256_mask_rcp14_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_RCP14_PS(src, k, a)
  }
            
  def _mm256_maskz_rcp14_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_RCP14_PS(k, a)
  }
            
  def _mm256_rcp14_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_RCP14_PS(a)
  }
            
  def _mm_mask_rcp14_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RCP14_PS(src, k, a)
  }
            
  def _mm_maskz_rcp14_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RCP14_PS(k, a)
  }
            
  def _mm_rcp14_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_RCP14_PS(a)
  }
            
  def _mm256_mask_reduce_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_REDUCE_PD(src, k, a, imm8)
  }
            
  def _mm256_maskz_reduce_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_REDUCE_PD(k, a, imm8)
  }
            
  def _mm256_reduce_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_REDUCE_PD(a, imm8)
  }
            
  def _mm512_mask_reduce_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_REDUCE_PD(src, k, a, imm8)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_MASK_SUBS_EPU8 (src, k, a, b) =>
      _mm256_mask_subs_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUBS_EPU8 (k, a, b) =>
      _mm256_maskz_subs_epu8(f(k), f(a), f(b))
    case MM512_MASK_SUBS_EPU8 (src, k, a, b) =>
      _mm512_mask_subs_epu8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SUBS_EPU8 (k, a, b) =>
      _mm512_maskz_subs_epu8(f(k), f(a), f(b))
    case MM512_SUBS_EPU8 (a, b) =>
      _mm512_subs_epu8(f(a), f(b))
    case MM_MASK_SUBS_EPU8 (src, k, a, b) =>
      _mm_mask_subs_epu8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUBS_EPU8 (k, a, b) =>
      _mm_maskz_subs_epu8(f(k), f(a), f(b))
    case MM256_MASK_SUBS_EPU16 (src, k, a, b) =>
      _mm256_mask_subs_epu16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUBS_EPU16 (k, a, b) =>
      _mm256_maskz_subs_epu16(f(k), f(a), f(b))
    case MM512_MASK_SUBS_EPU16 (src, k, a, b) =>
      _mm512_mask_subs_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SUBS_EPU16 (k, a, b) =>
      _mm512_maskz_subs_epu16(f(k), f(a), f(b))
    case MM512_SUBS_EPU16 (a, b) =>
      _mm512_subs_epu16(f(a), f(b))
    case MM_MASK_SUBS_EPU16 (src, k, a, b) =>
      _mm_mask_subs_epu16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUBS_EPU16 (k, a, b) =>
      _mm_maskz_subs_epu16(f(k), f(a), f(b))
    case MM256_MASK_SUB_EPI16 (src, k, a, b) =>
      _mm256_mask_sub_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUB_EPI16 (k, a, b) =>
      _mm256_maskz_sub_epi16(f(k), f(a), f(b))
    case MM512_MASK_SUB_EPI16 (src, k, a, b) =>
      _mm512_mask_sub_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SUB_EPI16 (k, a, b) =>
      _mm512_maskz_sub_epi16(f(k), f(a), f(b))
    case MM512_SUB_EPI16 (a, b) =>
      _mm512_sub_epi16(f(a), f(b))
    case MM_MASK_SUB_EPI16 (src, k, a, b) =>
      _mm_mask_sub_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUB_EPI16 (k, a, b) =>
      _mm_maskz_sub_epi16(f(k), f(a), f(b))
    case MM256_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8) =>
      _mm256_mask_ternarylogic_epi32(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8) =>
      _mm256_maskz_ternarylogic_epi32(f(k), f(a), f(b), f(c), f(imm8))
    case MM256_TERNARYLOGIC_EPI32 (a, b, c, imm8) =>
      _mm256_ternarylogic_epi32(f(a), f(b), f(c), f(imm8))
    case MM_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8) =>
      _mm_mask_ternarylogic_epi32(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8) =>
      _mm_maskz_ternarylogic_epi32(f(k), f(a), f(b), f(c), f(imm8))
    case MM_TERNARYLOGIC_EPI32 (a, b, c, imm8) =>
      _mm_ternarylogic_epi32(f(a), f(b), f(c), f(imm8))
    case MM256_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8) =>
      _mm256_mask_ternarylogic_epi64(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8) =>
      _mm256_maskz_ternarylogic_epi64(f(k), f(a), f(b), f(c), f(imm8))
    case MM256_TERNARYLOGIC_EPI64 (a, b, c, imm8) =>
      _mm256_ternarylogic_epi64(f(a), f(b), f(c), f(imm8))
    case MM_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8) =>
      _mm_mask_ternarylogic_epi64(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8) =>
      _mm_maskz_ternarylogic_epi64(f(k), f(a), f(b), f(c), f(imm8))
    case MM_TERNARYLOGIC_EPI64 (a, b, c, imm8) =>
      _mm_ternarylogic_epi64(f(a), f(b), f(c), f(imm8))
    case MM256_MASK_TEST_EPI8_MASK (k1, a, b) =>
      _mm256_mask_test_epi8_mask(f(k1), f(a), f(b))
    case MM256_TEST_EPI8_MASK (a, b) =>
      _mm256_test_epi8_mask(f(a), f(b))
    case MM512_MASK_TEST_EPI8_MASK (k1, a, b) =>
      _mm512_mask_test_epi8_mask(f(k1), f(a), f(b))
    case MM512_TEST_EPI8_MASK (a, b) =>
      _mm512_test_epi8_mask(f(a), f(b))
    case MM_MASK_TEST_EPI8_MASK (k1, a, b) =>
      _mm_mask_test_epi8_mask(f(k1), f(a), f(b))
    case MM_TEST_EPI8_MASK (a, b) =>
      _mm_test_epi8_mask(f(a), f(b))
    case MM256_MASK_TEST_EPI32_MASK (k1, a, b) =>
      _mm256_mask_test_epi32_mask(f(k1), f(a), f(b))
    case MM256_TEST_EPI32_MASK (a, b) =>
      _mm256_test_epi32_mask(f(a), f(b))
    case MM_MASK_TEST_EPI32_MASK (k1, a, b) =>
      _mm_mask_test_epi32_mask(f(k1), f(a), f(b))
    case MM_TEST_EPI32_MASK (a, b) =>
      _mm_test_epi32_mask(f(a), f(b))
    case MM256_MASK_TEST_EPI64_MASK (k1, a, b) =>
      _mm256_mask_test_epi64_mask(f(k1), f(a), f(b))
    case MM256_TEST_EPI64_MASK (a, b) =>
      _mm256_test_epi64_mask(f(a), f(b))
    case MM_MASK_TEST_EPI64_MASK (k1, a, b) =>
      _mm_mask_test_epi64_mask(f(k1), f(a), f(b))
    case MM_TEST_EPI64_MASK (a, b) =>
      _mm_test_epi64_mask(f(a), f(b))
    case MM256_MASK_TEST_EPI16_MASK (k1, a, b) =>
      _mm256_mask_test_epi16_mask(f(k1), f(a), f(b))
    case MM256_TEST_EPI16_MASK (a, b) =>
      _mm256_test_epi16_mask(f(a), f(b))
    case MM512_MASK_TEST_EPI16_MASK (k1, a, b) =>
      _mm512_mask_test_epi16_mask(f(k1), f(a), f(b))
    case MM512_TEST_EPI16_MASK (a, b) =>
      _mm512_test_epi16_mask(f(a), f(b))
    case MM_MASK_TEST_EPI16_MASK (k1, a, b) =>
      _mm_mask_test_epi16_mask(f(k1), f(a), f(b))
    case MM_TEST_EPI16_MASK (a, b) =>
      _mm_test_epi16_mask(f(a), f(b))
    case MM256_MASK_TESTN_EPI8_MASK (k1, a, b) =>
      _mm256_mask_testn_epi8_mask(f(k1), f(a), f(b))
    case MM256_TESTN_EPI8_MASK (a, b) =>
      _mm256_testn_epi8_mask(f(a), f(b))
    case MM512_MASK_TESTN_EPI8_MASK (k1, a, b) =>
      _mm512_mask_testn_epi8_mask(f(k1), f(a), f(b))
    case MM512_TESTN_EPI8_MASK (a, b) =>
      _mm512_testn_epi8_mask(f(a), f(b))
    case MM_MASK_TESTN_EPI8_MASK (k1, a, b) =>
      _mm_mask_testn_epi8_mask(f(k1), f(a), f(b))
    case MM_TESTN_EPI8_MASK (a, b) =>
      _mm_testn_epi8_mask(f(a), f(b))
    case MM256_MASK_TESTN_EPI32_MASK (k1, a, b) =>
      _mm256_mask_testn_epi32_mask(f(k1), f(a), f(b))
    case MM256_TESTN_EPI32_MASK (a, b) =>
      _mm256_testn_epi32_mask(f(a), f(b))
    case MM_MASK_TESTN_EPI32_MASK (k1, a, b) =>
      _mm_mask_testn_epi32_mask(f(k1), f(a), f(b))
    case MM_TESTN_EPI32_MASK (a, b) =>
      _mm_testn_epi32_mask(f(a), f(b))
    case MM256_MASK_TESTN_EPI64_MASK (k1, a, b) =>
      _mm256_mask_testn_epi64_mask(f(k1), f(a), f(b))
    case MM256_TESTN_EPI64_MASK (a, b) =>
      _mm256_testn_epi64_mask(f(a), f(b))
    case MM_MASK_TESTN_EPI64_MASK (k1, a, b) =>
      _mm_mask_testn_epi64_mask(f(k1), f(a), f(b))
    case MM_TESTN_EPI64_MASK (a, b) =>
      _mm_testn_epi64_mask(f(a), f(b))
    case MM256_MASK_TESTN_EPI16_MASK (k1, a, b) =>
      _mm256_mask_testn_epi16_mask(f(k1), f(a), f(b))
    case MM256_TESTN_EPI16_MASK (a, b) =>
      _mm256_testn_epi16_mask(f(a), f(b))
    case MM512_MASK_TESTN_EPI16_MASK (k1, a, b) =>
      _mm512_mask_testn_epi16_mask(f(k1), f(a), f(b))
    case MM512_TESTN_EPI16_MASK (a, b) =>
      _mm512_testn_epi16_mask(f(a), f(b))
    case MM_MASK_TESTN_EPI16_MASK (k1, a, b) =>
      _mm_mask_testn_epi16_mask(f(k1), f(a), f(b))
    case MM_TESTN_EPI16_MASK (a, b) =>
      _mm_testn_epi16_mask(f(a), f(b))
    case MM256_MASK_UNPACKHI_EPI8 (src, k, a, b) =>
      _mm256_mask_unpackhi_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKHI_EPI8 (k, a, b) =>
      _mm256_maskz_unpackhi_epi8(f(k), f(a), f(b))
    case MM512_MASK_UNPACKHI_EPI8 (src, k, a, b) =>
      _mm512_mask_unpackhi_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKHI_EPI8 (k, a, b) =>
      _mm512_maskz_unpackhi_epi8(f(k), f(a), f(b))
    case MM512_UNPACKHI_EPI8 (a, b) =>
      _mm512_unpackhi_epi8(f(a), f(b))
    case MM_MASK_UNPACKHI_EPI8 (src, k, a, b) =>
      _mm_mask_unpackhi_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKHI_EPI8 (k, a, b) =>
      _mm_maskz_unpackhi_epi8(f(k), f(a), f(b))
    case MM256_MASK_UNPACKHI_EPI32 (src, k, a, b) =>
      _mm256_mask_unpackhi_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKHI_EPI32 (k, a, b) =>
      _mm256_maskz_unpackhi_epi32(f(k), f(a), f(b))
    case MM_MASK_UNPACKHI_EPI32 (src, k, a, b) =>
      _mm_mask_unpackhi_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKHI_EPI32 (k, a, b) =>
      _mm_maskz_unpackhi_epi32(f(k), f(a), f(b))
    case MM256_MASK_UNPACKHI_EPI64 (src, k, a, b) =>
      _mm256_mask_unpackhi_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKHI_EPI64 (k, a, b) =>
      _mm256_maskz_unpackhi_epi64(f(k), f(a), f(b))
    case MM_MASK_UNPACKHI_EPI64 (src, k, a, b) =>
      _mm_mask_unpackhi_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKHI_EPI64 (k, a, b) =>
      _mm_maskz_unpackhi_epi64(f(k), f(a), f(b))
    case MM256_MASK_UNPACKHI_EPI16 (src, k, a, b) =>
      _mm256_mask_unpackhi_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKHI_EPI16 (k, a, b) =>
      _mm256_maskz_unpackhi_epi16(f(k), f(a), f(b))
    case MM512_MASK_UNPACKHI_EPI16 (src, k, a, b) =>
      _mm512_mask_unpackhi_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKHI_EPI16 (k, a, b) =>
      _mm512_maskz_unpackhi_epi16(f(k), f(a), f(b))
    case MM512_UNPACKHI_EPI16 (a, b) =>
      _mm512_unpackhi_epi16(f(a), f(b))
    case MM_MASK_UNPACKHI_EPI16 (src, k, a, b) =>
      _mm_mask_unpackhi_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKHI_EPI16 (k, a, b) =>
      _mm_maskz_unpackhi_epi16(f(k), f(a), f(b))
    case MM256_MASK_UNPACKLO_EPI8 (src, k, a, b) =>
      _mm256_mask_unpacklo_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKLO_EPI8 (k, a, b) =>
      _mm256_maskz_unpacklo_epi8(f(k), f(a), f(b))
    case MM512_MASK_UNPACKLO_EPI8 (src, k, a, b) =>
      _mm512_mask_unpacklo_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKLO_EPI8 (k, a, b) =>
      _mm512_maskz_unpacklo_epi8(f(k), f(a), f(b))
    case MM512_UNPACKLO_EPI8 (a, b) =>
      _mm512_unpacklo_epi8(f(a), f(b))
    case MM_MASK_UNPACKLO_EPI8 (src, k, a, b) =>
      _mm_mask_unpacklo_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKLO_EPI8 (k, a, b) =>
      _mm_maskz_unpacklo_epi8(f(k), f(a), f(b))
    case MM256_MASK_UNPACKLO_EPI32 (src, k, a, b) =>
      _mm256_mask_unpacklo_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKLO_EPI32 (k, a, b) =>
      _mm256_maskz_unpacklo_epi32(f(k), f(a), f(b))
    case MM_MASK_UNPACKLO_EPI32 (src, k, a, b) =>
      _mm_mask_unpacklo_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKLO_EPI32 (k, a, b) =>
      _mm_maskz_unpacklo_epi32(f(k), f(a), f(b))
    case MM256_MASK_UNPACKLO_EPI64 (src, k, a, b) =>
      _mm256_mask_unpacklo_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKLO_EPI64 (k, a, b) =>
      _mm256_maskz_unpacklo_epi64(f(k), f(a), f(b))
    case MM_MASK_UNPACKLO_EPI64 (src, k, a, b) =>
      _mm_mask_unpacklo_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKLO_EPI64 (k, a, b) =>
      _mm_maskz_unpacklo_epi64(f(k), f(a), f(b))
    case MM256_MASK_UNPACKLO_EPI16 (src, k, a, b) =>
      _mm256_mask_unpacklo_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKLO_EPI16 (k, a, b) =>
      _mm256_maskz_unpacklo_epi16(f(k), f(a), f(b))
    case MM512_MASK_UNPACKLO_EPI16 (src, k, a, b) =>
      _mm512_mask_unpacklo_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKLO_EPI16 (k, a, b) =>
      _mm512_maskz_unpacklo_epi16(f(k), f(a), f(b))
    case MM512_UNPACKLO_EPI16 (a, b) =>
      _mm512_unpacklo_epi16(f(a), f(b))
    case MM_MASK_UNPACKLO_EPI16 (src, k, a, b) =>
      _mm_mask_unpacklo_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKLO_EPI16 (k, a, b) =>
      _mm_maskz_unpacklo_epi16(f(k), f(a), f(b))
    case MM256_MASK_XOR_EPI32 (src, k, a, b) =>
      _mm256_mask_xor_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_XOR_EPI32 (k, a, b) =>
      _mm256_maskz_xor_epi32(f(k), f(a), f(b))
    case MM_MASK_XOR_EPI32 (src, k, a, b) =>
      _mm_mask_xor_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_XOR_EPI32 (k, a, b) =>
      _mm_maskz_xor_epi32(f(k), f(a), f(b))
    case MM256_MASK_XOR_EPI64 (src, k, a, b) =>
      _mm256_mask_xor_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_XOR_EPI64 (k, a, b) =>
      _mm256_maskz_xor_epi64(f(k), f(a), f(b))
    case MM_MASK_XOR_EPI64 (src, k, a, b) =>
      _mm_mask_xor_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_XOR_EPI64 (k, a, b) =>
      _mm_maskz_xor_epi64(f(k), f(a), f(b))
    case MM256_MASK_RANGE_PD (src, k, a, b, imm8) =>
      _mm256_mask_range_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_RANGE_PD (k, a, b, imm8) =>
      _mm256_maskz_range_pd(f(k), f(a), f(b), f(imm8))
    case MM256_RANGE_PD (a, b, imm8) =>
      _mm256_range_pd(f(a), f(b), f(imm8))
    case MM512_MASK_RANGE_PD (src, k, a, b, imm8) =>
      _mm512_mask_range_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASK_RANGE_ROUND_PD (src, k, a, b, imm8, rounding) =>
      _mm512_mask_range_round_pd(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM512_MASKZ_RANGE_PD (k, a, b, imm8) =>
      _mm512_maskz_range_pd(f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_RANGE_ROUND_PD (k, a, b, imm8, rounding) =>
      _mm512_maskz_range_round_pd(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM512_RANGE_PD (a, b, imm8) =>
      _mm512_range_pd(f(a), f(b), f(imm8))
    case MM512_RANGE_ROUND_PD (a, b, imm8, rounding) =>
      _mm512_range_round_pd(f(a), f(b), f(imm8), f(rounding))
    case MM_MASK_RANGE_PD (src, k, a, b, imm8) =>
      _mm_mask_range_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_RANGE_PD (k, a, b, imm8) =>
      _mm_maskz_range_pd(f(k), f(a), f(b), f(imm8))
    case MM_RANGE_PD (a, b, imm8) =>
      _mm_range_pd(f(a), f(b), f(imm8))
    case MM256_MASK_RANGE_PS (src, k, a, b, imm8) =>
      _mm256_mask_range_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_RANGE_PS (k, a, b, imm8) =>
      _mm256_maskz_range_ps(f(k), f(a), f(b), f(imm8))
    case MM256_RANGE_PS (a, b, imm8) =>
      _mm256_range_ps(f(a), f(b), f(imm8))
    case MM512_MASK_RANGE_PS (src, k, a, b, imm8) =>
      _mm512_mask_range_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASK_RANGE_ROUND_PS (src, k, a, b, imm8, rounding) =>
      _mm512_mask_range_round_ps(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM512_MASKZ_RANGE_PS (k, a, b, imm8) =>
      _mm512_maskz_range_ps(f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_RANGE_ROUND_PS (k, a, b, imm8, rounding) =>
      _mm512_maskz_range_round_ps(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM512_RANGE_PS (a, b, imm8) =>
      _mm512_range_ps(f(a), f(b), f(imm8))
    case MM512_RANGE_ROUND_PS (a, b, imm8, rounding) =>
      _mm512_range_round_ps(f(a), f(b), f(imm8), f(rounding))
    case MM_MASK_RANGE_PS (src, k, a, b, imm8) =>
      _mm_mask_range_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_RANGE_PS (k, a, b, imm8) =>
      _mm_maskz_range_ps(f(k), f(a), f(b), f(imm8))
    case MM_RANGE_PS (a, b, imm8) =>
      _mm_range_ps(f(a), f(b), f(imm8))
    case MM_MASK_RANGE_ROUND_SD (src, k, a, b, imm8, rounding) =>
      _mm_mask_range_round_sd(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASK_RANGE_SD (src, k, a, b, imm8) =>
      _mm_mask_range_sd(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_RANGE_ROUND_SD (k, a, b, imm8, rounding) =>
      _mm_maskz_range_round_sd(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASKZ_RANGE_SD (k, a, b, imm8) =>
      _mm_maskz_range_sd(f(k), f(a), f(b), f(imm8))
    case MM_RANGE_ROUND_SD (a, b, imm8, rounding) =>
      _mm_range_round_sd(f(a), f(b), f(imm8), f(rounding))
    case MM_MASK_RANGE_ROUND_SS (src, k, a, b, imm8, rounding) =>
      _mm_mask_range_round_ss(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASK_RANGE_SS (src, k, a, b, imm8) =>
      _mm_mask_range_ss(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_RANGE_ROUND_SS (k, a, b, imm8, rounding) =>
      _mm_maskz_range_round_ss(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASKZ_RANGE_SS (k, a, b, imm8) =>
      _mm_maskz_range_ss(f(k), f(a), f(b), f(imm8))
    case MM_RANGE_ROUND_SS (a, b, imm8, rounding) =>
      _mm_range_round_ss(f(a), f(b), f(imm8), f(rounding))
    case MM256_MASK_RCP14_PD (src, k, a) =>
      _mm256_mask_rcp14_pd(f(src), f(k), f(a))
    case MM256_MASKZ_RCP14_PD (k, a) =>
      _mm256_maskz_rcp14_pd(f(k), f(a))
    case MM256_RCP14_PD (a) =>
      _mm256_rcp14_pd(f(a))
    case MM_MASK_RCP14_PD (src, k, a) =>
      _mm_mask_rcp14_pd(f(src), f(k), f(a))
    case MM_MASKZ_RCP14_PD (k, a) =>
      _mm_maskz_rcp14_pd(f(k), f(a))
    case MM_RCP14_PD (a) =>
      _mm_rcp14_pd(f(a))
    case MM256_MASK_RCP14_PS (src, k, a) =>
      _mm256_mask_rcp14_ps(f(src), f(k), f(a))
    case MM256_MASKZ_RCP14_PS (k, a) =>
      _mm256_maskz_rcp14_ps(f(k), f(a))
    case MM256_RCP14_PS (a) =>
      _mm256_rcp14_ps(f(a))
    case MM_MASK_RCP14_PS (src, k, a) =>
      _mm_mask_rcp14_ps(f(src), f(k), f(a))
    case MM_MASKZ_RCP14_PS (k, a) =>
      _mm_maskz_rcp14_ps(f(k), f(a))
    case MM_RCP14_PS (a) =>
      _mm_rcp14_ps(f(a))
    case MM256_MASK_REDUCE_PD (src, k, a, imm8) =>
      _mm256_mask_reduce_pd(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_REDUCE_PD (k, a, imm8) =>
      _mm256_maskz_reduce_pd(f(k), f(a), f(imm8))
    case MM256_REDUCE_PD (a, imm8) =>
      _mm256_reduce_pd(f(a), f(imm8))
    case MM512_MASK_REDUCE_PD (src, k, a, imm8) =>
      _mm512_mask_reduce_pd(f(src), f(k), f(a), f(imm8))

    case Reflect(MM256_MASK_SUBS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUBS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUBS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUBS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUBS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUBS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBS_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUBS_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUBS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUBS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUBS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUBS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUBS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUBS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUBS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUBS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUBS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUBS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBS_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUBS_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUBS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUBS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUBS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUBS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUB_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUB_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUB_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUB_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUB_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUB_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TERNARYLOGIC_EPI32 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_TERNARYLOGIC_EPI32 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TERNARYLOGIC_EPI32 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_TERNARYLOGIC_EPI32 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TERNARYLOGIC_EPI32 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_TERNARYLOGIC_EPI32 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TERNARYLOGIC_EPI32 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_TERNARYLOGIC_EPI32 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TERNARYLOGIC_EPI64 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_TERNARYLOGIC_EPI64 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TERNARYLOGIC_EPI64 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_TERNARYLOGIC_EPI64 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TERNARYLOGIC_EPI64 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_TERNARYLOGIC_EPI64 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TERNARYLOGIC_EPI64 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_TERNARYLOGIC_EPI64 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TEST_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TEST_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TEST_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TEST_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TEST_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TEST_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TEST_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TEST_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TEST_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TEST_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TEST_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TEST_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TEST_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TEST_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TEST_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TEST_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TEST_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TEST_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TEST_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TEST_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TEST_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TEST_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TEST_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TEST_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TEST_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TEST_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TEST_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TEST_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TEST_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TEST_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TEST_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TEST_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TEST_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TEST_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TEST_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TEST_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TESTN_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TESTN_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTN_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTN_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TESTN_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TESTN_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TESTN_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TESTN_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TESTN_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TESTN_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTN_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTN_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TESTN_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TESTN_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTN_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTN_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TESTN_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TESTN_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTN_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTN_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TESTN_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TESTN_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTN_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTN_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TESTN_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TESTN_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTN_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTN_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TESTN_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TESTN_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTN_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTN_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TESTN_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TESTN_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TESTN_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TESTN_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TESTN_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TESTN_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTN_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTN_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_XOR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_XOR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_XOR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_XOR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_XOR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_XOR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_XOR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_XOR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_XOR_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_XOR_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_XOR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_XOR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_XOR_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_XOR_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_XOR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_XOR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RANGE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RANGE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RANGE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RANGE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RANGE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_RANGE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RANGE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RANGE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RANGE_ROUND_PD (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RANGE_ROUND_PD (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RANGE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RANGE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RANGE_ROUND_PD (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RANGE_ROUND_PD (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RANGE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_RANGE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RANGE_ROUND_PD (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RANGE_ROUND_PD (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RANGE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_RANGE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RANGE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RANGE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RANGE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RANGE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RANGE_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_RANGE_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RANGE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RANGE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RANGE_ROUND_PS (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RANGE_ROUND_PS (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RANGE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RANGE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RANGE_ROUND_PS (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RANGE_ROUND_PS (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RANGE_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_RANGE_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RANGE_ROUND_PS (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RANGE_ROUND_PS (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RANGE_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_RANGE_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_ROUND_SD (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_ROUND_SD (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_SD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_SD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_ROUND_SD (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_ROUND_SD (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_SD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_SD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RANGE_ROUND_SD (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RANGE_ROUND_SD (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_ROUND_SS (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_ROUND_SS (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_SS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_SS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_ROUND_SS (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_ROUND_SS (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_SS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_SS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RANGE_ROUND_SS (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RANGE_ROUND_SS (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RCP14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RCP14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RCP14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RCP14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RCP14_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_RCP14_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP14_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_RCP14_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RCP14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RCP14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RCP14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RCP14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RCP14_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_RCP14_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP14_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_RCP14_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_REDUCE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_REDUCE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_REDUCE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_REDUCE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REDUCE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_REDUCE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512018 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM256_MASK_SUBS_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_subs_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUBS_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_subs_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_SUBS_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_subs_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SUBS_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_subs_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_SUBS_EPU8(a, b) =>
      emitValDef(sym, s"_mm512_subs_epu8(${quote(a)}, ${quote(b)})")
    case MM_MASK_SUBS_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_subs_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUBS_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_subs_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_SUBS_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_subs_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUBS_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_subs_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_SUBS_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_subs_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SUBS_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_subs_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_SUBS_EPU16(a, b) =>
      emitValDef(sym, s"_mm512_subs_epu16(${quote(a)}, ${quote(b)})")
    case MM_MASK_SUBS_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_subs_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUBS_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_subs_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_SUB_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_sub_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUB_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_sub_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_SUB_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_sub_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SUB_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_sub_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_SUB_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_sub_epi16(${quote(a)}, ${quote(b)})")
    case MM_MASK_SUB_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sub_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUB_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sub_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_ternarylogic_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8) =>
      emitValDef(sym, s"_mm256_maskz_ternarylogic_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_TERNARYLOGIC_EPI32(a, b, c, imm8) =>
      emitValDef(sym, s"_mm256_ternarylogic_epi32(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_ternarylogic_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8) =>
      emitValDef(sym, s"_mm_maskz_ternarylogic_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_TERNARYLOGIC_EPI32(a, b, c, imm8) =>
      emitValDef(sym, s"_mm_ternarylogic_epi32(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_ternarylogic_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8) =>
      emitValDef(sym, s"_mm256_maskz_ternarylogic_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_TERNARYLOGIC_EPI64(a, b, c, imm8) =>
      emitValDef(sym, s"_mm256_ternarylogic_epi64(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_ternarylogic_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8) =>
      emitValDef(sym, s"_mm_maskz_ternarylogic_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_TERNARYLOGIC_EPI64(a, b, c, imm8) =>
      emitValDef(sym, s"_mm_ternarylogic_epi64(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_MASK_TEST_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_test_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_TEST_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm256_test_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_TEST_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_test_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_TEST_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm512_test_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_TEST_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_test_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_TEST_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm_test_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_TEST_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_test_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_TEST_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm256_test_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_TEST_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_test_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_TEST_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm_test_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_TEST_EPI64_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_test_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_TEST_EPI64_MASK(a, b) =>
      emitValDef(sym, s"_mm256_test_epi64_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_TEST_EPI64_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_test_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_TEST_EPI64_MASK(a, b) =>
      emitValDef(sym, s"_mm_test_epi64_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_TEST_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_test_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_TEST_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm256_test_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_TEST_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_test_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_TEST_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm512_test_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_TEST_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_test_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_TEST_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm_test_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_TESTN_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_testn_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_TESTN_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm256_testn_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_TESTN_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_testn_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_TESTN_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm512_testn_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_TESTN_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_testn_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_TESTN_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm_testn_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_TESTN_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_testn_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_TESTN_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm256_testn_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_TESTN_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_testn_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_TESTN_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm_testn_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_TESTN_EPI64_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_testn_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_TESTN_EPI64_MASK(a, b) =>
      emitValDef(sym, s"_mm256_testn_epi64_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_TESTN_EPI64_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_testn_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_TESTN_EPI64_MASK(a, b) =>
      emitValDef(sym, s"_mm_testn_epi64_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_TESTN_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_testn_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_TESTN_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm256_testn_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_TESTN_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_testn_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_TESTN_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm512_testn_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_TESTN_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_testn_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_TESTN_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm_testn_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKHI_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpackhi_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKHI_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpackhi_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKHI_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpackhi_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKHI_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpackhi_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKHI_EPI8(a, b) =>
      emitValDef(sym, s"_mm512_unpackhi_epi8(${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKHI_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpackhi_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKHI_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpackhi_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKHI_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpackhi_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKHI_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpackhi_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKHI_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpackhi_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKHI_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpackhi_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKHI_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpackhi_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKHI_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpackhi_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKHI_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpackhi_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKHI_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpackhi_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKHI_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpackhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKHI_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpackhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKHI_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpackhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKHI_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpackhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKHI_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_unpackhi_epi16(${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKHI_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpackhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKHI_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpackhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKLO_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpacklo_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKLO_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpacklo_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKLO_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpacklo_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKLO_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpacklo_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKLO_EPI8(a, b) =>
      emitValDef(sym, s"_mm512_unpacklo_epi8(${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKLO_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpacklo_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKLO_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpacklo_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKLO_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpacklo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKLO_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpacklo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKLO_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpacklo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKLO_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpacklo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKLO_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpacklo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKLO_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpacklo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKLO_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpacklo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKLO_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpacklo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKLO_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpacklo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKLO_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpacklo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKLO_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpacklo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKLO_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpacklo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKLO_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_unpacklo_epi16(${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKLO_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpacklo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKLO_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpacklo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_XOR_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_xor_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_XOR_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_xor_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_XOR_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_xor_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_XOR_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_xor_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_XOR_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_xor_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_XOR_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_xor_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_XOR_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_xor_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_XOR_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_xor_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_RANGE_PD(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_range_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_RANGE_PD(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_range_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_RANGE_PD(a, b, imm8) =>
      emitValDef(sym, s"_mm256_range_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_RANGE_PD(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_range_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_RANGE_ROUND_PD(src, k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm512_mask_range_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_MASKZ_RANGE_PD(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_range_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_RANGE_ROUND_PD(k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm512_maskz_range_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_RANGE_PD(a, b, imm8) =>
      emitValDef(sym, s"_mm512_range_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_RANGE_ROUND_PD(a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm512_range_round_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_RANGE_PD(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_range_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_RANGE_PD(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_range_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_RANGE_PD(a, b, imm8) =>
      emitValDef(sym, s"_mm_range_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_RANGE_PS(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_range_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_RANGE_PS(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_range_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_RANGE_PS(a, b, imm8) =>
      emitValDef(sym, s"_mm256_range_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_RANGE_PS(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_range_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_RANGE_ROUND_PS(src, k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm512_mask_range_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_MASKZ_RANGE_PS(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_range_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_RANGE_ROUND_PS(k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm512_maskz_range_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_RANGE_PS(a, b, imm8) =>
      emitValDef(sym, s"_mm512_range_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_RANGE_ROUND_PS(a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm512_range_round_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_RANGE_PS(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_range_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_RANGE_PS(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_range_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_RANGE_PS(a, b, imm8) =>
      emitValDef(sym, s"_mm_range_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_RANGE_ROUND_SD(src, k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_mask_range_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_RANGE_SD(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_range_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_RANGE_ROUND_SD(k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_maskz_range_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASKZ_RANGE_SD(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_range_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_RANGE_ROUND_SD(a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_range_round_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_RANGE_ROUND_SS(src, k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_mask_range_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_RANGE_SS(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_range_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_RANGE_ROUND_SS(k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_maskz_range_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASKZ_RANGE_SS(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_range_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_RANGE_ROUND_SS(a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_range_round_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM256_MASK_RCP14_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_rcp14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_RCP14_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_rcp14_pd(${quote(k)}, ${quote(a)})")
    case MM256_RCP14_PD(a) =>
      emitValDef(sym, s"_mm256_rcp14_pd(${quote(a)})")
    case MM_MASK_RCP14_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_rcp14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_RCP14_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_rcp14_pd(${quote(k)}, ${quote(a)})")
    case MM_RCP14_PD(a) =>
      emitValDef(sym, s"_mm_rcp14_pd(${quote(a)})")
    case MM256_MASK_RCP14_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_rcp14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_RCP14_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_rcp14_ps(${quote(k)}, ${quote(a)})")
    case MM256_RCP14_PS(a) =>
      emitValDef(sym, s"_mm256_rcp14_ps(${quote(a)})")
    case MM_MASK_RCP14_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_rcp14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_RCP14_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_rcp14_ps(${quote(k)}, ${quote(a)})")
    case MM_RCP14_PS(a) =>
      emitValDef(sym, s"_mm_rcp14_ps(${quote(a)})")
    case MM256_MASK_REDUCE_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_reduce_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_REDUCE_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_reduce_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_REDUCE_PD(a, imm8) =>
      emitValDef(sym, s"_mm256_reduce_pd(${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_REDUCE_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_reduce_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case _ => super.emitNode(sym, rhs)
  }
}
