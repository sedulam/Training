package deadlock;

public class FirstLock implements Runnable
{
	public static synchronized void firstMethod()
	{
		System.out.println("First synchronized method started");
		SecondLock.secondMethod();
		System.out.println("The SecondLock.secondMethod() invocation from the FirstLock finished!");
	}

	@Override
	public void run()
	{
		firstMethod();
	}
}
