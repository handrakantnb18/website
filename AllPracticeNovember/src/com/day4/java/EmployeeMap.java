package com.day4.java;

import java.util.*;

public class EmployeeMap {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(

				new Employee(1, "Rahul", "rahul@gmail.com", 45000.0, "Permanent", "Pune", "Banking"),

				new Employee(2, "Amit", "amit@gmail.com", 55000.0, "Contract", "Mumbai", "Insurance"),

				new Employee(3, "Sneha", "sneha@gmail.com", 65000.0, "Permanent", "Pune", "E-Commerce"),

				new Employee(4, "Priya", "priya@gmail.com", 35000.0, "Intern", "Nashik", "Banking"),

				new Employee(5, "Suresh", "suresh@gmail.com", 75000.0, "Permanent", "Bangalore", "Healthcare"),

				new Employee(6, "Neha", "neha@gmail.com", 60000.0, "Contract", "Mumbai", "Insurance"),

				new Employee(7, "Kiran", "kiran@gmail.com", 80000.0, "Permanent", "Pune", "Banking"),

				new Employee(8, "Pooja", "pooja@gmail.com", 40000.0, "Intern", "Delhi", "E-Commerce"),

				new Employee(9, "Vikas", "vikas@gmail.com", 90000.0, "Permanent", "Bangalore", "Healthcare"),

				new Employee(10, "Anjali", "anjali@gmail.com", 50000.0, "Contract", "Nashik", "Banking")

		);


		Map<Integer, Employee> employeeMap = new HashMap<>();
//		
//		for (Employee emp : employees) {
//		    employeeMap.put(emp.getId(), emp);
//		}
//
//		// Display all employees
//		employeeMap.forEach((id, emp) -> {
//		    System.out.println(id + " " + emp.getName() + " "
//		            + emp.getSalary() + " " + emp.getCity());
//		});
		
		// Display employees whose salary is greater than 50,000.
		
		employeeMap.values()
	    .stream()
	    .filter(emp -> emp.getSalary() > 50000)
	    .forEach(emp -> System.out.println(
	        emp.getId() + " " +
	        emp.getName() + " " +
	        emp.getSalary() + " " +
	        emp.getCity()
	    ));
		
		System.out.println(employeeMap);
		
		
	}
}
