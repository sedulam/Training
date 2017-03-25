package DesignPatterns.StrategyPattern;

class Dog extends Animal{

    Dog() {
	super();
	setFlyCapability(new FlyYes());
    }

}
