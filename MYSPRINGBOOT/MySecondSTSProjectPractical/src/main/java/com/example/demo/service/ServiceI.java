package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface ServiceI {

	int saveData(Employee e);
	public List<Employee> getAllData(String u, String p);
}
