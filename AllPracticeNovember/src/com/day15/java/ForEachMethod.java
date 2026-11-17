package com.day15.java;

import java.util.*;

// How do you use the forEach() method in Java

public class ForEachMethod {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
