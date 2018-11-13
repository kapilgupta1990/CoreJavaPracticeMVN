package com.cdk.gist.concurrency.deadlock;

import java.util.ArrayList;
import java.util.List;

public class Tester1 {

	public static void main(String[] args) {
		List<Number> numbers=new ArrayList();
		numbers.add(new Integer(10));
		numbers.add(new Double(10.5d));
		numbers.add(new Double(10.5d));

		print(numbers);
		System.out.println(numbers.size());

		

	}
	public static void print(List<? super Number> numbers){
		
		numbers.add(new Integer(20));
		System.out.println(numbers.get(0));
	}
}
