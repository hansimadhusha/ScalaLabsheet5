object q2 {
  def main(args: Array[String]): Unit = {
        def primeSeq(n: Int): Unit = {
          for (i <- 2 until n) {
            if (isPrime(i)) {
              print(i + " ")
            }
          }
        }

        def isPrime(n: Int): Boolean = {
          def isPrimeHelper(n: Int, m: Int = 2): Boolean = n match {
            case x if x <= 1 => false
            case x if x == 2 => true
            case x if x % m == 0 => false
            case x if m * m > x => true
            case _ => isPrimeHelper(n, m + 1)
          }

          isPrimeHelper(n)
        }
        println("Prime number sequence upto 10 : ")
        primeSeq(10)
  }
}


