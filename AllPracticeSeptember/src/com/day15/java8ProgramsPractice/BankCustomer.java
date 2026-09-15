package com.day15.java8ProgramsPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankCustomer {

	public static void main(String[] args) {

		Map<Integer, Bank> bank = new HashMap<Integer, Bank>();

		bank.put(101, new Bank(101, "Rahul", "rahul@gmail.com", 55000.0, "Loan", "Pune"));

		bank.put(102, new Bank(102, "Amit", "amit@gmail.com", 62000.0, "Accounts", "Mumbai"));

		bank.put(103, new Bank(103, "Priya", "priya@gmail.com", 48000.0, "Finance", "Nashik"));

		bank.put(104, new Bank(104, "Sneha", "sneha@gmail.com", 75000.0, "Loan", "Pune"));

		bank.put(105, new Bank(105, "Rohit", "rohit@gmail.com", 58000.0, "Insurance", "Sangli"));

		bank.put(106, new Bank(106, "Neha", "neha@gmail.com", 68000.0, "Accounts", "Kolhapur"));

		bank.put(107, new Bank(107, "Vikas", "vikas@gmail.com", 45000.0, "Support", "Satara"));

		bank.put(108, new Bank(108, "Pooja", "pooja@gmail.com", 82000.0, "Finance", "Pune"));

		bank.put(109, new Bank(109, "Suresh", "suresh@gmail.com", 52000.0, "Loan", "Mumbai"));

		bank.put(110, new Bank(110, "Kiran", "kiran@gmail.com", 90000.0, "Manager", "Nagpur"));

//		bank.forEach((id, cust) -> {
//			System.out.println(id+ " "+cust);
//		});

		//Map<Integer, List<Bank>> sal =
		
		List<Bank> sal = 
				bank.values()
				.stream()
				.filter(e -> e.getSalary() > 75000.00)
				.toList();

		System.out.println(sal);
		
		
//		Map<Integer, List<Bank>> sal = 
//				bank.values()
//				.stream()
//				.collect(e -> e.getSalary() > 55000.00)
//				.count();
//				
//
//		System.out.println(sal);
		

	}
}
