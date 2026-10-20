package com.day20.javaProgramsPractice;

import java.util.*;

// how to sort string elements in descending order using Collections.sort() with Collections.reverseOrder():

public class ArrayListTestTwo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");

		Collections.sort(al, Collections.reverseOrder());
		
		Iterator i = al.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
