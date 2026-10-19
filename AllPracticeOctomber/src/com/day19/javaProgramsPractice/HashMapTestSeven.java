package com.day19.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// the original list directly which makes it simple way to reverse collection

public class HashMapTestSeven {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>
		(Arrays.asList("Banana", "Pineapple", "Kiwi"));
		
		Collections.reverse(fruits);
		
		System.out.println(fruits);

	}
}
