package com.cdk.gist;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Application {

	public static void main(String[] args) throws InterruptedException {
//		Thread t=new Thread(new Runnable() {
//			int sum=0;
//			@Override
//			public void run() {
//				while(true)
//					sum=sum+sum;
//			}
//		});
//		t.setName("my-custom-thread");
//		
//		t.start();
//		while (true) {
//			System.out.println("Hello kapil");
//			Thread.sleep(1000);
//		}

		HashMap<String, Integer> k;
		ConcurrentHashMap<String, Integer> chm=new ConcurrentHashMap<>();
		chm.put("kapil", null);
	}
}
