package com.day9.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysListTestOne {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("1. Mango");
		list.add("2. Apple");
		list.add("3. Banana");
		list.add("4. Grapes");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
