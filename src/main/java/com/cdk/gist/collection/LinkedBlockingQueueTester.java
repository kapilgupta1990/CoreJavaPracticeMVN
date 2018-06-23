package com.cdk.gist.collection;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTester {
	
	public static void main(String[] args) {
		//LinkedBlockingQueue<Integer> bq=new LinkedBlockingQueue<>(capacity)
		LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(5);
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				try {
//					System.out.println(thread1.getState());
					blockingQueue.put(i);
					System.out.println("Putted "+i);
					//Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread thread2 = new Thread(() -> {
			while (true) {
				try {
					System.out.println(thread1.getState()+" Get "+blockingQueue.take());
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread2.start();
		thread1.start();
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(thread1.getState()+" "+thread2.getState());
		}

	}
}
