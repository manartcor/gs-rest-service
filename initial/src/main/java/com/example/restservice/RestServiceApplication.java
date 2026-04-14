package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		int multiplication = 5 * 5;
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
