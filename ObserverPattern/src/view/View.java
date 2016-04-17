package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.inject.Inject;

public class View
{
	private Listener listener;
	
	@Inject
	public View(Listener listener)
	{
		super();
		this.listener = listener;
	}

	public void startConsole()
	{
		String input = ""; //$NON-NLS-1$
		while (input != "exit") //$NON-NLS-1$
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
			this.listener.listenerNotification(input);
		}
	}
}
