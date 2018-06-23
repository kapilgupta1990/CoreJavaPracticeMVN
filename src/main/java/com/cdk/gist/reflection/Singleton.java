package com.cdk.gist.reflection;

public class Singleton {
	static int NumberOfObjectCreated=0;

	private static Singleton singleton;
	private Singleton(){
		NumberOfObjectCreated++;
		System.out.println(NumberOfObjectCreated);
	}
	public static  Singleton getInstance(){
		if(singleton==null)
			singleton=new Singleton();
		return singleton;
	}
}
