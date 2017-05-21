package ch.ethz.acl.intrinsics

trait SVML extends IntrinsicsBase with SVML00 with SVML01 with SVML02

trait CGenSVML extends CGenIntrinsics with CGenSVML00 with CGenSVML01 with CGenSVML02 {
  val IR: SVML
}

