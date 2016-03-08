package main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main
{

	public static void main(String[] args) throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException
	{
		ClassLoader cl1 = new MyClassLoader();
		ClassLoader cl2 = new MyOtherClassLoader();

		Class<?> singClass1 = cl1.loadClass("main.ProtectedSingleton");
		Class<?> singClass2 = cl2.loadClass("main.ProtectedSingleton");

		Method getInstance1 = singClass1.getDeclaredMethod("getInstance");
		Method getInstance2 = singClass2.getDeclaredMethod("getInstance");

		Object singleton1 = getInstance1.invoke(null);
		Object singleton2 = getInstance2.invoke(null);
		
		System.out.println(singleton1.toString());
		System.out.println(singleton2.toString());
	}

}
