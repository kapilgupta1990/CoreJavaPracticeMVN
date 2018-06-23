package com.cdk.gist.lang;

import java.util.Set;
import java.util.TreeSet;

public class MathTester {

	public static void main(String[] args) {
		int x = -1;
		x = x >> 5;
		System.out.println(x);
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb1.equals(sb2));
		
		//java.util.concurrent.ArrayBlockingQueue<String> ab=new ArrayBlockingQueue<>(0);
		Set set=new TreeSet();
		set.add(new Integer(20));
		set.add(new Integer(10));
		System.out.println(set);

	}

//	void main1(int jj) {
//		 protected int i = 5;
//		class Test {
//			{
//				System.out.println(i);
//				System.out.println(jj);
//			}
//		}
//	}
}
//class A{
//	abstract class B{
//		public void dos(){
//			abstract static class C 
//		}
//	}
//	
//}