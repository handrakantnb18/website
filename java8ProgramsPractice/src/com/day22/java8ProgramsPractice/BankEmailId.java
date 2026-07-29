package com.day22.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class BankEmailId {

	public static void main(String[] args) {
		
		 Map<Integer, Bank> map = new HashMap<>();

		 map.put(1, new Bank(101, "Rahul Sharma", "rahul@gmail.com", 9876543210L, "Pune", "Savings", 50000.00));
		 map.put(2, new Bank(102, "Amit Patil", "amit@gmail.com", 9876543211L, "Mumbai", "Current", 75000.00));
		 map.put(3, new Bank(103, "Sneha Joshi", "sneha@gmail.com", 9876543212L, "Nagpur", "Savings", 62000.00));
		 map.put(4, new Bank(104, "Priya Desai", "priya@gmail.com", 9876543213L, "Nashik", "Current", 81000.00));
		 map.put(5, new Bank(105, "Rohan Kulkarni", "rohan@gmail.com", 9876543214L, "Kolhapur", "Savings", 45000.00));
		 map.put(6, new Bank(106, "Neha More", "neha@gmail.com", 9876543215L, "Satara", "Savings", 92000.00));
		 map.put(7, new Bank(107, "Vikas Jadhav", "vikas@gmail.com", 9876543216L, "Solapur", "Current", 35000.00));
		 map.put(8, new Bank(108, "Pooja Patil", "pooja@gmail.com", 9876543217L, "Aurangabad", "Savings", 68000.00));
		 map.put(9, new Bank(109, "Sagar Shinde", "sagar@gmail.com", 9876543218L, "Sangli", "Current", 59000.00));
		 map.put(10, new Bank(110, "Kiran Bhosale", "kiran@gmail.com", 9876543219L, "Pune", "Savings", 100000.00));

		 
//		 map.entrySet()
//	       .stream()
//	       .map(Map.Entry::getValue)
//	       .forEach(System.out::println);
	        
		 map.entrySet()
	       .stream()
	       .filter(entry -> entry.getValue().getBalance() > 70000)
	       .forEach(System.out::println);
		 
		 
	}
}
