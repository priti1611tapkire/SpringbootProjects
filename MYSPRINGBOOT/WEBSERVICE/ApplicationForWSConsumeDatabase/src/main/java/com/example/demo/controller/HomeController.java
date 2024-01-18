package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

@RestController
@CrossOrigin("*")
public class HomeController
{

	@Autowired
	RestTemplate restT;
	
	
	@RequestMapping(value="/postdata",method = RequestMethod.POST)
	public Student getdata(@RequestBody Student s) {
		String url="http://localhost:9090/register";
		Student stu=restT.postForObject(url, s, Student.class);	
		return stu;
	}

	
	@RequestMapping(value="/getdata/{uname}/{pass}",method = RequestMethod.GET)
	public List getAllData(@PathVariable("uname")String un,@PathVariable("pass")String ps) {
		System.out.println("Username:"+un);
		System.out.println("Password:"+ps);
		String url="http://localhost:9090/log/"+un+"/"+ps+"";
		List l=restT.getForObject(url, List.class);
		return l;
	}
}
