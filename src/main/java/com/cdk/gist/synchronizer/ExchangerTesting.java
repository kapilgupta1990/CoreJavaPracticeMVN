package com.cdk.gist.synchronizer;

import java.util.concurrent.Exchanger;

class ExchangerRunnable implements Runnable {

	Exchanger<Student> exchanger = null;
	Student student = null;

	public ExchangerRunnable(Exchanger exchanger, Student object) {
		this.exchanger = exchanger;
		this.student = object;
	}

	public void run() {
		try {

			this.student = this.exchanger.exchange(this.student);

			// System.out.println(Thread.currentThread().getName() + " exchanged
			// " + previous + " for " + this.object);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Student getStudent() {
		return student;
	}

}

class Student {

	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("student [name=").append(name).append(", age=").append(age).append("]");
		return builder.toString();
	}

}

public class ExchangerTesting {

	public static void main(String[] args) throws InterruptedException {
		Student kapil = new Student("kapil", 28);
		Student ravi = new Student("Ravi", 25);
		Exchanger<Student> exchanger = new Exchanger();

		ExchangerRunnable exchangerRunnable1 = new ExchangerRunnable(exchanger, kapil);

		ExchangerRunnable exchangerRunnable2 = new ExchangerRunnable(exchanger, ravi);
		// Before Exchange

		System.out.println("exchangerRunnable1 " + exchangerRunnable1.getStudent());
		System.out.println("exchangerRunnable2 " + exchangerRunnable2.getStudent());
		Thread t1 = new Thread(exchangerRunnable1);
		t1.start();
		Thread t2 = new Thread(exchangerRunnable2);
		t2.start();
		t1.join();
		t2.join();
		System.out.println("After exchange");
		System.out.println("exchangerRunnable1 " + exchangerRunnable1.getStudent());
		System.out.println("exchangerRunnable2 " + exchangerRunnable2.getStudent());
	}
}
