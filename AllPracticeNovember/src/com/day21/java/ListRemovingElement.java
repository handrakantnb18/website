package com.day21.java;

import java.util.*;

// To remove an element from a list, we can use the remove() method.

public class ListRemovingElement {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("1. Amit");
		al.add("2. Rahul");
		al.add("3. Amol");
		al.add("4. Ram");
		al.add("5. Priyaanka");
		al.add("6. Vijay");
		al.add("7. Seema");
		al.add("8. Reta");

		al.add(1, "Akash");

		System.out.println("Initial ArrayList " + al);

		al.remove(1);

		System.out.println("After the Index Removal " + al);

		al.remove("Amit");

		System.out.println("After the Object Removal " + al);

	}
}
