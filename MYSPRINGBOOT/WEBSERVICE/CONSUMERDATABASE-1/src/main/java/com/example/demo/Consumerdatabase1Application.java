package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Consumerdatabase1Application {

	public static void main(String[] args) {
		SpringApplication.run(Consumerdatabase1Application.class, args);
	}
	@Bean
	public RestTemplate restT() {
		RestTemplate restT=new RestTemplate();
		return restT;
	}

}
