package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp1Application {

private static final string REST_URL="https://www.equifax.com/getScores";

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp1Application.class, args);
		int i=10;
	}

}
