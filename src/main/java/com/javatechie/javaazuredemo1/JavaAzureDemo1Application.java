package com.javatechie.javaazuredemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaAzureDemo1Application {
	
	@GetMapping("/message")
	public String message()
	{
		return "Congrats! You are successfully deployed the Application in Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaAzureDemo1Application.class, args);
	}

}
