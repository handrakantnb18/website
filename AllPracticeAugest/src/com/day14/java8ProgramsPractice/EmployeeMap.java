package com.day14.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		 map.put(101, new Employee(101, "Rahul", "rahul@gmail.com",  "Pune", "9876543210", 55000.0, "IT"));

	        map.put(102, new Employee(102, "Priya", "priya@gmail.com", "Mumbai", "9876543211", 60000.0, "HR"));

	        map.put(103, new Employee(103, "Amit", "amit@gmail.com", "Nashik", "9876543212", 65000.0, "Finance"));

	        map.put(104, new Employee(104, "Sneha", "sneha@gmail.com", "Nagpur", "9876543213", 58000.0, "IT"));

	        map.put(105, new Employee(105, "Vijay", "vijay@gmail.com", "Kolhapur", "9876543214", 70000.0, "Sales"));

	        map.put(106, new Employee(106, "Pooja", "pooja@gmail.com", "Satara", "9876543215", 62000.0, "HR"));

	        map.put(107, new Employee(107, "Rohit", "rohit@gmail.com", "Aurangabad", "9876543216", 75000.0, "IT"));

	        map.put(108, new Employee(108, "Neha", "neha@gmail.com", "Solapur", "9876543217", 68000.0, "Finance"));

	        map.put(109, new Employee(109, "Suresh", "suresh@gmail.com", "Pune", "9876543218", 72000.0, "Sales"));

	        map.put(110, new Employee(110, "Kiran", "kiran@gmail.com", "Mumbai", "9876543219", 80000.0, "IT"));
		
		// 10 Employee objects using Map<Integer, Employee>, use the employee id as the map key.
	        map.forEach((id, name) -> {
	        	System.out.println(id+" : "+name);
	        });
	        
	        // key and value
	        
	        map.forEach((key, value) -> {
	        	System.out.println(key+ " : "+value);
	        });
	        
	        
	}
}
