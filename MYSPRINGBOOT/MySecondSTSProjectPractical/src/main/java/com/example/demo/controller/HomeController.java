package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
import com.example.demo.service.ServiceI;

@Controller
public class HomeController {
@Autowired
ServiceI si;
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	@RequestMapping("/register")
	public String registerpgs() {
		return "register";
	}
	@RequestMapping("reg")
	public String preRegister(@ModelAttribute("emp")Employee e) {
		int eid=si.saveData(e);
		if(eid>0) {
			return "index";
		}
		else {
			return "register";
		}
	}
	@RequestMapping("/log")
	public String logincheck(@RequestParam("uname")String u, @RequestParam("pass")String p, Model m) {
		List<Employee> elist=si.getAllData(u, p);
		System.out.println(elist);
		m.addAttribute("data", elist);
		return "success";
	}

	
}
