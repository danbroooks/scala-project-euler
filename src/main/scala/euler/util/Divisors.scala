package euler.util

import simulacrum._

@typeclass trait Divisors[A] { self =>

  def divisors(n: A): Vector[Int]
}

object Divisors {

  implicit val intDivisors: Divisors[Int] = from(_.toLong)
  implicit val longDivisors: Divisors[Long] = from(i => i)

  private def from[A](toLong: A => Long) = new Divisors[A] {
    def divisors(n: A): Vector[Int] = {
      val nLong = toLong(n)
      val d = Stream.from(2)
        .takeWhile((i: Int) => (nLong / i) >= i)
        .filter(nLong % _ == 0)
        .toVector

      (d ++ d.reverse.map(nLong / _).map(_.toInt)).distinct.sorted
    }
  }
}
