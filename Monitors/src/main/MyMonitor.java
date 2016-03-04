package main;

public class MyMonitor
{
	private int max = 100000;
	
	public synchronized void m1()
	{
		for (int i = 0; i < max; i++)
		{
			System.out.println("m1 is running: Execution nmr: " + i);
		}
	}

	public synchronized void m2()
	{
		for (int i = 0; i < max; i++)
		{
			System.out.println("m2 is running: Execution nmr: " + i);
		}
	}
}
