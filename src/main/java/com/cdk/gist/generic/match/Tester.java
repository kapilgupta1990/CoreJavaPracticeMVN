package com.cdk.gist.generic.match;

public class Tester {

	public static void main(String[] args) {
		MathContext<Number, Number> op1=new AddOperaton<>();
		op1.doOPeration(new Integer(10), new Integer(20));
		System.out.println(((AddOperaton)op1).makeOPeration(new Integer(10), new Integer(20)));
		op1.doOperationV1(new String("kaill"),new String ("gupta"),new Integer(50));
	}
}
