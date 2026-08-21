package com.day21.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
		
		new Employee(1, "Rahul Sharma", "rahul@gmail.com", "IT", 65000.0, "9876543210", "Pune"),

	    new Employee(2, "Priya Patil", "priya@gmail.com", "HR", 55000.0, "9876543211", "Mumbai"),

	    new Employee(3, "Amit Kulkarni", "amit@gmail.com", "Finance", 72000.0, "9876543212", "Nashik"),

	    new Employee(4, "Sneha Joshi", "sneha@gmail.com", "IT", 80000.0, "9876543213", "Pune"),

	    new Employee(5, "Vijay More", "vijay@gmail.com", "Sales", 48000.0, "9876543214", "Sangli"),

	    new Employee(6, "Neha Deshmukh", "neha@gmail.com", "Marketing", 60000.0, "9876543215", "Kolhapur"),

	    new Employee(7, "Akash Shinde", "akash@gmail.com", "IT", 90000.0, "9876543216", "Satara"),

	    new Employee(8, "Pooja Jadhav", "pooja@gmail.com", "HR", 58000.0, "9876543217", "Pune"),

	    new Employee(9, "Sagar Pawar", "sagar@gmail.com", "Finance", 75000.0, "9876543218", "Aurangabad"),

	    new Employee(10, "Kiran Bhosale", "kiran@gmail.com", "Sales", 52000.0, "9876543219", "Solapur")
	);
		
		//Filter employees by department
		list.stream()
		.filter(e -> e.getDept().equalsIgnoreCase("IT"))
		.forEach(System.out::println);
		
		
	}
}
