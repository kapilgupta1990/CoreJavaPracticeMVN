package com.cdk.gist.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class NonBlockingPriorityQueueTesting {

	public static void main(String[] args) {

		Queue <String> queue=new PriorityQueue<>(new StringComparator());
		queue.add("zebra");
		queue.add("kapil");
		queue.add("ravi");
		queue.add("mahesh");
		//queue.iterator();
		System.out.println(queue);
	}
}
class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
