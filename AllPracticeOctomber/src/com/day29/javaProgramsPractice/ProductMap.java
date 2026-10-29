package com.day29.javaProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMap {

	public static void main(String[] args) {

		Map<Integer, Product> map = new HashMap<>();

		map.put(1, new Product(1, "Laptop", "laptop@gmail.com", 55000.0, "Pune", "Electronics"));

		map.put(2, new Product(2, "Mobile", "mobile@gmail.com", 25000.0, "Mumbai", "Smartphone"));

		map.put(3, new Product(3, "Keyboard", "keyboard@gmail.com", 1500.0, "Pune", "Computer Accessory"));

		map.put(4, new Product(4, "Mouse", "mouse@gmail.com", 800.0, "Nashik", "Wireless Mouse"));

		map.put(5, new Product(5, "Monitor", "monitor@gmail.com", 12000.0, "Sangli", "LED Monitor"));

		map.put(6, new Product(6, "Headphones", "headphones@gmail.com", 2000.0, "Mumbai", "Audio"));

		map.put(7, new Product(7, "Tablet", "tablet@gmail.com", 18000.0, "Pune", "Android Tablet"));

		map.put(8, new Product(8, "Printer", "printer@gmail.com", 9500.0, "Kolhapur", "Office Equipment"));

		map.put(9, new Product(9, "Smart Watch", "watch@gmail.com", 5000.0, "Nashik", "Wearable Device"));

		map.put(10, new Product(10, "Camera", "camera@gmail.com", 35000.0, "Sangli", "Digital Camera"));

		// Display all products : Use Map<Integer, Product> with HashMap to store 10 products, where the product ID

//		for (Map.Entry<Integer, Product> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}
		
		// Using the 10 Product objects above, find the product with the highest price using Java Streams.
		
//		 Product highest = map.values()
//	                .stream()
//	                .max(Comparator.comparing(Product::getPprice))
//	                .orElseThrow(() ->
//	                        new RuntimeException("No products found"));
//
//	        System.out.println("Highest Price Product:");
//	        System.out.println("Name: " + highest.getPname());
//	        System.out.println("Price: " + highest.getPprice());
//	        System.out.println("City: " + highest.getPcity());
	        
	        // Using the 10 Product objects above, find products with price greater than 10000 using Java Streams.
	        
		List<Product> result = map.values()
		        .stream()
		        .filter(p -> p.getPprice() < 50000)
		        .toList();
		System.out.println(result);
		
	}
}
