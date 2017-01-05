package euler.util

import org.scalatest._
import Fibonacci._

class FibonacciSpec extends FlatSpec with Matchers {

  "first fibonacci number" should "be 0" in {
    fibonacci(0) should be (0)
  }

  "second fibonacci number" should "be 1" in {
    fibonacci(1) should be (1)
  }

  "third fibonacci number" should "be 1" in {
    fibonacci(2) should be (1)
  }

  "fourth fibonacci number" should "be 2" in {
    fibonacci(3) should be (2)
  }

  "fifth fibonacci number" should "be 3" in {
    fibonacci(4) should be (3)
  }

  "sixth fibonacci number" should "be 5" in {
    fibonacci(5) should be (5)
  }

  "seventh fibonacci number" should "be 8" in {
    fibonacci(6) should be (8)
  }

  "eighth fibonacci number" should "be 13" in {
    fibonacci(7) should be (13)
  }

  "nineth fibonacci number" should "be 21" in {
    fibonacci(8) should be (21)
  }

  "tenth fibonacci number" should "be 34" in {
    fibonacci(9) should be (34)
  }

  "eleventh fibonacci number" should "be 55" in {
    fibonacci(10) should be (55)
  }

  "twelth fibonacci number" should "be 89" in {
    fibonacci(11) should be (89)
  }
}
