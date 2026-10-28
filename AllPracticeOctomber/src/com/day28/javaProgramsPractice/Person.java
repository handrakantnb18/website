package com.day28.javaProgramsPractice;

public class Person {

	
	private Integer pid;

	private String pname;

	private String pemail;

	private Double psalary;

	private String pdept;

	private String pcity;

	private String pdesc;

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", psalary=" + psalary + ", pdept="
				+ pdept + ", pcity=" + pcity + ", pdesc=" + pdesc + "]";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public Double getPsalary() {
		return psalary;
	}

	public void setPsalary(Double psalary) {
		this.psalary = psalary;
	}

	public String getPdept() {
		return pdept;
	}

	public void setPdept(String pdept) {
		this.pdept = pdept;
	}

	public String getPcity() {
		return pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public Person(Integer pid, String pname, String pemail, Double psalary, String pdept, String pcity, String pdesc) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
		this.psalary = psalary;
		this.pdept = pdept;
		this.pcity = pcity;
		this.pdesc = pdesc;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
