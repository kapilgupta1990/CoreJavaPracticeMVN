package com.cdk.gist.lambda.strategy.withoutlambda;

public class Main {

	public static void main(String[] args) {
		Validator isNumericValidator=new Validator(new IsNumeric());
		boolean bq=isNumericValidator.validate("123");
		boolean b1=isNumericValidator.validate("abc");
		System.out.println(bq+" "+b1);
	}
	
}
