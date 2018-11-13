package com.cdk.gist;

public class FindSubString {

	public static void main(String[] args) {
		int palindromeCount=0;
		String str = "11223344332211";
		for (int i = 0; i < str.length(); i++) {

			for (int j = i; j < str.length(); j++) {

				int k = i;
				StringBuilder sb = new StringBuilder();
				while (k <= j) {
					sb.append(str.charAt(k));
					k++;
				}
				if(sb.toString().equals(sb.reverse().toString())){
					System.out.println(sb.toString());
					palindromeCount++;
				}

			}
		}
		System.out.println("Count "+palindromeCount);
	}
}
