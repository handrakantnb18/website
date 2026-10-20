package com.day19.javaProgramsPractice;

import java.util.NavigableMap;
import java.util.TreeMap;

// navigation methods such as descendingMap(), headMap(), tailMap(), and subMap()

public class LinkedHashMapTestSeven {

	public static void main(String[] args) {

		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(100, " Ram");
		map.put(102, " Ajit");
		map.put(101, " Pooja");
		map.put(103, " Priya");
		map.put(104, " Shivraj");

		System.out.println("descendingMap: " + map.descendingMap());

		System.out.println("headMap: " + map.headMap(102, true));
		System.out.println("tailMap: " + map.tailMap(102, true));

		System.out.println("subMap: " + map.subMap(100, false, 102, true));

	}
}
