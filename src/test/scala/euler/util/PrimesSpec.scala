package euler.util

import org.scalatest._
import Primes._

class PrimesSpec extends FlatSpec with Matchers {

  "primeFactors" should "find the prime factors for the number 9" in {
    Primes.primeFactors(9) should be (Vector(3))
  }

  "primeFactors" should "find the prime factors for the number 10" in {
    Primes.primeFactors(10) should be (Vector(2, 5))
  }

  "primeFactors" should "find the prime factors for the number 83" in {
    Primes.primeFactors(83) should be (Vector())
  }

  "primeFactors" should "find the prime factors for the number 13195" in {
    Primes.primeFactors(13195) should be (Vector(5, 7, 13, 29))
  }
}
