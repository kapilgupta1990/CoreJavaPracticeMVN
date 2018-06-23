package com.cdk.gist.lambda.strategy.withoutlambda;

public class IsNumeric implements ValidationStrategy{

	@Override
	public boolean execute(String s) {
		return s.matches("[0-9]+");
	}

}
