package com.cdk.gist.collection.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTester {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
		
		for (Integer item : list) {
			System.out.print(item + " ");
			list.add(9);
			System.out.println("Running list size :"+list.size());
		}
		System.out.println();
		System.out.println("Size: " + list.size());
		while(true)
		{
			System.out.println("Hi");
			Thread.sleep(10000);
		}
	}
}
