package com.example.tp1srping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tp1SrpingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1SrpingApplication.class, args);
	}

	@GetMapping("/hello_world")
	public String hello() {
		return "Hello World";
	}
}
