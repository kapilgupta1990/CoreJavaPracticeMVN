package com.cdk.gist.collection.hashmapchangingkey;

import java.util.HashMap;
import java.util.Map;

public class Tester {

	public static void main(String[] args) {
		// Non immutavble example
		Map<Person,String> personMap=new HashMap<>();
		Person person1=new Person(1, "kapil");
		Person person2=new Person(2, "suresh");
		System.out.println(person1.hashCode());
		personMap.put(person1, person1.getPersonName());
		personMap.put(person2, person2.getPersonName());
		System.out.println(personMap.get(person1));
		System.out.println(personMap.get(person2));
		person1.setPersonId(1);
		person1.setPersonName("kapil");
		System.out.println(person1.hashCode());
		System.out.println(personMap.get(person1));
	}
}
