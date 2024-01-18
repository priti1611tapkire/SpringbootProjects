package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface DaoI {

	int saveData(Employee e);
	public List<Employee> getAllData(String u, String p);
}
