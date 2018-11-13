package com.cdk.gist.thread.producerconsumer.single;

public class ProducerThread extends Thread {

	private PC pc;
	public ProducerThread(PC pc){
		this.pc=pc;
	}
	@Override
	public void run() {
		for(int i=1;i<100;i++){
			try {
				pc.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
