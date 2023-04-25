package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.example.demo"})
//@RestController
public class SpringNativeAppApplication {
//	@RequestMapping("/")
//	String home() {
//		return "Hello World!";
//	}
	public static void main(String[] args) {
		SpringApplication.run(SpringNativeAppApplication.class, args);
	}

}
