package com.cdk.gist.generic;

public class Men extends Person{

	public String getShiffedItem(){
		return "men";
	}

	@Override
	void printMe() {
		System.out.println("Men");
	}
}
