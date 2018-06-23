package com.cdk.gist;

import java.util.Iterator;
import java.util.List;

public class CustomIterator implements Iterator<Integer>{

	private List<Integer> list;
	private int currentIndex=0;
	public CustomIterator(List list) {
		this.list=list;
	}

	@Override
	public boolean hasNext() {
		if(list==null || list.size()==0)
			return false;
		if(currentIndex==list.size())
			currentIndex=1;

        if( currentIndex < list.size()) return true;

		return false;
	}

	@Override
	public Integer next() {
		int index=currentIndex;
		currentIndex=currentIndex+2;
		return list.get(index);
		
	}

}
