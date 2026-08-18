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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product(Integer id, String name, String category, Double price, Integer qty, String brand,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.qty = qty;
		this.brand = brand;
		this.description = description;
	}
	
	
}
