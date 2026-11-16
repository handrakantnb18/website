package com.day14.java;

import java.util.HashSet;

// HashSetData Test1 yourself by guessing the output of the following code

public class HashSetData {

	public static void main(String[] args) {

		HashSet shortSet = new HashSet();

		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}

		System.out.println(shortSet.size());

	}
}
