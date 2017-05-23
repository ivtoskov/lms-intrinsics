package ch.ethz.acl.intrinsics

import ch.ethz.acl.passera.unsigned.UByte
import org.scalatest.FunSpec

class TestQuantize extends FunSpec {

  describe("Test quantize") {
    val qir = new QuantizeIr
    println(qir.code)
  }

}

class QuantizeIr extends TestIr with AVX { q =>
  val codegen = new BaseTestCgen with CGenAVX {
    override val IR: q.type = q

    override def emitNode(sym: Sym[Any], rhs: Def[Any]) = {
      rhs match {
        case RangeForeach(start, end, i, body) =>
          gen"""for(int $i = $start; $i < $end; $i = $i + 8) {
                |${nestedBlock(body)}
                |}"""
        case _ => super.emitNode(sym, rhs)
      }
    }
  }

  def quantize_2B2R_f_AVX_staged(input: Rep[Array[Float]], output: Rep[Array[UByte]], norm: Rep[Float], size: Rep[Int]): Unit = {
    val arr_res = NewArray[UByte](32)

    val oneandhalf = _mm256_set1_ps(1.5F)
    val one = _mm256_set1_ps(1.0F)
    val four = _mm256_set1_ps(4.0F)
    val five = _mm256_set1_ps(5.0F)
    val sixteen = _mm256_set1_ps(16.0F)
    val random1 = _mm256_set1_ps(0.5F)
    val random2 = _mm256_set1_ps(0.5F)
    val rcp_norm2 = _mm256_set1_ps(norm)

    for (i <- infix_until(0, size)) {
      val element = _mm256_loadu_ps(input, i)
      val nelement = _mm256_mul_ps(element, rcp_norm2)
      val projected_value = _mm256_add_ps(nelement, oneandhalf)

      val lowerBitsL = _mm256_floor_ps(projected_value)
      val probability = _mm256_sub_ps(projected_value, lowerBitsL)
      var L = _mm256_mul_ps(lowerBitsL, five)

      val hi_cmp = _mm256_cmp_ps(probability, random1, 0x0e)
      val lo_cmp = _mm256_cmp_ps(probability, random2, 0x0e)
      val lo_mask = _mm256_and_ps(lo_cmp, one)
      val hi_mask = _mm256_and_ps(hi_cmp, four)
      val mask = _mm256_add_ps(lo_mask, hi_mask)

      L = _mm256_add_ps(mask, L)

      val hiBit = _mm256_mul_ps(L, sixteen)
      val loBit = _mm256_permute_ps(L, 245)

      L = _mm256_add_ps(hiBit, loBit)
      val intL = _mm256_cvttps_epi32(L)
      val castedArr = rep_asinstanceof(arr_res, arr_res.tp, typ[Array[__m256i]])
      _mm256_storeu_si256(castedArr, intL, 0)
      val i2 = infix_>>(i, 1)

      output(i2) = arr_res(0)
      output(infix_+(i2, 1)) = arr_res(8)
      output(infix_+(i2, 2)) = arr_res(16)
      output(infix_+(i2, 3)) = arr_res(24)
    }
  }

  lazy val code: String = {
    val arr1 = fresh[Array[Float]]
    val arr2 = reflectMutableSym(fresh[Array[UByte]])
    val norm = fresh[Float]
    val size = fresh[Int]
    val source = new java.io.StringWriter()

    val block = reifyEffects {
      quantize_2B2R_f_AVX_staged(arr1, arr2, norm, size)
    }

    val inputs = List(arr1, arr2, norm, size)
    codegen.emitSource(inputs, block, "quantize", new java.io.PrintWriter(source))

    source.toString
  }
}
