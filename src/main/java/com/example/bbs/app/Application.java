package com.example.bbs.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("com.example.bbs.mapper")
@ComponentScan("com.example.bbs.dao")
@ComponentScan("com.example.bbs.controller")
@ComponentScan("com.example.bbs.service")
@ComponentScan("com.example.bbs.service.impl")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/hello")
	public String getMethodName(@RequestParam(value = "name", defaultValue = "world") String name) {
		return String.format("Hello, %s", name);
	}

}
