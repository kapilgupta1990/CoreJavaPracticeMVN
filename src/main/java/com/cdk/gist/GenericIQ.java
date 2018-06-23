//package com.cdk.gist;
//
//import java.util.ArrayList;
//import java.util.List;
//interface chewable {}
//class Gum implements chewable {}
////class Meat implements chewable {}
//interface Chewable {}
//class Meat implements Chewable {}
//public class GenericIQ {
//	public static void main(String[] args) {
//			
//		
//		//List<String> list = new ArrayList<String>();
//		//List<Object> list = new ArrayList<String>();
//		List<?> list = new ArrayList<String>();
//		//list.add(new String(""));
//		//list.
//		//List<? extends Object> list = new ArrayList<String>();
//		//List list = new ArrayList<?>();
//		//List list = new ArrayList<String>();
//		//List list1 = new ArrayList<chewable>();// line 1
////		list1.add(new Gum());// line 2
////		list1.add(new Meat());// line 3
////		list1.add(new Integer(9));// line 4
////		System.out.println(list1.size());// line 5
//	
//
//		List<? extends Chewable> list1 = new ArrayList<Meat>(); // Line 11
//		List<Chewable> list2 = new ArrayList<Chewable>(); // Line 13
//		Meat meat = new Meat();
//		//list1.add(meat); // Line 17
//		list2.add(meat); // Line 19
//	}
//}
