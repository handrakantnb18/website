package com.day1.java8ProgramsPractice;

import java.util.Hashtable;

// how to use the putIfAbsent() method.

public class HashtableTestNineteen {

	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		System.out.println("Initial Map: " + map);

		System.out.println();
		map.putIfAbsent(104, "Gaurav");
		System.out.println("Updated Map: " + map);

		System.out.println();
		map.putIfAbsent(101, "Vijay");
		System.out.println("Updated Map: " + map);

	}
}
