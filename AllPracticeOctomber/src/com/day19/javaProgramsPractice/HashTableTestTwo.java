package com.day19.javaProgramsPractice;

import java.util.Hashtable;

// how to remove an element from a Hashtable

public class HashTableTestTwo {

	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		map.put(104, "Pooja");
		map.put(105, "Priya");

		System.out.println("Before remove: " + map);

		map.remove(102);

		System.out.println("After remove: " + map);

	}
}
