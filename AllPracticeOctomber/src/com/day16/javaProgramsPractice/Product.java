package com.day16.javaProgramsPractice;

public class Product {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private Double price;
	
	private String dept;
	
	private String city;
	
	private String branch;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", email=" + email + ", price=" + price + ", dept=" + dept
				+ ", city=" + city + ", branch=" + branch + "]";
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Product(Integer id, String name, String email, Double price, String dept, String city, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.price = price;
		this.dept = dept;
		this.city = city;
		this.branch = branch;
	}
	
	
	
}
