package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class EmployeeMap {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(
				 new Employee(101, "Rahul", "rahul@gmail.com", "9876543210", "IT", "Pune", "Male"),

				    new Employee(102, "Priya", "priya@gmail.com", "9876543211","HR", "Mumbai", "Female"),

				    new Employee(103, "Amit", "amit@gmail.com", "9876543212", "IT", "Pune", "Male"),

				    new Employee(104, "Sneha", "sneha@gmail.com", "9876543213", "Finance", "Nashik", "Female"),

				    new Employee(105, "Vijay", "vijay@gmail.com", "9876543214", "IT", "Mumbai", "Male"),

				    new Employee(106, "Pooja", "pooja@gmail.com", "9876543215", "HR", "Pune", "Female"),

				    new Employee(107, "Rohit", "rohit@gmail.com", "9876543216", "Finance", "Pune", "Male"),

				    new Employee(108, "Neha", "neha@gmail.com", "9876543217", "IT", "Nashik", "Female"),

				    new Employee(109, "Suresh", "suresh@gmail.com", "9876543218", "Sales", "Mumbai", "Male"),

				    new Employee(110, "Kavita", "kavita@gmail.com", "9876543219", "Sales", "Pune", "Female")
				);
		
//		emp.stream()
//		.map(Employee::getName)
//		.forEach(System.out::println);
		
		
		emp.stream()
		.filter(e -> e.getAddress().equals("Pune"))
		.forEach(System.out::println);
		
		
	}
}
