package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

import com.example.demo.servicei.ServiceI;

@Controller

public class HomeController {
	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String registerpage() {
		return "register";
	}
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute("emp") Employee e) {
		si.savedata(e);
		return "index";
	}
	@RequestMapping("/log")
	public String logincheck(@RequestParam("uname")String uname, @RequestParam("pass")String pass, Model m) {
		List<Employee> elist=si.getData(uname, pass);
		m.addAttribute("data", elist);
		return "success";
	}
}
