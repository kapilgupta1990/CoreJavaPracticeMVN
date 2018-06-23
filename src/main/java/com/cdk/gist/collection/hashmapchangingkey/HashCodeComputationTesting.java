package com.cdk.gist.collection.hashmapchangingkey;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
/*
 * https://stackoverflow.com/questions/3613102/why-use-a-prime-number-in-hashcode
 */

class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private float salary;
	private Date joiningDate;
	private char[] fatherName;
	private String[] favioratebook;

	@Override
	public int hashCode() {
		int result = 1;
		final int prime = 31;
		result = prime  * result+name.hashCode();
		result = prime  * result+age;
		result = prime  * result+(joiningDate==null? 0: joiningDate.hashCode());
		result = prime  * result+Arrays.hashCode(fatherName);
		result = prime  * result+Arrays.hashCode(favioratebook);
		result = prime  * result+Float.floatToIntBits(salary);
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj.equals(null))
			return false;
		if(!(obj instanceof Employee))
			return false;
		// Now field comparison
		return false;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class HashCodeComputationTesting {

}
