package com.cdk.gist;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxiesTesting {
	public static void main(String[] args) {

		// Creating Dynamic proxies
		/*
		 * create dynamic implementations of interfaces at runtime. You do so
		 * using the class java.lang.reflect.Proxy. The name of this class is
		 * why I refer to these dynamic interface implementations as dynamic
		 * proxies.
		 */
		InvocationHandler handler = new MyInvocationHandler();
		ReflectionSuperInterface1 proxy = (ReflectionSuperInterface1) Proxy.newProxyInstance(
				ReflectionSuperInterface1.class.getClassLoader(),
		                            new Class[] { ReflectionSuperInterface1.class },
		                            handler);
		
		//handler.invoke(ReflectionSuperInterface1., "method1", new Object[0]);
		System.out.println(proxy.method1());
		System.out.println(proxy.method5());
		//handler.invoke(Class obj, "method1", new Object[0]);
	}
}
