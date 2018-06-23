package com.cdk.gist.generic;

public class ShippableTesting {

	public static void main(String[] args) {
		Men men=new Men();
		Shippable<Men> shipp=new ShippableRobot<>();
		shipp.ship(men);
	}
}
