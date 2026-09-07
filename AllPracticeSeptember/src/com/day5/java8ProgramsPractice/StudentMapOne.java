package com.day5.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class StudentMapOne {

	public static void main(String[] args) {

		Map<Integer, String> studentMap = new HashMap<Integer, String>();
		studentMap.put(1001, "chandrakant bhosale");
		studentMap.put(1002, "Shivraj bhosale");
		studentMap.put(1003, "Priyaanka bhosale");

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
