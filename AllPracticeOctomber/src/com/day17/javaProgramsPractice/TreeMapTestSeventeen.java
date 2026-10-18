package com.day17.javaProgramsPractice;

import java.util.Map;
import java.util.TreeMap;

// how to remove an element using the remove() method.

public class TreeMapTestSeventeen {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Ram");
		map.put(102, "Shivraj");
		map.put(101, "Priya");
		map.put(103, "Ajit");

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
