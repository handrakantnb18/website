package com.day31.javaProgramsPractice;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Iterate the elements of the array and add one by one to the set

public class HashSetOne {

	static Set<Integer> convert(int[] array) {
		Set<Integer> Set = new HashSet<>();

		for (int element : array) {
			Set.add(element);
		}

		return Set;
	}

	static void print(Set<Integer> Set) {
		Iterator<Integer> _iterator = Set.iterator();

		while (_iterator.hasNext()) {

			System.out.print(_iterator.next() + " ");
		}
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6 };

		Set<Integer> Set = convert(array);

		print(Set);

	}
}
