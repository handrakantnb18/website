package com.day7.java8ProgramsPractice;

public class Product {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private String category;
	
	private Double price;
	
	private Integer qty;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", address=" + address + ", category=" + category + ", price="
				+ price + ", qty=" + qty + "]";
	}
	
	
}
