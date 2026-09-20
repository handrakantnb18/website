package com.day20.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//The list must be sorted before calling binary search to get correct results

public class BinarySearchTestFour {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(23);
		list.add(13);
		list.add(15);
		list.add(22);

		int x = 10;
		int res = Collections.binarySearch(list, x);

		System.out.println("Element to be searched is : " + x);

		if (res >= 0)
			System.out.println(x + " found at index = " + res);
		else
			System.out.println(x + " Not found");

		x = 15;
		res = Collections.binarySearch(list, x);

		if (res >= 0)
			System.out.println(x + " found at index = " + res);
		else
			System.out.println(x + " Not found");

	}
}
