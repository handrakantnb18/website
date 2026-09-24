package com.day23.java8ProgramsPractice;

// Use volatile when a variable is accessed by multiple threads

public class VolatileThread extends Thread {

	private final VolatileData data;  
	  
    public VolatileThread(VolatileData data) {  
        this.data = data;  
    }  
  
    public void run() {  
        int oldValue = data.getCounter();  
        System.out.println("[Thread " + Thread.currentThread().getId() +  
                "]: Old value = " + oldValue);  
  
        data.increaseCounter();  
  
        int newValue = data.getCounter();  
        System.out.println("[Thread " + Thread.currentThread().getId() +  
                "]: New value = " + newValue);  
    }  
    
}
