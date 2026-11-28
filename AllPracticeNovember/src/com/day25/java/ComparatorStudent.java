package com.day25.java;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorStudent {

	public static void main(String[] args) {

		ArrayList<StudentComparator> al = new ArrayList<StudentComparator>();
		al.add(new StudentComparator(101, "Peter", 23));
		al.add(new StudentComparator(106, "Andrew", 27));
		al.add(new StudentComparator(105, "Jack", 21));
		
		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());

		for (StudentComparator st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		System.out.println("sorting by Age");

		Collections.sort(al, new AgeComparator());

		for (StudentComparator st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
