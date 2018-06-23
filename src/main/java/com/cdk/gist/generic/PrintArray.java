package com.cdk.gist.generic;

import java.util.Collection;

import javax.swing.JComponent;

public class PrintArray {

	public static void main(String[] args) {
		PrintArray printArray=new PrintArray();
		Integer ints[]=new Integer[]{10,20,30};
		String strs[]=new String[]{"kapil","mahesh","suresh"};
		printArray.printArray(ints);
		System.out.println();
		printArray.printArray(strs);
		System.out.println();
		System.out.println(count(ints,0));
		System.out.println(count(strs,"mahesh"));
	}
	private <E> void printArray(E []e){
		for(E ee: e)
		{
			System.out.println(ee);
		}
	}
	public static int count(String[] array, String item) {
	    int count = 0;
	 
	    if (item == null) {
	        for (String s : array) {
	            if (s == null) count++;
	        }
	    } else {
	        for (String s : array) {
	            if (item.equals(s)) {
	                count++;
	            }
	        }
	    }
	 
	    return count;
	 
	}
	public static <T> int count(T[] array, T item) {
	    int count = 0;
	 
	    if (item == null) {
	        for (T s : array) {
	            if (s == null) count++;
	        }
	    } else {
	        for (T s : array) {
				if (item.equals(s)) {
	                count++;
	            }
	        }
	    }
	 
	    return count;
	 
	}
	
	public static <T> int count(Collection<T> col, T item) {
	    int count = 0;
	 
	    if (item == null) {
	        for (T element : col) {
	            if (element == null) count++;
	        }
	    } else {
	        for (T element : col) {
	            if (item.equals(element)) {
	                count++;
	            }
	        }
	    }
	 
	    return count;
	 
	}
	public static <T  extends Number> int count(Collection<T> col, T item) {
	    int count = 0;
	 
	    if (item == null) {
	        for (T element : col) {
	            if (element == null) count++;
	        }
	    } else {
	        for (T element : col) {
	            if (item.equals(element)) {
	                count++;
	            }
	        }
	    }
	 
	    return count;
	 
	}
	
	public <T extends JComponent & Runnable> int count(Collection<T> col, T item) {
	return 0;
	}
	
}
