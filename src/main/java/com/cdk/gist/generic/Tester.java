package com.cdk.gist.generic;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		List<Men> menList=new ArrayList<>();
	//	List<Men> personList=menList;
		
		List<Person> personList=new ArrayList<>();
		for(Person person: menList){
			personList.add(person);
		}
		PersonTester.takePerson(personList);
	}
}
