package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppTestApplication.class, args);
		System.out.println("done");
	}

}
