package com.cdk.gist.generic;

import java.util.List;

public class PersonTester {

	public static void takePerson(List<? extends Person> persons) {

		for (Person person : persons) {
			person.printMe();
		}

	}

	// public static void takePerson(List persons) {
	//
	// for (Object object : persons) {
	// // To avoid type casting
	// Person person = (Person) object;
	// person.printMe();
	// }
	//
	// }

	public static void main(String[] args) {
		List<Men> menList = null;
		List<Women> womenList = null;
		takePerson(menList);

		// After erasure
	}
}
