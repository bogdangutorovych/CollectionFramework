package com.foxminded.collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionFramework {

	private Map<String, Map<Character, Integer>> map;

	public CollectionFramework() {
		this.map = new HashMap<String, Map<Character, Integer>>();
	}

	public Map<Character, Integer> receiveUniqueSymbolNumber(String string) {
		if (this.map.containsKey(string)) {
			return this.map.get(string);
		}
		this.map.put(string, putIntoCache(string));
		return this.map.get(string);
	}

	public Map<Character, Integer> putIntoCache(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int charCount = 0;
		for (int i = 0; i < string.length(); i++) {
			if (map.containsKey(string.charAt(i))) {
				charCount = map.get(string.charAt(i)) + 1;
				map.put(string.charAt(i), charCount);
			} else {
				map.put(string.charAt(i), 1);
			}
		}
		return map;	
	}

	public void printMap(Map<Character, Integer> map) {
		for (Map.Entry<Character, Integer> entry: map.entrySet()) { 
			Character key = entry.getKey(); 
			Integer value = entry.getValue();
			System.out.println("\"" + key + "\"" + " - " + value);
		}
	}
	
}
