package com.cdk.gist.lambda.strategy.withlambda;

import com.cdk.gist.lambda.strategy.withoutlambda.Validator;

public class Tester {

	public static void main(String[] args) {
		Validator isNumericValidator=new Validator((s)->{ return s.matches("[0-9]+");});
		boolean bq=isNumericValidator.validate("123");
		boolean b1=isNumericValidator.validate("abc");
		System.out.println(bq+" "+b1);
		Validator lowerCaseValidator=new Validator((String s)->{return s.matches("[a-z]+");});
	}
}
