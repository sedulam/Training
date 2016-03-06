package deadlock;

public class SecondLock implements Runnable
{
	public static synchronized void secondMethod()
	{
		System.out.println("Second synchronized method started");
		FirstLock.firstMethod();
	}

	@Override
	public void run()
	{
		secondMethod();
	}
}
