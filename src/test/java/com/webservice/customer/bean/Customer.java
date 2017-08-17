package com.webservice.customer.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CUSTOMER")
public class Customer {
	
	private int id;
	private String Fname;
	private String Lname;
	private String Street;
	private String city;
	
	public Customer() {
		super();
	}
   
	@XmlElement(name="ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement(name="FIRSTNAME")
	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	@XmlElement(name="LASTNAME")
	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	@XmlElement(name="STREET")
	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	@XmlElement(name="CITY")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
}

