package com.cdk.gist.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalExample {

	public static void main(String[] args) {
		
		Employee emp=new Employee("kapil",25);
		Employee newEMp=null;
		//serialize the car
		try {
		    FileOutputStream fo = new FileOutputStream("/Users/guptak/tmp");
		    ObjectOutputStream so = new ObjectOutputStream(fo);
		    so.writeObject(emp);
		    so.flush();
		} catch (Exception e) {
		    System.out.println(e);
		    System.exit(1);
		}
		// de-serialize the Car
		try {
		    FileInputStream fi = new FileInputStream("/Users/guptak/tmp");
		    ObjectInputStream si = new ObjectInputStream(fi);
//		    byte []b=new byte[0];
//		    si.read(b);
		   newEMp=(Employee) si.readObject();
		}
		catch (Exception e) {
		    System.out.println(e);
		    System.exit(1);
		}
		System.out.println(newEMp);
		System.out.println(emp==newEMp);

	}
}
