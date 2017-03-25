package DesignPatterns.Monitors;

class RunM1 implements Runnable
{
	private final MyMonitor monitor;
	
	RunM1(MyMonitor monitor)
	{
		super();
		this.monitor = monitor;
	}

	@Override
	public void run()
	{
		this.monitor.m1();
	}

}
