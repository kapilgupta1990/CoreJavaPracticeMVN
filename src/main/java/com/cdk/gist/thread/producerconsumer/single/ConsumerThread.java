package com.cdk.gist.thread.producerconsumer.single;

public class ConsumerThread extends Thread {
	private PC pc;

	public ConsumerThread(PC pc) {
		this.pc = pc;
	}

	@Override
	public void run() {
		while (true) {
			try {
				pc.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
