package com.cdk.gist.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTester {
	/*
	 * TreeSet implements the NavigableSet interface. This interface provides
	 * some interest- ing methods. Their method signatures are as follows:
	 * 
	 * 
	 * Method E lower(E e) E floor(E e) E ceiling(E e) E higher(E e) Description
	 * Returns greatest element that is < e, or null if no such element Returns
	 * greatest element that is <= e, or null if no such element Returns
	 * smallest element that is >= e, or null if no such element Returns
	 * smallest element that is > e, or null if no such element
	 */
	public static void main(String[] args) {

		NavigableSet<Float> floatTreeSet = new TreeSet<>();
		floatTreeSet.add(22.0f);
		floatTreeSet.add(22.1f);
		floatTreeSet.add(22.2f);
		floatTreeSet.add(22.3f);

		System.out.println(floatTreeSet.lower(22.0f));
		System.out.println(floatTreeSet.floor(22.0f));
		System.out.println(floatTreeSet.higher(22.0f));
		System.out.println(floatTreeSet.ceiling(22.0f));
	}
}
