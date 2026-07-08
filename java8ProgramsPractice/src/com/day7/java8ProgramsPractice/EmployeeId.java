package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class EmployeeId {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
                new Employee(101, "Ram", "Pune", "9876543210", 25000),
                new Employee(102, "Shyam", "Mumbai", "9876543211", 35000),
                new Employee(103, "Sachin", "Nagpur", "9876543212", 45000),
                new Employee(104, "Neha", "Pune", "9876543213", 55000),
                new Employee(105, "Priya", "Nashik", "9876543214", 30000),
                new Employee(106, "Rohit", "Aurangabad", "9876543215", 60000),
                new Employee(107, "Sneha", "Kolhapur", "9876543216", 40000),
                new Employee(108, "Vikas", "Solapur", "9876543217", 28000),
                new Employee(109, "Pooja", "Satara", "9876543218", 50000),
                new Employee(110, "Sachin", "Pune", "9876543219", 70000)

				);

		System.out.println("--------------- Greater than 5 : ---------");
		list.stream()
		.filter(a -> a.getId() > 105)
		.forEach(System.out::println);
		
		System.out.println("--------------- Less than 5 : ---------");
		list.stream()
		.filter(b -> b.getId() < 105)
		.forEach(System.out::println);	
		
	}
}
