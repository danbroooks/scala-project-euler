package euler.util

import oddeven.odd

object Primes {
  def primeFactors(n: Long): List[Long] = divisors(n).filter(x => n % x == 0 && isPrime(x))

  private def isPrime(n: Long): Boolean = n > 1 && (n == 2 || odd(n)) && divisors(n).length == 0

  private def divisors(n: Long): List[Long] = {
    def >>(i: Long, acc: List[Long] = List()): List[Long] = {
      if (i > n / i) acc
      else if (n % i == 0) >> (i + 1, i :: acc)
      else >> (i + 1, acc)
    }

    val d = >> (2)

    (d ++ d.reverse.map(n / _)).distinct.sorted
  }
}
