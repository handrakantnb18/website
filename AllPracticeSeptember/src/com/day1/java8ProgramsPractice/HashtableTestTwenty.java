package com.day1.java8ProgramsPractice;

import java.util.*;

// how to store custom objects in a Hashtable

class BookOne {
	int id;
	String name, author, publisher;
	int quantity;

	public BookOne(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class HashtableTestTwenty {

	public static void main(String[] args) {

		Map<Integer, BookOne> map = new Hashtable<Integer, BookOne>();

		BookOne b1 = new BookOne(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookOne b2 = new BookOne(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookOne b3 = new BookOne(103, "Operating System", "Galvin", "Wiley", 6);

		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);

		for (Map.Entry<Integer, BookOne> entry : map.entrySet()) {
			int key = entry.getKey();
			BookOne b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);

		}

	}
}
