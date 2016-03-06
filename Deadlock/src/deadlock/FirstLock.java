package deadlock;

public class FirstLock implements Runnable
{
	public static synchronized void firstMethod()
	{
		System.out.println("First synchronized method started");
		SecondLock.secondMethod();
	}

	@Override
	public void run()
	{
		firstMethod();
	}
}
