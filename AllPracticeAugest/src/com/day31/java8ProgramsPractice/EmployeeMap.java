package com.day31.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		emp.put(101, new Employee(101, "Amit", "amit@gmail.com", 75000.0, "IT", "Pune", "Software Engineer"));

		emp.put(102, new Employee(102, "Rahul", "rahul@gmail.com", 85000.0, "IT", "Mumbai", "Senior Software Engineer"));

		emp.put(103, new Employee(103, "Priya", "priya@gmail.com", 65000.0, "HR", "Pune", "HR Executive"));

		emp.put(104, new Employee(104, "Sneha", "sneha@gmail.com", 95000.0, "IT", "Bangalore", "Tech Lead"));

		emp.put(105, new Employee(105, "Vikas", "vikas@gmail.com", 55000.0, "Finance", "Nashik", "Accountant"));

		emp.put(106, new Employee(106, "Neha", "neha@gmail.com", 80000.0, "Testing", "Pune", "Test Engineer"));

		emp.put(107, new Employee(107, "Suresh", "suresh@gmail.com", 100000.0, "IT", "Hyderabad", "Project Manager"));

		emp.put(108, new Employee(108, "Pooja", "pooja@gmail.com", 70000.0, "HR", "Mumbai", "HR Manager"));

		emp.put(109, new Employee(109, "Rohit", "rohit@gmail.com", 90000.0, "IT", "Pune", "Backend Developer"));

		emp.put(110, new Employee(110, "Kiran", "kiran@gmail.com", 60000.0, "Sales", "Kolhapur", "Sales Executive"));
		
//		emp.forEach((id, name) -> {
//			System.out.println(id+" : "+name);
//		});
		
		// Highest salary amount
		
		Double maximum =
				emp.values()
				.stream()
				.map(Employee::getSalary)
				.max(Double::compareTo)
				.orElse(0.0);
		
		System.out.println("Highest Salary : "+maximum);
		
		// 
		
	}
}
