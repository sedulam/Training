package sdp.designPatterns.creational

object FactoryMethod extends App {

  trait Animal
  private class Dog extends Animal
  private class Cat extends Animal

  object Animal {
    def apply(kind: String) = kind match {
      case "dog" => {
        println("Building dog...")
        new Dog()
      }
      case "cat" => {
        println("Building cat...")
        new Cat()
      }
      case _ => println(kind + " is not a valid animal")
    }
  }

  Animal("dog")
  Animal("cat")
  Animal("gnome")
}