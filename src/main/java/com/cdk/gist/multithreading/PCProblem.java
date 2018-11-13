package com.cdk.gist.multithreading;

import java.util.Queue;

class PC {

	//Qu[] names;
	public synchronized void produces() throws InterruptedException {

		while (true) {
			//System.out.println("Produces "+(i));
			wait();
			notify();
		}
	}

	public synchronized void consumes() throws Throwable {

		while (true) {
			
			//Collection<String> coll;

			//wait();
		}
	}
}

public class PCProblem {

	public static void main(String[] args) {
		PC pc=new PC();
		//Queue<String> queue=new LInk
		//pc.names=new String[4];
	}
}
