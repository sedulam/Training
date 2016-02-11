package main;

import controller.Controller;
import view.View;

public class Start
{
	public static void main(String[] args)
	{
		View view = new View();
		new Controller(view);
		view.startConsole();
	}
}
