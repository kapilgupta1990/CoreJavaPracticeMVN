package com.cdk.gist.operator;

/*
 * & <-- verifies both operands
&& <-- stops evaluating if the first operand evaluates to false since the result will be false

(x != 0) & (1/x > 1) <-- this means evaluate (x != 0) then evaluate (1/x > 1) then do the &. the problem is that for x=0 this will throw an exception.

(x != 0) && (1/x > 1) <-- this means evaluate (x != 0) and only if this is true then evaluate (1/x > 1) so if you have x=0 then this is perfectly safe and won't throw any exception if (x != 0) evaluates to false the whole thing directly evaluates to false without evaluating the (1/x > 1).

EDIT:

exprA | exprB <-- this means evaluate exprA then evaluate exprB then do the |.

exprA || exprB <-- this means evaluate exprA and only if this is false then evaluate exprB and do the ||.
 */
public class BitWiseOperator {

	public static void main(String[] args) {

		String testString = null;
//		if (testString != null & testString.length() > 0) {
//
//		}
		if (testString != null && testString.length() > 0) {

		}
//		if (testString != null | testString.length() > 0) {
//
//		}
		if (testString != null || testString.length() > 0) {

		}
//		if(true & false){
//			System.out.println("TRUE");
//		}else{
//			System.out.println("FALSE");
//		}
	}
}
