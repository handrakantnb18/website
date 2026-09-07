package com.day7.java8ProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductMap {

	public static void main(String[] args) {
		
		Map<Integer, Product> map = new HashMap<Integer, Product>();
		
		 map.put(1, new Product(1, "Laptop", "Pune", "Electronics", 65000.0, 10));
	     map.put(2, new Product(2, "Mobile", "Mumbai", "Electronics", 30000.0, 20));
	     map.put(3, new Product(3, "Keyboard", "Pune", "Accessories", 1500.0, 50));
	     map.put(4, new Product(4, "Mouse", "Nashik", "Accessories", 800.0, 40));
	     map.put(5, new Product(5, "Monitor", "Kolhapur", "Electronics", 18000.0, 15));
	     map.put(6, new Product(6, "Printer", "Sangli", "Electronics", 12000.0, 8));
	     map.put(7, new Product(7, "Table", "Satara", "Furniture", 7000.0, 12));
	     map.put(8, new Product(8, "Chair", "Pune", "Furniture", 4500.0, 25));
	     map.put(9, new Product(9, "Headphone", "Mumbai", "Accessories", 2500.0, 30));
	     map.put(10, new Product(10, "Tablet", "Nagpur", "Electronics", 22000.0, 18));

	     // return all products
//		map.forEach((id, name) -> {
//			System.out.println(id+ " "+name);
//		});
		
//	     List<Product> list =
//				map.values()
//				.stream()
//				.filter(p -> p.getPrice() > 20000)
//				.toList();
//		
//		System.out.println(list);
		
		Map<Double, List<Product>> res =
				map.values()
				.stream()
				.collect(Collectors.groupingBy(Product::getPrice));
		
		System.out.println(res);
		
		
		Product product =
		map.values()
		.stream()
		.max(Comparator.comparing(Product::getPrice))
		.orElse(null);
		
		System.out.println(product);
		
		
	}
}
