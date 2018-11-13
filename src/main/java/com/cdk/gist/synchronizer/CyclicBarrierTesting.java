package com.cdk.gist.synchronizer;

import java.util.concurrent.CyclicBarrier;

class PrintNumber extends Thread {
	private String threadName;
	private CyclicBarrier cyclicBarrier;

	public PrintNumber(String threadName, CyclicBarrier cyclicBarrier) {
		this.threadName = threadName;
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		try{
			System.out.println(" "+Thread.currentThread().getName()+" Reached");
			System.out.println("Total parties "+cyclicBarrier.getParties()+" "+cyclicBarrier.getNumberWaiting());
			cyclicBarrier.await();	
			System.out.println("Finally "
					+ "Total parties "+cyclicBarrier.getParties()+" "+cyclicBarrier.getNumberWaiting());
		
		}
		catch(Exception expecton){
			
		}
		
	}
}

public class CyclicBarrierTesting {

	public static void main(String[] args) throws InterruptedException {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(2,()->System.out.println("Wow all has been reached"));
		PrintNumber printNumber1 = new PrintNumber("thread1", cyclicBarrier);
		PrintNumber printNumber2 = new PrintNumber("thread2", cyclicBarrier);
		// cyclicBarrier.reset();
		printNumber1.start();
		 Thread.sleep(10000);
		printNumber2.start();
	}
}
