package ch.ethz.acl.intrinsics

trait AVX extends IntrinsicsBase with AVX00 with AVX01

trait CGenAVX extends CGenIntrinsics with CGenAVX00 with CGenAVX01 {
  val IR: AVX
}

