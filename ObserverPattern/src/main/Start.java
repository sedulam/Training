package main;

import com.google.inject.Guice;
import com.google.inject.Injector;

import view.View;

public class Start
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new ViewModule());
		View view = injector.getInstance(View.class);
		view.startConsole();
	}
}
