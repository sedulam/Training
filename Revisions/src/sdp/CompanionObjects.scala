package sdp

/**
 * The Foo object can access the private constructor of Foo().
 * However, the non-companion object can't (uncomment line to verify).
 * This proves that companion objects can access private methods and constructors.
 */
class Foo(i: Int) {
  private def this() {
    this(0)
  }
}

object Foo {
  def apply() = new Foo()
  def apply(i: Int) = new Foo(i)
}

object AnotherFoo {
//  def apply() = new Foo()
}
