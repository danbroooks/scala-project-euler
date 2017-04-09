package euler.util

import org.scalatest._
import OddEven.ops._

class OddEvenSpec extends FlatSpec with Matchers {

  "odd" should "detect odd numbers" in {
    0.odd should be (false)
    1.odd should be (true)
    2.odd should be (false)
    3.odd should be (true)
    4.odd should be (false)
    5.odd should be (true)
  }

  "even" should "detect even numbers" in {
    0.even should be (true)
    1.even should be (false)
    2.even should be (true)
    3.even should be (false)
    4.even should be (true)
    5.even should be (false)
  }
}
