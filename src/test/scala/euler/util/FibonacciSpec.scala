package euler.util

import org.scalatest._
import Fibonacci._

class FibonacciSpec extends FlatSpec with Matchers {
  "first fibonacci number" should "is 1" in {
    fibonacci(1) should be (1)
  }

  "second fibonacci number" should "is 2" in {
    fibonacci(2) should be (2)
  }

  "third fibonacci number" should "is 3" in {
    fibonacci(3) should be (3)
  }

  "fourth fibonacci number" should "is 5" in {
    fibonacci(4) should be (5)
  }

  "fifth fibonacci number" should "is 8" in {
    fibonacci(5) should be (8)
  }

  "sixth fibonacci number" should "is 13" in {
    fibonacci(6) should be (13)
  }

  "seventh fibonacci number" should "is 21" in {
    fibonacci(7) should be (21)
  }

  "eighth fibonacci number" should "is 34" in {
    fibonacci(8) should be (34)
  }

  "nineth fibonacci number" should "is 55" in {
    fibonacci(9) should be (55)
  }

  "tenth fibonacci number" should "is 89" in {
    fibonacci(10) should be (89)
  }
}
