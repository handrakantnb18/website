package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeNameCity {

	public static void main(String[] args) {
		
		List<Employee> map = Arrays.asList(
				
		new Employee(101, "Rahul", "rahul@gmail.com", "Pune", "9876543210", 55000.0, "IT"),

	    new Employee(102, "Priya", "priya@gmail.com", "Mumbai", "9876543211", 60000.0, "HR"),

	    new Employee(103, "Amit", "amit@gmail.com", "Nashik", "9876543212", 65000.0, "Finance"),

	    new Employee(104, "Sneha", "sneha@gmail.com", "Nagpur", "9876543213", 58000.0, "IT"),

	    new Employee(105, "Vijay", "vijay@gmail.com", "Kolhapur", "9876543214", 70000.0, "Sales"),

	    new Employee(106, "Pooja", "pooja@gmail.com", "Satara", "9876543215", 62000.0, "HR"),

	    new Employee(107, "Rohit", "rohit@gmail.com", "Aurangabad", "9876543216", 75000.0, "IT"),

	    new Employee(108, "Neha", "neha@gmail.com", "Solapur", "9876543217", 68000.0, "Finance"),

	    new Employee(109, "Suresh", "suresh@gmail.com", "Pune", "9876543218", 72000.0, "Sales"),

	    new Employee(110, "Kiran", "kiran@gmail.com", "Mumbai", "9876543219", 80000.0, "IT")
		
		);
		
		map.forEach((name) -> {
			System.out.println(name);
		});
		
		
	}
}
