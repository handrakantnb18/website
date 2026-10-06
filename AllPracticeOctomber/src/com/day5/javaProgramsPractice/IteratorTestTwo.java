package com.day5.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

// we will use an Iterator to traverse and remove odd elements from an ArrayList

public class IteratorTestTwo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		System.out.println("Original List: " + list);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {

			int i = itr.next();

			System.out.print(i + " ");

			if (i % 2 != 0) {
				itr.remove();
			}
		}

		System.out.println();

		System.out.println("Modified List: " + list);

	}
}
