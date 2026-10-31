package com.day31.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;

// To compare two ArrayList objects, Java provides the equals() method

public class CompareArrayListOne {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = 
				new ArrayList<>(Arrays.asList(1, 2, 3));
		
		ArrayList<Integer> list2 = 
				new ArrayList<>(Arrays.asList(1, 2, 3));
		
		System.out.println(list1.equals(list2));

	}
}
