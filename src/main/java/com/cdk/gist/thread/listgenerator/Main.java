package com.cdk.gist.thread.listgenerator;

class PC {
	private Object object[] = new Object[5];
	int index = 0;

	public synchronized void put(int i) {
		synchronized (object) {

			if (index == object.length)
				try {
					index=0;
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			object[index] = i;
			System.out.println(index+ " Put "+i);
			index++;
			notify();

		}
	}

	public synchronized void get() {
		if (index < object.length)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for (int index = 0; index < object.length; index++) {
			System.out.println(" Get " + object[index]);
		}

		notify();
		index = 0;
	}
}

class ProducerThread extends Thread {
	private PC pc;

	public ProducerThread(PC pc) {
		this.pc = pc;

	}

	@Override
	public void run() {
		for (int i = 1; i < 50; i++)
			pc.put(i);

	}
}

class ConsumerThread extends Thread {
	private PC pc;

	public ConsumerThread(PC pc) {
		this.pc = pc;

	}

	@Override
	public void run() {
		pc.get();

	}
}

public class Main {

	public static void main(String[] args) {
		PC pc=new PC();
		new ConsumerThread(pc).start();
		new ProducerThread(pc).start();
	}

}
