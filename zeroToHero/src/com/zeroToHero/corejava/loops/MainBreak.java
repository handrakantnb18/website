package com.zeroToHero.corejava.loops;

public class MainBreak {

	public static void main(String[] args) {
		
	    a:      
	        for(int i = 0; i<= 10; i++) {      
	            b:      
	            for(int j = 0; j<=15;j++) {      
	                c:      
	                for (int k = 0; k<=20; k++) {      
	                    System.out.println(k);      
	                    if(k==5) {      
	                    break a;      
	                    }      
	                }      
	            }      
	          
	        }      
	    System.out.println("======== Java continue statement ========");

	    for(int i = 0; i<= 2; i++) {    
	        
	        for (int j = i; j<=5; j++) {    
	    
	            if(j == 4) {    
	            continue;    
	            }    
	            System.out.println(j);    
	        }    
	    }    
	    
	}
}
