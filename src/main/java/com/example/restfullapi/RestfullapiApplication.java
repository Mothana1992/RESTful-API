package com.example.restfullapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestfullapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestfullapiApplication.class, args);
	}

}
