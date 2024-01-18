package com.example.demo.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveRecord(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}
	public List<Student> getData(String uname, String pass){

		if(uname.equalsIgnoreCase("admin")&&pass.equalsIgnoreCase("admin")) {
			List<Student> slist=(List<Student>) hr.findAll();
			return slist;
		}
		else {
			List<Student> slist=hr.findAllByUnameAndPass(uname, pass);
			return slist;
		}
	}

}
