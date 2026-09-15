package com.day15.java8ProgramsPractice;

// how to store and display objects in an ArrayList.

import java.util.ArrayList;

class Book {
	int id;
	String name;

	Book(int i, String n) {
		id = i;
		name = n;
	}
}

public class ArrayListTestTelve {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<>();

		list.add(new Book(101, "Java"));
		list.add(new Book(102, "Python"));

		for (Book b : list) {
			System.out.println(b.id + " " + b.name);
		}

	}
}
