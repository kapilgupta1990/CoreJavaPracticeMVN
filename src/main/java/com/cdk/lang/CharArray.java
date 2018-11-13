package com.cdk.lang;

public class CharArray {

	public static void main(String[] args) {

		char name[]=new char [5];
		name[2]='a';
		name[4]='l';
		for(int i=0;i<name.length;i++)
			System.out.println(name[i]);
		name[3]='\0';
		
		
		
	}
}
