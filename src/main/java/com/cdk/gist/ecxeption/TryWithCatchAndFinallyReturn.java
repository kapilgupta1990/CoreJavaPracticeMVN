package com.cdk.gist.ecxeption;

public class TryWithCatchAndFinallyReturn {

	public int divide(int asc, int desc){
		try{
			int result=asc/desc;
			return 1;
		}
		catch(Exception exp){
			System.out.println("Exception ex");
			return 2;
		}
		finally {
			System.out.println("Finally");
			return 3;
		}
	}
	public static void main(String[] args) {
		TryWithCatchAndFinallyReturn obj=new TryWithCatchAndFinallyReturn();
		int return1=obj.divide(12,2);
		System.out.println(return1);
		System.out.println(obj.divide(12,0));
	}
}
