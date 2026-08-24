package com.day24.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(1, new Employee(1, "Rahul", "rahul@gmail.com", "IT", 65000.0, "9876543210", "Pune"));

        map.put(2, new Employee(2, "Amit", "amit@gmail.com", "HR", 55000.0, "9876543211", "Mumbai"));

        map.put(3, new Employee(3, "Priya", "priya@gmail.com", "IT", 75000.0, "9876543212", "Nashik"));

        map.put(4, new Employee(4, "Sneha", "sneha@gmail.com", "Finance", 70000.0, "9876543213", "Pune"));

        map.put(5, new Employee(5, "Vijay", "vijay@gmail.com", "Sales", 50000.0, "9876543214", "Sangli"));

        map.put(6, new Employee(6, "Neha", "neha@gmail.com", "IT", 85000.0, "9876543215", "Kolhapur"));

        map.put(7, new Employee(7, "Rohit", "rohit@gmail.com", "HR", 60000.0, "9876543216", "Satara"));

        map.put(8, new Employee(8, "Pooja", "pooja@gmail.com", "Finance", 80000.0, "9876543217", "Aurangabad"));

        map.put(9, new Employee(9, "Suresh", "suresh@gmail.com", "Sales", 58000.0, "9876543218", "Nagpur"));

        map.put(10, new Employee(10, "Kiran", "kiran@gmail.com", "IT", 90000.0, "9876543219", "Thane"));
        
        map.forEach((id, name) -> {
        	System.out.println(id+" : "+name);
        });
        
        
        
	}
}
