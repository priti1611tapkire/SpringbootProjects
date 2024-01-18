package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Student;

public interface ServiceI {

	void saveData(Student s);

	List<Student> getData(String un, String ps);

	List<Student> deletedata(int id);

	public Student editdata(int id);
	//List<Student> editdata(int id, Student s);

	List<Student> updatedata(int id, Student s);

//	List<Student> editData(int id); 


}
