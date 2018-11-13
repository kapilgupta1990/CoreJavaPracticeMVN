package com.cdk.gist.serialization;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent implements Serializable {

	private int i;
}

class Child extends Parent {

	private int i;
}

public class ParentChildSerilaztionTester {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// Case 1 : When child class imllements serializable , work expected
		// Child child = new Child();
		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream("abc.ser"));
		// oos.writeObject(child);
		// oos.close();

		// Case 2 : When parent class imllements serializable , work expected
		Parent parent = new Parent();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ser"));
		oos.writeObject(parent);
		oos.close();
		
		// Case 3:

	}
}
