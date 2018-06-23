package com.cdk.gist.lambda.strategy.withoutlambda;

public class isAllLowerCase implements ValidationStrategy {

	@Override
	public boolean execute(String s) {
		return s.matches("[a-z]+");
	}

}
