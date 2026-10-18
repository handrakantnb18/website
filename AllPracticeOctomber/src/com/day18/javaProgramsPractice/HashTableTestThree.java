package com.day18.javaProgramsPractice;

import java.util.Hashtable;

// how to use the putIfAbsent() method.

public class HashTableTestThree {

	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		map.put(104, "Ram");
		map.put(105, "Shiv");
		map.put(106, "Priya");

		System.out.println("Initial Map: " + map);

		map.putIfAbsent(104, "Gaurav");
		System.out.println("Updated Map: " + map);

		map.putIfAbsent(101, "Vijay");
		System.out.println("Updated Map: " + map);

	}
}
