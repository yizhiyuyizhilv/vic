package com.vic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	//NEW ENV  
	public static void main(String[] args) throws Exception {
		SpringApplication application = new SpringApplication(Application.class);
		application.run(args);
	}
}
