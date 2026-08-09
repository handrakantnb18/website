package com.day8.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		  map.put(101, new Employee(101, "Amit", "amit@gmail.com", "IT", "Pune", "9876543210", "Male"));

	        map.put(102, new Employee(102, "Rahul", "rahul@gmail.com", "HR", "Mumbai", "9876543211", "Male"));

	        map.put(103, new Employee(103, "Priya", "priya@gmail.com", "Finance", "Pune", "9876543212", "Female"));

	        map.put(104, new Employee(104, "Sneha", "sneha@gmail.com", "IT", "Nashik", "9876543213", "Female"));

	        map.put(105, new Employee(105, "Vijay", "vijay@gmail.com", "Sales", "Sangli", "9876543214", "Male"));

	        map.put(106, new Employee(106, "Neha", "neha@gmail.com", "HR", "Kolhapur", "9876543215", "Female"));

	        map.put(107, new Employee(107, "Rohit", "rohit@gmail.com", "IT", "Pune", "9876543216", "Male"));

	        map.put(108, new Employee(108, "Pooja", "pooja@gmail.com", "Finance", "Satara", "9876543217", "Female"));

	        map.put(109, new Employee(109, "Suresh", "suresh@gmail.com", "Sales", "Mumbai", "9876543218", "Male"));

	        map.put(110, new Employee(110, "Kiran", "kiran@gmail.com", "IT", "Pune", "9876543219", "Male"));
	        
	        map.put(111, new Employee(111, "Sivraj", "shivraj@gmail.com", "IT", "Pune", "9975629875", "Male"));
	        
	        
	       // map.forEach((id, name) -> System.out.println(id+ " "+name));
	        
	        
	        map.values()
	           .stream()
	           .map(Employee::getName)
	           .forEach(System.out::println);
	        
	        
	}
}
