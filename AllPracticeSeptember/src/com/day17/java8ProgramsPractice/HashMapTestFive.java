package com.day17.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

// An Iterator object is created by calling the iterator() method on a collection object

public class HashMapTestFive {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("1. Ajit");
		list.add("2. Pooja");
		list.add("3. Chandraakant");
		list.add("4. Priyankaa");
		list.add("5. Neha");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {

			String num = itr.next();

			System.out.println(num);

		}
	}
}
