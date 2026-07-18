package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class EmployeeCity {

	public static void main(String[] args) {
		
		List<Employee> emp1 = Arrays.asList(
				new Employee(101, "Rahul", "IT", 250000, "pune"),
				new Employee(101, "Rahul", "IT", 250000, "Pune"),
			    new Employee(102, "Amit", "HR", 55000, "Mumbai"),
			    new Employee(103, "Sachin", "Finance", 75000, "Nagpur"),
			    new Employee(104, "Priya", "IT", 85000, "Pune"),
			    new Employee(105, "Neha", "Sales", 65000, "Nashik"),
			    new Employee(106, "Rohit", "Marketing", 70000, "Aurangabad"),
			    new Employee(107, "Anjali", "HR", 60000, "Kolhapur"),
			    new Employee(108, "Vikas", "IT", 95000, "Pune"),
			    new Employee(109, "Pooja", "Finance", 80000, "Thane"),
			    new Employee(110, "Karan", "Sales", 50000, "Solapur")
				);
		
		emp1.stream()
		.filter(e -> e.getCity().equals("Pune"))
		.forEach(System.out::println);
		
	}
}
