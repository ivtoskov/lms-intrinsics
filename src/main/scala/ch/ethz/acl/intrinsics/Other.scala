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

    
trait Other extends IntrinsicsBase {
  /**
   * Shift the bits of unsigned 64-bit integer "a" right by the number of bits
   * specified in "shift", rotating the least-significant bit to the
   * most-significant bit location, and store the unsigned result in "dst".
   * a: unsigned long, shift: int
   */
  case class LROTR(a: Exp[ULong], shift: Exp[Int]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of leading zero bits in unsigned 32-bit integer "a", and
   * return that count in "dst".
   * a: unsigned int
   */
  case class LZCNT_U32(a: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Checks if "q" is within its lower bound, and throws a #BR if not.
   * q: const void *, qOffset: int
   */
  case class BND_CHK_PTR_LBOUNDS[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of trailing zero bits in unsigned 32-bit integer "a", and
   * return that count in "dst".
   * a: unsigned int
   */
  case class TZCNT_U32(a: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Free aligned memory that was allocated with "_mm_malloc".
   * mem_addr: void *, mem_addrOffset: int
   */
  case class MM_FREE[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Read the GS segment base register and store the 32-bit result in "dst".

   */
  case class READGSBASE_U32() extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return the bit at index "b" of 64-bit integer "a", and set that bit to one.
   * a: __int64*, b: __int64, aOffset: int
   */
  case class BITTESTANDSET64[A[_], U:Integral](a: Exp[A[Long]], b: Exp[Long], aOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial restore of the enabled processor states using the
   * state information stored in memory at "mem_addr". State is restored based on
   * bits [62:0] in "rs_mask", "XCR0", and "mem_addr.HEADER.XSTATE_BV". "mem_addr"
   * must be aligned on a 64-byte boundary.
   * mem_addr: void *, rs_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XRSTOR[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], rs_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Treat the processor-specific feature(s) specified in "a" as available.
   * Multiple features may be OR'd together. See the valid feature flags below:
   * a: unsigned __int64
   */
  case class ALLOW_CPU_FEATURES(a: Exp[ULong]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy the current 64-bit value of the processor's time-stamp counter into
   * "dst", and store the IA32_TSC_AUX MSR (signature value) into memory at
   * "mem_addr".
   * mem_addr: unsigned int *, mem_addrOffset: int
   */
  case class RDTSCP[A[_], U:Integral](mem_addr: Exp[A[UInt]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, ULong] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract contiguous bits from unsigned 32-bit integer "a", and store the result
   * in "dst". Extract the number of bits specified by bits 15:8 of "control",
   * starting at the bit specified by bits 0:7 of "control".
   * a: unsigned int, control: unsigned int
   */
  case class BEXTR2_U32(a: Exp[UInt], control: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy all bits from unsigned 32-bit integer "a" to "dst", and reset (set to 0)
   * the high bits in "dst" starting at "index".
   * a: unsigned int, index: unsigned int
   */
  case class BZHI_U32(a: Exp[UInt], index: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial save of the enabled processor states to memory at
   * "mem_addr"; xsaves differs from xsave in that it can save state components
   * corresponding to bits set in IA32_XSS MSR and that it may use the modified
   * optimization. State is saved based on bits [62:0] in "save_mask" and "XCR0".
   * "mem_addr" must be aligned on a 64-byte boundary.
   * mem_addr: void *, save_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XSAVES64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 64-bit integer "a" and then AND with b, and store
   * the results in dst.
   * a: unsigned __int64, b: unsigned __int64
   */
  case class ANDN_U64(a: Exp[ULong], b: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Force an RTM abort. The EAX register is updated to reflect an XABORT
   * instruction caused the abort, and the "imm8" parameter will be provided in
   * bits [31:24] of EAX.
   * 	Following an RTM abort, the logical processor resumes
   * execution at the fallback address computed through the outermost XBEGIN
   * instruction.
   * imm8: const unsigned int
   */
  case class XABORT(imm8: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract contiguous bits from unsigned 64-bit integer "a", and store the result
   * in "dst". Extract the number of bits specified by bits 15:8 of "control",
   * starting at the bit specified by bits 0:7 of "control"..
   * a: unsigned __int64, control: unsigned __int64
   */
  case class BEXTR2_U64(a: Exp[ULong], control: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of bits set to 1 in unsigned 32-bit integer "a", and
   * return that count in "dst".
   * a: unsigned int
   */
  case class MM_POPCNT_U32(a: Exp[UInt]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Checks if ["q", "q" + "size" - 1] is within the lower and upper bounds of "q"
   * and throws a #BR if not.
   * q: const void *, size: size_t, qOffset: int
   */
  case class BND_CHK_PTR_BOUNDS[A[_], T:Typ, U:Integral](q: Exp[A[T]], size: Exp[Int], qOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set "index" to the index of the highest set bit in 32-bit integer "mask". If
   * no bits are set in "mask", then set "dst" to 0, otherwise set "dst" to 1.
   * index: unsigned __int32*, mask: unsigned __int32, indexOffset: int
   */
  case class BITSCANREVERSE[A[_], U:Integral](index: Exp[A[UInt]], mask: Exp[UInt], indexOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return the bit at index "b" of 32-bit integer "a", and set that bit to zero.
   * a: __int32*, b: __int32, aOffset: int
   */
  case class BITTESTANDRESET[A[_], U:Integral](a: Exp[A[Int]], b: Exp[Int], aOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set "index" to the index of the lowest set bit in 32-bit integer "mask". If no
   * bits are set in "mask", then set "dst" to 0, otherwise set "dst" to 1.
   * index: unsigned __int32*, mask: unsigned __int32, indexOffset: int
   */
  case class BITSCANFORWARD[A[_], U:Integral](index: Exp[A[UInt]], mask: Exp[UInt], indexOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply unsigned 32-bit integers "a" and "b", store the low 32-bits of the
   * result in "dst", and store the high 32-bits in "hi". This does not read or
   * write arithmetic flags.
   * a: unsigned int, b: unsigned int, hi: unsigned int*, hiOffset: int
   */
  case class MULX_U32[A[_], U:Integral](a: Exp[UInt], b: Exp[UInt], hi: Exp[A[UInt]], hiOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UInt] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the single-precision (32-bit) floating-point value "a" to a
   * half-precision (16-bit) floating-point value, and store the result in "dst".
   * a: float, imm8: int
   */
  case class CVTSS_SH(a: Exp[Float], imm8: Exp[Int]) extends IntrinsicsDef[UShort] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 16-bit integer from the first element of "a" into memory. "mem_addr"
   * does not need to be aligned on any particular boundary.
   * mem_addr: void*, a: __m128i, mem_addrOffset: int
   */
  case class MM_STOREU_SI16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Hint to the processor that it can enter an implementation-dependent-optimized
   * state while waiting for an event or store operation to the address range
   * specified by MONITOR.
   * extensions: unsigned, hints: unsigned
   */
  case class MM_MWAIT(extensions: Exp[UInt], hints: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Set "dst" to the index of the highest set bit in 32-bit integer "a". If no
   * bits are set in "a" then "dst" is undefined.
   * a: int
   */
  case class BIT_SCAN_REVERSE(a: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform one round of an AES decryption flow on data (state) in "a" using the
   * round key in "RoundKey", and store the result in "dst"."
   * a: __m128i, roundKey: __m128i
   */
  case class MM_AESDEC_SI128(a: Exp[__m128i], roundKey: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "wmmintrin.h"
  }
      

  /**
   * Assist in expanding the AES cipher key by computing steps towards generating a
   * round key for encryption cipher using data from "a" and an 8-bit round
   * constant specified in "imm8", and store the result in "dst"."
   * a: __m128i, imm8: const int
   */
  case class MM_AESKEYGENASSIST_SI128(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "wmmintrin.h"
  }
      

  /**
   * Return the bit at index "b" of 64-bit integer "a".
   * a: __int64*, b: __int64, aOffset: int
   */
  case class BITTEST64[A[_], U:Integral](a: Exp[A[Long]], b: Exp[Long], aOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Save the current state of the x87 FPU, MMX technology, XMM, and MXCSR
   * registers to a 512-byte memory location at "mem_addr". The clayout of the
   * 512-byte region depends on the operating mode. Bytes [511:464] are available
   * for software use and will not be overwritten by the processor.
   * mem_addr: void *, mem_addrOffset: int
   */
  case class FXSAVE[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform the final calculation for the next four SHA1 message values (unsigned
   * 32-bit integers) using the intermediate result in "a" and the previous message
   * values in "b", and store the result in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SHA1MSG2_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reload the x87 FPU, MMX technology, XMM, and MXCSR registers from the 512-byte
   * memory image at "mem_addr". This data should have been written to memory
   * previously using the FXSAVE64 instruction, and in the same format as required
   * by the operating mode. "mem_addr" must be aligned on a 16-byte boundary.
   * mem_addr: void *, mem_addrOffset: int
   */
  case class FXRSTOR64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Write the unsigned 32-bit integer "a" to the GS segment base register.
   * a: unsigned int
   */
  case class WRITEGSBASE_U32(a: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift the bits of unsigned 16-bit integer "a" right by the number of bits
   * specified in "shift", rotating the least-significant bit to the
   * most-significant bit location, and store the unsigned result in "dst".
   * a: unsigned short, shift: int
   */
  case class ROTWR(a: Exp[UShort], shift: Exp[Int]) extends IntrinsicsDef[UShort] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add unsigned 64-bit integers "a" and "b" with unsigned 8-bit carry-in "c_in"
   * (carry or overflow flag), and store the unsigned 64-bit result in "out", and
   * the carry-out in "dst" (carry or overflow flag).
   * c_in: unsigned char, a: unsigned __int64, b: unsigned __int64, out: unsigned __int64 *, outOffset: int
   */
  case class ADDCARRYX_U64[A[_], U:Integral](c_in: Exp[UByte], a: Exp[ULong], b: Exp[ULong], out: Exp[A[ULong]], outOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Deposit contiguous low bits from unsigned 64-bit integer "a" to "dst" at the
   * corresponding bit locations specified by "mask"; all other bits in "dst" are
   * set to zero.
   * a: unsigned __int64, mask: unsigned __int64
   */
  case class PDEP_U64(a: Exp[ULong], mask: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m128i
   */
  case class MM_CVTPH_PS(a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m128i
   */
  case class MM256_CVTPH_PS(a: Exp[__m128i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores the bounds of "ptr_val" pointer in memory at address "ptr_addr".
   * ptr_addr: const void **, ptr_val: const void *, ptr_valOffset: int
   */
  case class BND_STORE_PTR_BOUNDS[A[_], T:Typ, U:Integral](ptr_addr: Exp[DoubleVoidPointer], ptr_val: Exp[A[T]], ptr_valOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Arm address monitoring hardware using the address specified in "p". A store to
   * an address within the specified address range triggers the monitoring
   * hardware. Specify optional extensions in "extensions", and optional hints in
   * "hints".
   * p: void const*, extensions: unsigned, hints: unsigned, pOffset: int
   */
  case class MM_MONITOR[A[_], T:Typ, U:Integral](p: Exp[A[T]], extensions: Exp[UInt], hints: Exp[UInt], pOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "pmmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTPS_PH(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy all bits from unsigned 64-bit integer "a" to "dst", and reset (set to 0)
   * the bit in "dst" that corresponds to the lowest set bit in "a".
   * a: unsigned __int64
   */
  case class BLSR_U64(a: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the lowest set bit from unsigned 64-bit integer "a" and set the
   * corresponding bit in "dst". All other bits in "dst" are zeroed, and all bits
   * are zeroed if no bits are set in "a".
   * a: unsigned __int64
   */
  case class BLSI_U64(a: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set "index" to the index of the highest set bit in 64-bit integer "mask". If
   * no bits are set in "mask", then set "dst" to 0, otherwise set "dst" to 1.
   * index: unsigned __int32*, mask: unsigned __int64, indexOffset: int
   */
  case class BITSCANREVERSE64[A[_], U:Integral](index: Exp[A[UInt]], mask: Exp[ULong], indexOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a carry-less multiplication of two 64-bit integers, selected from "a"
   * and "b" according to "imm8", and store the results in "dst".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CLMULEPI64_SI128(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.ApplicationTargeted)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "wmmintrin.h"
  }
      

  /**
   * Make a pointer with the value of "q" and open bounds, which allow the pointer
   * to access the entire virtual address space, and store the result in "dst".
   * q: const void *, qOffset: int
   */
  case class BND_INIT_PTR_BOUNDS[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, VoidPointer] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial save of the enabled processor states to memory at
   * "mem_addr". State is saved based on bits [62:0] in "save_mask" and "XCR0".
   * "mem_addr" must be aligned on a 64-byte boundary.
   * mem_addr: void *, save_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XSAVE64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast from type unsigned __int64 to type double without conversion.
   * 	This
   * intrinsic is only used for compilation and does not generate any instructions,
   * thus it has zero latency.
   * a: unsigned __int64
   */
  case class CASTU64_F64(a: Exp[ULong]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reload the x87 FPU, MMX technology, XMM, and MXCSR registers from the 512-byte
   * memory image at "mem_addr". This data should have been written to memory
   * previously using the FXSAVE instruction, and in the same format as required by
   * the operating mode. "mem_addr" must be aligned on a 16-byte boundary.
   * mem_addr: void *, mem_addrOffset: int
   */
  case class FXRSTOR[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Read a hardware generated 64-bit random value and store the result in "val".
   * Return 1 if a random value was generated, and 0 otherwise.
   * value: unsigned __int64*, valueOffset: int
   */
  case class RDRAND64_STEP[A[_], U:Integral](value: Exp[A[ULong]], valueOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Int] {
    val category = List(IntrinsicsCategory.Random)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift the bits of unsigned 32-bit integer "a" left by the number of bits
   * specified in "shift", rotating the most-significant bit to the
   * least-significant bit location, and store the unsigned result in "dst".
   * a: unsigned int, shift: int
   */
  case class ROTL(a: Exp[UInt], shift: Exp[Int]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set "dst" to the index of the lowest set bit in 32-bit integer "a". If no bits
   * are set in "a" then "dst" is undefined.
   * a: int
   */
  case class BIT_SCAN_FORWARD(a: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of bits set to 1 in unsigned 64-bit integer "a", and
   * return that count in "dst".
   * a: unsigned __int64
   */
  case class MM_POPCNT_U64(a: Exp[ULong]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "nmmintrin.h"
  }
      

  /**
   * Read a hardware generated 16-bit random value and store the result in "val".
   * Return 1 if a random value was generated, and 0 otherwise.
   * value: unsigned short*, valueOffset: int
   */
  case class RDRAND16_STEP[A[_], U:Integral](value: Exp[A[UShort]], valueOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Int] {
    val category = List(IntrinsicsCategory.Random)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform 2 rounds of SHA256 operation using an initial SHA256 state (C,D,G,H)
   * from "a", an initial SHA256 state (A,B,E,F) from "b", and a pre-computed sum
   * of the next 2 round message values (unsigned 32-bit integers) and the
   * corresponding round constants from "k", and store the updated SHA256 state
   * (A,B,E,F) in "dst".
   * a: __m128i, b: __m128i, k: __m128i
   */
  case class MM_SHA256RNDS2_EPU32(a: Exp[__m128i], b: Exp[__m128i], k: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial save of the enabled processor states to memory at
   * "mem_addr"; xsavec differs from xsave in that it uses compaction and that it
   * may use init optimization. State is saved based on bits [62:0] in "save_mask"
   * and "XCR0". "mem_addr" must be aligned on a 64-byte boundary.
   * mem_addr: void *, save_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XSAVEC64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract bits from unsigned 32-bit integer "a" at the corresponding bit
   * locations specified by "mask" to contiguous low bits in "dst"; the remaining
   * upper bits in "dst" are set to zero.
   * a: unsigned int, mask: unsigned int
   */
  case class PEXT_U32(a: Exp[UInt], mask: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform the last round of an AES encryption flow on data (state) in "a" using
   * the round key in "RoundKey", and store the result in "dst"."
   * a: __m128i, roundKey: __m128i
   */
  case class MM_AESENCLAST_SI128(a: Exp[__m128i], roundKey: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "wmmintrin.h"
  }
      

  /**
   * Cast from type double to type unsigned __int64 without conversion.
   * 	This
   * intrinsic is only used for compilation and does not generate any instructions,
   * thus it has zero latency.
   * a: double
   */
  case class CASTF64_U64(a: Exp[Double]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst".
   * 	[round_note]
   * a: __m256, rounding: int
   */
  case class MM256_CVTPS_PH(a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return the bit at index "b" of 32-bit integer "a".
   * a: __int32*, b: __int32, aOffset: int
   */
  case class BITTEST[A[_], U:Integral](a: Exp[A[Int]], b: Exp[Int], aOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform four rounds of SHA1 operation using an initial SHA1 state (A,B,C,D)
   * from "a" and some pre-computed sum of the next 4 round message values
   * (unsigned 32-bit integers), and state variable E from "b", and store the
   * updated SHA1 state (A,B,C,D) in "dst". "func" contains the logic functions and
   * round constants.
   * a: __m128i, b: __m128i, func: const int
   */
  case class MM_SHA1RNDS4_EPU32(a: Exp[__m128i], b: Exp[__m128i], func: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Make a pointer with the value of "q" and bounds set to the bounds of "r" (e.g.
   * copy the bounds of "r" to pointer "q"), and store the result in "dst".
   * q: const void *, r: const void *, qOffset: int, rOffset: int
   */
  case class BND_COPY_PTR_BOUNDS[A[_], T:Typ, U:Integral](q: Exp[A[T]], r: Exp[A[T]], qOffset: Exp[U], rOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, VoidPointer] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Read a 32-bit NIST SP800-90B and SP800-90C compliant random value and store in
   * "val". Return 1 if a random value was generated, and 0 otherwise.
   * value: unsigned int *, valueOffset: int
   */
  case class RDSEED32_STEP[A[_], U:Integral](value: Exp[A[UInt]], valueOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Int] {
    val category = List(IntrinsicsCategory.Random)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast from type float to type unsigned __int32 without conversion.
   * 	This
   * intrinsic is only used for compilation and does not generate any instructions,
   * thus it has zero latency.
   * a: float
   */
  case class CASTF32_U32(a: Exp[Float]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift the bits of unsigned 64-bit integer "a" left by the number of bits
   * specified in "shift", rotating the most-significant bit to the
   * least-significant bit location, and store the unsigned result in "dst".
   * a: unsigned long, shift: int
   */
  case class LROTL(a: Exp[ULong], shift: Exp[Int]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return the bit at index "b" of 32-bit integer "a", and set that bit to its
   * complement.
   * a: __int32*, b: __int32, aOffset: int
   */
  case class BITTESTANDCOMPLEMENT[A[_], U:Integral](a: Exp[A[Int]], b: Exp[Int], aOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract contiguous bits from unsigned 64-bit integer "a", and store the result
   * in "dst". Extract the number of bits specified by "len", starting at the bit
   * specified by "start".
   * a: unsigned __int64, start: unsigned int, len: unsigned int
   */
  case class BEXTR_U64(a: Exp[ULong], start: Exp[UInt], len: Exp[UInt]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy the IA32_TSC_AUX MSR (signature value) into "dst".

   */
  case class RDPID_U32() extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add unsigned 8-bit borrow "b_in" (carry flag) to unsigned 32-bit integer "b",
   * and subtract the result from unsigned 32-bit integer "a". Store the unsigned
   * 32-bit result in "out", and the carry-out in "dst" (carry or overflow flag).
   * b_in: unsigned char, a: unsigned int, b: unsigned int, out: unsigned int *, outOffset: int
   */
  case class SUBBORROW_U32[A[_], U:Integral](b_in: Exp[UByte], a: Exp[UInt], b: Exp[UInt], out: Exp[A[UInt]], outOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast from type unsigned __int32 to type float without conversion.
   * 	This
   * intrinsic is only used for compilation and does not generate any instructions,
   * thus it has zero latency.
   * a: unsigned __int32
   */
  case class CASTU32_F32(a: Exp[UInt]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Specify the start of an RTM code region. 
   * 	If the logical processor was not
   * already in transactional execution, then this call causes the logical
   * processor to transition into transactional execution. 
   * 	On an RTM abort, the
   * logical processor discards all architectural register and memory updates
   * performed during the RTM execution, restores architectural state, and starts
   * execution beginning at the fallback address computed from the outermost XBEGIN
   * instruction.

   */
  case class XBEGIN() extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift the bits of unsigned 16-bit integer "a" left by the number of bits
   * specified in "shift", rotating the most-significant bit to the
   * least-significant bit location, and store the unsigned result in "dst".
   * a: unsigned short, shift: int
   */
  case class ROTWL(a: Exp[UShort], shift: Exp[Int]) extends IntrinsicsDef[UShort] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the half-precision (16-bit) floating-point value "a" to a
   * single-precision (32-bit) floating-point value, and store the result in "dst".
   * a: unsigned short
   */
  case class CVTSH_SS(a: Exp[UShort]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Multiply unsigned 64-bit integers "a" and "b", store the low 64-bits of the
   * result in "dst", and store the high 64-bits in "hi". This does not read or
   * write arithmetic flags.
   * a: unsigned __int64, b: unsigned __int64, hi: unsigned __int64*, hiOffset: int
   */
  case class MULX_U64[A[_], U:Integral](a: Exp[ULong], b: Exp[ULong], hi: Exp[A[ULong]], hiOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, ULong] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load unaligned 16-bit integer from memory into the first element of "dst".
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_LOADU_SI16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of bits set to 1 in 32-bit integer "a", and return that
   * count in "dst".
   * a: int
   */
  case class POPCNT32(a: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of trailing zero bits in unsigned 32-bit integer "a", and
   * return that count in "dst".
   * a: unsigned int
   */
  case class MM_TZCNT_32(a: Exp[UInt]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial save of the enabled processor states to memory at
   * "mem_addr". State is saved based on bits [62:0] in "save_mask" and "XCR0".
   * "mem_addr" must be aligned on a 64-byte boundary. The hardware may optimize
   * the manner in which data is saved. The performance of this instruction will be
   * equal to or better than using the XSAVE64 instruction.
   * mem_addr: void *, save_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XSAVEOPT64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of trailing zero bits in unsigned 64-bit integer "a", and
   * return that count in "dst".
   * a: unsigned __int64
   */
  case class MM_TZCNT_64(a: Exp[ULong]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add unsigned 64-bit integers "a" and "b" with unsigned 8-bit carry-in "c_in"
   * (carry flag), and store the unsigned 64-bit result in "out", and the carry-out
   * in "dst" (carry or overflow flag).
   * c_in: unsigned char, a: unsigned __int64, b: unsigned __int64, out: unsigned __int64 *, outOffset: int
   */
  case class ADDCARRY_U64[A[_], U:Integral](c_in: Exp[UByte], a: Exp[ULong], b: Exp[ULong], out: Exp[A[ULong]], outOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Write the unsigned 64-bit integer "a" to the GS segment base register.
   * a: unsigned __int64
   */
  case class WRITEGSBASE_U64(a: Exp[ULong]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set all the lower bits of "dst" up to and including the lowest set bit in
   * unsigned 64-bit integer "a".
   * a: unsigned __int64
   */
  case class BLSMSK_U64(a: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return the lower bound of "q".
   * q: const void *, qOffset: int
   */
  case class BND_GET_PTR_LBOUND[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, VoidPointer] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy 64-bits from "val" to the extended control register (XCR) specified by
   * "a". Currently only XFEATURE_ENABLED_MASK XCR is supported.
   * a: unsigned int, value: unsigned __int64
   */
  case class XSETBV(a: Exp[UInt], value: Exp[ULong]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy up to 64-bits from the value of the extended control register (XCR)
   * specified by "a" into "dst". Currently only XFEATURE_ENABLED_MASK XCR is
   * supported.
   * a: unsigned int
   */
  case class XGETBV(a: Exp[UInt]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Checks if "q" is within its upper bound, and throws a #BR if not.
   * q: const void *, qOffset: int
   */
  case class BND_CHK_PTR_UBOUNDS[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the lowest set bit from unsigned 32-bit integer "a" and set the
   * corresponding bit in "dst". All other bits in "dst" are zeroed, and all bits
   * are zeroed if no bits are set in "a".
   * a: unsigned int
   */
  case class BLSI_U32(a: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Read the FS segment base register and store the 32-bit result in "dst".

   */
  case class READFSBASE_U32() extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform the final calculation for the next four SHA256 message values
   * (unsigned 32-bit integers) using previous message values from "a" and "b", and
   * store the result in "dst"."
   * a: __m128i, b: __m128i
   */
  case class MM_SHA256MSG2_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return the bit at index "b" of 64-bit integer "a", and set that bit to zero.
   * a: __int64*, b: __int64, aOffset: int
   */
  case class BITTESTANDRESET64[A[_], U:Integral](a: Exp[A[Long]], b: Exp[Long], aOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform the InvMixColumns transformation on "a" and store the result in "dst".
   * a: __m128i
   */
  case class MM_AESIMC_SI128(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "wmmintrin.h"
  }
      

  /**
   * Read a hardware generated 32-bit random value and store the result in "val".
   * Return 1 if a random value was generated, and 0 otherwise.
   * value: unsigned int*, valueOffset: int
   */
  case class RDRAND32_STEP[A[_], U:Integral](value: Exp[A[UInt]], valueOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Int] {
    val category = List(IntrinsicsCategory.Random)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add unsigned 32-bit integers "a" and "b" with unsigned 8-bit carry-in "c_in"
   * (carry flag), and store the unsigned 32-bit result in "out", and the carry-out
   * in "dst" (carry or overflow flag).
   * c_in: unsigned char, a: unsigned int, b: unsigned int, out: unsigned int *, outOffset: int
   */
  case class ADDCARRY_U32[A[_], U:Integral](c_in: Exp[UByte], a: Exp[UInt], b: Exp[UInt], out: Exp[A[UInt]], outOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial restore of the enabled processor states using the
   * state information stored in memory at "mem_addr". State is restored based on
   * bits [62:0] in "rs_mask", "XCR0", and "mem_addr.HEADER.XSTATE_BV". "mem_addr"
   * must be aligned on a 64-byte boundary.
   * mem_addr: void *, rs_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XRSTOR64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], rs_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Read a 16-bit NIST SP800-90B and SP800-90C compliant random value and store in
   * "val". Return 1 if a random value was generated, and 0 otherwise.
   * value: unsigned short *, valueOffset: int
   */
  case class RDSEED16_STEP[A[_], U:Integral](value: Exp[A[UShort]], valueOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Int] {
    val category = List(IntrinsicsCategory.Random)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load unaligned 64-bit integer from memory into the first element of "dst".
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_LOADU_SI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift the bits of unsigned 64-bit integer "a" right by the number of bits
   * specified in "shift", rotating the least-significant bit to the
   * most-significant bit location, and store the unsigned result in "dst".
   * a: unsigned __int64, shift: int
   */
  case class ROTR64(a: Exp[ULong], shift: Exp[Int]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Read the GS segment base register and store the 64-bit result in "dst".

   */
  case class READGSBASE_U64() extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy the current 64-bit value of the processor's time-stamp counter into
   * "dst".

   */
  case class RDTSC() extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform an intermediate calculation for the next four SHA1 message values
   * (unsigned 32-bit integers) using previous message values from "a" and "b", and
   * store the result in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SHA1MSG1_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract contiguous bits from unsigned 32-bit integer "a", and store the result
   * in "dst". Extract the number of bits specified by "len", starting at the bit
   * specified by "start".
   * a: unsigned int, start: unsigned int, len: unsigned int
   */
  case class BEXTR_U32(a: Exp[UInt], start: Exp[UInt], len: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Make a pointer with the value of "srcmem" and bounds set to ["srcmem",
   * "srcmem" + "size" - 1], and store the result in "dst".
   * srcmem: const void *, size: size_t, srcmemOffset: int
   */
  case class BND_SET_PTR_BOUNDS[A[_], T:Typ, U:Integral](srcmem: Exp[A[T]], size: Exp[Int], srcmemOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, VoidPointer] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Query the transactional execution status, return 0 if inside a transactionally
   * executing RTM or HLE region, and return 1 otherwise.

   */
  case class XTEST() extends IntrinsicsDef[UByte] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial save of the enabled processor states to memory at
   * "mem_addr". State is saved based on bits [62:0] in "save_mask" and "XCR0".
   * "mem_addr" must be aligned on a 64-byte boundary.
   * mem_addr: void *, save_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XSAVE[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return the upper bound of "q".
   * q: const void *, qOffset: int
   */
  case class BND_GET_PTR_UBOUND[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, VoidPointer] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reverse the byte order of 32-bit integer "a", and store the result in "dst".
   * This intrinsic is provided for conversion between little and big endian
   * values.
   * a: int
   */
  case class BSWAP(a: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Dynamically query the processor to determine if the processor-specific
   * feature(s) specified in "a" are available, and return true or false (1 or 0)
   * if the set of features is available. Multiple features may be OR'd together.
   * This intrinsic does not check the processor vendor. See the valid feature
   * flags below:
   * a: unsigned __int64
   */
  case class MAY_I_USE_CPU_FEATURE(a: Exp[ULong]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Read the Performance Monitor Counter (PMC) specified by "a", and store up to
   * 64-bits in "dst". The width of performance counters is implementation
   * specific.
   * a: int
   */
  case class RDPMC(a: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Write the unsigned 64-bit integer "a" to the FS segment base register.
   * a: unsigned __int64
   */
  case class WRITEFSBASE_U64(a: Exp[ULong]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Reverse the byte order of 64-bit integer "a", and store the result in "dst".
   * This intrinsic is provided for conversion between little and big endian
   * values.
   * a: __int64
   */
  case class BSWAP64(a: Exp[Long]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return the bit at index "b" of 32-bit integer "a", and set that bit to one.
   * a: __int32*, b: __int32, aOffset: int
   */
  case class BITTESTANDSET[A[_], U:Integral](a: Exp[A[Int]], b: Exp[Int], aOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Write back to memory the cache line that contains "p" from any level of the
   * cache hierarchy in the cache coherence domain.
   * p: void const *, pOffset: int
   */
  case class MM_CLWB[A[_], T:Typ, U:Integral](p: Exp[A[T]], pOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 32-bit integer from the first element of "a" into memory. "mem_addr"
   * does not need to be aligned on any particular boundary.
   * mem_addr: void*, a: __m128i, mem_addrOffset: int
   */
  case class MM_STOREU_SI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Narrow the bounds for pointer "q" to the intersection of the bounds of "r" and
   * the bounds ["q", "q" + "size" - 1], and store the result in "dst".
   * q: const void *, r: const void *, size: size_t, qOffset: int, rOffset: int
   */
  case class BND_NARROW_PTR_BOUNDS[A[_], T:Typ, U:Integral](q: Exp[A[T]], r: Exp[A[T]], size: Exp[Int], qOffset: Exp[U], rOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, VoidPointer] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial restore of the enabled processor states using the
   * state information stored in memory at "mem_addr". xrstors differs from xrstor
   * in that it can restore state components corresponding to bits set in the
   * IA32_XSS MSR; xrstors cannot restore from an xsave area in which the extended
   * region is in the standard form. State is restored based on bits [62:0] in
   * "rs_mask", "XCR0", and "mem_addr.HEADER.XSTATE_BV". "mem_addr" must be aligned
   * on a 64-byte boundary.
   * mem_addr: const void *, rs_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XRSTORS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], rs_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of bits set to 1 in 64-bit integer "a", and return that
   * count in "dst".
   * a: __int64
   */
  case class POPCNT64(a: Exp[Long]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial save of the enabled processor states to memory at
   * "mem_addr"; xsaves differs from xsave in that it can save state components
   * corresponding to bits set in IA32_XSS MSR and that it may use the modified
   * optimization. State is saved based on bits [62:0] in "save_mask" and "XCR0".
   * "mem_addr" must be aligned on a 64-byte boundary.
   * mem_addr: void *, save_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XSAVES[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Save the current state of the x87 FPU, MMX technology, XMM, and MXCSR
   * registers to a 512-byte memory location at "mem_addr". The layout of the
   * 512-byte region depends on the operating mode. Bytes [511:464] are available
   * for software use and will not be overwritten by the processor.
   * mem_addr: void *, mem_addrOffset: int
   */
  case class FXSAVE64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Specify the end of an RTM code region.
   * 	If this corresponds to the outermost
   * scope, the logical processor will attempt to commit the logical processor
   * state atomically. 
   * 	If the commit fails, the logical processor will perform an
   * RTM abort.

   */
  case class XEND() extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate SHA1 state variable E after four rounds of operation from the
   * current SHA1 state variable "a", add that value to the scheduled values
   * (unsigned 32-bit integers) in "b", and store the result in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SHA1NEXTE_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Invalidate mappings in the Translation Lookaside Buffers (TLBs) and
   * paging-structure caches for the processor context identifier (PCID) specified
   * by "descriptor" based on the invalidation type specified in "type". 
   * 	The PCID
   * "descriptor" is specified as a 16-byte memory operand (with no alignment
   * restrictions) where bits [11:0] specify the PCID, and bits [127:64] specify
   * the linear address; bits [63:12] are reserved.
   * 	The types supported are:
   * 		0)
   * Individual-address invalidation: If "type" is 0, the logical processor
   * invalidates mappings for a single linear address and tagged with the PCID
   * specified in "descriptor", except global translations. The instruction may
   * also invalidate global translations, mappings for other linear addresses, or
   * mappings tagged with other PCIDs.
   * 		1) Single-context invalidation: If "type"
   * is 1, the logical processor invalidates all mappings tagged with the PCID
   * specified in "descriptor" except global translations. In some cases, it may
   * invalidate mappings for other PCIDs as well.
   * 		2) All-context invalidation: If
   * "type" is 2, the logical processor invalidates all mappings tagged with any
   * PCID.
   * 		3) All-context invalidation, retaining global translations: If "type"
   * is 3, the logical processor invalidates all mappings tagged with any PCID
   * except global translations, ignoring "descriptor". The instruction may also
   * invalidate global translations as well.
   * tpe: unsigned int, descriptor: void*, descriptorOffset: int
   */
  case class INVPCID[A[_], T:Typ, U:Integral](tpe: Exp[UInt], descriptor: Exp[A[T]], descriptorOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of trailing zero bits in unsigned 64-bit integer "a", and
   * return that count in "dst".
   * a: unsigned __int64
   */
  case class TZCNT_U64(a: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 32-bit integer "a" and then AND with b, and store
   * the results in dst.
   * a: unsigned int, b: unsigned int
   */
  case class ANDN_U32(a: Exp[UInt], b: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Read the FS segment base register and store the 64-bit result in "dst".

   */
  case class READFSBASE_U64() extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return the bit at index "b" of 64-bit integer "a", and set that bit to its
   * complement.
   * a: __int64*, b: __int64, aOffset: int
   */
  case class BITTESTANDCOMPLEMENT64[A[_], U:Integral](a: Exp[A[Long]], b: Exp[Long], aOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Deposit contiguous low bits from unsigned 32-bit integer "a" to "dst" at the
   * corresponding bit locations specified by "mask"; all other bits in "dst" are
   * set to zero.
   * a: unsigned int, mask: unsigned int
   */
  case class PDEP_U32(a: Exp[UInt], mask: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy all bits from unsigned 32-bit integer "a" to "dst", and reset (set to 0)
   * the bit in "dst" that corresponds to the lowest set bit in "a".
   * a: unsigned int
   */
  case class BLSR_U32(a: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform an intermediate calculation for the next four SHA256 message values
   * (unsigned 32-bit integers) using previous message values from "a" and "b", and
   * store the result in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SHA256MSG1_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial save of the enabled processor states to memory at
   * "mem_addr". State is saved based on bits [62:0] in "save_mask" and "XCR0".
   * "mem_addr" must be aligned on a 64-byte boundary. The hardware may optimize
   * the manner in which data is saved. The performance of this instruction will be
   * equal to or better than using the XSAVE instruction.
   * mem_addr: void *, save_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XSAVEOPT[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add unsigned 32-bit integers "a" and "b" with unsigned 8-bit carry-in "c_in"
   * (carry or overflow flag), and store the unsigned 32-bit result in "out", and
   * the carry-out in "dst" (carry or overflow flag).
   * c_in: unsigned char, a: unsigned int, b: unsigned int, out: unsigned int *, outOffset: int
   */
  case class ADDCARRYX_U32[A[_], U:Integral](c_in: Exp[UByte], a: Exp[UInt], b: Exp[UInt], out: Exp[A[UInt]], outOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift the bits of unsigned 32-bit integer "a" right by the number of bits
   * specified in "shift", rotating the least-significant bit to the
   * most-significant bit location, and store the unsigned result in "dst".
   * a: unsigned int, shift: int
   */
  case class ROTR(a: Exp[UInt], shift: Exp[Int]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Read a 64-bit NIST SP800-90B and SP800-90C compliant random value and store in
   * "val". Return 1 if a random value was generated, and 0 otherwise.
   * value: unsigned __int64 *, valueOffset: int
   */
  case class RDSEED64_STEP[A[_], U:Integral](value: Exp[A[ULong]], valueOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Int] {
    val category = List(IntrinsicsCategory.Random)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add unsigned 8-bit borrow "b_in" (carry flag) to unsigned 64-bit integer "b",
   * and subtract the result from unsigned 64-bit integer "a". Store the unsigned
   * 64-bit result in "out", and the carry-out in "dst" (carry or overflow flag).
   * b_in: unsigned char, a: unsigned __int64, b: unsigned __int64, out: unsigned __int64 *, outOffset: int
   */
  case class SUBBORROW_U64[A[_], U:Integral](b_in: Exp[UByte], a: Exp[ULong], b: Exp[ULong], out: Exp[A[ULong]], outOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Allocate "size" bytes of memory, aligned to the alignment specified in
   * "align", and return a pointer to the allocated memory. "_mm_free" should be
   * used to free memory that is allocated with "_mm_malloc".
   * size: size_t, align: size_t
   */
  case class MM_MALLOC(size: Exp[Int], align: Exp[Int]) extends IntrinsicsDef[VoidPointer] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "xmmintrin.h"
  }
      

  /**
   * Load unaligned 32-bit integer from memory into the first element of "dst".
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_LOADU_SI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Invalidate and flush the cache line that contains "p" from all levels of the
   * cache hierarchy.
   * p: void const *, pOffset: int
   */
  case class MM_CLFLUSHOPT[A[_], T:Typ, U:Integral](p: Exp[A[T]], pOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial restore of the enabled processor states using the
   * state information stored in memory at "mem_addr". xrstors differs from xrstor
   * in that it can restore state components corresponding to bits set in the
   * IA32_XSS MSR; xrstors cannot restore from an xsave area in which the extended
   * region is in the standard form. State is restored based on bits [62:0] in
   * "rs_mask", "XCR0", and "mem_addr.HEADER.XSTATE_BV". "mem_addr" must be aligned
   * on a 64-byte boundary.
   * mem_addr: const void *, rs_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XRSTORS64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], rs_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform one round of an AES encryption flow on data (state) in "a" using the
   * round key in "RoundKey", and store the result in "dst"."
   * a: __m128i, roundKey: __m128i
   */
  case class MM_AESENC_SI128(a: Exp[__m128i], roundKey: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "wmmintrin.h"
  }
      

  /**
   * Store 64-bit integer from the first element of "a" into memory. "mem_addr"
   * does not need to be aligned on any particular boundary.
   * mem_addr: void*, a: __m128i, mem_addrOffset: int
   */
  case class MM_STOREU_SI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift the bits of unsigned 64-bit integer "a" left by the number of bits
   * specified in "shift", rotating the most-significant bit to the
   * least-significant bit location, and store the unsigned result in "dst".
   * a: unsigned __int64, shift: int
   */
  case class ROTL64(a: Exp[ULong], shift: Exp[Int]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Count the number of leading zero bits in unsigned 64-bit integer "a", and
   * return that count in "dst".
   * a: unsigned __int64
   */
  case class LZCNT_U64(a: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform a full or partial save of the enabled processor states to memory at
   * "mem_addr"; xsavec differs from xsave in that it uses compaction and that it
   * may use init optimization. State is saved based on bits [62:0] in "save_mask"
   * and "XCR0". "mem_addr" must be aligned on a 64-byte boundary.
   * mem_addr: void *, save_mask: unsigned __int64, mem_addrOffset: int
   */
  case class XSAVEC[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.OSTargeted)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set "index" to the index of the lowest set bit in 64-bit integer "mask". If no
   * bits are set in "mask", then set "dst" to 0, otherwise set "dst" to 1.
   * index: unsigned __int32*, mask: unsigned __int64, indexOffset: int
   */
  case class BITSCANFORWARD64[A[_], U:Integral](index: Exp[A[UInt]], mask: Exp[ULong], indexOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, UByte] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy all bits from unsigned 64-bit integer "a" to "dst", and reset (set to 0)
   * the high bits in "dst" starting at "index".
   * a: unsigned __int64, index: unsigned int
   */
  case class BZHI_U64(a: Exp[ULong], index: Exp[UInt]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Perform the last round of an AES decryption flow on data (state) in "a" using
   * the round key in "RoundKey", and store the result in "dst"."
   * a: __m128i, roundKey: __m128i
   */
  case class MM_AESDECLAST_SI128(a: Exp[__m128i], roundKey: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cryptography)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "wmmintrin.h"
  }
      

  /**
   * Set all the lower bits of "dst" up to and including the lowest set bit in
   * unsigned 32-bit integer "a".
   * a: unsigned int
   */
  case class BLSMSK_U32(a: Exp[UInt]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Write the unsigned 32-bit integer "a" to the FS segment base register.
   * a: unsigned int
   */
  case class WRITEFSBASE_U32(a: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract bits from unsigned 64-bit integer "a" at the corresponding bit
   * locations specified by "mask" to contiguous low bits in "dst"; the remaining
   * upper bits in "dst" are set to zero.
   * a: unsigned __int64, mask: unsigned __int64
   */
  case class PEXT_U64(a: Exp[ULong], mask: Exp[ULong]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _lrotr(a: Exp[ULong], shift: Exp[Int]): Exp[ULong] = {
    LROTR(a, shift)
  }
            
  def _lzcnt_u32(a: Exp[UInt]): Exp[UInt] = {
    LZCNT_U32(a)
  }
            
  def _bnd_chk_ptr_lbounds[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(q)(BND_CHK_PTR_LBOUNDS(q, qOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _tzcnt_u32(a: Exp[UInt]): Exp[UInt] = {
    TZCNT_U32(a)
  }
            
  def _mm_free[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_FREE(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _readgsbase_u32(): Exp[UInt] = {
    READGSBASE_U32()
  }
            
  def _bittestandset64[A[_], U:Integral](a: Exp[A[Long]], b: Exp[Long], aOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(a)(BITTESTANDSET64(a, b, aOffset)(implicitly[Integral[U]], cont))
  }
            
  def _xrstor[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], rs_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XRSTOR(mem_addr, rs_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _allow_cpu_features(a: Exp[ULong]): Exp[Unit] = {
    reflectEffect(ALLOW_CPU_FEATURES(a))
  }
            
  def __rdtscp[A[_], U:Integral](mem_addr: Exp[A[UInt]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[ULong] = {
    cont.write(mem_addr)(RDTSCP(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _bextr2_u32(a: Exp[UInt], control: Exp[UInt]): Exp[UInt] = {
    BEXTR2_U32(a, control)
  }
            
  def _bzhi_u32(a: Exp[UInt], index: Exp[UInt]): Exp[UInt] = {
    BZHI_U32(a, index)
  }
            
  def _xsaves64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XSAVES64(mem_addr, save_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _andn_u64(a: Exp[ULong], b: Exp[ULong]): Exp[ULong] = {
    ANDN_U64(a, b)
  }
            
  def _xabort(imm8: Exp[UInt]): Exp[Unit] = {
    reflectEffect(XABORT(imm8))
  }
            
  def _bextr2_u64(a: Exp[ULong], control: Exp[ULong]): Exp[ULong] = {
    BEXTR2_U64(a, control)
  }
            
  def _mm_popcnt_u32(a: Exp[UInt]): Exp[Int] = {
    MM_POPCNT_U32(a)
  }
            
  def _bnd_chk_ptr_bounds[A[_], T:Typ, U:Integral](q: Exp[A[T]], size: Exp[Int], qOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(q)(BND_CHK_PTR_BOUNDS(q, size, qOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _BitScanReverse[A[_], U:Integral](index: Exp[A[UInt]], mask: Exp[UInt], indexOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(index)(BITSCANREVERSE(index, mask, indexOffset)(implicitly[Integral[U]], cont))
  }
            
  def _bittestandreset[A[_], U:Integral](a: Exp[A[Int]], b: Exp[Int], aOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(a)(BITTESTANDRESET(a, b, aOffset)(implicitly[Integral[U]], cont))
  }
            
  def _BitScanForward[A[_], U:Integral](index: Exp[A[UInt]], mask: Exp[UInt], indexOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(index)(BITSCANFORWARD(index, mask, indexOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mulx_u32[A[_], U:Integral](a: Exp[UInt], b: Exp[UInt], hi: Exp[A[UInt]], hiOffset: Exp[U])(implicit cont: Container[A]): Exp[UInt] = {
    cont.write(hi)(MULX_U32(a, b, hi, hiOffset)(implicitly[Integral[U]], cont))
  }
            
  def _cvtss_sh(a: Exp[Float], imm8: Exp[Int]): Exp[UShort] = {
    CVTSS_SH(a, imm8)
  }
            
  def _mm_storeu_si16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREU_SI16(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mwait(extensions: Exp[UInt], hints: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_MWAIT(extensions, hints))
  }
            
  def _bit_scan_reverse(a: Exp[Int]): Exp[Int] = {
    BIT_SCAN_REVERSE(a)
  }
            
  def _mm_aesdec_si128(a: Exp[__m128i], roundKey: Exp[__m128i]): Exp[__m128i] = {
    MM_AESDEC_SI128(a, roundKey)
  }
            
  def _mm_aeskeygenassist_si128(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_AESKEYGENASSIST_SI128(a, imm8)
  }
            
  def _bittest64[A[_], U:Integral](a: Exp[A[Long]], b: Exp[Long], aOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(a)(BITTEST64(a, b, aOffset)(implicitly[Integral[U]], cont))
  }
            
  def _fxsave[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(FXSAVE(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_sha1msg2_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SHA1MSG2_EPU32(a, b)
  }
            
  def _fxrstor64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(FXRSTOR64(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _writegsbase_u32(a: Exp[UInt]): Exp[Unit] = {
    reflectEffect(WRITEGSBASE_U32(a))
  }
            
  def _rotwr(a: Exp[UShort], shift: Exp[Int]): Exp[UShort] = {
    ROTWR(a, shift)
  }
            
  def _addcarryx_u64[A[_], U:Integral](c_in: Exp[UByte], a: Exp[ULong], b: Exp[ULong], out: Exp[A[ULong]], outOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(out)(ADDCARRYX_U64(c_in, a, b, out, outOffset)(implicitly[Integral[U]], cont))
  }
            
  def _pdep_u64(a: Exp[ULong], mask: Exp[ULong]): Exp[ULong] = {
    PDEP_U64(a, mask)
  }
            
  def _mm_cvtph_ps(a: Exp[__m128i]): Exp[__m128] = {
    MM_CVTPH_PS(a)
  }
            
  def _mm256_cvtph_ps(a: Exp[__m128i]): Exp[__m256] = {
    MM256_CVTPH_PS(a)
  }
            
  def _bnd_store_ptr_bounds[A[_], T:Typ, U:Integral](ptr_addr: Exp[DoubleVoidPointer], ptr_val: Exp[A[T]], ptr_valOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(ptr_val)(BND_STORE_PTR_BOUNDS(ptr_addr, ptr_val, ptr_valOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_monitor[A[_], T:Typ, U:Integral](p: Exp[A[T]], extensions: Exp[UInt], hints: Exp[UInt], pOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(p)(MM_MONITOR(p, extensions, hints, pOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_cvtps_ph(a: Exp[__m128], rounding: Exp[Int]): Exp[__m128i] = {
    MM_CVTPS_PH(a, rounding)
  }
            
  def _blsr_u64(a: Exp[ULong]): Exp[ULong] = {
    BLSR_U64(a)
  }
            
  def _blsi_u64(a: Exp[ULong]): Exp[ULong] = {
    BLSI_U64(a)
  }
            
  def _BitScanReverse64[A[_], U:Integral](index: Exp[A[UInt]], mask: Exp[ULong], indexOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(index)(BITSCANREVERSE64(index, mask, indexOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_clmulepi64_si128(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_CLMULEPI64_SI128(a, b, imm8)
  }
            
  def _bnd_init_ptr_bounds[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit cont: Container[A]): Exp[VoidPointer] = {
    reflectMutable(BND_INIT_PTR_BOUNDS(q, qOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _xsave64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XSAVE64(mem_addr, save_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _castu64_f64(a: Exp[ULong]): Exp[Double] = {
    CASTU64_F64(a)
  }
            
  def _fxrstor[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(FXRSTOR(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _rdrand64_step[A[_], U:Integral](value: Exp[A[ULong]], valueOffset: Exp[U])(implicit cont: Container[A]): Exp[Int] = {
    cont.write(value)(RDRAND64_STEP(value, valueOffset)(implicitly[Integral[U]], cont))
  }
            
  def _rotl(a: Exp[UInt], shift: Exp[Int]): Exp[UInt] = {
    ROTL(a, shift)
  }
            
  def _bit_scan_forward(a: Exp[Int]): Exp[Int] = {
    BIT_SCAN_FORWARD(a)
  }
            
  def _mm_popcnt_u64(a: Exp[ULong]): Exp[Long] = {
    MM_POPCNT_U64(a)
  }
            
  def _rdrand16_step[A[_], U:Integral](value: Exp[A[UShort]], valueOffset: Exp[U])(implicit cont: Container[A]): Exp[Int] = {
    cont.write(value)(RDRAND16_STEP(value, valueOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_sha256rnds2_epu32(a: Exp[__m128i], b: Exp[__m128i], k: Exp[__m128i]): Exp[__m128i] = {
    MM_SHA256RNDS2_EPU32(a, b, k)
  }
            
  def _xsavec64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XSAVEC64(mem_addr, save_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _pext_u32(a: Exp[UInt], mask: Exp[UInt]): Exp[UInt] = {
    PEXT_U32(a, mask)
  }
            
  def _mm_aesenclast_si128(a: Exp[__m128i], roundKey: Exp[__m128i]): Exp[__m128i] = {
    MM_AESENCLAST_SI128(a, roundKey)
  }
            
  def _castf64_u64(a: Exp[Double]): Exp[ULong] = {
    CASTF64_U64(a)
  }
            
  def _mm256_cvtps_ph(a: Exp[__m256], rounding: Exp[Int]): Exp[__m128i] = {
    MM256_CVTPS_PH(a, rounding)
  }
            
  def _bittest[A[_], U:Integral](a: Exp[A[Int]], b: Exp[Int], aOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(a)(BITTEST(a, b, aOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_sha1rnds4_epu32(a: Exp[__m128i], b: Exp[__m128i], func: Exp[Int]): Exp[__m128i] = {
    MM_SHA1RNDS4_EPU32(a, b, func)
  }
            
  def _bnd_copy_ptr_bounds[A[_], T:Typ, U:Integral](q: Exp[A[T]], r: Exp[A[T]], qOffset: Exp[U], rOffset: Exp[U])(implicit cont: Container[A]): Exp[VoidPointer] = {
    reflectMutable(BND_COPY_PTR_BOUNDS(q, r, qOffset, rOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _rdseed32_step[A[_], U:Integral](value: Exp[A[UInt]], valueOffset: Exp[U])(implicit cont: Container[A]): Exp[Int] = {
    cont.write(value)(RDSEED32_STEP(value, valueOffset)(implicitly[Integral[U]], cont))
  }
            
  def _castf32_u32(a: Exp[Float]): Exp[UInt] = {
    CASTF32_U32(a)
  }
            
  def _lrotl(a: Exp[ULong], shift: Exp[Int]): Exp[ULong] = {
    LROTL(a, shift)
  }
            
  def _bittestandcomplement[A[_], U:Integral](a: Exp[A[Int]], b: Exp[Int], aOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(a)(BITTESTANDCOMPLEMENT(a, b, aOffset)(implicitly[Integral[U]], cont))
  }
            
  def _bextr_u64(a: Exp[ULong], start: Exp[UInt], len: Exp[UInt]): Exp[ULong] = {
    BEXTR_U64(a, start, len)
  }
            
  def _rdpid_u32(): Exp[UInt] = {
    RDPID_U32()
  }
            
  def _subborrow_u32[A[_], U:Integral](b_in: Exp[UByte], a: Exp[UInt], b: Exp[UInt], out: Exp[A[UInt]], outOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(out)(SUBBORROW_U32(b_in, a, b, out, outOffset)(implicitly[Integral[U]], cont))
  }
            
  def _castu32_f32(a: Exp[UInt]): Exp[Float] = {
    CASTU32_F32(a)
  }
            
  def _xbegin(): Exp[UInt] = {
    XBEGIN()
  }
            
  def _rotwl(a: Exp[UShort], shift: Exp[Int]): Exp[UShort] = {
    ROTWL(a, shift)
  }
            
  def _cvtsh_ss(a: Exp[UShort]): Exp[Float] = {
    CVTSH_SS(a)
  }
            
  def _mulx_u64[A[_], U:Integral](a: Exp[ULong], b: Exp[ULong], hi: Exp[A[ULong]], hiOffset: Exp[U])(implicit cont: Container[A]): Exp[ULong] = {
    cont.write(hi)(MULX_U64(a, b, hi, hiOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_loadu_si16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_LOADU_SI16(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _popcnt32(a: Exp[Int]): Exp[Int] = {
    POPCNT32(a)
  }
            
  def _mm_tzcnt_32(a: Exp[UInt]): Exp[Int] = {
    MM_TZCNT_32(a)
  }
            
  def _xsaveopt64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XSAVEOPT64(mem_addr, save_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_tzcnt_64(a: Exp[ULong]): Exp[Long] = {
    MM_TZCNT_64(a)
  }
            
  def _addcarry_u64[A[_], U:Integral](c_in: Exp[UByte], a: Exp[ULong], b: Exp[ULong], out: Exp[A[ULong]], outOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(out)(ADDCARRY_U64(c_in, a, b, out, outOffset)(implicitly[Integral[U]], cont))
  }
            
  def _writegsbase_u64(a: Exp[ULong]): Exp[Unit] = {
    reflectEffect(WRITEGSBASE_U64(a))
  }
            
  def _blsmsk_u64(a: Exp[ULong]): Exp[ULong] = {
    BLSMSK_U64(a)
  }
            
  def _bnd_get_ptr_lbound[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit cont: Container[A]): Exp[VoidPointer] = {
    reflectMutable(BND_GET_PTR_LBOUND(q, qOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _xsetbv(a: Exp[UInt], value: Exp[ULong]): Exp[Unit] = {
    reflectEffect(XSETBV(a, value))
  }
            
  def _xgetbv(a: Exp[UInt]): Exp[ULong] = {
    XGETBV(a)
  }
            
  def _bnd_chk_ptr_ubounds[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(q)(BND_CHK_PTR_UBOUNDS(q, qOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _blsi_u32(a: Exp[UInt]): Exp[UInt] = {
    BLSI_U32(a)
  }
            
  def _readfsbase_u32(): Exp[UInt] = {
    READFSBASE_U32()
  }
            
  def _mm_sha256msg2_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SHA256MSG2_EPU32(a, b)
  }
            
  def _bittestandreset64[A[_], U:Integral](a: Exp[A[Long]], b: Exp[Long], aOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(a)(BITTESTANDRESET64(a, b, aOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_aesimc_si128(a: Exp[__m128i]): Exp[__m128i] = {
    MM_AESIMC_SI128(a)
  }
            
  def _rdrand32_step[A[_], U:Integral](value: Exp[A[UInt]], valueOffset: Exp[U])(implicit cont: Container[A]): Exp[Int] = {
    cont.write(value)(RDRAND32_STEP(value, valueOffset)(implicitly[Integral[U]], cont))
  }
            
  def _addcarry_u32[A[_], U:Integral](c_in: Exp[UByte], a: Exp[UInt], b: Exp[UInt], out: Exp[A[UInt]], outOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(out)(ADDCARRY_U32(c_in, a, b, out, outOffset)(implicitly[Integral[U]], cont))
  }
            
  def _xrstor64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], rs_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XRSTOR64(mem_addr, rs_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _rdseed16_step[A[_], U:Integral](value: Exp[A[UShort]], valueOffset: Exp[U])(implicit cont: Container[A]): Exp[Int] = {
    cont.write(value)(RDSEED16_STEP(value, valueOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_loadu_si64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_LOADU_SI64(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _rotr64(a: Exp[ULong], shift: Exp[Int]): Exp[ULong] = {
    ROTR64(a, shift)
  }
            
  def _readgsbase_u64(): Exp[ULong] = {
    READGSBASE_U64()
  }
            
  def _rdtsc(): Exp[Long] = {
    RDTSC()
  }
            
  def _mm_sha1msg1_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SHA1MSG1_EPU32(a, b)
  }
            
  def _bextr_u32(a: Exp[UInt], start: Exp[UInt], len: Exp[UInt]): Exp[UInt] = {
    BEXTR_U32(a, start, len)
  }
            
  def _bnd_set_ptr_bounds[A[_], T:Typ, U:Integral](srcmem: Exp[A[T]], size: Exp[Int], srcmemOffset: Exp[U])(implicit cont: Container[A]): Exp[VoidPointer] = {
    reflectMutable(BND_SET_PTR_BOUNDS(srcmem, size, srcmemOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _xtest(): Exp[UByte] = {
    XTEST()
  }
            
  def _xsave[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XSAVE(mem_addr, save_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _bnd_get_ptr_ubound[A[_], T:Typ, U:Integral](q: Exp[A[T]], qOffset: Exp[U])(implicit cont: Container[A]): Exp[VoidPointer] = {
    reflectMutable(BND_GET_PTR_UBOUND(q, qOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _bswap(a: Exp[Int]): Exp[Int] = {
    BSWAP(a)
  }
            
  def _may_i_use_cpu_feature(a: Exp[ULong]): Exp[Int] = {
    MAY_I_USE_CPU_FEATURE(a)
  }
            
  def _rdpmc(a: Exp[Int]): Exp[Long] = {
    RDPMC(a)
  }
            
  def _writefsbase_u64(a: Exp[ULong]): Exp[Unit] = {
    reflectEffect(WRITEFSBASE_U64(a))
  }
            
  def _bswap64(a: Exp[Long]): Exp[Long] = {
    BSWAP64(a)
  }
            
  def _bittestandset[A[_], U:Integral](a: Exp[A[Int]], b: Exp[Int], aOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(a)(BITTESTANDSET(a, b, aOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_clwb[A[_], T:Typ, U:Integral](p: Exp[A[T]], pOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(p)(MM_CLWB(p, pOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_storeu_si32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREU_SI32(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _bnd_narrow_ptr_bounds[A[_], T:Typ, U:Integral](q: Exp[A[T]], r: Exp[A[T]], size: Exp[Int], qOffset: Exp[U], rOffset: Exp[U])(implicit cont: Container[A]): Exp[VoidPointer] = {
    reflectMutable(BND_NARROW_PTR_BOUNDS(q, r, size, qOffset, rOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _xrstors[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], rs_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XRSTORS(mem_addr, rs_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _popcnt64(a: Exp[Long]): Exp[Int] = {
    POPCNT64(a)
  }
            
  def _xsaves[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XSAVES(mem_addr, save_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _fxsave64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(FXSAVE64(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _xend(): Exp[Unit] = {
    reflectEffect(XEND())
  }
            
  def _mm_sha1nexte_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SHA1NEXTE_EPU32(a, b)
  }
            
  def _invpcid[A[_], T:Typ, U:Integral](tpe: Exp[UInt], descriptor: Exp[A[T]], descriptorOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(descriptor)(INVPCID(tpe, descriptor, descriptorOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _tzcnt_u64(a: Exp[ULong]): Exp[ULong] = {
    TZCNT_U64(a)
  }
            
  def _andn_u32(a: Exp[UInt], b: Exp[UInt]): Exp[UInt] = {
    ANDN_U32(a, b)
  }
            
  def _readfsbase_u64(): Exp[ULong] = {
    READFSBASE_U64()
  }
            
  def _bittestandcomplement64[A[_], U:Integral](a: Exp[A[Long]], b: Exp[Long], aOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(a)(BITTESTANDCOMPLEMENT64(a, b, aOffset)(implicitly[Integral[U]], cont))
  }
            
  def _pdep_u32(a: Exp[UInt], mask: Exp[UInt]): Exp[UInt] = {
    PDEP_U32(a, mask)
  }
            
  def _blsr_u32(a: Exp[UInt]): Exp[UInt] = {
    BLSR_U32(a)
  }
            
  def _mm_sha256msg1_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SHA256MSG1_EPU32(a, b)
  }
            
  def _xsaveopt[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XSAVEOPT(mem_addr, save_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _addcarryx_u32[A[_], U:Integral](c_in: Exp[UByte], a: Exp[UInt], b: Exp[UInt], out: Exp[A[UInt]], outOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(out)(ADDCARRYX_U32(c_in, a, b, out, outOffset)(implicitly[Integral[U]], cont))
  }
            
  def _rotr(a: Exp[UInt], shift: Exp[Int]): Exp[UInt] = {
    ROTR(a, shift)
  }
            
  def _rdseed64_step[A[_], U:Integral](value: Exp[A[ULong]], valueOffset: Exp[U])(implicit cont: Container[A]): Exp[Int] = {
    cont.write(value)(RDSEED64_STEP(value, valueOffset)(implicitly[Integral[U]], cont))
  }
            
  def _subborrow_u64[A[_], U:Integral](b_in: Exp[UByte], a: Exp[ULong], b: Exp[ULong], out: Exp[A[ULong]], outOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(out)(SUBBORROW_U64(b_in, a, b, out, outOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_malloc(size: Exp[Int], align: Exp[Int]): Exp[VoidPointer] = {
    reflectMutable(MM_MALLOC(size, align))
  }
            
  def _mm_loadu_si32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_LOADU_SI32(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_clflushopt[A[_], T:Typ, U:Integral](p: Exp[A[T]], pOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(p)(MM_CLFLUSHOPT(p, pOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _xrstors64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], rs_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XRSTORS64(mem_addr, rs_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_aesenc_si128(a: Exp[__m128i], roundKey: Exp[__m128i]): Exp[__m128i] = {
    MM_AESENC_SI128(a, roundKey)
  }
            
  def _mm_storeu_si64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREU_SI64(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _rotl64(a: Exp[ULong], shift: Exp[Int]): Exp[ULong] = {
    ROTL64(a, shift)
  }
            
  def _lzcnt_u64(a: Exp[ULong]): Exp[ULong] = {
    LZCNT_U64(a)
  }
            
  def _xsavec[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], save_mask: Exp[ULong], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(XSAVEC(mem_addr, save_mask, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _BitScanForward64[A[_], U:Integral](index: Exp[A[UInt]], mask: Exp[ULong], indexOffset: Exp[U])(implicit cont: Container[A]): Exp[UByte] = {
    cont.write(index)(BITSCANFORWARD64(index, mask, indexOffset)(implicitly[Integral[U]], cont))
  }
            
  def _bzhi_u64(a: Exp[ULong], index: Exp[UInt]): Exp[ULong] = {
    BZHI_U64(a, index)
  }
            
  def _mm_aesdeclast_si128(a: Exp[__m128i], roundKey: Exp[__m128i]): Exp[__m128i] = {
    MM_AESDECLAST_SI128(a, roundKey)
  }
            
  def _blsmsk_u32(a: Exp[UInt]): Exp[UInt] = {
    BLSMSK_U32(a)
  }
            
  def _writefsbase_u32(a: Exp[UInt]): Exp[Unit] = {
    reflectEffect(WRITEFSBASE_U32(a))
  }
            
  def _pext_u64(a: Exp[ULong], mask: Exp[ULong]): Exp[ULong] = {
    PEXT_U64(a, mask)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case LROTR (a, shift) =>
      _lrotr(f(a), f(shift))
    case LZCNT_U32 (a) =>
      _lzcnt_u32(f(a))
    case iDef@BND_CHK_PTR_LBOUNDS (q, qOffset) =>
      _bnd_chk_ptr_lbounds(iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case TZCNT_U32 (a) =>
      _tzcnt_u32(f(a))
    case iDef@MM_FREE (mem_addr, mem_addrOffset) =>
      _mm_free(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case READGSBASE_U32 () =>
      _readgsbase_u32()
    case iDef@BITTESTANDSET64 (a, b, aOffset) =>
      _bittestandset64(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont)
    case iDef@XRSTOR (mem_addr, rs_mask, mem_addrOffset) =>
      _xrstor(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(rs_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case ALLOW_CPU_FEATURES (a) =>
      _allow_cpu_features(f(a))
    case iDef@RDTSCP (mem_addr, mem_addrOffset) =>
      __rdtscp(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case BEXTR2_U32 (a, control) =>
      _bextr2_u32(f(a), f(control))
    case BZHI_U32 (a, index) =>
      _bzhi_u32(f(a), f(index))
    case iDef@XSAVES64 (mem_addr, save_mask, mem_addrOffset) =>
      _xsaves64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case ANDN_U64 (a, b) =>
      _andn_u64(f(a), f(b))
    case XABORT (imm8) =>
      _xabort(f(imm8))
    case BEXTR2_U64 (a, control) =>
      _bextr2_u64(f(a), f(control))
    case MM_POPCNT_U32 (a) =>
      _mm_popcnt_u32(f(a))
    case iDef@BND_CHK_PTR_BOUNDS (q, size, qOffset) =>
      _bnd_chk_ptr_bounds(iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(size, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@BITSCANREVERSE (index, mask, indexOffset) =>
      _BitScanReverse(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(indexOffset, f))(iDef.integralType, iDef.cont)
    case iDef@BITTESTANDRESET (a, b, aOffset) =>
      _bittestandreset(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont)
    case iDef@BITSCANFORWARD (index, mask, indexOffset) =>
      _BitScanForward(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(indexOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MULX_U32 (a, b, hi, hiOffset) =>
      _mulx_u32(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(hi, f), iDef.cont.applyTransformer(hiOffset, f))(iDef.integralType, iDef.cont)
    case CVTSS_SH (a, imm8) =>
      _cvtss_sh(f(a), f(imm8))
    case iDef@MM_STOREU_SI16 (mem_addr, a, mem_addrOffset) =>
      _mm_storeu_si16(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MWAIT (extensions, hints) =>
      _mm_mwait(f(extensions), f(hints))
    case BIT_SCAN_REVERSE (a) =>
      _bit_scan_reverse(f(a))
    case MM_AESDEC_SI128 (a, roundKey) =>
      _mm_aesdec_si128(f(a), f(roundKey))
    case MM_AESKEYGENASSIST_SI128 (a, imm8) =>
      _mm_aeskeygenassist_si128(f(a), f(imm8))
    case iDef@BITTEST64 (a, b, aOffset) =>
      _bittest64(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont)
    case iDef@FXSAVE (mem_addr, mem_addrOffset) =>
      _fxsave(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_SHA1MSG2_EPU32 (a, b) =>
      _mm_sha1msg2_epu32(f(a), f(b))
    case iDef@FXRSTOR64 (mem_addr, mem_addrOffset) =>
      _fxrstor64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case WRITEGSBASE_U32 (a) =>
      _writegsbase_u32(f(a))
    case ROTWR (a, shift) =>
      _rotwr(f(a), f(shift))
    case iDef@ADDCARRYX_U64 (c_in, a, b, out, outOffset) =>
      _addcarryx_u64(iDef.cont.applyTransformer(c_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont)
    case PDEP_U64 (a, mask) =>
      _pdep_u64(f(a), f(mask))
    case MM_CVTPH_PS (a) =>
      _mm_cvtph_ps(f(a))
    case MM256_CVTPH_PS (a) =>
      _mm256_cvtph_ps(f(a))
    case iDef@BND_STORE_PTR_BOUNDS (ptr_addr, ptr_val, ptr_valOffset) =>
      _bnd_store_ptr_bounds(iDef.cont.applyTransformer(ptr_addr, f), iDef.cont.applyTransformer(ptr_val, f), iDef.cont.applyTransformer(ptr_valOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MONITOR (p, extensions, hints, pOffset) =>
      _mm_monitor(iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(extensions, f), iDef.cont.applyTransformer(hints, f), iDef.cont.applyTransformer(pOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CVTPS_PH (a, rounding) =>
      _mm_cvtps_ph(f(a), f(rounding))
    case BLSR_U64 (a) =>
      _blsr_u64(f(a))
    case BLSI_U64 (a) =>
      _blsi_u64(f(a))
    case iDef@BITSCANREVERSE64 (index, mask, indexOffset) =>
      _BitScanReverse64(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(indexOffset, f))(iDef.integralType, iDef.cont)
    case MM_CLMULEPI64_SI128 (a, b, imm8) =>
      _mm_clmulepi64_si128(f(a), f(b), f(imm8))
    case iDef@BND_INIT_PTR_BOUNDS (q, qOffset) =>
      _bnd_init_ptr_bounds(iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@XSAVE64 (mem_addr, save_mask, mem_addrOffset) =>
      _xsave64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case CASTU64_F64 (a) =>
      _castu64_f64(f(a))
    case iDef@FXRSTOR (mem_addr, mem_addrOffset) =>
      _fxrstor(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@RDRAND64_STEP (value, valueOffset) =>
      _rdrand64_step(iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont)
    case ROTL (a, shift) =>
      _rotl(f(a), f(shift))
    case BIT_SCAN_FORWARD (a) =>
      _bit_scan_forward(f(a))
    case MM_POPCNT_U64 (a) =>
      _mm_popcnt_u64(f(a))
    case iDef@RDRAND16_STEP (value, valueOffset) =>
      _rdrand16_step(iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont)
    case MM_SHA256RNDS2_EPU32 (a, b, k) =>
      _mm_sha256rnds2_epu32(f(a), f(b), f(k))
    case iDef@XSAVEC64 (mem_addr, save_mask, mem_addrOffset) =>
      _xsavec64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case PEXT_U32 (a, mask) =>
      _pext_u32(f(a), f(mask))
    case MM_AESENCLAST_SI128 (a, roundKey) =>
      _mm_aesenclast_si128(f(a), f(roundKey))
    case CASTF64_U64 (a) =>
      _castf64_u64(f(a))
    case MM256_CVTPS_PH (a, rounding) =>
      _mm256_cvtps_ph(f(a), f(rounding))
    case iDef@BITTEST (a, b, aOffset) =>
      _bittest(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont)
    case MM_SHA1RNDS4_EPU32 (a, b, func) =>
      _mm_sha1rnds4_epu32(f(a), f(b), f(func))
    case iDef@BND_COPY_PTR_BOUNDS (q, r, qOffset, rOffset) =>
      _bnd_copy_ptr_bounds(iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(r, f), iDef.cont.applyTransformer(qOffset, f), iDef.cont.applyTransformer(rOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@RDSEED32_STEP (value, valueOffset) =>
      _rdseed32_step(iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont)
    case CASTF32_U32 (a) =>
      _castf32_u32(f(a))
    case LROTL (a, shift) =>
      _lrotl(f(a), f(shift))
    case iDef@BITTESTANDCOMPLEMENT (a, b, aOffset) =>
      _bittestandcomplement(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont)
    case BEXTR_U64 (a, start, len) =>
      _bextr_u64(f(a), f(start), f(len))
    case RDPID_U32 () =>
      _rdpid_u32()
    case iDef@SUBBORROW_U32 (b_in, a, b, out, outOffset) =>
      _subborrow_u32(iDef.cont.applyTransformer(b_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont)
    case CASTU32_F32 (a) =>
      _castu32_f32(f(a))
    case XBEGIN () =>
      _xbegin()
    case ROTWL (a, shift) =>
      _rotwl(f(a), f(shift))
    case CVTSH_SS (a) =>
      _cvtsh_ss(f(a))
    case iDef@MULX_U64 (a, b, hi, hiOffset) =>
      _mulx_u64(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(hi, f), iDef.cont.applyTransformer(hiOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOADU_SI16 (mem_addr, mem_addrOffset) =>
      _mm_loadu_si16(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case POPCNT32 (a) =>
      _popcnt32(f(a))
    case MM_TZCNT_32 (a) =>
      _mm_tzcnt_32(f(a))
    case iDef@XSAVEOPT64 (mem_addr, save_mask, mem_addrOffset) =>
      _xsaveopt64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_TZCNT_64 (a) =>
      _mm_tzcnt_64(f(a))
    case iDef@ADDCARRY_U64 (c_in, a, b, out, outOffset) =>
      _addcarry_u64(iDef.cont.applyTransformer(c_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont)
    case WRITEGSBASE_U64 (a) =>
      _writegsbase_u64(f(a))
    case BLSMSK_U64 (a) =>
      _blsmsk_u64(f(a))
    case iDef@BND_GET_PTR_LBOUND (q, qOffset) =>
      _bnd_get_ptr_lbound(iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case XSETBV (a, value) =>
      _xsetbv(f(a), f(value))
    case XGETBV (a) =>
      _xgetbv(f(a))
    case iDef@BND_CHK_PTR_UBOUNDS (q, qOffset) =>
      _bnd_chk_ptr_ubounds(iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case BLSI_U32 (a) =>
      _blsi_u32(f(a))
    case READFSBASE_U32 () =>
      _readfsbase_u32()
    case MM_SHA256MSG2_EPU32 (a, b) =>
      _mm_sha256msg2_epu32(f(a), f(b))
    case iDef@BITTESTANDRESET64 (a, b, aOffset) =>
      _bittestandreset64(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont)
    case MM_AESIMC_SI128 (a) =>
      _mm_aesimc_si128(f(a))
    case iDef@RDRAND32_STEP (value, valueOffset) =>
      _rdrand32_step(iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont)
    case iDef@ADDCARRY_U32 (c_in, a, b, out, outOffset) =>
      _addcarry_u32(iDef.cont.applyTransformer(c_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont)
    case iDef@XRSTOR64 (mem_addr, rs_mask, mem_addrOffset) =>
      _xrstor64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(rs_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@RDSEED16_STEP (value, valueOffset) =>
      _rdseed16_step(iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOADU_SI64 (mem_addr, mem_addrOffset) =>
      _mm_loadu_si64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case ROTR64 (a, shift) =>
      _rotr64(f(a), f(shift))
    case READGSBASE_U64 () =>
      _readgsbase_u64()
    case RDTSC () =>
      _rdtsc()
    case MM_SHA1MSG1_EPU32 (a, b) =>
      _mm_sha1msg1_epu32(f(a), f(b))
    case BEXTR_U32 (a, start, len) =>
      _bextr_u32(f(a), f(start), f(len))
    case iDef@BND_SET_PTR_BOUNDS (srcmem, size, srcmemOffset) =>
      _bnd_set_ptr_bounds(iDef.cont.applyTransformer(srcmem, f), iDef.cont.applyTransformer(size, f), iDef.cont.applyTransformer(srcmemOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case XTEST () =>
      _xtest()
    case iDef@XSAVE (mem_addr, save_mask, mem_addrOffset) =>
      _xsave(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@BND_GET_PTR_UBOUND (q, qOffset) =>
      _bnd_get_ptr_ubound(iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case BSWAP (a) =>
      _bswap(f(a))
    case MAY_I_USE_CPU_FEATURE (a) =>
      _may_i_use_cpu_feature(f(a))
    case RDPMC (a) =>
      _rdpmc(f(a))
    case WRITEFSBASE_U64 (a) =>
      _writefsbase_u64(f(a))
    case BSWAP64 (a) =>
      _bswap64(f(a))
    case iDef@BITTESTANDSET (a, b, aOffset) =>
      _bittestandset(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_CLWB (p, pOffset) =>
      _mm_clwb(iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(pOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_STOREU_SI32 (mem_addr, a, mem_addrOffset) =>
      _mm_storeu_si32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@BND_NARROW_PTR_BOUNDS (q, r, size, qOffset, rOffset) =>
      _bnd_narrow_ptr_bounds(iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(r, f), iDef.cont.applyTransformer(size, f), iDef.cont.applyTransformer(qOffset, f), iDef.cont.applyTransformer(rOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@XRSTORS (mem_addr, rs_mask, mem_addrOffset) =>
      _xrstors(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(rs_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case POPCNT64 (a) =>
      _popcnt64(f(a))
    case iDef@XSAVES (mem_addr, save_mask, mem_addrOffset) =>
      _xsaves(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@FXSAVE64 (mem_addr, mem_addrOffset) =>
      _fxsave64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case XEND () =>
      _xend()
    case MM_SHA1NEXTE_EPU32 (a, b) =>
      _mm_sha1nexte_epu32(f(a), f(b))
    case iDef@INVPCID (tpe, descriptor, descriptorOffset) =>
      _invpcid(iDef.cont.applyTransformer(tpe, f), iDef.cont.applyTransformer(descriptor, f), iDef.cont.applyTransformer(descriptorOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case TZCNT_U64 (a) =>
      _tzcnt_u64(f(a))
    case ANDN_U32 (a, b) =>
      _andn_u32(f(a), f(b))
    case READFSBASE_U64 () =>
      _readfsbase_u64()
    case iDef@BITTESTANDCOMPLEMENT64 (a, b, aOffset) =>
      _bittestandcomplement64(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont)
    case PDEP_U32 (a, mask) =>
      _pdep_u32(f(a), f(mask))
    case BLSR_U32 (a) =>
      _blsr_u32(f(a))
    case MM_SHA256MSG1_EPU32 (a, b) =>
      _mm_sha256msg1_epu32(f(a), f(b))
    case iDef@XSAVEOPT (mem_addr, save_mask, mem_addrOffset) =>
      _xsaveopt(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@ADDCARRYX_U32 (c_in, a, b, out, outOffset) =>
      _addcarryx_u32(iDef.cont.applyTransformer(c_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont)
    case ROTR (a, shift) =>
      _rotr(f(a), f(shift))
    case iDef@RDSEED64_STEP (value, valueOffset) =>
      _rdseed64_step(iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont)
    case iDef@SUBBORROW_U64 (b_in, a, b, out, outOffset) =>
      _subborrow_u64(iDef.cont.applyTransformer(b_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont)
    case MM_MALLOC (size, align) =>
      _mm_malloc(f(size), f(align))
    case iDef@MM_LOADU_SI32 (mem_addr, mem_addrOffset) =>
      _mm_loadu_si32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_CLFLUSHOPT (p, pOffset) =>
      _mm_clflushopt(iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(pOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@XRSTORS64 (mem_addr, rs_mask, mem_addrOffset) =>
      _xrstors64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(rs_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_AESENC_SI128 (a, roundKey) =>
      _mm_aesenc_si128(f(a), f(roundKey))
    case iDef@MM_STOREU_SI64 (mem_addr, a, mem_addrOffset) =>
      _mm_storeu_si64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case ROTL64 (a, shift) =>
      _rotl64(f(a), f(shift))
    case LZCNT_U64 (a) =>
      _lzcnt_u64(f(a))
    case iDef@XSAVEC (mem_addr, save_mask, mem_addrOffset) =>
      _xsavec(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@BITSCANFORWARD64 (index, mask, indexOffset) =>
      _BitScanForward64(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(indexOffset, f))(iDef.integralType, iDef.cont)
    case BZHI_U64 (a, index) =>
      _bzhi_u64(f(a), f(index))
    case MM_AESDECLAST_SI128 (a, roundKey) =>
      _mm_aesdeclast_si128(f(a), f(roundKey))
    case BLSMSK_U32 (a) =>
      _blsmsk_u32(f(a))
    case WRITEFSBASE_U32 (a) =>
      _writefsbase_u32(f(a))
    case PEXT_U64 (a, mask) =>
      _pext_u64(f(a), f(mask))

    case Reflect(LROTR (a, shift), u, es) =>
      reflectMirrored(Reflect(LROTR (f(a), f(shift)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(LZCNT_U32 (a), u, es) =>
      reflectMirrored(Reflect(LZCNT_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_CHK_PTR_LBOUNDS (q, qOffset), u, es) =>
      reflectMirrored(Reflect(BND_CHK_PTR_LBOUNDS (iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(TZCNT_U32 (a), u, es) =>
      reflectMirrored(Reflect(TZCNT_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_FREE (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_FREE (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(READGSBASE_U32 (), u, es) =>
      reflectMirrored(Reflect(READGSBASE_U32 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITTESTANDSET64 (a, b, aOffset), u, es) =>
      reflectMirrored(Reflect(BITTESTANDSET64 (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XRSTOR (mem_addr, rs_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XRSTOR (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(rs_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(ALLOW_CPU_FEATURES (a), u, es) =>
      reflectMirrored(Reflect(ALLOW_CPU_FEATURES (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@RDTSCP (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(RDTSCP (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BEXTR2_U32 (a, control), u, es) =>
      reflectMirrored(Reflect(BEXTR2_U32 (f(a), f(control)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BZHI_U32 (a, index), u, es) =>
      reflectMirrored(Reflect(BZHI_U32 (f(a), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XSAVES64 (mem_addr, save_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XSAVES64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(ANDN_U64 (a, b), u, es) =>
      reflectMirrored(Reflect(ANDN_U64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(XABORT (imm8), u, es) =>
      reflectMirrored(Reflect(XABORT (f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BEXTR2_U64 (a, control), u, es) =>
      reflectMirrored(Reflect(BEXTR2_U64 (f(a), f(control)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_POPCNT_U32 (a), u, es) =>
      reflectMirrored(Reflect(MM_POPCNT_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_CHK_PTR_BOUNDS (q, size, qOffset), u, es) =>
      reflectMirrored(Reflect(BND_CHK_PTR_BOUNDS (iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(size, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITSCANREVERSE (index, mask, indexOffset), u, es) =>
      reflectMirrored(Reflect(BITSCANREVERSE (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(indexOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITTESTANDRESET (a, b, aOffset), u, es) =>
      reflectMirrored(Reflect(BITTESTANDRESET (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITSCANFORWARD (index, mask, indexOffset), u, es) =>
      reflectMirrored(Reflect(BITSCANFORWARD (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(indexOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MULX_U32 (a, b, hi, hiOffset), u, es) =>
      reflectMirrored(Reflect(MULX_U32 (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(hi, f), iDef.cont.applyTransformer(hiOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(CVTSS_SH (a, imm8), u, es) =>
      reflectMirrored(Reflect(CVTSS_SH (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREU_SI16 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREU_SI16 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MWAIT (extensions, hints), u, es) =>
      reflectMirrored(Reflect(MM_MWAIT (f(extensions), f(hints)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BIT_SCAN_REVERSE (a), u, es) =>
      reflectMirrored(Reflect(BIT_SCAN_REVERSE (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AESDEC_SI128 (a, roundKey), u, es) =>
      reflectMirrored(Reflect(MM_AESDEC_SI128 (f(a), f(roundKey)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AESKEYGENASSIST_SI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_AESKEYGENASSIST_SI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITTEST64 (a, b, aOffset), u, es) =>
      reflectMirrored(Reflect(BITTEST64 (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@FXSAVE (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(FXSAVE (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHA1MSG2_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SHA1MSG2_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@FXRSTOR64 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(FXRSTOR64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(WRITEGSBASE_U32 (a), u, es) =>
      reflectMirrored(Reflect(WRITEGSBASE_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(ROTWR (a, shift), u, es) =>
      reflectMirrored(Reflect(ROTWR (f(a), f(shift)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@ADDCARRYX_U64 (c_in, a, b, out, outOffset), u, es) =>
      reflectMirrored(Reflect(ADDCARRYX_U64 (iDef.cont.applyTransformer(c_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(PDEP_U64 (a, mask), u, es) =>
      reflectMirrored(Reflect(PDEP_U64 (f(a), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_STORE_PTR_BOUNDS (ptr_addr, ptr_val, ptr_valOffset), u, es) =>
      reflectMirrored(Reflect(BND_STORE_PTR_BOUNDS (iDef.cont.applyTransformer(ptr_addr, f), iDef.cont.applyTransformer(ptr_val, f), iDef.cont.applyTransformer(ptr_valOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MONITOR (p, extensions, hints, pOffset), u, es) =>
      reflectMirrored(Reflect(MM_MONITOR (iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(extensions, f), iDef.cont.applyTransformer(hints, f), iDef.cont.applyTransformer(pOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_PH (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_PH (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BLSR_U64 (a), u, es) =>
      reflectMirrored(Reflect(BLSR_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BLSI_U64 (a), u, es) =>
      reflectMirrored(Reflect(BLSI_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITSCANREVERSE64 (index, mask, indexOffset), u, es) =>
      reflectMirrored(Reflect(BITSCANREVERSE64 (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(indexOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CLMULEPI64_SI128 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CLMULEPI64_SI128 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_INIT_PTR_BOUNDS (q, qOffset), u, es) =>
      reflectMirrored(Reflect(BND_INIT_PTR_BOUNDS (iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XSAVE64 (mem_addr, save_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XSAVE64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(CASTU64_F64 (a), u, es) =>
      reflectMirrored(Reflect(CASTU64_F64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@FXRSTOR (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(FXRSTOR (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@RDRAND64_STEP (value, valueOffset), u, es) =>
      reflectMirrored(Reflect(RDRAND64_STEP (iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(ROTL (a, shift), u, es) =>
      reflectMirrored(Reflect(ROTL (f(a), f(shift)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BIT_SCAN_FORWARD (a), u, es) =>
      reflectMirrored(Reflect(BIT_SCAN_FORWARD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_POPCNT_U64 (a), u, es) =>
      reflectMirrored(Reflect(MM_POPCNT_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@RDRAND16_STEP (value, valueOffset), u, es) =>
      reflectMirrored(Reflect(RDRAND16_STEP (iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHA256RNDS2_EPU32 (a, b, k), u, es) =>
      reflectMirrored(Reflect(MM_SHA256RNDS2_EPU32 (f(a), f(b), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XSAVEC64 (mem_addr, save_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XSAVEC64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(PEXT_U32 (a, mask), u, es) =>
      reflectMirrored(Reflect(PEXT_U32 (f(a), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AESENCLAST_SI128 (a, roundKey), u, es) =>
      reflectMirrored(Reflect(MM_AESENCLAST_SI128 (f(a), f(roundKey)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(CASTF64_U64 (a), u, es) =>
      reflectMirrored(Reflect(CASTF64_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPS_PH (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPS_PH (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITTEST (a, b, aOffset), u, es) =>
      reflectMirrored(Reflect(BITTEST (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHA1RNDS4_EPU32 (a, b, func), u, es) =>
      reflectMirrored(Reflect(MM_SHA1RNDS4_EPU32 (f(a), f(b), f(func)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_COPY_PTR_BOUNDS (q, r, qOffset, rOffset), u, es) =>
      reflectMirrored(Reflect(BND_COPY_PTR_BOUNDS (iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(r, f), iDef.cont.applyTransformer(qOffset, f), iDef.cont.applyTransformer(rOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@RDSEED32_STEP (value, valueOffset), u, es) =>
      reflectMirrored(Reflect(RDSEED32_STEP (iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(CASTF32_U32 (a), u, es) =>
      reflectMirrored(Reflect(CASTF32_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(LROTL (a, shift), u, es) =>
      reflectMirrored(Reflect(LROTL (f(a), f(shift)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITTESTANDCOMPLEMENT (a, b, aOffset), u, es) =>
      reflectMirrored(Reflect(BITTESTANDCOMPLEMENT (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BEXTR_U64 (a, start, len), u, es) =>
      reflectMirrored(Reflect(BEXTR_U64 (f(a), f(start), f(len)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(RDPID_U32 (), u, es) =>
      reflectMirrored(Reflect(RDPID_U32 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@SUBBORROW_U32 (b_in, a, b, out, outOffset), u, es) =>
      reflectMirrored(Reflect(SUBBORROW_U32 (iDef.cont.applyTransformer(b_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(CASTU32_F32 (a), u, es) =>
      reflectMirrored(Reflect(CASTU32_F32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(XBEGIN (), u, es) =>
      reflectMirrored(Reflect(XBEGIN (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(ROTWL (a, shift), u, es) =>
      reflectMirrored(Reflect(ROTWL (f(a), f(shift)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(CVTSH_SS (a), u, es) =>
      reflectMirrored(Reflect(CVTSH_SS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MULX_U64 (a, b, hi, hiOffset), u, es) =>
      reflectMirrored(Reflect(MULX_U64 (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(hi, f), iDef.cont.applyTransformer(hiOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADU_SI16 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADU_SI16 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(POPCNT32 (a), u, es) =>
      reflectMirrored(Reflect(POPCNT32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TZCNT_32 (a), u, es) =>
      reflectMirrored(Reflect(MM_TZCNT_32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XSAVEOPT64 (mem_addr, save_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XSAVEOPT64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TZCNT_64 (a), u, es) =>
      reflectMirrored(Reflect(MM_TZCNT_64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@ADDCARRY_U64 (c_in, a, b, out, outOffset), u, es) =>
      reflectMirrored(Reflect(ADDCARRY_U64 (iDef.cont.applyTransformer(c_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(WRITEGSBASE_U64 (a), u, es) =>
      reflectMirrored(Reflect(WRITEGSBASE_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BLSMSK_U64 (a), u, es) =>
      reflectMirrored(Reflect(BLSMSK_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_GET_PTR_LBOUND (q, qOffset), u, es) =>
      reflectMirrored(Reflect(BND_GET_PTR_LBOUND (iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(XSETBV (a, value), u, es) =>
      reflectMirrored(Reflect(XSETBV (f(a), f(value)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(XGETBV (a), u, es) =>
      reflectMirrored(Reflect(XGETBV (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_CHK_PTR_UBOUNDS (q, qOffset), u, es) =>
      reflectMirrored(Reflect(BND_CHK_PTR_UBOUNDS (iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BLSI_U32 (a), u, es) =>
      reflectMirrored(Reflect(BLSI_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(READFSBASE_U32 (), u, es) =>
      reflectMirrored(Reflect(READFSBASE_U32 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHA256MSG2_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SHA256MSG2_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITTESTANDRESET64 (a, b, aOffset), u, es) =>
      reflectMirrored(Reflect(BITTESTANDRESET64 (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AESIMC_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM_AESIMC_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@RDRAND32_STEP (value, valueOffset), u, es) =>
      reflectMirrored(Reflect(RDRAND32_STEP (iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@ADDCARRY_U32 (c_in, a, b, out, outOffset), u, es) =>
      reflectMirrored(Reflect(ADDCARRY_U32 (iDef.cont.applyTransformer(c_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XRSTOR64 (mem_addr, rs_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XRSTOR64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(rs_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@RDSEED16_STEP (value, valueOffset), u, es) =>
      reflectMirrored(Reflect(RDSEED16_STEP (iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADU_SI64 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADU_SI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(ROTR64 (a, shift), u, es) =>
      reflectMirrored(Reflect(ROTR64 (f(a), f(shift)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(READGSBASE_U64 (), u, es) =>
      reflectMirrored(Reflect(READGSBASE_U64 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(RDTSC (), u, es) =>
      reflectMirrored(Reflect(RDTSC (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHA1MSG1_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SHA1MSG1_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BEXTR_U32 (a, start, len), u, es) =>
      reflectMirrored(Reflect(BEXTR_U32 (f(a), f(start), f(len)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_SET_PTR_BOUNDS (srcmem, size, srcmemOffset), u, es) =>
      reflectMirrored(Reflect(BND_SET_PTR_BOUNDS (iDef.cont.applyTransformer(srcmem, f), iDef.cont.applyTransformer(size, f), iDef.cont.applyTransformer(srcmemOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(XTEST (), u, es) =>
      reflectMirrored(Reflect(XTEST (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XSAVE (mem_addr, save_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XSAVE (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_GET_PTR_UBOUND (q, qOffset), u, es) =>
      reflectMirrored(Reflect(BND_GET_PTR_UBOUND (iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(qOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BSWAP (a), u, es) =>
      reflectMirrored(Reflect(BSWAP (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MAY_I_USE_CPU_FEATURE (a), u, es) =>
      reflectMirrored(Reflect(MAY_I_USE_CPU_FEATURE (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(RDPMC (a), u, es) =>
      reflectMirrored(Reflect(RDPMC (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(WRITEFSBASE_U64 (a), u, es) =>
      reflectMirrored(Reflect(WRITEFSBASE_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BSWAP64 (a), u, es) =>
      reflectMirrored(Reflect(BSWAP64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITTESTANDSET (a, b, aOffset), u, es) =>
      reflectMirrored(Reflect(BITTESTANDSET (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_CLWB (p, pOffset), u, es) =>
      reflectMirrored(Reflect(MM_CLWB (iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(pOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREU_SI32 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREU_SI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BND_NARROW_PTR_BOUNDS (q, r, size, qOffset, rOffset), u, es) =>
      reflectMirrored(Reflect(BND_NARROW_PTR_BOUNDS (iDef.cont.applyTransformer(q, f), iDef.cont.applyTransformer(r, f), iDef.cont.applyTransformer(size, f), iDef.cont.applyTransformer(qOffset, f), iDef.cont.applyTransformer(rOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XRSTORS (mem_addr, rs_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XRSTORS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(rs_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(POPCNT64 (a), u, es) =>
      reflectMirrored(Reflect(POPCNT64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XSAVES (mem_addr, save_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XSAVES (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@FXSAVE64 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(FXSAVE64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(XEND (), u, es) =>
      reflectMirrored(Reflect(XEND (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHA1NEXTE_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SHA1NEXTE_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@INVPCID (tpe, descriptor, descriptorOffset), u, es) =>
      reflectMirrored(Reflect(INVPCID (iDef.cont.applyTransformer(tpe, f), iDef.cont.applyTransformer(descriptor, f), iDef.cont.applyTransformer(descriptorOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(TZCNT_U64 (a), u, es) =>
      reflectMirrored(Reflect(TZCNT_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(ANDN_U32 (a, b), u, es) =>
      reflectMirrored(Reflect(ANDN_U32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(READFSBASE_U64 (), u, es) =>
      reflectMirrored(Reflect(READFSBASE_U64 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITTESTANDCOMPLEMENT64 (a, b, aOffset), u, es) =>
      reflectMirrored(Reflect(BITTESTANDCOMPLEMENT64 (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(aOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(PDEP_U32 (a, mask), u, es) =>
      reflectMirrored(Reflect(PDEP_U32 (f(a), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BLSR_U32 (a), u, es) =>
      reflectMirrored(Reflect(BLSR_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHA256MSG1_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SHA256MSG1_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XSAVEOPT (mem_addr, save_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XSAVEOPT (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@ADDCARRYX_U32 (c_in, a, b, out, outOffset), u, es) =>
      reflectMirrored(Reflect(ADDCARRYX_U32 (iDef.cont.applyTransformer(c_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(ROTR (a, shift), u, es) =>
      reflectMirrored(Reflect(ROTR (f(a), f(shift)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@RDSEED64_STEP (value, valueOffset), u, es) =>
      reflectMirrored(Reflect(RDSEED64_STEP (iDef.cont.applyTransformer(value, f), iDef.cont.applyTransformer(valueOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@SUBBORROW_U64 (b_in, a, b, out, outOffset), u, es) =>
      reflectMirrored(Reflect(SUBBORROW_U64 (iDef.cont.applyTransformer(b_in, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(out, f), iDef.cont.applyTransformer(outOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MALLOC (size, align), u, es) =>
      reflectMirrored(Reflect(MM_MALLOC (f(size), f(align)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADU_SI32 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADU_SI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_CLFLUSHOPT (p, pOffset), u, es) =>
      reflectMirrored(Reflect(MM_CLFLUSHOPT (iDef.cont.applyTransformer(p, f), iDef.cont.applyTransformer(pOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XRSTORS64 (mem_addr, rs_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XRSTORS64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(rs_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AESENC_SI128 (a, roundKey), u, es) =>
      reflectMirrored(Reflect(MM_AESENC_SI128 (f(a), f(roundKey)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREU_SI64 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREU_SI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(ROTL64 (a, shift), u, es) =>
      reflectMirrored(Reflect(ROTL64 (f(a), f(shift)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(LZCNT_U64 (a), u, es) =>
      reflectMirrored(Reflect(LZCNT_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@XSAVEC (mem_addr, save_mask, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(XSAVEC (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(save_mask, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@BITSCANFORWARD64 (index, mask, indexOffset), u, es) =>
      reflectMirrored(Reflect(BITSCANFORWARD64 (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(indexOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BZHI_U64 (a, index), u, es) =>
      reflectMirrored(Reflect(BZHI_U64 (f(a), f(index)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_AESDECLAST_SI128 (a, roundKey), u, es) =>
      reflectMirrored(Reflect(MM_AESDECLAST_SI128 (f(a), f(roundKey)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(BLSMSK_U32 (a), u, es) =>
      reflectMirrored(Reflect(BLSMSK_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(WRITEFSBASE_U32 (a), u, es) =>
      reflectMirrored(Reflect(WRITEFSBASE_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(PEXT_U64 (a, mask), u, es) =>
      reflectMirrored(Reflect(PEXT_U64 (f(a), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenOther extends CGenIntrinsics {

  val IR: Other
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@LROTR(a, shift) =>
      headers += iDef.header
      emitValDef(sym, s"_lrotr(${quote(a)}, ${quote(shift)})")
    case iDef@LZCNT_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_lzcnt_u32(${quote(a)})")
    case iDef@BND_CHK_PTR_LBOUNDS(q, qOffset) =>
      headers += iDef.header
      stream.println(s"_bnd_chk_ptr_lbounds((const void *) (${quote(q)  + (if(qOffset == Const(0)) "" else " + " + quote(qOffset))}));")
    case iDef@TZCNT_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_tzcnt_u32(${quote(a)})")
    case iDef@MM_FREE(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_free((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}));")
    case iDef@READGSBASE_U32() =>
      headers += iDef.header
      emitValDef(sym, s"_readgsbase_u32()")
    case iDef@BITTESTANDSET64(a, b, aOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bittestandset64((__int64*) (${quote(a)  + (if(aOffset == Const(0)) "" else " + " + quote(aOffset))}), ${quote(b)})")
    case iDef@XRSTOR(mem_addr, rs_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xrstor((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(rs_mask)});")
    case iDef@ALLOW_CPU_FEATURES(a) =>
      headers += iDef.header
      stream.println(s"_allow_cpu_features(${quote(a)});")
    case iDef@RDTSCP(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"__rdtscp((unsigned int *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@BEXTR2_U32(a, control) =>
      headers += iDef.header
      emitValDef(sym, s"_bextr2_u32(${quote(a)}, ${quote(control)})")
    case iDef@BZHI_U32(a, index) =>
      headers += iDef.header
      emitValDef(sym, s"_bzhi_u32(${quote(a)}, ${quote(index)})")
    case iDef@XSAVES64(mem_addr, save_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xsaves64((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(save_mask)});")
    case iDef@ANDN_U64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_andn_u64(${quote(a)}, ${quote(b)})")
    case iDef@XABORT(imm8) =>
      headers += iDef.header
      stream.println(s"_xabort(${quote(imm8)});")
    case iDef@BEXTR2_U64(a, control) =>
      headers += iDef.header
      emitValDef(sym, s"_bextr2_u64(${quote(a)}, ${quote(control)})")
    case iDef@MM_POPCNT_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_popcnt_u32(${quote(a)})")
    case iDef@BND_CHK_PTR_BOUNDS(q, size, qOffset) =>
      headers += iDef.header
      stream.println(s"_bnd_chk_ptr_bounds((const void *) (${quote(q)  + (if(qOffset == Const(0)) "" else " + " + quote(qOffset))}), ${quote(size)});")
    case iDef@BITSCANREVERSE(index, mask, indexOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_BitScanReverse((unsigned __int32*) (${quote(index)  + (if(indexOffset == Const(0)) "" else " + " + quote(indexOffset))}), ${quote(mask)})")
    case iDef@BITTESTANDRESET(a, b, aOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bittestandreset((__int32*) (${quote(a)  + (if(aOffset == Const(0)) "" else " + " + quote(aOffset))}), ${quote(b)})")
    case iDef@BITSCANFORWARD(index, mask, indexOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_BitScanForward((unsigned __int32*) (${quote(index)  + (if(indexOffset == Const(0)) "" else " + " + quote(indexOffset))}), ${quote(mask)})")
    case iDef@MULX_U32(a, b, hi, hiOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mulx_u32(${quote(a)}, ${quote(b)}, (unsigned int*) (${quote(hi)  + (if(hiOffset == Const(0)) "" else " + " + quote(hiOffset))}))")
    case iDef@CVTSS_SH(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_cvtss_sh(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_STOREU_SI16(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storeu_si16((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_MWAIT(extensions, hints) =>
      headers += iDef.header
      stream.println(s"_mm_mwait(${quote(extensions)}, ${quote(hints)});")
    case iDef@BIT_SCAN_REVERSE(a) =>
      headers += iDef.header
      emitValDef(sym, s"_bit_scan_reverse(${quote(a)})")
    case iDef@MM_AESDEC_SI128(a, roundKey) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_aesdec_si128(${quote(a)}, ${quote(roundKey)})")
    case iDef@MM_AESKEYGENASSIST_SI128(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_aeskeygenassist_si128(${quote(a)}, ${quote(imm8)})")
    case iDef@BITTEST64(a, b, aOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bittest64((__int64*) (${quote(a)  + (if(aOffset == Const(0)) "" else " + " + quote(aOffset))}), ${quote(b)})")
    case iDef@FXSAVE(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_fxsave((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}));")
    case iDef@MM_SHA1MSG2_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sha1msg2_epu32(${quote(a)}, ${quote(b)})")
    case iDef@FXRSTOR64(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_fxrstor64((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}));")
    case iDef@WRITEGSBASE_U32(a) =>
      headers += iDef.header
      stream.println(s"_writegsbase_u32(${quote(a)});")
    case iDef@ROTWR(a, shift) =>
      headers += iDef.header
      emitValDef(sym, s"_rotwr(${quote(a)}, ${quote(shift)})")
    case iDef@ADDCARRYX_U64(c_in, a, b, out, outOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_addcarryx_u64(${quote(c_in)}, ${quote(a)}, ${quote(b)}, (unsigned __int64 *) (${quote(out)  + (if(outOffset == Const(0)) "" else " + " + quote(outOffset))}))")
    case iDef@PDEP_U64(a, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_pdep_u64(${quote(a)}, ${quote(mask)})")
    case iDef@MM_CVTPH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtph_ps(${quote(a)})")
    case iDef@MM256_CVTPH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtph_ps(${quote(a)})")
    case iDef@BND_STORE_PTR_BOUNDS(ptr_addr, ptr_val, ptr_valOffset) =>
      headers += iDef.header
      stream.println(s"_bnd_store_ptr_bounds(${quote(ptr_addr)}, (const void *) (${quote(ptr_val)  + (if(ptr_valOffset == Const(0)) "" else " + " + quote(ptr_valOffset))}));")
    case iDef@MM_MONITOR(p, extensions, hints, pOffset) =>
      headers += iDef.header
      stream.println(s"_mm_monitor((void const*) (${quote(p)  + (if(pOffset == Const(0)) "" else " + " + quote(pOffset))}), ${quote(extensions)}, ${quote(hints)});")
    case iDef@MM_CVTPS_PH(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtps_ph(${quote(a)}, ${quote(rounding)})")
    case iDef@BLSR_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_blsr_u64(${quote(a)})")
    case iDef@BLSI_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_blsi_u64(${quote(a)})")
    case iDef@BITSCANREVERSE64(index, mask, indexOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_BitScanReverse64((unsigned __int32*) (${quote(index)  + (if(indexOffset == Const(0)) "" else " + " + quote(indexOffset))}), ${quote(mask)})")
    case iDef@MM_CLMULEPI64_SI128(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_clmulepi64_si128(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@BND_INIT_PTR_BOUNDS(q, qOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bnd_init_ptr_bounds((const void *) (${quote(q)  + (if(qOffset == Const(0)) "" else " + " + quote(qOffset))}))")
    case iDef@XSAVE64(mem_addr, save_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xsave64((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(save_mask)});")
    case iDef@CASTU64_F64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_castu64_f64(${quote(a)})")
    case iDef@FXRSTOR(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_fxrstor((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}));")
    case iDef@RDRAND64_STEP(value, valueOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_rdrand64_step((unsigned __int64*) (${quote(value)  + (if(valueOffset == Const(0)) "" else " + " + quote(valueOffset))}))")
    case iDef@ROTL(a, shift) =>
      headers += iDef.header
      emitValDef(sym, s"_rotl(${quote(a)}, ${quote(shift)})")
    case iDef@BIT_SCAN_FORWARD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_bit_scan_forward(${quote(a)})")
    case iDef@MM_POPCNT_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_popcnt_u64(${quote(a)})")
    case iDef@RDRAND16_STEP(value, valueOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_rdrand16_step((unsigned short*) (${quote(value)  + (if(valueOffset == Const(0)) "" else " + " + quote(valueOffset))}))")
    case iDef@MM_SHA256RNDS2_EPU32(a, b, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sha256rnds2_epu32(${quote(a)}, ${quote(b)}, ${quote(k)})")
    case iDef@XSAVEC64(mem_addr, save_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xsavec64((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(save_mask)});")
    case iDef@PEXT_U32(a, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_pext_u32(${quote(a)}, ${quote(mask)})")
    case iDef@MM_AESENCLAST_SI128(a, roundKey) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_aesenclast_si128(${quote(a)}, ${quote(roundKey)})")
    case iDef@CASTF64_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_castf64_u64(${quote(a)})")
    case iDef@MM256_CVTPS_PH(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtps_ph(${quote(a)}, ${quote(rounding)})")
    case iDef@BITTEST(a, b, aOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bittest((__int32*) (${quote(a)  + (if(aOffset == Const(0)) "" else " + " + quote(aOffset))}), ${quote(b)})")
    case iDef@MM_SHA1RNDS4_EPU32(a, b, func) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sha1rnds4_epu32(${quote(a)}, ${quote(b)}, ${quote(func)})")
    case iDef@BND_COPY_PTR_BOUNDS(q, r, qOffset, rOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bnd_copy_ptr_bounds((const void *) (${quote(q)  + (if(qOffset == Const(0)) "" else " + " + quote(qOffset))}), (const void *) (${quote(r)  + (if(rOffset == Const(0)) "" else " + " + quote(rOffset))}))")
    case iDef@RDSEED32_STEP(value, valueOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_rdseed32_step((unsigned int *) (${quote(value)  + (if(valueOffset == Const(0)) "" else " + " + quote(valueOffset))}))")
    case iDef@CASTF32_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_castf32_u32(${quote(a)})")
    case iDef@LROTL(a, shift) =>
      headers += iDef.header
      emitValDef(sym, s"_lrotl(${quote(a)}, ${quote(shift)})")
    case iDef@BITTESTANDCOMPLEMENT(a, b, aOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bittestandcomplement((__int32*) (${quote(a)  + (if(aOffset == Const(0)) "" else " + " + quote(aOffset))}), ${quote(b)})")
    case iDef@BEXTR_U64(a, start, len) =>
      headers += iDef.header
      emitValDef(sym, s"_bextr_u64(${quote(a)}, ${quote(start)}, ${quote(len)})")
    case iDef@RDPID_U32() =>
      headers += iDef.header
      emitValDef(sym, s"_rdpid_u32()")
    case iDef@SUBBORROW_U32(b_in, a, b, out, outOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_subborrow_u32(${quote(b_in)}, ${quote(a)}, ${quote(b)}, (unsigned int *) (${quote(out)  + (if(outOffset == Const(0)) "" else " + " + quote(outOffset))}))")
    case iDef@CASTU32_F32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_castu32_f32(${quote(a)})")
    case iDef@XBEGIN() =>
      headers += iDef.header
      emitValDef(sym, s"_xbegin()")
    case iDef@ROTWL(a, shift) =>
      headers += iDef.header
      emitValDef(sym, s"_rotwl(${quote(a)}, ${quote(shift)})")
    case iDef@CVTSH_SS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_cvtsh_ss(${quote(a)})")
    case iDef@MULX_U64(a, b, hi, hiOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mulx_u64(${quote(a)}, ${quote(b)}, (unsigned __int64*) (${quote(hi)  + (if(hiOffset == Const(0)) "" else " + " + quote(hiOffset))}))")
    case iDef@MM_LOADU_SI16(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadu_si16((void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@POPCNT32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_popcnt32(${quote(a)})")
    case iDef@MM_TZCNT_32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tzcnt_32(${quote(a)})")
    case iDef@XSAVEOPT64(mem_addr, save_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xsaveopt64((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(save_mask)});")
    case iDef@MM_TZCNT_64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tzcnt_64(${quote(a)})")
    case iDef@ADDCARRY_U64(c_in, a, b, out, outOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_addcarry_u64(${quote(c_in)}, ${quote(a)}, ${quote(b)}, (unsigned __int64 *) (${quote(out)  + (if(outOffset == Const(0)) "" else " + " + quote(outOffset))}))")
    case iDef@WRITEGSBASE_U64(a) =>
      headers += iDef.header
      stream.println(s"_writegsbase_u64(${quote(a)});")
    case iDef@BLSMSK_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_blsmsk_u64(${quote(a)})")
    case iDef@BND_GET_PTR_LBOUND(q, qOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bnd_get_ptr_lbound((const void *) (${quote(q)  + (if(qOffset == Const(0)) "" else " + " + quote(qOffset))}))")
    case iDef@XSETBV(a, value) =>
      headers += iDef.header
      stream.println(s"_xsetbv(${quote(a)}, ${quote(value)});")
    case iDef@XGETBV(a) =>
      headers += iDef.header
      emitValDef(sym, s"_xgetbv(${quote(a)})")
    case iDef@BND_CHK_PTR_UBOUNDS(q, qOffset) =>
      headers += iDef.header
      stream.println(s"_bnd_chk_ptr_ubounds((const void *) (${quote(q)  + (if(qOffset == Const(0)) "" else " + " + quote(qOffset))}));")
    case iDef@BLSI_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_blsi_u32(${quote(a)})")
    case iDef@READFSBASE_U32() =>
      headers += iDef.header
      emitValDef(sym, s"_readfsbase_u32()")
    case iDef@MM_SHA256MSG2_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sha256msg2_epu32(${quote(a)}, ${quote(b)})")
    case iDef@BITTESTANDRESET64(a, b, aOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bittestandreset64((__int64*) (${quote(a)  + (if(aOffset == Const(0)) "" else " + " + quote(aOffset))}), ${quote(b)})")
    case iDef@MM_AESIMC_SI128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_aesimc_si128(${quote(a)})")
    case iDef@RDRAND32_STEP(value, valueOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_rdrand32_step((unsigned int*) (${quote(value)  + (if(valueOffset == Const(0)) "" else " + " + quote(valueOffset))}))")
    case iDef@ADDCARRY_U32(c_in, a, b, out, outOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_addcarry_u32(${quote(c_in)}, ${quote(a)}, ${quote(b)}, (unsigned int *) (${quote(out)  + (if(outOffset == Const(0)) "" else " + " + quote(outOffset))}))")
    case iDef@XRSTOR64(mem_addr, rs_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xrstor64((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(rs_mask)});")
    case iDef@RDSEED16_STEP(value, valueOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_rdseed16_step((unsigned short *) (${quote(value)  + (if(valueOffset == Const(0)) "" else " + " + quote(valueOffset))}))")
    case iDef@MM_LOADU_SI64(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadu_si64((void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@ROTR64(a, shift) =>
      headers += iDef.header
      emitValDef(sym, s"_rotr64(${quote(a)}, ${quote(shift)})")
    case iDef@READGSBASE_U64() =>
      headers += iDef.header
      emitValDef(sym, s"_readgsbase_u64()")
    case iDef@RDTSC() =>
      headers += iDef.header
      emitValDef(sym, s"_rdtsc()")
    case iDef@MM_SHA1MSG1_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sha1msg1_epu32(${quote(a)}, ${quote(b)})")
    case iDef@BEXTR_U32(a, start, len) =>
      headers += iDef.header
      emitValDef(sym, s"_bextr_u32(${quote(a)}, ${quote(start)}, ${quote(len)})")
    case iDef@BND_SET_PTR_BOUNDS(srcmem, size, srcmemOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bnd_set_ptr_bounds((const void *) (${quote(srcmem)  + (if(srcmemOffset == Const(0)) "" else " + " + quote(srcmemOffset))}), ${quote(size)})")
    case iDef@XTEST() =>
      headers += iDef.header
      emitValDef(sym, s"_xtest()")
    case iDef@XSAVE(mem_addr, save_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xsave((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(save_mask)});")
    case iDef@BND_GET_PTR_UBOUND(q, qOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bnd_get_ptr_ubound((const void *) (${quote(q)  + (if(qOffset == Const(0)) "" else " + " + quote(qOffset))}))")
    case iDef@BSWAP(a) =>
      headers += iDef.header
      emitValDef(sym, s"_bswap(${quote(a)})")
    case iDef@MAY_I_USE_CPU_FEATURE(a) =>
      headers += iDef.header
      emitValDef(sym, s"_may_i_use_cpu_feature(${quote(a)})")
    case iDef@RDPMC(a) =>
      headers += iDef.header
      emitValDef(sym, s"_rdpmc(${quote(a)})")
    case iDef@WRITEFSBASE_U64(a) =>
      headers += iDef.header
      stream.println(s"_writefsbase_u64(${quote(a)});")
    case iDef@BSWAP64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_bswap64(${quote(a)})")
    case iDef@BITTESTANDSET(a, b, aOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bittestandset((__int32*) (${quote(a)  + (if(aOffset == Const(0)) "" else " + " + quote(aOffset))}), ${quote(b)})")
    case iDef@MM_CLWB(p, pOffset) =>
      headers += iDef.header
      stream.println(s"_mm_clwb((void const *) (${quote(p)  + (if(pOffset == Const(0)) "" else " + " + quote(pOffset))}));")
    case iDef@MM_STOREU_SI32(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storeu_si32((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@BND_NARROW_PTR_BOUNDS(q, r, size, qOffset, rOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bnd_narrow_ptr_bounds((const void *) (${quote(q)  + (if(qOffset == Const(0)) "" else " + " + quote(qOffset))}), (const void *) (${quote(r)  + (if(rOffset == Const(0)) "" else " + " + quote(rOffset))}), ${quote(size)})")
    case iDef@XRSTORS(mem_addr, rs_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xrstors((const void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(rs_mask)});")
    case iDef@POPCNT64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_popcnt64(${quote(a)})")
    case iDef@XSAVES(mem_addr, save_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xsaves((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(save_mask)});")
    case iDef@FXSAVE64(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_fxsave64((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}));")
    case iDef@XEND() =>
      headers += iDef.header
      stream.println(s"_xend();")
    case iDef@MM_SHA1NEXTE_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sha1nexte_epu32(${quote(a)}, ${quote(b)})")
    case iDef@INVPCID(tpe, descriptor, descriptorOffset) =>
      headers += iDef.header
      stream.println(s"_invpcid(${quote(tpe)}, (void*) (${quote(descriptor)  + (if(descriptorOffset == Const(0)) "" else " + " + quote(descriptorOffset))}));")
    case iDef@TZCNT_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_tzcnt_u64(${quote(a)})")
    case iDef@ANDN_U32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_andn_u32(${quote(a)}, ${quote(b)})")
    case iDef@READFSBASE_U64() =>
      headers += iDef.header
      emitValDef(sym, s"_readfsbase_u64()")
    case iDef@BITTESTANDCOMPLEMENT64(a, b, aOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_bittestandcomplement64((__int64*) (${quote(a)  + (if(aOffset == Const(0)) "" else " + " + quote(aOffset))}), ${quote(b)})")
    case iDef@PDEP_U32(a, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_pdep_u32(${quote(a)}, ${quote(mask)})")
    case iDef@BLSR_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_blsr_u32(${quote(a)})")
    case iDef@MM_SHA256MSG1_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sha256msg1_epu32(${quote(a)}, ${quote(b)})")
    case iDef@XSAVEOPT(mem_addr, save_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xsaveopt((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(save_mask)});")
    case iDef@ADDCARRYX_U32(c_in, a, b, out, outOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_addcarryx_u32(${quote(c_in)}, ${quote(a)}, ${quote(b)}, (unsigned int *) (${quote(out)  + (if(outOffset == Const(0)) "" else " + " + quote(outOffset))}))")
    case iDef@ROTR(a, shift) =>
      headers += iDef.header
      emitValDef(sym, s"_rotr(${quote(a)}, ${quote(shift)})")
    case iDef@RDSEED64_STEP(value, valueOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_rdseed64_step((unsigned __int64 *) (${quote(value)  + (if(valueOffset == Const(0)) "" else " + " + quote(valueOffset))}))")
    case iDef@SUBBORROW_U64(b_in, a, b, out, outOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_subborrow_u64(${quote(b_in)}, ${quote(a)}, ${quote(b)}, (unsigned __int64 *) (${quote(out)  + (if(outOffset == Const(0)) "" else " + " + quote(outOffset))}))")
    case iDef@MM_MALLOC(size, align) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_malloc(${quote(size)}, ${quote(align)})")
    case iDef@MM_LOADU_SI32(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_loadu_si32((void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CLFLUSHOPT(p, pOffset) =>
      headers += iDef.header
      stream.println(s"_mm_clflushopt((void const *) (${quote(p)  + (if(pOffset == Const(0)) "" else " + " + quote(pOffset))}));")
    case iDef@XRSTORS64(mem_addr, rs_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xrstors64((const void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(rs_mask)});")
    case iDef@MM_AESENC_SI128(a, roundKey) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_aesenc_si128(${quote(a)}, ${quote(roundKey)})")
    case iDef@MM_STOREU_SI64(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_storeu_si64((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@ROTL64(a, shift) =>
      headers += iDef.header
      emitValDef(sym, s"_rotl64(${quote(a)}, ${quote(shift)})")
    case iDef@LZCNT_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_lzcnt_u64(${quote(a)})")
    case iDef@XSAVEC(mem_addr, save_mask, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_xsavec((void *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(save_mask)});")
    case iDef@BITSCANFORWARD64(index, mask, indexOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_BitScanForward64((unsigned __int32*) (${quote(index)  + (if(indexOffset == Const(0)) "" else " + " + quote(indexOffset))}), ${quote(mask)})")
    case iDef@BZHI_U64(a, index) =>
      headers += iDef.header
      emitValDef(sym, s"_bzhi_u64(${quote(a)}, ${quote(index)})")
    case iDef@MM_AESDECLAST_SI128(a, roundKey) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_aesdeclast_si128(${quote(a)}, ${quote(roundKey)})")
    case iDef@BLSMSK_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_blsmsk_u32(${quote(a)})")
    case iDef@WRITEFSBASE_U32(a) =>
      headers += iDef.header
      stream.println(s"_writefsbase_u32(${quote(a)});")
    case iDef@PEXT_U64(a, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_pext_u64(${quote(a)}, ${quote(mask)})")
    case _ => super.emitNode(sym, rhs)
  }
}
