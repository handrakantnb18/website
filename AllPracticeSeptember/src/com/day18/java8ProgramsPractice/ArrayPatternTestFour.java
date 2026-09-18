package com.day18.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// The max() method of java.util.Collections class is used
// to return the maximum element of the given collection,
public class ArrayPatternTestFour {

	public static void main(String[] args) {

		int arr[] = { 20, 10, 20, 4, 100 };

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++)
			list.add(arr[i]);

		System.out.println(Collections.max(list));

	}
}
