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

trait AVX512 extends IntrinsicsBase with AVX51200 with AVX51201 with AVX51202 with AVX51203 with AVX51204 with AVX51205 with AVX51206 with AVX51207 with AVX51208 with AVX51209 with AVX512010 with AVX512011 with AVX512012 with AVX512013 with AVX512014 with AVX512015 with AVX512016 with AVX512017 with AVX512018 with AVX512019 with AVX512020 with AVX512_KNC

trait CGenAVX512 extends CGenIntrinsics with CGenAVX51200 with CGenAVX51201 with CGenAVX51202 with CGenAVX51203 with CGenAVX51204 with CGenAVX51205 with CGenAVX51206 with CGenAVX51207 with CGenAVX51208 with CGenAVX51209 with CGenAVX512010 with CGenAVX512011 with CGenAVX512012 with CGenAVX512013 with CGenAVX512014 with CGenAVX512015 with CGenAVX512016 with CGenAVX512017 with CGenAVX512018 with CGenAVX512019 with CGenAVX512020 with CGenAVX512_KNC {
  val IR: AVX512
}

