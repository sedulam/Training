package singleton;

public class MySingleton
{
	private static MySingleton instance;
	
	private MySingleton(){}
	
	@SuppressWarnings("static-method")
	public MySingleton getInstance()
	{
		if (instance == null)
		{
			instance = new MySingleton();
		}
		return instance;
	}
}
