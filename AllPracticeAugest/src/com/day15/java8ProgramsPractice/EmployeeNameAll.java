package com.day15.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeNameAll {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(1, new Employee(1, "Chandrakant", "chandra@gmail.com", "9876543210", "IT", 60000.0, "Pune"));

		map.put(2, new Employee(2, "Rahul", "rahul@gmail.com", "9876543211", "HR", 55000.0, "Mumbai"));

		map.put(3, new Employee(3, "Amit", "amit@gmail.com", "9876543212", "IT", 65000.0, "Nagpur"));

		map.put(4, new Employee(4, "Priya", "priya@gmail.com", "9876543213", "Finance", 58000.0, "Nashik"));

		map.put(5, new Employee(5, "Sneha", "sneha@gmail.com", "9876543214", "IT", 70000.0, "Pune"));

		map.put(6, new Employee(6, "Vijay", "vijay@gmail.com", "9876543215", "Sales", 52000.0, "Sangli"));

		map.put(7, new Employee(7, "Akash", "akash@gmail.com", "9876543216", "HR", 48000.0, "Kolhapur"));

		map.put(8, new Employee(8, "Pooja", "pooja@gmail.com", "9876543217", "Finance", 62000.0, "Satara"));

		map.put(9, new Employee(9, "Rohit", "rohit@gmail.com", "9876543218", "IT", 75000.0, "Aurangabad"));

		map.put(10, new Employee(10, "Neha", "neha@gmail.com", "9876543219", "Sales", 57000.0, "Mumbai"));
		
		map.forEach((id, emp) -> {
			System.out.println(id+" : "+emp);
		});
		
		
		
	}
}
