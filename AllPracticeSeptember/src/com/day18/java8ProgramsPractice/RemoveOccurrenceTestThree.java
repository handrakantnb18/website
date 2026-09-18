package com.day18.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Using ArrayList and removeAll()
// An array can be converted into an ArrayList, which supports dynamic removal of elements.

public class RemoveOccurrenceTestThree {

	public static void main(String[] args) {

		Integer[] arr = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		Integer key = 3;

		List<Integer> list = new ArrayList<>(Arrays.asList(arr));

		list.removeAll(Arrays.asList(key));

		Integer[] result = list.toArray(new Integer[0]);

		System.out.println(Arrays.toString(result));

	}
}
