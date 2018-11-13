package com.cdk.gist.thread;

public class Machine {

	public synchronized  void printMymachine(String threadName){
		
		System.out.println("Machine name "+threadName);
	}
}
