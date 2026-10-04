package com.day3.javaProgramsPractice;

public class Student {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private Double fees;
	
	private String collegename;
	
	private String city;
	
	private String streams;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", fees=" + fees + ", collegename="
				+ collegename + ", city=" + city + ", streams=" + streams + "]";
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

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreams() {
		return streams;
	}

	public void setStreams(String streams) {
		this.streams = streams;
	}

	public Student(Integer id, String name, String email, Double fees, String collegename, String city,
			String streams) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.fees = fees;
		this.collegename = collegename;
		this.city = city;
		this.streams = streams;
	}
	
	
	
	
}
