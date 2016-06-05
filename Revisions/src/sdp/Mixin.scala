package sdp

object Mixin extends App {

  class MixinTrait extends MixinAbstractClass{
    def traitPrint = println("I'm the trait")
  }

  abstract class MixinAbstractClass {
    def abstractPrint = println("I'm the abstract classs")
  }

  class MixinImplementation extends MixinTrait {}

  val obj = new MixinImplementation()
  obj.traitPrint
  obj.abstractPrint
}
