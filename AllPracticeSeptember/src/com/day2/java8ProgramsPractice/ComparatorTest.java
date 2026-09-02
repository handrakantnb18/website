package com.day2.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// ava Comparator interface where we are sorting the elements of 
// a list using different comparators.
class Students{  
    int rollno;  
    String name;  
    int age;  
    Students(int rollno, String name, int age) {  
        this.rollno = rollno;  
        this.name = name;  
        this.age = age;  
    }  
}  

class AgeComparator implements Comparator<Students> {  
    public int compare(Students s1, Students s2) {  
        if (s1.age == s2.age)  
            return 0;  
        else if (s1.age > s2.age)  
            return 1;  
        else  
            return -1;  
    }  
}  
class NameComparator implements Comparator<Students> {  
    public int compare(Students s1, Students s2) {  
        return s1.name.compareTo(s2.name);  
    }  
}  

public class ComparatorTest {

	public static void main(String[] args) {
		
		ArrayList<Students> al = new ArrayList<Students>();  
        al.add(new Students(101, "Peter", 23));  
        al.add(new Students(106, "Andrew", 27));  
        al.add(new Students(105, "Jack", 21));  
        System.out.println("Sorting by Name"); 
        
        Collections.sort(al, new NameComparator());
        
        for(Students st: al) {
        	System.out.println(st.rollno+" : "+st.name+" : "+st.age);
        }
        	 System.out.println("Age sorting by  age : ");
        	 
        	 Collections.sort(al, new AgeComparator());
        	 
        	 for(Students st1 : al) {
        		 System.out.println(st1.rollno+" : "+st1.name+" : "+st1.age);
        	 }
        }
	}

