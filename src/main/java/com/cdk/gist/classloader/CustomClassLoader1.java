package com.cdk.gist.classloader;

public class CustomClassLoader1 extends ClassLoader{

	public CustomClassLoader1(ClassLoader parent) {
		super(parent);
	}
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		
		return super.loadClass(name);
	}
}
