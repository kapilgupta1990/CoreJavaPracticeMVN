package com.cdk.gist.iterator;

import java.util.Iterator;

public class FabnociSeriesCustomIterator implements Iterator<Integer> {

	private int count;
	private int index=0;

	public FabnociSeriesCustomIterator(int count) {
		this.count = count;
	}

	@Override
	public boolean hasNext() {
		return index<count ? true :false;
	}

	@Override
	public Integer next() {
		return getFebnoiiNumber(index++);
		
	}

	private Integer getFebnoiiNumber(int index) {
		if (index == 0 || index == 1)
			return 1;
		return getFebnoiiNumber(index - 1) + getFebnoiiNumber(index - 2);
	}

	public static void main(String[] args) {

		FabnociSeriesCustomIterator fsci=new FabnociSeriesCustomIterator(10);
//		System.out.println(fsci.getFebnoiiNumber(0));
//		System.out.println(fsci.getFebnoiiNumber(1));
//		System.out.println(fsci.getFebnoiiNumber(2));
//		System.out.println(fsci.getFebnoiiNumber(3));
//		System.out.println(fsci.getFebnoiiNumber(4));
//		while(fsci.hasNext()){
//			System.out.println(fsci.next());
//		}
		FabnociSeriesIterable fsi=new FabnociSeriesIterable(10);
		for(Integer ii :fsi){
			System.out.println(ii);
		}
		
		
	}

}
