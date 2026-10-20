package com.day19.javaProgramsPractice;

import java.util.Map;
import java.util.TreeMap;

// how to store and retrieve objects of a custom class using a TreeMap

class BookHashMap {
	int id;
	String name, author, publisher;
	int quantity;

	public BookHashMap(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedHashMapTestNine {

	public static void main(String[] args) {

		Map<Integer, BookHashMap> map = new TreeMap<Integer, BookHashMap>();

		BookHashMap b1 = new BookHashMap(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookHashMap b2 = new BookHashMap(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookHashMap b3 = new BookHashMap(103, "Operating System", "Galvin", "Wiley", 6);

		BookHashMap b4 = new BookHashMap(104, "Java Programming", "Jemes Gosling", "OAK", 25);
		BookHashMap b5 = new BookHashMap(105, "Core java & Advanced java", "America", "California", 15);
		BookHashMap b6 = new BookHashMap(106, "Spring & Spring Boot", "USA", "Velgerya", 12);

		map.put(2, b2);
		map.put(1, b1);
		map.put(3, b3);

		map.put(4, b4);
		map.put(6, b6);
		map.put(5, b5);

		for (Map.Entry<Integer, BookHashMap> entry : map.entrySet()) {

			int key = entry.getKey();
			BookHashMap b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);

		}

	}
}
