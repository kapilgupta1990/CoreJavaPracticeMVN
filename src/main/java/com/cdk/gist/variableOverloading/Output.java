package com.cdk.gist.variableOverloading;

interface MyInteface1{
	void display();
}
interface MyInteface2{
	void display();
}
class MyClass implements MyInteface1,MyInteface2{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
class A {
	protected int i;
	protected int j;
	public static int K;
	
	protected void display(){
		System.out.println("I "+i+" +J "+j);
		System.out.println("K "+K);
	}
}

class B extends A {
	protected int i;
	protected int j;
	public static int K;

	protected void display(){
		System.out.println();
		System.out.println(super.i+" "+super.j);
		System.out.println("I "+i+" +J "+j);
		System.out.println("K "+K);
	}
}

public class Output {
	public static void main(String args[]) {
		B obj = new B();
		obj.i = 1;
		obj.j = 2;
		obj.K=3;
		obj.display();
		
		
		A obj1 = new B();
		B b=(B) obj1;
		obj1.i = 1;
		obj1.j = 2;
		b.i=3;
		b.j=4;
		obj1.display();
		
		
		
		
	}
}
