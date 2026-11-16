package com.day14.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.day12.java.Bank;

public class BankMap {

	public static void main(String[] args) {
		
		Map<Integer, Bank> map = new HashMap<>();

		map.put(101, new Bank(101, "Rahul", 50000.0, "SBI", "Pune", "Savings"));

		map.put(102, new Bank(102, "Amit", 75000.0, "HDFC", "Mumbai", "Current"));

		map.put(103, new Bank(103, "Sneha", 90000.0, "ICICI", "Sangli", "Savings"));

		map.put(104, new Bank(104, "Priya", 120000.0, "SBI", "Pune", "Salary"));

		map.put(105, new Bank(105, "Vijay", 35000.0, "Axis", "Nashik", "Savings"));

		map.put(106, new Bank(106, "Neha", 150000.0, "HDFC", "Nagpur", "Current"));

		map.put(107, new Bank(107, "Akash", 65000.0, "ICICI", "Kolhapur", "Savings"));

		map.put(108, new Bank(108, "Pooja", 200000.0, "SBI", "Satara", "Salary"));

		map.put(109, new Bank(109, "Rohit", 45000.0, "Axis", "Mumbai", "Savings"));

		map.put(110, new Bank(110, "Kiran", 180000.0, "HDFC", "Pune", "Current"));

		// Display all bank customers

//		for (Map.Entry<Integer, Bank> entry : map.entrySet()) {
//
//			System.out.println(entry.getKey() + " = " + entry.getValue());
//		}

		  // Find customers balance greater than 50000

//        map.values()
//           .stream()
//           .filter(e -> e.getBalance() > 50000)
//           .forEach(System.out::println);
//        
        // Find customer with lowest balance
        
//		 Bank lowestBalance = map.values()
//	                .stream()
//	                .min(Comparator.comparing(Bank::getBalance))
//	                .orElse(null);
//
//	        System.out.println("Lowest Balance Customer:");
//
//	        System.out.println(lowestBalance);
//        
		// Find Customer with the Lowest Balance Using Java 8 Streams and Map Interface
		
//	        Bank lowestBalance = map.values()
//	                .stream()
//	                .sorted(Comparator.comparing(Bank::getBalance))
//	                .findFirst()
//	                .orElse(null);
//
//	        System.out.println(lowestBalance);
	        
	        // Find customers from Pune

//	        System.out.println("Customers from Pune:");
//
//	        map.values()
//	           .stream()
//	           .filter(e -> e.getCity().equals("Pune"))
//	           .forEach(System.out::println);

		// How can we count Pune customers?
		
//	        long count = map.values()
//	                .stream()
//	                .filter(e -> "Pune".equals(e.getCity()))
//	                .count();
//
//	        System.out.println("Total Pune Customers: " + count);
	        
	        
	        // Sort customers by balance descending

//	        System.out.println("Customers Sorted By Balance Descending:");
//
//	        map.values()
//	           .stream()
//	           .sorted(Comparator.comparing(
//	                   Bank::getBalance).reversed())
//	           .forEach(System.out::println);
	        
		// Sort customers by balance ascending
		
//	        map.values()
//	        .stream()
//	        .sorted(Comparator.comparing(Bank::getBalance))
//	        .forEach(System.out::println);
	        
		// Find the top 3 bank customers with the highest balance.
		
//	        map.values()
//	        .stream()
//	        .sorted(Comparator.comparing(
//	            Bank::getBalance).reversed())
//	        .limit(3)
//	        .forEach(System.out::println);
	        
	     // Calculate Average Bank Balance

	        double averageBalance = map.values()
	                .stream()
	                .mapToDouble(Bank::getBalance)
	                .average()
	                .orElse(0.0);

	        System.out.println("Average Bank Balance: " + averageBalance);
	        
	}
}
