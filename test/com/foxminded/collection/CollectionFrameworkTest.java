package com.foxminded.collection;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollectionFrameworkTest {
	
	CollectionFramework collectionFramework = new CollectionFramework();

	@Test
	public void shouldCalculateUniqueSymbolQuantity() {
		assertEquals(0, collectionFramework.calculateUniqueSymbolQuantity(""));
		assertEquals(1, collectionFramework.calculateUniqueSymbolQuantity(" "));
		assertEquals(6, collectionFramework.calculateUniqueSymbolQuantity("qwertyqwerty"));
		assertEquals(7, collectionFramework.calculateUniqueSymbolQuantity("qwertyqwerty qwertyqwerty"));
		assertEquals(5, collectionFramework.calculateUniqueSymbolQuantity("1234512345"));
		assertEquals(5, collectionFramework.calculateUniqueSymbolQuantity("!@#$%!@#$%"));
		assertEquals(12, collectionFramework.calculateUniqueSymbolQuantity("qwer123tyqw!@#erty"));
	}

	@Test
	public void souldCheckMap() {
		assertEquals(0, collectionFramework.checkMap(""));
		assertEquals(1, collectionFramework.checkMap(" "));
		assertEquals(6, collectionFramework.checkMap("qwertyqwerty"));
		assertEquals(6, collectionFramework.checkMap("qwertyqwerty"));
		assertEquals(7, collectionFramework.checkMap("qwertyqwerty qwertyqwerty"));
		assertEquals(5, collectionFramework.checkMap("1234512345"));
		assertEquals(5, collectionFramework.checkMap("!@#$%!@#$%"));
		assertEquals(12, collectionFramework.checkMap("qwer123tyqw!@#erty"));
	}

}
