package ch.ethz.acl.intrinsics

import org.scalatest.FunSpec

class TestIntrinsicsGeneration extends FunSpec {

  describe("Generate intrinsics") {
    val zgen = new ch.ethz.acl.intrinsics.IntrinsicsGenerator
    zgen.generate()
  }

  describe("Vector product with intrinsics test") {
    val vpir = new VectorProductIr()
    println(vpir.code)
  }
}

class VectorProductIr extends SSE2 with TestIr with IntrinsicsArrays { q =>

  def vecProdIntrinsics(
                         arr1:   Rep[Array[Double]],
                         arr2:   Rep[Array[Double]],
                         result: Rep[Array[Double]],
                         size:   Rep[Int]) = {

    for (i <- infix_until(0, size)) {
      val v1 = _mm_loadu_pd(arr1, i)
      val v2 = _mm_loadu_pd(arr2, i)
      val res = _mm_mul_pd(v1, v2)
      _mm_storeu_pd(result, res, i)
    }
  }

  val codegen = new BaseTestCgen with CGenSSE2 {
    override val IR: q.type = q

    override def emitNode(sym: Sym[Any], rhs: Def[Any]) = {
      rhs match {
        case RangeForeach(start, end, i, body) =>
          gen"""for(int $i = $start; $i < $end; $i = $i + 2) {
                |${nestedBlock(body)}
                |}"""
        case _ => super.emitNode(sym, rhs)
      }
    }
  }

  lazy val code: String = {
    val arr1 = fresh[Array[Double]]
    val arr2 = fresh[Array[Double]]
    val result = reflectMutableSym(fresh[Array[Double]])
    val size = fresh[Int]
    val source = new java.io.StringWriter()

    val block = reifyEffects {
      vecProdIntrinsics(arr1, arr2, result, size)
    }

    val inputs = List(arr1, arr2, result, size)
    codegen.emitSource(inputs, block, "vec_prod", new java.io.PrintWriter(source))

    source.toString
  }
}
