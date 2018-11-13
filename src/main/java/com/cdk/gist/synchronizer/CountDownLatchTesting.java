package com.cdk.gist.synchronizer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Manager {

	public void performTask() {
		CountDownLatch countDownLatch = new CountDownLatch(2);
		Task task = new Task();
		ExecutorService es = Executors.newCachedThreadPool();
		es.submit(new DeveloperThread(task, countDownLatch));
		es.submit(new DeveloperThread(task, countDownLatch));
		es.submit(new QAThread(task, countDownLatch));
		es.submit(new DeploymentThread(task, countDownLatch));
		es.shutdown();
		// es.
	}

}

class DeveloperThread implements Runnable {

	private Task task;
	private CountDownLatch countDownLatch;

	public DeveloperThread(Task task, CountDownLatch countDownLatch) {
		this.task = task;
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {

		System.out.println("Developer..started work" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Developer Finished work");
		countDownLatch.countDown();

	}

}

class QAThread implements Runnable {

	private Task task;
	private CountDownLatch countDownlatch;

	public QAThread(Task task, CountDownLatch countDownlatch) {
		this.task = task;
		this.countDownlatch = countDownlatch;
	}

	@Override
	public void run() {
		System.out.println("Ready for testing : Waiting for development work finished");
		try {
			countDownlatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Testing start");
		System.out.println("Testing Finished");

	}

}

class DeploymentThread implements Runnable {

	private Task task;
	private CountDownLatch countDownlatch;

	public DeploymentThread(Task task, CountDownLatch countDownlatch) {
		this.task = task;
		this.countDownlatch = countDownlatch;
	}

	@Override
	public void run() {
		System.out.println("Ready for deployment : Waiting for development work finished");
		try {
			countDownlatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Deployment start");
		System.out.println("Deployment  Finished");

	}

}

public class CountDownLatchTesting {

	public static void main(String[] args) throws InterruptedException {

		Manager manager = new Manager();
		manager.performTask();

	}
}
