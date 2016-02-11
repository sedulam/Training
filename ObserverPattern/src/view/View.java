package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.inject.Inject;

public class View
{
	private Listener listener;
	
	@Inject
	public void setListener(Listener listener)
	{
		this.listener = listener;
	}

	public void startConsole()
	{
		String input = "";
		while (input != "exit")
		{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			try
			{
				input = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			listener.listenerNotification(input);
		}
	}
}
