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
