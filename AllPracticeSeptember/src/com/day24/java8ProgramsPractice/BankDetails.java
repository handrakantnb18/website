package com.day24.java8ProgramsPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Map<Integer, Bank> with 10 Bank users:
// filter, map, sorted, groupingBy, max/min, second-highest amount, accountType grouping, and city-wise grouping.

public class BankDetails {

	public static void main(String[] args) {

		Map<Integer, Bank> map = new HashMap<Integer, Bank>();

		map.put(101, new Bank(101, "rahul123", "Rahul@123", "rahul@gmail.com", 75000.0, "Pune", "Savings"));

		map.put(102, new Bank(102, "amit456", "Amit@456", "amit@gmail.com", 125000.0, "Mumbai", "Current"));

		map.put(103, new Bank(103, "priya789", "Priya@789", "priya@gmail.com", 95000.0, "Nashik", "Savings"));

		map.put(104, new Bank(104, "sneha321", "Sneha@321", "sneha@gmail.com", 150000.0, "Nagpur", "Savings"));

		map.put(105, new Bank(105, "rohit654", "Rohit@654", "rohit@gmail.com", 45000.0, "Sangli", "Current"));

		map.put(106, new Bank(106, "neha987", "Neha@987", "neha@gmail.com", 210000.0, "Kolhapur", "Savings"));

		map.put(107, new Bank(107, "vikas111", "Vikas@111", "vikas@gmail.com", 85000.0, "Satara", "Current"));

		map.put(108, new Bank(108, "pooja222", "Pooja@222", "pooja@gmail.com", 175000.0, "Aurangabad", "Savings"));

		map.put(109, new Bank(109, "sachin333", "Sachin@333", "sachin@gmail.com", 60000.0, "Solapur", "Current"));

		map.put(110, new Bank(110, "kiran444", "Kiran@444", "kiran@gmail.com", 320000.0, "Thane", "Savings"));
		
//		map.forEach((id, name) -> {
//			System.out.println(id+" "+name);
//		});
		
		// Amount greater than 100000
		List<Bank> list = map.values()
		        .stream()
		        .filter(b -> b.getAmount() > 100000)
		        .toList();

		System.out.println(list);
		
		
	}
}
