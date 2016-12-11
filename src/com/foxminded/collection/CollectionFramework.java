package com.foxminded.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionFramework {
	
	private Map<String, Integer> map;

	public CollectionFramework() {
		this.map = new HashMap<String, Integer>();
	}
	
	public int calculateUniqueSymbolQuantity(String string) {
		char[] symbols = string.toCharArray();
		ArrayList<Character> charList = new ArrayList<Character>();
		for (char c : symbols) {
			if (!charList.contains(c)) {
				charList.add(c);
			}
		}
		return charList.size();
	}

	public int checkMap(String string) {
		if (this.map.containsKey(string)) {
			return (int) this.map.get(string);
		}
		this.map.put(string, calculateUniqueSymbolQuantity(string));
		return calculateUniqueSymbolQuantity(string);
	}
	
}
