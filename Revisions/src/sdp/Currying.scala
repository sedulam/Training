

package sdp

object Currying extends App {
  def SumResults(f: Int => Int)(a: Int, b: Int): Int = f(a) + f(b)
  val storeF: (Int, Int) => Int = SumResults(x => x * x)
  print(storeF(2, 3))
}