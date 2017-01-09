package euler.util

import org.scalatest._
import oddeven._

class oddevenSpec extends FlatSpec with Matchers {

  "odd" should "detect odd numbers" in {
    odd(0) should be (false)
    odd(1) should be (true)
    odd(2) should be (false)
    odd(3) should be (true)
    odd(4) should be (false)
    odd(5) should be (true)
  }

  "even" should "detect even numbers" in {
    even(0) should be (true)
    even(1) should be (false)
    even(2) should be (true)
    even(3) should be (false)
    even(4) should be (true)
    even(5) should be (false)
  }
}
