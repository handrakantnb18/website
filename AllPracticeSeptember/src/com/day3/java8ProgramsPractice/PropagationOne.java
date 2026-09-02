package com.day3.java8ProgramsPractice;

public class PropagationOne {

	void m() {  
        int a=50;  
        int b=a/0;  
    }  
    
    void n() {  
        m();  
    }   
    void p() {  
        try {  
            n();   
        } catch (Exception e) {  
            System.out.println("exception handled"); // Exception is caught and handled here  
        }  
    }  
    
	public static void main(String[] args) {
		
		PropagationOne obj = new PropagationOne();  
        obj.p();
        
        System.out.println("normal flow...");   
	}
}
