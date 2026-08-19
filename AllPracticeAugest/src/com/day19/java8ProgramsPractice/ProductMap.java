package com.day19.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class ProductMap {

	public static void main(String[] args) {
		
		Map<Integer, Product> map = new HashMap<Integer, Product>();
		
		 map.put(101, new Product(
	                101, "Laptop", "Electronics", 55000.0, 10, "Dell", "Dell Inspiron Laptop"));

	        map.put(102, new Product(
	                102, "Mobile", "Electronics", 25000.0, 20, "Samsung", "Samsung Galaxy Mobile"));

	        map.put(103, new Product(
	                103, "Television", "Electronics", 45000.0, 15, "Sony", "Sony LED Smart TV"));

	        map.put(104, new Product(
	                104, "Refrigerator", "Appliances", 38000.0, 8, "LG", "LG Double Door Refrigerator"));

	        map.put(105, new Product(
	                105, "Washing Machine", "Appliances", 32000.0, 12, "Whirlpool", "Whirlpool Washing Machine"));

	        map.put(106, new Product(
	                106, "Headphones", "Accessories", 2500.0, 30, "Boat", "Boat Wireless Headphones"));

	        map.put(107, new Product(
	                107, "Keyboard", "Accessories", 1500.0, 25, "Logitech", "Logitech Wireless Keyboard"));

	        map.put(108, new Product(
	                108, "Mouse", "Accessories", 800.0, 40, "HP", "HP Wireless Mouse"));

	        map.put(109, new Product(
	                109, "Camera", "Electronics", 65000.0, 5, "Canon", "Canon Digital Camera"));

	        map.put(110, new Product(
	                110, "Printer", "Electronics", 18000.0, 7, "HP", "HP Laser Printer"));
	        
//	        map.forEach((id, name) -> {
//	        	System.out.println(id+" : "+name);
//	        });
		
	        // Filter products by price : Products whose price is greater than ₹30,000
//	        map.values()
//	        .stream()
//	        .filter(p -> p.getPrice() > 30000)
//	        .forEach(System.out::println);
	        
	        // Filter products by price : Price less than ₹20,000
	        
//	        map.values()
//	        .stream()
//	        .filter(p -> p.getPrice() < 20000)
//	        .forEach(System.out::println);
	        
	     // Filter products by price : Price between ₹10,000 and ₹50,000
	        
	        map.values()
	        .stream()
	        .filter(p -> p.getPrice() >= 10000 &&
	                     p.getPrice() <= 50000)
	        .forEach(System.out::println);
	        
	        
	}
}
