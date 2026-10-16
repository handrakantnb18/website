package com.day16.javaProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ProductMap {

	public static void main(String[] args) {

		Map<Integer, Product> map = new HashMap<>();

		map.put(1, new Product(1, "Laptop", "laptop@gmail.com", 55000.0, "Electronics", "Pune", "Main Branch"));

		map.put(2, new Product(2, "Mobile", "mobile@gmail.com", 25000.0, "Electronics", "Mumbai", "West Branch"));

		map.put(3, new Product(3, "Chair", "chair@gmail.com", 3500.0, "Furniture", "Nashik", "North Branch"));

		map.put(4, new Product(4, "Table", "table@gmail.com", 7500.0, "Furniture", "Nagpur", "Central Branch"));

		map.put(5, new Product(5, "Keyboard", "keyboard@gmail.com", 1500.0, "IT", "Pune", "IT Branch"));

		map.put(6, new Product(6, "Monitor", "monitor@gmail.com", 12000.0, "IT", "Bangalore", "Tech Branch"));

		map.put(7, new Product(7, "Printer", "printer@gmail.com", 18000.0, "Office", "Hyderabad", "Office Branch"));

		map.put(8, new Product(8, "Headphones", "headphones@gmail.com", 2200.0, "Electronics", "Delhi", "Main Branch"));

		map.put(9, new Product(9, "Desk", "desk@gmail.com", 9000.0, "Furniture", "Chennai", "South Branch"));

		map.put(10, new Product(10, "Mouse", "mouse@gmail.com", 800.0, "IT", "Pune", "IT Branch"));

		// map.forEach((key, value) -> System.out.println(key + " = " + value));

//		map.values().stream()
//	    .filter(p -> p.getPrice() > 10000)
//	    .forEach(System.out::println);
//		
		
		Product highestPriceProduct = map.values()
		        .stream()
		        .max(Comparator.comparing(Product::getPrice))
		        .orElse(null);

		System.out.println("Highest Price Product: " + highestPriceProduct);
		
	}
}
