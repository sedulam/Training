
public class LazyInstantiation
{
	private static LazyInstantiation instance;
	
	private LazyInstantiation()
	{
		System.out.println("Singleton lazily created."); //$NON-NLS-1$
	}
	
	public static void doNothing()
	{
		System.out.println("Useless method (lazy instantiation)"); //$NON-NLS-1$
	}
	
	public static synchronized LazyInstantiation getInstance()
	{
		if (instance == null)
		{
			instance = new LazyInstantiation();
		}
		
		return instance;
	}
}
