package com.cdk.gist.thread;

class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", age=").append(age).append("]");
		return builder.toString();
	}

}

class PersonThread extends Thread {

	private Person person;
	ThreadLocal<Person> threadLocalPerson = new ThreadLocal<Person>(){
		
		
	};

	public PersonThread(Person person) {
		this.person = person;
	}

	@Override
	public void run() {
		threadLocalPerson.set(person);
		person.setName(Thread.currentThread().getName());
		System.out.println(person);
		threadLocalPerson.get().setName(Thread.currentThread().getName());
		System.out.println("Thread Local "+threadLocalPerson.get().hashCode());
	}
}

public class ThreadLocalTester {

	Person person;

	public static void main(String[] args) {

		Person person = new Person();
		person.setAge(20);

		PersonThread pt1 = new PersonThread(person);
		PersonThread pt2 = new PersonThread(person);
		pt1.start();
		pt2.start();

	}

}
