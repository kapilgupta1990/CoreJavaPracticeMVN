package com.cdk.gist.iterator;

import java.util.Iterator;

public class FabnociSeriesIterable implements Iterable<Integer>{

	private int size;
	public FabnociSeriesIterable(int size) {
		this.size=size;
	}
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new FabnociSeriesCustomIterator(size);
	}

}
