package euler.util

import simulacrum._
import OddEven.ops._
import Divisors.ops._

@typeclass trait IsPrime[A] {

  def isPrime(n: A): Boolean
}

object IsPrime {

  implicit val intPrimes: IsPrime[Int] = from(_.toLong)
  implicit val longPrimes: IsPrime[Long] = from(i => i)

  private def from[A](toLong: A => Long): IsPrime[A] = new IsPrime[A] {
    def isPrime(n: A): Boolean = isPrimeImpl(toLong(n))
  }

  private def isPrimeImpl(n: Long): Boolean = n > 1 && (n == 2 || n.odd) && n.divisors.length == 0
}
