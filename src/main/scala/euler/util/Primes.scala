package euler.util

import OddEven.ops._
import Divisors.ops._

object Primes {
  def primeFactors(n: Long): List[Int] = n.divisors.filter(x => n % x == 0 && isPrime(x))

  private def isPrime(n: Long): Boolean = n > 1 && (n == 2 || n.odd) && n.divisors.length == 0
}
