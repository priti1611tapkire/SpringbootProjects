package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin("*")
public class HomeController
{

	@Autowired
	RestTemplate restT;
	
	
	@RequestMapping("/getdata")
	public List getData()
	{
		String url="http://localhost:9090/getAllData";
		List al=restT.getForObject(url, List.class);
		return al;
	}

	
	@RequestMapping("/getdata/{un}/{ps}")
	public List getDatawithparameter(@PathVariable("un")String uname,@PathVariable("ps") String pass )
	{
		
		System.out.println("Username"+uname);
		System.out.println("pass"+pass);
		String url="http://localhost:9090/getAllData";
		List al=restT.getForObject(url, List.class);
		return al;
	}
}
