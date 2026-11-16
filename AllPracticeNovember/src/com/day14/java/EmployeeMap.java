package com.day14.java;

import java.util.*;

public class EmployeeMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();

		map.put(101, new Employee(101, "Rahul", "rahul@gmail.com", "Pune", 45000.0, "Developer", "IT"));

		map.put(102, new Employee(102, "Amit", "amit@gmail.com", "Mumbai", 55000.0, "Tester", "QA"));

		map.put(103, new Employee(103, "Sneha", "sneha@gmail.com", "Sangli", 60000.0, "Manager", "HR"));

		map.put(104, new Employee(104, "Priya", "priya@gmail.com", "Pune", 70000.0, "Developer", "IT"));

		map.put(105, new Employee(105, "Vijay", "vijay@gmail.com", "Nashik", 35000.0, "Support Engineer", "Support"));

		map.put(106, new Employee(106, "Neha", "neha@gmail.com", "Nagpur", 80000.0, "Team Lead", "IT"));

		map.put(107, new Employee(107, "Akash", "akash@gmail.com", "Kolhapur", 50000.0, "Accountant", "Finance"));

		map.put(108, new Employee(108, "Pooja", "pooja@gmail.com", "Satara", 65000.0, "Developer", "IT"));

		map.put(109, new Employee(109, "Rohit", "rohit@gmail.com", "Mumbai", 40000.0, "Tester", "QA"));

		map.put(110, new Employee(110, "Kiran", "kiran@gmail.com", "Pune", 90000.0, "Manager", "Sales"));

		// Display all employees

//		for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
//
//			System.out.println("Key : " + entry.getKey());
//			System.out.println("Value : " + entry.getValue());
//			System.out.println("--------------------------------");
//		}

		
		 // Find Employees Whose Salary Is Greater Than 50,000

//        map.entrySet()
//           .stream()
//           .filter(e -> e.getValue().getSalary() > 50000)
//           .forEach(e -> System.out.println(e.getValue()));

        // Find the employee with the second-highest salary.
        
		 Employee secondHighest = map.values()
	                .stream()
	                .sorted(Comparator.comparing(Employee::getSalary).reversed())
	                .skip(1)
	                .findFirst()
	                .orElse(null);

	        System.out.println("Second Highest Salary Employee:");

	        System.out.println(secondHighest);
	        
	        
        
	}
}
