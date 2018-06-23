package com.cdk.gist.generic;

public class MathClass<T extends Number> {

	@SuppressWarnings("unchecked")
	public T add(T t1, T t2) {
		if (t1.getClass() == Integer.class) {
			return (T) (Integer) (t1.intValue() + t2.intValue());
		}
		return null;
	}
	public T delete(T t1, T t2) {
		if (t1.getClass() == Integer.class) {
			return (T) (Integer) (t1.intValue() + t2.intValue());
		}
		return null;
	}

	public static void main(String[] args) {
		MathClass<Integer> mathClass=new MathClass<>();
		System.out.println(mathClass.add(10,20));
		MathClass<Double> mathClass1=new MathClass<>();
		System.out.println(mathClass1.add(20.5,20.5));
	}
}
