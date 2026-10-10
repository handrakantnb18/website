package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Collection interface does not provide index-based access to elements

public class CollectionAccesingTestFour {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("White");
		colors.add("Yellow");
		colors.add("Black");

		System.out.println("Colors List: " + colors);

		String firstColor = colors.get(0);
		String lastColor = colors.get(colors.size() - 1);

		System.out.println("First Color: " + firstColor);
		System.out.println("Last Color: " + lastColor);

	}
}
