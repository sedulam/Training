package DesignPatterns.StrategyPattern;

class Bird extends Animal {

    Bird() {
	super();
	setFlyCapability(new FlyNo());
    }

}
