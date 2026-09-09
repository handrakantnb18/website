package com.day10.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are creating a HashMap to store student IDs and names, retrieving a value using a key

public class MapInterfaceTestFive {

	public static void main(String[] args) {

		Map<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1001, "chandrakant B");
		studentMap.put(1002, "Shivraj B");
		studentMap.put(1003, "Priyanka B");

		int studentIdToFind = 1002;
		String studentName = studentMap.get(studentIdToFind);
		if (studentName != null) {
			System.out.println("Student with ID " + studentIdToFind + " is: " + studentName);
		} else {
			System.out.println("Student with ID " + studentIdToFind + " not found.");
		}

		System.out.println("Student Records:");
		for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

		int idToCheck = 1004;
		boolean exists = studentMap.containsKey(idToCheck);
		System.out.println("Student with ID " + idToCheck + " exists in records: " + exists);

	}
}
