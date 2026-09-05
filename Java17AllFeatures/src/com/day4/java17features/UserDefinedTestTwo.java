package com.day4.java17features;

import java.util.*;

// printing the values of the object by sorting on the basis of name and age.

class StudentT {
	int rollno;
	String name;
	int age;

	StudentT(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparatorT implements Comparator<StudentT> {
	public int compare(StudentT s1, StudentT s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class AgeComparatorU implements Comparator<StudentT> {
	public int compare(StudentT s1, StudentT s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparatorT implements Comparator<StudentT> {
	public int compare(StudentT s1, StudentT s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class UserDefinedTestTwo {

	public static void main(String[] args) {

		ArrayList<StudentT> al = new ArrayList<StudentT>();
		al.add(new StudentT(101, "Vijay", 23));
		al.add(new StudentT(106, "Ajay", 27));
		al.add(new StudentT(105, "Jai", 21));
		al.add(new StudentT(109, "Ram", 25));
		al.add(new StudentT(108, "Ajit", 29));
		
		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparatorT());

		for (StudentT st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparatorT());
		for (StudentT st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
