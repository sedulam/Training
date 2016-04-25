package utilities

object EuclideanAlgorithm extends App {

  var a = 1477
  var b = 721
  var r = -1

  while (r != 0) {
    println("Iterating with:\na = " + a + "\nb = " + b)
    r = a % b
    if(r != 0){
      a = b
      b = r
    }
  }
  println("GCD = " + b)
}