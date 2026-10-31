package com.day30.javaProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Product {

	public static void main(String[] args) {

		Map<Integer, ProductFind> map = new LinkedHashMap<>();

		map.put(1, new ProductFind(1, "Laptop", "laptop@gmail.com", 55000.0, "Electronics", "Pune", "Hinjewadi"));

		map.put(2, new ProductFind(2, "Mobile", "mobile@gmail.com", 25000.0, "Electronics", "Mumbai", "Andheri"));

		map.put(3, new ProductFind(3, "Keyboard", "keyboard@gmail.com", 1500.0, "Accessories", "Pune", "Wakad"));

		map.put(4, new ProductFind(4, "Monitor", "monitor@gmail.com", 12000.0, "Electronics", "Nashik", "College Road"));

		map.put(5, new ProductFind(5, "Mouse", "mouse@gmail.com", 800.0, "Accessories", "Mumbai", "Thane"));

		map.put(6, new ProductFind(6, "Printer", "printer@gmail.com", 18000.0, "Electronics", "Pune", "Baner"));

		map.put(7, new ProductFind(7, "Table", "table@gmail.com", 7500.0, "Furniture", "Kolhapur", "Shahupuri"));

		map.put(8, new ProductFind(8, "Chair", "chair@gmail.com", 4500.0, "Furniture", "Sangli", "Miraj Road"));

		map.put(9, new ProductFind(9, "Headphone", "headphone@gmail.com", 3000.0, "Accessories", "Satara", "Powai Naka"));

		map.put(10, new ProductFind(10, "Smart TV", "tv@gmail.com", 45000.0, "Electronics", "Pune", "Kothrud"));

		// Create 10 Product objects using Map
		
		map.forEach((key, value) -> System.out.println(value));

		
	}
}
