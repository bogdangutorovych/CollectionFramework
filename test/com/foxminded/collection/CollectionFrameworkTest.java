package com.foxminded.collection;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CollectionFrameworkTest {

	CollectionFramework collectionFramework = new CollectionFramework();

	@Test
	public void shouldFindUniqueSymbolNumber() {
		
		Map<Character, Integer> map = new HashMap<>();

		assertThat("Returned map isn't correct", map, is(collectionFramework.putIntoCache("")));

		map.put('h', 1);
		map.put('e', 1);
		map.put('l', 2);
		map.put('o', 1);

		assertThat("Returned map isn't correct", map, is(collectionFramework.putIntoCache("hello")));
		map.clear();

		map.put('h', 1);
		map.put('e', 1);
		map.put('l', 3);
		map.put('o', 2);
		map.put(' ', 1);
		map.put('w', 1);
		map.put('r', 1);
		map.put('d', 1);
		map.put('!', 1);

		assertThat("Returned map isn't correct", map, is(collectionFramework.putIntoCache("hello world!")));
		map.clear();

		map.put('h', 1);
		map.put('e', 1);
		map.put('l', 3);
		map.put('o', 2);
		map.put(' ', 2);
		map.put('w', 1);
		map.put('r', 1);
		map.put('d', 1);
		map.put('!', 1);
		map.put('b', 1);
		map.put('i', 1);
		map.put('g', 1);
		map.put(',', 1);

		assertThat("Returned map isn't correct", map, is(collectionFramework.putIntoCache("hello, big world!")));
		map.clear();

	}

	@Test
	public void shouldPutIntoCache() {

		Map<Character, Integer> map = new HashMap<>();

		assertThat("Returned map isn't correct", map, is(collectionFramework.putIntoCache("")));

		map.put('h', 1);
		map.put('e', 1);
		map.put('l', 2);
		map.put('o', 1);

		assertThat("Returned map isn't correct", map, is(collectionFramework.putIntoCache("hello")));
		map.clear();

		map.put('h', 1);
		map.put('e', 1);
		map.put('l', 3);
		map.put('o', 2);
		map.put(' ', 1);
		map.put('w', 1);
		map.put('r', 1);
		map.put('d', 1);
		map.put('!', 1);

		assertThat("Returned map isn't correct", map, is(collectionFramework.putIntoCache("hello world!")));
		map.clear();

		map.put('h', 1);
		map.put('e', 1);
		map.put('l', 3);
		map.put('o', 2);
		map.put(' ', 2);
		map.put('w', 1);
		map.put('r', 1);
		map.put('d', 1);
		map.put('!', 1);
		map.put('b', 1);
		map.put('i', 1);
		map.put('g', 1);
		map.put(',', 1);

		assertThat("Returned map isn't correct", map, is(collectionFramework.putIntoCache("hello, big world!")));
		map.clear();

	}

}
