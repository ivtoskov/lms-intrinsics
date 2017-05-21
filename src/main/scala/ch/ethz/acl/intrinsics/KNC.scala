package ch.ethz.acl.intrinsics

trait KNC extends IntrinsicsBase with KNC00 with KNC01 with AVX512_KNC

trait CGenKNC extends CGenIntrinsics with CGenKNC00 with CGenKNC01 with CGenAVX512_KNC {
  val IR: KNC
}

