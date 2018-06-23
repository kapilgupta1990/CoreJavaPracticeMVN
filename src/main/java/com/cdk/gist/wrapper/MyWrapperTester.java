package com.cdk.gist.wrapper;

public class MyWrapperTester {

	public static void main(String[] args) {

		Character number = new Character('a');
		System.out.println(number.hashCode());

		// Convert it into byte value
		// System.out.println(number.);

		Integer i = new Integer(257);
		float x = i.floatValue();
		System.out.print(x);
		
		System.out.println();
	}
}
