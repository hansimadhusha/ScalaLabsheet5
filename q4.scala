object q4 {
  def main(args: Array[String]): Unit = {
    def isEven(n: Int): Boolean = {
      if (n == 0) {
        true
      } else if (n == 1) {
        false
      } else {
        isEven(n - 2)
      }
    }


    println("4 is even " + isEven(4))
    println("7 is even " + isEven(7))

  }
}