package com.cdk.gist.collection;

import java.lang.Thread.State;

class Count extends Thread {
	@Override
	public void run() {
		for(int i=0;i<12;i++){
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadStateTester {

	public static void main(String[] args) throws InterruptedException {

		Count mThread=new Count();
		mThread.start();
		
		while(mThread.isAlive()){
			Thread.sleep(1000);
			System.out.println(mThread.getState());
			
		}
		//System.out.println(mThread.);
		//mThread.join();
	}
}
