package sdp.designPatterns.structural

/**
 * Decouple an abstraction from its implementation so each other
 * may vary independently.
 */
object Bridge extends App {
  
  abstract class AbstractDriverControls(engine: Engine) {
    
    def ignitionOn = {
      engine.start
    }
  }

  class StandardControls(engine: Engine) extends AbstractDriverControls(engine) {}
  
  class SportControls(engine: Engine) extends AbstractDriverControls(engine) {
    override def ignitionOn = {
      engine.start
      engine.makeNoise
    }
  }
  
  trait Engine {
    def start
    def makeNoise
  }
  
  abstract class AbstractEngine extends Engine{
    def start = println("Turning on the ignition")
    def makeNoise = println("brrrr brrrr")
  }
  
  class StandardEngine extends AbstractEngine {}
  
  class SportsEngine extends AbstractEngine {
    override def makeNoise = println("VROOOM VROOOM")
  }
}