package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.servicei.ServiceI;

@RestController
public class HomeController {

	@Autowired
	ServiceI si;
	
	@RequestMapping(value ="/adddata", method =RequestMethod.POST )
	public String addData(@RequestBody Employee e) {
		si.saveData(e);
		return "data added successfully";	
	}
	
	@RequestMapping(value = "/login/{uname}/{pass}", method =RequestMethod.GET )
	public List<Employee> loginck(@PathVariable("uname")String uname, @PathVariable("pass")String pass){
		
		List<Employee> list=si.loginck(uname,pass);
		return list;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public List<Employee> deletedata(@PathVariable("id")int id){
		List<Employee> list=si.deleteData(id);
		return list;
	}
	
	@RequestMapping(value = "/editdata/{id}", method = RequestMethod.GET)
	public Employee editdata(@PathVariable("id")int id) {
		Employee e=si.editData(id);
		return e;
	}
	
	@RequestMapping(value ="/up", method =RequestMethod.PUT )
	public List<Employee> updateData(@RequestBody Employee e){
		List<Employee> list=si.updatData(e);
		return list;
	}
}
