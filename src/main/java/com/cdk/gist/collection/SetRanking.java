package com.cdk.gist.collection;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.function.Predicate;

public class SetRanking {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<>();
		TreeMap tm;
		hashSet.add(10);
		hashSet.add(18);
		hashSet.add(12);
		hashSet.add(15);
		hashSet.add(10);
		hashSet.add(18);
		boolean doesExist = hashSet.stream().anyMatch((t) -> {
			return t.equals(new Integer(12));
		});
		System.out.println(hashSet.stream().max((t1,t2)->{return t1.compareTo(t2);}));
		
		System.out.println(doesExist);
		// Collections.

		PriorityQueue<Integer> priorityQueue = new PriorityQueue();
		priorityQueue.add(10);
		priorityQueue.add(2);
		priorityQueue.add(8);
		priorityQueue.add(11);
		priorityQueue.add(13);

//		System.out.println(priorityQueue.remove());
//		System.out.println(priorityQueue.remove());
//		System.out.println(priorityQueue.remove());
//		System.out.println(priorityQueue.remove());

		// rank()
	}
}
