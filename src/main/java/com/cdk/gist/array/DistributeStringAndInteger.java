package com.cdk.gist.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DistributeStringAndInteger {

	public static void main(String[] args) {

		String str = "ka,5,pi,l,9,1";
		List<String> alphabet = new ArrayList<>();
		List<Integer> integers = new ArrayList<>();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			String temp = "";
			while (i < charArray.length && charArray[i] != ',') {
				temp = temp + charArray[i];
				i++;
			}
			try {
				integers.add(Integer.parseInt(temp));
			} catch (NumberFormatException nfe) {
				alphabet.add(temp);
			}

		}
		// Sort both
		sortList(alphabet);
		Collections.sort(integers);
		System.out.println(alphabet);
		System.out.println(integers);
	}
	
	private static List<String> sortList(List<String> list){
		
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size()-1;j++){
				if((list.get(j).compareTo(list.get(j+1)))>0){
					String swap=list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, swap);
				}
			}
		}
		return list;
	}
}
