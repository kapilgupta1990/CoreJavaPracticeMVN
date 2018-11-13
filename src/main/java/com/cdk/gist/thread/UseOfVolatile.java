package com.cdk.gist.thread;

import java.util.concurrent.ThreadFactory;

class MyMain extends Thread {

	private String name;

	@Override
	public void run() {
		
		name = "Mahesh";
		name=name+"Gupta";
		System.out.println(name);
	}

	public String getName1() {
		return name;
	}

	public void setName1(String name) {
		this.name = name;
	}

}

public class UseOfVolatile {

	public static void main(String[] args) {
		ThreadFactory tf=new ThreadFactory() {
			
			@Override
			public Thread newThread(Runnable r) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		//tf.

		MyMain myMain=new MyMain();
		Thread t1 = new MyMain();
		Thread t2 = new MyMain();
		t1.start();
		t2.start();
		
	}

	
}
