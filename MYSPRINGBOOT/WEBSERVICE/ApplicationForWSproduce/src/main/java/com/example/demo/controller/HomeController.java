package com.example.demo.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Student;
import com.example.demo.servicei.ServiceI;

@RestController
public class HomeController {

	@Autowired
	ServiceI si;
//	@RequestMapping("/getAllData")
//	public List getAllData()
//	{
//		
//		Student s=new Student();
//		s.setRollno(1);
//		s.setName("Priti");
//		s.setAdd("Aurangabad");
//		
//		List al=new ArrayList();
//		al.add(s);
//		
//		return al;
//	}
	@RequestMapping(value = "/register", method =RequestMethod.POST )
	public Student regsiterReco(@RequestBody Student s) {
		//si.saveRecord(s);
		return s;
	}
	
}

