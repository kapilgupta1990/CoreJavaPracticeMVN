package com.cdk.gist.gc;

class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
		super.finalize();
	}
}

public class FinalizerTesting {

	public static void main(String[] args) {
		Person person=new  Person("kapil");
		person=null;
	//	System.gc();
		System.runFinalization();
		

	}

}
