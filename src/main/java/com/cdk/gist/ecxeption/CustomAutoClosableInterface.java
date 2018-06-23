package com.cdk.gist.ecxeption;

public class CustomAutoClosableInterface implements AutoCloseable{

	public void callMe(){
		System.out.println("I got called");
	}
	@Override
	public void close() throws Exception {
		System.out.println("CLosed will be called");
		
	}

}
