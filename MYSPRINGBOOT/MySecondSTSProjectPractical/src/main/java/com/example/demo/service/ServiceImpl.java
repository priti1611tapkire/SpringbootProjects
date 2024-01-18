
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoI;
import com.example.demo.model.Employee;

@Service
public class ServiceImpl implements ServiceI {
@Autowired
DaoI di;

@Override
public int saveData(Employee e) {
	// TODO Auto-generated method stub
	return di.saveData(e);
}

@Override
public List<Employee> getAllData(String u, String p) {
	// TODO Auto-generated method stub
	return di.getAllData(u, p);
}
}
