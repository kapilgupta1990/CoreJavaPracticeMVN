package com.cdk.gist.java8;

public interface MyFunctionalInterface {

	int PI_VALUE=7;
	public int doAnything(String s , int z);
	public default void  doSomething(){
		System.out.println("I am doing something");
	}
	
}
