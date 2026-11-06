package com.day5.java;

// Retail Management System : Use a sealed interface ProductType to represent product categories

import java.util.List;

sealed interface ProductType permits Electronics, Clothing, Food {
}

final class Electronics implements ProductType {

	String name;

	Electronics(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Electronics: " + name;
	}
}

final class Clothing implements ProductType {

	String size;

	Clothing(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Clothing Size: " + size;
	}
}

final class Food implements ProductType {

	String expiryDate;

	Food(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Food Expiry Date: " + expiryDate;
	}
}

record DiscountedProduct(String name, double price) {
}

public class RetailSystem {

	public static void main(String[] args) {

		Object item = new Electronics("Smartphone");
		String payment = "UPI";
		double total = 150.0;
		int month = 12;

		List<DiscountedProduct> products = listofDiscountedProducts();
		extractedItem(item);
		extractedPayment(payment, total, month);
		extractedProduct(products);

	}

	private static void extractedProduct(List<DiscountedProduct> products) {

		for (var p : products) {
			switch (p) {
			case DiscountedProduct dp when dp.price() > 500 -> System.out.println("Expensive: " + dp.name());
			default -> System.out.println("Affordable: " + p.name());
			}
		}
	}

	private static List<DiscountedProduct> listofDiscountedProducts() {

		List<DiscountedProduct> products = List.of(new DiscountedProduct("Laptop", 1000.0),
				new DiscountedProduct("Jeans", 50.0), new DiscountedProduct("Smartphone", 600.0));
		return products;
	}

	private static void extractedPayment(String payment, double total, int month) {

		switch (payment) {
		case "CreditCard", "DebitCard" -> System.out.println("No extra discount");
		case "UPI" -> {
			boolean yearEndDiscount = (month == 12);
			String discountMsg = yearEndDiscount ? "Extra year end sale discount applied" : "No year end sale discount";
			System.out.println("UPI Payment - " + discountMsg);
			if (total > 100)
				System.out.println("20% Discount Applied");
		}
		default -> System.out.println("Invalid payment method");
		}
	}

	private static void extractedItem(Object item) {

		switch (item) {
		case Electronics e -> System.out.println(e + " - Category: Electronics");
		case Clothing c -> System.out.println(c + " - Category: Clothing");
		case Food f -> System.out.println(f + " - Category: Food");
		default -> System.out.println("Unknown category");
		}

	}
}
