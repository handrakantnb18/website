package com.day20.javaProgramsPractice;

import java.util.*;

// how to sort objects in reverse order using the Comparable interface.

class StudentTwo implements Comparable<StudentTwo> {
	int rollno;
	String name;
	int age;

	StudentTwo(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(StudentTwo st) {
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		else
			return -1;
	}
}

public class CompareToTestTwo {

	public static void main(String[] args) {

		ArrayList<StudentTwo> al = new ArrayList<StudentTwo>();
		al.add(new StudentTwo(101, "Vijay", 23));
		al.add(new StudentTwo(106, "Ajay", 27));
		al.add(new StudentTwo(105, "Jai", 21));

		Collections.sort(al);

		for (StudentTwo st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
