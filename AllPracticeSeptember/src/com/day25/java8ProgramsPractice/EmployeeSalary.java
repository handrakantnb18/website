package com.day25.java8ProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {

		Map<Integer, Employee> employees = new HashMap<>();

		employees.put(101, new Employee(101, "Rahul Sharma", "rahul.sharma@gmail.com", 75000.0, "IT", "Pune", "Java Developer"));

		employees.put(102, new Employee(102, "Amit Patil", "amit.patil@gmail.com", 85000.0, "IT", "Mumbai", "Senior Java Developer"));

		employees.put(103,
				new Employee(103, "Priya Deshmukh", "priya.deshmukh@gmail.com", 65000.0, "HR", "Pune", "HR Executive"));

		employees.put(104, new Employee(104, "Sneha Kulkarni", "sneha.kulkarni@gmail.com", 95000.0, "IT", "Bangalore", "Full Stack Developer"));

		employees.put(105, new Employee(105, "Vijay Jadhav", "vijay.jadhav@gmail.com", 55000.0, "Finance", "Pune", "Finance Analyst"));

		employees.put(106, new Employee(106, "Neha Joshi", "neha.joshi@gmail.com", 80000.0, "IT", "Hyderabad", "Backend Developer"));

		employees.put(107, new Employee(107, "Suresh More", "suresh.more@gmail.com", 70000.0, "Sales", "Mumbai", "Sales Executive"));

		employees.put(108, new Employee(108, "Pooja Bhosale", "pooja.bhosale@gmail.com", 90000.0, "IT", "Pune", "Software Engineer"));

		employees.put(109, new Employee(109, "Akash Shinde", "akash.shinde@gmail.com", 60000.0, "Finance", "Nashik", "Financial Analyst"));

		employees.put(110, new Employee(110, "Kiran Pawar", "kiran.pawar@gmail.com", 100000.0, "IT", "Bangalore", "Tech Lead"));

//		employees.values()
//        .stream()
//        .filter(emp -> emp.getSalary() > 80000)
//        .forEach(System.out::println);
		
		// Find the Second-Highest Salary using Java 8 Streams
		
//		Double secondHighestSalary = employees.values()
//		        .stream()
//		        .map(Employee::getSalary)
//		        .distinct()
//		        .sorted(Comparator.reverseOrder())
//		        .skip(1)
//		        .findFirst()
//		        .orElse(null);
//
//		System.out.println("Second Highest Salary: " + secondHighestSalary);
		
		// If you want the complete Employee : Second-highest salary employee: Sneha Kulkarni — ₹95,000.
		
//		Employee secondHighestEmployee = employees.values()
//		        .stream()
//		        .sorted(Comparator.comparing(Employee::getSalary).reversed())
//		        .skip(1)
//		        .findFirst()
//		        .orElse(null);
//
//		System.out.println(secondHighestEmployee);
		
		// Sort Employees by Salary in Descending Order
		
		employees.values()
        .stream()
        .sorted(Comparator.comparing(Employee::getSalary).reversed())
        .forEach(System.out::println);
		
		// 
		
	}
}
