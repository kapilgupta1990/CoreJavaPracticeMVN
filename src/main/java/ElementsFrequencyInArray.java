import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;

class Entries {

	int count;
	int index;
	int val;
	Entries prev;
	Entries next;

	public Entries(int count, int index, int val) {
		super();
		this.count = count;
		this.index = index;
		this.val = val;
	}

}

class BST {

	Entries rootNode;
	ConcurrentHashMap<Integer, String> chm;

	public void insert(Entries entry) {
		if (rootNode == null) {
			rootNode = entry;
			return;
		}
		Entries traversingPointetr = rootNode;
		Entries holdPointer = traversingPointetr;
		while (traversingPointetr != null) {
			holdPointer = traversingPointetr;
			if (traversingPointetr.val == entry.val) {
				traversingPointetr.count = traversingPointetr.count + 1;
				return;
			}
			if (traversingPointetr.val < entry.val) {
				traversingPointetr = traversingPointetr.next;
			} else {
				traversingPointetr = traversingPointetr.prev;
			}
		}
		if (holdPointer.val < entry.val)
			holdPointer.next = entry;
		else
			holdPointer.prev = entry;

	}
}
class MyFunction implements Function<String,Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

public class ElementsFrequencyInArray {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12);
		Entries[] entries = new Entries[list.size()];
		for (int i = 0; i < list.size(); i++) {
			entries[i] = new Entries(0, i, list.get(i));
		}
		Map<Integer, Integer> map = new HashMap();
		for (Integer ii : list) {
			if (map.containsKey(ii)) {

				map.put(ii, map.get(ii) + 1);

			} else {
				map.put(ii, 1);
			}

		}
	//	list.stream().

		// list.stream().

		Set<Map.Entry<Integer, Integer>> set = map.entrySet();

		List<Map.Entry<Integer, Integer>> sortedList = new ArrayList();
		set.stream().forEach((e) -> {
			sortedList.add(e);
		});
		Collections.sort(sortedList, (entry1, entry2) -> {
			if (entry2.getValue().compareTo(entry1.getValue()) == 0) {
				return entry2.getKey().compareTo(entry1.getKey());
			} else {
				return entry2.getValue().compareTo(entry1.getValue());
			}
		});
		sortedList.forEach((Entry<Integer, Integer> entrries)->{System.out.println(entrries.getKey() + " " + entrries.getValue());});

	}
}
