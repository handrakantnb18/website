package com.day1.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Amit Sharma", 55000.0, 3, "IT", "9876543210", "amit@gmail.com"));
		map.put(102, new Employee(102, "Rahul Patil", 85000.0, 7, "HR", "9876543211", "rahul@gmail.com"));
		map.put(103, new Employee(103, "Priya Verma", 95000.0, 8, "Finance", "9876543212", "priya@gmail.com"));
		map.put(104, new Employee(104, "Sneha Kulkarni", 45000.0, 2, "Sales", "9876543213", "sneha@gmail.com"));
		map.put(105, new Employee(105, "Vikas Jadhav", 70000.0, 5, "Marketing", "9876543214", "vikas@gmail.com"));
		map.put(106, new Employee(106, "Pooja Deshmukh", 65000.0, 4, "IT", "9876543215", "pooja@gmail.com"));
		map.put(107, new Employee(107, "Rohit Joshi", 120000.0, 10, "Development", "9876543216", "rohit@gmail.com"));
		map.put(108, new Employee(108, "Neha Chavan", 50000.0, 2, "Support", "9876543217", "neha@gmail.com"));
		map.put(109, new Employee(109, "Kiran Pawar", 98000.0, 9, "Testing", "9876543218", "kiran@gmail.com"));
		map.put(110, new Employee(110, "Anjali More", 60000.0, 5, "Admin", "9876543219", "anjali@gmail.com"));	
		
		
		map.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " -> "+entry.getValue());
			
		});
	}
}
