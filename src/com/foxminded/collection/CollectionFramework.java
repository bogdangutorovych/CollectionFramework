package com.foxminded.collection;

import java.util.ArrayList;
import java.util.Map;

public class CollectionFramework {

	public int calculateUniqueSymbolQuantity(String string) {
		char[] symbols = string.toCharArray();
		ArrayList<Character> charList = new ArrayList<Character>();
		for (char c : symbols) {
			if (charList.contains(c) == false) {
				charList.add(c);
			}
		}
		return charList.size();
	}

	public int checkMap(String string, Map<String, Integer> map) {
		if (map.containsKey(string)) {
			System.out.println("Output result from Map");
			return (int) map.get(string);
		}
		map.put(string, calculateUniqueSymbolQuantity(string));
		System.out.println("Insert result to Map");
		return calculateUniqueSymbolQuantity(string);
	}
	
}
