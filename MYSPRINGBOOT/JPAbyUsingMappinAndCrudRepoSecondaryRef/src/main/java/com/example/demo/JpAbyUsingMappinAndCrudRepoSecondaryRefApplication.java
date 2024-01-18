package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@SpringBootConfiguration
@EntityScan
public class JpAbyUsingMappinAndCrudRepoSecondaryRefApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpAbyUsingMappinAndCrudRepoSecondaryRefApplication.class, args);
	}

}
