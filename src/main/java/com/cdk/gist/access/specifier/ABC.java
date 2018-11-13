package com.cdk.gist.access.specifier;

public class ABC {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void getM1() {
		ABC abc = new ABC();
		abc.setId(1);

	}

	public void getM2() {
		System.out.println("Id " + getId());
	}

	public static void main(String[] args) {
		ABC obj=new  ABC();
		obj.getM1();
	}
	 class CDE{
		
	}
}

