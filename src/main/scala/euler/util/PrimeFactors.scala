package euler.util

import simulacrum._
import IsPrime.ops._
import Divisors.ops._

@typeclass trait PrimeFactors[A] {

  def primeFactors(n: A): Vector[Int]
}

object PrimeFactors {

  implicit val intPrimeFactors: PrimeFactors[Int] = from(_.toLong)
  implicit val longPrimeFactors: PrimeFactors[Long] = from(i => i)

  private def from[A](toLong: A => Long): PrimeFactors[A] = new PrimeFactors[A] {
    def primeFactors(n: A): Vector[Int] = primeFactorsImpl(toLong(n))
  }

  private def primeFactorsImpl(n: Long): Vector[Int] = n.divisors.filter(x => n % x == 0 && x.isPrime)
}