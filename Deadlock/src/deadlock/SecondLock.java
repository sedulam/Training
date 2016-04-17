package deadlock;

public class SecondLock implements Runnable
{
	public static synchronized void secondMethod()
	{
		System.out.println("Second synchronized method started"); //$NON-NLS-1$
		FirstLock.firstMethod();
		System.out.println("The FirstLock.firstMethod() invocation from the SecondLock finished!"); //$NON-NLS-1$
	}

	@Override
	public void run()
	{
		secondMethod();
	}
}
