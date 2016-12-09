package com.foxminded.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CollectionFramework collectionFramework = new CollectionFramework();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input initial text: ");
		String inputText = s.nextLine();

		System.out.println("String: " + inputText + " - " + collectionFramework.checkMap(inputText, map));
		
		String string = "";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string, map));
		
		System.out.println(inputText + " - " + collectionFramework.checkMap(inputText, map));
		
		string = "asdf qwer";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string, map));
		
		string = "asdf qwerrrrrr";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string, map));
		
		string = "asdf qwerrrrrr";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string, map));
		
		string = "asdf    ";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string, map));
		
	}

}

