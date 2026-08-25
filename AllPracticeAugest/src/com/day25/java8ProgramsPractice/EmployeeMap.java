package com.day25.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMap {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(
				new Employee(1, "Rahul", "Pune", 55000.0, "rahul@gmail.com", "IT", "9876543210", "28", "Male", "Developer"),

			    new Employee(2, "Priya", "Mumbai", 65000.0, "priya@gmail.com", "HR", "9876543211", "30", "Female", "HR Manager"),

			    new Employee(3, "Amit", "Pune", 75000.0, "amit@gmail.com", "IT", "9876543212", "32", "Male", "Senior Developer"),

			    new Employee(4, "Sneha", "Nashik", 48000.0, "sneha@gmail.com", "Finance", "9876543213", "27", "Female", "Accountant"),

			    new Employee(5, "Vijay", "Mumbai", 85000.0, "vijay@gmail.com", "IT", "9876543214", "35", "Male", "Tech Lead"),

			    new Employee(6, "Neha", "Pune", 60000.0, "neha@gmail.com", "Marketing", "9876543215", "29", "Female", "Marketing Executive"),

			    new Employee(7, "Suresh", "Kolhapur", 45000.0, "suresh@gmail.com", "Sales", "9876543216", "26", "Male", "Sales Executive"),

			    new Employee(8, "Pooja", "Nashik", 70000.0, "pooja@gmail.com", "HR", "9876543217", "31", "Female", "HR Executive"),

			    new Employee(9, "Akash", "Pune", 90000.0, "akash@gmail.com", "IT", "9876543218", "36", "Male", "Project Manager"),

			    new Employee(10, "Kavita", "Mumbai", 52000.0, "kavita@gmail.com", "Finance", "9876543219", "28", "Female", "Financial Analyst")
				
				);
		
//		List<String> names= 
//				emp.stream()
//				.map(Employee::getName)
//				.collect(Collectors.toList());
//		
//		System.out.println(names);
		
		List<Employee> res =
		emp.stream()
		.filter(e -> e.getSalary() > 5000)
		.collect(Collectors.toList());
		
		System.out.println(res);
	}
}
