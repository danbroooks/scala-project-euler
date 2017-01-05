package euler.util

import scala.annotation.tailrec

object Fibonacci {
  val fibonacci: Stream[Int] = 1 #:: 1 #:: fib.zip(fib.tail).map(n => n._1 + n._2)

  private val fib = fibonacci
}
