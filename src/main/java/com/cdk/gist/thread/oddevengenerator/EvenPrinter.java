package com.cdk.gist.thread.oddevengenerator;

public class EvenPrinter extends Thread{
	private Number number;

	public EvenPrinter(Number number) {
		this.number = number;
	}

	@Override
	public void run() {
		try {
			number.printEvenNumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
