package com.day24.java8ProgramsPractice;

import java.util.*;

class StudentTest implements Comparable<StudentTest> {
	int rollno;
	String name;
	int age;
	
	public StudentTest(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(StudentTest st)
	{
		if(age == st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
	
}

public class ComparableTest {

	public static void main(String[] args) {
		
		ArrayList<StudentTest> std = new ArrayList<StudentTest>();
		std.add(new StudentTest(101, "Amir", 20));
		std.add(new StudentTest(102, "Rahul", 30));
		std.add(new StudentTest(103, "Pooja", 40));
		std.add(new StudentTest(104, "Ram", 50));
		
		Collections.sort(std);
		
		for(StudentTest st:std) {
			System.out.println(st.rollno+" = "+st.name+" = "+st.age);
			
		}
	}
}
