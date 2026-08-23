package com.day23.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> list = new HashMap<Integer, Employee>();
		
		list.put(1, new Employee(1, "Amit", "amit@gmail.com", 55000.0, "Pune", "9876543210", "IT"));

		list.put(2, new Employee(2, "Rahul", "rahul@gmail.com", 65000.0, "Mumbai", "9876543211", "HR"));

		list.put(3, new Employee(3, "Priya", "priya@gmail.com", 75000.0, "Pune", "9876543212", "Finance"));

		list.put(4, new Employee(4, "Sneha", "sneha@gmail.com", 60000.0, "Nashik", "9876543213", "IT"));

		list.put(5, new Employee(5, "Vijay", "vijay@gmail.com", 80000.0, "Sangli", "9876543214", "Sales"));

		list.put(6, new Employee(6, "Neha", "neha@gmail.com", 72000.0, "Pune", "9876543215", "HR"));

		list.put(7, new Employee(7, "Rohit", "rohit@gmail.com", 90000.0, "Mumbai", "9876543216", "IT"));

		list.put(8, new Employee(8, "Pooja", "pooja@gmail.com", 58000.0, "Kolhapur", "9876543217", "Finance"));

		list.put(9, new Employee(9, "Suresh", "suresh@gmail.com", 70000.0, "Satara", "9876543218", "Sales"));

		list.put(10, new Employee(10, "Kiran", "kiran@gmail.com", 95000.0, "Pune", "9876543219", "IT"));

//		list.forEach((id, emp) -> {
//			System.out.println(emp);
//		});
		
		// Filter employees with salary > 70000
		
		list.values()
		.stream()
		.filter(e -> e.getSalary() > 70000)
		.forEach(System.out::println);
		
		
	}
}
