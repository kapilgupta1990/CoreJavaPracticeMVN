package com.cdk.gist.thread.producerconsumer.single;

public class PCMain {

	public static void main(String[] args) throws InterruptedException {
		PC pc=new PC();
		ProducerThread pt=new ProducerThread(pc);
		ConsumerThread ct=new ConsumerThread(pc);
		ct.start();
		Thread.sleep(1000);
		pt.start();
		
	}
}
