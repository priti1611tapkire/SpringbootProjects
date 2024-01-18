package com.example.demo.controller;

import java.util.List;


import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Customer;


@RestController
public class HomeController {
	@Autowired
	RestTemplate restT;

	@RequestMapping(value="/postdata",method = RequestMethod.POST)
	public Customer getdata(@RequestBody Customer c) {
		String url="http://localhost:8081/register";
		Customer s=restT.postForObject(url, c, Customer.class);	
		return s;
	}

	@RequestMapping(value="/getdata/{uname}/{pass}",method = RequestMethod.GET)
	public List getAllData(@PathVariable("uname")String un,@PathVariable("pass")String ps) {
		String url="http://localhost:8081/log/"+un+"/"+ps+"";
		List l=restT.getForObject(url, List.class);
		return l;
	}
	@RequestMapping(value = "/delete/{id}" ,method = RequestMethod.DELETE)
	public String deletedata(@PathVariable("id")int id){

		String url="http://localhost:8081/deleteop/"+id;
		restT.delete(url);
		return "data deleted successfully";
	}
	@RequestMapping(value = "/editcon/{id}" ,method = RequestMethod.GET)
	public Customer editdata(@PathVariable("id")int id){
		String url="http://localhost:8081/editop/"+id;
		Customer c=restT.getForObject(url, Customer.class);
		return c;
	}
	
	@RequestMapping(value = "/updateReco" ,method = RequestMethod.PUT)
	public String updateData(@RequestBody Customer c) {
		String url="http://localhost:8081/updatedata";
		restT.put(url, c);
		return "updated Successfully";
	}
	
}



