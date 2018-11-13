package com.cdk.gist.access.specifier.sub;

import com.cdk.gist.access.specifier.msuper.Super;

public class Sub extends Super {

	void display() {
		System.out.println("Sub class display");
		//super.di
	}

	@Override
	public void display1() {
		System.out.println("Sub class display1");
	}

	@Override
	protected void display2() {
		System.out.println("Sub class display2");
	}

	private void display3() {
		System.out.println("Sub class display3");
	}

}
