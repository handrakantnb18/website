package com.day20.javaProgramsPractice;

import java.util.*;

// The Collections.sort() method is used to sort elements of a List,

class StudentOne implements Comparable<StudentOne> {
	int rollno;
	String name;
	int age;

	StudentOne(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(StudentOne st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class CompareToTestOne {

	public static void main(String[] args) {

		ArrayList<StudentOne> al = new ArrayList<StudentOne>();
		al.add(new StudentOne(101, "Vijay", 23));
		al.add(new StudentOne(106, "Ajay", 27));
		al.add(new StudentOne(105, "Jai", 21));

		Collections.sort(al);

		for (StudentOne st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
