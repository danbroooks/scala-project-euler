package euler.util

import org.scalatest._
import PrimeFactors.ops._

class PrimeFactorsSpec extends FlatSpec with Matchers {

  "primeFactors" should "find the prime factors for the number 9" in {
    9.primeFactors should be (Vector(3))
  }

  "primeFactors" should "find the prime factors for the number 10" in {
    10.primeFactors should be (Vector(2, 5))
  }

  "primeFactors" should "find the prime factors for the number 83" in {
    83.primeFactors should be (Vector())
  }

  "primeFactors" should "find the prime factors for the number 13195" in {
    13195.primeFactors should be (Vector(5, 7, 13, 29))
  }
}
