package com.day13.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

// Traverse the sorted array and insert each element into a set

public class SortArrayTestOne {

	public static ArrayList<Integer> removeDuplicates(int[] arr) {

		Set<Integer> st = new TreeSet<Integer>();
		for (int num : arr) {
			st.add(num);
		}

		ArrayList<Integer> result = new ArrayList<Integer>(st);
		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		ArrayList<Integer> uniqueArr = removeDuplicates(arr);
		for (int i = 0; i < uniqueArr.size(); i++) {
			System.out.print(uniqueArr.get(i) + " ");
		}

	}
}
