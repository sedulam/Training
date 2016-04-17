
public class Animal {
    private IFly flyCapability;

    public void setFlyCapability(IFly flyCapability) {
	this.flyCapability = flyCapability;
    }

    public void canIfly() {
	this.flyCapability.fly();
    }
}
