package com.day14.javaProgramsPractice;

import java.util.ArrayList;

// use the for-each loop or the Iterator interface:

public class MapIteratorTestSix {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("White");
		colors.add("Orange");
		colors.add("Black");

		for (String c : colors) {
			System.out.println(c);
		}

	}
}
