package euler.util

import simulacrum._

@typeclass trait OddEven[A] { self =>

  def odd(n: A): Boolean

  def even(n: A): Boolean
}

object OddEven {

  implicit val intOddEven: OddEven[Int] = OddEven.from(_ % 2 == 0)
  implicit val longOddEven: OddEven[Long] = OddEven.from(_ % 2 == 0)

  private def from[A](f: A => Boolean): OddEven[A] = new OddEven[A] {

    def even(a: A): Boolean = f(a)

    def odd(a: A): Boolean = !even(a)
  }
}
