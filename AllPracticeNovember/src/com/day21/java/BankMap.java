package com.day21.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class BankMap {

	public static void main(String[] args) {
		
		Map<Integer, Bank> map = new HashMap<>();

		map.put(101, new Bank(101, "Rahul", 50000.0, "SBI", "Pune", "Savings", "rahul@gmail.com", "9876543210"));

		map.put(102, new Bank(102, "Amit", 75000.0, "HDFC", "Mumbai", "Current", "amit@gmail.com", "9876543211"));

		map.put(103, new Bank(103, "Priya", 65000.0, "ICICI", "Pune", "Savings", "priya@gmail.com", "9876543212"));

		map.put(104, new Bank(104, "Sneha", 90000.0, "Axis", "Nashik", "Current", "sneha@gmail.com", "9876543213"));

		map.put(105, new Bank(105, "Vikas", 40000.0, "SBI", "Mumbai", "Savings", "vikas@gmail.com", "9876543214"));

		map.put(106, new Bank(106, "Kiran", 85000.0, "HDFC", "Pune", "Current", "kiran@gmail.com", "9876543215"));

		map.put(107, new Bank(107, "Snehal", 30000.0, "ICICI", "Kolhapur", "Savings", "snehal@gmail.com", "9876543216"));

		map.put(108, new Bank(108, "Rohit", 95000.0, "Axis", "Sangli", "Current", "rohit@gmail.com", "9876543217"));

		map.put(109, new Bank(109, "Neha", 55000.0, "SBI", "Nashik", "Savings", "neha@gmail.com", "9876543218"));

		map.put(110, new Bank(110, "Ajay", 120000.0, "HDFC", "Mumbai", "Current", "ajay@gmail.com", "9876543219"));
		
		// Find the customer with the highest balance
		
		Bank customer = map.values()
		        .stream()
		        .max(Comparator.comparing(Bank::getBalance))
		        .orElse(null);

		System.out.println(customer);
		
		
		
	}
}
