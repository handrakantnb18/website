package com.day2.java;

public class Product {

	private Integer pid;
	
    private String pname;
    
    private String pemail;
    
    private Double price;
    
    private String productType;
    
    private String city;
    
    private String branch;
    
    private Integer quantity;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", price=" + price + ", productType="
				+ productType + ", city=" + city + ", branch=" + branch + ", quantity=" + quantity + "]";
	}
	
	
	
}
