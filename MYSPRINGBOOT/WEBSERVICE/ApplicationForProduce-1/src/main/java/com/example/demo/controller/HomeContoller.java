package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class HomeContoller {
	@RequestMapping("/getdata")
	public List getAllData() {

		List<Student> l=new ArrayList<>();

		Student s=new Student();
		s.setId(1);
		s.setName("Priti");
		s.setAddr("Abad");

		Student s1=new Student();
		s1.setId(2);
		s1.setName("Shradha");
		s1.setAddr("Pune");
		l.add(s);
		l.add(s1);

		return l;
	}
	@RequestMapping(value = "/postalldata", method =RequestMethod.POST )
	public String postdata(@RequestBody Student s) {
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAddr());
		return "data get successfully";
	}


}
