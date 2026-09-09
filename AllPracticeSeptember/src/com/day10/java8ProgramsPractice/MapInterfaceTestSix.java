package com.day10.java8ProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// we are creating a LinkedHashMap to store student IDs and names, and iterating over the entries while maintaining insertion order.

public class MapInterfaceTestSix {

	public static void main(String[] args) {

		Map<Integer, String> studentMap = new LinkedHashMap<>();
		studentMap.put(1001, "chandrakant B");
		studentMap.put(1002, "Shivraj B");
		studentMap.put(1003, "Priyanka B");

		System.out.println("Student Records:");
		for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

	}
}
