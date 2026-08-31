package com.day24.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Amit", "amit@gmail.com", 75000.0, "Pune", "IT"));

		map.put(102, new Employee(102, "Rahul", "rahul@gmail.com", 85000.0, "Mumbai", "IT"));

		map.put(103, new Employee(103, "Priya", "priya@gmail.com", 65000.0, "Pune", "HR"));

		map.put(104, new Employee(104, "Sneha", "sneha@gmail.com", 95000.0, "Bangalore", "IT"));

		map.put(105, new Employee(105, "Vikas", "vikas@gmail.com", 55000.0, "Nashik", "Finance"));

		map.put(106, new Employee(106, "Neha", "neha@gmail.com", 80000.0, "Pune", "Testing"));

		map.put(107, new Employee(107, "Suresh", "suresh@gmail.com", 100000.0, "Hyderabad", "IT"));

		map.put(108, new Employee(108, "Pooja", "pooja@gmail.com", 70000.0, "Mumbai", "HR"));

		map.put(109, new Employee(109, "Rohit", "rohit@gmail.com", 90000.0, "Pune", "IT"));

		map.put(110, new Employee(110, "Kiran", "kiran@gmail.com", 60000.0, "Kolhapur", "Sales"));
	        
		map.forEach((id, emp) ->
            System.out.println(id + " -> " + emp));
	}
}
