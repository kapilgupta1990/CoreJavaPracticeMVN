package com.cdk.gist.concurrency.deadlock;


// Deadlock oocurs here
public class Fox {
	public void eatAndDrink(Food food, Water water) {
		synchronized (food) {
			System.out.println("Got Food!");
			move();
			synchronized (water) {
				System.out.println("Got Water!");
			}
		}
	}

	public void drinkAndEat(Food food, Water water) {
		synchronized (water) {
			System.out.println("Got Water!");
			move();
			synchronized (food) {
				System.out.println("Got Food!");
			}
		}
	}

	public void move() {
		try {

			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
