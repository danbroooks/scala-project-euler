package euler.util

import OddEven.ops._

object Primes {
  def primeFactors(n: Long): List[Int] = divisors(n).filter(x => n % x == 0 && isPrime(x))

  private def isPrime(n: Long): Boolean = n > 1 && (n == 2 || n.odd) && divisors(n).length == 0

  private def divisors(n: Long): List[Int] = {
    val d = Stream.from(2)
      .map(_.toInt)
      .takeWhile((i: Int) => i <= (n / i))
      .filter(n % _ == 0)
      .toList

    (d ++ d.reverse.map(n / _).map(_.toInt)).distinct.sorted
  }
}
