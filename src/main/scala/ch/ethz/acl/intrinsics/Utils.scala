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

object Utils {

  /**
    * Wraps a single line of text with given length
    *
    * @param str The string to be wrapped
    * @param wrapLength The length of a line of the returned string
    * @param newLineStr Newline character
    * @param wrapLongWords Indicates whether to wrap words longer than the length
    * @return The wrapped string
    */
  def wrap(str: String, wrapLength: Int, newLineStr: String = scala.util.Properties.lineSeparator, wrapLongWords: Boolean = false): String = {
    if (str == null) {
      return null
    }
    val inputLineLength = str.length()
    var offset = 0
    val wrappedLine = new StringBuilder(inputLineLength + 32)

    while (offset < inputLineLength) {
      if (str.charAt(offset) == ' ') {
        offset += 1
      } else {
        if(inputLineLength - offset <= wrapLength) {
          wrappedLine.append(str.substring(offset))

          return wrappedLine.toString()
        }
        var spaceToWrapAt = str.lastIndexOf(' ', wrapLength + offset)

        if (spaceToWrapAt >= offset) {
          wrappedLine.append(str.substring(offset, spaceToWrapAt))
          wrappedLine.append(newLineStr)
          offset = spaceToWrapAt + 1

        } else {
          if (wrapLongWords) {
            wrappedLine.append(str.substring(offset, wrapLength + offset))
            wrappedLine.append(newLineStr)
            offset += wrapLength
          } else {
            spaceToWrapAt = str.indexOf(' ', wrapLength + offset)
            if (spaceToWrapAt >= 0) {
              wrappedLine.append(str.substring(offset, spaceToWrapAt))
              wrappedLine.append(newLineStr)
              offset = spaceToWrapAt + 1
            } else {
              wrappedLine.append(str.substring(offset))
              offset = inputLineLength
            }
          }
        }
      }
    }

    wrappedLine.append(str.substring(offset))

    wrappedLine.toString()
  }
}
