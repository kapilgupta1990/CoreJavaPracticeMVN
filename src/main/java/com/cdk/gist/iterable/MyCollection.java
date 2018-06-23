package com.cdk.gist.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollection<E> implements Iterable<E> {

	List<E> collection = new ArrayList<E>();

	public void addElement(E e) {
		collection.add(e);
	}
	public E getElement(int index){
		return collection.get(index);
		
	}

	@Override
	public Iterator<E> iterator() {
		return new MyIterator<E>();
	}

	private class MyIterator<E> implements Iterator<E> {

		int index=0;
		@Override
		public boolean hasNext() {

			return index<collection.size()?true:false;
		}

		@Override
		public E next() {
			return (E) getElement(index++);
		}

	}
}
