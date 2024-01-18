package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value(value="${abc.msg}")
	private String message;
	
	@RequestMapping("/")
	public String loginpg() {
		return message;
	}
}
