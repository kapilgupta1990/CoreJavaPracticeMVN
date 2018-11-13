package com.cdk.gist.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapSorting {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(11, "kapil");
		map.put(18, "ramesh");
		map.put(8, "suresh");
		
		Iterator<Map.Entry<Integer,String>> entryItarator=map.entrySet().iterator();
		while(entryItarator.hasNext()){
			Entry<Integer,String> entry=entryItarator.next();
			System.out.println("Key "+entry.getKey()+" Value:"+entry.getValue());
		}
		System.out.println();
		TreeMap<Integer, String> treeMap=new TreeMap<>(map);
		
		Iterator<Map.Entry<Integer,String>> entryItarator1=treeMap.entrySet().iterator();
		while(entryItarator1.hasNext()){
			Entry<Integer,String> entry=entryItarator1.next();
			System.out.println("Key "+entry.getKey()+" Value:"+entry.getValue());
		}
		
		treeMap.put(8, "Rahul");
		
		
		// After sorting
		
		System.out.println("Hash map");
		entryItarator=map.entrySet().iterator();
		while(entryItarator.hasNext()){
			Entry<Integer,String> entry=entryItarator.next();
			System.out.println("Key "+entry.getKey()+" Value:"+entry.getValue());
		}
		System.out.println();
		
		System.out.println("Tree map");
		entryItarator=treeMap	.entrySet().iterator();
		while(entryItarator.hasNext()){
			Entry<Integer,String> entry=entryItarator.next();
			System.out.println("Key "+entry.getKey()+" Value:"+entry.getValue());
		}
		
		
		
		
		
		
		
		

//		Set<Entry<Integer, String>> entries = map.entrySet();
//		Iterator<Entry<Integer, String>> iterator = entries.iterator();
//
//		List<Entry<Integer, String>> list = new ArrayList<>();
//		while (iterator.hasNext()) {
//			list.add(iterator.next());
//
//		}
//		
//		for(Entry<Integer,String> entry: list){
//			System.out.println(entry.getKey()+" "+entry.getValue());
//			
//		}
//		Collections.sort(list, new MyComparator());
//		System.out.println();
//		for(Entry<Integer,String> entry: list){
//			System.out.println(entry.getKey()+" "+entry.getValue());
//			
//		}
		

	}

}

class MyComparator implements Comparator<Entry<Integer, String>> {

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		if (o1.getKey().compareTo(o2.getKey()) == 0) {
			return o1.getValue().compareTo(o2.getValue());
		} else
			return o1.getKey().compareTo(o2.getKey());
	}

}
