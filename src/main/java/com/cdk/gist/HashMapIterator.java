package com.cdk.gist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterator {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("kapil", 10);
		map.put("mahesh", 20);
		map.put("radhe", 30);
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> itr = entries.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
