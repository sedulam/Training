package controller;

import view.Listener;

public class Controller implements Listener
{
	@Override
	public void listenerNotification(String input)
	{
		System.out.println("I'm the Controller and you wrote: " + input); //$NON-NLS-1$
	}
}
