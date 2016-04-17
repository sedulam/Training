package main;

public class RunM1 implements Runnable
{
	private MyMonitor monitor;
	
	public RunM1(MyMonitor monitor)
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
