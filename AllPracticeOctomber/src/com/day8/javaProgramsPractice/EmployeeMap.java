package com.day8.javaProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.day7.javaProgramsPractice.Employee;

public class EmployeeMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

		map.put(1, new Employee(1, "Rahul", "rahul@gmail.com", 75000.0, "IT", "Pune", "Java Developer"));

		map.put(2, new Employee(2, "Priya", "priya@gmail.com", 85000.0, "HR", "Mumbai", "HR Executive"));

		map.put(3, new Employee(3, "Amit", "amit@gmail.com", 95000.0, "IT", "Bangalore", "Senior Java Developer"));

		map.put(4, new Employee(4, "Sneha", "sneha@gmail.com", 65000.0, "Finance", "Pune", "Financial Analyst"));

		map.put(5, new Employee(5, "Vikas", "vikas@gmail.com", 90000.0, "IT", "Hyderabad", "Spring Boot Developer"));

		map.put(6, new Employee(6, "Neha", "neha@gmail.com", 70000.0, "Testing", "Mumbai", "QA Engineer"));

		map.put(7, new Employee(7, "Rohit", "rohit@gmail.com", 88000.0, "IT", "Pune", "Full Stack Developer"));

		map.put(8, new Employee(8, "Pooja", "pooja@gmail.com", 72000.0, "HR", "Nashik", "HR Manager"));

		map.put(9, new Employee(9, "Kiran", "kiran@gmail.com", 98000.0, "IT", "Bangalore", "Technical Lead"));

		map.put(10, new Employee(10, "Anjali", "anjali@gmail.com", 80000.0, "Finance", "Delhi", "Account Manager"));

		map.values()
		.stream()
		.sorted(Comparator.comparing(
				Employee::getSalary)
				.reversed())
		.forEach(System.out::println);
		
		
	}
}
