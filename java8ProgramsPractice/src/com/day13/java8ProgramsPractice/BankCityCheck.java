package com.day13.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class BankCityCheck {

	public static void main(String[] args) {
		
		List<Bank> bankCity = Arrays.asList(
				new Bank(1001, "SBI", "Rahul", "Pune", 55500.00),
			    new Bank(10011, "SBI", "Rahul", "Pune", 55500.00),
			    new Bank(1002, "HDFC", "Amit", "Mumbai", 75000.00),
			    new Bank(1003, "ICICI", "Sachin", "Nagpur", 62000.00),
			    new Bank(1004, "Axis", "Priya", "Nashik", 48500.00),
			    new Bank(1005, "PNB", "Sneha", "Kolhapur", 91000.00),
			    new Bank(1006, "Bank of Baroda", "Rohit", "Satara", 67000.00),
			    new Bank(1007, "Canara Bank", "Neha", "Solapur", 58000.00),
			    new Bank(1008, "Union Bank", "Pooja", "Aurangabad", 83000.00),
			    new Bank(1009, "Bank of Maharashtra", "Vikas", "Sangli", 47000.00),
			    new Bank(1010, "Kotak Mahindra", "Anjali", "Pune", 99500.00)			
				
				);
		
		bankCity.stream()
		.filter(bs -> bs.getBranch().equals("Pune"))
		.forEach(System.out::println);
	}
}
