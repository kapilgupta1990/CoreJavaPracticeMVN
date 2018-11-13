package com.cdk.IdeaS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Key {
	private String softwareType;
	private String softwareName;

	public Key(String softwareType, String softwareName) {
		super();
		this.softwareType = softwareType;
		this.softwareName = softwareName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((softwareName == null) ? 0 : softwareName.hashCode());
		result = prime * result + ((softwareType == null) ? 0 : softwareType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (softwareName == null) {
			if (other.softwareName != null)
				return false;
		} else if (!softwareName.equals(other.softwareName))
			return false;
		if (softwareType == null) {
			if (other.softwareType != null)
				return false;
		} else if (!softwareType.equals(other.softwareType))
			return false;
		return true;
	}

}

public class VersionServices {
	private final List<InputModel> inputModelList;

	public VersionServices(List<InputModel> inputModelList) {
		this.inputModelList = inputModelList;
	}

	public Map<Key, List<InputModel>> getListOfConfigurationGroupBySoftWareTypeAndName() {
		Map<Key, List<InputModel>> inputModelMap = new HashMap<>();
		for (InputModel inputModel : inputModelList) {
			Key key = new Key(inputModel.getSoftwareType(), inputModel.getSoftwareName());
			List<InputModel> list;
			if (!inputModelMap.containsKey(key)) {
				list = new ArrayList<>();
				list.add(inputModel);
				inputModelMap.put(key, list);
			} else {
				inputModelMap.get(key).add(inputModel);
			}
		}
		return inputModelMap;

	}

	public Set<String> getMap() {
		Set<String> hashSet = new HashSet<>();
		Map<Key, List<InputModel>> inputModelMap = getListOfConfigurationGroupBySoftWareTypeAndName();

		for (Map.Entry<Key, List<InputModel>> entries : inputModelMap.entrySet()) {
			List<InputModel> inputModelList = entries.getValue();
			Key key = entries.getKey();
			
			TreeSet<InputModel> treeSet = new TreeSet<>(new VersionComparator());
			treeSet.addAll(inputModelList);
			if (treeSet.size() == 1)
				continue;
			hashSet.add(treeSet.first().getServerType());

		}
		return hashSet;
	}
}
