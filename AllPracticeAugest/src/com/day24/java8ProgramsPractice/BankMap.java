package com.day24.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class BankMap {

	public static void main(String[] args) {
		
		Map<Integer, Bank> bank = new HashMap<Integer, Bank>();
		
		 bank.put(1, new Bank(1, "Rahul", "Pune", "rahul@gmail.com", "9876543210", 1001001001L, "Hadapsar"));

	     bank.put(2, new Bank(2, "Amit", "Mumbai", "amit@gmail.com", "9876543211", 1001001002L, "Andheri"));

	     bank.put(3, new Bank(3, "Priya", "Nashik", "priya@gmail.com", "9876543212", 1001001003L, "Nashik Road"));

	     bank.put(4, new Bank(4, "Sneha", "Pune", "sneha@gmail.com", "9876543213", 1001001004L, "Kothrud"));

	     bank.put(5, new Bank(5, "Vijay", "Sangli", "vijay@gmail.com", "9876543214", 1001001005L, "Sangli"));

	     bank.put(6, new Bank(6, "Neha", "Kolhapur", "neha@gmail.com", "9876543215", 1001001006L, "Kolhapur"));

	     bank.put(7, new Bank(7, "Rohit", "Satara", "rohit@gmail.com", "9876543216", 1001001007L, "Satara"));

	     bank.put(8, new Bank(8, "Pooja", "Aurangabad", "pooja@gmail.com", "9876543217", 1001001008L, "CIDCO"));

	     bank.put(9, new Bank(9, "Suresh", "Nagpur", "suresh@gmail.com", "9876543218", 1001001009L, "Dharampeth"));

	     bank.put(10, new Bank(10, "Kiran", "Thane", "kiran@gmail.com", "9876543219", 1001001010L, "Thane"));
	        
	     // Display all bank users
//	    bank.forEach((id, name) -> {
//	    	System.out.println(id+" : "+name);
//	    });  
	    
	     String branch = "Pune";
	     
	    bank.entrySet()
	    .stream()
	    .filter(entry -> entry.getValue().getAddress().equalsIgnoreCase(branch))
	    .forEach(entry -> System.out.println(entry.getValue()));
	    
	     
	}
}
