package com.day14.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

// Loop through an ArrayList using an Iterator

public class MapIteratorTestSeven {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();
		colors.add("White");
		colors.add("Orange");
		colors.add("Black");
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");

		Iterator<String> it = colors.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
