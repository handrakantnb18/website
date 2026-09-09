package com.day9.java8ProgramsPractice;

import java.util.ArrayList;

class Book {
	int id;
	String name;

	Book(int i, String n) {
		id = i;
		name = n;
	}
}

public class ArraysListTestTwelve {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<>();

		list.add(new Book(101, "Java"));
		list.add(new Book(102, "Python"));
		list.add(new Book(103, "React"));
		list.add(new Book(104, "Angular"));
		list.add(new Book(105, "Spring boot"));
		list.add(new Book(106, "Hibernate"));
		list.add(new Book(107, "MySQL"));
		list.add(new Book(108, "Node"));
		list.add(new Book(109, "AI ML"));
		list.add(new Book(110, "Data Science"));

		for (Book b : list) {
			System.out.println(b.id + " " + b.name);
		}

	}
}
