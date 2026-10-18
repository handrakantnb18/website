package com.day17.javaProgramsPractice;

import java.util.NavigableMap;
import java.util.TreeMap;

// various navigation methods such as descendingMap(), headMap(), tailMap(), and subMap()

public class TreeMapTestEighteen {

	public static void main(String[] args) {

		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ram");
		map.put(101, "Priya");
		map.put(103, "Chandrakant");
		map.put(104, "Shivraj");
		map.put(105, "Keshav");

		System.out.println("descendingMap: " + map.descendingMap());

		System.out.println("headMap: " + map.headMap(102, true));

		System.out.println("tailMap: " + map.tailMap(102, true));

		System.out.println("subMap: " + map.subMap(100, false, 102, true));

	}
}
