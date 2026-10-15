package com.day15.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

import com.day14.javaProgramsPractice.Employee;

public class EmployeeMap {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Rahul", "rahul@gmail.com", 45000.0, "IT", "Pune", "Developer"),

				new Employee(2, "Priya", "priya@gmail.com", 65000.0, "HR", "Mumbai", "HR Executive"),

				new Employee(3, "Amit", "amit@gmail.com", 85000.0, "IT", "Pune", "Senior Developer"),

				new Employee(4, "Sneha", "sneha@gmail.com", 55000.0, "Finance", "Nashik", "Accountant"),

				new Employee(5, "Vijay", "vijay@gmail.com", 95000.0, "IT", "Mumbai", "Tech Lead"),

				new Employee(6, "Pooja", "pooja@gmail.com", 40000.0, "HR", "Pune", "Recruiter"),

				new Employee(7, "Sagar", "sagar@gmail.com", 75000.0, "Finance", "Mumbai", "Analyst"),

				new Employee(8, "Neha", "neha@gmail.com", 60000.0, "IT", "Nashik", "Developer"),

				new Employee(9, "Kiran", "kiran@gmail.com", 50000.0, "Sales", "Pune", "Sales Executive"),

				new Employee(10, "Rohit", "rohit@gmail.com", 90000.0, "IT", "Mumbai", "Architect"));

		// If the interviewer asks only for the highest salary amount,

		Double highestSalary = 
				employees.stream()
				.map(Employee::getSalary)
				.max(Double::compareTo)
				.orElse(0.0);

		System.out.println("Highest Salary : " + highestSalary);

	}
}
