package com.cdk.gist.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapOperations {

	public static void main(String[] args) {
		Map<String, String> names = new HashMap<>();
		names.put("kapil", "kapil");
		names.put("ramesh", "ramesh");
		names.put("suresh", "suresh");
		names.put("radhe", "radhe");
		Map<String, String> synchronizedNames=Collections.synchronizedMap(names);

		synchronizedNames.put("Jagdeesh", "Jagdeesh");
		Iterator<Entry<String, String>> iterator = names.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		SortedMap<String, String> sortedMap = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		sortedMap.putAll(names);
		System.out.println();
		Iterator<Entry<String, String>> sortedMapiterator = sortedMap.entrySet().iterator();
		while (sortedMapiterator.hasNext()) {
			Entry<String, String> entry = sortedMapiterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		
	}
}
