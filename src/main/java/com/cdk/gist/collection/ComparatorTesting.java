package com.cdk.gist.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

public class ComparatorTesting {

	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack", 7));
		ducks.add(new Duck("Puddles", 10));
		Collections.sort(ducks);
		System.out.println(ducks);
		
		Collections.sort(ducks, new DuckComparator());
		System.out.println(ducks);
	}
}
class DuckComparator implements Comparator<Duck>{

	@Override
	public int compare(Duck o1, Duck o2) {
		
		if(o1.getWeight()==o2.getWeight())
			return 0;
		int returnValue=o1.getWeight()<o2.getWeight() ? 1 :-1;
		return returnValue;
	}
	
}
class Duck implements Comparable<Duck>{
	private String name;
	private int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Duck d) {
		return name.compareTo(d.name);
	}
}
