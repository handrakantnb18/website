package com.day20.javaProgramsPractice;

import java.util.*;

// how to sort wrapper class objects such as Integer using the Collections.sort() method

public class ArrayListTestThree {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(101));
		al.add(230);

		Collections.sort(al);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
