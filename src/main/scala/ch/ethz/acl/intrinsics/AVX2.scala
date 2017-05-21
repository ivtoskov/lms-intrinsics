package ch.ethz.acl.intrinsics

trait AVX2 extends IntrinsicsBase with AVX200 with AVX201

trait CGenAVX2 extends CGenIntrinsics with CGenAVX200 with CGenAVX201 {
  val IR: AVX2
}

