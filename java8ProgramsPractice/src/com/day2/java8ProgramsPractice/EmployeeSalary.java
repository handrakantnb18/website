package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				 new Employee(1, "Ram", "Pune", "Sales", 25000.00),
	                new Employee(2, "Rahul", "Mumbai", "Transport", 18000.00),
	                new Employee(3, "Shiv", "Pune", "IT", 23000.00),
	                new Employee(4, "Amit", "Delhi", "HR", 30000.00),
	                new Employee(5, "Priya", "Bangalore", "IT", 45000.00),
	                new Employee(6, "Sneha", "Hyderabad", "Finance", 35000.00),
	                new Employee(7, "Vikas", "Chennai", "Sales", 28000.00),
	                new Employee(8, "Neha", "Nagpur", "Marketing", 32000.00),
	                new Employee(9, "Rohit", "Pune", "Finance", 40000.00),
	                new Employee(10, "Anjali", "Mumbai", "HR", 27000.00)
				);
		
		List<Employee> emp =
					list.stream()
					.filter(e -> e.getSalary() > 30000)
					.collect(Collectors.toList());
		
		System.out.println(emp);
		
	}
}
