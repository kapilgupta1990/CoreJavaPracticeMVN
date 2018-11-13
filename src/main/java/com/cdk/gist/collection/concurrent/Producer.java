package com.cdk.gist.collection.concurrent;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable{

	private LinkedBlockingQueue<String> list;
	
	public Producer(LinkedBlockingQueue<String> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		
		String name =Thread.currentThread().getName();
		for(int i=1;1<10;i++){
			
			list.offer(name+ ""+"element "+i);
		}
	}

}
