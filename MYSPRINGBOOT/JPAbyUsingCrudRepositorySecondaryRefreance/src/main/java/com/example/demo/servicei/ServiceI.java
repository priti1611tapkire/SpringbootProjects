package com.example.demo.servicei;

import com.example.demo.model.Employee;

public interface ServiceI {

	public void savaData(Employee e);

	public Employee logincheck(String uname, String pass);

	public Iterable<Employee> getAllData();
	public Employee editdata(int id);

	public void deleteData(Employee e);

	

}
