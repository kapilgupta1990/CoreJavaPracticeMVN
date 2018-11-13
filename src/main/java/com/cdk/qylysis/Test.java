package com.cdk.qylysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello world");
		List <Integer> arrayList=new ArrayList<>();
		arrayList.add(6);
		arrayList.add(6);
		arrayList.add(1);
		arrayList.add(6);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(6);
		arrayList.add(8);
		int pos=2;
		
		int speed=arrayList.get(2);
		//System.out.println(speed);
		int collision=0;
		for(int i=0;i<pos;i++){
			if(arrayList.get(i)>speed)
				collision++;
		}
		for(int i=pos;i<arrayList.size();i++){
			if(arrayList.get(i)<speed)
				collision++;
		}
		System.out.println(collision);
		
		
	}
	
	public static int sort(List <Integer> arrayList){
		int sum=0;
		if(arrayList.size()==1)
			return  0;
		Collections.sort(arrayList);
		 sum=arrayList.get(0)+arrayList.get(1);
		arrayList.remove(0);
		arrayList.remove(0);
		arrayList.add(sum);
		return sum+sort(arrayList);
		
	}
}
