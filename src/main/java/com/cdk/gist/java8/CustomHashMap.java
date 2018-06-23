package com.cdk.gist.java8;

import java.util.Map;
import java.util.Objects;

public class CustomHashMap<K,V> {

	private static final float DEFAULT_LOAD_FACTOR = 0;
	static final int MAXIMUM_CAPICITY = 1 << 30;
	private float loadFactor;
	private Object threshold;
	transient Node<K,V>[] table;
	static class Node<K, V> {
		final int hash;
		final K key;
		V value;
		Node<K, V> next;

		Node(int hash, K key, V Value, Node next) {
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.next = next;
		}

		public final K getKey() {
			return key;
		}

		public final V getValue() {
			return value;
		}

		public final String toString() {
			return key + "=" + value;
		}

		public final int hashCode() {
			return Objects.hashCode(key) ^ Objects.hashCode(value);
		}

		public final V setValue(V newValue) {
			V oldValue = value;
			value = newValue;
			return oldValue;
		}

		public final boolean equals(Object o) {
			if (o == this)
				return true;
			if (o instanceof Node) {
				Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
				if (Objects.equals(key, e.getKey()) && Objects.equals(value, e.getValue()))
					return true;
			}
			return false;
		}
	}

	public CustomHashMap(int initialCapicity, float loadFactor) {
		if (initialCapicity < 0)
			throw new IllegalArgumentException("Illegal Initial Capacity " + initialCapicity);
		if (initialCapicity > MAXIMUM_CAPICITY) {
			initialCapicity = MAXIMUM_CAPICITY;
		}
		if (loadFactor < 0 || Float.isNaN(loadFactor))
			throw new IllegalArgumentException("illegal load Factor " + loadFactor);

		this.loadFactor = loadFactor;
		this.threshold = tableSizeFor(initialCapicity);

	}

	public CustomHashMap(int initialCapicity) {
		this(initialCapicity, DEFAULT_LOAD_FACTOR);

	}

	public CustomHashMap() {
		this.loadFactor = DEFAULT_LOAD_FACTOR;
	}

	private Object tableSizeFor(int initialCapicity) {
		// TODO Auto-generated method stub
		return null;
	}
	 public V put(K key, V value) {
	        return putVal(hash(key), key, value, false, true);
	    }

	private V putVal(int hash, K key, V value, boolean b, boolean c) {
		Node<K,V> []tab;
		tab=table;
        int n;
		if ((tab = table) == null || (n = tab.length) == 0)
			n = (tab = resize()).length;

		
		return null;
	}

	private Node<K, V>[] resize() {
		// TODO Auto-generated method stub
		return null;
	}

	private int hash(K key) {
		return Objects.hash(key);
	}
}
