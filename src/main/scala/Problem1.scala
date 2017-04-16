/**
  * Created by filipesilvestre on 4/15/17.
  */

object Problem1 {
  def sum(limit: Int): Int = {
    (1 until limit).filter(x => x % 3 == 0 || x % 5 == 0).sum
  }

  def sumRecursive(limit: Int): Int = {
    def loop(x: Int, sum: Int): Int = {
      if (x == limit) sum
      else if (x % 3 == 0 || x % 5 == 0) loop(x + 1, sum + x)
      else loop(x+1, sum)
    }
    loop(0, 0)
  }

  def main(args: Array[String]): Unit = {
    println(sum(1000))
    println(sumRecursive(1000))
  }
}
