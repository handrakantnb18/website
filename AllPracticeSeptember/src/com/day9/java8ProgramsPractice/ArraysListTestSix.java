package com.day9.java8ProgramsPractice;

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

public class ArraysListTestSix {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(101, "Ajit", 23));
		list.add(new Student(102, "Ram", 21));
		list.add(new Student(103, "Rahul", 25));

		for (Student s : list) {
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}

	}
}
