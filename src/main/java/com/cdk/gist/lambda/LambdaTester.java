package com.cdk.gist.lambda;

public class LambdaTester {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{System.out.println("Hello kapil");});
		//t1.start();
		

		Thread t2=new Thread(
				()->{for(int i=1;i<20;i++){System.out.println("Hello kapil "+i);}}
				);
		t2.start();
		
	}
}
