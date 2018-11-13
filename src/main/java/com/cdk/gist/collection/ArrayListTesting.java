package com.cdk.gist.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * There are 2 methods set and add , both method add elements	
 */
public class ArrayListTesting {

	public static void main(String[] args) {
		ArrayList list=new ArrayList<>();
		list.ensureCapacity(12);
		list.trimToSize();
		//System.out.println(list.trimToSize(););
		
		list.add(2);
		list.add(3);
		list.add(1, 4);
		System.out.println(list);
		//list.set(1, 5);
		//list.add
		System.out.println(list);
		//list.l
		
		//Collections.sh
	}
}
