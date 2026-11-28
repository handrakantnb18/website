package com.day24.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// Employee class with 8 variables: id, name, email, salary, empType, city, project, department

public class EmployeeMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();

		map.put(101, new Employee(101, "Rahul", "rahul@gmail.com", 50000.0, "Permanent", "Pune", "Banking", "IT"));

		map.put(102, new Employee(102, "Amit", "amit@gmail.com", 75000.0, "Contract", "Mumbai", "Insurance", "IT"));

		map.put(103, new Employee(103, "Priya", "priya@gmail.com", 65000.0, "Permanent", "Pune", "Banking", "HR"));

		map.put(104,
				new Employee(104, "Sneha", "sneha@gmail.com", 90000.0, "Permanent", "Nashik", "Finance", "Finance"));

		map.put(105, new Employee(105, "Vikas", "vikas@gmail.com", 40000.0, "Contract", "Mumbai", "Banking", "IT"));

		map.put(106, new Employee(106, "Kiran", "kiran@gmail.com", 85000.0, "Permanent", "Pune", "Insurance", "HR"));

		map.put(107,
				new Employee(107, "Neha", "neha@gmail.com", 30000.0, "Contract", "Kolhapur", "Finance", "Finance"));

		map.put(108, new Employee(108, "Rohit", "rohit@gmail.com", 95000.0, "Permanent", "Sangli", "Banking", "IT"));

		map.put(109, new Employee(109, "Ajay", "ajay@gmail.com", 55000.0, "Permanent", "Nashik", "Insurance", "HR"));

		map.put(110,
				new Employee(110, "Pooja", "pooja@gmail.com", 120000.0, "Permanent", "Mumbai", "Finance", "Finance"));

		// Display all employees
		// map.forEach((id, employee) -> System.out.println(id + " : " + employee));

		// Find employee with highest salary

//		Employee emp = map.values().stream()
//				.max(Comparator.comparing(Employee::getSalary))
//				.orElse(null);
//
//		System.out.println("Highest Salary Employee:");
//
//		if (emp != null) {
//			System.out.println("ID         : " + emp.getId());
//			System.out.println("Name       : " + emp.getName());
//			System.out.println("Salary     : " + emp.getSalary());
//			System.out.println("Department : " + emp.getDepartment());
//		}

		// Find employee with lowest salary

		Employee emp = map.values()
		        .stream()
		        .min(Comparator.comparing(Employee::getSalary))
		        .orElse(null);

		if (emp != null) {

		    System.out.println("Lowest Salary Employee:");

		    System.out.println("ID         : " + emp.getId());
		    System.out.println("Name       : " + emp.getName());
		    System.out.println("Email      : " + emp.getEmail());
		    System.out.println("Salary     : " + emp.getSalary());
		    System.out.println("EmpType    : " + emp.getEmpType());
		    System.out.println("City       : " + emp.getCity());
		    System.out.println("Project    : " + emp.getProject());
		    System.out.println("Department : " + emp.getDepartment());
		}
		
		
		
	}
}
