package com.foxminded.collection;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CollectionFramework collectionFramework = new CollectionFramework();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input initial text: ");
		String inputText = s.nextLine();
		
		collectionFramework.printMap(collectionFramework.findUniqueSymbolNumber(inputText));
		
		String string = " ";
		System.out.println(string);
		collectionFramework.printMap(collectionFramework.findUniqueSymbolNumber(string));
		
		string = inputText;
		System.out.println(string);
		collectionFramework.printMap(collectionFramework.findUniqueSymbolNumber(string));
		
		string = "hello world";
		System.out.println(string);
		collectionFramework.printMap(collectionFramework.findUniqueSymbolNumber(string));
		
		string = "hello new world";
		System.out.println(string);
		collectionFramework.printMap(collectionFramework.findUniqueSymbolNumber(string));
	}

}

