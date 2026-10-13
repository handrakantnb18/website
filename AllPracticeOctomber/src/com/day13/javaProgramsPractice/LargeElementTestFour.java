package com.day13.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Using Collections.max() : java.util.Collections class is used to return the maximum elemen

public class LargeElementTestFour {

	public static void main(String[] args) {

		int arr[] = { 201, 110, 420, 84, 101, 25, 91 };

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++)
			list.add(arr[i]);

		System.out.println(Collections.max(list));

	}
}
