package com.day6.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

		map.put(1, new Employee(1, "Rahul", "rahul@gmail.com", 55000.0, "Pune", "Java Developer"));

		map.put(2, new Employee(2, "Priya", "priya@gmail.com", 65000.0, "Mumbai", "Senior Java Developer"));

		map.put(3, new Employee(3, "Amit", "amit@gmail.com", 45000.0, "Pune", "Software Engineer"));

		map.put(4, new Employee(4, "Sneha", "sneha@gmail.com", 75000.0, "Bangalore", "Full Stack Developer"));

		map.put(5, new Employee(5, "Rohit", "rohit@gmail.com", 60000.0, "Hyderabad", "Backend Developer"));

		map.put(6, new Employee(6, "Pooja", "pooja@gmail.com", 50000.0, "Nashik", "Java Developer"));

		map.put(7, new Employee(7, "Vikas", "vikas@gmail.com", 85000.0, "Mumbai", "Tech Lead"));

		map.put(8, new Employee(8, "Neha", "neha@gmail.com", 70000.0, "Pune", "Spring Boot Developer"));

		map.put(9, new Employee(9, "Suresh", "suresh@gmail.com", 48000.0, "Kolhapur", "Software Engineer"));

		map.put(10, new Employee(10, "Kiran", "kiran@gmail.com", 90000.0, "Bangalore", "Senior Developer"));

		
		map.forEach((id, name) -> {
			System.out.println(id + " " + name);
		});

	}
}
