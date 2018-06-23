package com.cdk.gist.operator;
/*
 * https://stackoverflow.com/questions/15457893/java-right-shift-on-negative-number
 * Two's Complement to Decimal Conversion

 */
public class BitwiseOperator1 {

	public static void main(String[] args) {
		int x=-4;
		System.out.println(Integer.toBinaryString(x));
		int y=4;
		System.out.println(Integer.toBinaryString(y));
		x=x>>1;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(x);
		
		
	}
}
