package com.day16.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are creating a HashMap to store student IDs and names, retrieving a value using a key

public class HashMapTestSix {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "Rahul Sharma");
		map.put(1002, "Amit Patil");
		map.put(1003, "Sneha Deshmukh");
		map.put(1004, "Priya Kulkarni");
		map.put(1005, "Vijay Jadhav");
		map.put(1006, "Neha Joshi");
		map.put(1007, "Suresh Pawar");
		map.put(1008, "Pooja Shinde");
		map.put(1009, "Kiran Chavan");

		int studentIdToFind = 1002;
		String studentName = map.get(studentIdToFind);
		if (studentName != null) {
			System.out.println("Student with ID " + studentIdToFind + " is: " + studentName);
		} else {
			System.out.println("Student with ID " + studentIdToFind + " not found.");
		}

		System.out.println("Student Records:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

		int idToCheck = 1004;
		boolean exists = map.containsKey(idToCheck);
		System.out.println("Student with ID " + idToCheck + " exists in records: " + exists);

	}
}
