package com.day21.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

import com.day15.java8ProgramsPractice.Employee;

public class EmployeeIdName {

	public static void main(String[] args) {
		
		Map<Integer, Employee> empMap = new HashMap<>();
		
		empMap.put(101, new Employee(101, "Rahul", "rahul@gmail.com", "IT", 65000.0, 9876543210L, "Pune"));
		empMap.put(102, new Employee(102, "Amit", "amit@gmail.com", "HR", 55000.0, 9876543211L, "Mumbai"));
		empMap.put(103, new Employee(103, "Priya", "priya@gmail.com", "Finance", 70000.0, 9876543212L, "Nagpur"));
		empMap.put(104, new Employee(104, "Sneha", "sneha@gmail.com", "Testing", 60000.0, 9876543213L, "Nashik"));
		empMap.put(105, new Employee(105, "Vikas", "vikas@gmail.com", "Development", 80000.0, 9876543214L, "Pune"));
		empMap.put(106, new Employee(106, "Neha", "neha@gmail.com", "Support", 50000.0, 9876543215L, "Aurangabad"));
		empMap.put(107, new Employee(107, "Rohit", "rohit@gmail.com", "Admin", 45000.0, 9876543216L, "Kolhapur"));
		empMap.put(108, new Employee(108, "Pooja", "pooja@gmail.com", "Sales", 58000.0, 9876543217L, "Satara"));
		empMap.put(109, new Employee(109, "Kiran", "kiran@gmail.com", "Marketing", 62000.0, 9876543218L, "Solapur"));
		empMap.put(110, new Employee(110, "Anjali", "anjali@gmail.com", "IT", 90000.0, 9876543219L, "Pune"));

        for(Map.Entry<Integer, Employee> entry : empMap.entrySet())
        {
        	System.out.println(entry.getKey() + " ->"+entry.getValue());
        }
        
	}
}
