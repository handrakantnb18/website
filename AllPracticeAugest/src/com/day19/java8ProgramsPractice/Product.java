package com.day19.java8ProgramsPractice;

public class Product {

	private Integer id;
	
	private String name;
	
	private String category;
	
	private Double price;
	
	private Integer qty;
	
	private String brand;
	
	private String description;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", qty=" + qty
				+ ", brand=" + brand + ", description=" + description + "]";
	}
	
	
}
