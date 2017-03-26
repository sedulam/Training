class Main
{

	public static void main(String[] args)
	{
		FirstLock firstLock = new FirstLock();
		SecondLock secondLock = new SecondLock();
		Thread t1 = new Thread(firstLock);
		Thread t2 = new Thread(secondLock);
		t1.start();
		t2.start();
	}

}
