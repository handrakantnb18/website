package com.day17.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(
				
				new Employee(1, "Rahul", "rahul@gmail.com", 45000.0, "Pune", "9876543210", "IT"),

			    new Employee(2, "Priya", "priya@gmail.com", 55000.0, "Mumbai", "9876543211", "HR"),

			    new Employee(3, "Amit", "amit@gmail.com", 60000.0, "Pune", "9876543212", "IT"),

			    new Employee(4, "Sneha", "sneha@gmail.com", 50000.0, "Nashik", "9876543213", "Finance"),

			    new Employee(5, "Vikas", "vikas@gmail.com", 70000.0, "Mumbai", "9876543214", "IT"),

			    new Employee(6, "Neha", "neha@gmail.com", 48000.0, "Pune", "9876543215", "HR"),

			    new Employee(7, "Rohit", "rohit@gmail.com", 65000.0, "Nagpur", "9876543216", "Finance"),

			    new Employee(8, "Pooja", "pooja@gmail.com", 52000.0, "Pune", "9876543217", "IT"),

			    new Employee(9, "Suresh", "suresh@gmail.com", 75000.0, "Mumbai", "9876543218", "Admin"),

			    new Employee(10, "Kiran", "kiran@gmail.com", 58000.0, "Pune", "9876543219", "HR")
				
				);
		
//		emp.stream()
//		.forEach(System.out::println);
		
		// Find the highest-paid employee
		Employee highSalary =
		emp.stream()
		.max(Comparator.comparing(Employee::getSalary))
		.orElse(null);
		
		System.out.println(highSalary);
		
		
	}
}
