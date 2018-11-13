package com.cdk.gist.thread.oddevengenerator;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Number number=new Number();
//		
		EvenPrinter ev=new EvenPrinter(number);
		OddPrinter op=new OddPrinter(number);
		ev.start();
		op.start();
		
		
		//Thread.sleep(1000);
		
	
		
	}
}
