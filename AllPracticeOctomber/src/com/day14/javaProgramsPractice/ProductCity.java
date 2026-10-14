package com.day14.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductCity {

	public static void main(String[] args) {

		List<Products> products = Arrays.asList(new Products(1, "Laptop", "laptop@gmail.com", 55000.0, "Pune"),
				new Products(2, "Mobile", "mobile@gmail.com", 25000.0, "Mumbai"),
				new Products(3, "Keyboard", "keyboard@gmail.com", 1500.0, "Pune"),
				new Products(4, "Monitor", "monitor@gmail.com", 12000.0, "Mumbai"),
				new Products(5, "Mouse", "mouse@gmail.com", 800.0, "Nashik"),
				new Products(6, "Tablet", "tablet@gmail.com", 30000.0, "Pune"),
				new Products(7, "Printer", "printer@gmail.com", 10000.0, "Nashik"),
				new Products(8, "Headphones", "headphones@gmail.com", 2500.0, "Mumbai"),
				new Products(9, "Smartwatch", "watch@gmail.com", 5000.0, "Pune"),
				new Products(10, "Camera", "camera@gmail.com", 40000.0, "Nashik"));

		Map<String, List<Products>> productsByCity = products.stream()
				.collect(Collectors.groupingBy
						(Products::getLocation));

		productsByCity.forEach((city, productList) -> {
			System.out.println("City: " + city);

			productList.forEach(System.out::println);

			System.out.println("-----------------------");
		});

	}
}
