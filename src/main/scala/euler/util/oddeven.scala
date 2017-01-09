package euler.util

import spire.math.Integral
import spire.implicits._

object oddeven {
  def odd[A : Integral](n: A): Boolean = n % 2 != 0

  def even[A : Integral](n: A): Boolean = n % 2 == 0
}
