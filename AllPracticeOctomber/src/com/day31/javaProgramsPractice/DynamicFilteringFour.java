package com.day31.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

// Advanced Dynamic Filtering

public class DynamicFilteringFour {

	public static void main(String[] args) {

		Collection<Integer> col = new ArrayList<>();
		col.add(15);
		col.add(45);
		col.add(120);
		col.add(85);
		col.add(8);

		System.out.println("Original Catalog Prices: " + col);

		col.removeIf(price -> price > 50);

		System.out.println("Filtered Budget Prices (Under $50): " + col);

	}
}
