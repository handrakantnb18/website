package com.day24.java8ProgramsPractice;

import java.util.*;

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

// public class NameComparator implements Comparator {

//		public int compare(Object o1, Object o2)
//		{
//			Student s1 = (Student)o1;
//			Student s2 = (Student)o2;
//			
//			return s1.name.compareTo(s2.name);
//		}

public class NameComparator implements Comparator<StudentT> {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();  
		al.add(new StudentT(101,"Vijay",23));  
		al.add(new StudentT(106,"Ajay",27));  
		al.add(new StudentT(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		StudentT st=(StudentT)itr.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		StudentT st=(StudentT)itr2.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
	}
}
