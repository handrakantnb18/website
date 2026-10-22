package com.day21.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Basic for loop with get, Enhanced for-each loop

public class ListTestSeven {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("Ajit");
		al.add("Pooja");
		al.add("Rahul");
		al.add("Jeet");

		al.add(1, "Seema");

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		for (String str : al)

			System.out.print(str + " ");

	}
}
