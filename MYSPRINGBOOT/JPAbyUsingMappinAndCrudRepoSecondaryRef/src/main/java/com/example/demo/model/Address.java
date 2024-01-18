package com.example.demo.model;

import javax.persistence.Embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int pincode;
	private String cityname;
	private String areaname;
	public String getCityname() {
		return cityname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", cityname=" + cityname + ", areaname=" + areaname + "]";
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
}
