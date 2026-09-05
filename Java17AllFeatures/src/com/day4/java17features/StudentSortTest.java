package com.day4.java17features;

import java.util.*;

// sorting the elements of List on the basis of age and name.

public class StudentSortTest {

	public static void main(String[] args) {

		ArrayList<StudentSTest> al = new ArrayList<StudentSTest>();
		al.add(new StudentSTest(101, "Vijay", 23));
		al.add(new StudentSTest(106, "Ajay", 27));
		al.add(new StudentSTest(105, "Jai", 21));

		Comparator<StudentSTest> cm1 = Comparator.comparing(StudentSTest::getName);
		Collections.sort(al, cm1);
		System.out.println("Sorting by Name");
		for (StudentSTest st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		Comparator<StudentSTest> cm2 = Comparator.comparing(StudentSTest::getAge);
		Collections.sort(al, cm2);
		System.out.println("Sorting by Age");
		for (StudentSTest st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
