package com.day20.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// The copy () method copies elements from one list to another

public class ListTestOne {

	public static void main(String[] args) {

		List<String> source = new ArrayList<>
		(Arrays.asList("A", "B", "C"));
		
		List<String> dest = new ArrayList<>
		(Arrays.asList("X", "Y", "Z"));

		Collections.copy(dest, source);
		System.out.println(dest);

	}
}
