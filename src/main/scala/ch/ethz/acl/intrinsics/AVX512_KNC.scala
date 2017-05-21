package ch.ethz.acl.intrinsics

trait AVX512_KNC extends IntrinsicsBase with AVX512_KNC00 with AVX512_KNC01

trait CGenAVX512_KNC extends CGenIntrinsics with CGenAVX512_KNC00 with CGenAVX512_KNC01 {
  val IR: AVX512_KNC
}

