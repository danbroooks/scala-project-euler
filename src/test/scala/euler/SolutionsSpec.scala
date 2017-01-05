package euler

import org.scalatest._
import Solutions._

class SolutionsSpec extends FlatSpec with Matchers {

  "multiplesOfThreeAndFive" should "return the sum of numbers divisable by three and five less than 10" in {
    multiplesOfThreeAndFive(10) should be (23)
  }

  "multiplesOfThreeAndFive" should "return the sum of numbers divisable by three and five less than 1000" in {
    multiplesOfThreeAndFive(1000) should be (233168)
  }

  "evenFibonacciNumbers" should "detect multiples of three and five" in {
    evenFibonacciNumbers(4000000) should be (4613732)
  }
}
