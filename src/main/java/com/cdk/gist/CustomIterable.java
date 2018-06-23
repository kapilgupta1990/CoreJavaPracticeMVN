package com.cdk.gist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomIterable extends ArrayList<Integer> {
	List list = new ArrayList<>();

	public CustomIterable() {
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
	}

	public static void main(String[] args) {
		CustomIterable cii = new CustomIterable();
		Iterator ci = cii.list.iterator();
		while (ci.hasNext()) {
			System.out.println(ci.next());
		}
		System.out.println("End");

	}
	@Override
	public Iterator<Integer> iterator() {
	return new CustomIterator(list);
	}

}
