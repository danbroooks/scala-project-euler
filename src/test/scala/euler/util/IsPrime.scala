package euler.util

import org.scalatest._
import IsPrime.ops._

class IsPrimeSpec extends FreeSpec with Matchers {

  "isPrime" - {
    "1 is not a prime number" in {
      1.isPrime should be (false)
    }

    "2 is a prime number" in {
      2.isPrime should be (true)
    }

    "3 is not a prime number" in {
      3.isPrime should be (true)
    }

    "4 is not a prime number" in {
      4.isPrime should be (false)
    }

    "5 is a prime number" in {
      5.isPrime should be (true)
    }

    "6 is not a prime number" in {
      6.isPrime should be (false)
    }

    "7 is a prime number" in {
      7.isPrime should be (true)
    }

    "9 is not a prime number" in {
      9.isPrime should be (false)
    }

    "11 is a prime number" in {
      11.isPrime should be (true)
    }

    "15 is not a prime number" in {
      15.isPrime should be (false)
    }

    "199 is a prime number" in {
      199.isPrime should be (true)
    }

    "300 is not a prime number" in {
      300.isPrime should be (false)
    }
  }
}
