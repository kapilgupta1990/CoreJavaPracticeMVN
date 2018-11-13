package com.cdk.gist.ecxeption;

public class TryWithFinally {

	public static void main(String[] args) {
		
		try{
			System.out.println("Inside try block");
			int i=1/0;
			
		}
		finally{
			System.out.println("Inside finally block");
		}
	}
}
