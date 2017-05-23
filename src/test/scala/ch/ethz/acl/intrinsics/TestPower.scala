package ch.ethz.acl.intrinsics

import org.scalatest.FunSpec

class TestPower extends FunSpec {

  describe("Test power") {
    val powerIr = new PowerIr
    println(powerIr.code)
  }


}


class PowerIr extends TestIr with AVX with AVX2 { q =>

  case class Address[T:Typ](of: Exp[T]) extends Def[Array[T]]

  def addressOf[T:Typ](of: Exp[T]) = {
    Address[T](of)
  }

  def initBits(bits: Exp[Array[Long]]) = {
    var i = 0
    while (i < 32) {
      array_update[Long](bits, i, 1L << i)
      i = i + 1
    }
  }

  def power(x: Rep[Double], n_int: Rep[Int]) = {
    // Init
    val result = rep_asinstanceof(Const(1), typ[Int], typ[Double])
    val resAdr = addressOf(result)
    val bitz = NewArray[Long](32)
    initBits(bitz)
    val bits = rep_asinstanceof(bitz, typ[Array[Long]], typ[Array[Double]])

    val bt1 = _mm256_loadu_pd(bits, 0)
    val bt2 = _mm256_loadu_pd(bits, 4)
    val bt3 = _mm256_loadu_pd(bits, 8)
    val bt4 = _mm256_loadu_pd(bits, 12)
    val bt5 = _mm256_loadu_pd(bits, 16)
    val bt6 = _mm256_loadu_pd(bits, 20)
    val bt7 = _mm256_loadu_pd(bits, 24)
    val bt8 = _mm256_loadu_pd(bits, 28)

    val bones = _mm256_broadcast_sd(resAdr, 0)

    // Actual
    val b = NewArray[Double](4)
    array_update[Double](b, 0, x)
    array_update[Double](b, 1, x * x)
    array_update[Double](b, 2, array_apply(b, 1) * array_apply(b, 1))
    array_update[Double](b, 3, array_apply(b, 2) * array_apply(b, 2))

    val nIntAdr = addressOf(n_int)
    val nIntAdrDbl = rep_asinstanceof(nIntAdr, typ[Array[Int]], typ[Array[Double]])
    val bn = _mm256_broadcast_sd(nIntAdrDbl, 0)

    val band1 = _mm256_and_pd(bn, bt1)
    val band2 = _mm256_and_pd(bn, bt2)
    val band3 = _mm256_and_pd(bn, bt3)
    val band4 = _mm256_and_pd(bn, bt4)
    val band5 = _mm256_and_pd(bn, bt5)
    val band6 = _mm256_and_pd(bn, bt6)
    val band7 = _mm256_and_pd(bn, bt7)
    val band8 = _mm256_and_pd(bn, bt8)

    val beq1NonCasted = _mm256_cmpeq_epi64(
      rep_asinstanceof(band1, typ[__m256d], typ[__m256i]),
      rep_asinstanceof(bt1, typ[__m256d], typ[__m256i])
    )
    val beq1 = rep_asinstanceof(beq1NonCasted, typ[__m256i], typ[__m256d])

    val beq2NonCasted = _mm256_cmpeq_epi64(
      rep_asinstanceof(band2, typ[__m256d], typ[__m256i]),
      rep_asinstanceof(bt2, typ[__m256d], typ[__m256i])
    )
    val beq2 = rep_asinstanceof(beq2NonCasted, typ[__m256i], typ[__m256d])

    val beq3NonCasted = _mm256_cmpeq_epi64(
      rep_asinstanceof(band3, typ[__m256d], typ[__m256i]),
      rep_asinstanceof(bt3, typ[__m256d], typ[__m256i])
    )
    val beq3 = rep_asinstanceof(beq3NonCasted, typ[__m256i], typ[__m256d])

    val beq4NonCasted = _mm256_cmpeq_epi64(
      rep_asinstanceof(band4, typ[__m256d], typ[__m256i]),
      rep_asinstanceof(bt4, typ[__m256d], typ[__m256i])
    )
    val beq4 = rep_asinstanceof(beq4NonCasted, typ[__m256i], typ[__m256d])

    val beq5NonCasted = _mm256_cmpeq_epi64(
      rep_asinstanceof(band5, typ[__m256d], typ[__m256i]),
      rep_asinstanceof(bt5, typ[__m256d], typ[__m256i])
    )
    val beq5 = rep_asinstanceof(beq5NonCasted, typ[__m256i], typ[__m256d])

    val beq6NonCasted = _mm256_cmpeq_epi64(
      rep_asinstanceof(band6, typ[__m256d], typ[__m256i]),
      rep_asinstanceof(bt6, typ[__m256d], typ[__m256i])
    )
    val beq6 = rep_asinstanceof(beq6NonCasted, typ[__m256i], typ[__m256d])

    val beq7NonCasted = _mm256_cmpeq_epi64(
      rep_asinstanceof(band7, typ[__m256d], typ[__m256i]),
      rep_asinstanceof(bt7, typ[__m256d], typ[__m256i])
    )
    val beq7 = rep_asinstanceof(beq7NonCasted, typ[__m256i], typ[__m256d])

    val beq8NonCasted = _mm256_cmpeq_epi64(
      rep_asinstanceof(band8, typ[__m256d], typ[__m256i]),
      rep_asinstanceof(bt8, typ[__m256d], typ[__m256i])
    )
    val beq8 = rep_asinstanceof(beq8NonCasted, typ[__m256i], typ[__m256d])

    val bones11 = _mm256_and_pd(bones, beq1)
    val bones22 = _mm256_and_pd(bones, beq2)
    val bones33 = _mm256_and_pd(bones, beq3)
    val bones44 = _mm256_and_pd(bones, beq4)
    val bones55 = _mm256_and_pd(bones, beq5)
    val bones66 = _mm256_and_pd(bones, beq6)
    val bones77 = _mm256_and_pd(bones, beq7)
    val bones88 = _mm256_and_pd(bones, beq8)

    val bones1 = _mm256_sub_pd(bones, bones11)
    val bones2 = _mm256_sub_pd(bones, bones22)
    val bones3 = _mm256_sub_pd(bones, bones33)
    val bones4 = _mm256_sub_pd(bones, bones44)
    val bones5 = _mm256_sub_pd(bones, bones55)
    val bones6 = _mm256_sub_pd(bones, bones66)
    val bones7 = _mm256_sub_pd(bones, bones77)
    val bones8 = _mm256_sub_pd(bones, bones88)

    // Perform calculation
    val r11 = _mm256_loadu_pd(b, 0)

    val b21 = _mm256_mul_pd(r11, r11)
    val b41 = _mm256_mul_pd(b21, b21)
    val b81 = _mm256_mul_pd(b41, b41)
    val r21 = _mm256_mul_pd(b81, b81)

    val b22 = _mm256_mul_pd(r21, r21)
    val b42 = _mm256_mul_pd(b22, b22)
    val b82 = _mm256_mul_pd(b42, b42)
    val r31 = _mm256_mul_pd(b82, b82)

    val b23 = _mm256_mul_pd(r31, r31)
    val b43 = _mm256_mul_pd(b23, b23)
    val b83 = _mm256_mul_pd(b43, b43)
    val r41 = _mm256_mul_pd(b83, b83)

    val b24 = _mm256_mul_pd(r41, r41)
    val b44 = _mm256_mul_pd(b24, b24)
    val b84 = _mm256_mul_pd(b44, b44)
    val r51 = _mm256_mul_pd(b84, b84)

    val b25 = _mm256_mul_pd(r51, r51)
    val b45 = _mm256_mul_pd(b25, b25)
    val b85 = _mm256_mul_pd(b45, b45)
    val r61 = _mm256_mul_pd(b85, b85)

    val b26 = _mm256_mul_pd(r61, r61)
    val b46 = _mm256_mul_pd(b26, b26)
    val b86 = _mm256_mul_pd(b46, b46)
    val r71 = _mm256_mul_pd(b86, b86)

    val b27 = _mm256_mul_pd(r71, r71)
    val b47 = _mm256_mul_pd(b27, b27)
    val b87 = _mm256_mul_pd(b47, b47)
    val r81 = _mm256_mul_pd(b87, b87)

    // Skip the bits
    val r12 = _mm256_and_pd(r11, beq1)
    val r22 = _mm256_and_pd(r21, beq2)
    val r32 = _mm256_and_pd(r31, beq3)
    val r42 = _mm256_and_pd(r41, beq4)
    val r52 = _mm256_and_pd(r51, beq5)
    val r62 = _mm256_and_pd(r61, beq6)
    val r72 = _mm256_and_pd(r71, beq7)
    val r82 = _mm256_and_pd(r81, beq8)

    val r1 = _mm256_add_pd(r12, bones1)
    val r2 = _mm256_add_pd(r22, bones2)
    val r3 = _mm256_add_pd(r32, bones3)
    val r4 = _mm256_add_pd(r42, bones4)
    val r5 = _mm256_add_pd(r52, bones5)
    val r6 = _mm256_add_pd(r62, bones6)
    val r7 = _mm256_add_pd(r72, bones7)
    val r8 = _mm256_add_pd(r82, bones8)

    val rr1 = _mm256_mul_pd(r1, r2)
    val rr2 = _mm256_mul_pd(r3, r4)
    val rr3 = _mm256_mul_pd(r5, r6)
    val rr4 = _mm256_mul_pd(r7, r8)

    val pr1   = _mm256_mul_pd(rr1, rr2)
    val pr2   = _mm256_mul_pd(rr3, rr4)
    val finalRes = _mm256_mul_pd(pr1, pr2)
    _mm256_store_pd(b, finalRes, 0)

    array_apply(b, 0) * array_apply(b, 1) * array_apply(b, 2) * array_apply(b, 3)
  }

  val codegen = new BaseTestCgen with CGenAVX with CGenAVX2 {
    override val IR: q.type = q

    override def emitNode(sym: Sym[Any], rhs: Def[Any]) = {
      rhs match {
        case Address(of) => stream.println(s"${remap(sym.tp)} ${quote(sym)} = &${quote(of)};")
        case _ => super.emitNode(sym, rhs)
      }
    }
  }

  lazy val code: String = {
    val x = fresh[Double]
    val exp = fresh[Int]
    val source = new java.io.StringWriter()

    val block = reifyEffects {power(x, exp)}

    val inputs = List(x, exp)
    codegen.emitSource(inputs, block, "power", new java.io.PrintWriter(source))

    source.toString
  }

}
