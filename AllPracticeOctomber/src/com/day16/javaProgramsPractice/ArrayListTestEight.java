package com.day16.javaProgramsPractice;

// how to store and access user-defined class objects in an ArrayList.

import java.util.ArrayList;

class Student {
	int rollno;
	String name;
	int age;

	Student(int r, String n, int a) {
		rollno = r;
		name = n;
		age = a;
	}
}

public class ArrayListTestEight {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(101, "Ram", 23));
		list.add(new Student(102, "Anil", 21));
		list.add(new Student(103, "Himmat", 25));
		list.add(new Student(104, "Pooja", 29));

		for (Student s : list) {
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}

	}
}
