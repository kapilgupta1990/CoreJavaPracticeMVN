package com.cdk.gist.overloading;

class Parent {

	public static String sayHello() {

		return "Say hello from parent";
	}
	public int getAge(){
		return 63;
	}
}

class Child extends Parent {
	public static String sayHello() {

		return "Say hello from Child";
	}
	public int getAge(){
		return 28;
	}
}

public class StaticOverloading {

	public static void main(String[] args) {

		Parent par=new Child();
		System.out.println(par.sayHello());
		System.out.println(par.getAge());
		
		Child child=new Child();
		System.out.println(child.sayHello());
		System.out.println(child.getAge());
		
		
		
		
	}
}
