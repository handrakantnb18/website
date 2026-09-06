package com.day5.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Rahul", "rahul@gmail.com", 80000.0, "IT"));
		map.put(2, new Employee(2, "Priya", "priya@gmail.com", 95000.0, "IT"));
		map.put(3, new Employee(3, "Amit", "amit@gmail.com", 75000.0, "HR"));
		map.put(4, new Employee(4, "Sneha", "sneha@gmail.com", 85000.0, "HR"));
		map.put(5, new Employee(5, "Vikas", "vikas@gmail.com", 120000.0, "Finance"));
		map.put(6, new Employee(6, "Neha", "neha@gmail.com", 100000.0, "Finance"));
		map.put(7, new Employee(7, "Rohan", "rohan@gmail.com", 70000.0, "IT"));
		map.put(8, new Employee(8, "Pooja", "pooja@gmail.com", 90000.0, "HR"));
		map.put(9, new Employee(9, "Karan", "karan@gmail.com", 110000.0, "Finance"));
		map.put(10, new Employee(10, "Anjali", "anjali@gmail.com", 65000.0, "HR"));

		
//		Map<String, Optional<Employee>> result =
//		        map.values()
//		           .stream()
//		           .collect(Collectors.groupingBy(
//		               Employee::getDept,
//		               Collectors.collectingAndThen(
//		                   Collectors.toList(),
//		                   employees -> employees.stream()
//		                       .sorted(Comparator.comparingDouble(Employee::getSalary)
//		                                         .reversed())
//		                       .skip(1)
//		                       .findFirst()
//		               )
//		           ));
//
//		result.forEach((dept, employee) ->
//		    System.out.println(dept + " : " + employee.orElse(null))
//		);

		

		
	}
}
