package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

// The Iterator interface allows traversal in one direction 

public class CollectionIteratorTestFive {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));

		ListIterator<String> listIt = colors.listIterator();

		System.out.print("Forward: ");
		while (listIt.hasNext()) {
			System.out.print(listIt.next() + " ");
		}

		System.out.print("\nBackward: ");
		while (listIt.hasPrevious()) {
			System.out.print(listIt.previous() + " ");
		}

	}
}
