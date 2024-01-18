package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Student;

public interface ServiceI {

	void saveRecord(Student s);
	public List<Student> getData(String uname, String pass);


}
