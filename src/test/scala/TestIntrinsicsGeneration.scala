import ch.ethz.acl.intrinsics.ZGenerator
import org.scalatest.FunSpec

class TestIntrinsicsGeneration extends FunSpec {

  describe("Generate intrinsics") {
    val zgen = new ZGenerator
    zgen.generate()
  }
}