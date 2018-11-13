package com.cdk.gist.thread;

public class MyRunnable implements Runnable {

	
	@Override
	public void run() {
		
		while(true){
			
				System.out.println("Running");
				//Thread.sleep(1000);
//				if(Thread.currentThread().isInterrupted()){
//					System.out.println("Interrupted");
//					return;
//				}
			
		}

	}
	public static void main(String[] args) {
		Thread t=new Thread(new MyRunnable());
		t.start();
		t.interrupt();
		
		
	}

}
