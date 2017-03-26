class Animal {
    private IFly flyCapability;

    void setFlyCapability(IFly flyCapability) {
	this.flyCapability = flyCapability;
    }

    void canIFly() {
	this.flyCapability.fly();
    }
}
