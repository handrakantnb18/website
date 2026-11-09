package com.day7.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class CustomerMap {

	public static void main(String[] args) {
		
		Map<Integer, Customer> map = new HashMap<Integer, Customer>();

		map.put(101, new Customer(101, "Rahul", 50000.0, "SBI", "Pune", "Savings"));

		map.put(102, new Customer(102, "Amit", 75000.0, "HDFC", "Mumbai", "Current"));

		map.put(103, new Customer(103, "Priya", 90000.0, "ICICI", "Sangli", "Savings"));

		map.put(104, new Customer(104, "Sneha", 45000.0, "Axis", "Pune", "Salary"));

		map.put(105, new Customer(105, "Vijay", 120000.0, "SBI", "Nashik", "Current"));

		map.put(106, new Customer(106, "Akash", 65000.0, "HDFC", "Kolhapur", "Savings"));

		map.put(107, new Customer(107, "Neha", 85000.0, "ICICI", "Mumbai", "Salary"));

		map.put(108, new Customer(108, "Sagar", 30000.0, "Axis", "Pune", "Savings"));

		map.put(109, new Customer(109, "Pooja", 150000.0, "SBI", "Sangli", "Current"));

		map.put(110, new Customer(110, "Kiran", 55000.0, "HDFC", "Nashik", "Savings"));

		// Display all customers
		 // map.forEach((key, value) -> System.out.println(value));

		// Find Customers from Pune City
			
			 Map<Integer, Customer> result = map.entrySet()
		                .stream()
		                .filter(entry -> entry.getValue()
		                        .getCity().equalsIgnoreCase("Pune"))
		                .collect(Collectors.toMap(
		                        Map.Entry::getKey,
		                        Map.Entry::getValue
		                ));

		        result.forEach((key, value) ->
		                System.out.println(key + " = " + value));
		        
		       
	}
	
}
