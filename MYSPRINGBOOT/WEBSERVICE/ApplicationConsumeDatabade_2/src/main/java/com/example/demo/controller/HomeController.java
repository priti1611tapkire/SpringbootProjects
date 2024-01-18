package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.servicei.ServiceI;

@RestController
public class HomeController {

	@Autowired
	ServiceI si;
	

	@RequestMapping(value = "/register", method =RequestMethod.POST )
	public Customer regsiterReco(@RequestBody Customer c) {
		si.saveRecord(c);
		return c;
		
	}
}
