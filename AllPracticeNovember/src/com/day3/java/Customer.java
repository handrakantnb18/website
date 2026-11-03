package com.day3.java;

public class Customer {

private Integer cid;
	
    private String cname;
    
    private String cemail;
    
    private Double price;
    
    private String customerType;
    
    private String city;
    
    private String branch;
    
    private Integer quantity;

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", price=" + price
				+ ", customerType=" + customerType + ", city=" + city + ", branch=" + branch + ", quantity=" + quantity
				+ "]";
	}
    
    
    
    
}
