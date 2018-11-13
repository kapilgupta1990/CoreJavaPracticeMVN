package com.cdk.gist.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class FindNameOfEmployeeWithAgeMoreThen25 {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee("kapil", 28), new Employee("SHristi", 25),
				new Employee("Ravi", 22)

		);
		Predicate<? super Employee> p=(e)->{ return e.getAge()>25;};
		List<Employee> count=list.stream().filter((e)->{ return e.getAge()>25;}).collect(Collectors.toList());
		List<String> strList=list.stream().filter((e)->{ return e.getAge()>=25;}).map(e->e.getName()).collect(Collectors.toList());
		System.out.println(strList);
	}
}
