package com.day23.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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
		

		// Find customer with highest balance
		
//	      Bank highest = map.values()
//	              .stream()
//	              .max(Comparator.comparingDouble(Bank::getBalance))
//	              .orElseThrow(() -> new RuntimeException("No customers found"));
//	
//	      System.out.println("Highest Balance Customer:");
//	      System.out.println("ID          : " + highest.getBid());
//	      System.out.println("Name        : " + highest.getName());
//	      System.out.println("Balance     : " + highest.getBalance());
//	      System.out.println("Branch      : " + highest.getBranch());
//	      System.out.println("City        : " + highest.getCity());
//	      System.out.println("Account Type: " + highest.getAccountType());

     // we need to compare the balance inside each Bank object.
        
      Bank highestBank = map.values()
              .stream()
              .max(Comparator.comparingDouble(Bank::getBalance))
              .orElseThrow(() -> new RuntimeException("No customers found"));
      System.out.println(highestBank);

		
	}
}
