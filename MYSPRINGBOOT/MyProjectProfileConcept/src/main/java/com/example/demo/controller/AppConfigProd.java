package com.example.demo.controller;

import javax.annotation.PostConstruct;



import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class AppConfigProd {

	
	@PostConstruct
	public void test() {
		System.out.println("===========run in prod");
	}
}
