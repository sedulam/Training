package main;

public class RunM2 implements Runnable
{
	private MyMonitor monitor;

	public RunM2(MyMonitor monitor)
	{
		super();
		this.monitor = monitor;
	}

	@Override
	public void run()
	{
		monitor.m2();
	}

}
