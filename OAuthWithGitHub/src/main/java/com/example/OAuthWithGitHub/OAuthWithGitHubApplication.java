package com.example.OAuthWithGitHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class OAuthWithGitHubApplication {

	@RequestMapping("/")
	public String welcome(){
		return  "Welcome to OAuth2 using github";
	}
	public static void main(String[] args) {
		SpringApplication.run(OAuthWithGitHubApplication.class, args);
	}

}
