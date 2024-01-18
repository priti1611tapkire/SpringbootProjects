package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Student{
	@Id
	private int rollno;
	private String name;
	private String addr;
	private String uname;
	private String pass;
	public int getRollno() {
		return rollno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", add=" + addr + ", uname=" + uname + ", pass=" + pass
				+ "]";
	}
}