package com.myapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ItsMyAppsApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Hi Dear, Welcome to My Apps World !!";
	}
	public static void main(String[] args) {
		SpringApplication.run(ItsMyAppsApplication.class, args);
	}

}
