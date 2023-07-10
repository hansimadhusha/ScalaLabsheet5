object q3 {
  def main(args: Array[String]): Unit = {

    def sum(n: Int): Int = {
      if (n == 0) {
        0
      } else {
        n + sum(n - 1)
      }
    }

    val result = sum(5)
    println("Sum of numbers upto 5 : " + result)

  }
}