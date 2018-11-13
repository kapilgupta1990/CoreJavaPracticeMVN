package com.cdk.gist.thread.oddevengenerator;

public class OddPrinter extends Thread {

	private Number number;

	public OddPrinter(Number number) {
		this.number = number;
	}

	@Override
	public void run() {
		try {
			number.printOddNumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
