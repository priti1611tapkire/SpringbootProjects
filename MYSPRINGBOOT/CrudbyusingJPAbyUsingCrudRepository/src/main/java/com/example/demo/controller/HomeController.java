package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
