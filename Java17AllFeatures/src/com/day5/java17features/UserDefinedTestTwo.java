package com.day5.java17features;

import java.util.*;

// how to sort objects based on age using the Comparable interface.

class StudentTwot implements Comparable<StudentTwot> {
	int rollno;
	String name;
	int age;

	StudentTwot(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(StudentTwot st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class UserDefinedTestTwo {

	public static void main(String[] args) {

		ArrayList<StudentTwot> al = new ArrayList<StudentTwot>();
		al.add(new StudentTwot(105, "Jai", 21));
		al.add(new StudentTwot(106, "Ajay", 27));
		al.add(new StudentTwot(101, "Vijay", 23));
		
		Collections.sort(al);

		for (StudentTwot st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
