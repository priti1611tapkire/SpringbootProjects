package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApplicationForWsConsumEApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationForWsConsumEApplication.class, args);
	}
	@Bean
	public RestTemplate restT()
	{
		RestTemplate rt=new RestTemplate();
		return rt;
	}
}
