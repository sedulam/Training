package controller;

import view.Listener;
import view.View;

public class Controller implements Listener
{
	public Controller(View view)
	{
		super();
		view.setListener(this);
	}

	@Override
	public void listenerNotification(String input)
	{
		System.out.println("I'm the Controller and you wrote: " + input);
	}
}
