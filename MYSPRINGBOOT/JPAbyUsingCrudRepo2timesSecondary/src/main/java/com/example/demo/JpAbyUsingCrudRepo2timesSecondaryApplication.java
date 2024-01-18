package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class JpAbyUsingCrudRepo2timesSecondaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpAbyUsingCrudRepo2timesSecondaryApplication.class, args);
	}

}
