package com.day5.java;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to remove duplicates from an 
// array without using any additional data structures

public class ArrayIntersection {

	public static List<Integer> intersect(int[] arr1, int[] arr2) {
		List<Integer> intersection = new ArrayList<>();
		for (int i : arr1) {
			for (int j : arr2) {
				if (i == j && !intersection.contains(i)) {
					intersection.add(i);
					break;
				}
			}
		}
		return intersection;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7 };
		System.out.println("Intersection: " + intersect(arr1, arr2));

	}
}
