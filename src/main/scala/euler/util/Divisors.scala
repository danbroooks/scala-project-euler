package euler.util

import simulacrum._

@typeclass trait Divisors[A] { self =>

  def divisors(n: A): List[Int]
}

object Divisors {

  implicit val intDivisors: Divisors[Int] = from(_.toLong)
  implicit val longDivisors: Divisors[Long] = from(i => i)

  private def from[A](toLong: A => Long) = new Divisors[A] {
    def divisors(n: A): List[Int] = {
      val nLong = toLong(n)
      val d = Stream.from(2)
        .takeWhile((i: Int) => (nLong / i) >= i)
        .filter(nLong % _ == 0)
        .toList

      (d ++ d.reverse.map(nLong / _).map(_.toInt)).distinct.sorted
    }
  }
}
