package com.cdk.gist.synchronizer;

import java.util.concurrent.Semaphore;

class Wahhoom extends Thread {
	private Semaphore semaphore;
	private String threadName;

	public Wahhoom(Semaphore semaphore,String threadName) {
		this.semaphore = semaphore;
		this.threadName=threadName;

	}

	public void goForWashroom() throws InterruptedException {
		semaphore.acquire();
		System.out.println("Acquiring lock..."+threadName);
		Thread.sleep(10000);

		
		semaphore.release();
		System.out.println("Releasing lock..."+threadName);
		
	}
	@Override
	public void run() {
		try {
			goForWashroom();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class SemaphoreTesting {

	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(5);
		for(int i=0;i<10;i++){
			new Wahhoom(semaphore,"Thred "+i).start();
		}
	}
}
