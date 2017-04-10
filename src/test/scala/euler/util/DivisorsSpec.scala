package euler.util

import org.scalatest._
import Divisors.ops._

class DivisorsSpec extends FlatSpec with Matchers {

  "divisors" should "return list of divisors for number" in {
    0.divisors should be (List())
    1.divisors should be (List())
    2.divisors should be (List())
    3.divisors should be (List())
    4.divisors should be (List(2))
    5.divisors should be (List())
    9.divisors should be (List(3))
    14.divisors should be (List(2, 7))
    42.divisors should be (List(2, 3, 6, 7, 14, 21))
    675.divisors should be (List(3, 5, 9, 15, 25, 27, 45, 75, 135, 225))
    435663.divisors should be (List(3, 9, 48407, 145221))
  }
}

