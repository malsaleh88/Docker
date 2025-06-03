package com.alsaleh.alsaleh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlsalehApplication {


	@GetMapping("/message")
	public String getMessage(){
		return "Welcome to java";
	}

	@GetMapping("/")
	public String getHome(){
		return "Welcome ";
	}
	public static void main(String[] args) {
		SpringApplication.run(AlsalehApplication.class, args);
	}

}
