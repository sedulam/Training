package main;


public final class ProtectedSingleton
{
	private transient static ProtectedSingleton instance;

	private ProtectedSingleton()
	{
		if (instance != null)
			throw new IllegalStateException(
					"Singleton instance already created.");
	}

	public static ProtectedSingleton getInstance()
	{
		if (instance == null)
		{
			synchronized (ProtectedSingleton.class)
			{
				if (instance == null)
				{
					System.out.println("Creating singleton...");
					instance = new ProtectedSingleton();
				}
			}
		}

		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}

}
