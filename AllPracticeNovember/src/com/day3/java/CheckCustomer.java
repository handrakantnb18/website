package com.day3.java;

import java.util.*;

public class CheckCustomer {

	public static void main(String[] args) {

		Map<Integer, Customer> map = new HashMap<>();

		map.put(1, new Customer(1, "Rahul", "rahul@gmail.com", 25000.0, "Mobile", "Pune", "Hinjewadi", 2));

		map.put(2, new Customer(2, "Amit", "amit@gmail.com", 45000.0, "Laptop", "Mumbai", "Andheri", 1));

		map.put(3, new Customer(3, "Priya", "priya@gmail.com", 15000.0, "Watch", "Sangli", "Vishrambag", 3));

		map.put(4, new Customer(4, "Sneha", "sneha@gmail.com", 35000.0, "Mobile", "Pune", "Viman Nagar", 1));

		map.put(5, new Customer(5, "Rohit", "rohit@gmail.com", 55000.0, "Laptop", "Nashik", "College Road", 2));

		map.put(6, new Customer(6, "Pooja", "pooja@gmail.com", 12000.0, "Watch", "Kolhapur", "Rajaram Puri", 4));

		map.put(7, new Customer(7, "Vikas", "vikas@gmail.com", 65000.0, "Laptop", "Pune", "Kharadi", 1));

		map.put(8, new Customer(8, "Neha", "neha@gmail.com", 18000.0, "Mobile", "Mumbai", "Thane", 2));

		map.put(9, new Customer(9, "Akash", "akash@gmail.com", 30000.0, "Tablet", "Sangli", "Miraj", 3));

		map.put(10, new Customer(10, "Kiran", "kiran@gmail.com", 75000.0, "Laptop", "Pune", "Wakad", 2));

		// Display all customers

		for (Map.Entry<Integer, Customer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		
		
	}
}
