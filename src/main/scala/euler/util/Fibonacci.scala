package euler.util

object Fibonacci {
  def fibonacci(n: Int): Int = fib(n)

  def fib(n: Int): Int = {
    println(n)
    if (n < 2) 1 else fib(n - 1) + fib(n - 2)
  }
}
