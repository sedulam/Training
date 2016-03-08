package deadlock;

public class SecondLock implements Runnable
{
	public static synchronized void secondMethod()
	{
		System.out.println("Second synchronized method started");
		FirstLock.firstMethod();
		System.out.println("The FirstLock.firstMethod() invocation from the SecondLock finished!");
	}

	@Override
	public void run()
	{
		secondMethod();
	}
}
