object q5 {
  def main(args: Array[String]): Unit = {
    def sumEven(n: Int): Int = {
      if (n == 0) {
        0
      }
      else {
        val currentSum = if (n % 2 == 0){
          n
        }
        else {
          0
        }
        currentSum + sumEven(n - 1)
      }
    }

    val result = sumEven(10)
    println("sum of even numbers upto 10 : "+ result)

  }
}