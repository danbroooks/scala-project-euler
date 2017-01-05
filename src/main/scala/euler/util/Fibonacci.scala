package euler.util

object Fibonacci {
  val fibonacci: Stream[Int] = 1 #:: 1 #:: fib.zip(fib.tail).map(n => n._1 + n._2)

  private val fib = fibonacci
}
