package com.cdk.gist.ecxeption;

class Exception1 extends Exception{
	public Exception1(String message) {
		
	}
}

public class SuppressedExceptionExample {
	public static void m1() {
		System.out.println("Inside ma1");
		throw new NullPointerException();
	}
	public static void m2() throws Exception{
		try{
			System.out.println("Inside m2");
			m1();
		}
		catch(Exception e){
			throw new Exception("Error from m2",e);
		}
	}
	public static void m3() throws Exception{
		try{
			System.out.println("Inside m3");
			m2();
		}
		catch(Exception e){
			throw new Exception("Error from m3",e);
		}
	}
	public static void main(String[] args){
		try {
			m3();
		} catch (Exception e) {
			System.out.println(e.getCause());
			//e.
		}
	}
}
