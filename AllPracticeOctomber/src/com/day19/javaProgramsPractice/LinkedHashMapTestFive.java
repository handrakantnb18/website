package com.day19.javaProgramsPractice;

import java.util.Map;
import java.util.TreeMap;

// how to store key-value pairs in a TreeMap and iterate through them.

public class LinkedHashMapTestFive {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, " Ram");
		map.put(102, " Ajit");
		map.put(101, " Pooja");
		map.put(103, " Priya");
		map.put(104, " Shivraj");
		map.put(106, " Keshav");
		map.put(107, " Seema");
		map.put(108, " Neha");
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
