package com.cdk.gist.synchronizer;

import java.util.concurrent.Exchanger;

abstract class Person {

	public abstract String getName();
}

class Male extends Person {

	@Override
	public String getName() {
		return "Male";
	}

}

class Female extends Person {

	@Override
	public String getName() {
		return "Female";
	}

}

class Thread1 extends Thread {

	Person person;
	Exchanger<Person> exchenger;

	public Thread1(Person person,Exchanger<Person> exchenger) {
		this.person = person;
		this.exchenger=exchenger;
	}

	@Override
	public void run() {
		System.out.println("Thread Name "+Thread.currentThread().getName()+" "+person.getName());
		try {
			this.person=exchenger.exchange(null);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Name "+Thread.currentThread().getName()+" "+person.getName());

	}
}

class Thraed2 extends Thread {

	Person person;
	Exchanger<Person> exchenger;

	public Thraed2(Person person,Exchanger<Person> exchenger){
		this.person=person;
		this.exchenger=exchenger;
	}

	@Override
	public void run() {
		System.out.println("Thread Name "+Thread.currentThread().getName()+" "+person.getName());
		try {
			this.person=exchenger.exchange(person);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Name "+Thread.currentThread().getName()+" "+person.getName());

	}
}

public class ExchangerDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Exchanger<Person> exchenger=new Exchanger<>();
		Person male=new Male();
		Person female=new Female();
		
		Thread t1 = new Thread1(male,exchenger);
		t1.setName("Male Thread");
		Thread t2 = new Thraed2(female,exchenger);
		t2.setName("FeMale Thread");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Finished");
	}
}
