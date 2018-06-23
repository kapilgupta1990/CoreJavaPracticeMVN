package com.cdk.gist.concurrency.lock;

class OddNumber extends Thread {
	private Number1 number;

	public OddNumber(Number1 number) {
		this.number = number;
	}

	public void printNumber() {
		synchronized (number) {
			for (int i = 1; i < 50; i = i + 2) {
				System.out.println("Odd printing " + i);
				try {
					number.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				number.notify();
			}
		}

	}

	@Override
	public void run() {
		printNumber();
	}

}

class EvenNumber extends Thread {
	private Number1 number;

	public EvenNumber(Number1 number) {
		this.number = number;
	}

	public void printNumber() {
		synchronized (number) {
			for (int i = 2; i < 50; i = i + 2) {
				System.out.println("Even printing " + i);
				number.notify();
				try {
					number.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public void run() {
		printNumber();
	}

}

public class OddEvenNumberPrinting {

	public static void main(String[] args) {
		Number1 number = new Number1();
		OddNumber oddNumberThread = new OddNumber(number);
		EvenNumber evenNumberThread = new EvenNumber(number);

		oddNumberThread.start();
		evenNumberThread.start();

	}
}
