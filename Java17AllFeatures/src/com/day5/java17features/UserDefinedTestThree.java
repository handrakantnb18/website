package com.day5.java17features;

import java.util.ArrayList;
import java.util.Collections;

//  how to sort objects in reverse order using the Comparable interface.

class StudentThreet implements Comparable<StudentThreet> {
	int rollno;
	String name;
	int age;

	StudentThreet(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(StudentThreet st) {
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		else
			return -1;
	}
}

public class UserDefinedTestThree {

	public static void main(String[] args) {

		ArrayList<StudentThreet> list = new ArrayList<StudentThreet>();
		list.add(new StudentThreet(101, "Vijay", 23));
		list.add(new StudentThreet(106, "Ajay", 27));
		list.add(new StudentThreet(105, "Jai", 21));

		Collections.sort(list);

		for (StudentThreet st : list) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
