package com.day2.java17features;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Chandrakant", "chandrakant@gmail.com", 75000.0, "Pune", "IT", "Java Developer"));

		map.put(102, new Employee(102, "Rahul", "rahul@gmail.com", 68000.0, "Mumbai", "IT", "Software Engineer"));

		map.put(103, new Employee(103, "Priyanka", "priyanka@gmail.com", 72000.0, "Pune", "HR", "HR Executive"));

		map.put(104, new Employee(104, "Amit", "amit@gmail.com", 85000.0, "Bangalore", "IT", "Senior Developer"));

		map.put(105, new Employee(105, "Sneha", "sneha@gmail.com", 65000.0, "Nashik", "Finance", "Accountant"));

		map.put(106, new Employee(106, "Vikram", "vikram@gmail.com", 90000.0, "Mumbai", "IT", "Tech Lead"));

		map.put(107, new Employee(107, "Neha", "neha@gmail.com", 70000.0, "Pune", "Marketing", "Marketing Executive"));

		map.put(108, new Employee(108, "Sagar", "sagar@gmail.com", 62000.0, "Kolhapur", "Sales", "Sales Executive"));

		map.put(109, new Employee(109, "Pooja", "pooja@gmail.com", 78000.0, "Hyderabad", "IT", "Backend Developer"));

		map.put(110, new Employee(110, "Akash", "akash@gmail.com", 95000.0, "Bangalore", "IT", "Project Manager"));
		
		// Print all employees 
//		map.forEach((id, name) -> {
//			System.out.println(id+" : "+name);
//		});
		
		// Find second-highest salary
		
		Double secHighSal = 
				map.values()
				.stream()
				.map(Employee::getSalary)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.findFirst()
				.orElse(null);
		
		System.out.println("Second High Salary : "+secHighSal);
		
		
	}
}
