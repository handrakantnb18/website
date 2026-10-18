package com.day18.javaProgramsPractice;

import java.util.Hashtable;

// how to create a Hashtable, add key-value pairs, and display its elements.

public class HashTableTestSix {

	public static void main(String[] args) {

		Hashtable<Integer, String> table = new Hashtable<>();

		table.put(1, "Dog");
		table.put(2, "Cat");
		table.put(3, "Rabbit");

		System.out.println("Hashtable: " + table);

	}
}
