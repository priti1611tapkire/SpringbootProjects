package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Student;

public interface ServiceI {

	void saveData(Student s);
	public List<Student> getData(String uname, String pass);
	 public List<Student> deleteRecord(int id);
	Student editRecord(int sid);
//	List<Student> updateRecord(Student e);
	public List<Student> updateReco(int id, String mobno, String name, String uname, String pass);
	List<Student> getAllData();
}
