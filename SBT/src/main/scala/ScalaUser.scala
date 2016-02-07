package scala

class ScalaUser(val name: String, val surname: String, val email: String) {
  def getUserData(): Unit = {
    println(f"Name: $name\nSurname: $surname\nEmail: $email")
  }
}