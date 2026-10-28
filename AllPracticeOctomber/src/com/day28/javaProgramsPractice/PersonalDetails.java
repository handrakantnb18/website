package com.day28.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class PersonalDetails {

	public static void main(String[] args) {

		Map<Integer, Person> map = new HashMap<>();

		map.put(1, new Person(1, "Rahul", "rahul@gmail.com", 50000.0, "IT", "Pune", "Java Developer"));

		map.put(2, new Person(2, "Priya", "priya@gmail.com", 65000.0, "HR", "Mumbai", "HR Executive"));

		map.put(3, new Person(3, "Amit", "amit@gmail.com", 75000.0, "IT", "Pune", "Senior Java Developer"));

		map.put(4, new Person(4, "Sneha", "sneha@gmail.com", 45000.0, "Finance", "Nashik", "Accountant"));

		map.put(5, new Person(5, "Vikas", "vikas@gmail.com", 80000.0, "IT", "Mumbai", "Team Lead"));

		map.put(6, new Person(6, "Neha", "neha@gmail.com", 55000.0, "HR", "Pune", "HR Manager"));

		map.put(7, new Person(7, "Akash", "akash@gmail.com", 60000.0, "Finance", "Kolhapur", "Financial Analyst"));

		map.put(8, new Person(8, "Pooja", "pooja@gmail.com", 90000.0, "IT", "Bangalore", "Software Architect"));

		map.put(9, new Person(9, "Sagar", "sagar@gmail.com", 40000.0, "Sales", "Pune", "Sales Executive"));

		map.put(10, new Person(10, "Kiran", "kiran@gmail.com", 70000.0, "Sales", "Mumbai", "Sales Manager"));

		// Print all Persons
		map.forEach((key, person) -> System.out.println(person));

		// Find employees with salary greater than ₹60,000

		map.values().stream().filter(e -> e.getPsalary() > 60000).forEach(System.out::println);

	}
}
