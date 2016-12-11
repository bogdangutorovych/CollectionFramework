package com.foxminded.collection;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CollectionFramework collectionFramework = new CollectionFramework();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input initial text: ");
		String inputText = s.nextLine();

		System.out.println("String: " + inputText + " - " + collectionFramework.checkMap(inputText));
		
		String string = "";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string));
		
		System.out.println("String: " + inputText + " - " + collectionFramework.checkMap(inputText));
		
		string = "asdf qwer";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string));
		
		string = "asdf qwerrrrrr";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string));
		
		string = "asdf qwerrrrrr";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string));
		
		string = "asdf    ";
		System.out.println("String: " + string + " - " + collectionFramework.checkMap(string));
		
	}

}

