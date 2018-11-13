package com.cdk.gist.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{

	private String name;
	private int age;
	private Employee(){
		
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		String data=name+","+age;
		out.writeBytes(data);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		String str[]=in.readLine().split(",");
	    name=str[0];
	    age=Integer.parseInt(str[1]);
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=").append(name).append(", age=").append(age).append("]");
		return builder.toString();
	}
	
	
}
