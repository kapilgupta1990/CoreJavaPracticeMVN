package com.cdk.gist.collection.concurrent;

import java.util.ArrayDeque;
import java.util.Queue;

class ProducerThread extends Thread {
	Queue<String> queue;
	int i = 0;

	public ProducerThread(Queue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (queue) {
				while (queue.size() == 2) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Producing  " + i);
				queue.add("Adding " + i);
				i++;
				queue.notify();

			}
		}

	}
}

class ConsumerThread extends Thread {
	Queue<String> queue;

	public ConsumerThread(Queue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.size() == 0) {
					try {
						queue.wait();
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Consuming " + queue.remove());
				queue.notify();
				
				

			}
		}

	}

}

public class ProducerConsumerThread {

	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque();
		new ConsumerThread(queue).start();
		new ProducerThread(queue).start();
	}

}
