package com.day21.java;

import java.util.ArrayList;
import java.util.List;

// To update an element in a list, use the set() method with the target index and the new value

public class ListUpdatingElementThree {

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

		System.out.println("Initial ArrayList " + al);
		al.set(1, "1. Pooja");

		System.out.println("Updated ArrayList " + al);

	}
}
