package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping(value = "/log/{uname}/{pass}", method =RequestMethod.GET)
	public List<Customer> loginCheck(@PathVariable("uname")String un,@PathVariable("pass")String ps ){
		List<Customer> clist=si.getData(un,ps);
		return clist;

	}
	@RequestMapping(value = "/deleteop/{id}" ,method = RequestMethod.DELETE)
	public List<Customer> deletedata(@PathVariable("id")int id){
		List<Customer> clist=si.deletedata(id);
		return clist;
	}
	
	@RequestMapping(value = "/editop/{id}" ,method = RequestMethod.GET)
	public Customer editdata(@PathVariable("id")int id){
		Customer c=si.editdata(id);
		return c;
	}
	
	@RequestMapping(value = "/updatedata/{id}" ,method = RequestMethod.PUT)
	public List<Customer> updateData(@RequestBody Customer c) {
		List<Customer> slist=si.updatedata(c);
		return slist;
	}
	
}
