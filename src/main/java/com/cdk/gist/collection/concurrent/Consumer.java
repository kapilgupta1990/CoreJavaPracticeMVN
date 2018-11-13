package com.cdk.gist.collection.concurrent;

import java.util.concurrent.LinkedBlockingQueue;

public class Consumer implements Runnable {

	private LinkedBlockingQueue<String> list;

	public Consumer(LinkedBlockingQueue<String> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {
			System.out.println("Consuming :" + list.poll());
		}

	}

}
