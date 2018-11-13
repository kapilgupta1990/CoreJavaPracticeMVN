package com.cdk.gist.collection.concurrent;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

	public static void main(String[] args) {

		ConcurrentLinkedDeque<String> list = new ConcurrentLinkedDeque<>();
		Thread threads[] = new Thread[100];
		for (int i = 0; i < threads.length; i++) {
			AddTask task = new AddTask(list);
			threads[i] = new Thread(task);
			threads[i].start();
		}
		System.out.printf("Main: %d AddTask threads have been launched\n", threads.length);
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Main: Size of the List: %d\n", list.size());
		for (int i = 0; i < threads.length; i++) {
			PollTask task = new PollTask(list);
			threads[i] = new Thread(task);
			threads[i].start();
		}
		System.out.printf("Main: %d PollTask threads have beenlaunched\n", threads.length);
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Main: Size of the List: %d\n",list.size());

		
		LinkedBlockingQueue <String> linkedBlockingQueue=new LinkedBlockingQueue<>(1);
		Consumer consumer=new Consumer(linkedBlockingQueue);
		Producer producer=new Producer(linkedBlockingQueue);
		
		Thread consumerThread=new Thread(consumer);
		Thread producerThread=new Thread(producer);
		consumerThread.start();
		producerThread.start();
	}
	
	
	
	
}
