package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
public class SpringBootHerokuDeployApplication {

	@RequestMapping(value="/")
	@ResponseBody
	public String Hello(){
		return "Hello Heroku";
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHerokuDeployApplication.class, args);
	}
}
