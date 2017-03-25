package DesignPatterns.Monitors;

class MyMonitor
{
	private final int max = 100000;
	
	synchronized void m1()
	{
		for (int i = 0; i < this.max; i++)
		{
			System.out.println("m1 is running: Execution nmr: " + i); //$NON-NLS-1$
		}
	}

	synchronized void m2()
	{
		for (int i = 0; i < this.max; i++)
		{
			System.out.println("m2 is running: Execution nmr: " + i); //$NON-NLS-1$
		}
	}
}
