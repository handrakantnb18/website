package com.day4.java;

// Restaurant Menu Pricing– Using multiple options in case labels

public class MenuPricing {

	private static double extracted(String menuItem) {

		double price = switch (menuItem) {
		case "Burger", "Sandwich", "Wrap" -> 5.99;
		case "Pasta", "Pizza" -> 7.99;
		case "Salad", "Soup" -> 4.99;
		default -> throw new IllegalArgumentException
		("Unknown menu item: " + menuItem);
		};
		return price;
	}

	public static void main(String[] args) {

		System.out.println("Price of Burger: $" + extracted("Burger"));
		System.out.println("Price of Pizza: $" + extracted("Pizza"));
		System.out.println("Price of Cold Drink: $" + extracted("Cold Drink"));

	}
}
