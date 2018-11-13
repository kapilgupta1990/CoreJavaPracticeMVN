package com.cdk.gist.multithreading;

class NumberDispatcher {
	int odd = 1;
	int even = 0;

	public synchronized void evenPrint() throws InterruptedException { // wait():
																		// releases
																		// the
																		// lock

		// If

		while (true) {
			System.out.println(even);
			even = even + 2;
			notify();
			wait();
			Thread.sleep(1000);
		}

	}

	public synchronized void oddPrint() throws InterruptedException {
		while (true) {

			notify();
			wait();
			System.out.println(odd);
			odd = odd + 2;
			Thread.sleep(1000);
		}

	}
}

public class OddEvenTester {

	public static void main(String[] args){

		NumberDispatcher numberDispatcher = new NumberDispatcher();
		Thread t1 = new Thread(() -> {
			try {
				numberDispatcher.evenPrint();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				numberDispatcher.oddPrint();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();

	}
}
