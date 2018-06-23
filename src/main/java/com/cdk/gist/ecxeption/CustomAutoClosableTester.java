package com.cdk.gist.ecxeption;

public class CustomAutoClosableTester {

	public static void main(String[] args) {
		
		try(CustomAutoClosableInterface caci=new CustomAutoClosableInterface()){
			caci.callMe();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
