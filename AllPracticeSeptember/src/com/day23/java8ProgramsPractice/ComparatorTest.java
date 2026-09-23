package com.day23.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// java Comparator interface where we are sorting 
// the elements of a list using different comparators

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class ComparatorTest {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "chandrakant", 23));
		al.add(new Student(106, "Vijay", 27));
		al.add(new Student(105, "Pooja", 21));
		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());

		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by Age");

		Collections.sort(al, new AgeComparator());

		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
