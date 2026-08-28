package com.day28.java8ProgramsPractice;

import java.util.HashMap;

public class HashMapInternallyWorking {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Orange", 3);
		map.put("Graphs", 4);
		map.put("Mango", 5);
		
		System.out.println(map.get("Graphs"));
		
	}
}
