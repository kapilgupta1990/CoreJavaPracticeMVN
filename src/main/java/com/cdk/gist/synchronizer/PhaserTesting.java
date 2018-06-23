package com.cdk.gist.synchronizer;

import java.util.concurrent.Phaser;

class LongRunningAction extends Thread {
	private String threadName;
	private Phaser phaser;
	public LongRunningAction(String threadName,Phaser phaser) {
		this.threadName=threadName;
		this.phaser=phaser;
		//phaser.register();
	}
	@Override
	public void run() {
		System.out.println("Arrived ...."+threadName);
		phaser.arriveAndAwaitAdvance();
		System.out.println("Done");
	}
}

public class PhaserTesting {

	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);
		phaser.bulkRegister(2);
		System.out.println("Get registered Parties"+phaser.getRegisteredParties());
		System.out.println("Get Arrived Parties"+phaser.getArrivedParties());
		LongRunningAction lra1=new LongRunningAction("Thread 1", phaser);
		LongRunningAction lra2=new LongRunningAction("Thread 2", phaser);
		LongRunningAction lra3=new LongRunningAction("Thread 3", phaser);
		System.out.println("Get registered Parties"+phaser.getRegisteredParties());
		System.out.println("Get Arrived Parties"+phaser.getArrivedParties());
		lra1.start();
		lra2.start();
		lra3.start();
	}
}
