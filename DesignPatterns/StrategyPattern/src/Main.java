class Main {

    public static void main(String[] args) {
	Animal dog = new Dog();
	Animal bird = new Bird();
	
	dog.canIFly();
	bird.canIFly();
	
	dog.setFlyCapability(new FlyYes());
	dog.canIFly();
    }

}
