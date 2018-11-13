package com.cdk.gist.optional;
/*
 * https://www.oracle.com/technetwork/articles/java/java8-optional-2175753.html
 */
import java.util.Optional;

import javax.swing.plaf.OptionPaneUI;
class Person{
	
}
public class OptionalClass {

	public static void main(String[] args) {

		Optional<String> optional=Optional.empty();
		
		System.out.println(optional.isPresent());
		Optional<String> optional1=Optional.of("name");
		System.out.println(optional1.isPresent());
		
//		Optional<String> optional3=Optional.of(null);
		Optional<String> optional3=Optional.ofNullable(null);
		System.out.println(optional3.isPresent());
		
		
		
		
		Optional<Person> optionalPerson=Optional.empty();
		System.out.println(optionalPerson);
		
		Person p=new Person();
		Optional<Person> pOptional=Optional.of(p);
		System.out.println(pOptional.isPresent());
	}
}
