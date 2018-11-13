package com.cdk.gist.ecxeption;
/*
 * There is nothing like stack overflow exception , but this is stack overflow error.
 * It come when stack size gets fulled.
 */
public class StackOverFlowException {

	static int i=0;
	public void m1(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In main method "+ ++i);
		m1();
	}
	public static void main(String[] args) {

		StackOverFlowException stackOverFlow=new StackOverFlowException();
		stackOverFlow.m1();
	}
}
