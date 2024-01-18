package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;


@RestController
@CrossOrigin("*")
public class HomeController {

	@Autowired
	RestTemplate restT;
	
	
	@RequestMapping(value = "/addreco", method = RequestMethod.POST)
	public String addData(@RequestBody Employee e) {
		String url="http://localhost:8091/adddata";
		String s=restT.postForObject(url, e, String.class);
		return s;	
	}
	
	@RequestMapping(value = "/logincheck/{uname}/{pass}", method =RequestMethod.GET )
	public List<Employee> loginck(@PathVariable("uname")String uname, @PathVariable("pass")String pass){
		String url="http://localhost:8091/login/"+uname+"/"+pass+"";
		List<Employee> list=restT.getForObject(url, List.class);
		return list;
	}

	@RequestMapping(value = "/deletedata/{id}", method = RequestMethod.DELETE)
	public String deletedata(@PathVariable("id")int id){
		String url="http://localhost:8091/delete/"+id+"";
		restT.delete(url);
		return "data deleted successfully";
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public Employee editdata(@PathVariable("id")int id) {
		String url="http://localhost:8091/editdata/"+id;
		Employee e=restT.getForObject(url, Employee.class);
		return e;
	}
	
	@RequestMapping(value ="/update", method =RequestMethod.PUT )
	public String updateData(@RequestBody Employee e){
		String url="http://localhost:8091/up";
		restT.put(url, e);
		return "data updated Successfully";
	}
}
