package com.foxminded.collection;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CollectionFramework collectionFramework = new CollectionFramework();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input initial text: ");
		String inputText = s.nextLine();
		
		collectionFramework.printMap(collectionFramework.receiveUniqueSymbolNumber(inputText));
		
		String string = " ";
		System.out.println(string);
		collectionFramework.printMap(collectionFramework.receiveUniqueSymbolNumber(string));
		
		string = inputText;
		System.out.println(string);
		collectionFramework.printMap(collectionFramework.receiveUniqueSymbolNumber(string));
		
		string = "hello world";
		System.out.println(string);
		collectionFramework.printMap(collectionFramework.receiveUniqueSymbolNumber(string));
		
		string = "hello new world";
		System.out.println(string);
		collectionFramework.printMap(collectionFramework.receiveUniqueSymbolNumber(string));
	}

}

