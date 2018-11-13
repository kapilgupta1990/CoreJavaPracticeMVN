package com.cdk.gist.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class MyRunnable implements Runnable {

	private boolean flag;
	
	public MyRunnable(boolean flag) {
		this.flag=flag;
	}
	@Override
	public void run() {
		// Relyed on interruption
		
		while(flag){
			int sum=0;
			for(int i=0;i<1000;i++){
				sum=sum+i;
			}
			System.out.println("Sum ="+sum);
		}
		System.out.println("Interruption Occured for "+Thread.currentThread().getName());

	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	
	public void cancel(){
		
	}
	

}

public class ExecuterFrameworkTester {

	public static void main(String[] args) throws InterruptedException {
		ThreadFactory tf=new  ThreadFactory() {
			
			@Override
			public Thread newThread(Runnable r) {
				return new Thread(r){
					@Override
					public void interrupt() {
						
						super.interrupt();
						//r.c
						
					}
				};
			}
		};
		//tf.
		
		ExecutorService es=Executors.newSingleThreadExecutor();
		MyRunnable mr=new MyRunnable(true);
		Thread t=new Thread(mr);
		Thread t1=new Thread(mr);
		t.start();
		t1.start();
		Thread.sleep(10);
		mr.setFlag(false);

		//Future<?> future=es.submit(mr);
//		future.cancel(true);
	}
}
