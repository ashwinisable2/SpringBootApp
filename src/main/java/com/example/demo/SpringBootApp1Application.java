package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp1Application {
	private Map<String,Object> cache = new HashMap<String,Object>()
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp1Application.class, args);
		int i=10;
	}
	//HIS-301 Changes
	public void loadDataTOCache()
	{
		//logic
	}

}
