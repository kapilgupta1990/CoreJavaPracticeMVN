package com.cdk.gist.access.specifier;

public class ConstructorCreatingObject {

	public ConstructorCreatingObject() {
		System.out.println("Inside constructor");
		ConstructorCreatingObject object = new ConstructorCreatingObject();
	}

	public static void m1() throws ArrayIndexOutOfBoundsException {

	}

	public static void main(String[] args) throws Exception, RuntimeException, Throwable {
		// Thread.sleep(1000);
		ConstructorCreatingObject object1 = new ConstructorCreatingObject();
	}
}
