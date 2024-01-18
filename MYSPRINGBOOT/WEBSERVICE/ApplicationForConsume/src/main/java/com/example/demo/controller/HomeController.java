package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restT;
	
	@RequestMapping("/getdata")
	public List getData() {
		String url="http://localhost:8081/getdata";
	List l=restT.getForObject(url, List.class);
	return l;
	}
	
	@RequestMapping(value = "/postdata", method = RequestMethod.POST)
	public String postdata(@RequestBody Student s) {
		String url="http://localhost:8081/postalldata";
		String st=restT.postForObject(url, s, String.class);
		
		return st;
		
	}
}
