package com.day15.javaProgramsPractice;

import java.util.Iterator;
import java.util.LinkedList;

// inkedList is created and traversed using an Iterator to print each element, including duplicate values.

public class CollectionTestFour {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();
		al.add("Rahul");
		al.add("Priya");
		al.add("Amit");

		al.add("Ram");
		al.add("Pooja");
		al.add("Anil");

		al.add("Lucy");
		al.add("Peter");
		al.add("Lucy");
		al.add("John");
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
