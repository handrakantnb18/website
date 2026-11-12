package com.day9.java;

import java.util.HashMap;
import java.util.Map;


public class BankMap {

	public static void main(String[] args) {
		
		Map<Integer, Bank> map = new HashMap<Integer, Bank>();

		map.put(101, new Bank(101, "Rahul", 50000.0, "SBI", "Pune", "Savings"));

		map.put(102, new Bank(102, "Amit", 75000.0, "HDFC", "Mumbai", "Current"));

		map.put(103, new Bank(103, "Priya", 90000.0, "ICICI", "Sangli", "Savings"));

		map.put(104, new Bank(104, "Sneha", 45000.0, "Axis", "Pune", "Salary"));

		map.put(105, new Bank(105, "Vijay", 120000.0, "SBI", "Nashik", "Current"));

		map.put(106, new Bank(106, "Akash", 65000.0, "HDFC", "Kolhapur", "Savings"));

		map.put(107, new Bank(107, "Neha", 85000.0, "ICICI", "Mumbai", "Salary"));

		map.put(108, new Bank(108, "Sagar", 30000.0, "Axis", "Pune", "Savings"));

		map.put(109, new Bank(109, "Pooja", 150000.0, "SBI", "Sangli", "Current"));

		map.put(110, new Bank(110, "Kiran", 55000.0, "HDFC", "Nashik", "Savings"));

		// Display all customers
		map.forEach((key, value) -> System.out.println(value));
		
		
	}
}
