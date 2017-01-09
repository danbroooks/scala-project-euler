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

  "evenFibonacciNumbers" should "return the sum of all prime fib numbers up to four million" in {
    evenFibonacciNumbers(4000000) should be (4613732)
  }

  "largestPrimeFactor" should "find the largest prime factor for the number 13195" in {
    largestPrimeFactor(13195).shouldEqual(Some(29))
  }

  "largestPrimeFactor" should "find the largest prime factor for the number 600851475143" in {
    largestPrimeFactor(600851475143L).shouldEqual(Some(6857))
  }
}
