
public class StartupInstantiation
{
	private static StartupInstantiation instance = new StartupInstantiation();
	
	private StartupInstantiation()
	{
		System.out.println("Singleton created at startup"); //$NON-NLS-1$
	}
	
	public static void doNothing()
	{
		System.out.println("Useless method (startup instantiation)"); //$NON-NLS-1$
	}
	
	public static StartupInstantiation getInstance()
	{
		return instance;
	}
}
