package main;

public class CallsAbstract
{
	public static void main (String[] args){
		ExtendsAbstract extendsAbstract = new ExtendsAbstract();
		ConstructWithAbstract constructWithAbstract = new ConstructWithAbstract(extendsAbstract);
	}
}
