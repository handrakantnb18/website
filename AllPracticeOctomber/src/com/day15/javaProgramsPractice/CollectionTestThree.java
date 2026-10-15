package com.day15.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// use ArrayList to store and access elements.

public class CollectionTestThree {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Rahul");
		list.add("Priya");
		list.add("Amit");

		list.add("Ram");
		list.add("Pooja");
		list.add("Anil");

		System.out.println(list.get(1));

	}
}
