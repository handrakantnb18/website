package com.day20.javaProgramsPractice;

// sorting the elements of List on the basis of age and name.

import java.util.*;

class StudentFour {
	int rollno;
	String name;
	int age;

	StudentFour(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class ComparatorToTestFour {

	public static void main(String[] args) {

		ArrayList<StudentFour> al=new ArrayList<StudentFour>();    
		  al.add(new StudentFour(101,"Vijay",23));    
		  al.add(new StudentFour(106,"Ajay",27));    
		  al.add(new StudentFour(105,"Jai",21));   
		 
		  Comparator<StudentFour> cm1=Comparator.comparing(StudentFour::getName);  
		   Collections.sort(al,cm1);  
		   System.out.println("Sorting by Name");  
		   for(StudentFour st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }  
		   
		    Comparator<StudentFour> cm2=Comparator.comparing(StudentFour::getAge);  
		Collections.sort(al,cm2);  
		   System.out.println("Sorting by Age");  
		   for(StudentFour st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }    
		   
	}
}
