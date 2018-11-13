package com.cdk.companies.credit;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
	public Main() {
		System.out.println("Inside main method");
	}
	
	public void abc() throws Exception{
		
	}
	
	static class ABC{
		public ABC() {
			System.out.println("Inside ABC Constructor");
		}
	}

	private static int i=10;
	private static String name="kapil";
	static{
		i=20;
	}
	public static void main(String[] args) throws Exception {
		System.out.println(i+" "+name);
		Main.ABC abc=new Main.ABC();
		
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("D");
		
		List<String> strList=new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		
		treeSet.removeAll(strList);
		
		System.out.println(treeSet);
		
		
	}
}
