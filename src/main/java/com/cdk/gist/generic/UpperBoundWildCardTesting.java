package com.cdk.gist.generic;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCardTesting {
	public static void main(String[] args) {

		List<Number> list = new ArrayList<>();
		printOnlyIntegerClassorSuperClass(list);
		System.out.println("Size of list " + list.size());
	}

	// Only for adding
	public static void printOnlyIntegerClassorSuperClass(List<? extends Number> list) {

		list.get(0);
		list.add(null);

	}
}
