package com.cdk.gist.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortTesting {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("10");
		a.add("2");
		a.add("3");
		a.add(4);
		Collections.sort(a);
		System.out.println(a);
		Comparator comparator=Collections.reverseOrder();
		Collections.sort(a, comparator);
		
		System.out.println(a);

	}
}
