package com.day21.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Collection interface does not provide index-based access to elements

public class InterfaceTestFour {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");

		System.out.println("Colors List: " + colors);

		String firstColor = colors.get(0);
		String lastColor = colors.get(colors.size() - 1);

		System.out.println("First Color: " + firstColor);
		System.out.println("Last Color: " + lastColor);

	}
}
