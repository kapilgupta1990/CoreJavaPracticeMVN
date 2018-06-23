package com.cdk.gist.synchronizer;

import java.util.concurrent.CountDownLatch;

class PickUpPoint extends Thread{
	private String sno;
	private CountDownLatch countDownLatch;

	public PickUpPoint(String sno,CountDownLatch countDownLatch) {
		this.sno=sno;
		this.countDownLatch = countDownLatch;
	}
	@Override
	public void run() {
		System.out.println(" "+sno+" arrivedd");
		countDownLatch.countDown();
	}

}

class Bus extends Thread {
	private CountDownLatch countDownLatch;

	public Bus(CountDownLatch countDownLatch) {
		this.countDownLatch=countDownLatch;
	}

	@Override
	public void run() {
		System.out.println("Waiting for 3 students :...");
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Started...");
	}
}

public class CountDownLatchTesting {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Count down latch");
		
		CountDownLatch countDownLatch = new CountDownLatch(3);
		Bus bus=new Bus(countDownLatch);
		bus.start();
		PickUpPoint student1=new PickUpPoint("s1", countDownLatch);
		PickUpPoint student2=new PickUpPoint("s2", countDownLatch);
		PickUpPoint student3=new PickUpPoint("s3", countDownLatch);
		
		student1.start();
		student2.start();
		Thread.sleep(10000);
		student3.start();
		
	}
}
