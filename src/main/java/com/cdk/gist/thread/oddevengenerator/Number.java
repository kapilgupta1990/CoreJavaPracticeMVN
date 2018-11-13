package com.cdk.gist.thread.oddevengenerator;

public class Number {
	
	private int MAX_NUMBER=100;

	private boolean printEven = true;

	public synchronized void printOddNumber() throws InterruptedException {
		for (int i = 1; i < MAX_NUMBER; i = i + 2) {
			while (printEven == true)
				wait();
			System.out.println(i);
			notify();
			printEven=true;

		}
	}

	public synchronized void printEvenNumber() throws InterruptedException {
		for (int i = 0; i < MAX_NUMBER; i = i + 2) {
			while(printEven!=true)
				wait();
			System.out.println(i);
			notify();
			printEven=false;

		
		}
	}

}
