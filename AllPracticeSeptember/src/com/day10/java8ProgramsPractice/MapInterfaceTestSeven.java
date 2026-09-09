package com.day10.java8ProgramsPractice;

import java.util.Map;
import java.util.TreeMap;

// we are creating a TreeMap to store student IDs and names, and iterating over the entries in sorted (ascending) order of keys

public class MapInterfaceTestSeven {

	public static void main(String[] args) {

		TreeMap<Integer, String> studentMap = new TreeMap<>();
		studentMap.put(1001, "chandrakant B");
		studentMap.put(1002, "Shivraj B");
		studentMap.put(1003, "Priyanka B");

		System.out.println("Student Records:");
		for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

	}
}
