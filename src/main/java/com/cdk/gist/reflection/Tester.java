package com.cdk.gist.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Tester {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//Class.forName("com.cdk.gist.reflection.Singleton");
//		Singleton st=Singleton.class.newInstance();
//		Singleton st2=Singleton.class.newInstance();
//		Singleton st3=Singleton.class.newInstance();
//		System.out.println(st);
//		System.out.println(st==Singleton.getInstance());
		
		Constructor<?>[] Constructors=Singleton.class.getDeclaredConstructors();
		for(Constructor constructor:Constructors){
			try {
				constructor.setAccessible(true);
				Singleton singleton=(Singleton) constructor.newInstance(null);
				System.out.println(singleton);
			} catch (IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(constructor);
		}
	}
}
