package com.cdk.gist.String;

import java.nio.charset.Charset;

public class StringTest {

	public static void main(String[] args) {

		String str="ThiA is kapil gupta";
		System.out.println(str.matches("gupta"));
		System.out.println(str.matches("This is kapil gupta"));
		System.out.println(str.matches("[a-z]+"));
		//str.
		
		
		String str1="gupta is";
		
		System.out.println(str.regionMatches(14, str1, 0, 5));
		
		System.out.println(str.codePointAt(3)); // It returns the unicode number
		System.out.println(str.contentEquals("kapil"));
		String str2=str.intern();
		System.out.println(str1==str2);
		
		
		
		
		
		// Interm method
		String str3=new String("Hi kapil");
		String str4=str3.intern();
		String str5=str3.intern();
		System.out.println(str3==str4);
		System.out.println(str4==str5);
		
		
	//	str.
		String joinedString=str.join("|", new String[]{"kapil","gupta","is","a","good","boy",null});
		System.out.println(joinedString);
		//str.joi
		
		//str.
		
	//	new ProcessBuil
		
		
		
	}
}
