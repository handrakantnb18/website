package com.day13.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		  map.put(101, new Employee(101, "Rahul", "rahul@gmail.com", "9876543210", "IT", "Pune", 55000.0));

	        map.put(102, new Employee(102, "Amit", "amit@gmail.com", "9876543211", "HR", "Mumbai", 50000.0));

	        map.put(103, new Employee(103, "Priya", "priya@gmail.com", "9876543212", "Finance", "Pune", 60000.0));

	        map.put(104, new Employee(104, "Sneha", "sneha@gmail.com", "9876543213", "IT", "Nashik", 65000.0));

	        map.put(105, new Employee(105, "Rohit", "rohit@gmail.com", "9876543214", "Sales", "Mumbai", 48000.0));

	        map.put(106, new Employee(106, "Neha", "neha@gmail.com", "9876543215", "IT", "Pune", 70000.0));

	        map.put(107, new Employee(107, "Vikas", "vikas@gmail.com", "9876543216", "HR", "Nagpur", 52000.0));

	        map.put(108, new Employee(108, "Pooja", "pooja@gmail.com", "9876543217", "Finance", "Kolhapur", 58000.0));

	        map.put(109, new Employee(109, "Sagar", "sagar@gmail.com", "9876543218", "Sales", "Pune", 62000.0));

	        map.put(110, new Employee(110, "Kiran", "kiran@gmail.com", "9876543219", "IT", "Mumbai", 75000.0));
	        
	        
	        for(Map.Entry<Integer, Employee> entry : map.entrySet()) {
	        	System.out.println(entry.getKey()+" : "+entry.getValue());
	        	
	        	
	        }
	        
	}
}
