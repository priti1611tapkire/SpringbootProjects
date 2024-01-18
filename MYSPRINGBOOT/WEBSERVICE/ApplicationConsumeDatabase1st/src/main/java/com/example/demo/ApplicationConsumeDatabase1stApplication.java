package com.example.demo;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApplicationConsumeDatabase1stApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConsumeDatabase1stApplication.class, args);
	}
	
	@Bean
	public RestTemplate restT() {
		RestTemplate rt=new RestTemplate();
		return rt;
	}
	

}
