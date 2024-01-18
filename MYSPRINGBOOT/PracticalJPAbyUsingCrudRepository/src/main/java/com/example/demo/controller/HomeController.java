package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;
import com.example.demo.servicei.ServiceI;

@Controller
public class HomeController {
	@Autowired
	ServiceI si;

	@RequestMapping("/")
	public String prelogin() {
		return "login";
	}
	@RequestMapping("/register")
	public String preRegister()
	{
		return "register";
	}
	@RequestMapping("/reg")
	public String registerpage(@ModelAttribute("stu")Student s) {
		si.saveData(s);
		return "login";
	}
	
	
	@RequestMapping("/log")
	public String logincheck(@RequestParam("uname")String uname, @RequestParam("pass")String pass, Model m) {
		List<Student> slist=si.getData(uname, pass);
		m.addAttribute("data", slist);
		return "success";
	}
	
	@RequestMapping("/del")
	public String deletedata(@RequestParam("sid")int sid, Model m) {
	List<Student> slist=si.deleteRecord(sid);
	m.addAttribute("data", slist);
		return "success";
		
	}

	
	@RequestMapping("/edit")
	public String editRecord(@RequestParam("sid") int sid , Model m) {
		Student stu=si.editRecord(sid);
		m.addAttribute("s", stu);
		return "update";
	}
	
	@RequestMapping("/update")
	public String updateRecord(@ModelAttribute("stu") Student e, Model m) {
		System.out.println(e);
		//List<Student> slist=si.updateRecord(e);
		List<Student> slist=si.updateReco(e.getId(),e.getMobno(), e.getName(), e.getUname(), e.getPass() );
		System.out.println(slist);
		m.addAttribute("data",slist);
		return "success";
	}
	@RequestMapping("/add")
	public String addRecord()
	{
		return "register";
	}
	
//	@RequestMapping("/PDF")
//	private void exportToPDFcoda(HttpServletResponse response)throws DocumentException, IOException {
//		// TODO Auto-generated method stub
//		List<Student> slist2=si.getAllData();
//		exportToPDF(response, slist2);
//	}
}
