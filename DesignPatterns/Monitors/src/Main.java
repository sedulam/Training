class Main
{

	public static void main(String[] args)
	{
		MyMonitor monitor = new MyMonitor();
		Thread t1 = new Thread(new RunM1(monitor));
		Thread t2 = new Thread(new RunM2(monitor));
		t1.start();
		t2.start();
	}

}
