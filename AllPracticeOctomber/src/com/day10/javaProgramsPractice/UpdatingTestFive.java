package com.day10.javaProgramsPractice;

import java.util.ArrayList;

// Creates an ArrayList to store String elements Adds elements using add() method

public class UpdatingTestFive {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Grapes");

		list.set(0, "Orange");

		System.out.println("After Updating: " + list);

	}
}
