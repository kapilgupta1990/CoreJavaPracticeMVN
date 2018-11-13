package com.cdk.gist.generic.match;

public class AddOperaton<T1 extends Number, T2 extends Number, E extends Number> implements MathContext<T1, T2> {

	@Override
	public void doOPeration(T1 t1, T2 t2) {
		System.out.println(t1.doubleValue() + t2.doubleValue());

	}

	public E makeOPeration(T1 t1, T2 t2) {
		E e = (E) new Double(t1.doubleValue() + t2.doubleValue());
		return e;

	}

	@Override
	public <T1, T2, T3> void doOperationV1(T1 t1, T2 t2, T3 t3) {
		System.out.println(t1.toString()+t2.toString()+t3.toString());
		
	}

}
