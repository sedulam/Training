

package sdp.designPatterns

object AbstractFactory extends App {

  trait Button {
    def paint
  }

  class WinButton extends Button {
    def paint = println("I'm a WinButton")
  }

  class OSXButton extends Button {
    def paint = println("I'm a OSXButton")
  }

  trait GUIFactory {
    def buildButton: Button
  }

  object WinFactory extends GUIFactory {
    def buildButton: Button = new WinButton
  }

  object OSXFactory extends GUIFactory {
    def buildButton: Button = new OSXButton
  }
  
  val winButton = WinFactory.buildButton
  winButton.paint
  
  val osxButton = OSXFactory.buildButton
  osxButton.paint
}