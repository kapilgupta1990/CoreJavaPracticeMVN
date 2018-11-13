package com.cdk.gist.synchronization.example;

public class NumberGenerator {

	public synchronized void printOddNumber() throws InterruptedException {

		for (int i = 1; i < 100; i = i + 2) {
			notify();
			wait();
			System.out.println(i);

		}
	}

	public synchronized void printEvenNumber() throws InterruptedException {
		for (int i = 0; i < 100; i = i + 2) {
			System.out.println(i);
			notify();
			wait();

		}
	}

	public static void main(String[] args) throws InterruptedException {
		NumberGenerator ng=new NumberGenerator();
		Runnable t1=()->{try {
			ng.printEvenNumber();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}};
		Runnable t2=()->{try {
			ng.printOddNumber();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}};
		new Thread(t1).start();
		new Thread(t2).start();

	}
}
