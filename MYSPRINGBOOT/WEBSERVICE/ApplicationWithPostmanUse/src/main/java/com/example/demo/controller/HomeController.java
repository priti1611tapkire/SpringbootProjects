package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.servicei.ServiceI;

@RestController
public class HomeController {

	@Autowired
	ServiceI si;

	@RequestMapping(value ="/register", method =RequestMethod.POST)
	public Student saveRecord(@RequestBody Student s)
	{
		si.saveData(s);
		return s;
	}

	@RequestMapping(value = "/log/{uname}/{pass}", method =RequestMethod.GET)
	public List<Student> loginCheck(@PathVariable("uname")String un,@PathVariable("pass")String ps ){
		List<Student> slist=si.getData(un,ps);
		return slist;

	}

	@RequestMapping(value = "/deleteop/{id}" ,method = RequestMethod.DELETE)
	public List<Student> deletedata(@PathVariable("id")int id){
		List<Student> slist=si.deletedata(id);
		return slist;
	}

	@RequestMapping(value = "/editdata/{id}" ,method = RequestMethod.PUT)
	public List<Student> updateData(@PathVariable("id")int id,@RequestBody Student s) {
		List<Student> slist=si.updatedata(id,s);
		return slist;
	}
}

