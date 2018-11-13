package com.cdk.gist.collection;

import java.util.HashMap;

class Student{
	String name;
}
public class HashCodeTesting {

	public static void main(String[] args) {

		String kapil1=new String("kapil");
		String kapil2=new String("kapil");
		String kapil3="kapil3";
		String kapil4="kapil3";
		System.out.println(kapil1==kapil2);
		System.out.println(kapil1.hashCode()+" "+kapil3.hashCode()+" "+kapil4.hashCode());
		
		Student student1=new  Student();
		student1.name="kapil";
		HashMap<Student,Integer> students=new HashMap<>();
		students.put(student1, 20);
		System.out.println(students.get(student1));
		student1.name="mahesh";
		System.out.println(students.get(student1));
		
		
	}
}
