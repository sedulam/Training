package sdp.designPatterns

object Builder extends App {
  
  abstract class AbstractBuilder {
    def buildDoors = {}
    def buildChassis = {}
    def buildPassengerArea = {}
    def buildReinforcedStorage = {}
  }
  
  object SportsCarBuilder extends AbstractBuilder {
    override def buildDoors = println("Building classy door")
    override def buildChassis = println("Building classy chassis")
    override def buildPassengerArea = println("Building passsenger area")
  }
  
  object VanBuilder extends AbstractBuilder {
    override def buildDoors = println("Building practical door")
    override def buildChassis = println("Building practical chassis")
    override def buildReinforcedStorage = println("Building reinforced storage")
  }
  
  abstract class AbstractDirector {
    def buildCar(builder: AbstractBuilder)
  }
  
  object SportsCarDirector extends AbstractDirector {
    def buildCar(builder: AbstractBuilder) = {
      builder.buildDoors
      builder.buildChassis
      builder.buildPassengerArea
    }
  }
  
  object VanDirector extends AbstractDirector {
    def buildCar(builder: AbstractBuilder) = {
      builder.buildDoors
      builder.buildChassis
      builder.buildReinforcedStorage
    }
  }
  
  // Build sports car
  SportsCarDirector.buildCar(SportsCarBuilder)
  println("SPORTS CAR BUILT\n")
  
  // Build van
  VanDirector.buildCar(VanBuilder)
  println("VAN BUILT\n")
}