package com.day21.javaProgramsPractice;

import java.util.*;

// safely remove elements during iteration using remove()

public class InterfaceTestFive {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));

		Iterator<String> it = fruits.iterator();
		while (it.hasNext()) {
			String fruit = it.next();
			if (fruit.equals("Banana")) {
				it.remove();

			}
		}

		System.out.println(fruits); // Output: [Apple, Mango]

	}
}
