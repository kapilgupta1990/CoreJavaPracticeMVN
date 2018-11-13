package com.cdk.gist.collection.concurrent;

import java.util.concurrent.locks.ReentrantLock;


class EvenTemp extends Thread {

	private Factory factory;

	public EvenTemp(Factory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void run() {
		try {
			factory.printEvenNUmber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class OddTemp extends Thread {

	private Factory factory;
	public OddTemp(Factory factory) {
		super();
		this.factory = factory;
	}
	@Override
	public void run() {
		try {
			factory.printOddNumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Factory {

	private ReentrantLock lock;

	public synchronized void printEvenNUmber() throws InterruptedException {

		for (int i = 2; i < 100; i = i + 2) {

			notify();
			System.out.println("I notified");
			wait();
			
			System.out.println(i);
			//wait();
			//
			
		}
	}

	public synchronized void printOddNumber() throws InterruptedException {
		
		for (int i = 1; i < 100; i = i + 2) {

			System.out.println(i);
			notify();
			wait();
			
		}
	}
	
	//T1 1,
	// T2

}

public class ProducerConsumerUsingCondition {

	public static void main(String[] args) {

		Factory factory=new Factory();
		new EvenTemp(factory).start();
		new OddTemp(factory).start();
		
	}
}
