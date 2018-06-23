package com.cdk.gist.generic;

import java.util.ArrayList;
import java.util.List;

class A {

	public void print() {
		System.out.println("A");
	}
}

class B extends A {
	public void print() {
		System.out.println("B");
	}
}

class C extends A {
	public void print() {
		System.out.println("C");
	}
}

public class UpperBoundTesting {

	public static double sum(List<Number> list) {
		double sum = 0;
		for (Number number : list) {
			sum = sum + number.doubleValue();
		}
		return sum;

	}
	public static double sum1(List<? extends Number> list) {
		double sum = 0;
		for (Number number : list) {
			sum = sum + number.doubleValue();
		}
		return sum;

	}

	public static void iterate(List<? extends A> aList) {
		for (A a : aList) {
			a.print();
		}
	}

	public static void iterate1(List<? super A> aList){
		for(Object a : aList){
			((A)a).print();
		}
		//aList.add(e)
	}

	public static void main(String[] args) {

		List<Number> number=new ArrayList<>();
		number.add(new Integer(10));
		number.add(new Float(12.5));
		
		List<Integer> intList=new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		//System.out.println(sum(intList)); // compile time error
		System.out.println(sum(number));
		
		System.out.println(sum1(intList));
		System.out.println(sum1(number));
		
		List<A> aList = new ArrayList<>();
		aList.add(new A());
		aList.add(new B());
		aList.add(new C());
		iterate(aList);
		// iterate1(aList);
	}
}
