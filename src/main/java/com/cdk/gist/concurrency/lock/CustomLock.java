package com.cdk.gist.concurrency.lock;

public class CustomLock {

	private boolean isLocked = false;

	public synchronized void lock() throws InterruptedException {
		while (isLocked == false)
			wait();
		isLocked = true;
		notify();

	}

	public synchronized void unlock() throws InterruptedException {
		isLocked = false;

	}

}
