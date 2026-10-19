
package com.day19.javaProgramsPractice;

import java.util.Hashtable;
import java.util.Map;

// how to store custom objects in a Hashtable

class BookHashTable {
	int id;
	String name, author, publisher;
	int quantity;

	public BookHashTable(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class HashTableTestFive {

	public static void main(String[] args) {

		Map<Integer, BookHashTable> map = new Hashtable<Integer, BookHashTable>();

		BookHashTable b1 = new BookHashTable(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookHashTable b2 = new BookHashTable(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookHashTable b3 = new BookHashTable(103, "Operating System", "Galvin", "Wiley", 6);

		BookHashTable b4 = new BookHashTable(104, "Java Programming", "Jemes Gosling", "OAK", 25);
		BookHashTable b5 = new BookHashTable(105, "Core java & Advanced java", "America", "California", 15);
		BookHashTable b6 = new BookHashTable(106, "Spring & Spring Boot", "USA", "Velgerya", 12);

		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);

		map.put(4, b4);
		map.put(5, b5);
		map.put(6, b6);

		for (Map.Entry<Integer, BookHashTable> entry : map.entrySet()) {
			int key = entry.getKey();

			BookHashTable b = entry.getValue();
			System.out.println(key + " Details:");

			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

	}
}
