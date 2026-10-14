package com.day14.javaProgramsPractice;

// List<Products> containing 10 products and group products by city using Collectors.groupingBy().

public class Products {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private Double price;
	
	private String location;

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", email=" + email + ", price=" + price + ", location="
				+ location + "]";
	}

	public Products(Integer id, String name, String email, Double price, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.price = price;
		this.location = location;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
