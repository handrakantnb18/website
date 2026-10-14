package com.day14.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// sort in reverse order with Collections.sort(list, Collections.reverseOrder())

public class MapIteratorTestFive {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(7);
		numbers.add(3);
		numbers.add(9);

		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);

	}
}
