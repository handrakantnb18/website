package com.day19.javaProgramsPractice;

import java.util.SortedMap;
import java.util.TreeMap;

// how to use SortedMap methods like headMap(), tailMap(), and subMap().

public class LinkedHashMapTestEight {

	public static void main(String[] args) {

		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(100, "Oliver");
		map.put(102, "Henry");
		map.put(101, "William");
		map.put(103, "Robert");
		map.put(104, "Elijah");
		map.put(105, "Noah");

		System.out.println("headMap: " + map.headMap(102));
		
		System.out.println("tailMap: " + map.tailMap(102));

		System.out.println("subMap: " + map.subMap(100, 102));

	}
}
