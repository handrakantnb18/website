package com.day20.javaProgramsPractice;

import java.util.*;

// contains three fields rollno, name and age and a parameterized constructor

class StudentThree {
	int rollno;
	String name;
	int age;

	StudentThree(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		StudentThree s1 = (StudentThree) o1;
		StudentThree s2 = (StudentThree) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		StudentThree s1 = (StudentThree) o1;
		StudentThree s2 = (StudentThree) o2;

		return s1.name.compareTo(s2.name);
	}
}

public class ComparatorToTestThree {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(new StudentThree(101, "Vijay", 23));
		al.add(new StudentThree(106, "Ajay", 27));
		al.add(new StudentThree(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			StudentThree st = (StudentThree) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			StudentThree st = (StudentThree) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
