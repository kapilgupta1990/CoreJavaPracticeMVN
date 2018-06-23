package com.cdk.gist.generic;

import java.util.ArrayList;
import java.util.List;

public class UnboundedTesting {

	public static void printData(List<Object> list) {
		for (Object obj : list) {
			System.out.print(obj + "::");
		}
	}
	public static void printData1(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + "::");
		}
	}

	public static void main(String[] args) {

		List<Number> numberList=new ArrayList<>();
		//printData(numberList);
		printData1(numberList);
	}
}
