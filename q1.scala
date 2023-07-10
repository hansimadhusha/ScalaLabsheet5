object q1 {
  def main(args: Array[String]): Unit = {
    def prime(n: Int): Boolean = {
      def isPrimeHelper(n: Int, m: Int = 2): Boolean = n match {
        case x if n <= 1 => false
        case x if n == 2 => true
        case x if n % m == 0 => false
        case x if m * m > n => true
        case _ => isPrimeHelper(n, m + 1)
      }
      isPrimeHelper(n)
    }


    println(prime(5))
    println(prime(8))
  }
}
