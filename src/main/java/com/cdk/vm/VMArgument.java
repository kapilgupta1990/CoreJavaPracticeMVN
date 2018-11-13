package com.cdk.vm;

public class VMArgument {

	public static void main(String[] args) {
		
		String host=System.getProperty("spring.data.mongodb.host");
		
		System.out.println(host);
		System.out.println((System.getProperty("spring.data.mongodb.username")));
		System.out.println((System.getProperty("spring.data.mongodb.password")));
	}
}
