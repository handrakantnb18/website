package com.day2.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeName {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Amit", "amit@gmail.com", "9876543210", "Pune", 55000.0, "IT"));
		map.put(102, new Employee(102, "Rahul", "rahul@gmail.com", "9876543211", "Mumbai", 62000.0, "HR"));
		map.put(103, new Employee(103, "Sneha", "sneha@gmail.com", "9876543212", "Nashik", 58000.0, "Finance"));
		map.put(104, new Employee(104, "Priya", "priya@gmail.com", "9876543213", "Nagpur", 70000.0, "IT"));
		map.put(105, new Employee(105, "Rohit", "rohit@gmail.com", "9876543214", "Pune", 45000.0, "Sales"));
		map.put(106, new Employee(106, "Neha", "neha@gmail.com", "9876543215", "Aurangabad", 67000.0, "Testing"));
		map.put(107, new Employee(107, "Vikas", "vikas@gmail.com", "9876543216", "Kolhapur", 52000.0, "Support"));
		map.put(108, new Employee(108, "Anjali", "anjali@gmail.com", "9876543217", "Solapur", 61000.0, "Admin"));
		map.put(109, new Employee(109, "Kiran", "kiran@gmail.com", "9876543218", "Satara", 72000.0, "Development"));
		map.put(110, new Employee(110, "Pooja", "pooja@gmail.com", "9876543219", "Sangli", 68000.0, "QA"));

		for(Map.Entry<Integer, Employee> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " -> " + entry.getValue());
			
		}
	}
}
