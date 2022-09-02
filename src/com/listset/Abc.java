package com.listset;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Abc {

	public static void main(String[] args) {

		Map<Integer, String> m = new LinkedHashMap<>();

		m.put(10, "java");
		m.put(20, "selenium");
		m.put(30, "python");
		m.put(40, "c#");
		m.put(50, "Ruby");
		m.put(10, ".net"); // Duplicate key
		m.put(60, "python"); // duplicate value

		System.out.println(m); // key don't allow duplicate //value allow duplicate.

		// find size or no.of.count.

		int size = m.size();
		System.out.println(size);

		// Display corresponding keys value

		String string = m.get(30);
		System.out.println(string);

		// remove value from map

		m.remove(50);
		System.out.println(m);

		// particular keys present

		boolean containsKey = m.containsKey(40);
		System.out.println(containsKey);

		// particular value present

		boolean containsValue = m.containsValue("java");
		System.out.println(containsValue);

		// Display values only

		Collection<String> values = m.values();
		System.out.println(values);

		// Display keys only

		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		System.out.println("");

		// for (iterating) Map give (m.entryset)

		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);

		for (Entry<Integer, String> x : entrySet) {
			System.out.println(x);

		}

		System.out.println("");

		for (Entry<Integer, String> x : entrySet) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			System.out.println("");

		}

	}

}
