package com.cdk.gist.java8;

public class MyFunctionalInterfaceTesting {

	public static void main(String[] args) {
		
		MyFunctionalInterface mfi=(S,i)->{System.out.println("Hello "+S); return MyFunctionalInterface.PI_VALUE;};
		System.out.println(mfi.doAnything("mahesh", 3));
		mfi.doSomething();
	}
}
