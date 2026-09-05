package com.day4.java17features;

import java.util.*;

// we sort the list of elements that also contains null.

public class StudentSortTestTwo {

	public static void main(String[] args) {

		ArrayList<StudentSTestTwo> al = new ArrayList<StudentSTestTwo>();
		al.add(new StudentSTestTwo(101, "Vijay", 23));
		al.add(new StudentSTestTwo(106, "Ajay", 27));
		al.add(new StudentSTestTwo(105, null, 21));

		Comparator<StudentSTestTwo> cm1 = Comparator.comparing(StudentSTestTwo::getName,
				Comparator.nullsFirst(String::compareTo));

		Collections.sort(al, cm1);
		System.out.println("Considers null to be less than non-null");
		for (StudentSTestTwo st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		Comparator<StudentSTestTwo> cm2 = Comparator.comparing(StudentSTestTwo::getName,
				Comparator.nullsLast(String::compareTo));
		Collections.sort(al, cm2);
		System.out.println("Considers null to be greater than non-null");
		for (StudentSTestTwo st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
