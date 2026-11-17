package com.day15.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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

		 List<Bank> customers = Arrays.asList(

		            new Bank(101, "Rahul", 50000.0, "SBI", "Pune", "Saving"),
		            new Bank(102, "Amit", 75000.0, "HDFC", "Mumbai", "Current"),
		            new Bank(103, "Priya", 30000.0, "ICICI", "Sangli", "Saving"),
		            new Bank(104, "Sneha", 90000.0, "SBI", "Pune", "Salary"),
		            new Bank(105, "Vikas", 45000.0, "Axis", "Mumbai", "Saving"),
		            new Bank(106, "Kiran", 120000.0, "HDFC", "Sangli", "Current"),
		            new Bank(107, "Rohit", 25000.0, "ICICI", "Pune", "Salary"),
		            new Bank(108, "Pooja", 85000.0, "Axis", "Satara", "Saving"),
		            new Bank(109, "Sagar", 60000.0, "SBI", "Mumbai", "Current"),
		            new Bank(110, "Neha", 150000.0, "HDFC", "Pune", "Saving")
		        );

		        // Find customer with highest balance

//		        Optional<Bank> highestBalance = customers.stream()
//		                .max(Comparator.comparingDouble(Bank::getBalance));
//
//		        highestBalance.ifPresent(customer -> {
//		            System.out.println("Highest Balance Customer:");
//		            System.out.println("ID          : " + customer.getBid());
//		            System.out.println("Name        : " + customer.getName());
//		            System.out.println("Balance     : " + customer.getBalance());
//		            System.out.println("Branch      : " + customer.getBranch());
//		            System.out.println("City        : " + customer.getCity());
//		            System.out.println("Account Type: " + customer.getAccountType());
//		        });
        
		        
		        // Find customers having balance greater than 50000

		        List<Bank> result = customers.stream()
		                .filter(c -> c.getBalance() > 50000)
		                .collect(Collectors.toList());

		        System.out.println("Customers having balance greater than 50000:");

		        result.forEach(System.out::println);
		        
		        
	}
}
