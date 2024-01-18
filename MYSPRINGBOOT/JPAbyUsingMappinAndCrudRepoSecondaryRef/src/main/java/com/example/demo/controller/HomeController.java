package com.example.demo.controller;

import java.util.Collections;


import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;

import com.example.demo.servicei.ServiceI;

@Controller
public class HomeController {
	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String indexpg() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String registerpg() {
		return "register";
	}
	@RequestMapping("/reg")
	public String saveData(@ModelAttribute("emp")Employee e) {
		si.savaData(e);
		return "index";
	}
	@RequestMapping("/log")
	public String logincheck(@RequestParam("uname")String uname, @RequestParam("pass")String pass, Model m) {
		List<Employee> elist=si.getData(uname, pass);
		m.addAttribute("data", elist);
		return "success";
	}
	
	@RequestMapping("/del")
	public String deletedata(@RequestParam("id")int id, Model m) {
	List<Employee> elist=si.deleteRecord(id);
	m.addAttribute("data", elist);
		return "success";
		
	}

	@RequestMapping("/edit")
	public String editRecord(@RequestParam("id") int id , Model m) {
		Employee emp=si.editRecord(id);
		m.addAttribute("s", emp);
		return "update";
	}

	@RequestMapping("/update")
	public String updateRecord(@ModelAttribute("emp") Employee e, Model m) {
		System.out.println(e);
		List<Employee> elist=si.updateRecord(e);
		
		System.out.println(elist);
		m.addAttribute("data",elist);
		return "success";
	}
	@RequestMapping("/add")
	public String addRecord()
	{
		return "register";
	}
	
     @RequestMapping("/sort")
     public String sortByparam(@ModelAttribute("emp") Employee e, Model m) {
    	List<Employee> elist=si.getallData();

			Collections.sort(elist, (o1, o2) ->o2.getName().compareTo(o1.getName()));

			Collections.sort(elist, (o1, o2) ->o1.getId()-(o2.getId()));

			Collections.sort(elist, (o1, o2) ->o1.getUname().compareTo(o2.getUname()));

    	m.addAttribute("data", elist);
    	return "success";
 
     }
}
 