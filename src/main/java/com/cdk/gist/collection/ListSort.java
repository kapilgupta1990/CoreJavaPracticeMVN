package com.cdk.gist.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {

		List<String> mList = Arrays.asList(new String("kapil"), new String("ram"), new String("mahesh"),
				new String("suresh"));
		for (String str : mList) {
			System.out.println(str);
		}
		Collections.sort(mList);
		// Collections.sort(mList, );
		System.out.println();
		for (String str : mList) {
			System.out.println(str);
		}
		//Collections.
	}
}
