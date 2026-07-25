package com.day19.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeIdCity {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
			    new Employee(1001, "Chandrakant", "chandrakant@gmail.com", "Pune", 78000.00),
			    new Employee(1002, "Rahul", "rahul@gmail.com", "Mumbai", 65000.00),
			    new Employee(1003, "Amit", "amit@gmail.com", "Nagpur", 72000.00),
			    new Employee(1004, "Sneha", "sneha@gmail.com", "Nashik", 68000.00),
			    new Employee(1005, "Priya", "priya@gmail.com", "Pune", 75000.00),
			    new Employee(1006, "Rohit", "rohit@gmail.com", "Aurangabad", 81000.00),
			    new Employee(1007, "Neha", "neha@gmail.com", "Kolhapur", 70000.00),
			    new Employee(1008, "Vikas", "vikas@gmail.com", "Solapur", 62000.00),
			    new Employee(1009, "Pooja", "pooja@gmail.com", "Thane", 77000.00),
			    new Employee(1010, "Sachin", "sachin@gmail.com", "Satara", 85000.00)
			);
		
//		list.stream()
//		.map(Employee::getId)
//		.forEach(System.out::println);
		
		
//		Map<Integer, String> employeeMap = list.stream()
//			    .collect(Collectors.toMap(
//			        Employee::getId,
//			        Employee::getName
//			    ));
//
//			employeeMap.forEach((id, name) ->
//			    System.out.println(id + " : " + name));
			
			List<Employee> updatedEmployees = list.stream()
				    .map(emp -> new Employee(
				            emp.getId(),
				            emp.getName().toUpperCase(),
				            emp.getEmail(),
				            emp.getLocation().toUpperCase(),
				            emp.getSalary() + 80000
				    ))
				    .collect(Collectors.toList());

				updatedEmployees.forEach(System.out::println);
			
			
	}
}
