package com.example.springbootsamplehelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SpringBootSampleHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleHelloworldApplication.class, args);
	}
}
