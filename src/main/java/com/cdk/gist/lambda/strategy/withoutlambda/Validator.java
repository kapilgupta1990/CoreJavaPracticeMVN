package com.cdk.gist.lambda.strategy.withoutlambda;

public class Validator {

	private ValidationStrategy validationStrategy;

	public Validator(ValidationStrategy validationStrategy) {
		super();
		this.validationStrategy = validationStrategy;
	}
	public boolean validate(String s){
		return validationStrategy.execute(s);
	}
	
}
