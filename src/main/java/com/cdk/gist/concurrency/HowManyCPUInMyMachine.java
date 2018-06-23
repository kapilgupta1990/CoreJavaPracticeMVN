package com.cdk.gist.concurrency;

public class HowManyCPUInMyMachine {

	public static void main(String[] args) {

		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
