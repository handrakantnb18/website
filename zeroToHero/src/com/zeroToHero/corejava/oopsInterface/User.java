package com.zeroToHero.corejava.oopsInterface;

public class User {

	private Integer id;
	
	private String anme;
	
	private String mobileNo;
	
	private String email;
	
	private String city;

	public User(Integer id, String anme, String mobileNo, String email, String city) {
		super();
		this.id = id;
		this.anme = anme;
		this.mobileNo = mobileNo;
		this.email = email;
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", anme=" + anme + ", mobileNo=" + mobileNo + ", email=" + email + ", city=" + city
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnme() {
		return anme;
	}

	public void setAnme(String anme) {
		this.anme = anme;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
