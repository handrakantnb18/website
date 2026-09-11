package com.day1.java8ProgramsPractice;

import java.util.Hashtable;
import java.util.Map;

// how to store key-value pairs in a Hashtable and iterate through them.

public class HashtableTestSixteen {

	public static void main(String[] args) {

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
