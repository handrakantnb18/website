package com.day20.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// how to sort string elements in ascending order Collections.sort() method

public class ArrayListTestOne {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");

		Collections.sort(al);
		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
