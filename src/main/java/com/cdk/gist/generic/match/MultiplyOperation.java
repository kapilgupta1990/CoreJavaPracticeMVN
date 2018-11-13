package com.cdk.gist.generic.match;

public class MultiplyOperation<T1 extends Number, T2 extends Number> implements MathContext<T1, T2> {

	@Override
	public void doOPeration(T1 t1, T2 t2) {
		System.out.println(t1.doubleValue() * t2.doubleValue());

	}

	@Override
	public <T1, T2, T3> void doOperationV1(T1 t1, T2 t2, T3 t3) {
		// TODO Auto-generated method stub
		
	}

}
