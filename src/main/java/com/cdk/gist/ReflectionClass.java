package com.cdk.gist;

public class ReflectionClass extends ReflectionSuperClass implements ReflectionSuperInterface1, ReflectionSuperInterface2{

	static{
		System.out.println("Static block inside reflection");
	}
	private ReflectionClass(){
		System.out.println("Inside default constructor");
	}
	public ReflectionClass(Integer i){
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String method1() {
		// TODO Auto-generated method stub
		return "";
	}
	@Override
	public String method5() {
		// TODO Auto-generated method stub
		return null;
	}
}
