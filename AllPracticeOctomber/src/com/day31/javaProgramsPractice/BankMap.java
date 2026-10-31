package com.day31.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

import com.day30.javaProgramsPractice.Bank;

public class BankMap {

	public static void main(String[] args) {
		
		Map<Integer, Bank> map = new HashMap<>();

		map.put(101, new Bank(101, "Rahul Patil", "rahul@gmail.com", 50000.0, "Pune", "SBI", "Savings Account"));

		map.put(102, new Bank(102, "Priya Sharma", "priya@gmail.com", 75000.0, "Mumbai", "HDFC", "Salary Account"));

		map.put(103, new Bank(103, "Amit Deshmukh", "amit@gmail.com", 120000.0, "Sangli", "ICICI", "Savings Account"));

		map.put(104, new Bank(104, "Sneha Joshi", "sneha@gmail.com", 45000.0, "Nashik", "Axis Bank", "Current Account"));

		map.put(105, new Bank(105, "Vikas Shinde", "vikas@gmail.com", 95000.0, "Pune", "SBI", "Salary Account"));

		map.put(106, new Bank(106, "Pooja More", "pooja@gmail.com", 150000.0, "Kolhapur", "HDFC", "Savings Account"));

		map.put(107, new Bank(107, "Sagar Jadhav", "sagar@gmail.com", 65000.0, "Mumbai", "ICICI", "Current Account"));

		map.put(108, new Bank(108, "Neha Kulkarni", "neha@gmail.com", 200000.0, "Pune", "Axis Bank", "Savings Account"));

		map.put(109, new Bank(109, "Akash Pawar", "akash@gmail.com", 85000.0, "Sangli", "SBI", "Salary Account"));

		map.put(110, new Bank(110, "Rohit Kadam", "rohit@gmail.com", 175000.0, "Nashik", "HDFC", "Savings Account"));

		// Display all 10 bank customers Bank Customers using the Map interface
		
//		for (Map.Entry<Integer, Bank> 
//		entry : map.entrySet()) {
//			
//			System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}
//		
		
		// Using the 10 Bank customers above, find the customer with the highest balance using Java Streams.
		
//		Bank highestBalanceCustomer = map.values()
//		        .stream()
//		        .max(Comparator.comparing(Bank::getBalance))
//		        .orElseThrow(() -> new RuntimeException("No customers found"));
//
//		System.out.println("Customer Name: " + highestBalanceCustomer.getBname());
//		System.out.println("Balance: " + highestBalanceCustomer.getBalance());
//		System.out.println("City: " + highestBalanceCustomer.getBcity());
//		System.out.println("Bank: " + highestBalanceCustomer.getBbranch());

		// max() returns an Optional<Bank> because the Map might be empty

		Bank highest = map.values()
		        .stream()
		        .max((b1, b2) ->
		                b1.getBalance().compareTo(b2.getBalance()))
		        .orElseThrow();

		System.out.println(highest);
		
		
	}
}
