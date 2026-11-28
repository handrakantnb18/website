package com.day25.java;

import java.util.ArrayList;
import java.util.Collections;

// Comparable interface that sorts the list elements on the basis of age.

public class ComparableStudent {

	public static void main(String[] args) {

		ArrayList<StudentComparable> al = new ArrayList<StudentComparable>();
		al.add(new StudentComparable(101, "| Amit |", 23));
		al.add(new StudentComparable(106, "| Andrew |", 27));
		al.add(new StudentComparable(105, "| Ram |", 21));
		al.add(new StudentComparable(108, "| Chandrakaant |", 33));
		al.add(new StudentComparable(104, "| Priyaanka |", 40));
		al.add(new StudentComparable(109, "| Shivraj |", 29));

		Collections.sort(al);
		for (StudentComparable st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
