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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Product(Integer id, String name, String address, String category, Double price, Integer qty) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.category = category;
		this.price = price;
		this.qty = qty;
	}
	
}
