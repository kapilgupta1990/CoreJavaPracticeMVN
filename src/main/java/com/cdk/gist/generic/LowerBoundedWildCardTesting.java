package com.cdk.gist.generic;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCardTesting {

	public static void main(String[] args) {

		List<Number> list=new ArrayList<>();
		printOnlyIntegerClassorSuperClass(list);
		System.out.println("Size of list "+list.size());
	}

	// Only for adding
	public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
		
		list.add(new Integer(10));
		list.add(null);
		
	}
}
