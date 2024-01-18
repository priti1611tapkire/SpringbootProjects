package com.example.demo.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	HomeRepository hr;


	public void savedata(Employee e) {

		hr.save(e);
	}


	@Override
	public List<Employee> getData(String uname, String pass){
		if(uname.equals("admin")&& pass.equals("admin")) {
			List<Employee> elist=(List<Employee>) hr.findAll();
			return elist;
		}
		else {
		List<Employee> elist=(List<Employee>) hr.findAllByUnameAndPass(uname, pass);
	
			return elist;
		}
	}

}
