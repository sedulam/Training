

package sdp

object PartiallyAppliedFunctions extends App {
  def sum(x: Int, y: Int) = x + y
  val saveSum = sum(2, _: Int)
  saveSum(3)
}