package com.cdk.gist.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTesting {

	public static void main(String[] args) {
		List<String> myString=Arrays.asList("kapil","gupta","is","a","good","boy");
		System.out.println("Count "+myString.stream().count());
		//myString.stream().filter(()->"kapil").
		
	}
}
