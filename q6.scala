object q6 {
  def main(args: Array[String]): Unit = {
    def printFibonacci(n: Int): Unit = {
      for (i <- 0 until n) {
        val fibonacciNumber = fibonacci(i)
        print(fibonacciNumber + " ")
      }
    }

    def fibonacci(n: Int): Int = {
      if (n <= 1) {
        n
      } else {
        fibonacci(n - 1) + fibonacci(n - 2) 
      }
    }

    printFibonacci(10)


  }
}
