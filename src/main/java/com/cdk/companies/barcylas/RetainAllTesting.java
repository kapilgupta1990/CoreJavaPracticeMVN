package com.cdk.companies.barcylas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RetainAllTesting {

	public static void main(String[] args) {

		HashSet<String> hashSet=new HashSet<>();
		List <String> list=new ArrayList<>();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(hashSet);
		System.out.println(list);
		
		// After retain all
		
		hashSet.retainAll(list);
		System.out.println();

		System.out.println(hashSet);
		System.out.println(list);
	}
}
