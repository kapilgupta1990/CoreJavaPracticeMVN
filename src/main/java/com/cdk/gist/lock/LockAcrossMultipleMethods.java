package com.cdk.gist.lock;

import java.util.concurrent.locks.ReentrantLock;

import javax.print.StreamPrintService;

class Number {
	public ReentrantLock rl = new ReentrantLock();

	public void printOddNumber() {

		rl.lock();

		for (int i = 1; i <= 10; i = i + 2) {

			System.out.println("Odd " + i + " Thread:" + Thread.currentThread().getName());
		}
		printEvenNumber();
	}

	public void printEvenNumber() {

		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println("Even " + i + " Thread:" + Thread.currentThread().getName());
		}
		rl.unlock();
	}
}

public class LockAcrossMultipleMethods {

	public static void main(String[] args) {

		Number number = new Number();
		Thread t1 = new Thread(() -> {
			number.printOddNumber();
		});
		Thread t2 = new Thread(() -> {
			number.printOddNumber();
		});
		t1.start();
		t2.start();
	}
}
