package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class HomeController {

	@RequestMapping("/")
	public List firstpg() {
		//List l=new ArrayList<>()
		List<Student> l=new ArrayList<Student>();
		Student s=new Student();
		s.setId(1);
		s.setName("Priti");
		s.setAddress("ABAD");
		l.add(s);
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Abhijeet");
		s2.setAddress("Pune");
		l.add(s2);
		System.out.println(s.getId()+"  "+ s.getName()+"  "+s.getAddress());
		System.out.println(s2.getId()+"  "+ s2.getName()+"  "+s2.getAddress());
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		System.out.println(s.getAddress());
		return l;
		
	}
}
