package com.foxminded.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		String str = new String();

		System.out.println(checkMap(str, map));
		System.out.println(checkMap("", map));
		System.out.println(checkMap("asdf qwer", map));
		System.out.println(checkMap("asdf qwer", map));
		System.out.println(checkMap("asdf qwerrrrrr", map));
		System.out.println(checkMap("asdf qwerrrrrr", map));
		System.out.println(checkMap("asdfasasasasasasasasasas asasasasasas asasasasasas", map));
		System.out.println(checkMap("asdf    ", map));
	}

	public static int uniqueSymbolQuantity(String string) {
		char[] symbols = string.toCharArray();
		ArrayList<Character> charList = new ArrayList<Character>();
		for (char c : symbols) {
			if (charList.contains(c) == false) {
				charList.add(c);
			}
		}
		return charList.size();
	}

	public static int checkMap(String string, Map<String, Integer> map) {
		if (map.containsKey(string)) {
			System.out.println("Извлек из Map");
			return (int) map.get(string);
		}
		map.put(string, uniqueSymbolQuantity(string));
		System.out.println("Добавил в Map");
		return uniqueSymbolQuantity(string);
	}

}

