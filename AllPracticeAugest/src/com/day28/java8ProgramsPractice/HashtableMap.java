package com.day28.java8ProgramsPractice;

import java.util.Hashtable;

// Java program to illustrate HashTable
// Adding entry to Hashtable, Custom input entries

public class HashtableMap {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(65, "A");
		map.put(66, "B");
		map.put(67, "C");
		map.put(68, "D");
		map.put(69, "E");
		
		System.out.println(map);
		
	}
}
