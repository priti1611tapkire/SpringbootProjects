package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class HomeController {

	@RequestMapping("/")
	public Student firstreq() {
		Student s=new Student();
		s.setId(10);
		s.setName("PritA");
		s.setAddr("Pune");
		System.out.println(s);
		return s;	
	}
	@RequestMapping("/getintdata")
	public int secreq() {
		int x=1;
		int y=5;
		System.out.println(x+y);
		return x+y;
	}
	
	@RequestMapping("/getstringdata")
	public String thrreq() {
		return "Avangers";
	}
	
	@RequestMapping("/getlistdata")
	public List<Student> forreq(){
		Student s=new Student();
		s.setId(1);
		s.setName("Deepti");
		s.setAddr("Abad");
		
		Student s1=new Student();
		s1.setId(2);
		s1.setName("Abhi");
		s1.setAddr("Pune");
		List<Student> l=new ArrayList<>();
		l.add(s);
		l.add(s1);
		System.out.println(s);
		System.out.println(s1);
		return l;
	}
	
}
