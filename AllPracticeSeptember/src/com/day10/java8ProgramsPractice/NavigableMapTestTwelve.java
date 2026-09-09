package com.day10.java8ProgramsPractice;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

// how to remove an element using the remove() method.

public class NavigableMapTestTwelve {

	public static void main(String[] args) {

		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		System.out.println("Before invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map.remove(102);
		System.out.println("After invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
