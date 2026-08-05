package com.day4.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Amit", "Pune", "9876543210", "amit@gmail.com", "IT"));
		map.put(102, new Employee(102, "Rahul", "Mumbai", "9876543211", "rahul@gmail.com", "HR"));
		map.put(103, new Employee(103, "Sneha", "Nashik", "9876543212", "sneha@gmail.com", "Finance"));
		map.put(104, new Employee(104, "Priya", "Nagpur", "9876543213", "priya@gmail.com", "Admin"));
		map.put(105, new Employee(105, "Vikas", "Pune", "9876543214", "vikas@gmail.com", "IT"));
		map.put(106, new Employee(106, "Neha", "Kolhapur", "9876543215", "neha@gmail.com", "Sales"));
		map.put(107, new Employee(107, "Rohit", "Satara", "9876543216", "rohit@gmail.com", "Support"));
		map.put(108, new Employee(108, "Pooja", "Solapur", "9876543217", "pooja@gmail.com", "Testing"));
		map.put(109, new Employee(109, "Karan", "Aurangabad", "9876543218", "karan@gmail.com", "DevOps"));
		map.put(110, new Employee(110, "Anjali", "Sangli", "9876543219", "anjali@gmail.com", "QA"));

		map.forEach((id, emp) ->
		System.out.println(id+ " "+emp));
		
		
		
	}
}
