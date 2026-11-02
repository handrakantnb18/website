package com.day2.java;

import java.util.*;

public class CheckProduct {

	public static void main(String[] args) {

		Map<Integer, Product> map = new HashMap<>();

		map.put(1, new Product(101, "Laptop", "laptop@gmail.com", 55000.0, "Electronics", "Pune", "Hadapsar", 10));

		map.put(2, new Product(102, "Mobile", "mobile@gmail.com", 25000.0, "Electronics", "Mumbai", "Andheri", 20));

		map.put(3, new Product(103, "Keyboard", "keyboard@gmail.com", 1500.0, "Accessories", "Pune", "Viman Nagar", 50));

		map.put(4, new Product(104, "Mouse", "mouse@gmail.com", 800.0, "Accessories", "Sangli", "Miraj", 40));

		map.put(5, new Product(105, "Monitor", "monitor@gmail.com", 12000.0, "Electronics", "Kolhapur", "Shahupuri", 15));

		map.put(6, new Product(106, "Printer", "printer@gmail.com", 18000.0, "Electronics", "Nashik", "College Road", 12));

		map.put(7, new Product(107, "Table", "table@gmail.com", 7000.0, "Furniture", "Pune", "Kothrud", 25));

		map.put(8, new Product(108, "Chair", "chair@gmail.com", 3500.0, "Furniture", "Mumbai", "Thane", 30));

		map.put(9, new Product(109, "Headphones", "headphones@gmail.com", 2200.0, "Accessories", "Satara", "Powai Naka", 35));

		map.put(10, new Product(110, "Smart Watch", "watch@gmail.com", 5000.0, "Electronics", "Solapur", "Market Yard", 18));

		// Display all products
//		for (Map.Entry<Integer, Product> entry : map.entrySet()) {
//
//			System.out.println("Key: " + entry.getKey());
//			System.out.println("Value: " + entry.getValue());
//			System.out.println("--------------------------------");
//		}

		// Find the lowest-price product
		
//		 Product maxPriceProduct = map.values()
//	                .stream()
//	                .max(Comparator.comparing(Product::getPrice))
//	                .orElse(null);
//
//	        System.out.println("Highest Price Product:");
//	        System.out.println(maxPriceProduct);
		
	        // Group products by productType using Java 8 Streams and Collectors.groupingBy().
	        
		 map.values()
         .stream()
         .filter(p -> p.getCity().equals("Pune"))
         .forEach(System.out::println);
		 
	}
}
