package com.day22.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;

// ArrayList : Dynamic and grow as needed
// It is from the Java Collections Framework, suitable when element count varies.

public class DSAArrayListTestOne {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.println(Arrays.toString(arr));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
	}
}
