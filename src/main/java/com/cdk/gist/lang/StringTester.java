package com.cdk.gist.lang;

public class StringTester {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		
		StringBuffer sbf1 = new StringBuffer("abc");
		StringBuffer sbf2 = new StringBuffer("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sbf1==sbf2);
		System.out.println(sbf1.equals(sbf2));
	}
}
