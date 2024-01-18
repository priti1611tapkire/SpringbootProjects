package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Employee;

public interface ServiceI {

	void savedata(Employee e);

	List<Employee> getData(String uname, String pass);

}
