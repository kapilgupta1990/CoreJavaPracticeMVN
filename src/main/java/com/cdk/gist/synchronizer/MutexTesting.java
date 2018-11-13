package com.cdk.gist.synchronizer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

class BlackPrinter implements Runnable {

	private Print printMachine;
	private Semaphore semaphore;

	public BlackPrinter(Print printMachine2,Semaphore semaphore) {
		this.printMachine = printMachine2;
		this.semaphore=semaphore;
	}

	@Override
	public void run() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printMachine.print(Thread.currentThread().getName());
		semaphore.release();
	}
}

class Print {

	public void print(String threadName) {
		for (int i = 0; i < 100; i++) {
			System.out.println("Printing from " + threadName + " " + i);

		}
	}
}

public class MutexTesting {

	public static void main(String[] args) {

		// Mutex
		Semaphore semaphore = new Semaphore(1);
		Print printMachine = new Print();
		Runnable runnable = new BlackPrinter(printMachine,semaphore);
		Thread SouthPrinter = new Thread(runnable, "South Block Printer");
		Thread northPrinter = new Thread(runnable, "North Block Printer");
		SouthPrinter.start();
		northPrinter.start();
		CyclicBarrier cb;
		CountDownLatch cdl;
		//cdl.
	}

}
