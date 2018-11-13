package com.cdk.gist.thread.producerconsumer.single;

public class PC {

	int i;
	boolean isAvailable=false;

	public synchronized void put(int i) throws InterruptedException {
		while(isAvailable==true)
			wait();
		this.i = i;
		System.out.println("Put  " + i);
		notify();
		Thread.sleep(1000);
		isAvailable=true;
	}

	public synchronized void get() throws InterruptedException {
		while(isAvailable==false)
			wait();
		System.out.println("Get " + i);
		notify();
		isAvailable=false;
	}

}
