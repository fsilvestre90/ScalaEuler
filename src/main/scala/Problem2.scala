/**
  * Number utitilies
  * repr gives context to the method. We want to make sure it knows
  * the context of which type it's going to use & required
  */
class NumberUtilities [T] (implicit repr: Integral[T]) {
  import repr._
  private val One = repr.fromInt(1)
  val fibonacci: Stream[T] = One #:: fibonacci.scanLeft(One)(_ + _) // apply the fib function to x + the previous #
}

object Problem2 {
  private val ints = new NumberUtilities[Int]

  def isEven(i: Int): Boolean = i % 2 == 0

  def fib(limit: Int): Int = {
    ints.fibonacci.takeWhile(_ < limit).filter(isEven).sum
  }

  def main(args: Array[String]): Unit = {
    println(fib(4000000))
  }
}
