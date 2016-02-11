package main;

import com.google.inject.AbstractModule;

import controller.Controller;
import view.Listener;

public class ViewModule extends AbstractModule 
{
	@Override
	protected void configure()
	{
		bind(Listener.class).to(Controller.class);
	}
}
