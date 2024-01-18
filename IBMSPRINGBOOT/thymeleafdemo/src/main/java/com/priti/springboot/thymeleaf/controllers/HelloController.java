package com.priti.springboot.thymeleaf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.priti.springboot.thymeleaf.model.Student;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping("sendData")
	public ModelAndView sendData() {
		ModelAndView mav=new ModelAndView("data");
		mav.addObject("message","Priti Tapkire (IAS)");
		return mav;
		
	}
	
	@RequestMapping("/student")
	public ModelAndView getData() {
		ModelAndView mav=new ModelAndView("student");
		Student student=new Student();
		student.setScore(1281);
		student.setName("PRITI TAPKIRE");
		mav.addObject("student", student);
		return mav;
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent() {
		ModelAndView mav=new ModelAndView("studentList");
		
		Student student1=new Student();
		student1.setScore(1281);
		student1.setName("PRITI TAPKIRE");
		
		Student student2=new Student();
		student2.setScore(1018);
		student2.setName("DEEPA TAPKIRE");
		
		List<Student> students= Arrays.asList(student1, student2);
		mav.addObject("student", students);
		return mav;
	}
	
	
	@RequestMapping("/studentForm")
	public ModelAndView displaystudentForm() {
		ModelAndView mav=new ModelAndView("studentform");
		Student student=new Student();
		student.setScore(1180);
		student.setName("PRITI TAPKIRE(IAS)");

		mav.addObject("student", student);
		return mav;
	}
	
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView mav=new ModelAndView("result");
		System.out.println(student.getName());
		System.out.println(student.getScore());
		return mav;
	}
	
	
}
