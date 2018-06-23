package com.cdk.gist.lambda;

@FunctionalInterface
public interface Processor {

	public default void  defaultProcess(){
		System.out.println("Inside default");
	}
//	public static void  staticProcess(){
//		System.out.println("Inside static");
//	}
	public void process();
	//public void doprocess();
	
}
