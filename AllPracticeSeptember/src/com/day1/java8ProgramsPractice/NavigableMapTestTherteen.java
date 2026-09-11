package com.day1.java8ProgramsPractice;

import java.util.NavigableMap;
import java.util.TreeMap;

// navigation methods such as descendingMap(), headMap(), tailMap(), and subMap().

public class NavigableMapTestTherteen {

	public static void main(String[] args) {

		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		System.out.println("descendingMap: " + map.descendingMap());

		System.out.println("headMap: " + map.headMap(102, true));

		System.out.println("tailMap: " + map.tailMap(102, true));

		System.out.println("subMap: " + map.subMap(100, false, 102, true));

	}
}
