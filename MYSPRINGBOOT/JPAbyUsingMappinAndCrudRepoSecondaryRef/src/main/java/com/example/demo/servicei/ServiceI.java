package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Employee;


public interface ServiceI {

	public void savaData(Employee e) ;
	public List<Employee> getallData();
	public List<Employee> getData(String uname, String pass);
	public List<Employee> deleteRecord(int id);
	Employee editRecord(int id);
	List<Employee> updateRecord(Employee e);



}
