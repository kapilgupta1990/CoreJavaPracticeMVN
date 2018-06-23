package com.cdk.gist.processbuilder;

import java.io.IOException;

public class ProcessBuilderTest {

	public static void main(String[] args) throws IOException {
//
//		String str="ls -a /Users/guptak/git";
//		Process process=new ProcessBuilder(str).start();
//		byte [] byteArray=new byte[110];
//		process.getOutputStream().write(byteArray);
//		System.out.println(byteArray.toString());
		
		double d=1234567.1234567890d; // upto 15
		float f=1234567.1234567892345678345678f; // Float can measure till 8 digits
		System.out.println(d); // 13 default 
		System.out.println(f);  // 4 default
	}
}
