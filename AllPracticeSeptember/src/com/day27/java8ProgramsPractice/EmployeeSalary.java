package com.day27.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Map<Long, Employee> emp = new HashMap<Long, Employee>();
		
		emp.put(1L, new Employee(1L, "Rahul", "rahul@gmail.com", 75000.0, "IT", "Pune", "Java Developer"));
		
		emp.put(2L, new Employee(2L, "Amit", "amit@gmail.com", 85000.0, "IT", "Mumbai", "Senior Java Developer"));
		
		emp.put(3L, new Employee(3L, "Priya", "priya@gmail.com", 65000.0, "HR", "Pune", "HR Executive"));
		
		emp.put(4L, new Employee(4L, "Sneha", "sneha@gmail.com", 95000.0, "Finance", "Bangalore", "Financial Analyst"));
		
		emp.put(5L, new Employee(5L, "Rohit", "rohit@gmail.com", 55000.0, "IT", "Pune", "Backend Developer"));
		
		emp.put(6L, new Employee(6L, "Neha", "neha@gmail.com", 80000.0, "Finance", "Mumbai", "Accountant"));
		
		emp.put(7L, new Employee(7L, "Vikram", "vikram@gmail.com", 70000.0, "HR", "Nashik", "HR Manager"));
		
		emp.put(8L, new Employee(8L, "Pooja", "pooja@gmail.com", 90000.0, "IT", "Hyderabad", "Full Stack Developer"));
		
		emp.put(9L, new Employee(9L, "Suresh", "suresh@gmail.com", 60000.0, "Sales", "Pune", "Sales Executive"));
		
		emp.put(10L, new Employee(10L, "Anjali", "anjali@gmail.com", 100000.0, "IT", "Mumbai", "Team Lead"));
		
		
		emp.forEach((id, name) -> {
			System.out.println(id+" "+name);
		});
		
		
	}
}
