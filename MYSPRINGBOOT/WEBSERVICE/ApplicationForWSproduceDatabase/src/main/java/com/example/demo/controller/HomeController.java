package com.example.demo.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value = "/register", method =RequestMethod.POST )
	public Student regsiterReco(@RequestBody Student s) {
		si.saveRecord(s);
		return s;
	}
	@RequestMapping(value = "/log/{uname}/{pass}", method =RequestMethod.GET)
	public List<Student> loginCheck(@PathVariable("uname")String un,@PathVariable("pass")String ps ){
		List<Student> clist=si.getData(un,ps);
		return clist;

	}
	
}

