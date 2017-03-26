class FirstLock implements Runnable
{
	static synchronized void firstMethod()
	{
		System.out.println("First synchronized method started"); //$NON-NLS-1$
		SecondLock.secondMethod();
		System.out.println("The SecondLock.secondMethod() invocation from the FirstLock finished!"); //$NON-NLS-1$
	}

	@Override
	public void run()
	{
		firstMethod();
	}
}
