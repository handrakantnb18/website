package com.day16.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// HashMap is used to store key-value pairs, retrieve values, iterate through entries, remove elements

public class MapInterfaceTestTwo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("Anil", 10);
		map.put("Ram", 20);
		map.put("Pooja", 30);
		System.out.println("Value for 'Anil': " + map.get("Anil"));
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}

		map.remove("Pooja");
		if (map.containsKey("Ram")) {
			System.out.println("Map contains key 'Ram'.");
		}

	}
}
