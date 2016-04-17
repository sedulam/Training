
public class Main {

    public static void main(String[] args) {
	Animal dog = new Dog();
	Animal bird = new Bird();
	
	dog.canIfly();
	bird.canIfly();
	
	dog.setFlyCapability(new FlyYes());
	dog.canIfly();
    }

}
