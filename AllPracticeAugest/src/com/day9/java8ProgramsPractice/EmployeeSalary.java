package com.day9.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(101, "Rahul", "rahul@gmail.com", "Pune","IT", 75000.0, "9876543210"),

				new Employee(102, "Priya", "priya@gmail.com", "Mumbai", "HR", 65000.0, "9876543211"),

				new Employee(103, "Amit", "amit@gmail.com", "Pune", "IT", 85000.0, "9876543212"),

				new Employee(104, "Sneha", "sneha@gmail.com", "Nashik", "Finance", 70000.0, "9876543213"),

				new Employee(105, "Vijay", "vijay@gmail.com", "Sangli", "IT", 95000.0, "9876543214"),

				new Employee(106, "Neha", "neha@gmail.com", "Pune", "HR", 60000.0, "9876543215"),

				new Employee(107, "Akash", "akash@gmail.com", "Mumbai", "Finance", 80000.0, "9876543216"),

				new Employee(108, "Pooja", "pooja@gmail.com", "Kolhapur", "IT", 55000.0, "9876543217"),

				new Employee(109, "Suresh", "suresh@gmail.com", "Pune", "Sales", 72000.0, "9876543218"),

				new Employee(110, "Kiran", "kiran@gmail.com", "Satara", "Sales", 68000.0, "9876543219")
				
				);
		
		//list.forEach(System.out::println);
		
		
		List<Employee> res =
				list.stream()
				.filter(emp -> emp.getSalary() > 70000)
				.collect(Collectors.toList());
		
		res.forEach(System.out::println);
		
		
		
	}
}
