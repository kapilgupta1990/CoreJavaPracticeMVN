package com.cdk.companies.ubs;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {

		String str = "This is kapil gupta";
		//char ch=new char{str};
		//str.split(regex)
		char[] strArray = str.toCharArray();
		 //System.out.println(reverse(strArray, 0, strArray.length - 1));
		//System.out.println(split(reverse(strArray, 0, strArray.length - 1), 0, strArray.length - 1));
		 
		 List<String> strList=splitIntoStringArray(strArray,0,strArray.length-1);
		 for(String word:strList){
			 System.out.println(word);
		 }
	}

	private static char[] reverse(char[] arr, int startIndex, int EndIndex) {

		for (int i = startIndex, j = EndIndex; i <= j; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}
		return arr;
	}

	private static char[] split(char[] arr, int startEndex, int endIndex) {
		// String str=new String()

		int beginningIndex = 0;
		for (int i = startEndex; i <= endIndex; i++) {
			beginningIndex = i;
			while (i <= endIndex && arr[i] != ' ') {
				i++;
			}
			reverse(arr, beginningIndex, i - 1);

		}
		return arr;
	}
	private static List<String> splitIntoStringArray(char[] arr, int startEndex, int endIndex) {

		List<String> strList=new ArrayList();
		int beginningIndex = 0;
		for (int i = startEndex; i <= endIndex; i++) {
			beginningIndex = i;
			while (i <= endIndex && arr[i] != ' ') {
				i++;
			}
			strList.add(new String(arr, beginningIndex, i -beginningIndex));

		}
		return strList;
	}

}
