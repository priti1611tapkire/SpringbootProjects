package com.example.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class PersonalDetails {
	private String adharno;
	private String pancardno;
	private Address address;
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getPancardno() {
		return pancardno;
	}
	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
