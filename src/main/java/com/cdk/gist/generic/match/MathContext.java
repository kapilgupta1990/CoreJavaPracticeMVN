package com.cdk.gist.generic.match;

public interface MathContext<T1 extends Number, T2 extends Number> {

	public void doOPeration(T1 t1, T2 t2);
	public <T1, T2, T3> void doOperationV1(T1 t1, T2 t2, T3 t3);
}
