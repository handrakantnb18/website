package com.day19.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Swaps the elements at the specified positions in the specified list

public class HashMapTestNine {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>
		(Arrays.asList("Daisy", "Ginny", "Georgia"));

		Collections.swap(names, 0, 2);

		System.out.println(names);

	}
}
