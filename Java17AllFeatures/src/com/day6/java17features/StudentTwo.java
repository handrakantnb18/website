package com.day6.java17features;

import java.util.*;

// Java Comparator interface where we are sorting the 
// elements of a list using different comparators.
class MainTwo {
	int rollno;
	String name;
	int age;

	MainTwo(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<MainTwo> {
	public int compare(MainTwo s1, MainTwo s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<MainTwo> {
	public int compare(MainTwo s1, MainTwo s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class StudentTwo {

	public static void main(String[] args) {

		ArrayList<MainTwo> al = new ArrayList<MainTwo>();
		al.add(new MainTwo(101, "Peter", 23));
		al.add(new MainTwo(106, "Andrew", 27));
		al.add(new MainTwo(105, "Jack", 21));
		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());

		for (MainTwo st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("sorting by Age");

		Collections.sort(al, new AgeComparator());

		for (MainTwo st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
