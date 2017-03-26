class RunM2 implements Runnable
{
	private final MyMonitor monitor;

	RunM2(MyMonitor monitor)
	{
		super();
		this.monitor = monitor;
	}

	@Override
	public void run()
	{
		this.monitor.m2();
	}

}
