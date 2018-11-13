package com.cdk.gist.synchronizer;

public class SynchronizationTesting {

	public synchronized void method1() throws InterruptedException {

		System.out.println("Inside method1 .. begining" + Thread.currentThread().getName());
		Thread.sleep(10000);
		method2();
		method3();
		System.out.println("Inside method 1.. end" + Thread.currentThread().getName());
	}

	public synchronized void method2() throws InterruptedException {

		System.out.println("Inside method 2.. begineeing" + Thread.currentThread().getName());
		Thread.sleep(10000);
		System.out.println("Inside method 2.. end" + Thread.currentThread().getName());

	}

	public void method3() throws InterruptedException {
		System.out.println("Inside method 3.. begineeing" + Thread.currentThread().getName());
		Thread.sleep(1000);
		System.out.println("Inside method 3.. end" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		SynchronizationTesting st = new SynchronizationTesting();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					st.method1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					st.method2();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		t1.start();
		t2.start();

	}

}
