package com.cdk.gist.synchronizer;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class PrintNumber extends Thread {
	private String threadName;
	private CyclicBarrier cyclicBarrier;
	public PrintNumber(String threadName, CyclicBarrier cyclicBarrier) {
		this.threadName=threadName;
		this.cyclicBarrier=cyclicBarrier;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(threadName+" "+i);
			if(i==3)
				try {
					System.out.println(threadName +"is waiting"  );
					cyclicBarrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}

public class CyclicBarrierTesting {

	public static void main(String[] args) throws InterruptedException {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		PrintNumber printNumber1=new PrintNumber("thread1",cyclicBarrier);
		PrintNumber printNumber2=new PrintNumber("thread2",cyclicBarrier);
		cyclicBarrier.reset();
		printNumber1.start();
		Thread.sleep(10000);
		printNumber2.start();
	}
}
