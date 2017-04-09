package euler

object Solutions {

  /**
   * If we list all the natural numbers below 10 that are multiples of 3 or 5,
   * we get 3, 5, 6 and 9. The sum of these multiples is 23.
   *
   * Find the sum of all the multiples of 3 or 5 below 1000.
   */
  def multiplesOfThreeAndFive(n: Int): Int = {
    (1 to n - 1).filter(n => n % 3 == 0 || n % 5 == 0).sum
  }

  /**
   * Each new term in the Fibonacci sequence is generated by adding the previous
   * two terms. By starting with 1 and 2, the first 10 terms will be:
   *
   *   1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
   *
   * By considering the terms in the Fibonacci sequence whose values do not
   * exceed four million, find the sum of the even-valued terms.
   */
  def evenFibonacciNumbers(n: Int): Int = {
    import euler.util.Fibonacci._
    import euler.util.OddEven.ops._

    val FOUR_MILLION = 4000000

    fibonacci.takeWhile(_ < FOUR_MILLION).filter(_.even).sum
  }

  /**
   * The prime factors of 13195 are 5, 7, 13 and 29.
   *
   * What is the largest prime factor of the number 600851475143 ?
   */
  def largestPrimeFactor(n: Long): Option[Long] = {
    import euler.util.Primes

    Primes.primeFactors(n).reduceOption(_ max _)
  }

  /**
   * A palindromic number reads the same both ways. The largest palindrome made
   * from the product of two 2-digit numbers is 9009 = 91 × 99.
   *
   * Find the largest palindrome made from the product of two 3-digit numbers.
   */
  def largestPalindromeProduct(digits: Int): Option[Int] = {
    import scala.math.pow

    def limit(n: Int): Int = pow(10, n).intValue

    def isPalindrome(n: Int): Boolean = n.toString == n.toString.reverse

    val min = limit(digits - 1)
    val max = limit(digits)
    val iterator = (min to max).reverse

    iterator.flatMap(num => {
      iterator.map(_ * num).filter(isPalindrome).reduceOption(_ max _)
    }).reduceOption(_ max _)
  }
}
