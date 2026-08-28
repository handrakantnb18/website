package com.day28.java8ProgramsPractice;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapInternalChange {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Graps");
		map.put(4, "Mango");
		map.put(5, "Orange");
		
		System.out.println(map);
		
	}
}
