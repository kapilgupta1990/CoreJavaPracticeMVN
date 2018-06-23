package com.cdk.gist.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LowerBoundTesting {
	public static void addIntegers(List<? super Integer> list) {
		list.add(new Integer(50));
		
	}
	class A {}
	class B extends A {} class C extends B {}
	class D<C> {
	// INSERT CODE HERE
		A a1 = new A();
		A a2 = new B();
		//A a3 = new C();
		//C c1 = new A();
	}
	public static void addIntegers1(List<? super B> list) {
		//list.add(new Integer(50));
		
	}
	public static void main(String[] args) {

		List<Number> numberList=new ArrayList<>();
		List<Float> floatList=new ArrayList<>();
		addIntegers(numberList);
		//addIntegers(floatList);
		List<A> aList=new ArrayList<>();
		List<B> bList=new ArrayList<>();
		List<Object> objectList=new ArrayList<>();
		
		addIntegers1(aList);
		addIntegers1(bList);
		addIntegers1(objectList);
		
		
		HashSet<? super ClassCastException> set = new HashSet<Exception>();
		//List<? extends Object> objects = new ArrayList<? extends Object>();
		
		Set<Number> numbers = new HashSet<>();
		
		//Set<Number> numbers1 = new HashSet<Integer>();
	}
}
