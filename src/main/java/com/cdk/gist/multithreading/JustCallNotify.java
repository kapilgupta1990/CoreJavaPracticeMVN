package com.cdk.gist.multithreading;

class Printer {

	/*
	 * Notify method notifies, the thread that now you can take the control and 
	 * continue its execution if other waiting thread does not call it
	 * 
	 * 
	 * wait() : Releases lock and wait for someone to notify it
	 */
	public synchronized void callNotify() throws InterruptedException {

		while (true) {
			System.out.println(Thread.currentThread().getName() + " Before Notify");

			notify();
			System.out.println(Thread.currentThread().getName() + " After Notify");

			System.out.println(Thread.currentThread().getName() + " Before wait");
			//wait();    // Thread 0 release lock here
			System.out.println(Thread.currentThread().getName() + " After wait");
			Thread.sleep(1000);

			// System.out.println(Thread.currentThread().getState());
			// Thread.sleep(10000);
		}
	}

	public synchronized void callWait() throws InterruptedException {

		while (true) {
			System.out.println(Thread.currentThread().getName() + " Before Wait");
			//wait();   // Waiting here : release lock
			System.out.println(Thread.currentThread().getName() + " After Wait");

			System.out.println(Thread.currentThread().getName() + " Before Notify");
			notify();
			System.out.println(Thread.currentThread().getName() + " After Notify");
			Thread.sleep(1000);

		}
	}
}

public class JustCallNotify {

	public static void main(String[] args) throws InterruptedException {

		Printer print = new Printer();
		Thread t = new Thread(() -> {
			try {
				print.callNotify();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		Thread t1 = new Thread(() -> {
			try {
				print.callWait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.start();
		Thread.sleep(1000);
		t.start();
		while (true) {
			Thread.sleep(1000);
			System.out.println("T thread " + t.getState() + " T1 thread" + t1.getState());
		}

	}
}
