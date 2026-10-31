package com.day31.javaProgramsPractice;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

// Convert Array to HashSet in Java

public class HashSetTwo {

	public static <T> Set<T> convertArrayToSet(T array[]) {
		return Arrays.stream(array).collect(Collectors.toSet());
	}

	public static void main(String[] args) {

		String array[] = { "Ram", "Amit", "going to pune" };

		System.out.println("Array: " + Arrays.toString(array));

		Set<String> set = convertArrayToSet(array);

		System.out.println("Set: " + set);

	}
}
