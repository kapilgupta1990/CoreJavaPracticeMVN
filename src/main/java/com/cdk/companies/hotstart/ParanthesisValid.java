package com.cdk.companies.hotstart;

import java.util.Stack;

public class ParanthesisValid {

	public static void main(String[] args) {
		String str = "[{}][{}]";

		char BIG_CLOSING_BRACKET = ']';
		char CURLY_CLOSING_BRACKET = '}';

		char BIG_OPENING_BRACKET = '[';
		char CURLY_OPENING_BRACKET = '{';
		char[] mArray = str.toCharArray();

		// 1 st check

		Stack<Character> stack=new Stack<>();
		for (char ch : mArray) {
			// Case 1:
			if(stack.isEmpty() && (ch==BIG_CLOSING_BRACKET || ch==CURLY_CLOSING_BRACKET))
			{
				System.out.println("Invalid input");
				return;
			}
			
			if(ch==BIG_OPENING_BRACKET|| ch==CURLY_OPENING_BRACKET){
				stack.push(ch);
			}
			
			if(ch==BIG_CLOSING_BRACKET || ch==CURLY_CLOSING_BRACKET){
				
				if(stack.isEmpty()){
					System.out.println("Invalid Input");
					return;
				}else{
					
					
				}
			}
			
			
			
			
		}
	}
}
