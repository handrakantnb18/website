package com.day23.java8ProgramsPractice;

import java.util.*;

// Comparable interface that sorts the list elements on the basis of age.

class StudentComp implements Comparable<StudentComp> {
	int rollno;
	String name;
	int age;

	StudentComp(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(StudentComp st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class ComparableTest {

	public static void main(String[] args) {

		ArrayList<StudentComp> al = new ArrayList<StudentComp>();
		al.add(new StudentComp(101, "Peter", 23));
		al.add(new StudentComp(106, "Andrew", 27));
		al.add(new StudentComp(105, "John", 21));
		Collections.sort(al);
		for (StudentComp st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
