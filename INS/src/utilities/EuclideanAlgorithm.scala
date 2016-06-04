package utilities

object EuclideanAlgorithm extends App {

  var a = 1440
  var b = 11
  var r = -1

  while (r != 0) {
    println("Iterating with:\na = " + a + "\nb = " + b + "\n")
    r = a % b
    if(r != 0){
      a = b
      b = r
    }
  }
  println("GCD = " + b)
}