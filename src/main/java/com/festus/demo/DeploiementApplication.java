package com.festus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeploiementApplication {

	@GetMapping("/")
	public String sayHello() {
		return "Hello world";
	}

	@GetMapping("/{input}")
	public String getMessage(@PathVariable String input){
		return "Hello " + input;
	}

	public static void main(String[] args) {
		SpringApplication.run(DeploiementApplication.class, args);


	}

}
