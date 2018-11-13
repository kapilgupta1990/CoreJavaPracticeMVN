package com.cdk.gist.jdbc;

public class DirtyReadExample {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// tx.setAutomitt(true);
				

			}
		});
		t2.start();
	}

}
