package com.cdk.gist.collection.blocking.collection;

import java.util.concurrent.LinkedBlockingQueue;

class Producer extends Thread {

	private LinkedBlockingQueue<String> queue;

	public Producer(LinkedBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				queue.put("Producing " + ++i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Consumer extends Thread {
	private LinkedBlockingQueue<String> queue;

	public Consumer(LinkedBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println(queue.take());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Tester {

	public static void main(String[] args) {

		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(1);
		new Consumer(queue).start();
		new Producer(queue).start();
	}
}
