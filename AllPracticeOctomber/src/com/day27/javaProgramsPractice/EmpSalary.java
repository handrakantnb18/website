package com.day27.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmpSalary {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Rahul", "rahul@gmail.com", 50000.0, "IT", "Pune", "Java Developer"));

		map.put(2, new Employee(2, "Priya", "priya@gmail.com", 65000.0, "HR", "Mumbai", "HR Executive"));

		map.put(3, new Employee(3, "Amit", "amit@gmail.com", 75000.0, "IT", "Pune", "Senior Java Developer"));

		map.put(4, new Employee(4, "Sneha", "sneha@gmail.com", 45000.0, "Finance", "Nashik", "Accountant"));

		map.put(5, new Employee(5, "Vikas", "vikas@gmail.com", 80000.0, "IT", "Mumbai", "Team Lead"));

		map.put(6, new Employee(6, "Neha", "neha@gmail.com", 55000.0, "HR", "Pune", "HR Manager"));

		map.put(7, new Employee(7, "Akash", "akash@gmail.com", 60000.0, "Finance", "Kolhapur", "Financial Analyst"));

		map.put(8, new Employee(8, "Pooja", "pooja@gmail.com", 90000.0, "IT", "Bangalore", "Software Architect"));

		map.put(9, new Employee(9, "Sagar", "sagar@gmail.com", 40000.0, "Sales", "Pune", "Sales Executive"));

		map.put(10, new Employee(10, "Kiran", "kiran@gmail.com", 70000.0, "Sales", "Mumbai", "Sales Manager"));

		// Print all employees
		map.forEach((key, employee) -> System.out.println(employee));

		// Find employees with salary greater than ₹60,000
		
		map.values().stream().filter(e -> e.getSalary() > 60000).forEach(System.out::println);
	}
}
