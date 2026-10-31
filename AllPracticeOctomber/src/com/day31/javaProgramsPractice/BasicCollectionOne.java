package com.day31.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

// Basic Operations (Adding, Removing, and Checking Elements)

public class BasicCollectionOne {

	public static void main(String[] args) {

		Collection<String> shoppingCart = new ArrayList<>();

		shoppingCart.add("Laptop");
		shoppingCart.add("Smartphone");
		shoppingCart.add("Wireless Headphones");
		System.out.println("Initial Cart: " + shoppingCart);

		System.out.println("Items in cart: " + shoppingCart.size());
		System.out.println("Is cart empty? " + shoppingCart.isEmpty());

		boolean hasLaptop = shoppingCart.contains("Laptop");
		System.out.println("Does cart contain 'Laptop'?: " + hasLaptop);

		shoppingCart.remove("Smartphone");
		System.out.println("Cart after removing Smartphone: " + shoppingCart);

		shoppingCart.clear();
		System.out.println("Cart after clear(): " + shoppingCart);

	}
}
