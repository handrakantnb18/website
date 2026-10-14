package com.day14.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// ArrayList, you can use Collections.sort() to sort 

public class MapIteratorTestFour {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(1);
		num.add(7);
		num.add(3);
		num.add(9);

		Collections.sort(num);
		System.out.println(num);

	}
}
