
public class StartupInstantiation
{
	private static StartupInstantiation instance = new StartupInstantiation();
	
	private StartupInstantiation()
	{
		System.out.println("Singleton created at startup");
	}
	
	public static void doNothing()
	{
		System.out.println("Useless method (startup instantiation)");
	}
	
	public static StartupInstantiation getInstance()
	{
		return instance;
	}
}
