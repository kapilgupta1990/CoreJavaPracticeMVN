package com.cdk.gist.concurrency.lock;

class Math extends Thread{
	@Override
	public void run() {
		
		while(true){
			System.out.println("Doing my job");
			if(Thread.interrupted()){
				System.out.println("I got interrupted");
				return;
			}
			
		}
	}
}
public class InterruptedExceptionTesting {

	public static void main(String[] args) throws InterruptedException {
		Thread thread=new Math();
		thread.start();
		
		Thread.sleep(1000);
		System.out.println("Now I will interrupt");
		thread.interrupt();
		System.out.println("Interrupted");
		thread.join();
		
	}
}
