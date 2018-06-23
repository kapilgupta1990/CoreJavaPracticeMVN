package com.cdk.gist;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before");
		if(method.getName().equalsIgnoreCase("method1")){
			System.out.println("Method 1 has been called");
		}
		if(method.getName().equalsIgnoreCase("method5")){
			System.out.println("Method 5 has been called");
		}
		System.out.println("End");
		return "kapil";
	}

}
