package com.day28.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Map<Integer, Employee> list = new HashMap<Integer, Employee>();
		
		list.put(101, new Employee(101, "Rahul", "rahul@gmail.com", "IT", 75000.0, "Software Engineer", "Pune"));

		list.put(102, new Employee(102, "Priya", "priya@gmail.com", "HR", 65000.0, "HR Manager", "Mumbai"));

		list.put(103, new Employee(103, "Amit", "amit@gmail.com", "Finance", 80000.0, "Accountant", "Pune"));

		list.put(104, new Employee(104, "Sneha", "sneha@gmail.com", "IT", 90000.0, "Senior Developer", "Nashik"));

		list.put(105, new Employee(105, "Vikas", "vikas@gmail.com", "Sales", 60000.0, "Sales Executive", "Mumbai"));

		list.put(106, new Employee(106, "Neha", "neha@gmail.com", "IT", 85000.0, "Java Developer", "Pune"));

		list.put(107, new Employee(107, "Rohit", "rohit@gmail.com", "Marketing", 70000.0, "Marketing Manager", "Delhi"));

		list.put(108, new Employee(108, "Pooja", "pooja@gmail.com", "Finance", 72000.0, "Financial Analyst", "Nagpur"));

		list.put(109, new Employee(109, "Sagar", "sagar@gmail.com", "IT", 95000.0, "Team Lead", "Pune"));

		list.put(110, new Employee(110, "Kiran", "kiran@gmail.com", "Admin", 55000.0, "Administrator", "Mumbai"));
		
		// Print all employees
//		for(Map.Entry<Integer, Employee> entry : list.entrySet()) {
//			System.out.println(entry.getKey()+ " : "+entry.getValue());
//		}
		
		// Using max() salary employee
		Employee highSalary = list.values()
				.stream()
				.max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.orElse(null);
		
		System.out.println(highSalary);
		
		
	}
}
