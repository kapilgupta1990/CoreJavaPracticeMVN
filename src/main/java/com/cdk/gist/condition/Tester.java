package com.cdk.gist.condition;

public class Tester {
	public static void main(String[] args) {
		int marks = 265;

		if (marks < 50) {
			System.out.println("fail");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A grade");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("Invalid");
		}

		int number = 30;
		switch (number) {
		default:
			System.out.println("Not in 10, 20 or 30");
			
		case 10:
			System.out.println("10");
//			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
//			break;
			
		
		}

	}

}
