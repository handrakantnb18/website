package com.day20.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.day12.java.Bank;

public class BankCustomer {

	public static void main(String[] args) {

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
				new Bank(110, "Neha", 150000.0, "HDFC", "Pune", "Saving"));

		// Find customer with highest balance

//		Optional<Bank> highestBalance = customers.stream().max(Comparator.comparingDouble(Bank::getBalance));
//
//		highestBalance.ifPresent(customer -> {
//			System.out.println("Highest Balance Customer:");
//			System.out.println("ID          : " + customer.getBid());
//			System.out.println("Name        : " + customer.getName());
//			System.out.println("Balance     : " + customer.getBalance());
//			System.out.println("Branch      : " + customer.getBranch());
//			System.out.println("City        : " + customer.getCity());
//			System.out.println("Account Type: " + customer.getAccountType());
//		});

		// Find customers having balance greater than 50000

//		List<Bank> result = customers.stream().filter(c -> c.getBalance() > 50000).collect(Collectors.toList());
//
//		System.out.println("Customers having balance greater than 50000:");
//
//		result.forEach(System.out::println);

      // Alternative approach using for-each loop
		
        Bank highest = null;

        for (Bank customer : customers.values()) {

            if (highest == null ||
                customer.getBalance() > highest.getBalance()) {

                highest = customer;
            }
        }

       System.out.println("Highest Balance Customer: " + highest);


	}
}
