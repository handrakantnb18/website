package com.day6.java17features;

// Comparable interface that sorts the list elements on the basis of age.

import java.util.*;

class Main implements Comparable<Main> {

	int rollno;
	String name;
	int age;

	Main(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Main st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class Student {

	public static void main(String[] args) {

		ArrayList<Main> al = new ArrayList<Main>();
		al.add(new Main(101, "Peter", 23));
		al.add(new Main(106, "Andrew", 27));
		al.add(new Main(105, "John", 21));
		
		Collections.sort(al);
		
		for (Main st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
