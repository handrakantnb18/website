package com.day16.javaProgramsPractice;

import java.util.ArrayList;

// ArrayList can store complex objects like books.

class Book {
	int id;
	String name;

	Book(int i, String n) {
		id = i;
		name = n;
	}
}

public class ArrayListTestFourteen {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<>();

		list.add(new Book(101, "Java"));
		list.add(new Book(102, "Python"));
		list.add(new Book(103, "Node"));
		list.add(new Book(104, "React"));
		list.add(new Book(106, "Angular"));
		list.add(new Book(105, "Mysql"));

		for (Book b : list) {
			System.out.println(b.id + " " + b.name);
		}

	}
}
